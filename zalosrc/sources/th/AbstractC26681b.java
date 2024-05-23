package th;

import android.os.Build;
import me0.AbstractC23059e9;

/* renamed from: th.b */
/* loaded from: classes.dex */
public abstract class AbstractC26681b {

    /* renamed from: a */
    public static final boolean f126356a;

    /* renamed from: b */
    public static final boolean f126357b;

    /* renamed from: c */
    public static final boolean f126358c;

    /* renamed from: d */
    public static final boolean f126359d;

    /* renamed from: e */
    public static final boolean f126360e;

    /* renamed from: f */
    public static final boolean f126361f;

    /* renamed from: g */
    public static final boolean f126362g;

    /* renamed from: h */
    public static boolean f126363h;

    /* renamed from: i */
    public static boolean f126364i;

    /* renamed from: j */
    public static boolean f126365j;

    /* renamed from: k */
    public static boolean f126366k;

    /* renamed from: l */
    public static boolean f126367l;

    /* renamed from: m */
    public static boolean f126368m;

    /* renamed from: n */
    public static boolean f126369n;

    /* renamed from: o */
    public static boolean f126370o;

    /* renamed from: p */
    public static boolean f126371p;

    /* renamed from: q */
    public static boolean f126372q;

    /* renamed from: r */
    public static boolean f126373r;

    /* renamed from: s */
    public static boolean f126374s;

    /* renamed from: t */
    public static int f126375t;

    /* renamed from: u */
    public static boolean f126376u;

    /* renamed from: v */
    public static boolean f126377v;

    /* renamed from: w */
    public static boolean f126378w;

    /* renamed from: x */
    public static boolean f126379x;

    /* renamed from: y */
    public static boolean f126380y;

    static {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (i11 > 30 || AbstractC23059e9.m118341t())) {
            z11 = false;
        } else {
            z11 = true;
        }
        f126356a = z11;
        if (i11 >= 30 && !AbstractC23059e9.m118341t()) {
            z12 = true;
        } else {
            z12 = false;
        }
        f126357b = z12;
        if (i11 >= 26) {
            z13 = true;
        } else {
            z13 = false;
        }
        f126358c = z13;
        if (i11 < 33) {
            z14 = true;
        } else {
            z14 = false;
        }
        f126359d = z14;
        f126360e = z11;
        if (i11 >= 26) {
            z15 = true;
        } else {
            z15 = false;
        }
        f126361f = z15;
        if (i11 >= 26) {
            z16 = true;
        } else {
            z16 = false;
        }
        f126362g = z16;
        f126363h = true;
        f126364i = true;
        f126365j = true;
        f126366k = true;
        f126367l = false;
        f126368m = false;
        f126369n = false;
        f126370o = false;
        f126371p = true;
        f126372q = false;
        f126373r = false;
        f126374s = true;
        f126375t = 6;
        f126376u = false;
        f126377v = false;
        f126378w = false;
        f126379x = false;
        f126380y = false;
    }
}
