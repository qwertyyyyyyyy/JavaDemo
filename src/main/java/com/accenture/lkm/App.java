package com.accenture.lkm;

import java.time.LocalDateTime;

public class App {
	public static void main( String[] args ) {
    	LocalDateTime ldt = LocalDateTime.now();
        System.out.println( "Welcome at: " + ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond());
    }
}
