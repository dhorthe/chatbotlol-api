package me.dhorthe.sdw2024;

import me.dhorthe.sdw2024.application.AskChampionUseCase;
import me.dhorthe.sdw2024.application.ListChampionUseCase;
import me.dhorthe.sdw2024.model.repository.ChampionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderDevWeek2024Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2024Application.class, args);
	}

	@Bean
	public ListChampionUseCase provideListChampionUseCase(ChampionRepository repository) {
		return new ListChampionUseCase(repository);
	}

	@Bean
	public AskChampionUseCase provideAskChampionUseCase(ChampionRepository repository) {
		return new AskChampionUseCase(repository);
	}
}
