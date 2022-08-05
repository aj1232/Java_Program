class Rel1
{
	public static void main(String[] args)
	{
		System.out.println( 10 == 10 );				// true
		System.out.println( 10 != 10 );				// false
		System.out.println( 10 > 10 ); 				// false
		System.out.println( 10 <= 10 );				// true	
		System.out.println( 'd' > 'a' );			// true
		System.out.println( 23 >= 0 ); 				// true
		System.out.println( 10 <= 10.000000001 );	// true
		System.out.println( 10 < 10.00f );			// false
		System.out.println( 'e' == 50 );			// false
		System.out.println( true == true );			// true
		System.out.println( "OK" == "OK" );			// true
		System.out.println( '1' == 1 );				// false
	}
}