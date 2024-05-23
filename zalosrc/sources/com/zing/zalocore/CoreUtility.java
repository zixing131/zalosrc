package com.zing.zalocore;

import android.content.Context;
import com.zing.zalo.utils.Keep;
import fm0.InterfaceC19024a;
import java.util.concurrent.atomic.AtomicBoolean;
import lm0.InterfaceC22529a;

/* loaded from: classes.dex */
public class CoreUtility {

    /* renamed from: a */
    public static String f89225a = "";

    /* renamed from: b */
    public static String f89226b = "";

    /* renamed from: c */
    public static String f89227c = "";

    /* renamed from: d */
    public static String f89228d = "";

    /* renamed from: e */
    public static String f89229e = "";

    /* renamed from: f */
    public static String f89230f = "";

    /* renamed from: g */
    public static String f89231g = "";

    /* renamed from: h */
    public static String f89232h = "";

    /* renamed from: i */
    public static String f89233i = "";

    /* renamed from: j */
    public static String f89234j = "";

    /* renamed from: k */
    public static AtomicBoolean f89235k = new AtomicBoolean(false);

    /* renamed from: l */
    public static int f89236l = 0;

    /* renamed from: m */
    public static long f89237m = 0;

    /* renamed from: n */
    public static long f89238n = 0;

    /* renamed from: o */
    public static boolean f89239o = false;

    /* renamed from: p */
    public static String f89240p = "";

    /* renamed from: q */
    public static String f89241q = "";

    /* renamed from: r */
    public static String f89242r = "https://qos-talk.zaloapp.com/api/qos/uploadtestlog";

    /* renamed from: s */
    public static InterfaceC22529a f89243s = null;

    /* renamed from: t */
    public static Context f89244t;

    /* renamed from: u */
    public static InterfaceC19024a f89245u;

    /* renamed from: a */
    public static InterfaceC19024a m93148a() {
        return f89245u;
    }

    /* renamed from: b */
    public static void m93149b(Context context) {
    }

    /* renamed from: c */
    public static void m93150c(Context context) {
        Context applicationContext = context.getApplicationContext();
        f89244t = applicationContext;
        m93149b(applicationContext);
    }

    /* renamed from: d */
    public static void m93151d(InterfaceC19024a interfaceC19024a) {
        f89245u = interfaceC19024a;
    }

    @Keep
    public static Context getAppContext() {
        return f89244t;
    }
}
