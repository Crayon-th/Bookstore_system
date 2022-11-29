package com.example.backend.controller.commodity;

import com.example.backend.pojo.Commodity;
import com.example.backend.service.commodity.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.backend.utils.picUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @PostMapping("/commodity/trade/")
    public Map<String,String> sellBook(@RequestParam Integer uid,@RequestBody Commodity commodity)
    {
        Map<String,String> m =new HashMap<>();
        m = tradeService.uploadBook(uid,commodity.getIsbn(),commodity.getBookName(),commodity.getAuthor(),commodity.getVersion(),commodity.getImageurl(), commodity.getDamageCondition(), commodity.getAgingCondition(),commodity.getPrice());
        return m;
    }

    //传递回一个图片的路径，保存在数据库中
    @PostMapping("/commodity/trade/bookimage/")
    public String uploadBookPicture(MultipartFile picture, HttpServletRequest request)
    {
        picUtil picUtil = new picUtil();
        try{
            String path = picUtil.savePicture(picture,"book",request);
            return path;
        }
        catch(Exception e){
            return null;
        }
    }

    @DeleteMapping("/commodity/trade/")
    public Map<String,String> deleteMyCommodity(Integer uid,Integer id)
    {
        Map<String,String> m = tradeService.deleteCommodity(uid,id);
        return m;
    }
}
