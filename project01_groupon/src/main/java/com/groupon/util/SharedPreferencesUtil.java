package com.groupon.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.groupon.cinstant.Constant;

/**
 * 对偏好设置文件的操作
 * <p>
 * 1) Context的getSharedPreferences(文件名,模式);
 * 2) Activity的getPreference(模式);获取以preference_activiy名的偏好设置文件
 * 3) PreferenceManager的getDefaultSharedPreferences(Context);
 * 获取preference_包名 偏好设置文件
 * 模式 Context_MODE_PRIVATE
 * <p>
 * Created by pjy on 2017/6/15.
 */
public class SharedPreferencesUtil {
    private Context context;
    private SharedPreferences sp;

    public SharedPreferencesUtil(Context context) {
        this.context = context;
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public SharedPreferencesUtil(Context context, String name) {
        sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public boolean isFirst(){
        return sp.getBoolean(Constant.FIRST,true);
    }

    public void setFirst(boolean flag){
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(Constant.FIRST,flag);
        edit.commit();
    }

}
