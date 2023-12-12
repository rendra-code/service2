package com.code.rendra.service2.rest.controller;

import com.code.rendra.service2.domain.request.SampleRequestContent;
import com.code.rendra.service2.domain.request.SampleServiceRequest;
import com.code.rendra.service2.domain.response.SampleServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/external/services/rest")
public class SampleServiceController {

  @GetMapping("/sample-service")
  public String service2() {
    return "Hello from sample-service";
  }

  @PostMapping("/sample-service")
  public SampleServiceResponse service2(@RequestBody SampleServiceRequest request){
    SampleServiceResponse response = new SampleServiceResponse();
    response.setError_code("0000");
    response.setError_message("Success");
    response.setTrx_id(request.getSampleservicerq().getTrx_id());
    return response;
  }
}
