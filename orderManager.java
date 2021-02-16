package project;

import java.util.*;
public class orderManager {
	
	List<order> orderlist = new ArrayList<order>();
	
	void add(order ab) {
		orderlist.add(ab);
	}
	
	List<order> getOrderList(){
		return orderlist;
	}
	
	order get(int a)
	{
		return orderlist.get(a-1);
		
	}
	
	int size() {
		System.out.println("사이즈값:"+orderlist.size());
		return orderlist.size();
	}
	
	void remove(int ri)
	{
		orderlist.remove(ri);
	}

}
