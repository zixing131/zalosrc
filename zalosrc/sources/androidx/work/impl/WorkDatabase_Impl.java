package androidx.work.impl;

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
import p535u2.AbstractC26961h;
import p535u2.C26953c;
import p535u2.C26956d0;
import p535u2.C26959f;
import p535u2.C26965l;
import p535u2.C26970q;
import p535u2.C26973t;
import p535u2.C26978y;
import p535u2.InterfaceC26951b;
import p535u2.InterfaceC26954c0;
import p535u2.InterfaceC26957e;
import p535u2.InterfaceC26960g;
import p535u2.InterfaceC26964k;
import p535u2.InterfaceC26969p;
import p535u2.InterfaceC26972s;
import p535u2.InterfaceC26977x;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: p */
    private volatile InterfaceC26977x f9147p;

    /* renamed from: q */
    private volatile InterfaceC26951b f9148q;

    /* renamed from: r */
    private volatile InterfaceC26954c0 f9149r;

    /* renamed from: s */
    private volatile InterfaceC26964k f9150s;

    /* renamed from: t */
    private volatile InterfaceC26969p f9151t;

    /* renamed from: u */
    private volatile InterfaceC26972s f9152u;

    /* renamed from: v */
    private volatile InterfaceC26957e f9153v;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    /* loaded from: classes.dex */
    class C2153a extends C0088y.b {
        C2153a(int i11) {
            super(i11);
        }

        @Override // p008a2.C0088y.b
        /* renamed from: a */
        public void mo394a(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC18182g.mo201u("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC18182g.mo201u("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            interfaceC18182g.mo201u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC18182g.mo201u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC18182g.mo201u("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC18182g.mo201u("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC18182g.mo201u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        @Override // p008a2.C0088y.b
        /* renamed from: b */
        public void mo395b(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `Dependency`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `WorkName`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `Preference`");
            if (((AbstractC0086w) WorkDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) WorkDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) WorkDatabase_Impl.this).f375h.get(i11)).m370b(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: c */
        public void mo396c(InterfaceC18182g interfaceC18182g) {
            if (((AbstractC0086w) WorkDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) WorkDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) WorkDatabase_Impl.this).f375h.get(i11)).mo369a(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: d */
        public void mo397d(InterfaceC18182g interfaceC18182g) {
            ((AbstractC0086w) WorkDatabase_Impl.this).f368a = interfaceC18182g;
            interfaceC18182g.mo201u("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m359x(interfaceC18182g);
            if (((AbstractC0086w) WorkDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) WorkDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) WorkDatabase_Impl.this).f375h.get(i11)).mo371c(interfaceC18182g);
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

        @Override // p008a2.C0088y.b
        /* renamed from: g */
        public C0088y.c mo400g(InterfaceC18182g interfaceC18182g) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C3209e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C3209e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C3209e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C3209e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C3209e.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new C3209e.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            C3209e c3209e = new C3209e("Dependency", hashMap, hashSet, hashSet2);
            C3209e m16311a = C3209e.m16311a(interfaceC18182g, "Dependency");
            if (!c3209e.equals(m16311a)) {
                return new C0088y.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c3209e + "\n Found:\n" + m16311a);
            }
            HashMap hashMap2 = new HashMap(30);
            hashMap2.put("id", new C3209e.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new C3209e.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C3209e.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C3209e.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input", new C3209e.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C3209e.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C3209e.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C3209e.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C3209e.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C3209e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C3209e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C3209e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new C3209e.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new C3209e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C3209e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C3209e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C3209e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new C3209e.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new C3209e.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new C3209e.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new C3209e.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new C3209e.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("required_network_type", new C3209e.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new C3209e.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C3209e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C3209e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C3209e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C3209e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C3209e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C3209e.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C3209e.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new C3209e.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            C3209e c3209e2 = new C3209e("WorkSpec", hashMap2, hashSet3, hashSet4);
            C3209e m16311a2 = C3209e.m16311a(interfaceC18182g, "WorkSpec");
            if (!c3209e2.equals(m16311a2)) {
                return new C0088y.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c3209e2 + "\n Found:\n" + m16311a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C3209e.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C3209e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C3209e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C3209e.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C3209e c3209e3 = new C3209e("WorkTag", hashMap3, hashSet5, hashSet6);
            C3209e m16311a3 = C3209e.m16311a(interfaceC18182g, "WorkTag");
            if (!c3209e3.equals(m16311a3)) {
                return new C0088y.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c3209e3 + "\n Found:\n" + m16311a3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C3209e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new C3209e.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new C3209e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C3209e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C3209e c3209e4 = new C3209e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C3209e m16311a4 = C3209e.m16311a(interfaceC18182g, "SystemIdInfo");
            if (!c3209e4.equals(m16311a4)) {
                return new C0088y.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c3209e4 + "\n Found:\n" + m16311a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C3209e.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C3209e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C3209e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C3209e.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C3209e c3209e5 = new C3209e("WorkName", hashMap5, hashSet8, hashSet9);
            C3209e m16311a5 = C3209e.m16311a(interfaceC18182g, "WorkName");
            if (!c3209e5.equals(m16311a5)) {
                return new C0088y.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c3209e5 + "\n Found:\n" + m16311a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C3209e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C3209e.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C3209e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C3209e c3209e6 = new C3209e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C3209e m16311a6 = C3209e.m16311a(interfaceC18182g, "WorkProgress");
            if (!c3209e6.equals(m16311a6)) {
                return new C0088y.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c3209e6 + "\n Found:\n" + m16311a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C3209e.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C3209e.a("long_value", "INTEGER", false, 0, null, 1));
            C3209e c3209e7 = new C3209e("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C3209e m16311a7 = C3209e.m16311a(interfaceC18182g, "Preference");
            if (!c3209e7.equals(m16311a7)) {
                return new C0088y.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c3209e7 + "\n Found:\n" + m16311a7);
            }
            return new C0088y.c(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: G */
    public InterfaceC26951b mo11560G() {
        InterfaceC26951b interfaceC26951b;
        if (this.f9148q != null) {
            return this.f9148q;
        }
        synchronized (this) {
            try {
                if (this.f9148q == null) {
                    this.f9148q = new C26953c(this);
                }
                interfaceC26951b = this.f9148q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26951b;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: H */
    public InterfaceC26957e mo11561H() {
        InterfaceC26957e interfaceC26957e;
        if (this.f9153v != null) {
            return this.f9153v;
        }
        synchronized (this) {
            try {
                if (this.f9153v == null) {
                    this.f9153v = new C26959f(this);
                }
                interfaceC26957e = this.f9153v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26957e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: I */
    public InterfaceC26964k mo11562I() {
        InterfaceC26964k interfaceC26964k;
        if (this.f9150s != null) {
            return this.f9150s;
        }
        synchronized (this) {
            try {
                if (this.f9150s == null) {
                    this.f9150s = new C26965l(this);
                }
                interfaceC26964k = this.f9150s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26964k;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: J */
    public InterfaceC26969p mo11563J() {
        InterfaceC26969p interfaceC26969p;
        if (this.f9151t != null) {
            return this.f9151t;
        }
        synchronized (this) {
            try {
                if (this.f9151t == null) {
                    this.f9151t = new C26970q(this);
                }
                interfaceC26969p = this.f9151t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26969p;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: K */
    public InterfaceC26972s mo11564K() {
        InterfaceC26972s interfaceC26972s;
        if (this.f9152u != null) {
            return this.f9152u;
        }
        synchronized (this) {
            try {
                if (this.f9152u == null) {
                    this.f9152u = new C26973t(this);
                }
                interfaceC26972s = this.f9152u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26972s;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: L */
    public InterfaceC26977x mo11565L() {
        InterfaceC26977x interfaceC26977x;
        if (this.f9147p != null) {
            return this.f9147p;
        }
        synchronized (this) {
            try {
                if (this.f9147p == null) {
                    this.f9147p = new C26978y(this);
                }
                interfaceC26977x = this.f9147p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26977x;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: M */
    public InterfaceC26954c0 mo11566M() {
        InterfaceC26954c0 interfaceC26954c0;
        if (this.f9149r != null) {
            return this.f9149r;
        }
        synchronized (this) {
            try {
                if (this.f9149r == null) {
                    this.f9149r = new C26956d0(this);
                }
                interfaceC26954c0 = this.f9149r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC26954c0;
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: h */
    protected C0080q mo345h() {
        return new C0080q(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: i */
    protected InterfaceC18183h mo346i(C0069h c0069h) {
        return c0069h.f286c.mo232a(InterfaceC18183h.b.m96928a(c0069h.f284a).m96932d(c0069h.f285b).m96931c(new C0088y(c0069h, new C2153a(20), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032")).m96930b());
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: k */
    public List mo348k(Map map) {
        return Arrays.asList(new C2201h0(), new C2203i0(), new C2205j0(), new C2207k0(), new C2209l0(), new C2211m0());
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
        hashMap.put(InterfaceC26977x.class, C26978y.m139030K());
        hashMap.put(InterfaceC26951b.class, C26953c.m138911e());
        hashMap.put(InterfaceC26954c0.class, C26956d0.m138920e());
        hashMap.put(InterfaceC26964k.class, C26965l.m138951h());
        hashMap.put(InterfaceC26969p.class, C26970q.m138960c());
        hashMap.put(InterfaceC26972s.class, C26973t.m138967d());
        hashMap.put(InterfaceC26957e.class, C26959f.m138934c());
        hashMap.put(InterfaceC26960g.class, AbstractC26961h.m138936a());
        return hashMap;
    }
}
