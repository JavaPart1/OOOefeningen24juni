package be.vdab.OOOef24juni;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle tristan = new Triangle("yellow",true,12,12,12);
        System.out.println(tristan.toString());

        System.out.println("Kleur vd driehoek?");
        String colr = input.nextLine();
        System.out.println("Is driehoek gevuld?");
        boolean triaFil = false; // input.nextBoolean
        System.out.println("Zijde 1 ?");
        int z1 = input.nextInt();
        System.out.println("Zijde 2 ?");
        int z2 = input.nextInt();
        System.out.println("Zijde 3 ?");
        int z3 = input.nextInt();

        Triangle jotan = new Triangle(colr,triaFil,z1,z2,z3);

        System.out.println(jotan.toString());


    }

}
