package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
/* loaded from: classes.dex */
public abstract class AbstractC1933z extends RecyclerView.AbstractC1885l {

    /* renamed from: g */
    boolean f8223g = true;

    /* renamed from: B */
    public abstract boolean mo10483B(RecyclerView.AbstractC1876c0 abstractC1876c0);

    /* renamed from: C */
    public abstract boolean mo10484C(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, int i11, int i12, int i13, int i14);

    /* renamed from: D */
    public abstract boolean mo10485D(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14);

    /* renamed from: E */
    public abstract boolean mo10486E(RecyclerView.AbstractC1876c0 abstractC1876c0);

    /* renamed from: F */
    public final void m10678F(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        mo10686N(abstractC1876c0);
        m10042h(abstractC1876c0);
    }

    /* renamed from: G */
    public final void m10679G(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10687O(abstractC1876c0);
    }

    /* renamed from: H */
    public final void m10680H(RecyclerView.AbstractC1876c0 abstractC1876c0, boolean z11) {
        m10688P(abstractC1876c0, z11);
        m10042h(abstractC1876c0);
    }

    /* renamed from: I */
    public final void m10681I(RecyclerView.AbstractC1876c0 abstractC1876c0, boolean z11) {
        m10689Q(abstractC1876c0, z11);
    }

    /* renamed from: J */
    public final void m10682J(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10690R(abstractC1876c0);
        m10042h(abstractC1876c0);
    }

    /* renamed from: K */
    public final void m10683K(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10691S(abstractC1876c0);
    }

    /* renamed from: L */
    public final void m10684L(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10692T(abstractC1876c0);
        m10042h(abstractC1876c0);
    }

    /* renamed from: M */
    public final void m10685M(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        m10693U(abstractC1876c0);
    }

    /* renamed from: N */
    public void mo10686N(RecyclerView.AbstractC1876c0 abstractC1876c0) {
    }

    /* renamed from: O */
    public void m10687O(RecyclerView.AbstractC1876c0 abstractC1876c0) {
    }

    /* renamed from: P */
    public void m10688P(RecyclerView.AbstractC1876c0 abstractC1876c0, boolean z11) {
    }

    /* renamed from: Q */
    public void m10689Q(RecyclerView.AbstractC1876c0 abstractC1876c0, boolean z11) {
    }

    /* renamed from: R */
    public void m10690R(RecyclerView.AbstractC1876c0 abstractC1876c0) {
    }

    /* renamed from: S */
    public void m10691S(RecyclerView.AbstractC1876c0 abstractC1876c0) {
    }

    /* renamed from: T */
    public void m10692T(RecyclerView.AbstractC1876c0 abstractC1876c0) {
    }

    /* renamed from: U */
    public void m10693U(RecyclerView.AbstractC1876c0 abstractC1876c0) {
    }

    /* renamed from: V */
    public void m10694V(boolean z11) {
        this.f8223g = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: a */
    public boolean mo10036a(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2) {
        int i11;
        int i12;
        if (cVar != null && ((i11 = cVar.f7806a) != (i12 = cVar2.f7806a) || cVar.f7807b != cVar2.f7807b)) {
            return mo10485D(abstractC1876c0, i11, cVar.f7807b, i12, cVar2.f7807b);
        }
        return mo10483B(abstractC1876c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: b */
    public boolean mo10037b(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2) {
        int i11;
        int i12;
        int i13 = cVar.f7806a;
        int i14 = cVar.f7807b;
        if (abstractC1876c02.m9955f0()) {
            int i15 = cVar.f7806a;
            i12 = cVar.f7807b;
            i11 = i15;
        } else {
            i11 = cVar2.f7806a;
            i12 = cVar2.f7807b;
        }
        return mo10484C(abstractC1876c0, abstractC1876c02, i13, i14, i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: c */
    public boolean mo10038c(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2) {
        int i11;
        int i12;
        int i13 = cVar.f7806a;
        int i14 = cVar.f7807b;
        View view = abstractC1876c0.f7784p;
        if (cVar2 == null) {
            i11 = view.getLeft();
        } else {
            i11 = cVar2.f7806a;
        }
        int i15 = i11;
        if (cVar2 == null) {
            i12 = view.getTop();
        } else {
            i12 = cVar2.f7807b;
        }
        int i16 = i12;
        if (!abstractC1876c0.m9941Q() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            return mo10485D(abstractC1876c0, i13, i14, i15, i16);
        }
        return mo10486E(abstractC1876c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: d */
    public boolean mo10039d(RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1885l.c cVar, RecyclerView.AbstractC1885l.c cVar2) {
        int i11 = cVar.f7806a;
        int i12 = cVar2.f7806a;
        if (i11 == i12 && cVar.f7807b == cVar2.f7807b) {
            m10682J(abstractC1876c0);
            return false;
        }
        return mo10485D(abstractC1876c0, i11, cVar.f7807b, i12, cVar2.f7807b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
    /* renamed from: f */
    public boolean mo10040f(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (this.f8223g && !abstractC1876c0.m9939O()) {
            return false;
        }
        return true;
    }
}
