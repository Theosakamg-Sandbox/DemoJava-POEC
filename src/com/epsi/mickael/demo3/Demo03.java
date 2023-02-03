package com.epsi.mickael.demo3;

public class Demo03 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        if (cat instanceof Quadriped) {
            System.out.println("Le Chat est Quadriped !");
        }

        Fish fish = new Fish();
        if (fish instanceof Quadriped) {
            System.out.println("Strange !!!");
        } else {
            System.out.println("ok");
        }

        Eagle e2 = new Eagle();
        Eagle ea = new Eagle();
        if (ea instanceof Noped && ea instanceof Biped) {
            System.out.println("ok");
        }

        Noped nop = ea;
        nop.crawl();

        Biped bi = ea;
        bi.walk();

        Eagle e3 = (Eagle) bi;
        Cat c2 = (Cat) bi;

        bi.getClass();

    }

}
