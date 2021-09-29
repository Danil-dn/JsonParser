package com.Parser;

import com.Parser.model.People;
import com.Parser.model.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SparserClass {
    //Json-simple
    public Root parse() {

        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("jsonTestFile.json")) {

            JSONObject rootJO = (JSONObject) parser.parse(reader);

            String name = (String) rootJO.get("name");

            JSONArray peopleJA = (JSONArray) rootJO.get("people");

            List<People> peopleList = new ArrayList<>();
            for (Object it : peopleJA) {
                JSONObject peopleJO = (JSONObject) it;

                String namePeople = (String) peopleJO.get("name");
                long agePeople = (long) peopleJO.get("age");

                People people = new People(namePeople, (int) agePeople);
                peopleList.add(people);
            }
            root.setName(name);
            root.setPeople(peopleList);

            return root;
        } catch (IOException | ParseException e) {

            System.out.println("Parsing error " + e);

        }
        return null;
    }
}
