package com.demos.androidlearns;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by beiyong on 2016-4-1.
 */
public interface ApiService {

    @GET("service/getIpInfo.php")
    Observable<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);
}
