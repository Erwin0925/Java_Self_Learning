public class ques21Singleton {
    private static ques21Singleton singleton = null;

    // Private constructor to prevent instantiation
    private ques21Singleton(){
        System.out.println("Singleton instance Created");
    }

    public static ques21Singleton getInstance(){
        if(singleton == null){
            singleton = new ques21Singleton();
        }
        return singleton;
    }
    
}