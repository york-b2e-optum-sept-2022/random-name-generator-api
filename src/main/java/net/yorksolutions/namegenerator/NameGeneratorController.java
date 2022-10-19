package net.yorksolutions.namegenerator;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class NameGeneratorController {

    private NameGeneratorService nameGeneratorService;

    public NameGeneratorController(NameGeneratorService nameGeneratorService) {
        this.nameGeneratorService = nameGeneratorService;
    }

    @GetMapping("/generate")
    public String generateName() {
        return this.nameGeneratorService.generate();
    }

    @GetMapping("/test")
    public HashMap test() {
        return this.nameGeneratorService.test();
    }

}
