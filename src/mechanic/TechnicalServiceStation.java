package mechanic;

import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

import java.util.LinkedList;
import java.util.Queue;

public class TechnicalServiceStation {
    private final String name;

    private Queue<Transport<?>> queue = new LinkedList<>();

    public TechnicalServiceStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addTransportToQueue(Transport<?> transport){
        if (transport instanceof Bus){
            System.out.println("Автобусы не нуждаются в тех обслуживании и в очередь не встают!");
            return;}

        queue.offer(transport);

    }
    public void carryOutInspectionOfTransport(){
        Transport<?> transport=queue.poll();
        if (transport != null) {
            System.out.println("СТО проводит тех осмотр автомобиля "+transport);
            carryOutInspectionOfTransport();
        }else {
            System.out.println("очередь пуста");
        }

    }
}
