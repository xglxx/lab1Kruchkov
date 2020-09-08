package mirea2419.lab1.kruchkov;

import java.lang.*;
public class testdog {
    public static void main(String[] args) {
        dog d1 = new dog("Boby", 2);
        dog d2 = new dog("dOGGY", 1);
        dog d3 = new dog("Simons");
        d3.setAge(1);
        System.out.println();
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}