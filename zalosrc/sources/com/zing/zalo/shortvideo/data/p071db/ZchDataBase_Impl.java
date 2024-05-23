package com.zing.zalo.shortvideo.data.p071db;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p008a2.AbstractC0086w;
import p008a2.C0069h;
import p008a2.C0080q;
import p008a2.C0088y;
import p046c2.AbstractC3206b;
import p046c2.C3209e;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;
import z00.C31141b;
import z00.C31143d;
import z00.C31145f;
import z00.C31147h;
import z00.InterfaceC31140a;
import z00.InterfaceC31142c;
import z00.InterfaceC31144e;
import z00.InterfaceC31146g;

/* loaded from: classes5.dex */
public final class ZchDataBase_Impl extends ZchDataBase {

    /* renamed from: q */
    private volatile InterfaceC31140a f49607q;

    /* renamed from: r */
    private volatile InterfaceC31142c f49608r;

    /* renamed from: s */
    private volatile InterfaceC31146g f49609s;

    /* renamed from: t */
    private volatile InterfaceC31144e f49610t;

    /* renamed from: com.zing.zalo.shortvideo.data.db.ZchDataBase_Impl$a */
    /* loaded from: classes5.dex */
    class C9367a extends C0088y.b {
        C9367a(int i11) {
            super(i11);
        }

