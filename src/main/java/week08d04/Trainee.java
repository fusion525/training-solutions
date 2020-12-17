package week08d04;

public class Trainee {
    private CanMark canMark;

    public Trainee(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark() {
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        CanMark goodMood = new GoodMood();
        Trainee traineeGood = new Trainee(goodMood);
        CanMark badMood = new BadMood();
        Trainee traineeBad = new Trainee(badMood);

        System.out.println(traineeGood.giveMark());
        System.out.println(traineeBad.giveMark());
    }

}
