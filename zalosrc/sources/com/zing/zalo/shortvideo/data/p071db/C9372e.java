package com.zing.zalo.shortvideo.data.p071db;

import p028b2.AbstractC2494c;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;
import y00.C30252f;

/* renamed from: com.zing.zalo.shortvideo.data.db.e */
/* loaded from: classes5.dex */
class C9372e extends AbstractC2494c {

    /* renamed from: c */
    private final InterfaceC2493b f49624c;

    public C9372e() {
        super(4, 5);
        this.f49624c = new C30252f();
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogImpsAdsTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogViewVideoAdsTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogEventAdsTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        this.f49624c.mo11583a(interfaceC18182g);
    }
}
