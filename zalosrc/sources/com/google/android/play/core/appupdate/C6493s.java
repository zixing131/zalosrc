package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import p051c7.AbstractRunnableC3326u;
import p051c7.C3325t;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.s */
/* loaded from: classes3.dex */
public final class C6493s extends AbstractRunnableC3326u {

    /* renamed from: q */
    final /* synthetic */ C22890k f36304q;

    /* renamed from: r */
    final /* synthetic */ String f36305r;

    /* renamed from: s */
    final /* synthetic */ C6497w f36306s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6493s(C6497w c6497w, C22890k c22890k, C22890k c22890k2, String str) {
        super(c22890k);
        this.f36306s = c6497w;
        this.f36304q = c22890k2;
        this.f36305r = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, c7.l] */
    @Override // p051c7.AbstractRunnableC3326u
    /* renamed from: a */
    protected final void mo16750a() {
        C3325t c3325t;
        String str;
        Bundle m33359i;
        try {
            ?? m16774e = this.f36306s.f36314a.m16774e();
            str = this.f36306s.f36315b;
            m33359i = C6497w.m33359i();
            m16774e.mo16785u4(str, m33359i, new BinderC6495u(this.f36306s, this.f36304q));
        } catch (RemoteException e11) {
            c3325t = C6497w.f36312e;
            c3325t.m16799c(e11, "completeUpdate(%s)", this.f36305r);
            this.f36304q.m117597d(new RuntimeException(e11));
        }
    }
}
