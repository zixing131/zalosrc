package androidx.work.impl;

import android.os.Build;
import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.l */
/* loaded from: classes.dex */
public final class C2208l extends AbstractC2494c {

    /* renamed from: c */
    public static final C2208l f9287c = new C2208l();

    private C2208l() {
        super(3, 4);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        if (Build.VERSION.SDK_INT >= 23) {
            interfaceC18182g.mo201u("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
