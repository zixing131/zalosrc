package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.v6 */
/* loaded from: classes2.dex */
public final class C5083v6 implements InterfaceC4823o6 {

    /* renamed from: a */
    private final wz1 f29201a = new wz1(new byte[4], 4);

    /* renamed from: b */
    final /* synthetic */ C5158x6 f29202b;

    public C5083v6(C5158x6 c5158x6) {
        this.f29202b = c5158x6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823o6
    /* renamed from: a */
    public final void mo21618a(x02 x02Var) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i11;
        if (x02Var.m27788s() != 0 || (x02Var.m27788s() & 128) == 0) {
            return;
        }
        x02Var.m27776g(6);
        int m27778i = x02Var.m27778i() / 4;
        for (int i12 = 0; i12 < m27778i; i12++) {
            x02Var.m27770a(this.f29201a, 4);
            int m27746c = this.f29201a.m27746c(16);
            this.f29201a.m27753j(3);
            if (m27746c == 0) {
                this.f29201a.m27753j(13);
            } else {
                int m27746c2 = this.f29201a.m27746c(13);
                sparseArray2 = this.f29202b.f30352e;
                if (sparseArray2.get(m27746c2) == null) {
                    C5158x6 c5158x6 = this.f29202b;
                    sparseArray3 = c5158x6.f30352e;
                    sparseArray3.put(m27746c2, new C4860p6(new C5120w6(c5158x6, m27746c2)));
                    C5158x6 c5158x62 = this.f29202b;
                    i11 = c5158x62.f30358k;
                    c5158x62.f30358k = i11 + 1;
                }
            }
        }
        sparseArray = this.f29202b.f30352e;
        sparseArray.remove(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823o6
    /* renamed from: b */
    public final void mo21619b(a72 a72Var, mm4 mm4Var, C4344b7 c4344b7) {
    }
}
