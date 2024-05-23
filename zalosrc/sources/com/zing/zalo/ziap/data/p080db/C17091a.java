package com.zing.zalo.ziap.data.p080db;

import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: com.zing.zalo.ziap.data.db.a */
/* loaded from: classes7.dex */
class C17091a extends AbstractC2494c {
    public C17091a() {
        super(1, 2);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("ALTER TABLE `za_billing` ADD COLUMN `obfuscated_account_id` TEXT NOT NULL DEFAULT ''");
    }
}
