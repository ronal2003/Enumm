public class Main {

    public static void main(String[] args) {

        Persona personita1 = new Persona();
        personita1.setNombre("julian");
        personita1.setEdad(32);
        personita1.setGenero(Genero.INDEFINIFO);
        personita1.setTelefono("3211234567");
        personita1.setEstadoCivil(EstadoCivil.CASADO);

        Persona personita2 = new Persona();
        personita2.setNombre("juliana");
        personita2.setTelefono("3113214567");
        personita2.setEdad(18);
        personita2.setGenero(Genero.FEMENINO);
        personita2.setEstadoCivil(EstadoCivil.SOLTERO);

        ingresaeAFiesta(personita1);
        ingresaeAFiesta(personita2);
    }

    private static void ingresaeAFiesta(Persona persona) {
        if (persona.getEdad() >= 18 && persona.getEstadoCivil() == EstadoCivil.SOLTERO) {
            System.out.println("Puede Ingrear a la fiesta " + persona.getNombre());
            calcularPrecioIngreso(persona);

        } else {
            System.out.println("Cuando hayas cumplido 18 o hayas terminado con la toxica puedes volver " + persona.getNombre());
        }

    }

    private static void calcularPrecioIngreso(Persona persona) {
        // Los principios solid -> single
        int valorApagar = 0;
        switch (persona.getGenero()){

            case FEMENINO:
                valorApagar = 7000;
                break;
            case MASCULINO:
                valorApagar = 10000;
                break;
            case INDEFINIFO:
                valorApagar = 8000;
                break;
            default:
    }
        System.out.println("El valor a pagar es " + valorApagar);

    }
}
