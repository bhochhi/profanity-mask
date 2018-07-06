package com.bhoya.pm.app.controllers;


import com.bhoya.pm.app.models.ProfanityMask;
import com.bhoya.pm.app.services.ProfaneMaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfanityMaskController {


    @Autowired
    ProfaneMaskService profaneMaskService;

    @RequestMapping(value = "/profanitymask", method = RequestMethod.PUT)
    public ProfanityMask maskProfanity(@RequestBody ProfanityMask pm){
        String masked = profaneMaskService.getMasked(pm.getText(),pm.getWhiteList());
        pm.setMaskedText(masked);
        return pm;
    }
}
