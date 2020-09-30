package cs.lab;
import java.util.logging.Logger;
import java.util.Map;
import java.util.HashMap;

public class EstacionMeteorologica {

    static final Logger logger = Logger.getLogger(EstacionMeteorologica.class.getName());    
    private Map<String, Float> datos = new HashMap<>();
    
    static final String TEMPERATURASTRING = "temperatura";
    static final String HUMEDADSTRING = "humedad";
    static final String VIENTOSTRING = "viento";

    public EstacionMeteorologica(Float temperatura, Float humedad, Float viento){
        this.datos.put(TEMPERATURASTRING, temperatura);
        this.datos.put(HUMEDADSTRING, humedad);
        this.datos.put(VIENTOSTRING, viento);
    }

    public Map<String, Float> getDatos() {
        return this.datos;  
    }

    public Float getTemperatura() {
        return this.datos.get(TEMPERATURASTRING);
    }

    public Float getHumedad() {
        return this.datos.get(HUMEDADSTRING);
    }

    public Float getViento() {
        return this.datos.get(VIENTOSTRING);
    }

    public void setDatos(Map<String, Float> datos) {
        this.datos = datos;
    }

    public void setTemperatura(Float temperatura) {
        this.datos.put(TEMPERATURASTRING, temperatura);
    }

    public void setHumedad(Float humedad) {
        this.datos.put(HUMEDADSTRING, humedad);
    }

    public void setViento(Float viento) {
        this.datos.put(VIENTOSTRING, viento);
    }

}