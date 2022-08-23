package com.example.demo.controller;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitController {
	
	@Autowired
	private Environment env1;
	
	//public static final String TWITTER_BASE_URI="sc/c1/tweets";
	
	@GetMapping(value = "{hashtag}",produces = MediaType.APPLICATION_JSON_VALUE)
	public TwitterTemplate getTweet(@PathVariable String hashtag)
	{
		String appId=env1.getProperty(hashtag+"appid");
		String appSecret=env1.getProperty(hashtag+"appsecret");
		String accessToken=env1.getProperty(hashtag+"accessToken");
		String accessTokenSecret=env1.getProperty(hashtag+"accessTokenSecret");
		
		TwitterTemplate template=new TwitterTemplate(appId,appSecret, accessToken, accessTokenSecret);
		
		return  template;
	}

}
