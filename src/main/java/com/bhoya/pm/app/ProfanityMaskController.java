package com.bhoya.pm.app;


import org.springframework.web.bind.annotation.*;

@RestController
public class ProfanityMaskController {


    @RequestMapping(value = "/profanitymask", method = RequestMethod.POST)
    public ProfanityMask maskProfanity(@RequestBody ProfanityMask pm){
        pm.setMaskedText(pm.getText()+" Masked");
        return pm;
    }
}
