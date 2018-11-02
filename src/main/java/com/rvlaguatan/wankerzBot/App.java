package com.rvlaguatan.wankerzBot;

import com.rvlaguatan.wankerzBot.Commands.CommandsCommand;
import com.rvlaguatan.wankerzBot.Commands.PingCommand;
import com.rvlaguatan.wankerzBot.Listeners.ReadyListener;
import com.rvlaguatan.wankerzBot.Listeners.Users;

import Events.HelloEvent;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.events.message.MessageDeleteEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class App extends ListenerAdapter {
	public static void main(String[] args) throws Exception {
		
		JDA jda = new JDABuilder(Config.getToken()).build();
		jda.addEventListener(new App());
		jda.addEventListener(new FirstUserJoinListener());
		jda.addEventListener(new PingCommand());
		jda.addEventListener(new CommandsCommand());
		jda.addEventListener(new ReadyListener());
		jda.addEventListener(new Users());
		jda.addEventListener(new HelloEvent());
		
	}

	
	}



