package com.epsi.mickael.demo4;

public class Demo04 {

    public static void main(String[] args) {
        Demo04 demo = new Demo04();
//        demo.run(4);
//
//        try {
//            demo.runThrow(4);
//        } catch (Exception e) {
//            System.out.println("ok");
//        }

        demo.mickException();

    }

    private void mickException() {
        // code
        try {
            // code
            // if ???? declenche une exception
            throw new MickaelException("test", "internal test");
        } catch (MickaelException e) {
            System.out.println(e.getMessage());
        }
    }

    private void run(int i) {
        int tab[] = null; //{1,2,3,4};
        try {
            tab[i] = 10;
            //
            //
            //
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            tab[i-1] = 10;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("all cases...");
        }
    }

    private void runThrow(int i) {
        int tab[] = {1,2,3,4};
        tab[i] = 10;
    }

}
