package com.ironhack.charactermodelservice.controller;

import com.ironhack.charactermodelservice.dto.CharacterDTO;
import com.ironhack.charactermodelservice.dto.NewCharacterDTO;

import java.util.List;

public class CharacterControllerImpl implements CharacterController {
    @Override
    public List<CharacterDTO> getAllCharacters() {
        return null;
    }

    @Override
    public CharacterDTO getCharacterById(Long id) {
        return null;
    }

    @Override
    public List<CharacterDTO> getCharactersByUserUsernameActive(String username) {
        return null;
    }

    @Override
    public List<CharacterDTO> getCharactersByUserUsernameGraveyard(String username) {
        return null;
    }

    @Override
    public CharacterDTO createCharacter(NewCharacterDTO newCharacterDTO) {
        return null;
    }

    @Override
    public CharacterDTO updateCharacter(CharacterDTO updateCharacterDTO) {
        return null;
    }

    @Override
    public void deleteCharacterById(Long id) {

    }
}
