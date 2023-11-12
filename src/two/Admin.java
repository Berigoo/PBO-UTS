package two;

import java.util.List;

public class Admin extends Pengguna{
    public Admin(String username, String pass){
        super(0);

        setUsername(username);
        setPass(pass);
    }
    public void addBuku(List<Buku> db, String title, String[] genre){
        db.add(new Buku(title, genre));
    }
    public void delBuku(List<Buku> db, int index){
        db.remove(index-1);
    }
}
