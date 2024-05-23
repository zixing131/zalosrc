package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1336f {

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static IBinder m6714a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m6715b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m6712a(Bundle bundle, String str) {
        return a.m6714a(bundle, str);
    }

    /* renamed from: b */
    public static void m6713b(Bundle bundle, String str, IBinder iBinder) {
        a.m6715b(bundle, str, iBinder);
    }
}
