package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class am0 {

    /* renamed from: p */
    private final WeakReference f17181p;

    public am0(View view) {
        this.f17181p = new WeakReference(view);
    }

    /* renamed from: a */
    protected abstract void mo20173a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    protected abstract void mo20174b(ViewTreeObserver viewTreeObserver);

    /* renamed from: c */
    protected final ViewTreeObserver m20175c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f17181p.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void m20176d() {
        ViewTreeObserver m20175c = m20175c();
        if (m20175c != null) {
            mo20173a(m20175c);
        }
    }

    /* renamed from: e */
    public final void m20177e() {
        ViewTreeObserver m20175c = m20175c();
        if (m20175c != null) {
            mo20174b(m20175c);
        }
    }
}
