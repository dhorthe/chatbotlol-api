package me.dhorthe.sdw2024.adapter.in;

import lombok.extern.slf4j.Slf4j;
import me.dhorthe.sdw2024.domain.model.exception.ChampionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler
    public ApiError handleDomainException(ChampionNotFoundException domainError) {
        return new ApiError(domainError.getMessage());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ApiError handleDomainException(Exception domainError) {
        log.error("Ocorreu um erro: ", domainError);
        return new ApiError("Ocorreu um erro inesperado!");
    }

    public record ApiError(String message) { }
}
