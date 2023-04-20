package com.vinay.hr;

public class UserData 
{
	static int hr_id;
	static int job_id;
	static int c_id;

	public static int getC_id() {
		return c_id;
	}

	public static void setC_id(int c_id) {
		UserData.c_id = c_id;
	}

	public static int getJob_id() {
		return job_id;
	}

	public static void setJob_id(int job_id) {
		UserData.job_id = job_id;
	}

	public static int getHr_id() {
		return hr_id;
	}

	public static void setHr_id(int hr_id) {
		UserData.hr_id = hr_id;
	}

}
