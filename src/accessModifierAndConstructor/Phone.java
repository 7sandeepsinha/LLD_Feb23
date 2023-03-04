package accessModifierAndConstructor;

public class Phone {
    private int modelNo;
    private String modelName;
    private int processorVersion;
    private String processorName;
    private int screensize;
    private int batteryCapacity;
    private int cameraSpecs;
    private int price;

    public Phone(int modelNo,
                 String modelName,
                 int processorVersion,
                 String processorName,
                 int screensize,
                 int batteryCapacity,
                 int cameraSpecs,
                 int price) {
        this.modelNo = modelNo;
        this.modelName = modelName;
        this.processorVersion = processorVersion;
        this.processorName = processorName;
        this.screensize = screensize;
        this.batteryCapacity = batteryCapacity;
        this.cameraSpecs = cameraSpecs;
        this.price = price;
    }

    public Phone(Phone phone){
        modelNo = phone.modelNo + 1 ;
        modelName = phone.modelName;
        processorVersion = phone.processorVersion + 1;
        processorName = phone.processorName;
        screensize = phone.screensize;
        batteryCapacity = phone.batteryCapacity;
        cameraSpecs = phone.cameraSpecs;
        price = phone.price + 10000;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getProcessorVersion() {
        return processorVersion;
    }

    public void setProcessorVersion(int processorVersion) {
        this.processorVersion = processorVersion;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getScreensize() {
        return screensize;
    }

    public void setScreensize(int screensize) {
        this.screensize = screensize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCameraSpecs() {
        return cameraSpecs;
    }

    public void setCameraSpecs(int cameraSpecs) {
        this.cameraSpecs = cameraSpecs;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

//break -> 8:52 AM -> 7 mins

