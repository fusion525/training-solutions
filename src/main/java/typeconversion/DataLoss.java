package typeconversion;

public class DataLoss {
    public long dataloss(long a) {

        float d = (float) a;

        a = (long) d;

        return a;
    }

    public static void main(String[] args) {
        DataLoss dataLoss = new DataLoss();

        System.out.println(dataLoss.dataloss(4535));

    }
}
