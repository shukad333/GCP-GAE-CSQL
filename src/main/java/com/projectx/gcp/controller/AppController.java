package com.projectx.gcp.controller;

import com.projectx.gcp.model.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/health")
    public ResponseEntity<Status> health() {
        Status status = new Status();
        status.setStatus("Success");

        return new ResponseEntity<Status>(status, HttpStatus.OK);
    }



}
