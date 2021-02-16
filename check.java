package project;
import java.util.*;

public class check {
	Scanner scan = new Scanner(System.in);
	
	String[][] e_kind = {
			{"�� ��","4100","4600"},
			{"�Ƹ޸�ī��","4100","4600"},
			{"����","4600","5100"},
			{"īǪġ��","4600","5100"},
			{"�ٴҶ� ��","5100","5600"},
			{"ī�� ��ī","5100","5600"},
			{"ī��� �����ƶ�","5600","6100"},
			{"ȭ��Ʈ ��ī","5600","6100"},
			{"�÷��� ��","6000","7000"},
			{"����������","3300","3800"},
			{"�� ��","4100","4600"}};
	
	int candle_check() {
		
		int candle = 0;
		int candle_count=0;
		clearScreen();
		System.out.println("�ʰ� �ʿ��Ͻʴϱ�? \n 1.��    2.�ƴϿ�");
		candle = scan.nextInt();
		

		while(!(candle>=1 && candle<=2))
		{
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("�ʰ� �ʿ��Ͻʴϱ�? \n 1.��    2.�ƴϿ�");
			candle = scan.nextInt();
		}
		
		
		if(candle == 1)
		{
			clearScreen();
			System.out.println("�ʿ��Ͻ� ���� ������ �Է��� �ּ���.");
			candle_count = scan.nextInt();
			
			while(candle_count<=0)
			{
				System.out.println("�߸��� �Է°��Դϴ�.");
				System.out.println("�ʿ��Ͻ� ���� ������ �Է��� �ּ���.");
				candle_count = scan.nextInt();
			}
			
			return candle_count;
		}
			
		else
			return candle_count;
		
	}
	
	boolean point_check() {
		
		int point = 0; 
		clearScreen();
		System.out.println("����Ʈ ���� �Ͻðٽ��ϱ�? \n 1.��    2.�ƴϿ�");
		point = scan.nextInt();
		

		while(!(point>=1 && point<=2))
		{
			clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("����Ʈ ���� �Ͻðٽ��ϱ�? \n 1.��    2.�ƴϿ�");
			point = scan.nextInt();
		}
		
		
		if(point == 1)
			return true;
		else
			return false;
		
	}
	
	
	int type_check() {
		int type = 1;
		clearScreen();
		System.out.println("������ �µ��� ������ �ּ���.\n 1.Hot  2. Ice");
		type = scan.nextInt();
		
		while(!(type>=1 && type<=2))
		{
			clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("������ ũ�⸦ ������ �ּ���.\n 1.Hot  2. Ice");
			type = scan.nextInt();
		}
		
		return type;
		
		
	}
	
	
	int size_check() {
		int size = 1;
		clearScreen();
		System.out.println("������ ũ�⸦ ������ �ּ���.\n 1.Regular  2. Large");
		size = scan.nextInt();
		
		while(!(size>=1 && size<=2))
		{
			clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("������ ũ�⸦ ������ �ּ���.\n 1.Regular  2. Large");
			size = scan.nextInt();
		}
		
		return size;
		
		
	}
	
	int quantity_check() {
		
		int quantity = 0;
		clearScreen();
		System.out.println("�ֹ��Ͻ� ������ �Է��� �ּ���.");
		quantity = scan.nextInt();
		
		while(quantity<=0)
		{
			clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("�ֹ��Ͻ� ������ �Է��� �ּ���.");
			quantity = scan.nextInt();
			
		}
		
		
		return quantity;
		
	}

	boolean cream_check(String type){
		
		String check = null;
		
		clearScreen();
		
		if(type.equals("�ٴҶ� ��") || type.equals("ī�� ��ī") || type.equals("ī��� �����ƶ�") || type.equals("ȭ��Ʈ ��ī") )
		{
			
			System.out.println("����ũ���� �߰��Ǵ� �޴��Դϴ�. �߰��Ͻðڽ��ϱ�?(y/n)");
			
			check = scan.next();
			
			
			//���� �˿�
			while(!(check.equals("y") || check.equals("Y") ||  check.equals("N") || check.equals("n")))
			{
				clearScreen();
				System.out.println("�߸��� �Է°��Դϴ�.");
				System.out.println("����ũ���� �߰��Ǵ� �޴��Դϴ�. �߰��Ͻðڽ��ϱ�?(y/n)");
				check = scan.next();
			}
			
			
		}
		
		if(check==null)
			return false;
		else if(check.equals("y") || check.equals("Y"))
			return true;
		else
			return false;
		
	}
	
	
	int add()
	{
		int add = 0; 
		clearScreen();
		System.out.println("�߰��Ͻ� ǰ���� ������ �ּ���.");
		System.out.println("0.���   1.����    2.�÷�    3.��");
		add = scan.nextInt();
		
		while(add<0 || add>3)
		{
			clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("�߰��Ͻ� ǰ���� ������ �ּ���.");
			System.out.println("0.���   1.����    2.�÷�    3.��");
			add = scan.nextInt();
			
		}
		
		return add;
	}
	
	boolean takeout_check()
	{
		int takeout = 0; 
		clearScreen();
		System.out.println("�����Ͻʴϱ�? \n 1.��    2.�ƴϿ�");
		takeout = scan.nextInt();
		

		while(!(takeout>=1 && takeout<=2))
		{
			clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("�����Ͻʴϱ�? \n 1.��    2.�ƴϿ�");
			takeout = scan.nextInt();
		}
		
		
		if(takeout == 1)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	void clearScreen() {
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	  }
	
}
