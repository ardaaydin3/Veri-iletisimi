/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriiletisimi;
import java.io.*;
import java.net.*;

/**
 *
 * @author ardaa
 */
public class fileclient {
    public static void main(String[] argv) throws Exception {
        
        byte []b=new byte[20002];
        Socket ss = new Socket("localhost",6413);
        InputStream is=ss.getInputStream();
        FileOutputStream fs= new FileOutputStream("D:\\gelen.txt");
        is.read(b,0,b.length);
        fs.write(b, 0, b.length);
        
        
    }
}
