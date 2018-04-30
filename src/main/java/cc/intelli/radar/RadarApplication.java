package cc.intelli.radar;

import cc.intelli.radar.service.MainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RadarApplication {

    private final MainServiceImpl mainService;

    @Autowired
    public RadarApplication(MainServiceImpl mainService) {
        this.mainService = mainService;
    }

    public static void main(String[] args) {
        SpringApplication.run(RadarApplication.class, args);
    }

    @PostConstruct
    public void init() {
        mainService.importRadarData();
    }
}
