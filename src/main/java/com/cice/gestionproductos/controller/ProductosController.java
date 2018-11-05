package com.cice.gestionproductos.controller;

import com.cice.gestionproductos.dto.Response;
import com.cice.gestionproductos.dto.UserDto;
import com.cice.gestionproductos.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/productos")
public class ProductosController {
    
    @Autowired private UserFeign userFeign;
    
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Response findAllProducts(){
        return userFeign.getUsuarios();
        
    }
}
