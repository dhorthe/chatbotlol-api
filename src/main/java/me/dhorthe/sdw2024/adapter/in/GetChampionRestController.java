package me.dhorthe.sdw2024.adapter.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dhorthe.sdw2024.application.ListChampionUseCase;
import me.dhorthe.sdw2024.domain.model.Champion;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record GetChampionRestController(ListChampionUseCase useCase) {

    @PostMapping("/{championId}")
    public Optional<Champion> findChampionsById(@PathVariable Long championId) {
        return useCase.findById(championId);
    }
}
