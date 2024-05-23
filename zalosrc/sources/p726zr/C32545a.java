package p726zr;

import ae.C0766k;
import am.C0927o;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedNetworkError;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedNoExist;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedUnknown;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import kotlin.coroutines.Continuation;
import me0.AbstractC23216t1;
import me0.C23055e5;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: zr.a */
/* loaded from: classes4.dex */
public final class C32545a {

    /* renamed from: zr.a$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f150396a;

        a(Continuation continuation) {
            this.f150396a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Throwable th2;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() != 1001 && c20096c.m104491c() != 1002 && c20096c.m104491c() != 113) {
                if (AbstractC23216t1.m119640e(c20096c.m104491c())) {
                    th2 = ExceptionReactFeedNetworkError.f46210q;
                } else {
                    th2 = ExceptionReactFeedUnknown.f46212q;
                }
            } else {
                th2 = ExceptionReactFeedNoExist.f46211q;
            }
            Continuation continuation = this.f150396a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            Continuation continuation = this.f150396a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* renamed from: zr.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f150397a;

        b(Continuation continuation) {
            this.f150397a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Throwable th2;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() != 1001 && c20096c.m104491c() != 1002 && c20096c.m104491c() != 113) {
                if (AbstractC23216t1.m119640e(c20096c.m104491c())) {
                    th2 = ExceptionReactFeedNetworkError.f46210q;
                } else {
                    th2 = ExceptionReactFeedUnknown.f46212q;
                }
            } else {
                th2 = ExceptionReactFeedNoExist.f46211q;
            }
            Continuation continuation = this.f150397a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            Continuation continuation = this.f150397a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* renamed from: a */
    public final Object m157603a(String str, boolean z11, int i11, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionReactFeedNetworkError.f46210q)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(c27317h));
            c0766k.mo1404C7(str, z11, trackingSource, i11);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: b */
    public final Object m157604b(String str, boolean z11, int i11, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionReactFeedNetworkError.f46210q)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(c27317h));
            if (z11) {
                c0766k.mo1439Ga(str, trackingSource, i11);
            } else {
                c0766k.mo1674k7(str, trackingSource);
            }
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
