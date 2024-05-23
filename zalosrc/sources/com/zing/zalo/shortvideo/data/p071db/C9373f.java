package com.zing.zalo.shortvideo.data.p071db;

import p028b2.AbstractC2494c;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;
import y00.C30253g;

/* renamed from: com.zing.zalo.shortvideo.data.db.f */
/* loaded from: classes5.dex */
class C9373f extends AbstractC2494c {

    /* renamed from: c */
    private final InterfaceC2493b f49710c;

    public C9373f() {
        super(5, 6);
        this.f49710c = new C30253g();
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `tb_view_history` (`rowid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `video_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        interfaceC18182g.mo201u("CREATE UNIQUE INDEX IF NOT EXISTS `index_tb_view_history_user_id_video_id` ON `tb_view_history` (`user_id`, `video_id`)");
        this.f49710c.mo11583a(interfaceC18182g);
    }
}
