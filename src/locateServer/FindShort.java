package locateServer;
import java.util.Scanner;

public   class FindShort {
				static int n;
	public static void main(String[] args) 
	{
		
		Location local = new Location();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ڵص�λ�ã�");
		local.x = sc.nextFloat();
		local.y = sc.nextFloat();
		locateShort  near = new locateShort();
		System.out.println("����������̵�ĸ�����");
		n = sc.nextInt();
		local.store = new float[n][2];
		for(int i = 0;i<n;i++)
		{
			local.store[i][0] = sc.nextFloat();
			local.store[i][1] = sc.nextFloat();
		}
				System.out.println("������̵�λ��Ϊ��");
				System.out.print(near.LocateNearest(local).x);
				System.out.print("  ");
				System.out.print(near.LocateNearest(local).y);
	}

}
