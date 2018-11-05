package com.cice.gestionproductos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/productos")

public class ProductosResource {
    
    @Autowired
    UsuariosFeign usuariosFeign;
    
    @RequestMapping(method = RequestMethod.GET)
    public String findAllProducts(){
        List<UsuarioDTO> usuarios=usuarios.getUsuarios();
        return"No existen productos de la cantidad de usuarios "+ usuarios.size();
        
    }
}
