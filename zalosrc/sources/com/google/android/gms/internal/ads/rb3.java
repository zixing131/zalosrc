package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class rb3 extends tb3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public rb3(x73 x73Var, boolean z11) {
        super(x73Var, true);
        m23590R();
    }

    @Override // com.google.android.gms.internal.ads.tb3
    /* renamed from: V */
    public final /* bridge */ /* synthetic */ Object mo26063V(List list) {
        Object obj;
        ArrayList m25670a = q83.m25670a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb3 sb3Var = (sb3) it.next();
            if (sb3Var != null) {
                obj = sb3Var.f27611a;
            } else {
                obj = null;
            }
            m25670a.add(obj);
        }
        return Collections.unmodifiableList(m25670a);
    }
}
