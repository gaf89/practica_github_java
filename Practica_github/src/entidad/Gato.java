
package entidad;

public class Gato {
    
    
   private String nombre;
   private String apodo;
   private String raza;
   private Integer edad;
   private Double peso;

    public Gato() {
    }

    public Gato(String nombre, String apodo, String raza, Integer edad, Double peso) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", edad=" + edad + ", peso=" + peso + '}';
    }
   
   
}
