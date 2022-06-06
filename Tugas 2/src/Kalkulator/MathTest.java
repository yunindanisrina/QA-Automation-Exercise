package Kalkulator;

public class MathTest {
	
	static double i,j,k=0;
	static char n,m;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Masukkan Bilangan Pertama : ");
			i = Double.parseDouble(Math.getValue1().replaceFirst(",","."));
			
			System.out.println("Masukkan Bilangan Kedua : ");
			j = Double.parseDouble(Math.getValue1().replaceFirst(",","."));
			
			System.out.println("Masukkan operator aritmatika :");
			m = Math.getOperator();
			if (m == '+')
			{
				k = Math.getTambah(i, j);
			}
			 else if(m == '-')
             {
                 k = Math.getKurang(i,j);
             }
			else if (m == '/')
			{
				k = Math.getBagi(i, j);
			}
			else if(m == '*')
			{
				k = Math.getKali(i, j);
			}
			
		System.out.println("Masukkan fungsi (=) untuk menjalankan perhitungan : ");
		n = Math.getFunc();
		if(n == '=')
		{
			System.out.println(String.format("Hasilnya adalah %,.2f", k));
		}
		else
		{
			throw new Exception();
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Pembagian dengan nol");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Tanda titik hanya boleh ditulis satu kali");
		}
		catch(Exception ec)
		{
			System.out.println("Exception Lain" + ec);
		}
	}

}
