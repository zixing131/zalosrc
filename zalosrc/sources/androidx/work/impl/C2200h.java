package androidx.work.impl;

import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.h */
/* loaded from: classes.dex */
public final class C2200h extends AbstractC2494c {

    /* renamed from: c */
    public static final C2200h f9282c = new C2200h();

    private C2200h() {
        super(12, 13);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        interfaceC18182g.mo201u("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
