package taller2;

public class main {

    public static void main(String[] args) {

        Oracle myOracle = new Oracle();
        myOracle.conectar();
        myOracle.insertar("elemento1-Oracle");
        myOracle.insertar("elemento2-Oracle");
        myOracle.insertar("elemento3-Oracle");
        myOracle.consultarTodo();
        myOracle.consultar(1);
        myOracle.eliminar(1);
        myOracle.consultar(1);
        myOracle.consultarTodo();
        
        System.out.println("\n");
        
        Postgres myPostgres = new Postgres();
        myPostgres.conectar();
        myPostgres.insertar("elemento1-Postgres");
        myPostgres.insertar("elemento2-Postgres");
        myPostgres.insertar("elemento3-Postgres");
        myPostgres.consultarTodo();
        myPostgres.consultar(1);
        myPostgres.eliminar(1);
        myPostgres.consultar(1);
        myPostgres.consultarTodo();

    }
}
