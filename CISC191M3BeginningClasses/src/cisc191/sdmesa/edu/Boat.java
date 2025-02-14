package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):Pedro Barba Gil	
 * @author Brandon Burke
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */

//TODO: implement and remove all TODOs

/**
 */
public class Boat
{
	private static int newSerialNumber = 1;
	private String make; //Boat has-a make
	private Color color; //a Boat has-a color
	private int speed; //a Boat has-a speed
	private int price; //a Boat has-a price
	private int serialNumber; //a Boat has-a serial number
	
	//default constructor
	public Boat()
	{
		this.make = null;
		this.color = null;
		this.speed = 0;
		this.price = -1;
		this.serialNumber = createNewSerialNumber();
	}
	
	public Boat(String newMake, Color newColor) 
	{
		
		this();
		this.make = newMake;
		this.color = newColor;
		
	}
	
	public Boat(Boat otherBoat)
	{
		//somehow copy the attributes of the otherBoat
		//to make this boat
		this(otherBoat.make, otherBoat.color);
		this.speed = otherBoat.speed;
		this.price = otherBoat.price;
	}

	/**
	 * Purpose: Getter for make
	 * @return make - the make for the object
	 */
	public String getMake()
	{
		return this.make;
	}

	/**
	 * Purpose: Getter for color attribute
	 * @return color - the color for the object
	 */
	public Color getColor()
	{
		return this.color;
	}

	/**
	 * Purpose: Getter for speed
	 * @return 
	 */
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setColor(Color color)
	
	{
		this.color = color;
	}
	
	public void setPrice(int newPrice) 
	{
		this.price = newPrice;
	}
	
	public void speedUp() 
	{
		this.speed += 1;
	}
	
	public void slowDown()
	{
		if(this.speed>0)
		{
			this.speed -= 1;
		}
	}
	
	public String toString()
	{
		return "Boat: make: " + this.make + " color: " +this.color;
	}
	
	public static int createNewSerialNumber()
	{
		return newSerialNumber++;
	}
	
	public int getSerialNumber()
	{
		return this.serialNumber;
	}
	
}
