//Create a class CPU with attribute price. 
//Create an inner class Processor (no. of cores, manufacturer) 
//and a static nested class RAM (memory, manufacturer). 
//Create an object of CPU ad print information of Processor and RAM


class cpu{
    int price;

    cpu(int price){
        this.price = price; //why we add this.?

    }

    class Processor{
    int cores;
    String manufacturer;

    Processor(int cores, String manufacturer){
        int cores = cores;
        String manufacturer = manufacturer;
    }

    void display(){
        System.out.println("price = " + price);
        System.out.println("core count = " + cores);
        System.out.println("manufacturer = " + manufacturer);

    }
    }

    static class ram{
        int memory;
        String ramMan;

        ram(int memory, String ramMan){
            int memory = memory;
            String ramMan = ramMan;
        }

        void ramDisplay(){
        System.out.println("memory size = " + memory);
        System.out.println("manufacturer? = " + ramMan);

        }
        
    }
}


public class lab5{
    public static void main(String[] args) {
        cpu c = new cpu(17000);
        cpu.Processor p = c.new Processor(4, "intel");
        cpu.ram r = new cpu.ram(8,"sandrisk");


        System.out.println("The details of the cpu is as follows\n:");
        p.display();
        r.ramDisplay();

    }
}