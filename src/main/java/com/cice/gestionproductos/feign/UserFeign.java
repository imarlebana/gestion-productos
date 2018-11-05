package com.cice.gestionproductos.feign;

import com.cice.gestionproductos.dto.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("gestion-usuarios")
public interface UserFeign {

    @RequestMapping(method = RequestMethod.GET, path="/users")
    Response getUsuarios();

    @RequestMapping(method = RequestMethod.GET, path="/users/{id}")
    Response getAll(@PathVariable Long id);

}
