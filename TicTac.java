package day8;

import java.util.Scanner;
public class TicTac {
    private static boolean first = false;
    
    private static char[][] board = new char[4][4];


    public static void main(String[] args){
        Entry();

    }

    public static void Entry(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you wan to play 1st?");
        String play = sc.nextLine();

        if(play.substring(0,1).equalsIgnoreCase("y")){
            first = true;
        }
        initializeBoard();
        ShowBoard();
        startGame(sc);
    }


    public static void startGame(Scanner sc){
       
        if(first == true){
            userTurn(sc);
        }else{
            compTurn(sc);
        }
    }

   
    public static void userTurn(Scanner sc){
        System.out.println("my move");

        int r = sc.nextInt();
        int c = sc.nextInt();

        if(board[r][c] == ' ')
        {
            board[r][c] = 'X';
        
           
            if(board[1][1]=='X'&& board[2][2]== 'X'&& board[3][3]=='X'||
            		board[1][1]=='X'&& board[1][2]== 'X'&& board[1][3]=='X'||
            		board[2][1]=='X'&& board[2][2]== 'X'&& board[2][3]=='X'||
            		board[3][1]=='X'&& board[3][2]== 'X'&& board[3][3]=='X'||
            		board[3][1]=='X'&& board[2][2]== 'X'&& board[1][3]=='X'){
               
            	ShowBoard();
            	System.out.println("X win This time");
               
                
            } else if(board[1][1] == 'X'){
                ShowBoard();
                compTurn(sc);
             
            } else if(board[1][2] == 'X'){
                ShowBoard();
                compTurn(sc);
            } else if(board[1][3] == 'X'){
                ShowBoard();
                compTurn(sc);
            } else if(board[2][1] == 'X'){
                ShowBoard();
                compTurn(sc);
          
            } else if(board[2][2] == 'X'){
                ShowBoard();
                compTurn(sc);
            } else if(board[2][3] == 'X'){
                ShowBoard();
                compTurn(sc);
           
            } else if(board[3][1] == 'X'){
                ShowBoard();
                compTurn(sc);
         
            } else if(board[3][2] == 'X'){
                ShowBoard();
                compTurn(sc);
             
            }
        } else if (board[r][c] == 'X' || board[r][c] == 'O'){
            first = true;
            System.out.println("Please choose an empty space");
            startGame(sc);
        }

        System.out.println("Drow Game");
    }

    public static void compTurn(Scanner sc){

        System.out.println("computer move");
        System.out.println("");
        if(board[1][1]=='O'&& board[2][2]== 'O'&& board[3][3]=='O'||
        		board[1][1]=='O'&& board[1][2]== 'O'&& board[1][3]=='O'||
        		board[2][1]=='O'&& board[2][2]== 'O'&& board[2][3]=='O'||
        		board[3][1]=='O'&& board[3][2]== 'O'&& board[3][3]=='O'||
        		board[3][1]=='O'&& board[2][2]== 'O'&& board[1][3]=='O'){
           
        	ShowBoard();
        	System.out.println("COMP is win This time");
           
        }
        if(board[1][1] == ' '){
            board[1][1] = 'O';
            ShowBoard();
            userTurn(sc);
         
        } else if(board[1][2] == ' '){
            board[1][2] = 'O';
            ShowBoard();
            userTurn(sc);
           
        } else if(board[1][3] == ' '){
            board[1][3] = 'O';
            ShowBoard();
            userTurn(sc);
        
        } else if(board[2][1] == ' '){
            board[2][2] = 'O';
            ShowBoard();
            userTurn(sc);
        
        } else if(board[2][3] == ' '){
            board[2][3] = 'O';
            ShowBoard();
            userTurn(sc);
       
        } else if(board[3][1] == ' '){
            board[3][1] = 'O';
            ShowBoard();
            userTurn(sc);
         
        } else if(board[3][2] == ' '){
            board[3][2] = 'O';
            ShowBoard();
            userTurn(sc);
          
        } else if(board[3][3] == ' '){
            board[3][3] = 'O';
            ShowBoard();
            userTurn(sc);
            
        }
      
    }
  
    public static void initializeBoard(){
        for(int r = 1; r  <=3; r++){
            for(int c = 1; c <= 3; c++){
                board[r][c] = ' ';
            }
        }
    }
    public static void ShowBoard(){
   
        System.out.println("   1   2   3");
        System.out.println("----------------");
        System.out.println("1"+ "| " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] +" | " );
        System.out.println("----------------");
        System.out.println("2"+ "| " + board[2][1] + " | " + board[2][2] + " | " + board[2][3]+ " | ") ;
        System.out.println("----------------");
        System.out.println("3"+ "| " + board[3][1] + " | " + board[3][2] + " | " + board[3][3]+ " | " );
        System.out.println("----------------");
        
    }
}