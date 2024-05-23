package zc0;

import android.graphics.Canvas;
import androidx.recyclerview.widget.C1919l;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zc0.e */
/* loaded from: classes4.dex */
public class C31787e extends C1919l.e {

    /* renamed from: d */
    private final AbstractC31783a f145930d;

    public C31787e(AbstractC31783a abstractC31783a) {
        this.f145930d = abstractC31783a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: A */
    public void mo10579A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC31783a abstractC31783a;
        if (i11 != 0 && (abstractC1876c0 instanceof InterfaceC31785c)) {
            ((InterfaceC31785c) abstractC1876c0).mo16606m();
        }
        if (i11 == 0 && (abstractC31783a = this.f145930d) != null) {
            abstractC31783a.mo16596N();
        }
        super.mo10579A(abstractC1876c0, i11);
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: B */
    public void mo10580B(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: c */
    public void mo10583c(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        super.mo10583c(recyclerView, abstractC1876c0);
        abstractC1876c0.f7784p.setAlpha(1.0f);
        if (abstractC1876c0 instanceof InterfaceC31785c) {
            ((InterfaceC31785c) abstractC1876c0).mo16604h();
        }
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: k */
    public int mo10589k(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0) {
        return C1919l.e.m10578t(3, 0);
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: q */
    public boolean mo10595q() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: r */
    public boolean mo10596r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: u */
    public void mo10597u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, float f11, float f12, int i11, boolean z11) {
        if (i11 == 1) {
            abstractC1876c0.f7784p.setAlpha(1.0f - (Math.abs(f11) / abstractC1876c0.f7784p.getWidth()));
            abstractC1876c0.f7784p.setTranslationX(f11);
            return;
        }
        super.mo10597u(canvas, recyclerView, abstractC1876c0, f11, f12, i11, z11);
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: y */
    public boolean mo10601y(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02) {
        if (abstractC1876c0.m9931C() != abstractC1876c02.m9931C()) {
            return false;
        }
        this.f145930d.mo16594L(abstractC1876c0.m9929A(), abstractC1876c02.m9929A());
        return true;
    }

    @Override // androidx.recyclerview.widget.C1919l.e
    /* renamed from: z */
    public void mo10602z(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, RecyclerView.AbstractC1876c0 abstractC1876c02, int i12, int i13, int i14) {
        super.mo10602z(recyclerView, abstractC1876c0, i11, abstractC1876c02, i12, i13, i14);
        this.f145930d.mo16595M(i11, i12);
    }
}
