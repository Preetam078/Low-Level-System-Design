package Open_Close_principle.DataBaseSave.Implement;

import Open_Close_principle.DataBaseSave.DatabaseSave;

import java.util.ArrayList;

public class FolderSave implements DatabaseSave {
    ArrayList<String>DB2;

    public FolderSave() {
        DB2 = new ArrayList<String>();
    }
    @Override
    public void save(String name) {
        DB2.add(name);
    }
}
