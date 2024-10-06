package me.dhorthe.sdw2024.application;

import me.dhorthe.sdw2024.domain.model.Champion;
import me.dhorthe.sdw2024.model.repository.ChampionRepository;

import java.util.List;
import java.util.Optional;

public record ListChampionUseCase(ChampionRepository repository) {
    public List<Champion> findAll() {
        return repository.findAll();
    }
    public Optional<Champion> findById(Long championId) {
        return repository.findById(championId);
    }
}
