package com.assignment.camel.service;

import com.assignment.camel.domain.Pain001;
import com.assignment.camel.repository.Pain001Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Pain001Service {

    private final Pain001Repository pain001Repository;

    public Pain001 findPainById(final long id) {
        Pain001 myPain001 = pain001Repository.findPain001ById(id);
        return myPain001;
    }
}
