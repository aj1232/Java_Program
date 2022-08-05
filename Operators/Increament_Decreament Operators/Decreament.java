class Decreament
{
	public static void main(String[] args){
		
		int a = 34, b = 56, c = 12, d = 12;

		a = b-- + --c + a-- - --d;

		b = c-- - --a + --b - d--;

		c = a-- - --b + --c + d--;

		d = --d + --a - c-- + b--;

		System.out.println(a); // 87
		System.out.println(b); // -37
		System.out.println(c); // 143
		System.out.println(d); // -85
		
	}
}