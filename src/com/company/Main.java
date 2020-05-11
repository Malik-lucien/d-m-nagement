package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code herepublic class demenagement
        {
            int cartonTotal = 34;
            int capaciterCamionMax = 9;
            int nombreDeVoyage = 0;

            while (cartonTotal > 0) { //tant que le nbrs de carton totalest > 0 je fait carton total - cap camion et voyage + 1
                cartonTotal -= capaciterCamionMax;
                nombreDeVoyage += 1;
                System.out.println("nombre de voyage: " + nombreDeVoyage);
            }
            ;
        }
        ;
    }

    ;
}
