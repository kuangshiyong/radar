package cc.intelli.radar.service;

import cc.intelli.radar.entity.Radar;
import cc.intelli.radar.entity.builder.RadarBuilder;
import cc.intelli.radar.repository.RadarRepository;
import cc.intelli.radar.utils.ComFuncs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guaguagua-mac
 */

@Service
public class RadarServiceImpl implements RadarService {


    private final RadarRepository radarRepository;

    @Autowired
    public RadarServiceImpl(RadarRepository radarRepository) {
        this.radarRepository = radarRepository;
    }

    public void importData() {
        importRadarData();
    }

    @Override
    public void importRadarData() {
        String file = "./src/main/resources/static/datasource/RadarInfo_full.txt";
        String content = ComFuncs.readFile(file);
        String[] line = content.split("\r\n");
        List<Radar> radarList = new ArrayList<>();
        for (String l : line) {
            ComFuncs.printLog(getClass(), "line: " + l);
            String[] w = l.split("[ ,]");
            Radar radar = new RadarBuilder()
                    .setSid(Integer.valueOf(w[0]))
                    .setLongitude(Double.valueOf(w[3]))
                    .setLatitude(Double.valueOf(w[5]))
                    .setHeight(Double.valueOf(w[7]))
                    .build();
            radarList.add(radar);
        }
        radarRepository.saveAll(radarList);
    }
}
