import java.util.*;

class CircumOfCircle {
    
    // Method to calculate the circumference of a circle
    public void cof(float r) {
        float pi = 3.1423f;  // Using float for Pi
        float c = 2 * pi * r; // Circumference formula: C = 2 * π * r
        System.out.println("Circumference of the circle is: " + c);
    

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Prompt user for the radius
        System.out.print("Enter the radius of the circle: ");
        float r = s.nextFloat();  // Taking radius as input

        // Create an object of CircumOfCircle and call the cof method
        CircumOfCircle obj = new CircumOfCircle();
        obj.cof(r);  // Print the circumference

        s.close();  // Close the scanner
    }
}
