package Events;


import com.rvlaguatan.wankerzBot.Commands.CommandList;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String messageSent = event.getMessage().getContentRaw();
		if(messageSent.equalsIgnoreCase("Hey")){	
			event.getChannel().sendMessage("Well hello there "+event.getMessage().getAuthor().getAsMention()).queue();
		}else if (messageSent.equalsIgnoreCase("Hi")) {
			event.getChannel().sendMessage("Ich grüße Sie, Meister "+event.getMessage().getAuthor().getAsMention()).queue();
			
			
		}else if (messageSent.equalsIgnoreCase("hello")) {
			event.getChannel().sendMessage("Was geht ab ? "+event.getMessage().getAuthor().getAsMention()).queue();
			
		}else if (messageSent.equalsIgnoreCase("meddl")) {
			event.getChannel().sendMessage("Doppelmeddl "+event.getMessage().getAuthor().getAsMention()).queue();
			
		}else if (messageSent.equalsIgnoreCase("suh dude")) {
			event.getChannel().sendMessage("suhhh dude "+event.getMessage().getAuthor().getAsMention()).queue();
			
		}else if (messageSent.contains(event.getGuild().getEmotesByName(":heyguys:", true).toString())) {
			event.getChannel().addReaction("🏳️‍🌈");
		}else if (messageSent.contains("heyguys")) {
			event.getChannel().addReactionById(event.getMessageId(), ":heyguys:").queue();;
			
			
		System.out.println(event.getGuild().getEmotes());
		
		
	}
}
}



