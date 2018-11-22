package com.gerasimchuk.pqademo.repositories;

import com.gerasimchuk.pqademo.entities.ExtDataChangeProtV;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path = "data", collectionResourceRel = "data" )
public interface ExtDataChangeProtVRepository extends CrudRepository<ExtDataChangeProtV,Integer> {
    List<ExtDataChangeProtV> findByTimerName(@Param("timer") String timerName);
}
