package p178g3;

import android.content.Context;
import com.adtima.Adtima;

/* renamed from: g3.c */
/* loaded from: classes2.dex */
public class C19208c {

    /* renamed from: a */
    private static C19208c f95650a;

    private C19208c() {
    }

    /* renamed from: b */
    public static C19208c m100802b() {
        if (f95650a == null) {
            f95650a = new C19208c();
        }
        return f95650a;
    }

    /* renamed from: a */
    public Context m100803a(Context context) {
        if (context != null) {
            return context;
        }
        try {
            return Adtima.SharedContext;
        } catch (Exception e11) {
            Adtima.m18329e("ZAdsContextHelper", "recheckContext", e11);
            return context;
        }
    }
}
