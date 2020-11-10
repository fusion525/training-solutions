package week03;

import java.util.ArrayList;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public static void main(String[] args) {
        ArrayList<Position> arrayList = new ArrayList<>();
        arrayList.add(new Position("CEO", 150_000) );
        arrayList.add(new Position("Manager", 100_000) );
        arrayList.add(new Position("Programmer", 1_500_000) );

        for (Position positions : arrayList) {
            if (positions.getBonus() > 150_000) System.out.println(positions);
        }
    }

}


