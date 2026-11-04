interface Printer { void print(); }
interface Scanner { void scan(); }
class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;
    public void setDetails(String n, int id) { machineName = n; machineId = id; }
    public String getMachineName() { return machineName; }
    public int getMachineId() { return machineId; }
    public void print() { System.out.println("Printing document"); }
    public void scan() { System.out.println("Scanning document"); }
}
public class MachineDemo {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.setDetails("OfficeJet", 101);
        System.out.println("Machine: " + m.getMachineName());
        System.out.println("ID: " + m.getMachineId());
        m.print(); m.scan();
    }
}
