package me.dhorthe.sdw2024.domain.model.exception;

public class ChampionNotFoundException extends RuntimeException {

    public ChampionNotFoundException(Long championId) {
        super("Champion %d não foi encontrado!".formatted(championId));
    }
}
