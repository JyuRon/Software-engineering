package project;

import java.util.Calendar;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
public class final_method {
	Scanner scan = new Scanner(System.in);
	
	void payment(int total_bill)
	{
		int bye,client_money;
		System.out.println("결제 수단을 선택하여 주세요.");
		System.out.println("1.카드   2.현금");
		bye = scan.nextInt();
		
		while(!(bye>=1 && bye<=2))
		{
			
			System.out.println("잘못된 입력값입니다.");
			
			System.out.println("결제 수단을 선택하여 주세요.");
			System.out.println("1.카드   2.현금");
			bye = scan.nextInt();
		}
		
		if(bye==2)
		{
			System.out.println("액수를 입력하여 주세요.");
			client_money=scan.nextInt();
			
			while(client_money<total_bill)
			{
				System.out.println("액수가 모자랍니다.");
				System.out.println("액수를 입력하여 주세요.");
				client_money=scan.nextInt();
			}
			report.clearScreen();
			System.out.println("받은 금액 : "+client_money+"원");
			System.out.println("결제 금액 : "+total_bill+"원");
			System.out.println("거스 름돈 : "+(client_money-total_bill)+"원");
		}
		else
		{
			System.out.println("승인이 완료되었습니다.");
			System.out.println("결제 금액 : "+total_bill+"원");
		}
	}
	
	void openText(String str)
	{
		try {
		    OutputStream output = new FileOutputStream("D:/"+path()+".txt");
		    byte[] by=str.getBytes();
		    output.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
	}
	
	String readText()
	{
		try {
		       // 바이트 단위로 파일읽기
		        String filePath = "D:/"+path()+".txt"; // 대상 파일
		        FileInputStream fileStream = null; // 파일 스트림
		        
		        fileStream = new FileInputStream( filePath );// 파일 스트림 생성
		        //버퍼 선언
		        byte[ ] readBuffer = new byte[fileStream.available()];
		        while (fileStream.read( readBuffer ) != -1){}
		        
		        String str = new String(readBuffer);
		        //System.out.println(new String(readBuffer)); //출력

		        fileStream.close(); //스트림 닫기
		        
		        return str;
		    } catch (Exception e) {
			e.getStackTrace();
			return "";
		    }
	}
	
	String path()
	{
		Calendar time = Calendar.getInstance();
		
		int day= time.get(Calendar.DAY_OF_MONTH);
		int year = time.get(Calendar.YEAR);
		int mon = time.get(Calendar.MONTH)+1;
		int result_day;
		
		switch(day)
		{
		case 1:case 2:case 3:result_day=1;break;
		case 4:case 5:case 6:result_day=4;break;
		case 7:case 8:case 9:result_day=7;break;
		case 10:case 11:case 12:result_day=10;break;
		case 13:case 14:case 15:result_day=13;break;
		case 16:case 17:case 18:result_day=16;break;
		case 19:case 20:case 21:result_day=19;break;
		case 22:case 23:case 24:result_day=22;break;
		case 25:case 26:case 27:result_day=25;break;
		case 28:case 29:case 30:case 31:result_day=28;break;
		default:result_day=day;
		}
		
		String path = ""+year+mon+result_day;
		
		return path;
	}
	
	String format() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
		Calendar time = Calendar.getInstance();
		String format_time = format.format(time.getTime());
		
		return format_time;
	}
	

}
