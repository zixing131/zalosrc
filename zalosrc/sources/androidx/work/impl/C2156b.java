package androidx.work.impl;

import android.content.ContentValues;
import fn0.AbstractC19074t;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.b */
/* loaded from: classes.dex */
public final class C2156b implements InterfaceC2493b {
    @Override // p028b2.InterfaceC2493b
    /* renamed from: a */
    public void mo11583a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        interfaceC18182g.mo199m0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
