package si.um.feri.measurements.dao;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import si.um.feri.measurements.vao.Product;

import java.util.List;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
    public Uni<List<Product>> returnAllProductsByName(String name){ return find("name", name).list();}
}
