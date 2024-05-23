package me0;

import ai.C0862b;
import ai.InterfaceC0861a;
import ai.InterfaceC0865e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import java.util.Comparator;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import sm0.AbstractC26327c;

/* renamed from: me0.m1 */
/* loaded from: classes4.dex */
public final class C23139m1 {

    /* renamed from: a */
    public static final C23139m1 f112256a = new C23139m1();

    /* renamed from: b */
    private static final Comparator f112257b;

    /* renamed from: c */
    private static final Comparator f112258c;

    /* renamed from: d */
    private static final Comparator f112259d;

    /* renamed from: e */
    private static final Comparator f112260e;

    /* renamed from: f */
    private static final Comparator f112261f;

    /* renamed from: g */
    private static final Comparator f112262g;

    /* renamed from: me0.m1$a */
    /* loaded from: classes4.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            C23139m1 c23139m1 = C23139m1.f112256a;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(c23139m1.m118792k((ContactProfile) obj)), Integer.valueOf(c23139m1.m118792k((ContactProfile) obj2)));
            return m135478b;
        }
    }

    /* renamed from: me0.m1$b */
    /* loaded from: classes4.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            C23139m1 c23139m1 = C23139m1.f112256a;
            m135478b = AbstractC26327c.m135478b(Float.valueOf(c23139m1.m118795o((ContactProfile) obj2)), Float.valueOf(c23139m1.m118795o((ContactProfile) obj)));
            return m135478b;
        }
    }

    /* renamed from: me0.m1$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            C23139m1 c23139m1 = C23139m1.f112256a;
            m135478b = AbstractC26327c.m135478b(Float.valueOf(c23139m1.m118795o((InterfaceC0865e) obj2)), Float.valueOf(c23139m1.m118795o((InterfaceC0865e) obj)));
            return m135478b;
        }
    }

    /* renamed from: me0.m1$d */
    /* loaded from: classes4.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            C23139m1 c23139m1 = C23139m1.f112256a;
            m135478b = AbstractC26327c.m135478b(Float.valueOf(c23139m1.m118795o((InterfaceC0861a) obj2)), Float.valueOf(c23139m1.m118795o((InterfaceC0861a) obj)));
            return m135478b;
        }
    }

    /* renamed from: me0.m1$e */
    /* loaded from: classes4.dex */
    public static final class e implements Comparator {

        /* renamed from: p */
        final /* synthetic */ Comparator f112263p;

        public e(Comparator comparator) {
            this.f112263p = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            int compare = this.f112263p.compare(obj, obj2);
            if (compare == 0) {
                C23139m1 c23139m1 = C23139m1.f112256a;
                m135478b = AbstractC26327c.m135478b(Integer.valueOf(c23139m1.m118796r((ContactProfile) obj)), Integer.valueOf(c23139m1.m118796r((ContactProfile) obj2)));
                return m135478b;
            }
            return compare;
        }
    }

    /* renamed from: me0.m1$f */
    /* loaded from: classes4.dex */
    public static final class f implements Comparator {

        /* renamed from: p */
        final /* synthetic */ Comparator f112264p;

        public f(Comparator comparator) {
            this.f112264p = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            int compare = this.f112264p.compare(obj, obj2);
            if (compare == 0) {
                m135478b = AbstractC26327c.m135478b(Integer.valueOf(((ContactProfile) obj).f42392X1), Integer.valueOf(((ContactProfile) obj2).f42392X1));
                return m135478b;
            }
            return compare;
        }
    }

    /* renamed from: me0.m1$g */
    /* loaded from: classes4.dex */
    public static final class g implements Comparator {

        /* renamed from: p */
        final /* synthetic */ Comparator f112265p;

        public g(Comparator comparator) {
            this.f112265p = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            int compare = this.f112265p.compare(obj, obj2);
            if (compare == 0) {
                C23139m1 c23139m1 = C23139m1.f112256a;
                m135478b = AbstractC26327c.m135478b(Integer.valueOf(c23139m1.m118794n((ContactProfile) obj)), Integer.valueOf(c23139m1.m118794n((ContactProfile) obj2)));
                return m135478b;
            }
            return compare;
        }
    }

    /* renamed from: me0.m1$h */
    /* loaded from: classes4.dex */
    public static final class h implements Comparator {

        /* renamed from: p */
        final /* synthetic */ Comparator f112266p;

        public h(Comparator comparator) {
            this.f112266p = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            int compare = this.f112266p.compare(obj, obj2);
            if (compare == 0) {
                C23139m1 c23139m1 = C23139m1.f112256a;
                m135478b = AbstractC26327c.m135478b(Integer.valueOf(c23139m1.m118793m((InterfaceC0861a) obj)), Integer.valueOf(c23139m1.m118793m((InterfaceC0861a) obj2)));
                return m135478b;
            }
            return compare;
        }
    }

