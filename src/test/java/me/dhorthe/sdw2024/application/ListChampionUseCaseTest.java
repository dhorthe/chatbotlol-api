package me.dhorthe.sdw2024.application;

import me.dhorthe.sdw2024.domain.model.Champion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionUseCaseTest {
    @Autowired
    private ListChampionUseCase listChampionUseCase;

    @Test
    public void testListChampions() {
        List<Champion> champions = listChampionUseCase.findAll();

        Assertions.assertEquals(12, champions.size());
    }

    @Test
    public void testListChampions2() {
        List<Champion> champions = listChampionUseCase.findAll();

        Assertions.assertEquals(11, champions.size());
    }
}
