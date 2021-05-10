package dataAccess.concretes.oracle;

import dataAccess.abstracts.GameProductDao;
import entities.concretes.GameProduct;

public class OracleGameProductDao implements GameProductDao {
    @Override
    public void add(GameProduct gameProduct) {
        System.out.println("Game added: " + gameProduct.getName());
    }

    @Override
    public void update(GameProduct gameProduct) {
        System.out.println("Game updated: " + gameProduct.getName());
    }

    @Override
    public void delete(GameProduct gameProduct) {
        System.out.println("Game deleted: " + gameProduct.getName());
    }
}
