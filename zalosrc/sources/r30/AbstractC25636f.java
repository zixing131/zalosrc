package r30;

import android.text.TextUtils;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23088h5;
import p142ey.C18644n;
import p304ks.C21927m;
import p304ks.C21933s;
import p716zh.C31874cb;

/* renamed from: r30.f */
/* loaded from: classes5.dex */
public abstract class AbstractC25636f {

    /* renamed from: a */
    public static Comparator f122586a = new Comparator() { // from class: r30.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m132485o;
            m132485o = AbstractC25636f.m132485o((C31874cb) obj, (C31874cb) obj2);
            return m132485o;
        }
    };

    /* renamed from: b */
    public static Comparator f122587b = new Comparator() { // from class: r30.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m132486p;
            m132486p = AbstractC25636f.m132486p((C31874cb) obj, (C31874cb) obj2);
            return m132486p;
        }
    };

    /* renamed from: c */
    private static Map f122588c = new HashMap();

    /* renamed from: d */
    public static boolean f122589d = false;

    /* renamed from: c */
    public static void m132473c(C31874cb c31874cb) {
        if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a) && ZaloListView.m86975fN()) {
            f122588c.put(c31874cb.f146385a, c31874cb);
        }
    }

    /* renamed from: d */
    public static void m132474d() {
        if (f122589d) {
            m132476f();
            C21933s.m114404I().m114477l0();
            AbstractC23088h5.m118431l();
        }
    }

    /* renamed from: e */
    public static void m132475e() {
        f122588c.clear();
    }

    /* renamed from: f */
    public static void m132476f() {
        C25639i.m132496q().m132459c();
    }

    /* renamed from: g */
    public static void m132477g() {
        C25641k.m132506o().m132518k();
    }

    /* renamed from: h */
    public static void m132478h() {
        C25637g.m132489q().m132459c();
    }

    /* renamed from: i */
    public static List m132479i(boolean z11) {
        List m132519l = C25641k.m132506o().m132519l();
        for (int size = m132519l.size() - 1; size >= 0; size--) {
            C31874cb c31874cb = (C31874cb) m132519l.get(size);
            if (c31874cb != null && c31874cb.f146385a != null && (C18644n.m98531l().m98558u(c31874cb.f146385a) || C21927m.m114302u().m114312J().m153137g(c31874cb.f146385a))) {
                m132519l.remove(size);
            }
        }
        if (!z11 && ZaloListView.m86975fN() && !f122588c.isEmpty()) {
            for (C31874cb c31874cb2 : new ArrayList(f122588c.values())) {
                if (!C25641k.m132506o().m132527w(c31874cb2.f146385a)) {
                    m132519l.add(c31874cb2);
                }
            }
        }
        Collections.sort(m132519l, f122587b);
        return m132519l;
    }

    /* renamed from: j */
    public static List m132480j() {
        return C25639i.m132496q().m132462f();
    }

    /* renamed from: k */
    public static int m132481k() {
        return C25639i.m132496q().m132463g();
    }

    /* renamed from: l */
    public static List m132482l() {
        return C25637g.m132489q().m132462f();
    }

    /* renamed from: m */
    public static int m132483m() {
        return C25637g.m132489q().m132463g();
    }

    /* renamed from: n */
    public static boolean m132484n(String str) {
        if (!TextUtils.isEmpty(str)) {
            return f122588c.containsKey(str);
        }
        return false;
    }

    /* renamed from: o */
    public static /* synthetic */ int m132485o(C31874cb c31874cb, C31874cb c31874cb2) {
        long j11 = c31874cb.f146383E;
        long j12 = c31874cb2.f146383E;
        if (j11 > j12) {
            return 1;
        }
        if (j11 < j12) {
            return -1;
        }
        return 0;
    }

    /* renamed from: p */
    public static /* synthetic */ int m132486p(C31874cb c31874cb, C31874cb c31874cb2) {
        return Long.compare(c31874cb2.f146398n, c31874cb.f146398n);
    }

    /* renamed from: q */
    public static void m132487q(String str) {
        C25639i.m132496q().m132467l(str);
    }

    /* renamed from: r */
    public static void m132488r(String str) {
        C25637g.m132489q().m132467l(str);
    }
}
