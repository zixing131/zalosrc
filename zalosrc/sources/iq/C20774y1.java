package iq;

import android.os.Bundle;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: iq.y1 */
/* loaded from: classes4.dex */
public class C20774y1 implements InterfaceC19969h {

    /* renamed from: a */
    public C32002l4 f102119a;

    /* renamed from: b */
    public String f102120b;

    /* renamed from: a */
    public static C20774y1 m108414a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C20774y1 c20774y1 = new C20774y1();
        c20774y1.f102120b = bundle.getString("extra_user_id", "");
        if (bundle.containsKey("extra_entry_point_flow")) {
            c20774y1.f102119a = C32002l4.m154269m(bundle.getString("extra_entry_point_flow"));
        }
        return c20774y1;
    }
}
