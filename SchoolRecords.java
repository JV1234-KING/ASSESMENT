package com.prodapt.ases;

public class SchoolRecords {
	String schoolname ,SchoolAddress ;
	int SchoolID ;
	
	 String ddRecords()
	{
		return  schoolname+SchoolAddress+SchoolID;
	}
	 void dispRecords()
	 {
		 System.out.println("SCHOOL_NAME:"+schoolname+"\nSCHOOL_ADDRESS:"+SchoolAddress+"\nSCHOOL_ID:"+SchoolID); 
	 }

}
