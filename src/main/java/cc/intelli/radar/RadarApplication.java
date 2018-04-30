package cc.intelli.radar;

import cc.intelli.radar.service.RadarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RadarApplication {

    private final
    RadarServiceImpl radarService;

    @Autowired
    public RadarApplication(RadarServiceImpl radarService) {
        this.radarService = radarService;
    }

    public static void main(String[] args) {
        SpringApplication.run(RadarApplication.class, args);
    }

    @PostConstruct
    public void init() {
        radarService.importData();
    }
}
