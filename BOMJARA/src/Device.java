public class Device {
    // Поля класу
    String vyrobnyk;
    String model;
    double tsina;
    int rik;
    String kolir;
    boolean V_Nayavnosti;
    double diagonal;

    // Конструктор класу
    public Device(String vyrobnyk, String model, double tsina, int rik, String kolir, boolean v_Nayavnosti, double diagonal) {
        this.vyrobnyk = vyrobnyk;
        this.model = model;
        this.tsina = tsina;
        this.rik = rik;
        this.kolir = kolir;
        V_Nayavnosti = v_Nayavnosti;
        this.diagonal = diagonal;
    }

    public String getVyrobnyk() {
        return vyrobnyk;
    }

    public void setVyrobnyk(String vyrobnyk) {
        this.vyrobnyk = vyrobnyk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTsina() {
        return tsina;
    }

    public void setTsina(double tsina) {
        this.tsina = tsina;
    }

    public int getRik() {
        return rik;
    }

    public void setRik(int rik) {
        this.rik = rik;
    }

    public String getKolir() {
        return kolir;
    }

    public void setKolir(String kolir) {
        this.kolir = kolir;
    }

    public boolean isV_Nayavnosti() {
        return V_Nayavnosti;
    }

    public void setV_Nayavnosti(boolean v_Nayavnosti) {
        V_Nayavnosti = v_Nayavnosti;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    // Метод для виведення інформації про пристрій
    void displayInfo() {
        System.out.println("Device Model: " + model);
        System.out.println("Screen Size: " + diagonal + " Duims");
        System.out.println("Device Price:" + tsina);
        System.out.println("Year of Production:" + rik);
        System.out.println("Color:" + kolir);
    }
}
class telephone extends Device {
    public telephone(String vyrobnyk, String model, double tsina, int rik, String kolir, boolean v_Nayavnosti, double diagonal) {
        super(vyrobnyk, model, tsina, rik, kolir, v_Nayavnosti, diagonal);
    }
    void measureRadiationLevel(double latitude, double longitude) {
        System.out.println("Measuring radiation level at location: " + latitude + ", " + longitude);
    }

    // Метод для включення режиму детектора фальшивих банкнот
    void enableCounterfeitDetectionMode(int currencyType) {
        System.out.println("Enabling counterfeit detection mode for currency type: " + currencyType);
    }

    // Метод для аналізу настроїв за голосом
    void analyzeVoiceMood(String voiceSample, String language) {
        System.out.println("Analyzing voice mood from sample in " + language + ": " + voiceSample);
    }
    void displayInfo() {
        System.out.println("Telephone Model: " + model);
        System.out.println("Screen Size: " + diagonal + " Duims");
        System.out.println("Telephone Price:" + tsina);
        System.out.println("Year of Production:" + rik);
        System.out.println("Color:" + kolir);
    }
    // Метод, що перевіряє, чи є телефон в наявності
    boolean isAvailable() {
        return V_Nayavnosti;
    }
}


class tablet extends Device {
    public tablet(String vyrobnyk, String model, double tsina, int rik, String kolir, boolean v_Nayavnosti, double diagonal) {
        super(vyrobnyk, model, tsina, rik, kolir, v_Nayavnosti, diagonal);
    }
    @Override
    void displayInfo() {
        System.out.println("Tablet Model: " + model);
        System.out.println("Screen Size: " + diagonal + " Duims");
        System.out.println("Tablet Price:" + tsina);
        System.out.println("Year of Production:" + rik);
        System.out.println("Color:" + kolir);
    }
    void readEBooks() {
        System.out.println("Reading eBooks on the tablet...");
    }
    void launchGraphicsEditor() {
        System.out.println("Launching graphic editor application.");
    }
    boolean isAvailable() {
        return V_Nayavnosti;
    }
        }
class laptop extends Device {
    public laptop(String vyrobnyk, String model, double tsina, int rik, String kolir, boolean v_Nayavnosti, double diagonal) {
        super(vyrobnyk, model, tsina, rik, kolir, v_Nayavnosti, diagonal);
    }

    public void runVirtualMachine() {
        System.out.println("Running a virtual machine on the laptop...");
    }

    public void compileCode() {
        System.out.println("Compiling code on the laptop...");
    }

    public void editVideos() {
        System.out.println("Editing videos on the laptop...");
    }
}

