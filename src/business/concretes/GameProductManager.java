package business.concretes;

import business.abstracts.GameProductService;
import dataAccess.abstracts.GameProductDao;
import entities.concretes.GameProduct;

public class GameProductManager implements GameProductService {

    private GameProductDao gameProductDao;

    public GameProductManager(GameProductDao gameProductDao) {
        this.gameProductDao = gameProductDao;
    }

    @Override
    public void add(GameProduct gameProduct) {
        gameProductDao.add(gameProduct);
    }

    @Override
    public void update(GameProduct gameProduct) {
        gameProductDao.update(gameProduct);
    }

    @Override
    public void delete(GameProduct gameProduct) {
        gameProductDao.delete(gameProduct);
    }
}
