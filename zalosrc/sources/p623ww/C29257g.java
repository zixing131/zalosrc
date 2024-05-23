package p623ww;

import ag0.AbstractC0837p0;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.C20131e;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import me0.AbstractC23238v2;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.C24848g0;
import su.AbstractC26389c;
import th.C26680a;

/* renamed from: ww.g */
/* loaded from: classes4.dex */
public final class C29257g {

    /* renamed from: a */
    public static final C29257g f135528a = new C29257g();

    /* renamed from: b */
    private static JSONArray f135529b;

    /* renamed from: c */
    private static String f135530c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f135531q;

        /* renamed from: r */
        final /* synthetic */ int f135532r;

        /* renamed from: s */
        final /* synthetic */ String f135533s;

        /* renamed from: t */
        final /* synthetic */ String f135534t;

        /* renamed from: u */
        final /* synthetic */ String f135535u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ww.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33048a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ String f135536q;

            /* renamed from: r */
            final /* synthetic */ String f135537r;

            /* renamed from: s */
            final /* synthetic */ String f135538s;

            /* renamed from: t */
            final /* synthetic */ int f135539t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f135540u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33048a(String str, String str2, String str3, int i11, InterfaceC18509p interfaceC18509p) {
                super(2);
                this.f135536q = str;
                this.f135537r = str2;
                this.f135538s = str3;
                this.f135539t = i11;
                this.f135540u = interfaceC18509p;
            }

            /* renamed from: a */
            public final void m146123a(String str, boolean z11) {
                C29257g c29257g = C29257g.f135528a;
                if (str == null) {
                    str = this.f135536q;
                }
                c29257g.m146113k(str, this.f135537r, this.f135538s, this.f135539t + 1, this.f135540u);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m146123a((String) obj, ((Boolean) obj2).booleanValue());
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18509p interfaceC18509p, int i11, String str, String str2, String str3) {
            super(2);
            this.f135531q = interfaceC18509p;
            this.f135532r = i11;
            this.f135533s = str;
            this.f135534t = str2;
            this.f135535u = str3;
        }

        /* renamed from: a */
        public final void m146122a(File file, boolean z11) {
            AbstractC19074t.m100208f(file, "file");
            try {
                if (z11) {
                    this.f135531q.mo240pC(file, Boolean.TRUE);
                    return;
                }
                if (this.f135532r == 0) {
                    if (file.exists()) {
                        file.delete();
                    }
                    C29257g c29257g = C29257g.f135528a;
                    String str = this.f135533s;
                    c29257g.m146116n(file, str, new C33048a(this.f135534t, this.f135535u, str, this.f135532r, this.f135531q));
                    return;
                }
                this.f135531q.mo240pC(file, Boolean.FALSE);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m146122a((File) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ String f135541q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18510q f135542r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, InterfaceC18510q interfaceC18510q) {
            super(2);
            this.f135541q = str;
            this.f135542r = interfaceC18510q;
        }

        /* renamed from: a */
        public final void m146124a(File file, boolean z11) {
            AbstractC19074t.m100208f(file, "file");
            try {
                if (z11) {
                    C29257g.f135528a.m146117o(file, this.f135541q, this.f135542r);
                } else {
                    this.f135542r.mo45599Hr(null, this.f135541q, Boolean.FALSE);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m146124a((File) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ww.g$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f135543a;

        c(InterfaceC18509p interfaceC18509p) {
            this.f135543a = interfaceC18509p;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "path");
            this.f135543a.mo240pC(str, Boolean.TRUE);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            this.f135543a.mo240pC(null, Boolean.FALSE);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        public static final d f135544q = new d();

        d() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m146125a((String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m146125a(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str2, "checksum");
            if (z11 && str != null) {
                try {
                    if (str.length() != 0) {
                        C29257g c29257g = C29257g.f135528a;
                        C29257g.f135529b = new JSONArray(str);
                        C29257g.f135530c = str2;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return;
                }
            }
            C29257g.f135528a.m146111h();
        }
    }

    private C29257g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m146111h() {
        f135529b = null;
        f135530c = null;
    }

    /* renamed from: j */
    private final String m146112j() {
        return C20131e.f99303a.m104945c() + "qr_bank_list";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m146113k(String str, String str2, String str3, int i11, InterfaceC18509p interfaceC18509p) {
        m146114l(m146112j(), str2, new a(interfaceC18509p, i11, str3, str, str2));
    }

    /* renamed from: l */
    private final void m146114l(String str, String str2, InterfaceC18509p interfaceC18509p) {
        File file = new File(str);
        try {
            if (file.exists()) {
                interfaceC18509p.mo240pC(file, Boolean.valueOf(AbstractC19074t.m100204b(AbstractC26389c.m135987c(file), str2)));
            } else {
                interfaceC18509p.mo240pC(file, Boolean.FALSE);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            interfaceC18509p.mo240pC(file, Boolean.FALSE);
        }
    }

    /* renamed from: m */
    private final void m146115m(String str, String str2, String str3, InterfaceC18510q interfaceC18510q) {
        m146113k(str, str2, str3, 0, new b(str2, interfaceC18510q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m146116n(File file, String str, InterfaceC18509p interfaceC18509p) {
        C20627a c20627a = new C20627a(false);
        c20627a.m107419g0(new c(interfaceC18509p));
        c20627a.m107416d0(false);
        c20627a.m107420h0(file.getAbsolutePath());
        c20627a.m107488m(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m146117o(File file, String str, InterfaceC18510q interfaceC18510q) {
        String m119725j;
        try {
            byte[] m119724i = AbstractC23238v2.m119724i(file);
            if (m119724i != null && (m119725j = AbstractC23238v2.m119725j(m119724i)) != null) {
                interfaceC18510q.mo45599Hr(m119725j, str, Boolean.TRUE);
            } else {
                interfaceC18510q.mo45599Hr(null, str, Boolean.FALSE);
            }
        } catch (Exception e11) {
            interfaceC18510q.mo45599Hr(null, str, Boolean.FALSE);
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    private final void m146118p() {
        if (C26680a.m137023g() == 0) {
            m146111h();
            return;
        }
        C26680a c26680a = C26680a.f126349a;
        if (AbstractC19074t.m100204b(c26680a.m137029d(), f135530c)) {
            return;
        }
        String m137029d = c26680a.m137029d();
        String m137028c = c26680a.m137028c();
        if (m137028c != null && m137028c.length() != 0 && m137029d != null && m137029d.length() != 0) {
            m146115m(m146112j(), m137029d, m137028c, d.f135544q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m146119r() {
        try {
            f135528a.m146118p();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    public final JSONObject m146120i(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "bin");
        JSONArray jSONArray = f135529b;
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("bin");
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str2, str)) {
                return optJSONObject;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final void m146121q() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ww.f
            @Override // java.lang.Runnable
            public final void run() {
                C29257g.m146119r();
            }
        });
    }
}
