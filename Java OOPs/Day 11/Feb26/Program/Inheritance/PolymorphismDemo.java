abstract class Shape
{
	double area;
	
	abstract void calArea();
	
	void printArea()
	{
		System.out.println(area);
	}
}

class Rectangle extends Shape
{
	double l;
	double b;
	
	Rectangle(double l, double b)
	{
		this.l = l;
		this.b = b;
	}
	
	void calArea()
	{
		this.area = this.l * this.b;
		printArea();
	}
}

class Square extends Shape
{
	double side;
	
	Square(double side)
	{
		this.side = side;
	}
	
	void calArea()
	{
		this.area = this.side * this.side;
		printArea();
	}
	
}


class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	void calArea()
	{
		this.area = 3.14 * this.radius * this.radius;
		printArea();
	}	
}

class PolymorphismDemo
{
	public static void main(String args[])
	{
			
		//Shape s = new Rectangle(4.0,6.0);
		
		//Create array of Shape references
		
		Shape shape[] = new Shape[3];
		
		shape[0] = new Rectangle(4.0,6.0);
		shape[1] = new Square(5.0);
		shape[2] = new Circle(3.0);
		
		for(int i = 0; i < shape.length; i++)
		{
			shape[i].calArea();	//The same is calling different class methods.
						//Polymorphic behaviour
		}
	}
}




