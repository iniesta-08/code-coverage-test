import org.junit.Test;

public class VendingMachineTest {

    @Test
    public void testassert() {
        VendingMachine.dispenseItem(19, "candy");
        VendingMachine.dispenseItem(21, "candy");
        VendingMachine.dispenseItem(20, "candy");
        VendingMachine.dispenseItem(26, "coke");
        VendingMachine.dispenseItem(24, "coke");
        VendingMachine.dispenseItem(25, "coke");
        VendingMachine.dispenseItem(46, "coffee");
        VendingMachine.dispenseItem(44, "coffee");
        VendingMachine.dispenseItem(45, "coffee");
    }

}
