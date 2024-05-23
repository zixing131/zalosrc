package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class l80 {

    /* renamed from: a */
    private final Object f23783a = new Object();

    /* renamed from: b */
    private final Object f23784b = new Object();

    /* renamed from: c */
    private u80 f23785c;

    /* renamed from: d */
    private u80 f23786d;

    /* renamed from: c */
    private static final Context m24167c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final u80 m24168a(Context context, zzcgv zzcgvVar, xw2 xw2Var) {
        u80 u80Var;
        synchronized (this.f23783a) {
            try {
                if (this.f23785c == null) {
                    this.f23785c = new u80(m24167c(context), zzcgvVar, (String) zzay.zzc().m21823b(AbstractC4554gx.f21186a), xw2Var);
                }
                u80Var = this.f23785c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u80Var;
    }

    /* renamed from: b */
    public final u80 m24169b(Context context, zzcgv zzcgvVar, xw2 xw2Var) {
        u80 u80Var;
        synchronized (this.f23784b) {
            try {
                if (this.f23786d == null) {
                    this.f23786d = new u80(m24167c(context), zzcgvVar, (String) AbstractC4629iz.f22560b.m24091e(), xw2Var);
                }
                u80Var = this.f23786d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u80Var;
    }
}
