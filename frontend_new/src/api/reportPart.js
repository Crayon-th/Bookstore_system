import request from "@/utils/request";

//用户发起投诉
export function UserReport(data) {
  return request({
    url: "/user/report/",
    method: "post",
    data: data,
  });
}

//管理员封禁用户账号
export function AdministratorBlockAccount(data) {
  return request({
    url: "/admin/blockAccount/",
    method: "post",
    data: data,
  });
}

//用户发起反馈
export function UserFeedBack(data) {
  return request({
    url: "/api/feedback",
    method: "post",
    data: data,
  });
}
