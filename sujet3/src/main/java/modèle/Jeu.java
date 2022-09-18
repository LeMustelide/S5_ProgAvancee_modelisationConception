package modèle;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Jeu extends Remote{
    String creationPartie(String nom, String joueur) throws RemoteException;
    void rejoindrePartie(String idPartie, String joueur);
    void showMsg() throws RemoteException;
    void input() throws RemoteException;

}
