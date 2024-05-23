package com.zing.zalo.shortvideo.data.p071db;

import p028b2.AbstractC2494c;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;
import y00.C30250d;

/* renamed from: com.zing.zalo.shortvideo.data.db.c */
/* loaded from: classes5.dex */
class C9370c extends AbstractC2494c {

    /* renamed from: c */
    private final InterfaceC2493b f49622c;

    public C9370c() {
        super(2, 3);
        this.f49622c = new C30250d();
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("DROP TABLE `LogSessionTb`");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogActiveTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogSessionTable` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        this.f49622c.mo11583a(interfaceC18182g);
    }
}
