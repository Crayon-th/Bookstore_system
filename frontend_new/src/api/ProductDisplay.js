import request from "@/utils/request";

//获取商品用于展示
export function CommodityDisplay(data) {
  return request({
    url: "/commodity/commodityDisplay",
    method: "get",
    params: data,
  });
}

//获取特定商品信息，用于商品详情页面
export function CommodityDetail(data) {
  return request({
    url: "/commodity/",
    method: "get",
    params: data,
  });
}

//获取该用户所上传的待售出商品
export function CommodityDisplayToSeller(data) {
  return request({
    url: "/commodity/commodityDisplay/seller/",
    method: "get",
    params: data,
  });
}

//获取包含有这个字符串的商品，用于搜索
export function CommodityDisplayToBookName(data) {
  return request({
    url: "/commodity/commodityDisplay/bookName/",
    method: "get",
    params: data,
  });
}
