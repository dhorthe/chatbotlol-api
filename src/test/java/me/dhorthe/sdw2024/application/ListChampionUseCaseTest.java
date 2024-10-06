package me.dhorthe.sdw2024.application;

import me.dhorthe.sdw2024.domain.model.Champion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

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
    public void testFindChampionById() {
        Optional<Champion> champion = listChampionUseCase.findById(1L);

        Assertions.assertNotNull(champion);
    }
}
