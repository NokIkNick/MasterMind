import java.sql.Array;
import java.util.Random;

public class Game {
    TextUI textUI;
    Boolean gameOn;

    String[] colors;
    Grader grader;

    public void gameStart(int input) {
        System.out.println("You chose " + input);
        colors = randomize(input);
        for (String element: colors) {
            System.out.println(element);
        }
    }

    String[] randomize(int input) {
        String[] colourCode = new String[input];
        Random random = new Random();

        for(int i = 0; i < colourCode.length; i++){
            int randomColorAsInt = random.nextInt(5);
            switch (randomColorAsInt){
                case 0 -> {
                    colourCode[i] = "RED";
                    break;
                }
                case 1 -> {
                    colourCode[i] = "BLUE";
                    break;
                }
                case 2 -> {
                    colourCode[i] = "GREEN";
                    break;
                }
                case 3 -> {
                    colourCode[i] = "YELLOW";
                    break;
                }
                case 4 -> {
                    colourCode[i] = "BLACK";
                    break;
                }
            }
        }
        return colourCode;
    }
}
