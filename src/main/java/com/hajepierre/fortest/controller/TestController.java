/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.fortest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeanpierre
 */
@RestController
public class TestController
{

    @GetMapping(value={"/","/test"})
    public String test()
    {
        return "It is working fine";
    }
}
