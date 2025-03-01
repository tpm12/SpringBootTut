package dev.tpm.SpringbootTut.repo;

import dev.tpm.SpringbootTut.models.Location;
import dev.tpm.SpringbootTut.models.Run;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    public List<Run> findAll(){
        return runs;
    }

    public Run findById(int id){
        return runs.stream().filter(run -> run.getId() == id).findFirst().orElse(null);
    }

    @PostConstruct //hardcoded for testing
    private void init(){
        runs.add(new Run(1,
                "Monday Morning run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(60),
                2,
                Location.OUTSIDE
        ));
        runs.add(new Run(2,
                "Tuesday Noon run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(60),
                4,
                Location.INSIDE
        ));
    }

}
