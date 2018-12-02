/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hal
 */
public class MorseCoder {
    
    private Map<String, String> dictionary = new HashMap<String, String>();
    
    public MorseCoder()
    {
        dictionary.put("A", "._");
        dictionary.put("B", "_...");
        dictionary.put("C", "_._.");
        dictionary.put("D", "_..");
        dictionary.put("E", ".");
        dictionary.put("F", ".._.");
        dictionary.put("G", "__.");
        dictionary.put("H", "....");
        dictionary.put("I", "..");
        dictionary.put("J", ".___");
        dictionary.put("K", "_._");
        dictionary.put("L", "._..");
        dictionary.put("M", "__");
        dictionary.put("N", "_.");
        dictionary.put("O", "___");
        dictionary.put("P", ".__.");
        dictionary.put("Q", "__._");
        dictionary.put("R", "._.");
        dictionary.put("S", "...");
        dictionary.put("T", "_");
        dictionary.put("U", ".._");
        dictionary.put("V", "..._");
        dictionary.put("W", ".__");
        dictionary.put("X", "_.._");
        dictionary.put("Y", "_.__");
        dictionary.put("Z", "__..");
        dictionary.put("0", "_____");
        dictionary.put("1", ".____");
        dictionary.put("2", "..___");
        dictionary.put("3", "...__");
        dictionary.put("4", "...._");
        dictionary.put("5", ".....");
        dictionary.put("6", "_....");
        dictionary.put("7", "__...");
        dictionary.put("8", "___..");
        dictionary.put("9", "____.");
    }
    
    public String getCode(String letter)
    {
        return dictionary.get(letter.toUpperCase());
    }
    
    public String getChar(String code)
    {
        for (String currentChar  : dictionary.keySet()) {
            if (dictionary.get(currentChar).equals(code)) {
                return currentChar;
            }
        }
        
        return null;
        
    }
    
}