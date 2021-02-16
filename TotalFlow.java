package project;
import java.util.*;

public class TotalFlow {
	int total_bill;
	Scanner total_Input;
	int total_num;
	int i;
	CoffeeFlow Cf;
	CakeFlow  af;
	order ab;
	orderManager orderlist;
	TotalFlow(){
		total_Input = new Scanner(System.in);
		orderlist = new orderManager();
		total_num =0; 
		
		System.out.println("�ڹ� Ŀ�� �������� ���Ű��� ȯ���մϴ�.");
	}
	
	
	void flow() {
		
		
		System.out.println("���Ͻô� ��ǰ�� ǰ���� ������ �ּ���.");
		System.out.println("1.Ŀ��    2. ����");
		total_num = total_Input.nextInt();
		
		while(!(total_num>=1 && total_num<=2))
		{
			report.clearScreen();
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("���Ͻô� ��ǰ�� ǰ���� ������ �ּ���.");
			System.out.println("1.Ŀ��    2. ����");
			total_num = total_Input.nextInt();
		}
		
		Cf = new CoffeeFlow();
		af = new CakeFlow();
		
		switch(total_num)
		{
		
		case 1:
			orderlist.add(Cf.flow()); break;
		case 2:
			orderlist.add(af.flow());break;
		
		}
		
		
	}
	
	boolean mid_flow()
	{
		total_bill=0;
		report.clearScreen();
		System.out.println("�ֹ��Ͻ� ������ Ȯ���Ͽ� �ּ���.\n");
		i=1;
		
		System.out.println("��ȣ      ǰ��       ����      ����        ���");
		for(order ab : orderlist.getOrderList())
		{
			total_bill+=ab.getPrice()*ab.getQuantity();
			System.out.println((i++)+". "+ab.print());
		}
		
		System.out.println("---------------�Ѿ� : "+total_bill+"��-------");
	
		
		
		System.out.println("\n----------------------------------");
		System.out.println("1.ǰ�� ����    2. �߰��ֹ�     3.����");
		total_num = total_Input.nextInt();
		
		while(!(total_num>=1 && total_num<=3))
		{
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("1.ǰ�� ����    2. �߰��ֹ�     3.����");
			total_num = total_Input.nextInt();
		}
		
		switch(total_num)
		{
		case 1: mod_flow();break;
		case 2: flow();break;
		
		}
		
		if(total_num!=3)
			return true;
		else
			return false;
		
	}
	
	
	void mod_flow()
	{
		int ic,ri;
		System.out.println("�����Ͻ� ��ȣ�� �Է��� �ּ���.");
		ri = total_Input.nextInt();
		
		//!(total_num>=1 && total_num<=report.e_kind.length)
		while(ri<0 || ri>orderlist.size())
		{
			System.out.println("�߸��� �Է°��Դϴ�.");
			System.out.println("�����Ͻ� ��ȣ�� �Է��� �ּ���.");
			ri = total_Input.nextInt();
		}
		
		ab = orderlist.get(ri);
		
		report.clearScreen();
		
		System.out.println(ab.print()+"\n");
		
		if(ab.getOrder_num() ==2)
		{
			System.out.println("1.��������   2.�����   3.���庯��    4.�ֹ����");
			ic = total_Input.nextInt();
			
			while(!(ic>=1 && ic<=4))
			{
				report.clearScreen();
				System.out.println("�߸��� �Է°��Դϴ�.");
				System.out.println(ab.print()+"\n");
				System.out.println("1.��������   2.�����   3.���庯��   4.�ֹ����");
				ic = total_Input.nextInt();
			}
			
			
			switch(ic)
			{
			
			case 1: ab.setQuantity(af.esp.quantity_check());break;
			
			case 2: ab.setCandle_count(af.esp.candle_check());break;
			case 3: ab.setTakeout(af.esp.takeout_check());break;
			case 4: orderlist.remove(ri-1);
			
			}
			
		}
		else
		{
			System.out.println("1.��������   2.�������   3.�����   4.���庯��   5.Ÿ�Ժ���   6.�ֹ����");
			ic = total_Input.nextInt();
			
			while(!(ic>=1 && ic<=6))
			{
				report.clearScreen();
				System.out.println("�߸��� �Է°��Դϴ�.");
				System.out.println(ab.print()+"\n");
				System.out.println("1.��������   2.�������   3.�����   4.���庯��   5.Ÿ�Ժ���   6.�ֹ����");
				ic = total_Input.nextInt();
			}
			
			
			switch(ic)
			{
			
			case 1: ab.setQuantity(Cf.esp.quantity_check());break;
			case 2: ab.setSize(Cf.esp.size_check());break;
			case 3: ab.setAdd(Cf.esp.add());break;
			case 4: ab.setTakeout(Cf.esp.takeout_check());break;
			case 5: ab.setType(Cf.esp.type_check());break;
			case 6: orderlist.remove(ri-1);
			
			}
			
		}
		
	}
	
	
	
	void final_flow() {
		
		final_method fm = new final_method();
		fm.payment(total_bill);
		
		System.out.println("�̿��� �ּż� �����մϴ�.");
		
		
		
		i=1;total_bill=0;
		
		String billToText= fm.readText();
		
		billToText +="\r\n"+fm.format();
		for(order ab : orderlist.getOrderList())
		{
			total_bill+=ab.getPrice()*ab.getQuantity();
			System.out.println((i)+". "+ab.print());
			
			billToText +="\r\n"+(i++)+". "+ab.print();
		}
		
		System.out.println("------�Ǹűݾ� : "+total_bill+"��-------");

		billToText +="\r\n------�Ǹűݾ� : "+total_bill+"��-------";
		
		
		fm.openText(billToText);
		
		
		
		
	}

}
