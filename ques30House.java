public class ques30House {
    public void calculateArea(){
        int length =3;
        int width = 7;

        class Room{
            public int getArea(){
                return length * width;
            }
        }

        Room room = new Room();
        int area = room.getArea();
        System.out.print("Area is : " + area);
    }
    
}
// Local Class Accessing Local Variables:
// Write a Java program to create a class called House with a method calculateArea(). 
// Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width). 
// Instantiate the Room class and call the getArea() method from within calculateArea().
//-----------------------------------------------------------------------------------//
