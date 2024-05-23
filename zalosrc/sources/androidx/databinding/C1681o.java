package androidx.databinding;

import android.view.View;
import android.view.ViewStub;

/* renamed from: androidx.databinding.o */
/* loaded from: classes2.dex */
public class C1681o {

    /* renamed from: a */
    private ViewStub f6737a;

    /* renamed from: b */
    private ViewDataBinding f6738b;

    /* renamed from: c */
    private View f6739c;

    /* renamed from: d */
    private ViewStub.OnInflateListener f6740d;

    /* renamed from: e */
    private ViewDataBinding f6741e;

    /* renamed from: f */
    private ViewStub.OnInflateListener f6742f;

    /* renamed from: androidx.databinding.o$a */
    /* loaded from: classes2.dex */
    class a implements ViewStub.OnInflateListener {
        a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            C1681o.this.f6739c = view;
            C1681o c1681o = C1681o.this;
            c1681o.f6741e.getClass();
            c1681o.f6738b = AbstractC1673g.m8550a(null, view, viewStub.getLayoutResource());
            C1681o.this.f6737a = null;
            if (C1681o.this.f6740d != null) {
                C1681o.this.f6740d.onInflate(viewStub, view);
                C1681o.this.f6740d = null;
            }
            C1681o.this.f6741e.mo8513x();
            C1681o.this.f6741e.m8510p();
        }
    }

    public C1681o(ViewStub viewStub) {
        a aVar = new a();
        this.f6742f = aVar;
        this.f6737a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    /* renamed from: g */
    public ViewDataBinding m8568g() {
        return this.f6738b;
    }

    /* renamed from: h */
    public ViewStub m8569h() {
        return this.f6737a;
    }

    /* renamed from: i */
    public boolean m8570i() {
        return this.f6739c != null;
    }

    /* renamed from: j */
    public void m8571j(ViewDataBinding viewDataBinding) {
        this.f6741e = viewDataBinding;
    }

    /* renamed from: k */
    public void m8572k(ViewStub.OnInflateListener onInflateListener) {
        if (this.f6737a != null) {
            this.f6740d = onInflateListener;
        }
    }
}
