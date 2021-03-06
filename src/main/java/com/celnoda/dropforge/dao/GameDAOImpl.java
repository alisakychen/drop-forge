package com.celnoda.dropforge.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.celnoda.dropforge.model.Game;

@Repository
public class GameDAOImpl implements GameDAO {

	@Override
	public List<Game> getGames() {
		List<Game> gameList = new ArrayList<>();
		
		gameList.add(new Game("Mean Streets, Cruel Towers"));
		gameList.add(new Game("Pandaemonium"));
		gameList.add(new Game("Tabula Rasa"));
		
		return gameList;
	}
}
