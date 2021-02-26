package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {

        JSONParser parser = new JSONParser();

        List<String> storm = new ArrayList<>();

        try {
            JSONArray a = (JSONArray) parser.parse(reader);

            for (Object o : a) {

                JSONObject storms = (JSONObject) o;

                int level = (int) storms.get("level");

                if (level > 3) {
                    String city = (String) storms.get("allomas");
                    storm.add(city);
                }

            }

        }
        catch (ParseException e) {}

        Collections.sort(storm, Collator.getInstance(new Locale("hu", "HU")));

        return storm;

    }


}
