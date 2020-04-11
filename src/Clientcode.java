import java.io.*;
import java.util.*;

/**
 * the clientcode class
 *
 * @author Yuan Chen
 * @version 2019-12-08
 *
 */
public class Clientcode {
    private int tablesize;
    private RandomAccessFile binaryfile;
    private boolean essayflag;
    private String gpid;

    /**
     * constructor
     * 
     * @param temp
     *            inread args
     */
    public Clientcode(String[] temp) {

        String[] args = temp;
        tablesize = Integer.valueOf(args[2]);
        System.out.print("Created Hash Set with " + tablesize + " slots.\n");
        try {
            binaryfile = new RandomAccessFile(args[3], "rw");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        essayflag = false;
        gpid = null;
        // tempName = "";
    }
}