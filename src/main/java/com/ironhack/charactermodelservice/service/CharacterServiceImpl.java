package com.ironhack.charactermodelservice.service;

import com.ironhack.charactermodelservice.dto.CharacterDTO;
import com.ironhack.charactermodelservice.dto.NewCharacterDTO;
import com.ironhack.charactermodelservice.dto.UpdateCharacterDTO;
import com.ironhack.charactermodelservice.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;

    public List<CharacterDTO> getAllCharacters() {
        return null;
    }

    @Override
    public Optional<CharacterDTO> getCharacterById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CharacterDTO> getAliveCharactersByUserUsername(String username) {
        return null;
    }

    @Override
    public List<CharacterDTO> getDeadCharactersByUserUsername(String username) {
        return null;
    }

    @Override
    public Optional<CharacterDTO> createCharacter(NewCharacterDTO newCharacterDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<CharacterDTO> updateCharacter(UpdateCharacterDTO updateCharacterDTO) {
        return Optional.empty();
    }

    @Override
    public void deleteCharacter(Long id) {

    }

}
