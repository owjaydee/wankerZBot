package com.rvlaguatan.wankerzBot.Listeners;

import com.rvlaguatan.wankerzBot.Ref;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class helloEvent extends ListenerAdapter{
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		// Objects
		User objUser = event.getAuthor();
		MessageChannel objMsgCh = event.getChannel();
		Message objMsg = event.getMessage();
	
		if (objMsg.getContentRaw().equalsIgnoreCase("Hello"+"Hi"+"Hey"+"Suh dude"+"SuhDude"+" :heyguys: ")) {
			objMsgCh.sendMessage(objUser.getAsMention() + "Hey!"+ " :heyguys: ").queue();
	}

}
}