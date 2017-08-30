class Vehicle
{

}

interface Flyer
{
	void takeoff();		// public abstract
	void land();			// public abstract
	void fly();			// public abstract
}

class Animal
{
	public void eat()
	{
		;
	}
}

class Kryptonian extends Animal
{

}


class Airplane extends Vehicle implements Flyer
{
	public void takeoff()		// override interface Flyer, public abstract
	{
	}
	public void land()			// override interface Flyer, public abstract
	{
	}
	public void fly()			// override interface Flyer, public abstract
	{
	}
}


class Bird extends Animal implements Flyer
{
	public void takeoff()		// override interface Flyer, public abstract
	{
	}
	public void land()			// override interface Flyer, public abstract
	{
	}
	public void fly()			// override interface Flyer, public abstract
	{
	}

	public void buildNest()
	{
		;
	}
	public void layEggs()
	{
		;
	}
	
	public void eat()	// override Animal class
	{
		;
	}

}

class Superman extends Kryptonian implements Flyer
{
	public void takeoff()		// override interface Flyer, public abstract
	{
	}
	public void land()			// override interface Flyer, public abstract
	{
	}
	public void fly()			// override interface Flyer, public abstract
	{
	}

	public void leapBuilding()
	{
		;
	}
	public void stopBullet()
	{
		;
	}

	public void eat()	// override Animal class
	{
		;
	}

}


