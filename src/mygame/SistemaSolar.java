/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.input.ChaseCamera;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.Trigger;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;

/**
 *
 * @author Eloy
 */
public class SistemaSolar extends SimpleApplication{
    
    public Spatial Pibote;
    public Spatial CamaraTierra;
    public Spatial CamaraLuna;
    
    public Spatial OrbitaMercurio;
    public Spatial RotacionMercurio;
    
    public Spatial OrbitaVenus;
    public Spatial RotacionVenus;
    
    public Spatial OrbitaTerrestre;
    public Spatial RotacionTerrestre;
    
    public Spatial OrbitaLunar;
    public Spatial RotacionLunar;
    
    public Spatial OrbitaMarte;
    public Spatial RotacionMarte;
    
    public Spatial OrbitaJupiter;
    public Spatial RotacionJupiter;
    
    public Spatial OrbitaSaturno;
    public Spatial RotacionSaturno;
    
    public Spatial OrbitaUrano;
    public Spatial RotacionUrano;
    
    public Spatial OrbitaNeptuno;
    public Spatial RotacionNeptuno;
    
    private final static Trigger TRIGGER_CAMARA = new KeyTrigger(KeyInput.KEY_T);
    private final static String MAPPING_FOCUS = "Camara Tierra";
    
    private final static Trigger TRIGGER_MAIN_CAMARA = new KeyTrigger(KeyInput.KEY_SPACE);
    private final static String MAPPING_SPACE = "Camara Sistema Solar";
    
