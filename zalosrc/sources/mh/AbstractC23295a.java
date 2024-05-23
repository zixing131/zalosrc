package mh;

import am.AbstractC0924m0;
import p173fz.C19172a;
import p348mi.AbstractC23309i;

/* renamed from: mh.a */
/* loaded from: classes3.dex */
public abstract class AbstractC23295a {
    /* renamed from: a */
    public static final boolean m120434a() {
        if (m120435b() && AbstractC0924m0.m3162J9()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m120435b() {
        return AbstractC0924m0.m3365Q9();
    }

    /* renamed from: c */
    public static final boolean m120436c() {
        if (!m120435b() || C19172a.m100600k("group@seen_status_config@enable_pull_status_message", 0) < 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m120437d() {
        return AbstractC23309i.m121490Ud();
    }
}
