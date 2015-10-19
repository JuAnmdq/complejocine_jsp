package model.dao;

public class DAOPeliculas extends DAOGeneric {

    static DAOPeliculas instance;

    public static DAOPeliculas getInstance() {
        if (instance == null) {
            instance = new DAOPeliculas();
        }
        return instance;
    }
    
}
