package com.zing.zalo.zinstant.component.p081ui.slider;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zinstant.component.p081ui.ZinstantView;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import nk0.C23855s0;
import nk0.InterfaceC23860v;

/* renamed from: com.zing.zalo.zinstant.component.ui.slider.a */
/* loaded from: classes7.dex */
public abstract class AbstractC17137a extends AbstractC1925r {

    /* renamed from: t */
    int f87624t;

    /* renamed from: u */
    int f87625u;

    /* renamed from: v */
    WeakReference f87626v;

    /* renamed from: w */
    private final b f87627w;

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.a$b */
    /* loaded from: classes7.dex */
    private static class b {

        /* renamed from: a */
        private final SparseArray f87628a = new SparseArray();

        /* renamed from: b */
        public void m91634b(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            this.f87628a.put(abstractC1876c0.hashCode(), abstractC1876c0);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.a$c */
    /* loaded from: classes7.dex */
    public static abstract class c {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m91636c(Object obj) {
            try {
                if (obj != null) {
                    mo91619b(obj);
                } else {
                    AbstractC20110a.m104538g("ItemHolder must be non-null!!!", new Object[0]);
                }
            } catch (ClassCastException e11) {
                AbstractC20110a.m104536e(e11);
            }
        }

        /* renamed from: b */
        protected abstract void mo91619b(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.a$d */
    /* loaded from: classes7.dex */
    public static class d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        ZinstantView f87629I;

        public d(ZinstantView zinstantView) {
            super(zinstantView);
            this.f87629I = zinstantView;
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.a$e */
    /* loaded from: classes7.dex */
    private static class e extends AbstractC1915h.d {
        private e() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(C23855s0 c23855s0, C23855s0 c23855s02) {
            if (c23855s0.f115177a == c23855s02.f115177a) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(C23855s0 c23855s0, C23855s0 c23855s02) {
            if (c23855s0.f115177a == c23855s02.f115177a) {
                return true;
            }
            return false;
        }
    }

    public AbstractC17137a(int i11, int i12, InterfaceC23860v interfaceC23860v) {
        super(new e());
        this.f87624t = i11;
        this.f87625u = i12;
        this.f87626v = new WeakReference(interfaceC23860v);
        this.f87627w = new b();
    }

    /* renamed from: Q */
    public void m91630Q(c cVar) {
        SparseArray sparseArray = this.f87627w.f87628a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVar.m91636c((d) sparseArray.valueAt(i11));
        }
    }

    /* renamed from: R */
    public void mo91631R(d dVar, int i11) {
        C23855s0 c23855s0 = dVar.f87629I.f87528p;
        C23855s0 c23855s02 = (C23855s0) m10633M(i11);
        if (c23855s0 != c23855s02 && c23855s0 != null && c23855s0.f115183g.get() == dVar.f87629I) {
            c23855s0.onPause();
            c23855s0.m124642g0(null);
        }
        dVar.f87629I.m91514m(c23855s02, (InterfaceC23860v) this.f87626v.get());
        dVar.f87629I.onStart();
        dVar.f87629I.onResume();
        this.f87627w.m91634b(dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public d mo9992C(ViewGroup viewGroup, int i11) {
        return new d(new ZinstantView(viewGroup.getContext()));
    }
}
