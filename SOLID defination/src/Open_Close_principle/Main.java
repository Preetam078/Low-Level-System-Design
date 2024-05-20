package Open_Close_principle;

import Open_Close_principle.DataBaseSave.Implement.FileSave;
import Open_Close_principle.DataBaseSave.Implement.FolderSave;

public class Main {
    /*
    * Open/Close Principle ==> Make interfaces for the common method
    * */
    public static void main(String[] args) {
        String name = "preetam";
        FileSave fileSave = new FileSave();
        fileSave.save(name);

        FolderSave folderSave = new FolderSave();
        folderSave.save(name);
    }
}
