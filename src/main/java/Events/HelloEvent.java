package Events;

import com.rvlaguatan.wankerzBot.Ref;
import com.rvlaguatan.wankerzBot.Commands.CommandList;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		//String messageSent = event.getMessage().getContentRaw();
		// Objects
		User objUser = event.getAuthor();
		MessageChannel objMsgCh = event.getChannel();
		Message objMsg = event.getMessage();
		
		if (objMsg.getContentRaw().equalsIgnoreCase("Hey"+"Hi"+"Hello"+"suh dude"+"meddl"+":heyguys:")) {
			objMsgCh.sendMessage(objUser.getAsMention() + ("Well, hello there ! ")).queue();
			
			
		//if(messageSent.equalsIgnoreCase("Hey"+"Hi"+"Hello"+"suh dude"+"meddl"+":heyguys:")) {
			//event.getChannel().sendMessage("Well, hello there ! ").queue();
			//System.out.println("TestHello");
		}
		
	}
}
