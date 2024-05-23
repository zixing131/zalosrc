package androidx.work.impl;

import androidx.work.InterfaceC2136b;
import fn0.AbstractC19074t;
import p008a2.AbstractC0086w;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.d */
/* loaded from: classes.dex */
public final class C2185d extends AbstractC0086w.b {

    /* renamed from: a */
    private final InterfaceC2136b f9245a;

    public C2185d(InterfaceC2136b interfaceC2136b) {
        AbstractC19074t.m100208f(interfaceC2136b, "clock");
        this.f9245a = interfaceC2136b;
    }

    /* renamed from: d */
    private final long m11687d() {
        return this.f9245a.mo11468a() - AbstractC2188e0.f9249a;
    }

    /* renamed from: e */
    private final String m11688e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m11687d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // p008a2.AbstractC0086w.b
    /* renamed from: c */
    public void mo371c(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        super.mo371c(interfaceC18182g);
        interfaceC18182g.mo194e();
        try {
            interfaceC18182g.mo201u(m11688e());
            interfaceC18182g.mo196k();
        } finally {
            interfaceC18182g.mo197l();
        }
    }
}
