package androidx.work.impl;

import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.l0 */
/* loaded from: classes.dex */
class C2209l0 extends AbstractC2494c {
    public C2209l0() {
        super(18, 19);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
