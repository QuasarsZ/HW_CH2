package homework_ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J���");
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0); //�ϥ�String���O��charAt���O��k
									 //���X���ު���0���r���A��ܨ���J�Ĥ@�Ӧr��
		
		switch(letter)
		{
			case 'a':
			{
				System.out.println("��J���Oa");
				break;
			}
			case 'b':
			{
				System.out.println("��J���Ob");
				break;
			}
			default:
			{
				System.out.println("�п�Ja��b");
				break;
			}
		}
		
	}

}
