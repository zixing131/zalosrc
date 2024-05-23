package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import p182g7.AbstractRunnableC19268j;
import p182g7.C19267i;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.review.f */
/* loaded from: classes3.dex */
public final class C6509f extends AbstractRunnableC19268j {

    /* renamed from: q */
    final /* synthetic */ C22890k f36332q;

    /* renamed from: r */
    final /* synthetic */ C6512i f36333r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6509f(C6512i c6512i, C22890k c22890k, C22890k c22890k2) {
        super(c22890k);
        this.f36333r = c6512i;
        this.f36332q = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, g7.f] */
    @Override // p182g7.AbstractRunnableC19268j
    /* renamed from: a */
    protected final void mo33379a() {
        C19267i c19267i;
        String str;
        String str2;
        String str3;
        try {
            ?? m101001e = this.f36333r.f36339a.m101001e();
            str2 = this.f36333r.f36340b;
            Bundle m33384a = AbstractC6513j.m33384a();
            C6512i c6512i = this.f36333r;
            C22890k c22890k = this.f36332q;
            str3 = c6512i.f36340b;
            m101001e.mo100975H0(str2, m33384a, new BinderC6511h(c6512i, c22890k, str3));
        } catch (RemoteException e11) {
            c19267i = C6512i.f36338c;
            str = this.f36333r.f36340b;
            c19267i.m100980c(e11, "error requesting in-app review for %s", str);
            this.f36332q.m117597d(new RuntimeException(e11));
        }
    }
}
