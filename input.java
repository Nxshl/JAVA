import java.util.Scanner;

public class input{

    public static void main(String[] args){
        

        Scanner obj = new Scanner(System.in);
        //Think of obj as a tool to listen to what the user types on the keyboard (System.in)

        System.out.println("Plese enter your name: ");
        String name = obj.nextLine();// always set the data type (like int , string) before naming an object (in this case name). This then gets initialized into the scanner object

        System.out.println("Plese enter your age: ");
        int age = obj.nextInt();//here we used int because we are aboutr to 

        System.out.println("Hello mr " + name +", welcome to the first major boom of the java basic where you understand the basics of the user input. Considering the age to be " + age +" its totally fine that you are able to grasp these procedure slow. make sure not to waste time or energy anymore\n");

        obj.close();
    }
}