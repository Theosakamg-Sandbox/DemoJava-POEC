package com.epsi.mickael.tp2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private FileWriter writer = null;
    private SimpleDateFormat dateFormater = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

    public Logger() {
        try {
            File file = new File("./app.log");
            if (!file.exists()) {
                file.createNewFile();
            }
            this.writer = new FileWriter(file, true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void info(Vehicle vehicle, ParkingDirection direction) {
        String date = dateFormater.format(new Date());
        String entry = String.format("%s | %s | [%s] %s\n",
                date,
                direction.toString(),
                vehicle.getClass().getSimpleName(),
                vehicle.getLicence());
        try {
            this.writer.write(entry);
            this.writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (writer != null) {
                this.writer.flush();
                this.writer.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
