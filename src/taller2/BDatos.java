package taller2;

import java.util.ArrayList;
import java.util.List;

abstract class BDatos {

    private final List<String> lista = new ArrayList<>();

    public String getLista(int i) {
        return this.lista.get(i);
    }

    public void setLista(String s) {
        this.lista.add(s);
    }

    public void removeLita(int i) {
        this.lista.remove(i);
    }
    
    public List<String> getAll(){
        return this.lista;
    }

}
