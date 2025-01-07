import java.util.Scanner;


 class guesser {
     int guessNum;

     int guessingNumber() {
         System.out.println("guesser! kindly guess the number");
         Scanner sc = new Scanner(System.in);
         guessNum = sc.nextInt();
         return guessNum;
     }
 }
     class player {
         int guessNum;

        int guessingNumber() {
             System.out.println("player! kindly guess the number");
             Scanner sc = new Scanner(System.in);
             guessNum=sc.nextInt();
             return guessNum;
         }
     }
     class umpire{
     int numFromguesser;
     int numFromplayer1;
     int numFromplayer2;
     int numFromplayer3;

     void collectNumFromGuesser(){
         guesser g=new guesser();
         numFromguesser=g.guessingNumber();


     }
     void  collectNumberFromPlayers()
     {
         player p1=new player();
         player p2=new player();
         player p3=new player();
         numFromplayer1=p1.guessingNumber();
         numFromplayer2=p1.guessingNumber();
         numFromplayer3=p3.guessingNumber();
     }
     void compare(){
         if(numFromguesser==numFromplayer1){
             if(numFromguesser==numFromplayer2 && numFromguesser==numFromplayer3){
                 System.out.println("all won the match");
             }
             else if(numFromguesser==numFromplayer2){
                 System.out.println("player 1 and player2 won the game");
             } else if (numFromguesser==numFromplayer3) {
                 System.out.println("player1 and player 3 won");
             }
             else{
                 System.out.println("only player1 won");
             }
         }
         else if(numFromguesser==numFromplayer2){
            if(numFromguesser==numFromplayer3 ){
                System.out.println("player2 and player3 won");
            }
            else {
                System.out.println("player2 won");
            }

         }
         else if(numFromguesser==numFromplayer3){
             System.out.println("player3 won the game");
         }
         else{
             System.out.println("no one won the game");
         }
     }

     }
         class guessnum {
             public static void main(String[] args) {
                 umpire u=new umpire();
                 u.collectNumFromGuesser();
                 u.collectNumberFromPlayers();
                 u.compare();


             }
         }


