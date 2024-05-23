package a30;

import android.content.Context;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import mm0.AbstractC23350e;
import p164fn.AbstractC19037k;
import p185gc.AbstractC19377a;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: a30.b */
/* loaded from: classes5.dex */
public final class C0103b extends AbstractC19377a {

    /* renamed from: a30.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC27218a f585a;

        /* renamed from: b */
        private final String f586b;

        /* renamed from: c */
        private final long f587c;

        public a(InterfaceC27218a interfaceC27218a, String str, long j11) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f585a = interfaceC27218a;
            this.f586b = str;
            this.f587c = j11;
        }

        /* renamed from: a */
        public final InterfaceC27218a m459a() {
            return this.f585a;
        }

        /* renamed from: b */
        public final long m460b() {
            return this.f587c;
        }

        /* renamed from: c */
        public final String m461c() {
            return this.f586b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f585a, aVar.f585a) && AbstractC19074t.m100204b(this.f586b, aVar.f586b) && this.f587c == aVar.f587c;
        }

        public int hashCode() {
            InterfaceC27218a interfaceC27218a = this.f585a;
            return ((((interfaceC27218a == null ? 0 : interfaceC27218a.hashCode()) * 31) + this.f586b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f587c);
        }

        public String toString() {
            return "SinglePhotoDownloadTaskParam(activity=" + this.f585a + ", url=" + this.f586b + ", timeout=" + this.f587c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a30.b$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f588s;

        /* renamed from: t */
        /* synthetic */ Object f589t;

        /* renamed from: v */
        int f591v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f589t = obj;
            this.f591v |= Integer.MIN_VALUE;
            return C0103b.this.mo451b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a30.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f592t;

        /* renamed from: u */
        Object f593u;

        /* renamed from: v */
        int f594v;

        /* renamed from: w */
        final /* synthetic */ C19059j0 f595w;

        /* renamed from: x */
        final /* synthetic */ a f596x;

        /* renamed from: a30.b$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements AbstractC19037k.f {

            /* renamed from: a */
            final /* synthetic */ CancellableContinuation f597a;

            a(CancellableContinuation cancellableContinuation) {
                this.f597a = cancellableContinuation;
            }

            @Override // p164fn.AbstractC19037k.f
            /* renamed from: a */
            public void mo463a(AbstractC19037k.e eVar, long j11) {
            }

            @Override // p164fn.AbstractC19037k.f
            /* renamed from: b */
            public void mo464b(boolean z11, AbstractC19037k.e eVar, int i11) {
                String str;
                CancellableContinuation cancellableContinuation = this.f597a;
                C24861r.a aVar = C24861r.f119264q;
                if (eVar != null) {
                    str = eVar.f94898d;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                cancellableContinuation.mo112492g(C24861r.m129218b(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C19059j0 c19059j0, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f595w = c19059j0;
            this.f596x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f595w, this.f596x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Context context;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f594v;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j0 = this.f595w;
                a aVar = this.f596x;
                this.f592t = c19059j0;
                this.f593u = aVar;
                this.f594v = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                AbstractC19037k.e m100140b = AbstractC19037k.e.m100140b(aVar.m461c(), false, new a(cancellableContinuationImpl));
                AbstractC19074t.m100207e(m100140b, "getPhotoDownloadInfo(...)");
                c19059j0.f94941p = m100140b;
                InterfaceC27218a m459a = aVar.m459a();
                if (m459a != null) {
                    context = m459a.getContext();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = MainApplication.Companion.m35500c();
                } else {
                    AbstractC19074t.m100205c(context);
                }
                AbstractC19037k.m100123i((AbstractC19037k.e) c19059j0.f94941p, new C23528a(context));
                obj = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (obj == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        Throwable th2;
        C19059j0 c19059j0;
        Object m129218b;
        Throwable m129221e;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f591v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f591v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f589t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f591v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) bVar.f588s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C24861r.a aVar2 = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e != null) {
                            }
                            if (!C24861r.m129223g(m129218b)) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19059j0 c19059j02 = new C19059j0();
                    c19059j02.f94941p = new AbstractC19037k.e();
                    try {
                        C24861r.a aVar3 = C24861r.f119264q;
                        if (aVar.m461c().length() == 0) {
                            return "";
                        }
                        long m460b = aVar.m460b();
                        c cVar = new c(c19059j02, aVar, null);
                        bVar.f588s = c19059j02;
                        bVar.f591v = 1;
                        Object m112878c = TimeoutKt.m112878c(m460b, cVar, bVar);
                        if (m112878c == m142578e) {
                            return m142578e;
                        }
                        obj = m112878c;
                        c19059j0 = c19059j02;
                    } catch (Throwable th4) {
                        th2 = th4;
                        c19059j0 = c19059j02;
                        C24861r.a aVar22 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e != null) {
                        }
                        if (!C24861r.m129223g(m129218b)) {
                        }
                    }
                }
                m129218b = C24861r.m129218b((String) obj);
                m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                    AbstractC19037k.m100122h((AbstractC19037k.e) c19059j0.f94941p);
                    AbstractC23350e.m122778h(m129221e);
                }
                if (!C24861r.m129223g(m129218b)) {
                    return "";
                }
                return m129218b;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f589t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f591v;
        if (i11 == 0) {
        }
        m129218b = C24861r.m129218b((String) obj2);
        m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
        }
        if (!C24861r.m129223g(m129218b)) {
        }
    }
}
