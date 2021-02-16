package project;
import java.util.*;

public class CakeFlow {
	
	Scanner input;
	check esp;
	int select_num;
	order instance;
	
	CakeFlow()
	{
	
	instance = new order();
	input = new Scanner(System.in);
	esp  = new check();
	select_num=0;  //상품 번호 입력
	
	}
	
	order flow() {
		
		select_c sel_c = new select_c();
		sel_c.c_print();
		System.out.println("주문하실 상품을 선택해 주세요.");
		
		
		select_num = input.nextInt();
		
		while(!(select_num>=1 && select_num<=report.e_kind.length))
		{
			report.clearScreen();
			System.out.println("잘못된 입력값입니다.");
			
			System.out.println("주문하실 상품을 선택해 주세요.");
			sel_c.c_print();
			
			select_num = input.nextInt();
		}
		
		
		 instance.setOrder_num(2);
		 instance.setMenu(report.c_kind[select_num-1][0]);
		
		 instance.setPrice(Integer.parseInt(report.c_kind[select_num-1][1]));
		 instance.setQuantity(esp.quantity_check());
		
		instance.setCandle_count(esp.candle_check());
		 instance.setTakeout(esp.takeout_check());
		 
	
		 return instance;
		
	}
	


}
