import request from "@/utils/request";

//用户登录
export function UserLogin(data) {
  return request({
    url: "/api/auth/login",
    method: "post",
    data: data,
  });
}

//给用户邮件发送信息
export function GetEmailCode(email) {
  return request({
    url: "/api/auth/getEmailCode",
    method: "post",
    params: email,
  });
}

//给用户邮件发送信息
export function Register(data) {
  return request({
    url: "/api/auth/register",
    method: "post",
    data: data,
  });
}
