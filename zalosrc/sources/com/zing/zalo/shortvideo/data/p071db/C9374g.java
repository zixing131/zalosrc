package com.zing.zalo.shortvideo.data.p071db;

import p028b2.AbstractC2494c;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;
import y00.C30254h;

/* renamed from: com.zing.zalo.shortvideo.data.db.g */
/* loaded from: classes5.dex */
class C9374g extends AbstractC2494c {

    /* renamed from: c */
    private final InterfaceC2493b f49711c;

    public C9374g() {
        super(6, 7);
        this.f49711c = new C30254h();
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogEventStreamTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogHistoryLivestreamTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogViewStreamTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        this.f49711c.mo11583a(interfaceC18182g);
    }
}
