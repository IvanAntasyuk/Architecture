package structuralDP.composite;

import structuralDP.composite.service.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder users = new Folder("users");
        Folder documents = new Folder("documents");
        Folder photo = new Folder("photo");
        root.addFolder(users,documents,photo);

        Folder nick = new Folder("nick");
        Folder max = new Folder("max");
        users.addFolder(nick,max);

        root.printFolders();
    }
}
