package androidx.work.impl;

import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.g */
/* loaded from: classes.dex */
public final class C2198g extends AbstractC2494c {

    /* renamed from: c */
    public static final C2198g f9279c = new C2198g();

    private C2198g() {
        super(11, 12);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
