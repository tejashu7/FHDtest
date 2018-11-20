package palindrom;
import java.io.EOFException;
import java.util.Scanner;

public class palindrom {
	public boolean isPal(int a){
		int b,c, e;
		boolean isPolindrome = false;
		//these are the changes made by me 
		if(a > 9999 && a < 100000)
        {           
				b = a / 10000;
                a = a % 10000;
                c = a / 1000;
                a = a % 1000;
                a = a % 100;
                e = a / 10;
                a = a % 10;
 
                if (b == a && c == e)
                {
                    isPolindrome = true;
                }
                    else
                    	 isPolindrome = false;
 
    }  
   if(a>999 && a<10000)
   {
    
    b = a / 1000;
    a = a % 1000;
    c = a / 100;
    a = a % 100;
    e = a / 10;
    a = a % 10;
    if (b == a && c == e)
                {
    	           isPolindrome = true;
                }
                    else
                    	 isPolindrome = false;
	}              
    if(a>99 && a<1000)
    {
    	
		b = a / 100;
    	a = a % 100;
    	a = a % 10;
    	if (b == a)
                {
    		             isPolindrome = true;
                }
                    else
                    	 isPolindrome = false;
    }
    if(a>9 && a<100)
	{
		
		b = a / 10;
		a = a % 10;
			if (b == a)
                {
				        isPolindrome = true;
                }
                    else
                    	 isPolindrome = false;
	} 
    return isPolindrome;
    
	}
	public static void main(String[] args) {
	//String s = new String();
		int n;
		System.out.println("������� ���������� ���������: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int [] mas;
        mas = new int[n];
        System.out.println("������� �����:");
        for(int i=0;i<n;i++){
            mas[i] = scanner.nextInt();

        }
        palindrom obj = new palindrom();
        System.out.println("����������: ");
        for(int i=0;i<n;i++)
        { 
        	if(obj.isPal(mas[i]))
        	{
        		System.out.print(mas[i] + " ");
        		}
        	}
        scanner.close();
        
 
}

        }



