package java.mate.academy.spring.controller;

import mate.academy.spring.dto.request.MovieRequestDto;
import mate.academy.spring.dto.response.MovieResponseDto;
import mate.academy.spring.model.Movie;
import mate.academy.spring.service.MovieService;
import mate.academy.spring.service.mapper.RequestDtoMapper;
import mate.academy.spring.service.mapper.ResponseDtoMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;
    private final RequestDtoMapper<MovieRequestDto, Movie> movieRequestDtoMapper;
    private final ResponseDtoMapper<MovieResponseDto, Movie> movieResponseDtoMapper;

    public MovieController(MovieService movieService,
            RequestDtoMapper<MovieRequestDto, Movie> movieRequestDtoMapper,
            ResponseDtoMapper<MovieResponseDto, Movie> movieResponseDtoMapper) {
        this.movieService = movieService;
        this.movieRequestDtoMapper = movieRequestDtoMapper;
        this.movieResponseDtoMapper = movieResponseDtoMapper;
    }

    @PostMapping
    public MovieResponseDto add(@RequestBody @Valid MovieRequestDto requestDto) {
        Movie movie = movieService.add(movieRequestDtoMapper.mapToModel(requestDto));
        return movieResponseDtoMapper.mapToDto(movie);
    }

    @GetMapping
    public List<MovieResponseDto> getAll() {
        return movieService.getAll()
                .stream()
                .map(movieResponseDtoMapper::mapToDto)
                .toList();
    }
}
