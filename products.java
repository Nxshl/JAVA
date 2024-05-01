import java.util.Scanner;

class products{
    
    int pcode;
    String pname;
    int price;

    int accept(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the pcode\n");
        pcode = obj.nextInt();
        System.out.println("Enter the name\n");
        pname = obj.nextLine();
        System.out.println("Enter the price\n");
        price = obj.nextInt();

        return price;
    }

    void display(){

        System.out.println("code :" + pcode);
        System.out.println("name :" + pname);
        System.out.println("price :" + price);

    }
}

class products1{
    public static void main(String[] args) {
        products p1 = new products();
        products p2 = new products();
        products p3 = new products();

        System.out.println("product 1\n");
        int price1 = p1.accept();
        System.out.println("product 2\n");
        int price2 = p2.accept();
        System.out.println("product 3\n");
        int price3 = p3.accept();


        if ((price1 < price2) && (price1 < price3)){
            p1.display();;
        }

        if ((price2 < price1) && (price2 < price3)){
            p2.display();;
        }

        if ((price3 < price1) && (price3 < price2)){
            p3.display();;
        }
        
    }
}