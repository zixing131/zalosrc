package xd0;

import ag0.C0814e0;
import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import eg0.AbstractC18428c;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import mg.C23288a;
import p056cj.C3535c;
import p185gc.AbstractC19378b;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import vg.C28081h4;
import xd0.C29599o;

/* renamed from: xd0.m */
/* loaded from: classes4.dex */
public final class C29597m extends AbstractC19378b {

    /* renamed from: a */
    private final C29599o f136627a;

    /* renamed from: xd0.m$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3535c f136628a;

        /* renamed from: b */
        private final C17945a0 f136629b;

        public a(C3535c c3535c, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c3535c, "chat");
            AbstractC19074t.m100208f(c17945a0, "msgToSend");
            this.f136628a = c3535c;
            this.f136629b = c17945a0;
        }

        /* renamed from: a */
        public final C3535c m147091a() {
            return this.f136628a;
        }

        /* renamed from: b */
        public final C17945a0 m147092b() {
            return this.f136629b;
        }
    }

    /* renamed from: xd0.m$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C17945a0 f136630a;

        public b(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "msg");
            this.f136630a = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m147093a() {
            return this.f136630a;
        }
    }

    /* renamed from: xd0.m$c */
    /* loaded from: classes4.dex */
    public static final class c implements AbstractC19378b.a {

        /* renamed from: a */
        final /* synthetic */ AbstractC19378b.a f136631a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f136632b;

        c(AbstractC19378b.a aVar, C17945a0 c17945a0) {
            this.f136631a = aVar;
            this.f136632b = c17945a0;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C29599o.b bVar) {
            AbstractC19074t.m100208f(bVar, "response");
            AbstractC19378b.a aVar = this.f136631a;
            if (aVar != null) {
                C17945a0 c17945a0 = this.f136632b;
                AbstractC19074t.m100207e(c17945a0, "$msgSendNew");
                aVar.onSuccess(new b(c17945a0));
            }
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            AbstractC19378b.a.C32825a.m101502a(this);
        }
    }

    public C29597m(C29599o c29599o) {
        AbstractC19074t.m100208f(c29599o, "sendMsgUseCase");
        this.f136627a = c29599o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m147089g(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$msgToSend");
        C7956b.Companion.m41573b().m41544k(c17945a0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19378b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo1884d(a aVar, AbstractC19378b.a aVar2) {
        AbstractC19074t.m100208f(aVar, "params");
        C3535c m147091a = aVar.m147091a();
        final C17945a0 m147092b = aVar.m147092b();
        try {
            m147091a.mo17960Z(m147092b);
            m147092b.m95220oa(true);
            AbstractC18428c.m97658a(C23288a.f113033a, m147091a.m17944I0(), 5, new Runnable() { // from class: xd0.l
                @Override // java.lang.Runnable
                public final void run() {
                    C29597m.m147089g(C17945a0.this);
                }
            });
            if (AbstractC25495a.m132079d(m147091a.m17944I0()) && m147092b.m95032V6() && m147092b.m95029V3().m41052p()) {
                C28081h4.m141541d().m141547h(m147092b.m95029V3().m41045i(), false);
            }
            C23744a.Companion.m124119a().m124116d(6054, m147092b);
            C0814e0.m2069o(m147092b);
            m147092b.m94928K1();
            m147092b.m95077Zb();
            if (m147092b.m95306y8()) {
                m147092b.m95059Y1();
            }
            C17945a0 m95027V1 = m147092b.m95027V1();
            C29599o c29599o = this.f136627a;
            String m17944I0 = m147091a.m17944I0();
            AbstractC19074t.m100205c(m95027V1);
            c29599o.m101501b(new C29599o.a(m17944I0, m95027V1, false, "chat_resend", 4, null), new c(aVar2, m95027V1));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            if (aVar2 != null) {
                aVar2.mo1004b();
            }
        }
    }
}
