package p208hf;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1928u;
import androidx.recyclerview.widget.C1924q;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: hf.a */
/* loaded from: classes3.dex */
public final class C20027a extends C1924q {

    /* renamed from: f */
    private AbstractC1928u f98462f;

    /* renamed from: g */
    private AbstractC1928u f98463g;

    /* renamed from: n */
    private final int m103959n(RecyclerView.AbstractC1888o abstractC1888o, View view, AbstractC1928u abstractC1928u) {
        float y11;
        int height;
        int mo10650h;
        if (AbstractC19074t.m100204b(abstractC1928u, this.f98463g)) {
            y11 = view.getX();
            height = view.getWidth() / 2;
        } else {
            y11 = view.getY();
            height = view.getHeight() / 2;
        }
        int i11 = (int) (y11 + height);
        if (abstractC1888o.m10107Y()) {
            mo10650h = abstractC1928u.mo10656n() + (abstractC1928u.mo10657o() / 2);
        } else {
            mo10650h = abstractC1928u.mo10650h() / 2;
        }
        return i11 - mo10650h;
    }

    /* renamed from: p */
    private final View m103960p(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u) {
        int mo10650h;
        float y11;
        int height;
        int m10110a = abstractC1888o.m10110a();
        View view = null;
        if (m10110a == 0) {
            return null;
        }
        if (abstractC1888o.m10107Y()) {
            mo10650h = abstractC1928u.mo10656n() + (abstractC1928u.mo10657o() / 2);
        } else {
            mo10650h = abstractC1928u.mo10650h() / 2;
        }
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < m10110a; i12++) {
            View m10105V = abstractC1888o.m10105V(i12);
            if (m10105V != null) {
                if (AbstractC19074t.m100204b(abstractC1928u, this.f98463g)) {
                    y11 = m10105V.getX();
                    height = m10105V.getWidth() / 2;
                } else {
                    y11 = m10105V.getY();
                    height = m10105V.getHeight() / 2;
                }
                int abs = Math.abs(((int) (y11 + height)) - mo10650h);
                if (abs < i11) {
                    view = m10105V;
                    i11 = abs;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:            if (r0.m10653k() != r2) goto L6;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC1928u m103961q(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC1928u abstractC1928u = this.f98463g;
        if (abstractC1928u != null) {
            AbstractC19074t.m100205c(abstractC1928u);
        }
        this.f98463g = AbstractC1928u.m10643a(abstractC1888o);
        AbstractC1928u abstractC1928u2 = this.f98463g;
        AbstractC19074t.m100205c(abstractC1928u2);
        return abstractC1928u2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:            if (r0.m10653k() != r2) goto L6;     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC1928u m103962r(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC1928u abstractC1928u = this.f98462f;
        if (abstractC1928u != null) {
            AbstractC19074t.m100205c(abstractC1928u);
        }
        this.f98462f = AbstractC1928u.m10645c(abstractC1888o);
        AbstractC1928u abstractC1928u2 = this.f98462f;
        AbstractC19074t.m100205c(abstractC1928u2);
        return abstractC1928u2;
    }

    @Override // androidx.recyclerview.widget.C1924q, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: c */
    public int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view) {
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        AbstractC19074t.m100208f(view, "targetView");
        int[] iArr = new int[2];
        if (abstractC1888o.mo9757x()) {
            iArr[0] = m103959n(abstractC1888o, view, m103961q(abstractC1888o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1888o.mo9758y()) {
            iArr[1] = m103959n(abstractC1888o, view, m103962r(abstractC1888o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C1924q, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: h */
    public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
        if (abstractC1888o == null) {
            return null;
        }
        if (abstractC1888o.mo9758y()) {
            return m103960p(abstractC1888o, m103962r(abstractC1888o));
        }
        if (!abstractC1888o.mo9757x()) {
            return null;
        }
        return m103960p(abstractC1888o, m103961q(abstractC1888o));
    }
}
