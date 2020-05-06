package com.nli;

import java.util.LinkedHashMap;
import java.util.Map;

public class Consts {

    static final Map<String, String> LS_CHAR_MAP;
    static {
    	LS_CHAR_MAP = new LinkedHashMap<>(); // Diamond operator requires Java 1.7+
    	LS_CHAR_MAP.put(" ", "20"); LS_CHAR_MAP.put("0", "30"); LS_CHAR_MAP.put("İ", "40");  
    	LS_CHAR_MAP.put("!", "21"); LS_CHAR_MAP.put("1", "31"); LS_CHAR_MAP.put("A", "41");  
    	LS_CHAR_MAP.put("\"", "22"); LS_CHAR_MAP.put("2", "32"); LS_CHAR_MAP.put("B", "42");  
    	LS_CHAR_MAP.put("#", "23"); LS_CHAR_MAP.put("3", "33"); LS_CHAR_MAP.put("C", "43");  
    	LS_CHAR_MAP.put("¤", "24"); LS_CHAR_MAP.put("4", "34"); LS_CHAR_MAP.put("D", "44");  
    	LS_CHAR_MAP.put("%", "25"); LS_CHAR_MAP.put("5", "35"); LS_CHAR_MAP.put("E", "45");  
    	LS_CHAR_MAP.put("&", "26"); LS_CHAR_MAP.put("6", "36"); LS_CHAR_MAP.put("F", "46");  
    	LS_CHAR_MAP.put("'", "27"); LS_CHAR_MAP.put("7", "37"); LS_CHAR_MAP.put("G", "47");  
    	LS_CHAR_MAP.put("(", "28"); LS_CHAR_MAP.put("8", "38"); LS_CHAR_MAP.put("H", "48");  
    	LS_CHAR_MAP.put(")", "29"); LS_CHAR_MAP.put("9", "39"); LS_CHAR_MAP.put("I", "49");  
    	LS_CHAR_MAP.put("*", "2A"); LS_CHAR_MAP.put(":", "3A"); LS_CHAR_MAP.put("J", "4A");  
    	LS_CHAR_MAP.put("+", "2B"); LS_CHAR_MAP.put(";", "3B"); LS_CHAR_MAP.put("K", "4B");  
    	LS_CHAR_MAP.put(",", "2C"); LS_CHAR_MAP.put("<", "3C"); LS_CHAR_MAP.put("L", "4C");  
    	LS_CHAR_MAP.put("-", "2D"); LS_CHAR_MAP.put("=", "3D"); LS_CHAR_MAP.put("M", "4D");  
    	LS_CHAR_MAP.put(".", "2E"); LS_CHAR_MAP.put(">", "3E"); LS_CHAR_MAP.put("N", "4E");  
    	LS_CHAR_MAP.put("/", "2F"); LS_CHAR_MAP.put("?", "3F"); LS_CHAR_MAP.put("O", "4F");

    	LS_CHAR_MAP.put("P", "50"); LS_CHAR_MAP.put("ç", "60"); LS_CHAR_MAP.put("p", "70");
    	LS_CHAR_MAP.put("Q", "51"); LS_CHAR_MAP.put("a", "61"); LS_CHAR_MAP.put("q", "71");
    	LS_CHAR_MAP.put("R", "52"); LS_CHAR_MAP.put("b", "62"); LS_CHAR_MAP.put("r", "72");
    	LS_CHAR_MAP.put("S", "53"); LS_CHAR_MAP.put("c", "63"); LS_CHAR_MAP.put("s", "73");
    	LS_CHAR_MAP.put("T", "54"); LS_CHAR_MAP.put("d", "64"); LS_CHAR_MAP.put("t", "74");
    	LS_CHAR_MAP.put("U", "55"); LS_CHAR_MAP.put("e", "65"); LS_CHAR_MAP.put("u", "75");
    	LS_CHAR_MAP.put("V", "56"); LS_CHAR_MAP.put("f", "66"); LS_CHAR_MAP.put("v", "76");
    	LS_CHAR_MAP.put("W", "57"); LS_CHAR_MAP.put("g", "67"); LS_CHAR_MAP.put("w", "77");
    	LS_CHAR_MAP.put("X", "58"); LS_CHAR_MAP.put("h", "68"); LS_CHAR_MAP.put("x", "78");
    	LS_CHAR_MAP.put("Y", "59"); LS_CHAR_MAP.put("i", "69"); LS_CHAR_MAP.put("y", "79");
    	LS_CHAR_MAP.put("Z", "5A"); LS_CHAR_MAP.put("j", "6A"); LS_CHAR_MAP.put("z", "7A");
    	LS_CHAR_MAP.put("Ä", "5B"); LS_CHAR_MAP.put("k", "6B"); LS_CHAR_MAP.put("ä", "7B");
    	LS_CHAR_MAP.put("Ö", "5C"); LS_CHAR_MAP.put("l", "6C"); LS_CHAR_MAP.put("ö", "7C");
    	LS_CHAR_MAP.put("Ñ", "5D"); LS_CHAR_MAP.put("m", "6D"); LS_CHAR_MAP.put("ñ", "7D");
    	LS_CHAR_MAP.put("Ü", "5E"); LS_CHAR_MAP.put("n", "6E"); LS_CHAR_MAP.put("ü", "7E");
    	LS_CHAR_MAP.put("§", "5F"); LS_CHAR_MAP.put("o", "6F"); LS_CHAR_MAP.put("à", "7F");

    	LS_CHAR_MAP.put("Δ", "10"); LS_CHAR_MAP.put("@", "00");
    	LS_CHAR_MAP.put("_", "11"); LS_CHAR_MAP.put("£", "01");
    	LS_CHAR_MAP.put("Φ", "12"); LS_CHAR_MAP.put("$", "02");
    	LS_CHAR_MAP.put("Γ", "13"); LS_CHAR_MAP.put("¥", "03");
    	LS_CHAR_MAP.put("Λ", "14"); LS_CHAR_MAP.put("€", "04");
    	LS_CHAR_MAP.put("Ω", "15"); LS_CHAR_MAP.put("é", "05");
    	LS_CHAR_MAP.put("Π", "16"); LS_CHAR_MAP.put("ù", "06");
    	LS_CHAR_MAP.put("Ψ", "17"); LS_CHAR_MAP.put("ı", "07");
    	LS_CHAR_MAP.put("Σ", "18"); LS_CHAR_MAP.put("ò", "08");
    	LS_CHAR_MAP.put("Θ", "19"); LS_CHAR_MAP.put("Ç", "09");
    	LS_CHAR_MAP.put("Ξ", "1A"); LS_CHAR_MAP.put("Ğ", "0B");
    	LS_CHAR_MAP.put("Ş", "1C"); LS_CHAR_MAP.put("ğ", "0C");
    	LS_CHAR_MAP.put("ş", "1D"); LS_CHAR_MAP.put("Å", "0E");
    	LS_CHAR_MAP.put("ß", "1E"); LS_CHAR_MAP.put("å", "0F");
    	LS_CHAR_MAP.put("É", "1F");
    }
    
    static final Map<String, String> SS_CHAR_MAP;
    static {
    	SS_CHAR_MAP = new LinkedHashMap<>();
    	SS_CHAR_MAP.put("İ", "1B49"); SS_CHAR_MAP.put("ç", "1B63");
    	SS_CHAR_MAP.put("ı", "1B69"); SS_CHAR_MAP.put("Ğ", "1B47");
    	SS_CHAR_MAP.put("Ş", "1B53"); SS_CHAR_MAP.put("ğ", "1B67");
    	SS_CHAR_MAP.put("ş", "1B73");
    }
}
