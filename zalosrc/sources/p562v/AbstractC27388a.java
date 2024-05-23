package p562v;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: v.a */
/* loaded from: classes2.dex */
public abstract class AbstractC27388a {
    /* renamed from: a */
    public static String m140312a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m140313b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m140314c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m140315d() {
        JSONObject jSONObject = new JSONObject();
        AbstractC27389b.m140321f(jSONObject, "deviceType", m140312a());
        AbstractC27389b.m140321f(jSONObject, "osVersion", m140313b());
        AbstractC27389b.m140321f(jSONObject, "os", m140314c());
        return jSONObject;
    }
}
