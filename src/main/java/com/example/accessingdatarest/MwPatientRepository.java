package com.example.accessingdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "mwpatient", path = "mwpatient")
public interface MwPatientRepository extends PagingAndSortingRepository<MwPatient, Long>{

    List<MwPatient> findMwPatientsByIdentifierContains(@Param("identifier") String identifier);

    List<MwPatient> findMwPatientsByLastNameContains(@Param("lastName") String lastName);
}
