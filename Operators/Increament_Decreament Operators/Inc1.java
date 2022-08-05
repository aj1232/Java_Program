class Inc1
{
	public static void main(String[] args){
		
		int a = 9 , b = 8 , c = 27 , d = 37 , e = 5;

		e = a++ + ++b + c++ ;

		d = c++ - ++e + ++b ;

		a = b++ - ++a;

		b = a++ + ++c * ++e;

		c = a++ + ++a + a++ + ++b;

		System.out.println(a);		// 3

		System.out.println(b);		// 1410

		System.out.println(c);		// 1414

		System.out.println(d);		// -8
 
		System.out.println(e);		// 45

			
		}
}