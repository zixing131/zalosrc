package androidx.work.impl;

import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.k */
/* loaded from: classes.dex */
public final class C2206k extends AbstractC2494c {

    /* renamed from: c */
    public static final C2206k f9286c = new C2206k();

    private C2206k() {
        super(1, 2);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        interfaceC18182g.mo201u("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        interfaceC18182g.mo201u("DROP TABLE IF EXISTS alarmInfo");
        interfaceC18182g.mo201u("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
