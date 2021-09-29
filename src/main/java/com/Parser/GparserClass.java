package com.Parser;

import com.Parser.model.Root;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GparserClass {
    //Gson
    public Root parse() {
        Gson gson = new Gson();
        try (FileReader readerGc = new FileReader("jsonTestFile.json")) {

            Root root = gson.fromJson(readerGc, Root.class);

            return root;
        } catch (IOException e) {

            System.out.println("Parsing error " + e);
        }
        return null;
    }
}