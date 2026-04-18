import java.util.*;
class RPS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1(Rock),2(Paper),3(Scissors): ");
        int user = sc.nextInt();
        int computer = (int)(Math.random()*3)+1;
        System.out.print("You chose: ");
        switch(user){
            case 1: System.out.println("Rock"); break;
            case 2: System.out.println("Paper"); break;
            case 3: System.out.println("Scissors"); break;
            default: System.out.println("Invalid choice");
        }
        System.out.print("Computer chose: ");
        switch(computer) {
            case 1: System.out.println("Rock"); break;
            case 2: System.out.println("Paper"); break;
            case 3: System.out.println("Scissors"); break;
        }
        if(user == computer) {
            System.out.println("Draw!");
        }
        else if((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }
    }
}