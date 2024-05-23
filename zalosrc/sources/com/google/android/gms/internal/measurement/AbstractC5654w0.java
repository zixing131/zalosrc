package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC5654w0 {

    /* renamed from: a */
    private static final Method f32868a;

    /* renamed from: b */
    private static final Method f32869b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method declaredMethod;
        Method method = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
            }
            f32868a = declaredMethod;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    method = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
                } catch (NoSuchMethodException unused2) {
                }
            }
            f32869b = method;
        }
        declaredMethod = null;
        f32868a = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        f32869b = method;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m29812a(Context context, JobInfo jobInfo, String str, String str2) {
        int checkSelfPermission;
        Integer num;
        int intValue;
        Method method;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (f32868a != null) {
            checkSelfPermission = context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS");
            if (checkSelfPermission == 0) {
                Method method2 = f32869b;
                if (method2 != null) {
                    try {
                        num = (Integer) method2.invoke(UserHandle.class, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                    if (num != null) {
                        intValue = num.intValue();
                        method = f32868a;
                        if (method != null) {
                            try {
                                Integer num2 = (Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                                if (num2 == null) {
                                    return 0;
                                }
                                return num2.intValue();
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        return jobScheduler.schedule(jobInfo);
                    }
                }
                intValue = 0;
                method = f32868a;
                if (method != null) {
                }
                return jobScheduler.schedule(jobInfo);
            }
        }
        return jobScheduler.schedule(jobInfo);
    }
}
