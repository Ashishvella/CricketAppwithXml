package com.beans;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/beans/context.xml");
	TeamBean bean =context.getBean(TeamBean.class);
	System.out.println(bean.getName());
	PlayerBean pbean=context.getBean("dhoni",PlayerBean.class);
	System.out.println("Player Name is: "+pbean.getPlayerName());
	System.out.println("His Team:"+pbean.getTeamName());
	System.out.println("Runs scored:"+pbean.getRuns());
	PlayerBean p2bean=context.getBean("virat",PlayerBean.class);
	System.out.println("Player Name is: "+p2bean.getPlayerName());
	System.out.println("His Team:"+p2bean.getTeamName());
	System.out.println("Runs scored:"+p2bean.getRuns());
	
	List<PlayerBean> playerList=context.getBean("India",TeamBean.class).getPlayers();
	Iterator <PlayerBean> players=playerList.iterator();
	System.out.println("___List of Players in PlayerBean____");
	while(players.hasNext())
	{
		System.out.println(players.next().getPlayerName());
	}
	
	
	
	
	
	

	}

}
