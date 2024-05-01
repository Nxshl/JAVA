class outer{
    int num1 = 10;

    class inner{
        int num2 = 20;
        void display()
        {
            System.out.println(num1);
            System.out.println(num2);
        }
    }

}

class nested{
    public static void main(String[] args){

        outer o = new outer();
        outer.inner i = o.new inner();

        i.display();

    }
}