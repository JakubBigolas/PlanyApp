package com.byd.wsg.com.wsg.byd.plan.raw;

import android.support.annotation.NonNull;

/**
 * Created by Jakub on 2016-05-29.
 */
public class RawAuthenticate {

    public String token;

    public Long expires;

    @NonNull
    public String getToken() {
        return token == null ? "" : token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @NonNull
    public Long getExpires() {
        return expires == null ? 0L : expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "RawAuthenticate{" +
                "token='" + token + '\'' +
                ", expires=" + expires +
                '}';
    }
}
