class A{
    int marks = 10;

    void display(){
        System.out.println("Total marks of class A = " + marks);
}
}

class B extends A{
    int marks1 = 20;

    void display1(){
        System.out.println("The marks of B = " + marks1);
        super.display();

    }
}



public class inh {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
    }
}