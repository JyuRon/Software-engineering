package project;
import java.util.*;

public class CoffeeFlow {
	
	Scanner input;
	check esp;
	int select_num;
	order instance;
	
	CoffeeFlow()
	{
	
	instance = new order();
	input = new Scanner(System.in);
	esp  = new check();
	select_num=0;  //��ǰ ��ȣ �Է�
	
	}
	
	order flow() {
		
		select_e sel_e = new select_e();
		sel_e.e_print();
		System.out.println("�ֹ��Ͻ� ��ǰ�� ������ �ּ���.");
		
		
		select_num = input.nextInt();
		
		while(!(select_num>=1 && select_num<=report.e_kind.length))
		{
			report.clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			
			System.out.println("�ֹ��Ͻ� ��ǰ�� ������ �ּ���.");
			sel_e.e_print();
			
			select_num = input.nextInt();
		}
		
		
		 
		 instance.setMenu(report.e_kind[select_num-1][0]);
		 instance.setMenu_count(select_num-1);
		 instance.setSize(esp.size_check());
		 instance.setType(esp.type_check());
		 instance.setQuantity(esp.quantity_check());
		 instance.setCream(esp.cream_check(report.e_kind[select_num-1][0]));
		 instance.setAdd(esp.add());
		 instance.setTakeout(esp.takeout_check());
		 
		
		 
		 return instance;
		
		
		
	}
	
	


}
