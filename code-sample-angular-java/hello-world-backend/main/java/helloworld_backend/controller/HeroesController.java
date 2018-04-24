package helloworld_backend.controller;

import helloworld_backend.dto.HeroDto;
import helloworld_backend.repository.HeroRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeroesController {

    private HeroRepository heroRepository;

    public HeroesController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @GetMapping("/heroes")
    public List<HeroDto> getAllHeroes() {
        return heroRepository.findAll().stream()
                .map(HeroDto::fromDomain)
                .collect(Collectors.toList());

    }
}
