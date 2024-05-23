package iq;

import android.os.Bundle;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: iq.z1 */
/* loaded from: classes4.dex */
public class C20779z1 implements InterfaceC19969h {

    /* renamed from: a */
    public boolean f102128a;

    /* renamed from: b */
    public boolean f102129b = false;

    /* renamed from: c */
    public String f102130c = "";

    /* renamed from: d */
    public int f102131d = -1;

    /* renamed from: e */
    public C32002l4 f102132e;

    /* renamed from: a */
    public static C20779z1 m108415a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C20779z1 c20779z1 = new C20779z1();
        c20779z1.f102128a = bundle.getBoolean("fromPlugin", false);
        c20779z1.f102129b = bundle.getBoolean("showUpdateInfo", false);
        c20779z1.f102131d = bundle.getInt("int_extra_action_list_action", -1);
        c20779z1.f102130c = bundle.getString("STR_QUICK_ACCESS_VISIBLE_ACTION_TYPE", "");
        if (bundle.containsKey("extra_entry_point_flow")) {
            c20779z1.f102132e = C32002l4.m154269m(bundle.getString("extra_entry_point_flow"));
        }
        return c20779z1;
    }
}