    public static void main(String[] args){
        AppSettings settings = new AppSettings(true);
        settings.setFrameRate(30);
        settings.setSettingsDialogImage("Interface/sistema-solar.jpg");
        settings.setResolution(720, 480);
        settings.setVSync(true);
        settings.setFullscreen(true);
        SistemaSolar app = new SistemaSolar();
        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp(){
        
        inputManager.addMapping(MAPPING_FOCUS, TRIGGER_CAMARA);
        inputManager.addListener(actionListener, new String[]{MAPPING_FOCUS});
        
        inputManager.addMapping(MAPPING_SPACE, TRIGGER_MAIN_CAMARA);
        inputManager.addListener(actionListener, new String[]{MAPPING_SPACE});
        
        Node puntoRotacionSolar = new Node("PuntoRotacionSolar");
        
        Node baricentroMercurio = new Node("BaricentroMercurio");
        Node puntoRotacionMercurio = new Node("PuntoRotacionMercurio");
        
        Node baricentroVenus = new Node("BaricentroVenus");
        Node puntoRotacionVenus = new Node("PuntoRotacionVenus");
        
        Node baricentroTerrestre = new Node("BaricentroTerrestre");
        Node puntoRotacionTerrestre = new Node("PuntoRotacionTerrestre");
        
        Node baricentroLunar = new Node("BaricentroLunar");
        Node puntoRotacionLunar = new Node("PuntoRotacionLunar");
        
        Node baricentroMarte = new Node("BaricentroMarte");
        Node puntoRotacionMarte = new Node("PuntoRotacionMarte");
        
        Node baricentroJupiter = new Node("BaricentroJupiter");
        Node puntoRotacionJupiter = new Node("PuntoRotacionJupiter");
        
        Node baricentroSaturno = new Node("BaricentroSaturno");
        Node puntoRotacionSaturno = new Node("PuntoRotacionSaturno");
        
        Node baricentroUrano = new Node("BaricentroUrano");
        Node puntoRotacionUrano = new Node("PuntoRotacionUrano");
        
        Node baricentroNeptuno = new Node("BaricentroNeptuno");
        Node puntoRotacionNeptuno = new Node("PuntoRotacionNeptuno");
        
        //Creacion de la geometria del sol
        Sphere sol = new Sphere(150, 150, 20);
        Geometry solGeo = new Geometry("sol", sol);
        solGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de mercurio
        Sphere mercurio = new Sphere(30, 30, 2);
        Geometry mercurioGeo = new Geometry("mercurio", mercurio);
        mercurioGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de venus
        Sphere venus = new Sphere(30, 30, 5);
        Geometry venusGeo = new Geometry("venus", venus);
        venusGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de Marte
        Sphere marte = new Sphere(30, 30, 4);
        Geometry marteGeo = new Geometry("marte", marte);
        marteGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de la tierra
        Sphere tierra = new Sphere(50, 50, 6);
        Geometry tierraGeo = new Geometry("tierra", tierra);
        tierraGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de la luna
        Sphere luna = new Sphere(30, 30, 1);
        Geometry lunaGeo = new Geometry("luna", luna);
        lunaGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de jupiter
        Sphere jupiter = new Sphere(100, 100, 10);
        Geometry jupiterGeo = new Geometry("jupiter", jupiter);
        jupiterGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la geometria de saturno
        Sphere saturno = new Sphere(100, 100, 8);
        Geometry saturnoGeo = new Geometry("saturno", saturno);
        saturnoGeo.rotate(FastMath.HALF_PI*3, 0, 0);
        
        //Creacion de la textura del sol
        Material matSol = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matSol.setTexture("ColorMap", assetManager.loadTexture("Textures/sol.jpg"));
        solGeo.setMaterial(matSol);
        
        //Creacion de la textura de mercurio
        Material  matMercurio = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matMercurio.setTexture("ColorMap", assetManager.loadTexture("Textures/mercurio.jpg"));
        mercurioGeo.setMaterial(matMercurio);
        
        //Creacion de la textura de venus
        Material  matVenus = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matVenus.setTexture("ColorMap", assetManager.loadTexture("Textures/venus.jpg"));
        venusGeo.setMaterial(matVenus);
        
        //Creacion de la textura de venus
        Material  matMarte = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matMarte.setTexture("ColorMap", assetManager.loadTexture("Textures/marte.jpg"));
        marteGeo.setMaterial(matMarte);
        
        //Creacion de la textura de la tierra
        Material matTierra = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matTierra.setTexture("ColorMap", assetManager.loadTexture("Textures/tierra.jpg"));
        tierraGeo.setMaterial(matTierra);
        
        //Creacion de la textura de la luna
        Material  matLuna = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matLuna.setTexture("ColorMap", assetManager.loadTexture("Textures/luna.png"));
        lunaGeo.setMaterial(matLuna);
        
        //Creacion de la textura de jupiter
        Material matJupiter = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matJupiter.setTexture("ColorMap", assetManager.loadTexture("Textures/jupiter.jpg"));
        jupiterGeo.setMaterial(matJupiter);
        
        //Creacion de la textura de jupiter
        Material matSaturno = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matSaturno.setTexture("ColorMap", assetManager.loadTexture("Textures/saturno.jpg"));
        saturnoGeo.setMaterial(matSaturno);
        
        rootNode.attachChild(puntoRotacionSolar);
        puntoRotacionSolar.attachChild(solGeo);
        
        puntoRotacionSolar.attachChild(baricentroMercurio);
        baricentroMercurio.attachChild(puntoRotacionMercurio);
        puntoRotacionMercurio.attachChild(mercurioGeo);
        
        puntoRotacionMercurio.move(30, 0, 0);
        
        puntoRotacionSolar.attachChild(baricentroVenus);
        baricentroVenus.attachChild(puntoRotacionVenus);
        puntoRotacionVenus.attachChild(venusGeo);
        
        puntoRotacionVenus.move(60, 0, 0);
        
        puntoRotacionSolar.attachChild(baricentroMarte);
        baricentroMarte.attachChild(puntoRotacionMarte);
        puntoRotacionMarte.attachChild(marteGeo);
        
        puntoRotacionMarte.move(100, 0, 0);
        
        puntoRotacionSolar.attachChild(baricentroTerrestre);
        baricentroTerrestre.attachChild(puntoRotacionTerrestre);
        puntoRotacionTerrestre.attachChild(tierraGeo);
        
        puntoRotacionTerrestre.move(80, 0, 0);
        
        puntoRotacionTerrestre.attachChild(baricentroLunar);
        baricentroLunar.attachChild(puntoRotacionLunar);
        puntoRotacionLunar.attachChild(lunaGeo);
        
        puntoRotacionLunar.move(12, 0, 0);
        
        puntoRotacionSolar.attachChild(baricentroJupiter);
        baricentroJupiter.attachChild(puntoRotacionJupiter);
        puntoRotacionJupiter.attachChild(jupiterGeo);
        
        puntoRotacionJupiter.move(140, 0, 0);
        
        puntoRotacionSolar.attachChild(baricentroSaturno);
        baricentroSaturno.attachChild(puntoRotacionSaturno);
        puntoRotacionSaturno.attachChild(saturnoGeo);
        
        puntoRotacionSaturno.move(180, 0, 0);
        
        camara();
    }
    @Override
    public void simpleUpdate(float tpf){
       
        float rotaMerc = FastMath.DEG_TO_RAD*0.1f;
        float obrMerc = FastMath.DEG_TO_RAD*0.2f;
        
        float rotaVen = FastMath.DEG_TO_RAD*0.01f;
        float obrVen = FastMath.DEG_TO_RAD*0.3f;
        
        float rotaTier = FastMath.DEG_TO_RAD*0.5f;
        float obrTierra = FastMath.DEG_TO_RAD*0.4f;
        
        float rotaLun = FastMath.DEG_TO_RAD*0.1f;
        float obrLun = FastMath.DEG_TO_RAD*0.2f;
        
        float rotaMar = FastMath.DEG_TO_RAD*0.4f;
        float obrMart = FastMath.DEG_TO_RAD*0.6f;
        
        float rotaJupiter = FastMath.DEG_TO_RAD*0.8f;
        float obrJup = FastMath.DEG_TO_RAD*0.5f;
        
        float rotaSaturno = FastMath.DEG_TO_RAD*0.7f;
        float obrSat = FastMath.DEG_TO_RAD*0.7f;
        
        //Rotación y Traslación de Mercurio
        if(RotacionMercurio==null){
            RotacionMercurio = rootNode.getChild("PuntoRotacionMercurio");
        }
        else{
            RotacionMercurio.rotate(0, rotaMerc, 0);
        }
        if(OrbitaMercurio==null){
            OrbitaMercurio = rootNode.getChild("BaricentroMercurio");
        }
        else{
            OrbitaMercurio.rotate(0, obrMerc, 0);
        }
        
        //Rotación y Traslación de Venus
        if(RotacionVenus==null){
            RotacionVenus = rootNode.getChild("PuntoRotacionVenus");
        }
        else{
            RotacionVenus.rotate(0, rotaVen, 0);
        }
        if(OrbitaVenus==null){
            OrbitaVenus = rootNode.getChild("BaricentroVenus");
        }
        else{
            OrbitaVenus.rotate(0, obrVen, 0);
        }
        
        //Rotación y Traslación de la Tierra
        if(RotacionTerrestre==null){
            RotacionTerrestre = rootNode.getChild("PuntoRotacionTerrestre");
        }
        else{
            RotacionTerrestre.rotate(0,rotaTier,0);
        }
        if(OrbitaTerrestre==null){
            OrbitaTerrestre = rootNode.getChild("BaricentroTerrestre");
        }
        else{
            OrbitaTerrestre.rotate(0, obrTierra, 0);
        }
        
        if(RotacionLunar==null){
            RotacionLunar = rootNode.getChild("PuntoRotacionLunar");
        }
        else{
            RotacionLunar.rotate(0,rotaLun,0);
        }
        
        if(OrbitaLunar==null){
            OrbitaLunar = rootNode.getChild("BaricentroLunar");
        }
        else{
            OrbitaLunar.rotate(0, obrLun, 0);
        }
        
        //Rotación y Traslación de Marte
        if(RotacionMarte==null){
            RotacionMarte = rootNode.getChild("PuntoRotacionMarte");
        }
        else{
            RotacionMarte.rotate(0, rotaMar, 0);
        }
        if(OrbitaMarte==null){
            OrbitaMarte = rootNode.getChild("BaricentroMarte");
        }
        else{
            OrbitaMarte.rotate(0, obrMart, 0);
        }
        
        //Rotación y Traslación de Jupiter
        if(RotacionJupiter==null){
            RotacionJupiter = rootNode.getChild("PuntoRotacionJupiter");
        }
        else{
            RotacionJupiter.rotate(0, rotaJupiter, 0);
        }
        if(OrbitaJupiter==null){
            OrbitaJupiter = rootNode.getChild("BaricentroJupiter");
        }
        else{
            OrbitaJupiter.rotate(0, obrJup, 0);
        }
        
        //Rotación y Traslación de Saturno
        if(RotacionSaturno==null){
            RotacionSaturno = rootNode.getChild("PuntoRotacionSaturno");
        }
        else{
            RotacionSaturno.rotate(0, rotaSaturno, 0);
        }
        if(OrbitaSaturno==null){
            OrbitaSaturno = rootNode.getChild("BaricentroSaturno");
        }
        else{
            OrbitaSaturno.rotate(0, obrSat, 0);
        }
    }
    
    public void camara(){
        flyCam.setEnabled(false);
        Pibote = rootNode.getChild("PuntoRotacionSolar");
        ChaseCamera camara = new ChaseCamera(cam, Pibote, inputManager);
        camara.setDefaultDistance(300);
    }
    
    public void camaraLuna(){
        flyCam.setEnabled(false);
        CamaraLuna = rootNode.getChild("PuntoRotacionLunar");
        ChaseCamera camara = new ChaseCamera(cam, CamaraLuna, inputManager);
        camara.setDefaultDistance(4);
    }
    
    public void camaraTierra(){
        flyCam.setEnabled(false);
        CamaraTierra = rootNode.getChild("PuntoRotacionTerrestre");
        ChaseCamera camara = new ChaseCamera(cam, CamaraTierra, inputManager);
        camara.setDefaultDistance(20);
    }
    
    private final ActionListener actionListener = new ActionListener() {
        @Override
        public void onAction(String name, boolean isPressed, float tpf) {
            System.out.println("you triggered : " + name);
            if(name.equals(MAPPING_FOCUS) && isPressed){
                camaraTierra();
            }
            if(name.equals(MAPPING_SPACE) && isPressed){
                camaraLuna();
            }
        }
    };
}
