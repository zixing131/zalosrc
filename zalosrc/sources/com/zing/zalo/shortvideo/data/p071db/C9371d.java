package com.zing.zalo.shortvideo.data.p071db;

import p028b2.AbstractC2494c;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;
import y00.C30251e;

/* renamed from: com.zing.zalo.shortvideo.data.db.d */
/* loaded from: classes5.dex */
class C9371d extends AbstractC2494c {

    /* renamed from: c */
    private final InterfaceC2493b f49623c;

    public C9371d() {
        super(3, 4);
        this.f49623c = new C30251e();
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `WatchCount` (`channelId` TEXT NOT NULL, `videoCount` INTEGER NOT NULL, `modifiedTime` INTEGER NOT NULL, PRIMARY KEY(`channelId`))");
        this.f49623c.mo11583a(interfaceC18182g);
    }
}
