package ln0;

import fn0.AbstractC19074t;

/* renamed from: ln0.k */
/* loaded from: classes.dex */
abstract class AbstractC22542k {
    /* renamed from: a */
    public static final void m116578a(boolean z11, Number number) {
        AbstractC19074t.m100208f(number, "step");
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
