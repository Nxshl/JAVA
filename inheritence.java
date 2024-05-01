class vehicle{
    int cmaxSpeed = 200;
    public void display()
    {
        System.out.println("vehicle speed");
    }
}

class car extends vehicle{
    int maxSpeed = 120;
    public void display()
    {
        System.out.println("car speed");
        super.display();      
    }
}

public class inheritence{
    public static void main(String[] args) {
        car c = new car();
        c.display();
        
    }
    
}