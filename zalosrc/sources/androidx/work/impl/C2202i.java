package androidx.work.impl;

import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.i */
/* loaded from: classes.dex */
public final class C2202i extends AbstractC2494c {

    /* renamed from: c */
    public static final C2202i f9283c = new C2202i();

    private C2202i() {
        super(15, 16);
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        interfaceC18182g.mo201u("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        interfaceC18182g.mo201u("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        interfaceC18182g.mo201u("DROP TABLE `SystemIdInfo`");
        interfaceC18182g.mo201u("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
