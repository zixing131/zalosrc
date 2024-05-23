package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zl0 extends am0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: q */
    private final WeakReference f31557q;

    public zl0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f31557q = new WeakReference(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.am0
    /* renamed from: a */
    protected final void mo20173a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.am0
    /* renamed from: b */
    protected final void mo20174b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f31557q.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m20177e();
        }
    }
}
