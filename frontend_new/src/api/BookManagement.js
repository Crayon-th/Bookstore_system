import request from "@/utils/request";

//获取所有书本
export function GetallBooks(data) {
  return request({
    url: "/api/admin/bookoverview/",
    method: "get",
    params: data,
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

//新增书本
export function AddNewBook(data) {
  return request({
    url: "/api/admin/book/",
    method: "post",
    data: data,
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

//申请添加书籍
export function ApplyNewBook(data, uid) {
  return request({
    url: "/apply/",
    method: "post",
    data: data,
    params: uid,
  });
}

//获取申请信息
export function GetApply(data) {
  return request({
    url: "/apply/application/",
    method: "get",
    params: data,
  });
}

//删除申请信息
export function DeleteApply(data) {
  return request({
    url: "/apply/application/",
    method: "delete",
    data: data,
  });
}

//上传图床

//通过外部api获取信息
export function GetInfoFromWeb(data) {
  return request({
    url: "/9787220126437",
    baseURL: "/xyz",
    method: "get",
    params: data,
  });
}
