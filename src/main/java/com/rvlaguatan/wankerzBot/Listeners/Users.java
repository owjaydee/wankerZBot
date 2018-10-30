package com.rvlaguatan.wankerzBot.Listeners;
import java.util.List;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Users extends ListenerAdapter {
	
	
	public static List<Member> getUserIDs(MessageReceivedEvent event){
		
		return event.getGuild().getMembers();
		
		
	}
	public static void outprint() {
		System.out.println("users");
		System.out.println(getUserIDs(null));
		
	}
		
	}


