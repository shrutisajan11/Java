import java.util.*;
abstract class Shape 
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Rectangle has 4 sides");
	}
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Triangle has 3 sides");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides");
	}
}


class A
{
	public static void main(String args[])
	{
		Shape sobj;
		Rectangle robj=new Rectangle();
		sobj=robj;
		robj.numberOfSides();
		
		Triangle tobj=new Triangle();
		sobj=tobj;
		tobj.numberOfSides();

		Hexagon hobj=new Hexagon();
		sobj=hobj;
		hobj.numberOfSides();
	}
}
		