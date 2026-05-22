package com.pluralsight;

import static com.pluralsight.PizzaSize.*;

public class PremiumTopping extends Topping{
    private double personalPrice, mediumPrice, largePrice, personalExtraPrice,
        mediumExtraPrice, largeExtraPrice;
    private int extra;

    public PremiumTopping(String name, double personalPrice,
                          double mediumPrice, double largePrice,
                          double personalExtraPrice, double mediumExtraPrice,
                          double largeExtraPrice, int extra){
        super(name);

        this.personalPrice = personalPrice;
        this.mediumPrice = mediumPrice;
        this.largePrice = largePrice;

        this.personalExtraPrice = personalExtraPrice;
        this.mediumExtraPrice = mediumExtraPrice;
        this.largeExtraPrice = largeExtraPrice;

        this.extra = extra;

    }
    @Override
    public double getPrice(PizzaSize size) {
        if (size.equals(personal)) {
            return personalPrice + (personalExtraPrice * extra);
        } else if (size.equals(medium)) {
            return mediumPrice + (mediumPrice * extra);
        } else if (size.equals(large)) {
            return largePrice + (largePrice * extra);
        }
        return 0.0;

    }
}
