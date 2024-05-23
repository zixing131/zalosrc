package com.zing.zalo.zinstant;

import ik0.AbstractC20601x;
import ik0.InterfaceC20603z;

/* renamed from: com.zing.zalo.zinstant.t0 */
/* loaded from: classes.dex */
public class C17181t0 implements InterfaceC20603z {
    /* renamed from: b */
    private int m91787b(int i11) {
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 7) ? 2 : 3;
    }

    @Override // ik0.InterfaceC20603z
    /* renamed from: a */
    public int mo91788a(AbstractC20601x abstractC20601x) {
        return Integer.MAX_VALUE - (((int) (System.currentTimeMillis() >> 10)) + (m91787b(abstractC20601x.mo107090i()) << 2));
    }
}
