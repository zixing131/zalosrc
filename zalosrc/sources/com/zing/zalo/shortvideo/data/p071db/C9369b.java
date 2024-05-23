package com.zing.zalo.shortvideo.data.p071db;

import p028b2.AbstractC2494c;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;
import y00.C30249c;

/* renamed from: com.zing.zalo.shortvideo.data.db.b */
/* loaded from: classes5.dex */
class C9369b extends AbstractC2494c {

    /* renamed from: c */
    private final InterfaceC2493b f49621c;

    public C9369b() {
        super(1, 2);
        this.f49621c = new C30249c();
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("DROP TABLE `ChannelTb`");
        interfaceC18182g.mo201u("DROP TABLE `UserTb`");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `ChannelConfigTb` (`id` INTEGER NOT NULL, `channelConfig` TEXT, PRIMARY KEY(`id`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `UserTable` (`userId` TEXT NOT NULL, `user` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `ChannelTable` (`userId` TEXT NOT NULL, `channel` TEXT, PRIMARY KEY(`userId`))");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogGetListTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
        this.f49621c.mo11583a(interfaceC18182g);
    }
}
