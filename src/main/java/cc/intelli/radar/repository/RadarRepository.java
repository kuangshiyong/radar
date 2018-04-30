package cc.intelli.radar.repository;

import cc.intelli.radar.entity.Radar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author guaguagua-mac
 */
@Repository
public interface RadarRepository extends CrudRepository<Radar, Long> {

}
