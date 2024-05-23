package p656xs;

import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import p173fz.C19172a;
import p716zh.C31973j5;

/* renamed from: xs.b */
/* loaded from: classes4.dex */
public abstract class AbstractC30201b {
    /* renamed from: a */
    public static final boolean m148948a() {
        if (C19172a.m100600k("oa_group_ui@enable", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m148949b(C31973j5 c31973j5, ContactProfile contactProfile) {
        if (contactProfile == null || c31973j5 == null || !m148948a()) {
            return false;
        }
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        if (!c31973j5.m153780q0(str) || c31973j5.m153709C() != 1 || !contactProfile.m40387S0() || !contactProfile.m40359B0()) {
            return false;
        }
        return true;
    }
}
