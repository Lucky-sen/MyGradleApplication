package com.sen.mygradleapplication;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * 作者：admin016
 * 日期时间: 2022/1/6 17:09
 * 内容描述: 获取meta-data数据
 */
public class MyUtils {


    //获取value
    public static String getMetaDataFromApp(Context context) {
        String value = "";
        try {
            ApplicationInfo appInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(),
                    PackageManager.GET_META_DATA);
            value = appInfo.metaData.getString("CHANNEL");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }
    //获取resource id
    public static int getMetaDataIdFromAct(Activity activity) {
        int resId= 0;
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(),
                    PackageManager.GET_META_DATA);
            resId= activityInfo.metaData.getInt("CHANNEL");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return resId;
    }
}
