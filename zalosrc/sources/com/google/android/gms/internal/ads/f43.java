package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f43 extends b43 {

    /* renamed from: q */
    final /* synthetic */ l43 f20003q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f43(l43 l43Var) {
        this.f20003q = l43Var;
    }

    @Override // com.google.android.gms.internal.ads.b43
    /* renamed from: a */
    public final void mo20397a() {
        IInterface iInterface;
        a43 a43Var;
        Context context;
        ServiceConnection serviceConnection;
        l43 l43Var = this.f20003q;
        iInterface = l43Var.f23743m;
        if (iInterface != null) {
            a43Var = l43Var.f23732b;
            a43Var.m19981d("Unbind from service.", new Object[0]);
            l43 l43Var2 = this.f20003q;
            context = l43Var2.f23731a;
            serviceConnection = l43Var2.f23742l;
            context.unbindService(serviceConnection);
            this.f20003q.f23737g = false;
            this.f20003q.f23743m = null;
            this.f20003q.f23742l = null;
        }
        this.f20003q.m24127t();
    }
}
