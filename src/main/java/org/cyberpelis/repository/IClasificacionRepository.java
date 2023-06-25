package org.cyberpelis.repository;

import org.cyberpelis.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClasificacionRepository extends JpaRepository<Clasificacion, Integer>{

}
