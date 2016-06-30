package com.huadou.cn.edu.retrofit;

import com.huadou.cn.edu.utils.APiConstant;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jinliang on 16-6-30.
 *
 *  Retrofit 实例模型
 *
 */

public class HuadouRetrofit {

    public static HuadouRetrofit instance  ;

    public static  Retrofit retrofit ;

    public static  HuadouRetrofit getInstance (){
        if(instance==null){
            synchronized (HuadouRetrofit.class){
                if(instance==null){
                    instance = new HuadouRetrofit();
                }
            }
        }
        return instance ;
    }

    /**
     * 获取实际操作的单例模型
     * @return
     */
    public static  Retrofit getRetrofit(){
        if(retrofit==null){
          retrofit = getRetrofitInstance();
        }
        return retrofit;
    }

    /**
     * 获取 retrofit 实例
     * @return
     */
    private static Retrofit  getRetrofitInstance(){
       Retrofit  retrofit = new Retrofit.Builder()
                .baseUrl(APiConstant.URL_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit;
    }


}
