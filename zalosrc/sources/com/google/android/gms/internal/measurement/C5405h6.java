package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.AbstractC1391d;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
/* loaded from: classes.dex */
public final class C5405h6 implements InterfaceC5354e6 {

    /* renamed from: c */
    private static C5405h6 f32399c;

    /* renamed from: a */
    private final Context f32400a;

    /* renamed from: b */
    private final ContentObserver f32401b;

    private C5405h6() {
        this.f32400a = null;
        this.f32401b = null;
    }

    /* renamed from: a */
    public static C5405h6 m29181a(Context context) {
        C5405h6 c5405h6;
        C5405h6 c5405h62;
        synchronized (C5405h6.class) {
            try {
                if (f32399c == null) {
                    if (AbstractC1391d.m6999b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        c5405h62 = new C5405h6(context);
                    } else {
                        c5405h62 = new C5405h6();
                    }
                    f32399c = c5405h62;
                }
                c5405h6 = f32399c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5405h6;
    }

    /* renamed from: d */
    public static synchronized void m29182d() {
        Context context;
        synchronized (C5405h6.class) {
            try {
                C5405h6 c5405h6 = f32399c;
                if (c5405h6 != null && (context = c5405h6.f32400a) != null && c5405h6.f32401b != null) {
                    context.getContentResolver().unregisterContentObserver(f32399c.f32401b);
                }
                f32399c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5354e6
    /* renamed from: b */
    public final String zzb(String str) {
        Context context = this.f32400a;
        if (context != null && !AbstractC5659w5.m29980a(context)) {
            try {
                return (String) AbstractC5320c6.m28968a(new InterfaceC5337d6() { // from class: com.google.android.gms.internal.measurement.f6

                    /* renamed from: b */
                    public final /* synthetic */ String f32370b;

                    public /* synthetic */ C5371f6(String str2) {
                        r2 = str2;
                    }

                    @Override // com.google.android.gms.internal.measurement.InterfaceC5337d6
                    public final Object zza() {
                        return C5405h6.this.m29184c(r2);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str2));
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ String m29184c(String str) {
        return AbstractC5625u5.m29676a(this.f32400a.getContentResolver(), str, null);
    }

    private C5405h6(Context context) {
        this.f32400a = context;
        C5388g6 c5388g6 = new C5388g6(this, null);
        this.f32401b = c5388g6;
        context.getContentResolver().registerContentObserver(AbstractC5625u5.f32823a, true, c5388g6);
    }
}
