package com.celnoda.dropforge.service;

import java.util.List;

import com.celnoda.dropforge.model.*;

public interface PlayerCharacterManager {
	public List<PlayerCharacter> getPlayerCharacters();
	public PlayerCharacter createPlayerCharacter(PlayerCharacter character);
}