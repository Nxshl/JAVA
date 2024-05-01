import java.util.Scanner;

public class subjects{
    String name;
    int mark;

    void display(){
        System.out.println("This is a non-static method\n");
        System.out.println("The name subject name = " + name);
        System.out.println("The mark of the subject = " + mark);
    }

    public static void show(){
        System.out.println("This is a static method\n");
    }


    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        subjects s = new subjects();


        System.out.println("Enter the name of the subject = \n");
        s.name = Scanner.nextline();
        System.out.println("Enter the mark of the subject");
        s.mark = Scanner.nextInt();



        s.display();
        s.show();
    }
}