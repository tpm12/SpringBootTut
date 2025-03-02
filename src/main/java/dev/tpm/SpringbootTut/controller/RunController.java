package dev.tpm.SpringbootTut.controller;
import dev.tpm.SpringbootTut.models.Run;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.tpm.SpringbootTut.repo.RunRepository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }

    @GetMapping("")
    List<Run> findAll(){
        return runRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findByID(@PathVariable Integer id){
        Optional<Run> run = Optional.ofNullable(runRepository.findById(id));
        if (run.isPresent()){
            return run.get();
        };
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }




}
