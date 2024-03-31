import java.util.Scanner;

public class matrixAdd{

    public static void main(String[] args){

        int a[][] = new int[2][2];                          //matrix 1 (2x2)
        int b[][] = new int[2][2];                          //matrix 2 (2x2)
        int res[][] = new int[2][2];                        // to store the result (after sum)

        System.out.println("Enter the values");
        Scanner obj = new Scanner(System.in);               //creating the object of Scanner i guess!

        System.out.println("Enter the values for matrix 1: ");
        for (int i=0; i<2; i++){                              // nested loop to add the values in a 2x2 matrix format
            for (int j=0; j<2; j++){
                a[i][j] = obj.nextInt();
    
            }
        }

        System.out.println("Enter the values for matrix 2: ");

        for (int i=0; i<2; i++){                               // the same nested loop for matrix 2
            for (int j=0; j<2; j++){
                b[i][j] = obj.nextInt();
    
            }
        }

        System.out.println("\nSum of the 2 matrix is : \n");
        for (int i=0; i<2; i++){                                //adds values of matrix 1 and 2 by using the same nested loop , store it in the res[][] variable
            for (int j=0; j<2; j++){
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");              //use print instead of println to break the line after each row
            }
        System.out.println();
        }

        obj.close();                                            //close the object to prevent memory leakage (optional , but a good practice)
    
    }
}
