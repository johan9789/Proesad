package com.proesad.download;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Download {

    public static void file(String fileURL, File directory){
        try {
            FileOutputStream output = new FileOutputStream(directory);
            URL url = new URL(fileURL);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            byte[] buffer = new byte[1024];
            int length = 0;
            while((length = input.read(buffer)) > 0){
                output.write(buffer, 0, length);
            }
            output.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(MalformedURLException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}