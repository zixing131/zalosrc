package p304ks;

import am.AbstractC0924m0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ks.n */
/* loaded from: classes.dex */
public final class C21928n {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f107849b;

    /* renamed from: a */
    private final InterfaceC21921g f107850a;

    /* renamed from: ks.n$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f107851q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21928n mo12V4() {
            return c.f107852a.m114390a();
        }
    }

    /* renamed from: ks.n$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21928n m114389a() {
            return (C21928n) C21928n.f107849b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ks.n$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f107852a = new c();

        /* renamed from: b */
        private static final C21928n f107853b;

        static {
            C7960e m120592K = AbstractC23306f.m120592K();
            AbstractC19074t.m100207e(m120592K, "provideDatabaseHelper(...)");
            f107853b = new C21928n(new C21922h(m120592K));
        }

        private c() {
        }

        /* renamed from: a */
        public final C21928n m114390a() {
            return f107853b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f107851q);
        f107849b = m129210a;
    }

    public C21928n(InterfaceC21921g interfaceC21921g) {
        AbstractC19074t.m100208f(interfaceC21921g, "localDataSource");
        this.f107850a = interfaceC21921g;
    }

    /* renamed from: h */
    public static final C21928n m114372h() {
        return Companion.m114389a();
    }

    /* renamed from: b */
    public final int m114373b(List list) {
        AbstractC19074t.m100208f(list, "listUid");
        return this.f107850a.mo114274a(list);
    }

    /* renamed from: c */
    public final void m114374c() {
        this.f107850a.mo114276c();
    }

    /* renamed from: d */
    public final void m114375d() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 42);
        boolean m3538W8 = AbstractC0924m0.m3538W8();
        boolean m3020Ec = AbstractC0924m0.m3020Ec();
        boolean mo114285l = this.f107850a.mo114285l();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        C21923i.m114291c(m127130z + "\nMigrated tbl friend: " + m3538W8 + "\nNew tbl friend created: " + m3020Ec + "\nExist old tbl friend: " + mo114285l + "\n" + m127130z2);
    }

    /* renamed from: e */
    public final ContactProfile m114376e(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f107850a.mo114280g(str);
    }

    /* renamed from: f */
    public final ContactProfile m114377f(String str) {
        return this.f107850a.mo114287n(str);
    }

    /* renamed from: g */
    public final ArrayList m114378g() {
        return this.f107850a.mo114279f();
    }

    /* renamed from: i */
    public final List m114379i() {
        return this.f107850a.mo114281h();
    }

    /* renamed from: j */
    public final long m114380j(List list, boolean z11, int i11, boolean z12) {
        AbstractC19074t.m100208f(list, "friendList");
        return this.f107850a.mo114277d(list, z11, i11, z12);
    }

    /* renamed from: k */
    public final long m114381k(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profileFriend");
        return this.f107850a.mo114278e(contactProfile);
    }

    /* renamed from: l */
    public final boolean m114382l(String str) {
        return this.f107850a.mo114288o(str);
    }

    /* renamed from: m */
    public final int m114383m(String str) {
        return this.f107850a.mo114284k(str);
    }

    /* renamed from: n */
    public final long m114384n(List list) {
        return this.f107850a.mo114283j(list);
    }

    /* renamed from: o */
    public final int m114385o(String str, String str2) {
        return this.f107850a.mo114286m(str, str2);
    }

    /* renamed from: p */
    public final int m114386p(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "phone");
        return this.f107850a.mo114275b(str, str2);
    }

    /* renamed from: q */
    public final int m114387q(String str, int i11) {
        return this.f107850a.mo114282i(str, i11);
    }
}
