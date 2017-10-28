package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davicalo on 2017/10/28.
 */
public class Utiles {

  public List<Evento> eventosDummy(){
    List<Evento> ev = new ArrayList<Evento>();

    Evento e1 = new Evento();
    Evento e2 = new Evento();
    Evento e3 = new Evento();

    e1.setEventoId("e1");
    e2.setEventoId("e2");
    e3.setEventoId("e3");
    e1.setNombre("Evento feria");
    e2.setNombre("Evento diciembre");
    e3.setNombre("Evento vacaciones");
    e1.setConcierto(this.conciertoDummy());
    e2.setConcierto(this.conciertoDummy());
    e3.setConcierto(this.conciertoDummy());

    ev.add(e1);
    ev.add(e2);
    ev.add(e3);
    return ev;
  }

  public List<Concierto> conciertoDummy(){
    List<Concierto> conciertos = new ArrayList<Concierto>();

    Concierto c1 = new Concierto();
    Concierto c2 = new Concierto();

    c1.setIdConcierto("c1");
    c2.setIdConcierto("c2");
    c1.setNombre("Concierto bruno mars");
    c2.setNombre("Concierto de vallenato");

    conciertos.add(c1);
    conciertos.add(c2);

    return conciertos;
  }

  public Concierto devolverConcierto(String id) {
    Concierto c = new Concierto();
    c.setNombre("Concierto de salsa");
    c.setIdConcierto("c20");
    return c;
  }
}
