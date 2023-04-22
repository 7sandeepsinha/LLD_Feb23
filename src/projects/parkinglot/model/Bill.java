package projects.parkinglot.model;

public class Bill extends BaseModel {
    private Ticket ticket;
    private int amount;
    private String exitTime;
    private String invoiceNumber;
    private Payment payment;
    private BillStatus billStatus;
    private ExitGate gate;

//    @Override
//    BillDto toDto() {
//        BillDto billDto = new BillDto();
//        billDto.setAmount(this.amount);
//        billDto.setInvoiceNumber(this.invoiceNumber);
//        return billDto;
//    }


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public ExitGate getGate() {
        return gate;
    }

    public void setGate(ExitGate gate) {
        this.gate = gate;
    }
}
