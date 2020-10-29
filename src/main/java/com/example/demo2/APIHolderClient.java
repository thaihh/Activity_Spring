package com.example.demo2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "api-proxy", url = "https://5f982d6042706e0016958160.mockapi.io/api/v1/")
public interface APIHolderClient {

    @RequestMapping(method = RequestMethod.POST, value = "/getUrl", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getAccount(@RequestBody DemoEntity accountName);

}