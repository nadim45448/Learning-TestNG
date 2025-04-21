package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    public static int generateRandomNumber(int min, int max){
        double randomNumber= Math.random()*(max-min)+min;
        return (int)randomNumber;
    }

    public static void main(String[] args) {
        int id= generateRandomNumber(1000,9999);
        System.out.println(id);
    }

    public static void saveUserData(JSONObject obj, String filePath) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
       JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
       jsonArray.add(obj);
        FileWriter writer = new FileWriter(filePath);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();


    }


}
