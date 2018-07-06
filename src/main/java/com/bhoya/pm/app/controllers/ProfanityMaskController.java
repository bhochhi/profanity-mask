package com.bhoya.pm.app.controllers;


import com.bhoya.pm.app.models.ProfanityMask;
import com.bhoya.pm.app.services.ProfaneMaskService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value="profanitymask", description="Masks the profane found in input text excluding one in the whiltelist")
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
