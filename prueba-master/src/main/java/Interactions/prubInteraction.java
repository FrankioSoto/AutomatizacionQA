package Interactions;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import static Interfaces.guidePage.orderLocation;

@AllArgsConstructor
public class prubInteraction implements Interaction {


    public static prubInteraction guideMethod() {

        return new prubInteraction();
    }

    @SneakyThrows
    @Override

    public <T extends Actor> void performAs(T actor) {
        String variableOrder;
        variableOrder = orderLocation.resolveFor(actor).getText();

        try {
            String ruta = "src/test/resources/data/order.properties";
            String ContenidoModal = "data.order=" + variableOrder;
            File file = new File(ruta);
// Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(ContenidoModal);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}