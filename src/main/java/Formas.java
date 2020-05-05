//Importamos la libreria proncipal

import processing.core.PApplet;

/**
 * Clase principal que hererda de PApplet
 * (la clase padre que tiene todos los métodos
 * y atributos para usar Processing)
 */
public class Formas extends PApplet {
    //Dimensiones del sketch
    int viewport_w = 1280; // ancho en pixeles
    int viewport_h = 720; // alto en pixeles

    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    //Método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);

    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {


    }


    @Override
    public void draw() {
        // pintamos la ventana según rgb
        // hay muchas paginas que nos dan los colores en rgb
        // esta es una de ellas https://htmlcolorcodes.com/es/
        // prueba a cambiar estos colores

        /*stroke(255,0,0);
        fill(0,0,0);
        if (mousePressed==true)
        rect(mouseY,mouseX,150,100);
        else
        ellipse(mouseX,mouseY,200,200);
        rect(620,200,150,100);*/
        if (mousePressed == false) {
            background(25, 200, 230); //fondo-cielo
            fill(255,255,0);
            ellipse(mouseX,100,200,200); //sol
            fill(0, 255, 0);
            rect(0, 650, 1280, 300); //suelo
            fill(255, 25, 120);
            rect(400, 400, 480, 300); //casa
            fill(188,10,10);
            triangle(325, 400, 630, 150, 965, 400); //tejado
            fill(217,117,24);
            rect(590,500,100,200); //puerta
            ellipse(680,595,10,10); //pomo
            fill(255,255,255);
            rect(450,450,100,100); //ventana izq
            rect(725,450,100,100); //ventana der

        }
        else {
            background(0, 0,0); //fondo-cielo
            fill(238,238,238);
            ellipse(mouseX,100,200,200); //luna
            fill(0, 255, 0);
            rect(0, 650, 1280, 300); //suelo
            fill(255, 25, 120);
            rect(400, 400, 480, 300); //casa
            fill(188,10,10);
            triangle(325, 400, 630, 150, 965, 400); //tejado
            fill(217,117,24);
            rect(590,500,100,200); //puerta
            ellipse(680,595,10,10); //pomo
            fill(255,255,100);
            rect(450,450,100,100); //ventana izq
            rect(725,450,100,100); //ventana der
        }

    }
}