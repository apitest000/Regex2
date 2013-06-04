package com.taobao.cn;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
	public static void main(String[] args) throws Exception{
		System.out.println("".matches("^\\s*$"));
		System.out.println("abc".matches(".*"));
		System.out.println("aaa 8888c".matches(".*\\d{4}.*"));
		System.out.println("aaa 8888c".matches(".*\\b\\d{4}.*"));
		System.out.println("aaa8888c".matches(".*\\d{4}.*"));
		System.out.println("aaa8888c".matches(".*\\b\\d{4}.*"));
		/*匹配email地址的正则表达式*/
		System.out.println("-");
		
		System.out.println("--@qq.com".matches("[\\w[.-]]+@[\\w.-]+\\.\\w+"));
		System.out.println("wto_qq123..-.-..--.".matches("[\\w.-]+"));
		System.out.println("wto_qq".matches("\\w+"));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("f:\\Regex\\spaceLine.txt")));
		Pattern p = Pattern.compile("^[\\s&&[^\\n]]*$");
		String str = "";
		System.out.println("1 " + "".matches("^[\\s&&[^\\n]]+$"));
		int count = 0 ;
		Matcher m = null;
		while( (str = br.readLine()) != null ) {
			m = p.matcher(str);
			if(str.matches("^[\\s&&[^\\n]]+$")) count++;
			//问题：m.find是找str中的子串有木有符合的，matches是找这个str是否符合。
//			while(m.find()) {
//				System.out.println("-" + m.group() + "-" );
//				count++;
//			}
		}
		System.out.println(count);
	}
}
