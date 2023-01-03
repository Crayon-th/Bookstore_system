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

//管理员获取反馈建议
export function GetFeedback(data) {
  return request({
    url: "/api/feedback/admin/",
    method: "get",
    params: data,
  });
}

//管理员完成意见反馈
export function FinishFeedback(data) {
  return request({
    url: "/api/feedback/handle/",
    method: "post",
    params: data,
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

//获取社区违规举报
export function GetReport(data) {
  return request({
    url: "/api/report",
    method: "get",
    params: data,
  });
}

//用户创建社区违规举报
export function ReportComment(data) {
  return request({
    url: "/api/report",
    method: "post",
    params: data,
  });
}

//根据id获取社区违规举报详情
export function GetSpecificReport(data) {
  return request({
    url: "/api/bookReview/one",
    method: "get",
    params: data,
  });
}

//删除违规举报
export function DeleteSpecificReport(data) {
  return request({
    url: "/api/report",
    method: "delete",
    params: data,
  });
}