    static {
        Comparator m135480d;
        Comparator m135480d2;
        Comparator m135480d3;
        C23117k1 c23117k1 = new Comparator() { // from class: me0.k1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m118791i;
                m118791i = C23139m1.m118791i((ContactProfile) obj, (ContactProfile) obj2);
                return m118791i;
            }
        };
        f112257b = c23117k1;
        m135480d = AbstractC26327c.m135480d(new g(new f(new e(new a()))), c23117k1);
        f112258c = m135480d;
        C23128l1 c23128l1 = new Comparator() { // from class: me0.l1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m118790h;
                m118790h = C23139m1.m118790h((InterfaceC0861a) obj, (InterfaceC0861a) obj2);
                return m118790h;
            }
        };
        f112259d = c23128l1;
        m135480d2 = AbstractC26327c.m135480d(new b(), m135480d);
        f112260e = m135480d2;
        f112261f = new c();
        m135480d3 = AbstractC26327c.m135480d(new h(new d()), c23128l1);
        f112262g = m135480d3;
    }

    private C23139m1() {
    }

    /* renamed from: h */
    public static final int m118790h(InterfaceC0861a interfaceC0861a, InterfaceC0861a interfaceC0861a2) {
        if ((interfaceC0861a instanceof ContactProfile) && (interfaceC0861a2 instanceof ContactProfile)) {
            return f112258c.compare(interfaceC0861a, interfaceC0861a2);
        }
        return 0;
    }

    /* renamed from: i */
    public static final int m118791i(ContactProfile contactProfile, ContactProfile contactProfile2) {
        String str;
        String str2 = contactProfile.f42371Q1;
        if (str2 != null && str2.length() != 0 && (str = contactProfile2.f42371Q1) != null && str.length() != 0) {
            String str3 = contactProfile.f42371Q1;
            String str4 = contactProfile2.f42371Q1;
            AbstractC19074t.m100207e(str4, "dpnForSort");
            return str3.compareTo(str4);
        }
        String m40383Q = contactProfile.m40383Q(true, false);
        String m40383Q2 = contactProfile2.m40383Q(true, false);
        AbstractC19074t.m100207e(m40383Q2, "getDpnPhoneContact(...)");
        return m40383Q.compareTo(m40383Q2);
    }

    /* renamed from: k */
    public final int m118792k(ContactProfile contactProfile) {
        int i11 = contactProfile.f42390X;
        if (i11 == -1) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    /* renamed from: m */
    public final int m118793m(InterfaceC0861a interfaceC0861a) {
        if ((interfaceC0861a instanceof ContactProfile) || (interfaceC0861a instanceof C0862b)) {
            return 1;
        }
        if (interfaceC0861a instanceof InterfaceC0865e) {
            return 3;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: n */
    public final int m118794n(ContactProfile contactProfile) {
        return contactProfile.f42396Z;
    }

    /* renamed from: o */
    public final float m118795o(InterfaceC0861a interfaceC0861a) {
        return interfaceC0861a.mo2479d();
    }

    /* renamed from: r */
    public final int m118796r(ContactProfile contactProfile) {
        return !contactProfile.f42393Y ? 1 : 0;
    }

    /* renamed from: j */
    public final ContactProfile m118797j() {
        ContactProfile contactProfile = new ContactProfile("-1000001");
        contactProfile.mo2476e(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dpn_profile_zalo_video));
        return contactProfile;
    }

    /* renamed from: l */
    public final Comparator m118798l() {
        return f112262g;
    }

    /* renamed from: p */
    public final String m118799p(InterfaceC0861a interfaceC0861a) {
        AbstractC19074t.m100208f(interfaceC0861a, "<this>");
        if (interfaceC0861a instanceof ContactProfile) {
            String str = ((ContactProfile) interfaceC0861a).f42446v;
            AbstractC19074t.m100205c(str);
            return str;
        }
        if (interfaceC0861a instanceof C0862b) {
            return ((C0862b) interfaceC0861a).m2477a();
        }
        return "";
    }

    /* renamed from: q */
    public final String m118800q(InterfaceC0861a interfaceC0861a) {
        AbstractC19074t.m100208f(interfaceC0861a, "<this>");
        if (interfaceC0861a instanceof ContactProfile) {
            ContactProfile contactProfile = (ContactProfile) interfaceC0861a;
            if (!AbstractC25495a.m132079d(contactProfile.f42434r)) {
                String m40383Q = contactProfile.m40383Q(true, false);
                AbstractC19074t.m100205c(m40383Q);
                return m40383Q;
            }
        }
        String mo2475c = interfaceC0861a.mo2475c();
        AbstractC19074t.m100205c(mo2475c);
        return mo2475c;
    }

    /* renamed from: s */
    public final boolean m118801s(InterfaceC0861a interfaceC0861a) {
        AbstractC19074t.m100208f(interfaceC0861a, "<this>");
        if (!AbstractC25495a.m132084i(interfaceC0861a.mo2478b()) && !AbstractC25495a.m132081f(interfaceC0861a.mo2478b()) && !AbstractC25495a.m132078c(interfaceC0861a.mo2478b())) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean m118802t(boolean z11, String str) {
        if (z11 && C21927m.m114302u().m114345m(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final ContactProfile m118803u(C31973j5 c31973j5) {
        AbstractC19074t.m100208f(c31973j5, "<this>");
        ContactProfile contactProfile = new ContactProfile("group_" + c31973j5.m153781r());
        contactProfile.f42437s = c31973j5.m153793y();
        String m153756e = c31973j5.m153756e();
        if (m153756e != null) {
            contactProfile.f42446v = m153756e;
        }
        return contactProfile;
    }
}
