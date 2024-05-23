package p398oo;

import ae.C0766k;
import am.AbstractC0924m0;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedAPI;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import kotlin.coroutines.Continuation;
import me0.AbstractC23148n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: oo.n0 */
/* loaded from: classes4.dex */
public final class C24373n0 {

    /* renamed from: a */
    public static final C24373n0 f117718a = new C24373n0();

    /* renamed from: oo.n0$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f117719a;

        /* renamed from: b */
        final /* synthetic */ int f117720b;

        /* renamed from: c */
        final /* synthetic */ Continuation f117721c;

        a(int i11, int i12, Continuation continuation) {
            this.f117719a = i11;
            this.f117720b = i12;
            this.f117721c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            Continuation continuation = this.f117721c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeed(c20096c))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                int i11 = this.f117719a;
                AbstractC23148n.m118851y(i11, this.f117720b, i11);
                Continuation continuation = this.f117721c;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation2 = this.f117721c;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
            }
        }
    }

    private C24373n0() {
    }

    /* renamed from: a */
    public final boolean m127485a() {
        return AbstractC0924m0.m3868hc();
    }

    /* renamed from: b */
    public final void m127486b(boolean z11) {
        AbstractC0924m0.m3350Pn(z11);
    }

    /* renamed from: c */
    public final Object m127487c(boolean z11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(49, z11 ? 1 : 0, c27317h));
        c0766k.mo1699o3(49, z11 ? 1 : 0);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m139856a == m142578e2) {
            return m139856a;
        }
        return C24848g0.f119245a;
    }
}
