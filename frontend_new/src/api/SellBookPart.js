import request from "@/utils/request";
import axios from "axios";

//出售一本书
export function TradeBook(uid, datain) {
  return request({
    url: "/commodity/trade/",
    method: "post",
    data: datain,
    params: uid,
  });
}

//上传书的图片
export function BookImage(file) {
  var config = {
    method: "post",
    url: "/commodity/trade/bookimage/",
    data: file,
    transformRequest: [
      function (data, headers) {
        // 去除post请求默认的Content-Type
        delete headers.post["Content-Type"];
        return data;
      },
    ],
  };

  return axios(config);
}

//删除我的一个商品
export function DeleteMyBook(data) {
  return request({
    url: "/commodity/trade/",
    method: "delete",
    data: data,
  });
}

//购买一个商品生成订单
export function CreateOrder(buyerid, data) {
  return request({
    url: "/order/",
    method: "post",
    params: buyerid,
    data: data,
  });
}

//获取作为买家的所有订单
export function BuyerGetOrder(data) {
  return request({
    url: "/order/buyer/",
    method: "get",
    params: data,
  });
}

//获取作为卖家的所有订单
export function SellerGetOrder(data) {
  return request({
    url: "/order/seller",
    method: "get",
    params: data,
  });
}
