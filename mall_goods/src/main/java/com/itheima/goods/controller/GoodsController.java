package com.itheima.goods.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {


    //http://127.0.0.1:6002/goods/1
    @GetMapping("/{id}")
    public String info(@PathVariable("id")String id){
        if(StringUtils.isEmpty(id)){
            return "ID参数为空";
        }
        return "find goods info OK";
    }

}
