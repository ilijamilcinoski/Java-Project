/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connecting.to.and.reading.from.a.web.page;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Ilija
 */
public class URLExample {
   public static void main(String[] args) throws MalformedURLException, IOException {
URL mySite= new URL("http://www.google.com");
URLConnection yc= mySite.openConnection();
Scanner in;
 in = new Scanner(new InputStreamReader(yc.getInputStream()));
 int count= 0;
 while(in.hasNext()){
 count++;
 }
 System.out.println("Number of tokens:" + count);
 in.close();      
 }
 }

    
    
