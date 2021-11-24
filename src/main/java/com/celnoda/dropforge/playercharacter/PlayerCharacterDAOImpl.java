package com.celnoda.dropforge.playercharacter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

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
}
