package androidx.work.impl;

import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.k0 */
/* loaded from: classes.dex */
class C2207k0 extends AbstractC2494c {
    public C2207k0() {
        super(17, 18);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        interfaceC18182g.mo201u("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
