package com.example.act.a448856;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static ArrayList<CountryModel> models = new ArrayList<>();

    static {
        addCountry(new CountryModel("The Netherlands", 117,192,60,59,255,255,255,23,61,134));
        addCountry(new CountryModel("Armenia", 55,199,41,36,18,51,154,237,111,50));
        addCountry(new CountryModel("Austria",12,217,63,64,255,255,255,217,63,64));
        addCountry(new CountryModel("Bulgaria",5,255,255,255,66,148,113,196,58,37));
        addCountry(new CountryModel("Russia",22,255,255,255,33,48,178,223,57,47));
        addCountry(new CountryModel("Estonia",42,91,143,211,0,0,0,255,255,255));
        addCountry(new CountryModel("Sierre Leone",12,37,159,101,255,255,255,45,87,185));
        addCountry(new CountryModel("Gabon",1,73,163,105,247,219,78,65,123,190));
    }

    private static void addCountry(CountryModel model) {
        models.add(model);
    }
}
