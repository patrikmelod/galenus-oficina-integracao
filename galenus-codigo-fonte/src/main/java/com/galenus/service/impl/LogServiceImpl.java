package com.galenus.service.impl;

import com.galenus.model.Log;
import com.galenus.repository.LogRepository;
import com.galenus.service.LogService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LogService")
@Transactional
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository logRepository;

    @Override
    public void save(Log log) {
        this.logRepository.save(log);
    }
}
