package week08d01;

public class Robot {

    public String move(String commands) {
        char[] commandsChar = commands.toCharArray();

        int f = 0;
        int l = 0;
        int b = 0;
        int j = 0;

        for (int i = 0; i<commandsChar.length; i++) {
            if (commandsChar[i] == 'F') {
                f++;
            }
            if (commandsChar[i] == 'L') {
                l++;
            }
            if (commandsChar[i] == 'B') {
                b++;
            }
            if (commandsChar[i] == 'J') {
                j++;
            }
        }

        int x = b - j;
        int y = f - l;

        String coordinate = "[" + x + " , " + y + "]";

        return coordinate;
    }
}
