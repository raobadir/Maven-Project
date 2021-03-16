package com.mvform;

import org.joda.time.LocalTime;
import org.jsoup.Jsoup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String htmlText = "<h1>Hello World!</h1>"; 
        System.out.println( htmlText );
        System.out.println(Jsoup.parse(htmlText).text());
        
        String maVar = "Bonjour";
        
        System.out.println(maVar);
        
    	LocalTime currentTime = new LocalTime();
    	System.out.println("Il est " + currentTime);
    }
}
