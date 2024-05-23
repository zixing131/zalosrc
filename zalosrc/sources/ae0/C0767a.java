package ae0;

import com.zing.zalo.control.ContactProfile;
import me0.AbstractC23063f2;
import mm0.AbstractC23350e;
import p019aj.C0872f;
import p056cj.C3535c;
import p105dn.EnumC18030a;
import p185gc.AbstractC19378b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p716zh.C31922g;
import vg.C28203u6;

/* renamed from: ae0.a */
/* loaded from: classes4.dex */
public class C0767a extends AbstractC19378b {

    /* renamed from: a */
    private final C21927m f2650a;

    /* renamed from: b */
    private final C0872f f2651b;

    /* renamed from: ae0.a$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        C3535c f2652a;

        /* renamed from: b */
        EnumC18030a f2653b;

        /* renamed from: c */
        boolean f2654c;

        /* renamed from: d */
        private final boolean f2655d;

        public a(C3535c c3535c, EnumC18030a enumC18030a, boolean z11, boolean z12) {
            this.f2652a = c3535c;
            this.f2653b = enumC18030a;
            this.f2654c = z11;
            this.f2655d = z12;
        }
    }

    /* renamed from: ae0.a$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public boolean f2656a;

        /* renamed from: b */
        public C31922g f2657b;

        /* renamed from: c */
        public boolean f2658c;

        /* renamed from: d */
        public boolean f2659d;

        /* renamed from: e */
        public boolean f2660e;

        /* renamed from: f */
        public boolean f2661f;

        /* renamed from: g */
        public boolean f2662g;

        /* renamed from: h */
        public int f2663h;
    }

    public C0767a(C21927m c21927m, C0872f c0872f) {
        this.f2650a = c21927m;
        this.f2651b = c0872f;
    }

    /* renamed from: e */
    private boolean m1883e(a aVar) {
        if (aVar != null && aVar.f2652a != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    @Override // p185gc.AbstractC19378b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1884d(a aVar, AbstractC19378b.a aVar2) {
        if (aVar2 == null) {
            return;
        }
        if (!m1883e(aVar)) {
            aVar2.mo1004b();
            return;
        }
        b bVar = null;
        try {
            C3535c c3535c = aVar.f2652a;
            C28203u6 c28203u6 = C28203u6.f131407a;
            ContactProfile m141809c = c28203u6.m141809c(c3535c.m17944I0());
            if (m141809c != null && !m141809c.m40374K0() && !m141809c.m40384Q0() && aVar.f2653b != EnumC18030a.SINGLE_PAGE) {
                String mo2478b = m141809c.mo2478b();
                b bVar2 = new b();
                try {
                    bVar2.f2656a = AbstractC21935u.m114555v(m141809c.f42434r, true);
                    bVar2.f2658c = AbstractC23063f2.m118359k(mo2478b);
                    bVar2.f2659d = AbstractC23063f2.m118360l(mo2478b);
                    bVar2.f2660e = this.f2650a.m114312J().m153137g(mo2478b);
                    C31922g c31922g = m141809c.f42389W1;
                    if (c31922g == null) {
                        c31922g = C31922g.m153381c();
                    }
                    bVar2.f2657b = c31922g;
                    bVar2.f2662g = aVar.f2654c;
                    bVar2.f2663h = m141809c.f42395Y1;
                    c3535c.m17971y0().m40997J(m141809c);
                    c28203u6.m141822u(m141809c);
                    int m153382d = bVar2.f2657b.m153382d();
                    if (m153382d != 1) {
                        if (m153382d == 2) {
                            bVar2.f2661f = true;
                        }
                    } else if (!bVar2.f2656a) {
                        if (!aVar.f2654c) {
                            bVar2.f2661f = this.f2651b.m2529X(mo2478b);
                            bVar2.f2662g = true;
                        } else {
                            bVar2.f2661f = aVar.f2655d;
                        }
                    }
                    bVar = bVar2;
                } catch (Exception e11) {
                    e = e11;
                    bVar = bVar2;
                    AbstractC23350e.m122776f("CheckUserPrivacy", e);
                    if (bVar != null) {
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (bVar != null) {
            aVar2.mo1004b();
        } else {
            aVar2.onSuccess(bVar);
        }
    }
}
