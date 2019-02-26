import java.util.Scanner;

public class SignUp {
    public static void start(int stillTickets,int number){
        ask(stillTickets,number);
    }
    public static void inputInformation(int stillTickets,int number){
        stillTickets--;
        number++;
        System.out.println("You have a number: "+number+", Still Tickets: "+ stillTickets+".");
        Scanner in = new Scanner(System.in);
        System.out.println("pls enter your first name:");
        String FName = in.nextLine();
        System.out.println("pls enter your second name:");
        String SName = in.nextLine();
        outputProfile(number,FName,SName);
        ask(stillTickets,number);
    }

    private static void outputProfile(int number, String FName, String SName) {
        System.out.println("Ticket with number "+number+" has been registered for "+ FName+" "+SName+".");
    }

    public static void ask(int stillTickets,int number){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to sing-up? Y/N:");
        String question = in.nextLine();
        if(question.equals("N") || question.equals("n") || question.equals("Н") || question.equals("н")) System.out.println("good bye!");
        else if(question.equals("Y") || question.equals("y") || question.equals("Д") || question.equals("д")) inputInformation(stillTickets,number);
        else {
            System.out.println("An invalid parameter was passed. pls try again.");
            ask(stillTickets,number);
        }
    }

}
