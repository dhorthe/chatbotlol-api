package me.dhorthe.sdw2024.adapter.in;

import me.dhorthe.sdw2024.application.ListChampionUseCase;
import me.dhorthe.sdw2024.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record ListChampionRestController(ListChampionUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }
}
