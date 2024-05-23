package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class kd2 implements qj2 {

    /* renamed from: a */
    private final boolean f23216a;

    /* renamed from: b */
    private final ArrayList f23217b = new ArrayList(1);

    /* renamed from: c */
    private int f23218c;

    /* renamed from: d */
    private wo2 f23219d;

    /* JADX INFO: Access modifiers changed from: protected */
    public kd2(boolean z11) {
        this.f23216a = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m23893b(int i11) {
        wo2 wo2Var = this.f23219d;
        int i12 = g92.f20474a;
        for (int i13 = 0; i13 < this.f23218c; i13++) {
            ((dc3) this.f23217b.get(i13)).mo21343i(this, wo2Var, this.f23216a, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: g */
    public final void mo20854g(dc3 dc3Var) {
        dc3Var.getClass();
        if (!this.f23217b.contains(dc3Var)) {
            this.f23217b.add(dc3Var);
            this.f23218c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m23894k() {
        wo2 wo2Var = this.f23219d;
        int i11 = g92.f20474a;
        for (int i12 = 0; i12 < this.f23218c; i12++) {
            ((dc3) this.f23217b.get(i12)).mo21341A(this, wo2Var, this.f23216a);
        }
        this.f23219d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m23895l(wo2 wo2Var) {
        for (int i11 = 0; i11 < this.f23218c; i11++) {
            ((dc3) this.f23217b.get(i11)).mo21342D(this, wo2Var, this.f23216a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m23896m(wo2 wo2Var) {
        this.f23219d = wo2Var;
        for (int i11 = 0; i11 < this.f23218c; i11++) {
            ((dc3) this.f23217b.get(i11)).mo21344x(this, wo2Var, this.f23216a);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }
}
