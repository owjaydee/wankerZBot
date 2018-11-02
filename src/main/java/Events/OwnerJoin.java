package Events;

import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class OwnerJoin extends ListenerAdapter {
	
	public void ownerJoinEvent (GuildVoiceJoinEvent evt) {
		evt.getGuild().getMemberById(252779773049176065l);
		

}
}