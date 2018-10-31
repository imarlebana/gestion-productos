package com.cice.gestionproductos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/productos")

public class ProductosResource {

    @RequestMapping(method = RequestMethod.GET)
    public String findAllProducts(){
        String devolucion="No existen productos";
        return devolucion;
    }
}
