package p623ww;

import ag0.AbstractC0837p0;
import com.zing.zalo.MainApplication;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import ho0.AbstractC20110a;
import hu.C20131e;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import me0.AbstractC23238v2;
import org.json.JSONObject;
import pm0.C24848g0;
import su.AbstractC26389c;
import th.C26680a;

/* renamed from: ww.e */
/* loaded from: classes4.dex */
public final class C29255e {

    /* renamed from: a */
    public static final C29255e f135512a = new C29255e();

    /* renamed from: b */
    private static C29253c f135513b;

    /* renamed from: c */
    private static String f135514c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f135515q;

        /* renamed from: r */
        final /* synthetic */ int f135516r;

        /* renamed from: s */
        final /* synthetic */ String f135517s;

        /* renamed from: t */
        final /* synthetic */ String f135518t;

        /* renamed from: u */
        final /* synthetic */ String f135519u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ww.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33047a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ String f135520q;

            /* renamed from: r */
            final /* synthetic */ String f135521r;

            /* renamed from: s */
            final /* synthetic */ String f135522s;

            /* renamed from: t */
            final /* synthetic */ int f135523t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f135524u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33047a(String str, String str2, String str3, int i11, InterfaceC18509p interfaceC18509p) {
                super(2);
                this.f135520q = str;
                this.f135521r = str2;
                this.f135522s = str3;
                this.f135523t = i11;
                this.f135524u = interfaceC18509p;
            }

            /* renamed from: a */
            public final void m146099a(String str, boolean z11) {
                C29255e c29255e = C29255e.f135512a;
                if (str == null) {
                    str = this.f135520q;
                }
                c29255e.m146087j(str, this.f135521r, this.f135522s, this.f135523t + 1, this.f135524u);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m146099a((String) obj, ((Boolean) obj2).booleanValue());
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18509p interfaceC18509p, int i11, String str, String str2, String str3) {
            super(2);
            this.f135515q = interfaceC18509p;
            this.f135516r = i11;
            this.f135517s = str;
            this.f135518t = str2;
            this.f135519u = str3;
        }

