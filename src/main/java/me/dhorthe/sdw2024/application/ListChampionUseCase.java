package me.dhorthe.sdw2024.application;

import me.dhorthe.sdw2024.domain.model.Champion;
import me.dhorthe.sdw2024.model.repository.ChampionRepository;

import java.util.List;

public record ListChampionUseCase(ChampionRepository repository) {
    public List<Champion> findAll() {
        return repository.findAll();
    }
}
