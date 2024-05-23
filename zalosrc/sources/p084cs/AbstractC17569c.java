package p084cs;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import p304ks.AbstractC21935u;
import p691yr.C31060j;

/* renamed from: cs.c */
/* loaded from: classes4.dex */
public abstract class AbstractC17569c {
    public static final a Companion = new a(null);

    /* renamed from: cs.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final String m93558a(List list) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    String m114542i = AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.f42437s);
                    if (!AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i)) {
                        AbstractC19074t.m100205c(m114542i);
                        return m114542i;
                    }
                }
                return "";
            }
            return "";
        }

        /* renamed from: b */
        public final String m93559b(C17570d c17570d, boolean z11, List list, int i11, int i12) {
            boolean z12;
            String m93562c;
            boolean z13;
            boolean z14;
            AbstractC19074t.m100208f(c17570d, "provider");
            AbstractC19074t.m100208f(list, "likeList");
            if (i12 != 4 && i12 != 14) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (C31060j.m150913U() && !z12) {
                if (i11 <= 0) {
                    return "";
                }
                return c17570d.m93563d(i11);
            }
            if (C31060j.m150913U()) {
                m93562c = c17570d.m93563d(i11);
            } else {
                m93562c = c17570d.m93562c(i11);
            }
            if (i12 != 2 && i12 != 3) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i12 != 1 && i12 != 12) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (i11 > 0 && (z13 || z14)) {
                return m93562c;
            }
            if (z11) {
                if (i11 == 1) {
                    return c17570d.m93560a();
                }
                if (i11 == 2) {
                    if (list.isEmpty()) {
                        return c17570d.m93566g(i11);
                    }
                    if (list.size() == 1 && AbstractC19074t.m100204b(((ContactProfile) list.get(0)).f42434r, CoreUtility.f89233i)) {
                        return c17570d.m93566g(i11);
                    }
                    return c17570d.m93567h(m93558a(list));
                }
                if (i11 > 2) {
                    if (list.isEmpty()) {
                        return c17570d.m93566g(i11);
                    }
                    if (list.size() == 1 && AbstractC19074t.m100204b(((ContactProfile) list.get(0)).f42434r, CoreUtility.f89233i)) {
                        return c17570d.m93566g(i11);
                    }
                    return c17570d.m93565f(m93558a(list), i11);
                }
            } else {
                if (i11 == 1) {
                    if (!list.isEmpty()) {
                        return m93558a(list);
                    }
                    return m93562c;
                }
                if (i11 >= 2) {
                    if (!list.isEmpty()) {
                        return c17570d.m93561b(m93558a(list), i11);
                    }
                    return m93562c;
                }
            }
            return "";
        }
    }
}
