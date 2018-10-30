package com.rvlaguatan.wankerzBot.Commands;

import com.rvlaguatan.wankerzBot.Ref;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandsCommand extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent evt) {
		
		// Objects
					User objUser = evt.getAuthor();
					MessageChannel objMsgCh = evt.getChannel();
					Message objMsg = evt.getMessage();
			
	
					if (objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "commands")) {
						objMsgCh.sendMessage(objUser.getAsMention() + (CommandList.getCommandList())).queue();
	}

}
}
