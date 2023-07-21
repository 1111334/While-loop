

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int totPounds = 10000;
        while (totPounds > 0) {

            double todayrate = 1 + (Math.random() * 0.2);

            if (todayrate > 1.15) {
                totPounds = totPounds - 1000;
                System.out.println("Il tasso è buono " + todayrate + " quindi adesso vendo " + "rimasti " + totPounds);

            } else {
                System.out.println("Il tasso non è buono " + todayrate + " quindi non vendo");
            }

        }

    }
}







