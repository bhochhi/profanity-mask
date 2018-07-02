package com.bhoya.pm.app.services;

import java.util.List;

public interface ProfaneMaskService {

    String getMasked(String proText, List<String> whitelist);
}
