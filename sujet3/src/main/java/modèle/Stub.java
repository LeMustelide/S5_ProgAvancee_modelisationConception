package modèle;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Stub extends UnicastRemoteObject implements Jeu{

    private Partie partie;

    protected Stub() throws RemoteException {
    }

    @Override
    public String creationPartie(String createur, String invite) throws RemoteException {
        partie = new Partie(createur, invite);
        return null;
    }

    @Override
    public void rejoindrePartie(String idPartie, String joueur) {

    }

    @Override
    public void showMsg() throws RemoteException {

    }

    @Override
    public void input() throws RemoteException {

    }
}
