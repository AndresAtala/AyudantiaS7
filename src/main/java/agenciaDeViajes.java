import java.util.ArrayList;
import java.util.List;

public class agenciaDeViajes {
    private List<agenteDeViajes> agentes;
    private List<cliente> clientes;

    public agenciaDeViajes() {
        this.agentes = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarAgente(agenteDeViajes agente) {
        agentes.add(agente);
    }

    public void agregarCliente(cliente cliente) {
        clientes.add(cliente);
    }

    public int obtenerCantidadClientes() {
        return clientes.size();
    }

    public int obtenerCantidadAgentes() {
        return agentes.size();
    }

    public static void main(String[] args) {
        agenteDeViajes agente1 = new agenteDeViajes("Juan", "Vaciones para familia", 3);
        cliente cliente1 = new cliente("María", "Ex linea ferrea sin numero", 19);

        agenciaDeViajes agencia = new agenciaDeViajes();
        agencia.agregarAgente(agente1);
        agencia.agregarCliente(cliente1);
        agencia.obtenerCantidadClientes();
        agencia.obtenerCantidadAgentes();

        int cantidadClientes = agencia.obtenerCantidadClientes();
        int cantidadAgentes = agencia.obtenerCantidadAgentes();
        System.out.println(cantidadAgentes);
        System.out.println(cantidadClientes);

    }
}
