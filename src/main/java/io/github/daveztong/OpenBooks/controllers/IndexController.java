/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package io.github.daveztong.OpenBooks.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author shantang
 * @version $Id: IndexController.java, v 0.1 2018年02月09日 12:07 shantang Exp $
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/search/{name}")
    public String search(@PathVariable String name) {
        return "search for " + name;
    }

}