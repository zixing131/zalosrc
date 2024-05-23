package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class yh4 extends lx0 {

    /* renamed from: q */
    private boolean f30951q;

    /* renamed from: r */
    private boolean f30952r;

    /* renamed from: s */
    private boolean f30953s;

    /* renamed from: t */
    private boolean f30954t;

    /* renamed from: u */
    private boolean f30955u;

    /* renamed from: v */
    private boolean f30956v;

    /* renamed from: w */
    private final SparseArray f30957w;

    /* renamed from: x */
    private final SparseBooleanArray f30958x;

    public yh4() {
        this.f30957w = new SparseArray();
        this.f30958x = new SparseBooleanArray();
        m28216v();
    }

    /* renamed from: v */
    private final void m28216v() {
        this.f30951q = true;
        this.f30952r = true;
        this.f30953s = true;
        this.f30954t = true;
        this.f30955u = true;
        this.f30956v = true;
    }

    @Override // com.google.android.gms.internal.ads.lx0
    /* renamed from: e */
    public final /* synthetic */ lx0 mo24411e(int i11, int i12, boolean z11) {
        super.mo24411e(i11, i12, true);
        return this;
    }

    /* renamed from: o */
    public final yh4 m28217o(int i11, boolean z11) {
        if (this.f30958x.get(i11) == z11) {
            return this;
        }
        if (z11) {
            this.f30958x.put(i11, true);
        } else {
            this.f30958x.delete(i11);
        }
        return this;
    }

    public yh4(Context context) {
        super.m24410d(context);
        Point m22335b = g92.m22335b(context);
        mo24411e(m22335b.x, m22335b.y, true);
        this.f30957w = new SparseArray();
        this.f30958x = new SparseBooleanArray();
        m28216v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ yh4(ai4 ai4Var, xh4 xh4Var) {
        super(ai4Var);
        this.f30951q = ai4Var.f17070D;
        this.f30952r = ai4Var.f17072F;
        this.f30953s = ai4Var.f17074H;
        this.f30954t = ai4Var.f17079M;
        this.f30955u = ai4Var.f17080N;
        this.f30956v = ai4Var.f17082P;
        SparseArray m20127a = ai4.m20127a(ai4Var);
        SparseArray sparseArray = new SparseArray();
        for (int i11 = 0; i11 < m20127a.size(); i11++) {
            sparseArray.put(m20127a.keyAt(i11), new HashMap((Map) m20127a.valueAt(i11)));
        }
        this.f30957w = sparseArray;
        this.f30958x = ai4.m20128b(ai4Var).clone();
    }
}
