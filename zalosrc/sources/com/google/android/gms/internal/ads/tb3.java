package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class tb3 extends jb3 {

    /* renamed from: E */
    private List f28282E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tb3(x73 x73Var, boolean z11) {
        super(x73Var, true, true);
        List m25670a;
        if (x73Var.isEmpty()) {
            m25670a = Collections.emptyList();
        } else {
            m25670a = q83.m25670a(x73Var.size());
        }
        for (int i11 = 0; i11 < x73Var.size(); i11++) {
            m25670a.add(null);
        }
        this.f28282E = m25670a;
    }

    @Override // com.google.android.gms.internal.ads.jb3
    /* renamed from: P */
    final void mo23588P(int i11, Object obj) {
        List list = this.f28282E;
        if (list != null) {
            list.set(i11, new sb3(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.jb3
    /* renamed from: Q */
    final void mo23589Q() {
        List list = this.f28282E;
        if (list != null) {
            mo20863g(mo26063V(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.jb3
    /* renamed from: U */
    public final void mo23593U(int i11) {
        super.mo23593U(i11);
        this.f28282E = null;
    }

    /* renamed from: V */
    abstract Object mo26063V(List list);
}
