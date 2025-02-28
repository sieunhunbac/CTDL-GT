package QLCuaHangLapTop_DSLKDOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SanPhamDao {
	public void ghiFile(SanPham first) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
        	
            fout = new FileOutputStream("d:\\DSLKDOISanPham.bin");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(first);
            System.out.println("Ghi vào file thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	//doc file
	public SanPham docFile(String filename) {
		
		SanPham first = new SanPham();
        
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            first = (SanPham)  ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return first;
    }
}
