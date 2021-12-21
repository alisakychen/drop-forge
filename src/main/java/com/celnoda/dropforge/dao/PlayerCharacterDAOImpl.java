package com.celnoda.dropforge.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.celnoda.dropforge.model.PlayerCharacter;

@Repository
public class PlayerCharacterDAOImpl implements PlayerCharacterDAO {

	@Override
	public List<PlayerCharacter> getPlayerCharacters() {
		List<PlayerCharacter> characterList = new ArrayList<>();
		
		characterList.add(new PlayerCharacter("Arthur Dushamm"));
		characterList.add(new PlayerCharacter("Baskarmyna"));
		characterList.add(new PlayerCharacter("Eiromandros"));
		characterList.add(new PlayerCharacter("Hesperia, the Keening Moura"));
		characterList.add(new PlayerCharacter("Posarios"));
		
		return characterList;
	}

	@Override
	public PlayerCharacter createPlayerCharacter(PlayerCharacter character) {		
		return character;
	}
}
