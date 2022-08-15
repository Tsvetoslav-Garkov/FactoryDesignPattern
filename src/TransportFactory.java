public class TransportFactory {
    public Transport getTransport(String transportType) {
        Transport transport;
        switch (transportType) {
            case "Truck":
                transport = new Truck();
                break;
            case "Ship":
                transport = new Ship();
                break;
            case "Airplane":
                transport = new Airplane();
                break;
            default:
                transport = new DefaultTransport();
        }

        return transport;
    }
}
