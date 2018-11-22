package com.gerasimchuk.pqademo.services.impl;

import com.gerasimchuk.pqademo.entities.ExtDataChangeProtV;
import com.gerasimchuk.pqademo.repositories.ExtDataChangeProtVRepository;
import com.gerasimchuk.pqademo.services.interfaces.ExtDataChangeProtVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtDataChangeProtVServiceImpl implements ExtDataChangeProtVService {

    private ExtDataChangeProtVRepository extDataChangeProtVRepository;

    @Autowired
    public ExtDataChangeProtVServiceImpl(ExtDataChangeProtVRepository extDataChangeProtVRepository) {
        this.extDataChangeProtVRepository = extDataChangeProtVRepository;
    }

    @Override
    public List<? extends ExtDataChangeProtV> getAllRecords() {
        return (List<? extends ExtDataChangeProtV>) extDataChangeProtVRepository.findAll();
    }
}
