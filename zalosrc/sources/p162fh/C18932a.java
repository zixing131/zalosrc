package p162fh;

import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import org.json.JSONObject;
import p173fz.C19172a;
import p210hh.C20058a;
import p210hh.C20059b;
import p405ov.C24559a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;

/* renamed from: fh.a */
/* loaded from: classes3.dex */
public final class C18932a {

    /* renamed from: a */
    public static final C18932a f94442a = new C18932a();

    /* renamed from: b */
    private static final C29234i f94443b;

    /* renamed from: c */
    private static final InterfaceC29232g f94444c;

    /* renamed from: d */
    private static final InterfaceC29232g f94445d;

    /* renamed from: fh.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f94446q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20058a mo12V4() {
            return C18932a.f94442a.m99177n();
        }
    }

    /* renamed from: fh.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f94447q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20059b mo12V4() {
            return C18932a.f94442a.m99178o();
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f94443b = m145994a;
        f94444c = AbstractC29233h.m145991b(m145994a, b.f94447q);
        f94445d = AbstractC29233h.m145991b(m145994a, a.f94446q);
    }

    private C18932a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final C20058a m99177n() {
        boolean z11;
        C20058a c20058a = new C20058a(false, false, false, 7, null);
        c20058a.m104185e(AbstractC0924m0.m3838gc());
        C24559a.m127933c("[ConversationTag]", "loadChatTagSettingConfig->SharedPrefData.isSettingChatLabel()=" + AbstractC0924m0.m3838gc());
        int m4308w5 = AbstractC0924m0.m4308w5();
        boolean z12 = false;
        if (m4308w5 != 1 && (m4308w5 == 0 || !m99180d().m104202i())) {
            z11 = false;
        } else {
            z11 = true;
        }
        c20058a.m104186f(z11);
        int m2926B5 = AbstractC0924m0.m2926B5();
        if (m2926B5 == 1 || (m2926B5 != 0 && m99180d().m104195b())) {
            z12 = true;
        }
        c20058a.m104187g(z12);
        C24559a.m127933c("[ConversationTag]", "loadChatTagSettingConfig " + C20058a.Companion.m104193c(c20058a));
        return c20058a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final C20059b m99178o() {
        C20059b c20059b = new C20059b();
        c20059b.m104194a(C20059b.Companion.m104210a(new JSONObject(AbstractC0924m0.m3355Q())));
        boolean z11 = false;
        if (C19172a.m100600k("features@comm4work@chat_label@tag_show_beta_badge", 0) != 0) {
            z11 = true;
        }
        c20059b.m104205l(z11);
        C24559a.m127933c("[ConversationTag]", "loadChatTagConfig " + AbstractC0924m0.m3355Q());
        return c20059b;
    }

    /* renamed from: c */
    public final C20058a m99179c() {
        return (C20058a) f94445d.getValue();
    }

    /* renamed from: d */
    public final C20059b m99180d() {
        return (C20059b) f94444c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m99181e() {
        if (m99180d().m104197d()) {
            if (m99188l()) {
                int m104199f = m99180d().m104199f();
                if (m104199f != 1) {
                    if (m104199f == 2) {
                        return 17;
                    }
                }
                return 16;
            }
            if (m99179c().m104182b()) {
                if (!m99179c().m104181a()) {
                    return 16;
                }
            }
        } else if (m99179c().m104181a()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: f */
    public final boolean m99182f() {
        return m99179c().m104181a();
    }

    /* renamed from: g */
    public final boolean m99183g() {
        if (!m99182f() && !m99184h()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m99184h() {
        if (m99180d().m104197d() && m99179c().m104182b()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m99185i() {
        return m99180d().m104198e();
    }

    /* renamed from: j */
    public final boolean m99186j() {
        if (m99184h() && m99179c().m104183c()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m99187k(int i11) {
        return i11 == 0;
    }

    /* renamed from: l */
    public final boolean m99188l() {
        int m4308w5 = AbstractC0924m0.m4308w5();
        if (m4308w5 != 0 && m4308w5 != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m99189m() {
        if (m99184h() && !AbstractC0924m0.m3339Pc()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m99190p() {
        C24559a.m127933c("[ConversationTag]", "resetConfig");
        f94443b.m145993b();
    }

    /* renamed from: q */
    public final void m99191q() {
        AbstractC0924m0.m4092oq(true);
    }
}
