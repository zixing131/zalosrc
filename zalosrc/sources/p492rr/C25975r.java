package p492rr;

import android.os.Bundle;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: rr.r */
/* loaded from: classes4.dex */
public final class C25975r implements InterfaceC19969h {

    /* renamed from: a */
    private C32002l4 f123933a;

    public C25975r() {
        this.f123933a = C32002l4.Companion.m154287a(10000);
    }

    /* renamed from: a */
    public final C32002l4 m133798a() {
        return this.f123933a;
    }

    public C25975r(Bundle bundle) {
        this();
        if (bundle != null && bundle.containsKey("extra_entry_point_flow")) {
            this.f123933a = C32002l4.Companion.m154292f(bundle.getString("extra_entry_point_flow"));
        }
    }
}
