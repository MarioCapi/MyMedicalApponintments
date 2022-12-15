public class Doctor {
    static int id = 0;
    String name;
    String speciality;
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        ++id;
    }
    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }
    // Comportamientos
    public void showName() {
        System.out.println(this.name);
    }
    public void showID() {
        System.out.println("Id Doctor: " + id);
    }
}
