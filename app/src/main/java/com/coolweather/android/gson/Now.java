package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
//实时天气
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        //天气情况
        @SerializedName("txt")
        public String info;
    }
}
