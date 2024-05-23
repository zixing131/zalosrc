package el0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p667y2.C30268e;
import pj0.InterfaceC24778d;
import pj0.InterfaceC24781g;
import pm0.C24848g0;
import pm0.C24861r;
import vk0.AbstractC28287i;
import vk0.C28284f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import zk0.InterfaceC32222a;

/* renamed from: el0.b */
/* loaded from: classes7.dex */
public final class C18482b extends AbstractC28287i {

    /* renamed from: el0.b$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC24781g f93076r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC24781g interfaceC24781g) {
            super(1);
            this.f93076r = interfaceC24781g;
        }

        /* renamed from: a */
        public final void m97841a(Throwable th2) {
            String str;
            C18482b c18482b = C18482b.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cancel - ");
            if (th2 == null || (str = th2.getMessage()) == null) {
                str = "unknown";
            }
            sb2.append(str);
            c18482b.m142533d(sb2.toString());
            this.f93076r.mo91786a();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m97841a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: el0.b$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC24778d {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f93077a;

        /* renamed from: b */
        final /* synthetic */ C18482b f93078b;

        b(CancellableContinuation cancellableContinuation, C18482b c18482b) {
            this.f93077a = cancellableContinuation;
            this.f93078b = c18482b;
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: a */
        public void mo91792a(String str, File file) {
            AbstractC19074t.m100208f(str, "resource");
            AbstractC19074t.m100208f(file, "downloadedFile");
            try {
                CancellableContinuation cancellableContinuation = this.f93077a;
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(new C18486f(file, null, 2, null)));
            } catch (Exception e11) {
                C18482b c18482b = this.f93078b;
                String message = e11.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c18482b.m142533d(message);
            }
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: b */
        public void mo91793b(String str, String str2) {
            AbstractC19074t.m100208f(str, "resource");
            AbstractC19074t.m100208f(str2, C30268e.f140632a);
            C18486f c18486f = new C18486f(null, new C28284f(301, str2), 1, null);
            CancellableContinuation cancellableContinuation = this.f93077a;
            C18482b c18482b = this.f93078b;
            try {
                cancellableContinuation.mo112492g(C24861r.m129218b(c18486f));
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c18482b.m142533d(message);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18482b(C18481a c18481a, InterfaceC32222a interfaceC32222a) {
        super(c18481a, interfaceC32222a);
        AbstractC19074t.m100208f(c18481a, "info");
    }

    /* renamed from: h */
    public static final /* synthetic */ C18481a m97840h(C18482b c18482b) {
        return (C18481a) c18482b.m142531b();
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        String m97839e = ((C18481a) m142531b()).m97839e();
        if (m97839e != null && m97839e.length() != 0) {
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            cancellableContinuationImpl.mo112543I(new a(m97840h(this).m97837c().mo91782a(m97839e, m97840h(this).m97836b(), m97840h(this).m97835a(), m97840h(this).m97838d(), new b(cancellableContinuationImpl, this))));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112571A;
        }
        return new C18486f(null, new C28284f(300, "network file - missing resource url"), 1, null);
    }
}
