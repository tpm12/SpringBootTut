package dev.tpm.SpringbootTut.models;

import java.time.LocalDateTime;

public class Run {
    private Integer Id;
    private String title;
    private LocalDateTime started;
    private LocalDateTime finished;
    private Integer kilometer;
    private Location location;

    public Run(Integer Id, String title, LocalDateTime started, LocalDateTime finished, Integer kilometer, Location location) {
        this.Id = Id;
        this.title = title;
        this.started = started;
        this.finished = finished;
        this.kilometer = kilometer;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getKilometer() {
        return kilometer;
    }

    public void setKilometer(Integer kilometer) {
        this.kilometer = kilometer;
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public void setStarted(LocalDateTime started) {
        this.started = started;
    }

    public LocalDateTime getFinished() {
        return finished;
    }

    public void setFinished(LocalDateTime finished) {
        this.finished = finished;
    }
}
