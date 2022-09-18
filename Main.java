import java.util.*;

/*

    Tic Tac Toe 2-player game
    Future plans: implement Board class, and game class to handle board state and moves. Tidy code up a bit and
        maybe make better logic decisions.  It works but could probably be implemented more efficiently.
                Change == to .equals() when comparing string values in the array

 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int turns = 1;
        String[][] board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = " ";
            }
        }
        System.out.println("You are 'X'. Choose a place");
        System.out.println("1|2|3");
        System.out.println("4|5|6");
        System.out.println("7|8|9");
        boolean game = true;

        for (int i = 1; i <= 9; i++){
            System.out.println("Player X: ");
            int choice = input.nextInt();
            playOne(choice, board);
            if(isWinner(board) || isTie(board)){
                break;
            }

            System.out.println("Player O: ");
            choice = input.nextInt();
            playTwo(choice,board);
            if(isWinner(board) || isTie(board)){
                break;
            }
        }


        //Prints the board state. Maybe have it show after every turn
        //maybe change " " when creating the board to numerical string values to illustrate choices
        for(int i = 0; i < board.length; i++) {
            if (i != 0) {
                System.out.println("----------");
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j == board[i].length - 1) {
                    System.out.println(board[i][j]);
                } else {
                    System.out.print(board[i][j] + " | ");
                }
            }


        }

    }
    static boolean isWinner(String[][] board){
        //Results for player 1
        //checks if rows match
        if(board[0][0].equals("X") && board[0][1] == "X" && board[0][2] == "X"){
            return true;
        }else if(board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X"){
            return true;
        }else if(board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X"){
            return true;
        }
        //checks if columns match
        else if(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X"){
            return true;
        }else if(board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X"){
            return true;
        }else if(board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X"){
            return true;
        }
        //Checks diagonally
        else if(board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X"){
            return true;
        }else if(board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X"){
            return true;
        }
        //Results for player 2
        if(board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O"){
            return true;
        }else if(board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O"){
            return true;
        }else if(board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O"){
            return true;
        }
        //checks if columns match
        else if(board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O"){
            return true;
        }else if(board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O"){
            return true;
        }else if(board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O"){
            return true;
        }
        //Checks diagonally
        else if(board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O"){
            return true;
        }else if(board[2][0] == "O" && board[1][1] == "O" && board[0][2] == "O"){
            return true;
        }
        //Create a condition to check if board is filled for tie
        return false;
    }
static void playOne(int choice, String[][] board) {
        Scanner input = new Scanner(System.in);
    if (choice >= 1 && choice <= 3) {
        if (choice == 1) {
            if (board[0][0].equals(" ")) {
                board[0][0] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }
        }
        if (choice == 2) {
            if (board[0][1].equals(" ")) {
                board[0][1] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }

        }
        if (choice == 3) {
            if (board[0][2].equals(" ")) {
                board[0][2] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }
        }
    }

    else if (choice >= 4 && choice <= 6) {
        if (choice == 4) {
            if (board[1][0].equals(" ")) {
                board[1][0] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }
        }
        if (choice == 5) {
            if (board[1][1].equals(" ")) {
                board[1][1] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }

        }
        if (choice == 6) {
            if (board[1][2].equals(" ")) {
                board[1][2] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }
        }
    }

    else if (choice >= 7 && choice <= 9) {
        if (choice == 7) {
            if (board[2][0].equals(" ")) {
                board[2][0] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }
        }
        if (choice == 8) {
            if (board[2][1].equals(" ")) {
                board[2][1] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }

        }
        if (choice == 9) {
            if (board[2][2].equals(" ")) {
                board[2][2] = "X";
            } else {
                System.out.println("Already filled");
                System.out.println("Make new selection: ");
                int selection = input.nextInt();
                playOne(selection,board);
            }
        }
    } else {
        System.out.println("Invalid selection!\nMake new selection: ");
        int selection = input.nextInt();
        playOne(selection,board);


    }
}
    static void playTwo(int choice, String[][] board) {
        Scanner input = new Scanner(System.in);
        if (choice >= 1 && choice <= 3) {
            if (choice == 1) {
                if (board[0][0].equals(" ")) {
                    board[0][0] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }
            }
            if (choice == 2) {
                if (board[0][1].equals(" ")) {
                    board[0][1] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }

            }
            if (choice == 3) {
                if (board[0][2].equals(" ")) {
                    board[0][2] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }
            }
        }

        else if (choice >= 4 && choice <= 6) {
            if (choice == 4) {
                if (board[1][0].equals(" ")) {
                    board[1][0] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }
            }
            if (choice == 5) {
                if (board[1][1].equals(" ")) {
                    board[1][1] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }

            }
            if (choice == 6) {
                if (board[1][2].equals(" ")) {
                    board[1][2] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }
            }
        }

        else if (choice >= 7 && choice <= 9) {
            if (choice == 7) {
                if (board[2][0].equals(" ")) {
                    board[2][0] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }
            }
            if (choice == 8) {
                if (board[2][1].equals(" ")) {
                    board[2][1] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }

            }
            if (choice == 9) {
                if (board[2][2].equals(" ")) {
                    board[2][2] = "O";
                } else {
                    System.out.println("Already filled");
                    System.out.println("Enter new selection: ");
                    int selection = input.nextInt();
                    playTwo(selection, board);
                }
            }
        } else {
            System.out.println("Invalid selection!");
            System.out.println("Enter new selection: ");
            int selection = input.nextInt();
            playTwo(selection, board);
        }
    }

    static boolean isTie(String[][] board){
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(" ")) {
                    count++;
                }
            }


        }
        if(count > 0) {
            return false;
        }
        System.out.println("Stalemate");
        return true;
    }
}
