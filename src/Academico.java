public class Academico extends Persona {
    private String paper;

    public Academico(String nombre, String ocupacion, int edad, String paper) {
        super.nombre = nombre;
        super.ocupacion = ocupacion;
        super.edad = edad;
        this.paper = paper;
    }

    public void comer() { System.out.println("Rica comida casera"); }

    public void dormir() { System.out.println("ZzzZzzZ"); }

    public String hacerLoSuyo() { return "Aprender a ocupar zoom"; }

    public String publicarPaper() { return paper; }

}
