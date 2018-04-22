package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //@SerializedName: 让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")         //JSON字段为"city"
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        //当地时间
        @SerializedName("loc")
        public String updateTime;
    }


}
