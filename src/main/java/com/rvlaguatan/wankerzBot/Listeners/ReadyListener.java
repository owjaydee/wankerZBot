package com.rvlaguatan.wankerzBot.Listeners;

import java.awt.Color;
import java.io.Serializable;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.exceptions.ErrorResponseException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter implements Serializable {
	 Message msg;
	 

    public void onReady(ReadyEvent evt) {
    	Guild g = (evt.getJDA().getGuilds().get(0));
		 System.out.println("Bot Ready!");
		 
		 EmbedBuilder eb = new EmbedBuilder();
		 eb.setColor(Color.red);
		 eb.setTitle("Welcome to the wankerZ-Community!");
		 eb.setDescription(" \n \n You currently have no Permissions to read or write into Textchannels. \n "
		 		           + "But no worries, you can still join Voicechannels and hope to get at least Pleb some day");
		 eb.setThumbnail("https://i.postimg.cc/zvPTY2gT/5oM9c29.png");
		 eb.setImage("https://i.postimg.cc/zvPTY2gT/5oM9c29.png");
		 eb.setAuthor("wankerZ-Bot");
		//  eb.addField("","Commands I know: \n \n !ping - Bot-Test \n \n !commands - All the current commands available",false);
		 eb.addBlankField(false);
		 
		 
		 
		 
		 //g.getTextChannelById(504609482081566721l).sendMessage(eb.build()).queue();
		 
    }  
    
    
}



