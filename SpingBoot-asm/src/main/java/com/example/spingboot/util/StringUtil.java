package com.example.spingboot.util;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class StringUtil {
    private  static  final Pattern NONLATIN = Pattern.compile("[^\\W-]");
    private  static  final Pattern WHITESPACE = Pattern.compile("[\\s]");

    public  static String toSlug(String input) {
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("_");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }
}


