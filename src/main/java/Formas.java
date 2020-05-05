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
 if (!mousePressed) {
            background(25, 200, 230); //fondo-cielo
            fill(255, 255, 0);

        } else {
            background(0, 0, 0); //fondo-cielo
            fill(238, 238, 238);
        }
        ellipse(mouseX, 100, 150, 150); //sol - luna

        //nubes
        stroke(165, 165, 159);
        fill(165, 165, 159);
        ellipse(440, 50, 120, 50);
        ellipse(460, 50, 120, 60);
        ellipse(500, 50, 120, 70);
        ellipse(530, 50, 120, 60);
        ellipse(550, 50, 120, 50);
        ellipse(430, 70, 120, 50);
        ellipse(450, 70, 120, 60);
        ellipse(530, 70, 120, 70);
        ellipse(570, 70, 120, 60);
        ellipse(590, 70, 120, 50);

        ellipse(940, 70, 120, 50);
        ellipse(960, 70, 120, 60);
        ellipse(1000, 70, 120, 70);
        ellipse(1030, 70, 120, 60);
        ellipse(1050, 70, 120, 50);
        ellipse(930, 90, 120, 50);
        ellipse(950, 90, 120, 60);
        ellipse(1030, 90, 120, 70);
        ellipse(1070, 90, 120, 60);
        ellipse(1090, 90, 120, 50);

        fill(0, 255, 0);
        rect(0, 650, 1280, 300); //suelo
        fill(202, 0, 255);
        rect(400, 400, 480, 300); //casa
        fill(188, 10, 10);
        triangle(325, 400, 630, 150, 965, 400); //tejado
        fill(217, 117, 24);
        rect(590, 500, 100, 200); //puerta
        ellipse(680, 595, 10, 10); //pomo
        if (!mousePressed)
            fill(255, 255, 255);
        else
            fill(255, 255, 55);
        rect(450, 450, 100, 100); //ventana izq
        rect(725, 450, 100, 100); //ventana der

        //perro
        fill(150, 77, 7);
        rect(200, 630, 10, 100); //pata delantera
        rect(300, 630, 10, 100); //pata trasera
        rect(320, 610, 70, 10);  // cola
        ellipse(250, 620, 200, 100); //cuerpo
        ellipse(160, 590, 100, 75); //cabeza
        fill(255, 255, 255);
        //ojos
        ellipse(172, 580, 10, 10);
        ellipse(143, 580, 10, 10);
        fill(0, 0, 0);

        ellipse(160, 610, 10, 10); //boca


        //bandera
        fill(255,255,255);
        rect(1000,650,10,150); //palo

        fill(255,0,0);
        stroke(0,0,0);
        rect(1000,500,240,150); //bandera

        /*stroke(255,255,0);
        rect(1030,525,15,15); //estrella */
        fill(255,255,0);
        ellipse(1040,570,30,30); //circulo

        stroke(255,0,0);
        fill(255,0,0);
        ellipse(1034,564,30,30); //circulo rojo

        stroke(255,255,0);
        fill(255,255,0);
        rect(1032,555,4,12);
        rect(1028,552,11,4);



    }
}