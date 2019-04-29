package com.radchenko.questionnaire;

import java.util.List;
import java.util.Random;

public class Radnomizer {

    public static String randomFromList(List<String> list) {
        int randomIndex = new Random().nextInt(list.size());
        return list.get(randomIndex);
    }
}
