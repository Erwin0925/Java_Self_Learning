public class ques24Computer {
    class Processor{
        private String brand;
        private int speed;

        public Processor(String brand, int speed){
            this.brand = brand;
            this.speed = speed;
        }
        public void displayDetails(){
            System.out.println("Processor Brand : " + brand);
            System.out.println("Processor Speed : " + speed + "GHz");
        }
    }
    public void showProcessorDetails(){
        Processor processor = new Processor("Intel", 3);
        processor.displayDetails();
    }
    
}

