package fm0;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fm0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC19026c {
    /* renamed from: a */
    public static long m100083a(Context context) {
        return context.getSharedPreferences("ZaloCore", 0).getLong("lastTimestampLogQOS", 0L);
    }

    /* renamed from: b */
    public static void m100084b(Context context, long j11) {
        m100085c(context, "ZaloCore", "lastTimestampLogQOS", j11);
    }

    /* renamed from: c */
    public static void m100085c(Context context, String str, String str2, long j11) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putLong(str2, j11);
        edit.commit();
    }
}
