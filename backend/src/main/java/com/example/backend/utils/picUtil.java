package com.example.backend.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class picUtil {
    public String savePicture(MultipartFile picture, String folderName,HttpServletRequest request) throws IOException
    {
        String name = picture.getOriginalFilename();
        String suffixName = name.substring(name.lastIndexOf("."));
        name = UUID.randomUUID()+suffixName;

        folderName = "/"+folderName+"/";
        //String path = request.getServletContext().getRealPath(folderName);
        String path = "C:/"+folderName;
        File dir = new File(path);
        if(!dir.exists())
        {
            dir.mkdir();
        }

        File file = new File(path+name);
        picture.transferTo(file);
        return folderName+name;
    }
}
