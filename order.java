package project;

public class order {
	private int order_num;
	private String menu;
	private int menu_count;
	private int candle_count;
	private boolean point;
	private boolean cream;
	private boolean takeout;
	private int type;
	private int size;
	private int quantity;
	private int add;
	
	
	




	private int price;
	private String s_takeout;
	private String s_size;
	private String s_type;
	private String bigo_cake;
	private String bigo_coffee;

	
	

	
	
	String print()
	{
		
		if(order_num == 2)
			return s_takeout + menu + "  " +quantity+"   "+ price +"   "+bigo_cake;

		else 
			return s_takeout + menu +s_size+s_type+ "  "+quantity + "   "+ price+"   "+bigo_coffee;
			

	}

	public int getMenu_count() {
		return menu_count;
	}



	public void setMenu_count(int menu_count) {
		this.menu_count = menu_count;
	}
	

	public int getOrder_num() {
		return order_num;
	}



	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}



	public String getMenu() {
		return menu;
	}



	public void setMenu(String menu) {
		this.menu = menu;
	}



	public int getCandle_count() {
		return candle_count;
	}



	public void setCandle_count(int candle_count) {
		this.candle_count = candle_count;
		
		if(candle_count>=0)
			bigo_cake = "초 "+candle_count+"개";
		else
			bigo_cake = "초 선택 안함";
	}



	public boolean isPoint() {
		return point;
	}



	public void setPoint(boolean point) {
		this.point = point;
	}



	public boolean isCream() {
		return cream;
	}



	public void setCream(boolean cream) {
		
		this.cream = cream;
		
		if(cream)
			bigo_coffee="휘핑추가";
	}



	public boolean isTakeout() {
		
		return takeout;
	}



	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
		
		if(takeout)
			s_takeout = "[T]";
		else
			s_takeout="";
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
		if(type==1)
			s_type = "(H)";
		else
			s_type="(I)";
		
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
		
		if(size==1)
		{
			price=Integer.parseInt(report.e_kind[menu_count][size]);
			s_size = "R";
		}
			
		else
		{
			price=Integer.parseInt(report.e_kind[menu_count][size]);
			s_size="L";
		}
			
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getAdd() {
		return add;
	}



	public void setAdd(int add) {
		this.add = add;
		
		switch(add)
		{
			case 0:bigo_coffee="";break;
			case 1:bigo_coffee="휘핑추가";break;
			case 2:bigo_coffee="시럽추가";break;
			case 3:bigo_coffee="샷추가";break;
		}
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		
		
		this.price = price;
	}



	public String getS_takeout() {
		return s_takeout;
	}



	public void setS_takeout(String s_takeout) {
		this.s_takeout = s_takeout;
	}



	public String getS_size() {
		return s_size;
	}



	public void setS_size(String s_size) {
		this.s_size = s_size;
	}



	public String getBigo_cake() {
		return bigo_cake;
	}



	public void setBigo_cake(String bigo_cake) {
		this.bigo_cake = bigo_cake;
	}



	public String getBigo_coffee() {
		return bigo_coffee;
	}



	public void setBigo_coffee(String bigo_coffee) {
		this.bigo_coffee = bigo_coffee;
	}
	
	
	

}
