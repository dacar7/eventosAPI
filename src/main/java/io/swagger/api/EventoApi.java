package io.swagger.api;

import io.swagger.model.Evento;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:35:58.392Z")

@Api(value = "evento", description = "the evento API")
public interface EventoApi {

    @ApiOperation(value = "agrega un evento", notes = "Agrega un evento a la colleccion", response = Void.class, tags={ "administradores","desarrolladores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "evento creado", response = Void.class),
        @ApiResponse(code = 400, message = "valor de entrada invalido", response = Void.class),
        @ApiResponse(code = 409, message = "ya existe un item con este id", response = Void.class) })
    @RequestMapping(value = "/evento",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> agregarEvento(@ApiParam(value = "el evento a adicionar al inventrio"  ) @RequestBody Evento evento);


    @ApiOperation(value = "busca eventos", notes = "con los parametros adecuados busca un evento ", response = Evento.class, responseContainer = "List", tags={ "desarrolladores","invitados", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "resultados de la busqueda", response = Evento.class),
        @ApiResponse(code = 400, message = "parametro de entrada erroneo", response = Evento.class) })
    @RequestMapping(value = "/evento",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Evento>> buscarEvento(@ApiParam(value = "ingrese el id que desea buscar") @RequestParam(value = "id", required = false) String id);

}
