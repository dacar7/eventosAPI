package io.swagger.api;

import io.swagger.model.Concierto;

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

@Api(value = "concierto", description = "the concierto API")
public interface ConciertoApi {

    @ApiOperation(value = "agrega un concierto", notes = "Agrega un concierto a la colleccion", response = Void.class, tags={ "administradores","desarrolladores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "concierto creado", response = Void.class),
        @ApiResponse(code = 400, message = "valor de entrada invalido", response = Void.class),
        @ApiResponse(code = 409, message = "ya existe un item con este id", response = Void.class) })
    @RequestMapping(value = "/concierto/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> agregarConcierto(@ApiParam(value = "el concierto a adicionar al inventrio"  ) @RequestBody Concierto concierto);


    @ApiOperation(value = "busca conciertos", notes = "con los parametros adecuados busca un concierto ", response = Concierto.class, responseContainer = "List", tags={ "desarrolladores","invitados", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "resultados de la busqueda", response = Concierto.class),
        @ApiResponse(code = 400, message = "parametro de entrada erroneo", response = Concierto.class) })
    @RequestMapping(value = "/concierto/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Concierto>> buscarConcierto(@ApiParam(value = "ingrese el id que desea buscar",required=true ) @PathVariable("id") String id);

}
