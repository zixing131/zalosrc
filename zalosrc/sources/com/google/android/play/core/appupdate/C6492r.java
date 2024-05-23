package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import p051c7.AbstractRunnableC3326u;
import p051c7.C3325t;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.r */
/* loaded from: classes3.dex */
public final class C6492r extends AbstractRunnableC3326u {

    /* renamed from: q */
    final /* synthetic */ String f36301q;

    /* renamed from: r */
    final /* synthetic */ C22890k f36302r;

    /* renamed from: s */
    final /* synthetic */ C6497w f36303s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6492r(C6497w c6497w, C22890k c22890k, String str, C22890k c22890k2) {
        super(c22890k);
        this.f36303s = c6497w;
        this.f36301q = str;
        this.f36302r = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, c7.l] */
    @Override // p051c7.AbstractRunnableC3326u
    /* renamed from: a */
    protected final void mo16750a() {
        C3325t c3325t;
        String str;
        try {
            ?? m16774e = this.f36303s.f36314a.m16774e();
            C6497w c6497w = this.f36303s;
            str = c6497w.f36315b;
            m16774e.mo16784j4(str, C6497w.m33354b(c6497w, this.f36301q), new BinderC6496v(this.f36303s, this.f36302r, this.f36301q));
        } catch (RemoteException e11) {
            c3325t = C6497w.f36312e;
            c3325t.m16799c(e11, "requestUpdateInfo(%s)", this.f36301q);
            this.f36302r.m117597d(new RuntimeException(e11));
        }
    }
}
