package androidx.work.impl;

import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.p */
/* loaded from: classes.dex */
public final class C2216p extends AbstractC2494c {

    /* renamed from: c */
    public static final C2216p f9292c = new C2216p();

    private C2216p() {
        super(8, 9);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
