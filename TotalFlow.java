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
		
		System.out.println("자바 커피 전문점에 오신것을 환영합니다.");
	}
	
	
	void flow() {
		
		
		System.out.println("원하시는 상품의 품목을 선택해 주세요.");
		System.out.println("1.커피    2. 케익");
		total_num = total_Input.nextInt();
		
		while(!(total_num>=1 && total_num<=2))
		{
			report.clearScreen();
			System.out.println("잘못된 입력값입니다.");
			System.out.println("원하시는 상품의 품목을 선택해 주세요.");
			System.out.println("1.커피    2. 케익");
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
		System.out.println("주문하신 내역을 확인하여 주세요.\n");
		i=1;
		
		System.out.println("번호      품목       수량      가격        비고");
		for(order ab : orderlist.getOrderList())
		{
			total_bill+=ab.getPrice()*ab.getQuantity();
			System.out.println((i++)+". "+ab.print());
		}
		
		System.out.println("---------------총액 : "+total_bill+"원-------");
	
		
		
		System.out.println("\n----------------------------------");
		System.out.println("1.품목 수정    2. 추가주문     3.결제");
		total_num = total_Input.nextInt();
		
		while(!(total_num>=1 && total_num<=3))
		{
			System.out.println("잘못된 입력값입니다.");
			System.out.println("1.품목 수정    2. 추가주문     3.결제");
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
		System.out.println("수정하실 번호를 입력해 주세요.");
		ri = total_Input.nextInt();
		
		//!(total_num>=1 && total_num<=report.e_kind.length)
		while(ri<0 || ri>orderlist.size())
		{
			System.out.println("잘못된 입력값입니다.");
			System.out.println("수정하실 번호를 입력해 주세요.");
			ri = total_Input.nextInt();
		}
		
		ab = orderlist.get(ri);
		
		report.clearScreen();
		
		System.out.println(ab.print()+"\n");
		
		if(ab.getOrder_num() ==2)
		{
			System.out.println("1.수량변경   2.비고변경   3.포장변경    4.주문취소");
			ic = total_Input.nextInt();
			
			while(!(ic>=1 && ic<=4))
			{
				report.clearScreen();
				System.out.println("잘못된 입력값입니다.");
				System.out.println(ab.print()+"\n");
				System.out.println("1.수량변경   2.비고변경   3.포장변경   4.주문취소");
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
			System.out.println("1.수량변경   2.사이즈변경   3.비고변경   4.포장변경   5.타입변경   6.주문취소");
			ic = total_Input.nextInt();
			
			while(!(ic>=1 && ic<=6))
			{
				report.clearScreen();
				System.out.println("잘못된 입력값입니다.");
				System.out.println(ab.print()+"\n");
				System.out.println("1.수량변경   2.사이즈변경   3.비고변경   4.포장변경   5.타입변경   6.주문취소");
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
		
		System.out.println("이용해 주셔서 감사합니다.");
		
		
		
		i=1;total_bill=0;
		
		String billToText= fm.readText();
		
		billToText +="\r\n"+fm.format();
		for(order ab : orderlist.getOrderList())
		{
			total_bill+=ab.getPrice()*ab.getQuantity();
			System.out.println((i)+". "+ab.print());
			
			billToText +="\r\n"+(i++)+". "+ab.print();
		}
		
		System.out.println("------판매금액 : "+total_bill+"원-------");

		billToText +="\r\n------판매금액 : "+total_bill+"원-------";
		
		
		fm.openText(billToText);
		
		
		
		
	}

}
