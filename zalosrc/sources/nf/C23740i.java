package nf;

import android.content.res.Resources;
import fn0.AbstractC19074t;

/* renamed from: nf.i */
/* loaded from: classes3.dex */
public final class C23740i {

    /* renamed from: a */
    public static final C23740i f114843a = new C23740i();

    private C23740i() {
    }

    /* renamed from: a */
    public static final EnumC23739h m124104a(int i11, Resources resources) {
        AbstractC19074t.m100208f(resources, "resources");
        float f11 = i11 / resources.getDisplayMetrics().density;
        if (f11 < 600.0f) {
            return EnumC23739h.f114838p;
        }
        if (f11 < 840.0f) {
            return EnumC23739h.f114839q;
        }
        return EnumC23739h.f114840r;
    }
}
