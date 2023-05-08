
package tablahash_aritmod;


public class Tabla {
    
   Alumno[] alumnos;

    public Tabla() {
        this.alumnos = new Alumno[503];
    }

   
   public int aMod (int clave){
       
       return clave%503;
       
   }
    
   public void insertar (Alumno alu){
       
       alumnos[aMod(alu.id)] = alu;
       
   }
    
}
