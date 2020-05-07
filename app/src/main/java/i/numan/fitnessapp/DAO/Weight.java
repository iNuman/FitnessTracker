package i.numan.fitnessapp.DAO;


import java.text.DecimalFormat;

import i.numan.fitnessapp.utils.UnitConverter;

public class Weight {
    private float pWeight;
    private int pUnit;

    public Weight(float weight, int unit) {
        pWeight = weight;
        pUnit = unit;
    }

    public float getStoredWeight() {
        return pWeight;
    }

    public float getWeight(int unit) {
        float weight = pWeight;
        if (unit == UnitConverter.UNIT_LBS) {
            weight = UnitConverter.KgtoLbs(pWeight);
        }
        return weight;
    }

    public int getStoredUnit() {
        return pUnit;
    }

    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.##");
        return numberFormat.format(pWeight);
    }

    public String getWeightStr(int unit) {
        DecimalFormat numberFormat = new DecimalFormat("#.##");
        return numberFormat.format(getWeight(unit));
    }
}
