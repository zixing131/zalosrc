package com.zing.zalo.analytics.p059db;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p008a2.AbstractC0086w;
import p008a2.C0069h;
import p008a2.C0080q;
import p008a2.C0088y;
import p036bc.C2715b;
import p036bc.C2718e;
import p036bc.C2721h;
import p036bc.C2724k;
import p036bc.InterfaceC2714a;
import p036bc.InterfaceC2717d;
import p036bc.InterfaceC2720g;
import p036bc.InterfaceC2723j;
import p046c2.AbstractC3206b;
import p046c2.C3209e;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;

/* loaded from: classes.dex */
public final class AnalyticsRoomDatabase_Impl extends AnalyticsRoomDatabase {

    /* renamed from: p */
    private volatile InterfaceC2720g f40026p;

    /* renamed from: q */
    private volatile InterfaceC2717d f40027q;

    /* renamed from: r */
    private volatile InterfaceC2723j f40028r;

    /* renamed from: s */
    private volatile InterfaceC2714a f40029s;

    /* renamed from: com.zing.zalo.analytics.db.AnalyticsRoomDatabase_Impl$a */
    /* loaded from: classes.dex */
    class C7305a extends C0088y.b {
        C7305a(int i11) {
            super(i11);
        }

        @Override // p008a2.C0088y.b
        /* renamed from: a */
        public void mo394a(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `sessions` (`startTime` INTEGER NOT NULL, `startSource` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `endTime` INTEGER NOT NULL, `endReason` INTEGER NOT NULL, `extraData` TEXT NOT NULL)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `screens` (`screenId` TEXT NOT NULL, `startTime` INTEGER NOT NULL, `startSource` TEXT NOT NULL, `sessionId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `endTime` INTEGER NOT NULL, `endReason` INTEGER NOT NULL, `extraData` TEXT NOT NULL)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `views` (`name` TEXT NOT NULL, `actionTime` INTEGER NOT NULL, `screenName` TEXT NOT NULL, `sessionId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `actionType` INTEGER NOT NULL, `actionData` TEXT NOT NULL, `extraData` TEXT NOT NULL)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `events` (`actionId` TEXT NOT NULL, `eventTime` INTEGER NOT NULL, `sessionId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `source` TEXT NOT NULL, `screens` TEXT NOT NULL, `customData` TEXT NOT NULL, `extraData` TEXT NOT NULL)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC18182g.mo201u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5ce0b3f9dbce41c4c2a90be92ec88e3e')");
        }

        @Override // p008a2.C0088y.b
        /* renamed from: b */
        public void mo395b(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `sessions`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `screens`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `views`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `events`");
            if (((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h.get(i11)).m370b(interfaceC18182g);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p008a2.C0088y.b
        /* renamed from: c */
        public void mo396c(InterfaceC18182g interfaceC18182g) {
            if (((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h.get(i11)).mo369a(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: d */
        public void mo397d(InterfaceC18182g interfaceC18182g) {
            ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f368a = interfaceC18182g;
            AnalyticsRoomDatabase_Impl.this.m359x(interfaceC18182g);
            if (((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) AnalyticsRoomDatabase_Impl.this).f375h.get(i11)).mo371c(interfaceC18182g);
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
            HashMap hashMap = new HashMap(6);
            hashMap.put("startTime", new C3209e.a("startTime", "INTEGER", true, 0, null, 1));
            hashMap.put("startSource", new C3209e.a("startSource", "INTEGER", true, 0, null, 1));
            hashMap.put("id", new C3209e.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("endTime", new C3209e.a("endTime", "INTEGER", true, 0, null, 1));
            hashMap.put("endReason", new C3209e.a("endReason", "INTEGER", true, 0, null, 1));
            hashMap.put("extraData", new C3209e.a("extraData", "TEXT", true, 0, null, 1));
            C3209e c3209e = new C3209e("sessions", hashMap, new HashSet(0), new HashSet(0));
            C3209e m16311a = C3209e.m16311a(interfaceC18182g, "sessions");
            if (!c3209e.equals(m16311a)) {
                return new C0088y.c(false, "sessions(com.zing.zalo.analytics.db.SessionEntity).\n Expected:\n" + c3209e + "\n Found:\n" + m16311a);
            }
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put("screenId", new C3209e.a("screenId", "TEXT", true, 0, null, 1));
            hashMap2.put("startTime", new C3209e.a("startTime", "INTEGER", true, 0, null, 1));
            hashMap2.put("startSource", new C3209e.a("startSource", "TEXT", true, 0, null, 1));
            hashMap2.put("sessionId", new C3209e.a("sessionId", "INTEGER", true, 0, null, 1));
            hashMap2.put("id", new C3209e.a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("endTime", new C3209e.a("endTime", "INTEGER", true, 0, null, 1));
            hashMap2.put("endReason", new C3209e.a("endReason", "INTEGER", true, 0, null, 1));
            hashMap2.put("extraData", new C3209e.a("extraData", "TEXT", true, 0, null, 1));
            C3209e c3209e2 = new C3209e("screens", hashMap2, new HashSet(0), new HashSet(0));
            C3209e m16311a2 = C3209e.m16311a(interfaceC18182g, "screens");
            if (!c3209e2.equals(m16311a2)) {
                return new C0088y.c(false, "screens(com.zing.zalo.analytics.db.ScreenEntity).\n Expected:\n" + c3209e2 + "\n Found:\n" + m16311a2);
            }
            HashMap hashMap3 = new HashMap(8);
            hashMap3.put("name", new C3209e.a("name", "TEXT", true, 0, null, 1));
            hashMap3.put("actionTime", new C3209e.a("actionTime", "INTEGER", true, 0, null, 1));
            hashMap3.put("screenName", new C3209e.a("screenName", "TEXT", true, 0, null, 1));
            hashMap3.put("sessionId", new C3209e.a("sessionId", "INTEGER", true, 0, null, 1));
            hashMap3.put("id", new C3209e.a("id", "INTEGER", true, 1, null, 1));
            hashMap3.put("actionType", new C3209e.a("actionType", "INTEGER", true, 0, null, 1));
            hashMap3.put("actionData", new C3209e.a("actionData", "TEXT", true, 0, null, 1));
            hashMap3.put("extraData", new C3209e.a("extraData", "TEXT", true, 0, null, 1));
            C3209e c3209e3 = new C3209e("views", hashMap3, new HashSet(0), new HashSet(0));
            C3209e m16311a3 = C3209e.m16311a(interfaceC18182g, "views");
            if (!c3209e3.equals(m16311a3)) {
                return new C0088y.c(false, "views(com.zing.zalo.analytics.db.ViewEntity).\n Expected:\n" + c3209e3 + "\n Found:\n" + m16311a3);
            }
            HashMap hashMap4 = new HashMap(8);
            hashMap4.put("actionId", new C3209e.a("actionId", "TEXT", true, 0, null, 1));
            hashMap4.put("eventTime", new C3209e.a("eventTime", "INTEGER", true, 0, null, 1));
            hashMap4.put("sessionId", new C3209e.a("sessionId", "INTEGER", true, 0, null, 1));
            hashMap4.put("id", new C3209e.a("id", "INTEGER", true, 1, null, 1));
            hashMap4.put("source", new C3209e.a("source", "TEXT", true, 0, null, 1));
            hashMap4.put("screens", new C3209e.a("screens", "TEXT", true, 0, null, 1));
            hashMap4.put("customData", new C3209e.a("customData", "TEXT", true, 0, null, 1));
            hashMap4.put("extraData", new C3209e.a("extraData", "TEXT", true, 0, null, 1));
            C3209e c3209e4 = new C3209e("events", hashMap4, new HashSet(0), new HashSet(0));
            C3209e m16311a4 = C3209e.m16311a(interfaceC18182g, "events");
            if (!c3209e4.equals(m16311a4)) {
                return new C0088y.c(false, "events(com.zing.zalo.analytics.db.EventEntity).\n Expected:\n" + c3209e4 + "\n Found:\n" + m16311a4);
            }
            return new C0088y.c(true, null);
        }
    }

    @Override // com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase
    /* renamed from: I */
    public InterfaceC2714a mo37241I() {
        InterfaceC2714a interfaceC2714a;
        if (this.f40029s != null) {
            return this.f40029s;
        }
        synchronized (this) {
            try {
                if (this.f40029s == null) {
                    this.f40029s = new C2715b(this);
                }
                interfaceC2714a = this.f40029s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2714a;
    }

    @Override // com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase
    /* renamed from: J */
    public InterfaceC2717d mo37242J() {
        InterfaceC2717d interfaceC2717d;
        if (this.f40027q != null) {
            return this.f40027q;
        }
        synchronized (this) {
            try {
                if (this.f40027q == null) {
                    this.f40027q = new C2718e(this);
                }
                interfaceC2717d = this.f40027q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2717d;
    }

    @Override // com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase
    /* renamed from: K */
    public InterfaceC2720g mo37243K() {
        InterfaceC2720g interfaceC2720g;
        if (this.f40026p != null) {
            return this.f40026p;
        }
        synchronized (this) {
            try {
                if (this.f40026p == null) {
                    this.f40026p = new C2721h(this);
                }
                interfaceC2720g = this.f40026p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2720g;
    }

    @Override // com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase
    /* renamed from: L */
    public InterfaceC2723j mo37244L() {
        InterfaceC2723j interfaceC2723j;
        if (this.f40028r != null) {
            return this.f40028r;
        }
        synchronized (this) {
            try {
                if (this.f40028r == null) {
                    this.f40028r = new C2724k(this);
                }
                interfaceC2723j = this.f40028r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2723j;
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: h */
    protected C0080q mo345h() {
        return new C0080q(this, new HashMap(0), new HashMap(0), "sessions", "screens", "views", "events");
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: i */
    protected InterfaceC18183h mo346i(C0069h c0069h) {
        return c0069h.f286c.mo232a(InterfaceC18183h.b.m96928a(c0069h.f284a).m96932d(c0069h.f285b).m96931c(new C0088y(c0069h, new C7305a(5), "5ce0b3f9dbce41c4c2a90be92ec88e3e", "167c1830580f0f0ace02d4e45c1e7cbd")).m96930b());
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: r */
    protected Map mo355r() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC2720g.class, C2721h.m13261i());
        hashMap.put(InterfaceC2717d.class, C2718e.m13237g());
        hashMap.put(InterfaceC2723j.class, C2724k.m13279e());
        hashMap.put(InterfaceC2714a.class, C2715b.m13214i());
        return hashMap;
    }
}
