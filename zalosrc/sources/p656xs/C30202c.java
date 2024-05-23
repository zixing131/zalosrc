package p656xs;

import fn0.AbstractC19074t;
import p173fz.C19172a;
import p716zh.C31973j5;

/* renamed from: xs.c */
/* loaded from: classes4.dex */
public final class C30202c {

    /* renamed from: a */
    public static final C30202c f140315a = new C30202c();

    private C30202c() {
    }

    /* renamed from: a */
    private final boolean m148950a() {
        if ((C19172a.m100600k("hide_member_setting@enableType", 0) & 2) != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m148951b() {
        if ((C19172a.m100600k("hide_member_setting@enableType", 0) & 1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m148952c(C31973j5 c31973j5) {
        AbstractC19074t.m100208f(c31973j5, "group");
        if (c31973j5.m153745W()) {
            if (m148950a() && c31973j5.m153747Y()) {
                return true;
            }
            return false;
        }
        return m148951b();
    }

    /* renamed from: d */
    public final void m148953d() {
        C19172a.m100600k("hide_member_setting@enableType", 0);
    }
}
