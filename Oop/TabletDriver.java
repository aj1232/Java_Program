class TabletDriver
{
	public static void main(String arg[])
	{
		Tablet t1 = new Tablet();

		t1.name = "Analgim";
		t1.price = 2.00;

		t1.displayTablet();

		Tablet t2 = new Tablet();

		t2.name = "HP";
		t2.price = 3.00;

		t2.displayTablet();
	}
}