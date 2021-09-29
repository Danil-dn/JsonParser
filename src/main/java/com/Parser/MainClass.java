package com.Parser;

import com.Parser.model.Root;

public class MainClass {
    public static void main(String[] args) {
        SparserClass parser1 = new SparserClass();
        Root simple = parser1.parse();

        GparserClass parser2 = new GparserClass();
        Root gson = parser2.parse();

        System.out.println(gson.toString());
        System.out.println(simple.toString());
    }
}
//Gson uses our models for parsing