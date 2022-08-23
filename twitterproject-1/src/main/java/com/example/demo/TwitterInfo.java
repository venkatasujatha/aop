package com.example.demo;

import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterInfo {
	
	public static void main(String[] args) throws TwitterException {
		
		ConfigurationBuilder configurationBuilder=new ConfigurationBuilder();
		
		configurationBuilder.setDebugEnabled(true)
		.setOAuthConsumerKey("ymnSmO3J9vsD4u70s7RFFxcxT")
		.setOAuthConsumerSecret("F3VROjzaWUBOVqXsKzybInaPsvcRcZWZa8FYctZYgFsc1jPUY5")
		.setOAuthAccessToken("1559428366583070721-TSB8PmDRQvOM5Nn6tfpqGkMIk23OL8")
		.setOAuthAccessTokenSecret("PBWtcvMrxeEPwFAKs0nmFImz8qYgGIYcG8nkfVqSDZZWG");
		
		TwitterFactory factory=new TwitterFactory(configurationBuilder.build());
		twitter4j.Twitter twitter=factory.getInstance();
		
		List<Status> status=twitter.getHomeTimeline();
		
		
		for (Status s : status) {
			System.out.println(s.getUser().getName()+" "+s.getText());
			
		}
		
		
	}

}
