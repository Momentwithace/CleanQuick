package com.momentwithace.cleanquick.utils;

import java.security.SecureRandom;

public class CleanQuickUtils {

    public static String generateToken(){
        SecureRandom secureRandom = new SecureRandom();
        int number = secureRandom.nextInt(10000, 99999);
        return String.valueOf(number);
    }
}
