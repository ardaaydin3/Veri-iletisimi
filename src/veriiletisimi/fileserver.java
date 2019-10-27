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
public class fileserver {
    public static void main(String[] args) throws Exception {
        
    
    ServerSocket ss= new ServerSocket(6413);
     Socket sw=ss.accept();
     FileInputStream file=new FileInputStream("C:\\arda.txt");
     byte b[]=new byte[2002];
     file.read(b,0,b.length);
     OutputStream os=sw.getOutputStream();
     os.write(b, 0,b.length);
     
     
     
    }
}
