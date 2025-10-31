package FakeDB;

import java.util.ArrayList;

import Dominio.Veterinario;

public class VeterinarioFakeDB extends AbsFakeDB<Veterinario>{

    @Override
    protected void AutoPreencher() {
        if (this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Veterinario(1, "Ana", "111.655.655-88", "ana@uniderp", "11.111.111-1", "CRMV123"));
        this.instancia.add(new Veterinario(2, "Bruno", "222.354.675-87", "bruno@uniderp", "22.222.222-2", "CRMV456"));
        this.instancia.add(new Veterinario(3, "Carla", "333.435.564-76", "carla@uniderp", "33.333.333-3", "CRMV789"));
        this.instancia.add(new Veterinario(4, "Daniel", "444.234.657-78", "daniel@uniderp", "44.444.444-4", "CRMV321"));
    }

    public VeterinarioFakeDB(){
        super();
    }
}
