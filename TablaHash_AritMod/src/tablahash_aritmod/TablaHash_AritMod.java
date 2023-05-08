package tablahash_aritmod;

public class TablaHash_AritMod {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno(102023,"Mauro");
        Alumno alu2 = new Alumno(112023,"Gabriel");
        Alumno alu3 = new Alumno(122023,"Perez");

        Tabla tHash = new Tabla();
        
        tHash.insertar(alu1);
        tHash.insertar(alu2);
        tHash.insertar(alu3);
        
        System.out.println("");
        System.out.println("Id Alumno: " + alu1.id);
        System.out.println("Nombre: " + alu1.nombre);
        System.out.println("Ocupa el lugar: " + tHash.aMod(alu1.id));
        System.out.println("***********************");
        
        System.out.println("");
        System.out.println("Id Alumno: " + alu2.id);
        System.out.println("Nombre: " + alu2.nombre);
        System.out.println("Ocupa el lugar: " + tHash.aMod(alu2.id));
        System.out.println("***********************");
        
        System.out.println("");
        System.out.println("Id Alumno: " + alu3.id);
        System.out.println("Nombre: " + alu3.nombre);
        System.out.println("Ocupa el lugar: " + tHash.aMod(alu3.id));
        System.out.println("***********************");
        
        System.out.println("");
        
       


    }
    
}
