package text_p47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sample2_21 
{
	private static final int Collections = 0;

	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ոݔ��5���˵ķ֔�");
		int test[] = new int[5];
		
		for(int i=0;i<test.length;i++)
		{
			String str = br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		Arrays.sort(test,Collections,reverseOrder());
		
		for(int i =0;i<test.length;i++)
		{
			System.out.println("��"+(i+1)+"���ķ֔���"+test[i]);
		}
		
	}

	private static int reverseOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}