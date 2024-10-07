public  class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Csatlakozás az " + networkName+"-ra");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Lecsatlakozás");
    }
}
