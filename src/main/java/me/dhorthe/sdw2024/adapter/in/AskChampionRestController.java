package me.dhorthe.sdw2024.adapter.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dhorthe.sdw2024.application.AskChampionUseCase;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampion(
            @PathVariable Long championId,
            @RequestBody AskChampionRequest request) {
        String answer = useCase.askChampion(championId, request.question());
        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question) {}
    public record AskChampionResponse(String answer) {}
}
