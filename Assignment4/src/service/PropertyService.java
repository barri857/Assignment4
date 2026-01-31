package service;
import model.Property;
import repository.interfaces.CrudRepository;
import interfaces.Validatable;
import java.util.List;

public class PropertyService implements Validatable<Property> {
    private final CrudRepository<Property> repo;

    public PropertyService(CrudRepository<Property> repo) {
        this.repo = repo;
    }

    @Override
    public void validate(Property p) throws Exception {
        if (p.getPrice() <= 0) throw new Exception("Invalid price!"); // Validation [cite: 75, 116]
    }

    public void addProperty(Property p) throws Exception {
        printValidationStart(); // Default method from interface [cite: 111]
        validate(p);
        repo.create(p);
    }

    public List<Property> getAllSortedByPrice() {
        List<Property> list = repo.findAll();
        return list;
    }
}