        @Override // p008a2.C0088y.b
        /* renamed from: a */
        public void mo394a(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogViewVideoTB` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogHistoryVideoTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogImpsTB` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogEventTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogUploadTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogGetListTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `ChannelConfigTb` (`id` INTEGER NOT NULL, `channelConfig` TEXT, PRIMARY KEY(`id`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `ChannelTable` (`userId` TEXT NOT NULL, `channel` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `UserTable` (`userId` TEXT NOT NULL, `user` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogActiveTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogSessionTable` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `WatchCount` (`channelId` TEXT NOT NULL, `videoCount` INTEGER NOT NULL, `modifiedTime` INTEGER NOT NULL, PRIMARY KEY(`channelId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogEventAdsTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogImpsAdsTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogViewVideoAdsTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `tb_view_history` (`rowid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `video_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
            interfaceC18182g.mo201u("CREATE UNIQUE INDEX IF NOT EXISTS `index_tb_view_history_user_id_video_id` ON `tb_view_history` (`user_id`, `video_id`)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogHistoryLivestreamTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogViewStreamTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `LogEventStreamTb` (`userId` TEXT NOT NULL, `logs` TEXT, PRIMARY KEY(`userId`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC18182g.mo201u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '634fedbbae091c87240d119378385f80')");
        }

        @Override // p008a2.C0088y.b
        /* renamed from: b */
        public void mo395b(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogViewVideoTB`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogHistoryVideoTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogImpsTB`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogEventTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogUploadTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogGetListTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `ChannelConfigTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `ChannelTable`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `UserTable`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogActiveTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogSessionTable`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `WatchCount`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogEventAdsTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogImpsAdsTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogViewVideoAdsTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `tb_view_history`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogHistoryLivestreamTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogViewStreamTb`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `LogEventStreamTb`");
            if (((AbstractC0086w) ZchDataBase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) ZchDataBase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) ZchDataBase_Impl.this).f375h.get(i11)).m370b(interfaceC18182g);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p008a2.C0088y.b
        /* renamed from: c */
        public void mo396c(InterfaceC18182g interfaceC18182g) {
            if (((AbstractC0086w) ZchDataBase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) ZchDataBase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) ZchDataBase_Impl.this).f375h.get(i11)).mo369a(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: d */
        public void mo397d(InterfaceC18182g interfaceC18182g) {
            ((AbstractC0086w) ZchDataBase_Impl.this).f368a = interfaceC18182g;
            ZchDataBase_Impl.this.m359x(interfaceC18182g);
            if (((AbstractC0086w) ZchDataBase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) ZchDataBase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) ZchDataBase_Impl.this).f375h.get(i11)).mo371c(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: e */
        public void mo398e(InterfaceC18182g interfaceC18182g) {
        }

        @Override // p008a2.C0088y.b
        /* renamed from: f */
        public void mo399f(InterfaceC18182g interfaceC18182g) {
            AbstractC3206b.m16305b(interfaceC18182g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p008a2.C0088y.b
        /* renamed from: g */
        public C0088y.c mo400g(InterfaceC18182g interfaceC18182g) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e = new C3209e("LogViewVideoTB", hashMap, new HashSet(0), new HashSet(0));
            C3209e m16311a = C3209e.m16311a(interfaceC18182g, "LogViewVideoTB");
            if (!c3209e.equals(m16311a)) {
                return new C0088y.c(false, "LogViewVideoTB(com.zing.zalo.shortvideo.data.db.entities.LogViewVideoTB).\n Expected:\n" + c3209e + "\n Found:\n" + m16311a);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap2.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e2 = new C3209e("LogHistoryVideoTb", hashMap2, new HashSet(0), new HashSet(0));
            C3209e m16311a2 = C3209e.m16311a(interfaceC18182g, "LogHistoryVideoTb");
            if (!c3209e2.equals(m16311a2)) {
                return new C0088y.c(false, "LogHistoryVideoTb(com.zing.zalo.shortvideo.data.db.entities.LogHistoryVideoTb).\n Expected:\n" + c3209e2 + "\n Found:\n" + m16311a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap3.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e3 = new C3209e("LogImpsTB", hashMap3, new HashSet(0), new HashSet(0));
            C3209e m16311a3 = C3209e.m16311a(interfaceC18182g, "LogImpsTB");
            if (!c3209e3.equals(m16311a3)) {
                return new C0088y.c(false, "LogImpsTB(com.zing.zalo.shortvideo.data.db.entities.LogImpsTB).\n Expected:\n" + c3209e3 + "\n Found:\n" + m16311a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap4.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e4 = new C3209e("LogEventTb", hashMap4, new HashSet(0), new HashSet(0));
            C3209e m16311a4 = C3209e.m16311a(interfaceC18182g, "LogEventTb");
            if (!c3209e4.equals(m16311a4)) {
                return new C0088y.c(false, "LogEventTb(com.zing.zalo.shortvideo.data.db.entities.LogEventTb).\n Expected:\n" + c3209e4 + "\n Found:\n" + m16311a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap5.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e5 = new C3209e("LogUploadTb", hashMap5, new HashSet(0), new HashSet(0));
            C3209e m16311a5 = C3209e.m16311a(interfaceC18182g, "LogUploadTb");
            if (!c3209e5.equals(m16311a5)) {
                return new C0088y.c(false, "LogUploadTb(com.zing.zalo.shortvideo.data.db.entities.LogUploadTb).\n Expected:\n" + c3209e5 + "\n Found:\n" + m16311a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap6.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e6 = new C3209e("LogGetListTb", hashMap6, new HashSet(0), new HashSet(0));
            C3209e m16311a6 = C3209e.m16311a(interfaceC18182g, "LogGetListTb");
            if (!c3209e6.equals(m16311a6)) {
                return new C0088y.c(false, "LogGetListTb(com.zing.zalo.shortvideo.data.db.entities.LogGetListTb).\n Expected:\n" + c3209e6 + "\n Found:\n" + m16311a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("id", new C3209e.a("id", "INTEGER", true, 1, null, 1));
            hashMap7.put("channelConfig", new C3209e.a("channelConfig", "TEXT", false, 0, null, 1));
            C3209e c3209e7 = new C3209e("ChannelConfigTb", hashMap7, new HashSet(0), new HashSet(0));
            C3209e m16311a7 = C3209e.m16311a(interfaceC18182g, "ChannelConfigTb");
            if (!c3209e7.equals(m16311a7)) {
                return new C0088y.c(false, "ChannelConfigTb(com.zing.zalo.shortvideo.data.db.entities.ChannelConfigTb).\n Expected:\n" + c3209e7 + "\n Found:\n" + m16311a7);
            }
            HashMap hashMap8 = new HashMap(2);
            hashMap8.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap8.put("channel", new C3209e.a("channel", "TEXT", false, 0, null, 1));
            C3209e c3209e8 = new C3209e("ChannelTable", hashMap8, new HashSet(0), new HashSet(0));
            C3209e m16311a8 = C3209e.m16311a(interfaceC18182g, "ChannelTable");
            if (!c3209e8.equals(m16311a8)) {
                return new C0088y.c(false, "ChannelTable(com.zing.zalo.shortvideo.data.db.entities.ChannelTable).\n Expected:\n" + c3209e8 + "\n Found:\n" + m16311a8);
            }
            HashMap hashMap9 = new HashMap(2);
            hashMap9.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap9.put("user", new C3209e.a("user", "TEXT", false, 0, null, 1));
            C3209e c3209e9 = new C3209e("UserTable", hashMap9, new HashSet(0), new HashSet(0));
            C3209e m16311a9 = C3209e.m16311a(interfaceC18182g, "UserTable");
            if (!c3209e9.equals(m16311a9)) {
                return new C0088y.c(false, "UserTable(com.zing.zalo.shortvideo.data.db.entities.UserTable).\n Expected:\n" + c3209e9 + "\n Found:\n" + m16311a9);
            }
            HashMap hashMap10 = new HashMap(2);
            hashMap10.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap10.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e10 = new C3209e("LogActiveTb", hashMap10, new HashSet(0), new HashSet(0));
            C3209e m16311a10 = C3209e.m16311a(interfaceC18182g, "LogActiveTb");
            if (!c3209e10.equals(m16311a10)) {
                return new C0088y.c(false, "LogActiveTb(com.zing.zalo.shortvideo.data.db.entities.LogActiveTb).\n Expected:\n" + c3209e10 + "\n Found:\n" + m16311a10);
            }
            HashMap hashMap11 = new HashMap(2);
            hashMap11.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap11.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e11 = new C3209e("LogSessionTable", hashMap11, new HashSet(0), new HashSet(0));
            C3209e m16311a11 = C3209e.m16311a(interfaceC18182g, "LogSessionTable");
            if (!c3209e11.equals(m16311a11)) {
                return new C0088y.c(false, "LogSessionTable(com.zing.zalo.shortvideo.data.db.entities.LogSessionTable).\n Expected:\n" + c3209e11 + "\n Found:\n" + m16311a11);
            }
            HashMap hashMap12 = new HashMap(3);
            hashMap12.put("channelId", new C3209e.a("channelId", "TEXT", true, 1, null, 1));
            hashMap12.put("videoCount", new C3209e.a("videoCount", "INTEGER", true, 0, null, 1));
            hashMap12.put("modifiedTime", new C3209e.a("modifiedTime", "INTEGER", true, 0, null, 1));
            C3209e c3209e12 = new C3209e("WatchCount", hashMap12, new HashSet(0), new HashSet(0));
            C3209e m16311a12 = C3209e.m16311a(interfaceC18182g, "WatchCount");
            if (!c3209e12.equals(m16311a12)) {
                return new C0088y.c(false, "WatchCount(com.zing.zalo.shortvideo.data.db.entities.WatchCount).\n Expected:\n" + c3209e12 + "\n Found:\n" + m16311a12);
            }
            HashMap hashMap13 = new HashMap(2);
            hashMap13.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap13.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e13 = new C3209e("LogEventAdsTb", hashMap13, new HashSet(0), new HashSet(0));
            C3209e m16311a13 = C3209e.m16311a(interfaceC18182g, "LogEventAdsTb");
            if (!c3209e13.equals(m16311a13)) {
                return new C0088y.c(false, "LogEventAdsTb(com.zing.zalo.shortvideo.data.db.entities.LogEventAdsTb).\n Expected:\n" + c3209e13 + "\n Found:\n" + m16311a13);
            }
            HashMap hashMap14 = new HashMap(2);
            hashMap14.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap14.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e14 = new C3209e("LogImpsAdsTb", hashMap14, new HashSet(0), new HashSet(0));
            C3209e m16311a14 = C3209e.m16311a(interfaceC18182g, "LogImpsAdsTb");
            if (!c3209e14.equals(m16311a14)) {
                return new C0088y.c(false, "LogImpsAdsTb(com.zing.zalo.shortvideo.data.db.entities.LogImpsAdsTb).\n Expected:\n" + c3209e14 + "\n Found:\n" + m16311a14);
            }
            HashMap hashMap15 = new HashMap(2);
            hashMap15.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap15.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e15 = new C3209e("LogViewVideoAdsTb", hashMap15, new HashSet(0), new HashSet(0));
            C3209e m16311a15 = C3209e.m16311a(interfaceC18182g, "LogViewVideoAdsTb");
            if (!c3209e15.equals(m16311a15)) {
                return new C0088y.c(false, "LogViewVideoAdsTb(com.zing.zalo.shortvideo.data.db.entities.LogViewVideoAdsTb).\n Expected:\n" + c3209e15 + "\n Found:\n" + m16311a15);
            }
            HashMap hashMap16 = new HashMap(4);
            hashMap16.put("rowid", new C3209e.a("rowid", "INTEGER", true, 1, null, 1));
            hashMap16.put("user_id", new C3209e.a("user_id", "TEXT", true, 0, null, 1));
            hashMap16.put("video_id", new C3209e.a("video_id", "TEXT", true, 0, null, 1));
            hashMap16.put("timestamp", new C3209e.a("timestamp", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C3209e.e("index_tb_view_history_user_id_video_id", true, Arrays.asList("user_id", "video_id"), Arrays.asList("ASC", "ASC")));
            C3209e c3209e16 = new C3209e("tb_view_history", hashMap16, hashSet, hashSet2);
            C3209e m16311a16 = C3209e.m16311a(interfaceC18182g, "tb_view_history");
            if (!c3209e16.equals(m16311a16)) {
                return new C0088y.c(false, "tb_view_history(com.zing.zalo.shortvideo.data.db.entities.ViewHistory).\n Expected:\n" + c3209e16 + "\n Found:\n" + m16311a16);
            }
            HashMap hashMap17 = new HashMap(2);
            hashMap17.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap17.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e17 = new C3209e("LogHistoryLivestreamTb", hashMap17, new HashSet(0), new HashSet(0));
            C3209e m16311a17 = C3209e.m16311a(interfaceC18182g, "LogHistoryLivestreamTb");
            if (!c3209e17.equals(m16311a17)) {
                return new C0088y.c(false, "LogHistoryLivestreamTb(com.zing.zalo.shortvideo.data.db.entities.LogHistoryLivestreamTb).\n Expected:\n" + c3209e17 + "\n Found:\n" + m16311a17);
            }
            HashMap hashMap18 = new HashMap(2);
            hashMap18.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap18.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e18 = new C3209e("LogViewStreamTb", hashMap18, new HashSet(0), new HashSet(0));
            C3209e m16311a18 = C3209e.m16311a(interfaceC18182g, "LogViewStreamTb");
            if (!c3209e18.equals(m16311a18)) {
                return new C0088y.c(false, "LogViewStreamTb(com.zing.zalo.shortvideo.data.db.entities.LogViewStreamTb).\n Expected:\n" + c3209e18 + "\n Found:\n" + m16311a18);
            }
            HashMap hashMap19 = new HashMap(2);
            hashMap19.put("userId", new C3209e.a("userId", "TEXT", true, 1, null, 1));
            hashMap19.put("logs", new C3209e.a("logs", "TEXT", false, 0, null, 1));
            C3209e c3209e19 = new C3209e("LogEventStreamTb", hashMap19, new HashSet(0), new HashSet(0));
            C3209e m16311a19 = C3209e.m16311a(interfaceC18182g, "LogEventStreamTb");
            if (!c3209e19.equals(m16311a19)) {
                return new C0088y.c(false, "LogEventStreamTb(com.zing.zalo.shortvideo.data.db.entities.LogEventStreamTb).\n Expected:\n" + c3209e19 + "\n Found:\n" + m16311a19);
            }
            return new C0088y.c(true, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.data.p071db.ZchDataBase
    /* renamed from: J */
    public InterfaceC31140a mo50517J() {
        InterfaceC31140a interfaceC31140a;
        if (this.f49607q != null) {
            return this.f49607q;
        }
        synchronized (this) {
            try {
                if (this.f49607q == null) {
                    this.f49607q = new C31141b(this);
                }
                interfaceC31140a = this.f49607q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC31140a;
    }

    @Override // com.zing.zalo.shortvideo.data.p071db.ZchDataBase
    /* renamed from: K */
    public InterfaceC31142c mo50518K() {
        InterfaceC31142c interfaceC31142c;
        if (this.f49608r != null) {
            return this.f49608r;
        }
        synchronized (this) {
            try {
                if (this.f49608r == null) {
                    this.f49608r = new C31143d(this);
                }
                interfaceC31142c = this.f49608r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC31142c;
    }

    @Override // com.zing.zalo.shortvideo.data.p071db.ZchDataBase
    /* renamed from: L */
    public InterfaceC31144e mo50519L() {
        InterfaceC31144e interfaceC31144e;
        if (this.f49610t != null) {
            return this.f49610t;
        }
        synchronized (this) {
            try {
                if (this.f49610t == null) {
                    this.f49610t = new C31145f(this);
                }
                interfaceC31144e = this.f49610t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC31144e;
    }

    @Override // com.zing.zalo.shortvideo.data.p071db.ZchDataBase
    /* renamed from: M */
    public InterfaceC31146g mo50520M() {
        InterfaceC31146g interfaceC31146g;
        if (this.f49609s != null) {
            return this.f49609s;
        }
        synchronized (this) {
            try {
                if (this.f49609s == null) {
                    this.f49609s = new C31147h(this);
                }
                interfaceC31146g = this.f49609s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC31146g;
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: f */
    public void mo343f() {
        super.m340c();
        InterfaceC18182g mo187p0 = super.m352o().mo187p0();
        try {
            super.m342e();
            mo187p0.mo201u("DELETE FROM `LogViewVideoTB`");
            mo187p0.mo201u("DELETE FROM `LogHistoryVideoTb`");
            mo187p0.mo201u("DELETE FROM `LogImpsTB`");
            mo187p0.mo201u("DELETE FROM `LogEventTb`");
            mo187p0.mo201u("DELETE FROM `LogUploadTb`");
            mo187p0.mo201u("DELETE FROM `LogGetListTb`");
            mo187p0.mo201u("DELETE FROM `ChannelConfigTb`");
            mo187p0.mo201u("DELETE FROM `ChannelTable`");
            mo187p0.mo201u("DELETE FROM `UserTable`");
            mo187p0.mo201u("DELETE FROM `LogActiveTb`");
            mo187p0.mo201u("DELETE FROM `LogSessionTable`");
            mo187p0.mo201u("DELETE FROM `WatchCount`");
            mo187p0.mo201u("DELETE FROM `LogEventAdsTb`");
            mo187p0.mo201u("DELETE FROM `LogImpsAdsTb`");
            mo187p0.mo201u("DELETE FROM `LogViewVideoAdsTb`");
            mo187p0.mo201u("DELETE FROM `tb_view_history`");
            mo187p0.mo201u("DELETE FROM `LogHistoryLivestreamTb`");
            mo187p0.mo201u("DELETE FROM `LogViewStreamTb`");
            mo187p0.mo201u("DELETE FROM `LogEventStreamTb`");
            super.m339E();
        } finally {
            super.m347j();
            mo187p0.mo200q0("PRAGMA wal_checkpoint(FULL)").close();
            if (!mo187p0.mo202v0()) {
                mo187p0.mo201u("VACUUM");
            }
        }
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: h */
    protected C0080q mo345h() {
        return new C0080q(this, new HashMap(0), new HashMap(0), "LogViewVideoTB", "LogHistoryVideoTb", "LogImpsTB", "LogEventTb", "LogUploadTb", "LogGetListTb", "ChannelConfigTb", "ChannelTable", "UserTable", "LogActiveTb", "LogSessionTable", "WatchCount", "LogEventAdsTb", "LogImpsAdsTb", "LogViewVideoAdsTb", "tb_view_history", "LogHistoryLivestreamTb", "LogViewStreamTb", "LogEventStreamTb");
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: i */
    protected InterfaceC18183h mo346i(C0069h c0069h) {
        return c0069h.f286c.mo232a(InterfaceC18183h.b.m96928a(c0069h.f284a).m96932d(c0069h.f285b).m96931c(new C0088y(c0069h, new C9367a(7), "634fedbbae091c87240d119378385f80", "b64fdcfc94ed4dc98cb67d3820d7a2aa")).m96930b());
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: k */
    public List mo348k(Map map) {
        return Arrays.asList(new C9369b(), new C9370c(), new C9371d(), new C9372e(), new C9373f(), new C9374g());
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: q */
    public Set mo354q() {
        return new HashSet();
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: r */
    protected Map mo355r() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC31140a.class, C31141b.m151380e0());
        hashMap.put(InterfaceC31142c.class, C31143d.m151410l());
        hashMap.put(InterfaceC31146g.class, C31147h.m151426e());
        hashMap.put(InterfaceC31144e.class, C31145f.m151420f());
        return hashMap;
    }
}
