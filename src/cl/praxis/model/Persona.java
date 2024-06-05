package cl.praxis.model;

public class Persona {
  protected String nombre;
  protected String rut;
  protected boolean presente;

  public Persona() {
  }

  public Persona(String nombre, String rut, boolean presente) {
    this.nombre = nombre;
    this.rut = rut;
    this.presente = presente;
  }

  @Override
  public String toString() {
    return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", rut='" + rut + '\'' +
            ", presente=" + presente +
            '}';
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public boolean isPresente() {
    return presente;
  }

  public void setPresente(boolean presente) {
    this.presente = presente;
  }

}
