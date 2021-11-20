package com.infinitelambda;

import static com.infinitelambda.constants.Constants.AVAILABLE_COUNTRIES_FOR_SHIPPING;

import com.infinitelambda.bikestore.Fork;

public class Main {
    public static void main(String[] args) {

        Fork fork = new Fork();
        fork.setProductName("Marzocchi Bomber Z1");
        fork.setBrand("Marzocchi");
        fork.setItemDescription(
              " The Z1 is freedom from the status quo." + "\n"
            + " Step outside enduro's obsession with counting seconds" + "\n"
            + " and go have some fun in the woods. Plus, it's biased towards stiffness," + "\n"
            + " ride performance and durability, so while it's carrying a " + "\n"
            + " few extra grams, you probably won't notice because you're" + "\n"
            + " having too much fun." + "\n"
        );

        fork.setPrice(729.00);
        fork.shipToCountry("Zimbabwe");
        fork.service();
        fork.warrantyRepairProcess();
        fork.transfer();
        fork.setPromotion();
        System.out.println("Item Description : " + "\n" + fork.getItemDescription());



        Fork fork1 = new Fork();
        fork1.setProductName("FOX 34 Step-Cast");
        fork1.setBrand("FOX");
        fork1.setHasDiskBreaks(true);

        System.out.println(fork1.isAbleToShipToCountry("Zimbabwe"));

    }
}
