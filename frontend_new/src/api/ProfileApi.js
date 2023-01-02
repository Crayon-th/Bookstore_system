import request from "@/utils/request";

//更新头像种子
export function UserPostSeed(id, seed) {
  return request({
    url: "/api/auth/changePortrait",
    method: "post",
    params: {
      "id" : id,
      "seed" : seed,
    }
  });
}

//更新用户名
export function UserPostName(id, username) {
    return request({
      url: "/api/auth/changeUsername",
      method: "post",
      params: {
        "id" : id,
        "username" : username,
      }
      });
  }

//修改用户密码
export function UserPostPassword(id, newPassword, oldPassword) {
  return request({
    url: "/api/auth/changePassword",
    method: "post",
    params: {
      "id" : id,
      "newPassword" : newPassword,
      "oldPassword" : oldPassword,
    }
  });
}
