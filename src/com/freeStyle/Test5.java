package com.freeStyle;

import java.io.File;

import org.testng.annotations.Test;

public class Test5 {
@Test
public void downloadfilevalidation() {
	File getLatestFile = getLatestFilefromDir("F:\\");
    String fileName = getLatestFile.getName();
    System.out.println(fileName);
}
private File getLatestFilefromDir(String dirPath){
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    if (files == null || files.length == 0) {
        return null;
    }

    File lastModifiedFile = files[0];
    for (int i = 1; i < files.length; i++) {
       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
           lastModifiedFile = files[i];
       }
    }
    return lastModifiedFile;
}
}
