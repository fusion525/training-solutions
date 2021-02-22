/*
    Sok időm elment a hibakereséssel nem tudtam rájönni sajnos
    Megyek vissza gyakorolni ...
*/


package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owls = new HashMap<>();

    public void readFromFile(BufferedReader reader) {

        //String path = "C:\\Users\\matraisz\\Documents\\Training\\training-solutions\\src\\main\\resources\\owls.txt";

        try (reader) {

            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("=", 2);

                if (parts.length >= 2) {
                    String county = parts[0];
                    String owl = parts[1];
                    owls.put(county, Integer.parseInt(owl));
                }

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

    public int getNumberOfOwls(String findCounty) {

        int numberOfOwls = 0;

        for (Map.Entry entry : owls.entrySet()) {

            if (entry.getKey().equals(findCounty)) {
                numberOfOwls = owls.get(entry);
            }
        }
        return numberOfOwls;
    }

}
