import request from "@/utils/request";

//买家评论订单
export function CustomerPostComment(data) {
  return request({
    url: "/api/comment",
    method: "post",
    data: data,
  });
}

//用户评价书籍
export function UserPostReview(data) {
  return request({
    url: "/api/bookReview",
    method: "post",
    data: data,
  });
}

//用户对书籍评分
export function UserPostRating(data) {
  return request({
    url: "/user/score/",
    method: "post",
    data: data,
  });
}

//用户回复评论
export function UserPostReviewToReview(data) {
  return request({
    url: "/api/bookReview",
    method: "post",
    data: data,
  });
}

//用户删除订单评论
export function UserDeleteComment(data) {
  return request({
    url: "/user/deleteComent/",
    method: "post",
    data: data,
  });
}

//用户删除评论
export function UserDeleteReview(data) {
  return request({
    url: "/user/deleteReview/",
    method: "post",
    data: data,
  });
}

//管理员删除订单评论
export function AdministratorDeleteComment(data) {
  return request({
    url: "/admin/deleteComment/",
    method: "post",
    data: data,
  });
}

//管理员删除评论
export function AdministratorDeleteReview(data) {
  return request({
    url: "/api/bookReview",
    method: "delete",
    params: data,
  });
}

//用户查看某本书的评论
export function UserGetReview(data) {
  return request({
    url: "/api/bookReview",
    method: "get",
    params: data,
  });
}

//买家查看自己的所有订单评论
export function BuyerGetComment(data) {
  return request({
    url: "/api/comment/user",
    method: "get",
    params: data,
  });
}

//卖家查看自己某个订单的评论
export function SellerGetComment(data) {
  return request({
    url: "/api/comment/order",
    method: "get",
    params: data,
  });
}
