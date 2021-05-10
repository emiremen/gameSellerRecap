package dataAccess.abstracts;

import entities.concretes.GameProduct;

public interface GameProductDao {
    void add(GameProduct gameProduct);
    void update(GameProduct gameProduct);
    void delete(GameProduct gameProduct);
}
