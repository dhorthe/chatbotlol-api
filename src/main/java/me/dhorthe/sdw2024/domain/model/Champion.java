package me.dhorthe.sdw2024.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl) {
    public String generateContextByQuestion(String question) {
        return """
                Pergunta: %s
                Nome do Campeão: %s
                Função: %s
                História: %s
                """.formatted(question, this.name, this.role, this.lore);
    }
}
