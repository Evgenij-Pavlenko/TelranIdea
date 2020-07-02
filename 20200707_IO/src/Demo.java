import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
//        try {
//        InputStream inputStream = new FileInputStream(("test.txt"));
//        int a = 0;
//        while((a = inputStream.read())!=-1){
//            System.out.print((char) a);
//        }
//    } catch (IOException ex) {
//        ex.printStackTrace();
//    }

//        try {
//            InputStream inputStream = new FileInputStream(("test.txt"));
//            System.out.println(inputStream.available());
//            int a = 0;
//            byte [] buf = new byte[6];
//            while((a = inputStream.read(buf))!=-1){
//                System.out.println("byte read: " +  a);
//                System.out.println("byte avalable: " + inputStream.available());
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

//        try {
//            InputStream inputStream = new FileInputStream(("test.txt"));
//            int a = 0;
//            while ((a = inputStream.available()) != 0) {
//                byte[] buf = new byte[a];
//                int readByte = inputStream.read(buf);
//                System.out.println("byte avalable: " + a);
//                System.out.println("byte read: " + readByte);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        try (InputStream inputStream = new FileInputStream(("test.txt"))) {
            int a = 0;
            int b = 10 / 0;
            while ((a = inputStream.available()) != 0) {
                byte[] buf = new byte[a];
                int readByte = inputStream.read(buf);
                System.out.println("byte avalable: " + a);
                System.out.println("byte read: " + readByte);
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
        System.out.println("finalising");

        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        in.lines().forEach(System.out::println); // самый изящный при работе с txt файлом
//        String str = null;
//       while((str =  in.readLine())!=null){
//           System.out.println(str);
//       }
    }
}
