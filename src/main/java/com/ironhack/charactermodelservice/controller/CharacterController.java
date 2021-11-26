package com.ironhack.charactermodelservice.controller;

import com.ironhack.charactermodelservice.dto.CharacterDTO;
import com.ironhack.charactermodelservice.dto.NewCharacterDTO;

import java.util.List;

public interface CharacterController {

    List<CharacterDTO> getAllCharacters();

    CharacterDTO getCharacterById(Long id);

    List<CharacterDTO> getCharactersByUserUsernameActive(String username);

    List<CharacterDTO> getCharactersByUserUsernameGraveyard(String username);

    CharacterDTO createCharacter(NewCharacterDTO newCharacterDTO);

    CharacterDTO updateCharacter(CharacterDTO updateCharacterDTO);

    void deleteCharacterById(Long id);

}
