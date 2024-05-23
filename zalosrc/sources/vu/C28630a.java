package vu;

import androidx.lifecycle.AbstractC1796t0;
import fn0.AbstractC19060k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import qm0.AbstractC25332a0;

/* renamed from: vu.a */
/* loaded from: classes4.dex */
public final class C28630a extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    public static List f132726s = new ArrayList();

    /* renamed from: t */
    public static List f132727t = new ArrayList();

    /* renamed from: u */
    public static List f132728u = new ArrayList();

    /* renamed from: v */
    private static final AtomicBoolean f132729v = new AtomicBoolean(true);

    /* renamed from: vu.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AtomicBoolean m143191a() {
            return C28630a.f132729v;
        }

        /* renamed from: b */
        public final boolean m143192b(String str) {
            boolean m131196V;
            m131196V = AbstractC25332a0.m131196V(C28630a.f132726s, str);
            return m131196V;
        }

        /* renamed from: c */
        public final boolean m143193c(String str) {
            boolean m131196V;
            m131196V = AbstractC25332a0.m131196V(C28630a.f132726s, str);
            return m131196V;
        }

        /* renamed from: d */
        public final boolean m143194d(String str, String str2) {
            boolean m131196V;
            boolean m131196V2;
            m131196V = AbstractC25332a0.m131196V(C28630a.f132727t, str);
            if (m131196V) {
                m131196V2 = AbstractC25332a0.m131196V(C28630a.f132726s, str2);
                if (m131196V2) {
                    return false;
                }
            }
            return true;
        }
    }
}
