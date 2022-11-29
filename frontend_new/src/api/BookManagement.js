import request from "@/utils/request";

//获取所有书本
export function GetallBooks() {
  return request({
    url: "/api/admin/bookoverview/",
    method: "get",
  });
}

//查询书本
export function SearchBook(data) {
  return request({
    url: "/api/admin/bookoverview/",
    method: "get",
    params: data,
  });
}

//编辑书本信息
export function EditBook(data) {
  return request({
    url: "/api/admin/bookedit/",
    method: "get",
    params: data,
  });
}
