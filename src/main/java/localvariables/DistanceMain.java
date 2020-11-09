package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(12.3, true);

        distance.getDistanceInKm();

        int a = (int) distance.getDistanceInKm();
        System.out.println(a);
    }

}
