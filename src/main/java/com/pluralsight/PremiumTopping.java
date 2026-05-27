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

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    @Override
    public double getPrice(PizzaSize size) {
        if (size.equals(PERSONAL)) {
            return personalPrice + (personalExtraPrice * extra);
        } else if (size.equals(MEDIUM)) {
            return mediumPrice + (mediumExtraPrice * extra);
        } else if (size.equals(LARGE)) {
            return largePrice + (largeExtraPrice * extra);
        }
        return 0.0;

    }
    @Override
    public String toString() {
        if (extra > 0) {
            return getName() + "(extra)";
        }
        return getName();
    }
}
