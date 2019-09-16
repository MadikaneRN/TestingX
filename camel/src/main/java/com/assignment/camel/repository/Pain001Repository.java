package com.assignment.camel.repository;

import com.assignment.camel.domain.Pain001;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Pain001Repository extends JpaRepository<Pain001, Long> {

    @Query("select re from Pain001 re where re.id like :id")
    Pain001 findPain001ById(@Param("id") long id);



}
