import request from "@/utils/request";

//用户登录
export function Register(data) {
  return request({
    url: "/auth/login",
    method: "post",
    params: data,
  });
}

//给用户邮件发送信息
export function GetEmailCode(email) {
  return request({
    url: "/auth/getEmailCode",
    method: "post",
    params: email,
  });
}
