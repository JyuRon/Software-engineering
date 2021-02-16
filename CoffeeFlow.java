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
	select_num=0;  //상품 번호 입력
	
	}
	
	order flow() {
		
		select_e sel_e = new select_e();
		sel_e.e_print();
		System.out.println("주문하실 상품을 선택해 주세요.");
		
		
		select_num = input.nextInt();
		
		while(!(select_num>=1 && select_num<=report.e_kind.length))
		{
			report.clearScreen();
			System.out.println("잘못된 입력값입니다.");
			
			System.out.println("주문하실 상품을 선택해 주세요.");
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
