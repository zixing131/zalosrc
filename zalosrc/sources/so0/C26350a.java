package so0;

import android.os.Bundle;
import p205hc.InterfaceC19969h;

/* renamed from: so0.a */
/* loaded from: classes7.dex */
public class C26350a implements InterfaceC19969h {

    /* renamed from: a */
    public int f125189a;

    /* renamed from: b */
    public String f125190b;

    /* renamed from: a */
    public static C26350a m135670a(Bundle bundle) {
        C26350a c26350a = new C26350a();
        if (bundle == null) {
            return c26350a;
        }
        c26350a.f125190b = bundle.getString("EXTRA_DATA_GROUP_ID");
        c26350a.f125189a = bundle.getInt("EXTRA_DATA_START_FROM");
        return c26350a;
    }
}
