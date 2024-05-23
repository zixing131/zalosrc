package androidx.work.impl;

import android.content.Context;
import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;
import p565v2.AbstractC27458l;
import p565v2.C27466t;

/* renamed from: androidx.work.impl.t0 */
/* loaded from: classes.dex */
public final class C2225t0 extends AbstractC2494c {

    /* renamed from: c */
    private final Context f9321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2225t0(Context context) {
        super(9, 10);
        AbstractC19074t.m100208f(context, "context");
        this.f9321c = context;
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        C27466t.m140516c(this.f9321c, interfaceC18182g);
        AbstractC27458l.m140502c(this.f9321c, interfaceC18182g);
    }
}
