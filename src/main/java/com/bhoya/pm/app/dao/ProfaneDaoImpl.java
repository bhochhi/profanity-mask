package com.bhoya.pm.app.dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProfaneDaoImpl implements ProfanceDao {

    @Override
    public List<String> getAllProfances() {
        //TODO: read from file
        String[] profances = {"fuck","ass","dick","pussy"};
        return Arrays.asList(profances);
    }
}
