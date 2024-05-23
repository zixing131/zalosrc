package com.google.android.gms.internal.ads;

import p342m6.C22890k;

/* loaded from: classes2.dex */
public abstract class b43 implements Runnable {

    /* renamed from: p */
    private final C22890k f17579p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b43() {
        this.f17579p = null;
    }

    /* renamed from: a */
    protected abstract void mo20397a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C22890k m20398b() {
        return this.f17579p;
    }

    /* renamed from: c */
    public final void m20399c(Exception exc) {
        C22890k c22890k = this.f17579p;
        if (c22890k != null) {
            c22890k.m117597d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo20397a();
        } catch (Exception e11) {
            m20399c(e11);
        }
    }

    public b43(C22890k c22890k) {
        this.f17579p = c22890k;
    }
}
