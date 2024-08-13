public class Recta{
	int Rectawidth,Rectalenght;
	static int rectaarea;

	Rectangle(int width,int lenght)
	{
		Rectawidth = width;
		Rectalenght = lenght;
	}
	public static void main(String[] args) {
    // Create rectangle1 object
    Rectangle Rectangle1 = new Rectangle(5, 7);
    System.out.println("The width of a rectangle1 is : " + Rectangle1.Rectanglewidth);
    System.out.println("The length of a rectangle1 is : " + Rectangle1.Rectanglelength);

    // Create rectangle2 object
    Rectangle Rectangle2 = new Rectangle(2, 3);
    System.out.println("The width of a rectangle2 is : " + Rectangle2.Rectanglewidth);
    System.out.println("The length of a rectangle2 is : " + Rectangle2.Rectanglelength);
}

}