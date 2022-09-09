package taller2;

public class Postgres extends BDatos implements Operaciones {

    static final String CONNECTMSG = "Se ha conecta a la BD de Postgres !!!";
    boolean connect;

    Postgres() {
        connect = false;
    }

    @Override
    public final void conectar() {
        System.out.println(CONNECTMSG);
        connect = true;
    }

    @Override
    public void consultar(int i) {
        try {
            if (connect) {
                System.out.println("Resultado de la conulta del indice " + i + ":");
                System.out.println(getLista(i));
            } else {
                System.out.println("Debe conectarse a la BD de Postgres primero!");
            }
        } catch (Exception e) {
            System.out.println("Error al consultar el elemento");
        }
    }

    @Override
    public void insertar(String s) {
        try {
            if (connect) {
                setLista(s);
            } else {
                System.out.println("Debe conectarse a la BD de Postgres primero!");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el elemento");
        }
    }

    @Override
    public void eliminar(int i) {
        try {
            if (connect) {
                System.out.println("Se elimino el elemento: " + getLista(i));
                removeLita(i);
            } else {
                System.out.println("Debe conectarse a la BD de Postgres primero!");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el elemento");
        }
    }

    @Override
    public void consultarTodo() {
        try {
            if (connect) {
                System.out.println("Resultado de todos los elementos:");
                System.out.println(getAll());
            } else {
                System.out.println("Debe conectarse a la BD de Postgres primero!");
            }
        } catch (Exception e) {
            System.out.println("Error al consultar todos los elementos");
        }
    }
}
