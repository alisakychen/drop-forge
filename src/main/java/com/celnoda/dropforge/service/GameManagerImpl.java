package com.celnoda.dropforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celnoda.dropforge.dao.*;
import com.celnoda.dropforge.model.*;

@Service
public class GameManagerImpl implements GameManager {
	
	@Autowired
	GameDAO gameDAO;
		
	@Override
	public List<Game> getGames() {
		return gameDAO.getGames();
	}
}
