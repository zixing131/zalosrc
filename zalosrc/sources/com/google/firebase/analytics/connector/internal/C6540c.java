package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p014a8.InterfaceC0650a;
import p199h6.C19882a;
import p230i6.AbstractC20325q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* loaded from: classes3.dex */
public final class C6540c implements C19882a.a {

    /* renamed from: a */
    final /* synthetic */ C6541d f36394a;

    public C6540c(C6541d c6541d) {
        this.f36394a = c6541d;
    }

    @Override // p230i6.InterfaceC20329u
    /* renamed from: a */
    public final void mo31470a(String str, String str2, Bundle bundle, long j11) {
        InterfaceC0650a.b bVar;
        if (!this.f36394a.f36395a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        int i11 = AbstractC6539b.f36393g;
        String m106024a = AbstractC20325q.m106024a(str2);
        if (m106024a != null) {
            str2 = m106024a;
        }
        bundle2.putString("events", str2);
        bVar = this.f36394a.f36396b;
        bVar.mo937a(2, bundle2);
    }
}
