package business.abstracts;

import entities.concretes.GameProduct;

public interface GameProductService {
    void add(GameProduct gameProduct);
    void update(GameProduct gameProduct);
    void delete(GameProduct gameProduct);
}
