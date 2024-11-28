package com.PharmaNews.liveNewsUpdates.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsupdatesControlller {
	
	 @GetMapping("/feed")
		public String index()
		{	
			return "feed";
		}
	    

}
