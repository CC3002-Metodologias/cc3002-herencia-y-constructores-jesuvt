public class Estudiante extends Persona {

    public Estudiante(String nombre, String ocupacion, int edad) {
        super.nombre = nombre;
        super.ocupacion = ocupacion;
        super.edad = edad;
    }

    public void comer() { System.out.println("Completo de falafel no es tan rico en gorbea"); }

    public void dormir() { System.out.println("ZzZzZz"); }

    public String hacerLoSuyo() { return "Ver animé y Netflix todo el día, sin acordarse que hay " +
            "clases online"; }

}
