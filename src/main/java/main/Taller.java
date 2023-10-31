/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller;

/**
 *
 * @author user
 */
//Seccion B
class Usb{
    String tipo;
    public Usb(){}
}

class Celular{
    String nombre;
    
    public String getNombre(){return nombre;}
    public void conectar(Usb usb){}
}

class Adapter implements Pluggable{
    Usb usb;
    public Adapter(Usb usb){this.usb = usb;}
    public void plug(){}
}

interface Pluggable{
    void plug();
}

class TomaCorriente{
    boolean tieneCorriente;
    
    public void enchufar(Pluggable plug){}
}


//Seccion A

class MobileApp{
    private MobileApp mobileApp;
    
    private MobileApp(){
        if (mobileApp == null){mobileApp = new MobileApp();}
    }
    
}

interface AppEscritorio{
    String datosEscritorio();
}

class Adapter_ implements AppEscritorio{
    MobileApp mobileApp;
    public Adapter_(MobileApp app){this.mobileApp = app;}
    @Override
    public String datosEscritorio(){return "";}
}


class Web{
    public void conectarApp(AppEscritorio app){}
}

//Seccion C

class Presidente{
    private Presidente presidente;
    private String name;
    
    Presidente(){
        if (presidente == null){presidente = new Presidente();}
    }
    
    public void makeInstance(){}
}