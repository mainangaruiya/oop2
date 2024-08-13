public class Rectanglee{
	int Rectangleewidth,Rectangleelength;
	static int rectangleearea;

	Rectanglee(int width,int length)
	{
		Rectangleewidth = width;
		Rectangleelength = length;
	}
	public static void main(String[] args) {
    // Create rectangle1 object
    Rectanglee Rectangle1 = new Rectanglee(5, 7);
    System.out.println("The width of a rectangle1 is : " + Rectangle1.Rectangleewidth);
    System.out.println("The length of a rectangle1 is : " + Rectangle1.Rectangleelength);

    // Create rectangle2 object
    Rectanglee Rectangle2 = new Rectanglee(2, 3);
    System.out.println("The width of a rectangle2 is : " + Rectangle2.Rectangleewidth);
    System.out.println("The length of a rectangle2 is : " + Rectangle2.Rectangleelength);
}

}