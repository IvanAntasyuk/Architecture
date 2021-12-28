package structuralDP.composite.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder {
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    List<Folder> list = new ArrayList<>();

    public void addFolder(Folder ... folder){
        list.addAll(Arrays.asList(folder));
    }

    public void printFolders(){
        for(Folder folder:list){
            System.out.println(folder.name);
            folder.printFolders();
        }
    }
}
