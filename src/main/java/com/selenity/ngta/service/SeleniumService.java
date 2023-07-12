package com.selenity.ngta.service;

import org.springframework.stereotype.Service;

@Service
public class SeleniumService {


    public String ilkServisMetodu(){
        String veri = "test";

        String ikinciVeri = "123";

        return veri + ikinciVeri;

    }


    public int ucuncuServisMetodu(){

        int a = 3;

        int b = 5;

        return a * b;

    }

    public String haberler(){
       return "2";

    }

}
