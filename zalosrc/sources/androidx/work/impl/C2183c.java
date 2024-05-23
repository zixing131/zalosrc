package androidx.work.impl;

import fn0.AbstractC19074t;
import p028b2.InterfaceC2493b;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.c */
/* loaded from: classes.dex */
public final class C2183c implements InterfaceC2493b {
    @Override // p028b2.InterfaceC2493b
    /* renamed from: a */
    public void mo11583a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
