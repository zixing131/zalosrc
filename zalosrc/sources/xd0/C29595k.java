package xd0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import p019aj.C0876j;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19383g;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import tj.C26710b;
import wd0.C28931k;
import xd0.C29593i;

/* renamed from: xd0.k */
/* loaded from: classes4.dex */
public final class C29595k extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f136612a;

    /* renamed from: b */
    private final C29593i f136613b;

    /* renamed from: xd0.k$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xd0.k$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f136614a;

        /* renamed from: b */
        private final String f136615b;

        /* renamed from: c */
        private final C17969i0 f136616c;

        /* renamed from: d */
        private final long f136617d;

        /* renamed from: e */
        private final long f136618e;

        /* renamed from: f */
        private final c f136619f;

        /* renamed from: g */
        private final boolean f136620g;

        public b(String str, String str2, C17969i0 c17969i0, long j11, long j12, c cVar, boolean z11) {
            AbstractC19074t.m100208f(str, "uid");
            AbstractC19074t.m100208f(str2, "msgText");
            AbstractC19074t.m100208f(cVar, "extraRules");
            this.f136614a = str;
            this.f136615b = str2;
            this.f136616c = c17969i0;
            this.f136617d = j11;
            this.f136618e = j12;
            this.f136619f = cVar;
            this.f136620g = z11;
        }

        /* renamed from: a */
        public final C17969i0 m147076a() {
            return this.f136616c;
        }

        /* renamed from: b */
        public final c m147077b() {
            return this.f136619f;
        }

        /* renamed from: c */
        public final boolean m147078c() {
            return this.f136620g;
        }

        /* renamed from: d */
        public final String m147079d() {
            return this.f136615b;
        }

        /* renamed from: e */
        public final long m147080e() {
            return this.f136618e;
        }

        /* renamed from: f */
        public final long m147081f() {
            return this.f136617d;
        }

        /* renamed from: g */
        public final String m147082g() {
            return this.f136614a;
        }

        public /* synthetic */ b(String str, String str2, C17969i0 c17969i0, long j11, long j12, c cVar, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, str2, c17969i0, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? -1L : j12, (i11 & 32) != 0 ? c.Companion.m147086a() : cVar, (i11 & 64) != 0 ? false : z11);
        }
    }

    /* renamed from: xd0.k$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final a Companion = new a(null);

        /* renamed from: c */
        private static final c f136621c = new c(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

        /* renamed from: a */
        private final boolean f136622a;

        /* renamed from: b */
        private final C26710b f136623b;

        /* renamed from: xd0.k$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m147086a() {
                return c.f136621c;
            }
        }

        public c() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        /* renamed from: b */
        public final C26710b m147084b() {
            return this.f136623b;
        }

        /* renamed from: c */
        public final boolean m147085c() {
            return this.f136622a;
        }

        public c(boolean z11) {
            this(z11, null, 2, 0 == true ? 1 : 0);
        }

        public c(boolean z11, C26710b c26710b) {
            this.f136622a = z11;
            this.f136623b = c26710b;
        }

        public /* synthetic */ c(boolean z11, C26710b c26710b, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? null : c26710b);
        }
    }

    /* renamed from: xd0.k$d */
    /* loaded from: classes4.dex */
    public static final class d implements AbstractC19378b.a {

        /* renamed from: b */
        final /* synthetic */ String f136625b;

        d(String str) {
            this.f136625b = str;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C29593i.b bVar) {
            AbstractC19074t.m100208f(bVar, "response");
            C29595k.this.m147074f(this.f136625b);
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
        }
    }

    public C29595k(C0876j c0876j, C29593i c29593i) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c29593i, "insertMsgUseCase");
        this.f136612a = c0876j;
        this.f136613b = c29593i;
    }

    /* renamed from: d */
    private final C17945a0 m147072d(String str, String str2, long j11, C17969i0 c17969i0, long j12) {
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str3, "currentUserUid");
        C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", str, str3), 20).m95382r(str2).m95359K(j11).m95368d(c17969i0).m95361M(j12).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m95365a.m94951M9();
        return m95365a;
    }

    /* renamed from: e */
    private final long m147073e(long j11) {
        if (j11 <= 0) {
            return AbstractC23306f.m120599M0().m103087c();
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m147074f(String str) {
        if (C11318b.Companion.m60525a().m60515j(str)) {
            C23744a.Companion.m124119a().m124116d(125, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        String m147082g = bVar.m147082g();
        String m147079d = bVar.m147079d();
        c m147077b = bVar.m147077b();
        C26710b m147084b = m147077b.m147084b();
        if (m147079d.length() == 0) {
            return;
        }
        try {
            C17945a0 m147072d = m147072d(m147082g, m147079d, m147073e(bVar.m147080e()), bVar.m147076a(), bVar.m147081f());
            if (m147084b != null && this.f136612a.m2612O(m147084b.m137328c())) {
                return;
            }
            this.f136613b.m101501b(new C29593i.a(m147082g, m147072d, new C28931k.d(false, false, m147077b.m147085c(), 2, null), m147084b, bVar.m147078c()), new d(m147082g));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("InsertMsgInfo", e11);
        }
    }
}
