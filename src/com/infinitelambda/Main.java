package com.infinitelambda;

import com.infinitelambda.bikestore.products.Fork;
import com.infinitelambda.bikestore.staff.Mechanic;

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

        Mechanic mechanic = new Mechanic("Joey");

        System.out.println("Item Description : " + "\n" + fork.getItemDescription());

        fork.serviceRepairs( fork,1, 140.00, mechanic);




        fork.warrantyRepairProcess();
        fork.transfer();
//        fork.setDiscount();



        Fork fork1 = new Fork();
        fork1.setProductName("FOX 34 Step-Cast");
        fork1.setBrand("FOX");
        fork1.setHasDiskBreaks(true);

        fork1.isAbleToShipToCountry("Zimbabwe");

    }
}
