package jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AjaxBeanC {
    private String cTemp, kTemp;

    public String getcTemp() {
        return cTemp;
    }

    public String getkTemp() {
        return kTemp;
    }

    public String getfTemp() {
        return ("");
    }

    public void setfTemp(String fTemp) {
        double f = -500;
        try {
            f = Double.parseDouble(fTemp);
        } catch (NumberFormatException nfe){
            cTemp = "Invalid";
            kTemp = "Invalid";
        }

        if (f >= -459.4) {
            double c = (f - 32)*(5.0/9.0);
            double k = c + 273;
            cTemp = String.format("%.2f", c);
            kTemp = String.format("%.2f", k);
        }
    }
}
