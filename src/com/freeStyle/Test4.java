package com.freeStyle;



import static org.testng.Assert.assertTrue;

import java.io.File;

public class Test4 {
	 public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

 		  for (int i = 0; i < dirContents.length; i++) {
			  String filename=dirContents[i].getName();
			  System.out.println(filename);
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		          dirContents[i].delete();
		          return true;
		      }
		          }
		      return false;
		  }
	 public static void main(String[] args) {
		 
		 Test4 t=new Test4();
		boolean value=t.isFileDownloaded("F:\\resumes", "resume6.doc");
		System.out.println(value);
	 }

}

