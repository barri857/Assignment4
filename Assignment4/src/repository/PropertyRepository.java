package repository;

import model.Property;
import repository.interfaces.CrudRepository;
import utils.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PropertyRepository implements CrudRepository<Property> {

    @Override
    public void create(Property p) {

    }

    @Override
    public List<Property> findAll() {

        List<Property> list = new ArrayList<>();

        return list;
    }

    @Override
    public Property findById(int id) { return null; }

    @Override
    public void update(Property entity) { }

    @Override
    public void delete(int id) { }
}