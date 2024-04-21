package com.example.restaurantreview;

import com.example.restaurantreview.data.response.CustomerReviewsItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostReviewResponse {
    @SerializedName("customerReviews")
    private List<CustomerReviewsItem> customerReviews;

    @SerializedName("eror")
    private boolean error;

    @SerializedName("message")
    private String message;

    public List<CustomerReviewsItem>getCustomerReviews(

    ){
        return customerReviews;
    }

    public boolean isError(){
        return error;
    }

    public String getMessage(){
        return message;
    }
}
