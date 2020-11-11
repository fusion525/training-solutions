package controlselection;

public class Greetings {

    public String sayGreeting(int hour, int minute){
        String greeting="";

        if (hour < 5) {
            greeting = "Jó éjszakát";
        }else if(hour < 9){
            greeting = "Jó reggelt";
        }else if (hour <= 17 || (hour <= 18 && minute <= 30)){
            greeting = "Jó délutánt";
        }else if (hour<20){
            greeting = "Jó estét";
        }else {
            greeting = "Jó éjszakát";
        }
        return greeting;
    }

}
