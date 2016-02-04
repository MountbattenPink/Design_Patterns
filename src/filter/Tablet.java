package filter;

/**
 * Created by pc on 04.02.2016.
 */
public class Tablet {
    boolean present3g;
    String processorModel;
    int ramGB;
    String videoAdepterModel;

    public Tablet(boolean present3g, String processorModel, int ramGB, String videoAdepterModel) {
        this.present3g = present3g;
        this.processorModel = processorModel;
        this.ramGB = ramGB;
        this.videoAdepterModel = videoAdepterModel;
    }

    public boolean isPresent3g() {
        return present3g;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public int getRamGB() {
        return ramGB;
    }

    public String getVideoAdepterModel() {
        return videoAdepterModel;
    }

    @Override
    public String toString() {
        return "\nTablet{" +
                "present3g=" + present3g +
                ", processorModel='" + processorModel + '\'' +
                ", ramGB=" + ramGB +
                ", videoAdepterModel='" + videoAdepterModel + '\'' +
                '}';
    }
}
