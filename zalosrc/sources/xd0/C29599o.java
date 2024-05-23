package xd0;

import ag0.C0814e0;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import dj.C17976k1;
import dj.C17994q1;
import eg0.AbstractC18428c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import im.C20614e;
import me0.AbstractC23112j7;
import mg.C23288a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p185gc.AbstractC19378b;
import p279jw.C21373a;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31944h6;
import p716zh.C31986k3;
import p716zh.C32027n;
import p716zh.C32037n9;
import u80.C27142k2;
import xd0.C29593i;

/* renamed from: xd0.o */
/* loaded from: classes4.dex */
public final class C29599o extends AbstractC19378b {

    /* renamed from: a */
    private final C29593i f136634a;

    /* renamed from: xd0.o$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f136635a;

        /* renamed from: b */
        private final C17945a0 f136636b;

        /* renamed from: c */
        private final boolean f136637c;

        /* renamed from: d */
        private final String f136638d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, C17945a0 c17945a0) {
            this(str, c17945a0, false, null, 12, null);
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(c17945a0, "msgToSend");
        }

        /* renamed from: a */
        public final C17945a0 m147101a() {
            return this.f136636b;
        }

        /* renamed from: b */
        public final String m147102b() {
            return this.f136635a;
        }

        /* renamed from: c */
        public final String m147103c() {
            return this.f136638d;
        }

        public a(String str, C17945a0 c17945a0, boolean z11, String str2) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(c17945a0, "msgToSend");
            AbstractC19074t.m100208f(str2, "sendEntryPoint");
            this.f136635a = str;
            this.f136636b = c17945a0;
            this.f136637c = z11;
            this.f136638d = str2;
        }

        public /* synthetic */ a(String str, C17945a0 c17945a0, boolean z11, String str2, int i11, AbstractC19060k abstractC19060k) {
            this(str, c17945a0, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? "chat_send" : str2);
        }
    }

    /* renamed from: xd0.o$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C17945a0 f136639a;

        public b(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "msg");
            this.f136639a = c17945a0;
        }
    }

    /* renamed from: xd0.o$c */
    /* loaded from: classes4.dex */
    public static final class c implements AbstractC19378b.a {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f136640a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19378b.a f136641b;

        c(C17945a0 c17945a0, AbstractC19378b.a aVar) {
            this.f136640a = c17945a0;
            this.f136641b = aVar;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a */
        public void onSuccess(C29593i.b bVar) {
            AbstractC19074t.m100208f(bVar, "response");
            C0814e0.m2056b(this.f136640a);
            AbstractC19378b.a aVar = this.f136641b;
            if (aVar != null) {
                aVar.onSuccess(new b(this.f136640a));
            }
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            AbstractC19378b.a aVar = this.f136641b;
            if (aVar != null) {
                aVar.mo1004b();
            }
        }
    }

    public C29599o(C29593i c29593i) {
        AbstractC19074t.m100208f(c29593i, "insertMsgUseCase");
        this.f136634a = c29593i;
    }

    /* renamed from: f */
    private final void m147096f(C17945a0 c17945a0) {
        try {
            if (c17945a0.m94889F6() && c17945a0.m95239r4() == null && !AbstractC19074t.m100204b(c17945a0.m94846A4(), "chat_forward")) {
                C32027n m118545o = AbstractC23112j7.m118545o(c17945a0);
                AbstractC19074t.m100207e(m118545o, "buildOriginalMessageRefF…endDirectlyToMyCloud(...)");
                c17945a0.m95103cb(new C17994q1(3, m118545o.m154459M().toString()));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    private final void m147097g(C17945a0 c17945a0) {
        if (!AbstractC19646n0.m103007n1(c17945a0.mo95039W2())) {
            return;
        }
        C17976k1 m95040W3 = c17945a0.m95040W3();
        if (m95040W3 == null) {
            c17945a0.m94979Pa(new C17976k1("{\"hid\":1}"));
            return;
        }
        if (TextUtils.isEmpty(m95040W3.f91049c)) {
            m95040W3.m95616a("{\"hid\":1}");
            return;
        }
        String str = m95040W3.f91049c;
        AbstractC19074t.m100207e(str, "camLog");
        String m107303a = C20614e.m107303a(str);
        m95040W3.f91049c = m107303a;
        m95040W3.m95616a(m107303a);
    }

    /* renamed from: h */
    private final void m147098h(C17945a0 c17945a0) {
        if (AbstractC23463h.m123190r(c17945a0)) {
            C23744a.Companion.m124119a().m124116d(6053, c17945a0);
        }
        if (!C0814e0.m2061g(c17945a0) || !c17945a0.m95270u8() || AbstractC19074t.m100204b(c17945a0.m94846A4(), "chat_resend") || c17945a0.m95089b4() != 1) {
            return;
        }
        if (AbstractC19074t.m100204b(c17945a0.m94846A4(), "share_inapp_browser")) {
            C27142k2.f127855a.m139245c(c17945a0);
        } else if ((c17945a0.m94898G6() || !AbstractC19646n0.m103044x1(c17945a0.m95041W4())) && C21373a.f104231a.m110807w().m110825b()) {
            C27142k2.f127855a.m139245c(c17945a0);
        }
    }

    /* renamed from: j */
    public static final void m147099j(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$msgToSend");
        C7959d.Companion.m41850e().m41758W1(c17945a0);
    }

    @Override // p185gc.AbstractC19378b
    /* renamed from: i */
    public void mo1884d(a aVar, AbstractC19378b.a aVar2) {
        AbstractC19074t.m100208f(aVar, "params");
        String m147102b = aVar.m147102b();
        if (m147102b.length() == 0) {
            return;
        }
        C17945a0 m147101a = aVar.m147101a();
        m147101a.m95016Ta(1);
        C31986k3 c31986k3 = C31986k3.f147083a;
        String mo95039W2 = m147101a.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (c31986k3.m154108R1(mo95039W2) || (c31986k3.m154121a2(m147102b) && c31986k3.m154098K2(m147102b))) {
            m147101a.m95049X1();
        }
        m147097g(m147101a);
        C31944h6.b bVar = m147101a.f90744t2;
        if (bVar != null && bVar.f146792e == 1) {
            m147101a.m95087b2();
        }
        m147101a.m95156hb(aVar.m147103c());
        m147096f(m147101a);
        C32037n9 c32037n9 = C32037n9.f147516a;
        String mo95039W22 = m147101a.mo95039W2();
        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
        long m154558r = c32037n9.m154558r(mo95039W22);
        if (m154558r > 0 && m147101a.m95262t7() && m147101a.m95030V4() == 0) {
            m147101a.m95318zb(m154558r);
        }
        AbstractC18428c.m97659b(C23288a.f113033a, m147102b, 0, new Runnable() { // from class: xd0.n
            public /* synthetic */ RunnableC29598n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29599o.m147099j(C17945a0.this);
            }
        }, 2, null);
        this.f136634a.m101501b(new C29593i.a(m147102b, m147101a, null, null, true, 12, null), new c(m147101a, aVar2));
        if (AbstractC25495a.m132078c(m147101a.mo95039W2())) {
            m147098h(m147101a);
        }
    }
}
