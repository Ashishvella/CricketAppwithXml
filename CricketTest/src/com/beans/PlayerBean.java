package com.beans;

import java.util.HashMap;
import java.util.Map;

public class PlayerBean {
 String playerName;
 String TeamName;
 Map <String,Integer> Runs;
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getTeamName() {
	return TeamName;
}
public void setTeamName(String teamName) {
	TeamName = teamName;
}
public Map<String, Integer> getRuns() {
	return Runs;
}
public void setRuns(HashMap<String, Integer> runs) {
	Runs = runs;
}

}
