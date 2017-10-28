package io.swagger.api;

import io.swagger.model.Concierto;

import io.swagger.annotations.*;

import io.swagger.model.Utiles;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:35:58.392Z")

@Controller
public class ConciertoApiController implements ConciertoApi {

    public ResponseEntity<Void> agregarConcierto(@ApiParam(value = "el concierto a adicionar al inventrio"  ) @RequestBody Concierto concierto) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Concierto>> buscarConcierto(@ApiParam(value = "ingrese el id que desea buscar",required=true ) @PathVariable("id") String id) {
        Utiles u = new Utiles();
        Concierto c = u.devolverConcierto(id);
        List<Concierto> conciertos = new ArrayList<Concierto>();
        conciertos.add(c);

        return new ResponseEntity<List<Concierto>>(conciertos,HttpStatus.OK);
    }

}
