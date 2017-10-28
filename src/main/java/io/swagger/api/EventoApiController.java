package io.swagger.api;

import io.swagger.model.Concierto;
import io.swagger.model.Evento;

import io.swagger.annotations.*;

import io.swagger.model.Utiles;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:35:58.392Z")

@Controller
public class EventoApiController implements EventoApi {

    public ResponseEntity<Void> agregarEvento(@ApiParam(value = "el evento a adicionar al inventrio") @RequestBody Evento evento) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Evento>> buscarEvento(@ApiParam(value = "ingrese el id que desea buscar") @RequestParam(value = "id", required = false) String id) {
        Utiles u = new Utiles();
        List<Evento> listaEventos = u.eventosDummy();

        for (Evento evento : listaEventos) {
            Link selfLink = linkTo(methodOn(EventoApiController.class).buscarEvento(evento.getEventoId())).withSelfRel();
            evento.add(selfLink);

            for(Concierto concierto: evento.getConcierto()){
                Link selfLinkC = linkTo(methodOn(ConciertoApiController.class).buscarConcierto(concierto.getConciertoId())).withSelfRel();
                concierto.add(selfLinkC);
            }
        }

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<List<Evento>>(listaEventos, responseHeaders, HttpStatus.OK);
    }

}
