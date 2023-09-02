import java.util.*;
abstract class Shape
{
	abstract void numberOfsides();
}

class Rectangle extends Shape
{
void numberOfsides()
{
	System.out.println("Rectangle has 4 sides");
}}

class Hexagon extends Shape 
{
void numberOfsides()
{
	System.out.println("Hexagon has 6 sides");
}}

class Main
{
	public static void main(String args[])
	{
	Rectangle robj=new Rectangle();
	Hexagon hobj=new Hexagon();
	robj.numberOfsides();
	hobj.numberOfsides();
	}
}