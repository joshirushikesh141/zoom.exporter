package zoom.exporter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zoom.exporter.entity.Exporter;

@Repository
public interface ExporterRepository extends JpaRepository<Exporter, Integer>{

}
