package qm0;

import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.Set;
import rm0.C25844j;

/* renamed from: qm0.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC25377w0 {
    /* renamed from: a */
    public static Set m131535a(Set set) {
        AbstractC19074t.m100208f(set, "builder");
        return ((C25844j) set).m133293e();
    }

    /* renamed from: b */
    public static Set m131536b() {
        return new C25844j();
    }

    /* renamed from: c */
    public static Set m131537c(int i11) {
        return new C25844j(i11);
    }

    /* renamed from: d */
    public static Set m131538d(Object obj) {
        Set singleton = Collections.singleton(obj);
        AbstractC19074t.m100207e(singleton, "singleton(...)");
        return singleton;
    }
}
