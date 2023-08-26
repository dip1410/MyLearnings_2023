package com.example.mylearnings.network.services;

import com.example.mylearnings.network.model.UserPost;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserPostsAPI {
    @GET("posts")
    Call<List<UserPost>> getUserPosts();

    @GET("posts")
    Call<List<UserPost>> getPostsById(@Query("userId") Integer userId);
}
