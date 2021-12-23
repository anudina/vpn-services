package com.anudina.org.siteservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VPNController {
    Logger logger = LoggerFactory.getLogger(VPNController.class);
    @RequestMapping("/getVPN")
    public String getSite(){
        logger.info("getVPN() Called");
        return "VPN1";
    }
}