        /* renamed from: a */
        public final void m146098a(File file, boolean z11) {
            AbstractC19074t.m100208f(file, "file");
            try {
                if (z11) {
                    this.f135515q.mo240pC(file, Boolean.TRUE);
                    return;
                }
                if (this.f135516r == 0) {
                    if (file.exists()) {
                        file.delete();
                    }
                    C29255e c29255e = C29255e.f135512a;
                    String str = this.f135517s;
                    c29255e.m146090m(file, str, new C33047a(this.f135518t, this.f135519u, str, this.f135516r, this.f135515q));
                    return;
                }
                this.f135515q.mo240pC(file, Boolean.FALSE);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m146098a((File) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ String f135525q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18511r f135526r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, InterfaceC18511r interfaceC18511r) {
            super(2);
            this.f135525q = str;
            this.f135526r = interfaceC18511r;
        }

        /* renamed from: a */
        public final void m146100a(File file, boolean z11) {
            AbstractC19074t.m100208f(file, "file");
            try {
                if (z11) {
                    C29255e.f135512a.m146095i(file, this.f135525q, this.f135526r);
                } else {
                    InterfaceC18511r interfaceC18511r = this.f135526r;
                    String str = this.f135525q;
                    Boolean bool = Boolean.FALSE;
                    interfaceC18511r.mo49340Uc(null, str, bool, bool);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m146100a((File) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ww.e$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f135527a;

        c(InterfaceC18509p interfaceC18509p) {
            this.f135527a = interfaceC18509p;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "path");
            this.f135527a.mo240pC(str, Boolean.TRUE);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            this.f135527a.mo240pC(null, Boolean.FALSE);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.e$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends C19071q implements InterfaceC18511r {
        d(Object obj) {
            super(4, obj, C29255e.class, "onEnd", "onEnd(Ljava/lang/String;Ljava/lang/String;ZZ)V", 0);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m146101h((String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m146101h(String str, String str2, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(str2, "p1");
            ((C29255e) this.f94922q).m146091n(str, str2, z11, z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.e$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C19071q implements InterfaceC18511r {
        e(Object obj) {
            super(4, obj, C29255e.class, "onEnd", "onEnd(Ljava/lang/String;Ljava/lang/String;ZZ)V", 0);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m146102h((String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m146102h(String str, String str2, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(str2, "p1");
            ((C29255e) this.f94922q).m146091n(str, str2, z11, z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ww.e$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends C19071q implements InterfaceC18511r {
        f(Object obj) {
            super(4, obj, C29255e.class, "onEnd", "onEnd(Ljava/lang/String;Ljava/lang/String;ZZ)V", 0);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m146103h((String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m146103h(String str, String str2, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(str2, "p1");
            ((C29255e) this.f94922q).m146091n(str, str2, z11, z12);
        }
    }

    private C29255e() {
    }

    /* renamed from: e */
    private final void m146084e() {
        f135513b = null;
        f135514c = null;
    }

    /* renamed from: f */
    private final String m146085f() {
        return C20131e.f99303a.m104945c() + "qr_bank_transfer_config";
    }

    /* renamed from: h */
    private final void m146086h(InterfaceC18511r interfaceC18511r) {
        try {
            InputStream open = MainApplication.Companion.m35500c().getAssets().open("qr/bank_card_config");
            AbstractC19074t.m100207e(open, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    String sb3 = sb2.toString();
                    Boolean bool = Boolean.TRUE;
                    interfaceC18511r.mo49340Uc(sb3, "d94f6ff7b239ea8509cde75c152a635a", bool, bool);
                    return;
                }
            }
        } catch (Exception e11) {
            interfaceC18511r.mo49340Uc(null, "d94f6ff7b239ea8509cde75c152a635a", Boolean.FALSE, Boolean.TRUE);
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m146087j(String str, String str2, String str3, int i11, InterfaceC18509p interfaceC18509p) {
        m146088k(m146085f(), str2, new a(interfaceC18509p, i11, str3, str, str2));
    }

    /* renamed from: k */
    private final void m146088k(String str, String str2, InterfaceC18509p interfaceC18509p) {
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

    /* renamed from: l */
    private final void m146089l(String str, String str2, String str3, InterfaceC18511r interfaceC18511r) {
        m146087j(str, str2, str3, 0, new b(str2, interfaceC18511r));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m146090m(File file, String str, InterfaceC18509p interfaceC18509p) {
        C20627a c20627a = new C20627a(false);
        c20627a.m107419g0(new c(interfaceC18509p));
        c20627a.m107416d0(false);
        c20627a.m107420h0(file.getAbsolutePath());
        c20627a.m107488m(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m146091n(String str, String str2, boolean z11, boolean z12) {
        if (z11 && str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    C29253c c29253c = new C29253c();
                    c29253c.m146058l(jSONObject.optInt("min_bank_num", 6));
                    c29253c.m146057k(jSONObject.optInt("max_bank_num", 16));
                    String optString = jSONObject.optString("parser");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    c29253c.m146054g(optString);
                    f135513b = c29253c;
                    f135514c = str2;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        if (!z12) {
            m146086h(new d(this));
        } else {
            f135513b = null;
            f135514c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m146092q() {
        try {
            f135512a.m146096o();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    private final void m146093r() {
        C26680a c26680a = C26680a.f126349a;
        String m137030e = c26680a.m137030e();
        String m137033k = c26680a.m137033k();
        if (m137033k != null && m137033k.length() != 0 && m137030e != null && m137030e.length() != 0 && !AbstractC19074t.m100204b(m137030e, "d94f6ff7b239ea8509cde75c152a635a")) {
            m146089l(m146085f(), m137030e, m137033k, new f(this));
        } else {
            m146086h(new e(this));
        }
    }

    /* renamed from: g */
    public final C29253c m146094g() {
        return f135513b;
    }

    /* renamed from: i */
    public final void m146095i(File file, String str, InterfaceC18511r interfaceC18511r) {
        String m119725j;
        AbstractC19074t.m100208f(file, "file");
        AbstractC19074t.m100208f(str, "checksum");
        AbstractC19074t.m100208f(interfaceC18511r, "onEnd");
        try {
            byte[] m119724i = AbstractC23238v2.m119724i(file);
            if (m119724i != null && (m119725j = AbstractC23238v2.m119725j(m119724i)) != null) {
                interfaceC18511r.mo49340Uc(m119725j, str, Boolean.TRUE, Boolean.FALSE);
            } else {
                Boolean bool = Boolean.FALSE;
                interfaceC18511r.mo49340Uc(null, str, bool, bool);
            }
        } catch (Exception e11) {
            Boolean bool2 = Boolean.FALSE;
            interfaceC18511r.mo49340Uc(null, str, bool2, bool2);
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o */
    public final void m146096o() {
        if (C26680a.m137023g() == 0) {
            m146084e();
        } else {
            if (AbstractC19074t.m100204b(C26680a.f126349a.m137030e(), f135514c)) {
                return;
            }
            m146093r();
        }
    }

    /* renamed from: p */
    public final void m146097p() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ww.d
            @Override // java.lang.Runnable
            public final void run() {
                C29255e.m146092q();
            }
        });
    }
}
