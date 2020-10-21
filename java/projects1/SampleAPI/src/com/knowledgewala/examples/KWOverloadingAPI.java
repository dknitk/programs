package com.knowledgewala.examples;

public class KWOverloadingAPI {
	
	public static void main(String[] args) {
		System.out.println("Overloading Example");
		KWOverloadingAPI kwOverloadingAPI = new KWOverloadingAPI();
		kwOverloadingAPI.watchOverloadingVideo(10);
	}
	
	public void watchOverloadingVideo(String user) {
		System.out.println("Video watched by:"+user);
	}
	public void watchOverloadingVideo(Integer num) {
		System.out.println("Video watched Views:"+num);
	}

}
