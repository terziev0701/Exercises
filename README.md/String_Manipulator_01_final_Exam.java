import java.util.Scanner;

public class String_Manipulator_01_final_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            switch (command) {
                case "Translate":
                    char translatedSymbol = commands[1].charAt(0);
                    char translatingSymbol = commands[2].charAt(0);

                    for (int i = 0; i < sb.length(); i++) {
                        char currentSymbol = sb.charAt(i);
                        if (currentSymbol == translatedSymbol) {
                            sb.setCharAt(i, translatingSymbol);
                        }
                    }

                    System.out.println(sb.toString());
                    break;
                case "Includes":
                    String substring = commands[1];
                    if (sb.toString().contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }

                    break;
                case "Start":
                    String anotherSubstring = commands[1];
                    String comparingSubstring = sb.substring(0, anotherSubstring.length());

                    if (anotherSubstring.equals(comparingSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    String loweredText = sb.toString().toLowerCase();
                    sb.replace(0, loweredText.length(), loweredText);
                    System.out.println(sb.toString());
                    break;
                case "FindIndex":
                    String charToFind = commands[1];
                    System.out.println(sb.lastIndexOf(charToFind));
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(commands[1]);
                    int count = Integer.parseInt(commands[2]);
                    for (int i = startIndex; i < sb.length(); i++) {
                        if (count == 0) {
                            break;
                        }
                        sb.deleteCharAt(i);
                        i--;
                        count--;
                    }
                    System.out.println(sb.toString());
                    break;
            }


            input = scanner.nextLine();
        }
    }
}