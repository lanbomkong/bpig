package com.biosh.account;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AccountServerApplicationTests {

  Logger logger = LoggerFactory.getLogger(AccountServerApplication.class);

  @Test
  public void name() {
	System.out.println(mySqrt(2147395600));
  }

  public int mySqrt(int x) {
	int n = 1;
	while (true) {
	  int res = n*n;
	  if (res <= x) {
		n++;
	  }else {
		return n-1;
	  }
	}
  }

  @Test
  public void testMethod() throws Exception{
    // 创建文件对象，参数是文件的路径
	File file = new File("C:\\Users\\Administrator\\Desktop\\helllo.txt");
	try {
	  // 创建一个输入流，读取文件中的内容，通过read()方法读取，若返回值为-1，则表示已读完
	  FileInputStream inputStream = new FileInputStream(file);
	  int read;
	  // xiugai
	  StringBuilder stringBuilder = new StringBuilder();
	  while ((read = inputStream.read()) != -1) {
	    stringBuilder.append((char) read);
	  }
	  System.out.println(stringBuilder);
	} catch (FileNotFoundException e) {
	  logger.error("file not found!");
	}


  }
}
