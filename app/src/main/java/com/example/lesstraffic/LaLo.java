package com.example.lesstraffic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LaLo {

    private String id;
    private double latitud;
    private double longitud;
    private int hora,min,seg;
    private int horaF,minF,segF;
    private int segEstado;
    public int segFinal;
    public Object puntoSiguiente;


    public LaLo(double la, double lo){
        latitud = la;
        longitud = lo;
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String [] horas = hourFormat.format(date).split(":");
        hora = Integer.parseInt(horas[0]);
        min = Integer.parseInt(horas[1]);
        seg = Integer.parseInt(horas[2]);
        id = "a" + latitud + "o" + longitud;
    }

    public String getId() {
        return id;
    }
}
