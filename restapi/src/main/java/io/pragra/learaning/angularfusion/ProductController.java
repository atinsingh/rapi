package io.pragra.learaning.angularfusion;

import io.pragra.learaning.angularfusion.domain.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductRepo repo;


    public ProductController(ProductRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/product")
    public List<Product> getAll(){
        return repo.findAll();
    }

    @PostMapping("/product")
    private Product saveProduct(@RequestBody() Product product) {
        return this.repo.save(product);
    }

    @GetMapping("/product/{id}")
    private Product getById(@PathVariable("id") Long id){
        return this.repo.findById(id).get();
    }
}
