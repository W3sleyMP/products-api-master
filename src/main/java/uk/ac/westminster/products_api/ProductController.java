package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    //Spring creates the ProductService and hands it over
    @Autowired
    private ProductService productservice;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productservice.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id ) {
        return productservice.getProductById(id).orElse(null);
    }

    @PostMapping("/products")
    public Product addProduct (@RequestBody Product product) {
        return productservice.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productservice.deleteProduct(id);
    }

    @GetMapping ("/procuts/search")
    public List<Product> search(@RequestParam String name) {
        return productservice.findByName(name);
    }
}
