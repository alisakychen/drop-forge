package com.celnoda.dropforge.dao;

import java.util.List;

import com.celnoda.dropforge.model.PlayerCharacter;

public interface PlayerCharacterDAO {
	public List<PlayerCharacter> getPlayerCharacters();
	public PlayerCharacter createPlayerCharacter(PlayerCharacter character);
}
