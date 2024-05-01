import java.util.Scanner;

public class pattern2{
    public static void main(String[] args){

        System.out.println("Enter the numbe of rows: ");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();

        for (int i=a; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" i" + i + " j" + j);
            }
        System.out.println("\n");
        obj.close();
        }
    }
}