package com.infosys.ultra.auditors.ultraauditorsauditor.controller;

import com.infosys.ultra.auditors.ultraauditorsauditor.model.HomeTestModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.infosys.ultra.auditors.ultraauditorsauditor.contants.UltraAuditorsAuditorConstants.ULTRA_AUDITOR_ROOT_PATH;

@RequestMapping(ULTRA_AUDITOR_ROOT_PATH)
@RestController
public class HomeController {

    @GetMapping("/test")
    public ResponseEntity<HomeTestModel> homeTest() {

        HomeTestModel homeTestModel = new HomeTestModel();
        homeTestModel.setId(123);
        homeTestModel.setName("Sweet Home");

        return ResponseEntity.ok().body(homeTestModel);
    }
}
