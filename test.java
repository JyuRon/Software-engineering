package project;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(format_time);
		
		System.out.println(path);
		
		
		//test a= new test();
		//a.openText("abc");
		//String b=a.readText();
		//a.openText(b+"\r\ndef");
		
		
		
		
		System.out.println(result_day);
		
		
		
	}
	
	void openText(String str)
	{
		try {
		    OutputStream output = new FileOutputStream("D:/Output.txt");
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
		        String filePath = "D:/Output.txt"; // 대상 파일
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
	

}
