package com.beans;
import java.util.*;


public class TeamBean {
	String name;
	List <PlayerBean> players;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PlayerBean> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerBean> players) {
		this.players = players;
	}



}
