import model.*;
import service.PropertyService;
import repository.PropertyRepository;
import utils.*;
import interfaces.Validatable;

public class Main {
    public static void main(String[] args) {

        Agent agent = new Agent(1, "Almas", "87071112233");
        ReflectionUtils.inspectClass(agent);

        PropertyService service = new PropertyService(new PropertyRepository());

        try {
            Property h = new House(1, "Abay 10", 250000, agent, 15.0);
            service.addProperty(h);

            if (Validatable.isNotNull(h)) {
                h.displayBasicInfo();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}