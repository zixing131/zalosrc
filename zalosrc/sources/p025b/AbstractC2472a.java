package p025b;

import android.content.Context;

/* renamed from: b.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2472a {

    /* renamed from: a */
    public static Context f10076a;

    /* renamed from: b */
    public static int f10077b;

    /* renamed from: a */
    public static String m12486a() {
        try {
            return f10076a.getPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m12487b(Context context, boolean z11, int i11) {
        try {
            f10077b = i11;
            f10076a = context.getApplicationContext();
        } catch (Exception unused) {
        }
    }
}
