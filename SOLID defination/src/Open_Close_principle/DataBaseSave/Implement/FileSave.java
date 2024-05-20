package Open_Close_principle.DataBaseSave.Implement;

import Open_Close_principle.DataBaseSave.DatabaseSave;

import java.util.ArrayList;

public class FileSave implements DatabaseSave {

    private ArrayList<String>DB1;
    public FileSave() {
        DB1 = new ArrayList<String>();
    }
    @Override
    public void save(String name) {
        DB1.add(name);
    }
}
