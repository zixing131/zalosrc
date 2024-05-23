package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p014a8.InterfaceC0650a;
import p199h6.C19882a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes.dex */
public final class C6542e implements C19882a.a {

    /* renamed from: a */
    final /* synthetic */ C6543f f36399a;

    public C6542e(C6543f c6543f) {
        this.f36399a = c6543f;
    }

    @Override // p230i6.InterfaceC20329u
    /* renamed from: a */
    public final void mo31470a(String str, String str2, Bundle bundle, long j11) {
        InterfaceC0650a.b bVar;
        if (str != null && AbstractC6539b.m33466c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j11);
            bundle2.putBundle("params", bundle);
            bVar = this.f36399a.f36400a;
            bVar.mo937a(3, bundle2);
        }
    }
}
