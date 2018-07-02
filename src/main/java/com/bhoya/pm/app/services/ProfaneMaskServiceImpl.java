package com.bhoya.pm.app.services;

import com.bhoya.pm.app.dao.ProfanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfaneMaskServiceImpl implements ProfaneMaskService {


    @Autowired
    ProfanceDao profanceDao;



    @Override
    public String getMasked(String proText, List<String> whitelist) {
        List<String> masterList = profanceDao.getAllProfances();
        List<String> proList = Arrays.asList(proText.split(" "));
        List<String> matchedList = proList.stream().filter(word -> masterList.contains(word)).collect(Collectors.toList());
        return matchedList.stream().reduce(proText, (w1,w2) -> w1.replaceAll(w2, "****")); //TODO: whitelist pending
//        return proText;
    }
}
