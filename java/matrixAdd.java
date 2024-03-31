import java.util.Scanner;

public class matrixAdd{

    public static void main(String[] args){

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int res[][] = new int[2][2];

        System.out.println("Enter the values");
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the values for matrix 1: ");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                a[i][j] = obj.nextInt();
    
            }
        }

        System.out.println("Enter the values for matrix 2: ");

        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                b[i][j] = obj.nextInt();
    
            }
        }

        System.out.println("\nSum of the 2 matrix is : \n");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");
            }
        System.out.println();
        }

        obj.close();
    
    }
}