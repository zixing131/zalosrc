package io0;

import android.os.Bundle;
import p205hc.InterfaceC19969h;

/* renamed from: io0.a */
/* loaded from: classes7.dex */
public class C20644a implements InterfaceC19969h {

    /* renamed from: a */
    public String f101568a;

    /* renamed from: b */
    public int f101569b;

    /* renamed from: a */
    public static C20644a m107586a(Bundle bundle) {
        C20644a c20644a = new C20644a();
        if (bundle == null) {
            return c20644a;
        }
        c20644a.f101568a = bundle.getString("extra_group_id", "0");
        c20644a.f101569b = bundle.getInt("extra_source_call");
        return c20644a;
    }
}
