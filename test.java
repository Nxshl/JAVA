public class test{

    String name;
    int roll;
    String college = "Mar Athenasius";
    
    public test(String sname , int sroll) {
        sname = name;
        sroll = roll;
    }

    public static void main(String[] args) {
        
        test obj1 = new test("nishal",45);
        test obj2 = new test("zahariya",60);

        System.out.println(obj1.name+" "+ obj1.roll);
        System.out.println(obj2.name+" "+ obj2.roll);



    }

}