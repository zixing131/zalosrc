package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.w */
/* loaded from: classes2.dex */
public class C4268w {

    /* renamed from: e */
    private static final C4268w f16785e = new C4268w(true, 3, 1, null, null);

    /* renamed from: a */
    final boolean f16786a;

    /* renamed from: b */
    final String f16787b;

    /* renamed from: c */
    final Throwable f16788c;

    /* renamed from: d */
    final int f16789d;

    private C4268w(boolean z11, int i11, int i12, String str, Throwable th2) {
        this.f16786a = z11;
        this.f16789d = i11;
        this.f16787b = str;
        this.f16788c = th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4268w m19884b() {
        return f16785e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C4268w m19885c(String str) {
        return new C4268w(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C4268w m19886d(String str, Throwable th2) {
        return new C4268w(false, 1, 5, str, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C4268w m19887f(int i11) {
        return new C4268w(true, i11, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C4268w m19888g(int i11, int i12, String str, Throwable th2) {
        return new C4268w(false, i11, i12, str, th2);
    }

    /* renamed from: a */
    String mo19883a() {
        return this.f16787b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m19889e() {
        if (!this.f16786a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f16788c != null) {
                mo19883a();
            } else {
                mo19883a();
            }
        }
    }
}
