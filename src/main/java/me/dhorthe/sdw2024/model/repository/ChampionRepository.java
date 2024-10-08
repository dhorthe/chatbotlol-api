package me.dhorthe.sdw2024.model.repository;

import me.dhorthe.sdw2024.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionRepository {
    List<Champion> findAll();
    Optional<Champion> findById(Long id);
}
