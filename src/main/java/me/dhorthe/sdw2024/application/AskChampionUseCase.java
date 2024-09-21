package me.dhorthe.sdw2024.application;

import me.dhorthe.sdw2024.domain.model.Champion;
import me.dhorthe.sdw2024.domain.model.exception.ChampionNotFoundException;
import me.dhorthe.sdw2024.model.repository.ChampionRepository;

import java.util.List;

public record AskChampionUseCase(ChampionRepository repository) {
    public String askChampion(Long championId, String question) {
        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContext = champion.generateContextByQuestion(question);

        //A fazer conexão com IA

        return championContext;
    }
}
