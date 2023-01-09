package org.example.entity.userStorage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.product.ProductType;
import org.example.exceptions.UserStorageIsNullException;
import org.example.interfaces.IActionWithProductInStorage;
import org.example.interfaces.IGetAllProductsWithTypeFilter;
import org.example.interfaces.IGetProductsWithMinOrMaxPrice;
import org.example.interfaces.ITotalProductsPrice;
import org.example.entity.products.Product;

import java.util.List;
import java.util.Objects;

public class Wishlist implements ITotalProductsPrice, IActionWithProductInStorage, IGetAllProductsWithTypeFilter, IGetProductsWithMinOrMaxPrice {
    private static final Logger LOGGER = LogManager.getLogger(Wishlist.class);
    private List<Product> wishlist;

    @Override
    public List<Product> getProductsWithMinPrice() {
        double mixPrice = wishlist
                .stream()
                .mapToDouble(Product::getPrice)
                .min().orElse(-1);
        return wishlist.stream().filter(product -> product.getPrice() == mixPrice).toList();
    }

    @Override
    public List<Product> getProductsWithMaxPrice() {
        double maxPrice = wishlist
                .stream()
                .mapToDouble(Product::getPrice)
                .max().orElse(-1);
        return wishlist.stream().filter(product -> product.getPrice() == maxPrice).toList();
    }

    @Override
    public List<Product> getOnlyClothes() {
        return wishlist
                .stream()
                .filter(product -> product.getType() == ProductType.CLOTHES).toList();
    }

    @Override
    public List<Product> getOnlyElectronics() {
        return wishlist
                .stream()
                .filter(product -> product.getType() == ProductType.ELECTRONICS).toList();
    }

    @Override
    public List<Product> getOnlyFurniture() {
        return wishlist
                .stream()
                .filter(product -> product.getType() == ProductType.FURNITURE).toList();
    }

    @Override
    public void addProduct(Product product){
        wishlist.add(product);
        LOGGER.info("product added to basket");
    }

    @Override
    public void removeProduct(Product product){
        wishlist.remove(product);
        LOGGER.info("Product removed from product list");
    }

    public void addProductToBasket(Basket basket,Product product){
        LOGGER.info("Product from basket added to wishlist");
        basket.addProduct(product);
    }

    @Override
    public Double totalPrice(){
        return wishlist
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Wishlist() {

    }

    public Wishlist(List<Product> basket) {
        this.wishlist = basket;
    }

    public List<Product> getWishlist() throws UserStorageIsNullException {
        if(wishlist == null){
            throw new UserStorageIsNullException("Wishlist is null");
        }
        return wishlist;
    }

    public void setWishlist(List<Product> basket) {
        this.wishlist = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wishlist wishlist1 = (Wishlist) o;
        return Objects.equals(wishlist, wishlist1.wishlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wishlist);
    }

    @Override
    public String toString() {
        if(wishlist == null){
            return "You have not added the product to the wishlist.";
        }
        return "Wishlist{" +
                "wishlist=" + wishlist +
                '}';
    }
}
