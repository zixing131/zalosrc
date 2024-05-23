package p656xs;

import on0.AbstractC24341v;
import p173fz.C19172a;

/* renamed from: xs.a */
/* loaded from: classes4.dex */
public abstract class AbstractC30200a {
    /* renamed from: a */
    public static final int m148942a() {
        return C19172a.m100600k("community@admin_onboarding_limit", -1);
    }

    /* renamed from: b */
    public static final String m148943b() {
        boolean m127128x;
        String m100607r = C19172a.m100607r("community@link_h5_upgrade", "https://community-upgrade.zaloapp.com/lp");
        m127128x = AbstractC24341v.m127128x(m100607r);
        if (m127128x) {
            return "https://community-upgrade.zaloapp.com/lp";
        }
        return m100607r;
    }

    /* renamed from: c */
    public static final int m148944c() {
        return C19172a.m100600k("community@member_onboarding_limit", 1);
    }

    /* renamed from: d */
    public static final boolean m148945d() {
        if (C19172a.m100600k("community@tab_chat_icon", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final int m148946e() {
        return C19172a.m100600k("community@grouptype_threshold", 100);
    }

    /* renamed from: f */
    public static final boolean m148947f() {
        if (C19172a.m100600k("community@ui_enable", 0) != 1) {
            return false;
        }
        return true;
    }
}
