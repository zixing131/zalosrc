package a30;

import android.graphics.Bitmap;
import androidx.work.AbstractC2147g0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19051f0;
import fn0.C19059j0;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import mm0.AbstractC23350e;
import p041bu.C3142a;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: a30.c */
/* loaded from: classes5.dex */
public final class C0104c extends AbstractC19377a {

    /* renamed from: a */
    private final C23528a f598a;

    /* renamed from: a30.c$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final String f599a;

        /* renamed from: b */
        private final long f600b;

        /* renamed from: c */
        private final int f601c;

        /* renamed from: d */
        private final int f602d;

        public a(String str, long j11, int i11, int i12) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f599a = str;
            this.f600b = j11;
            this.f601c = i11;
            this.f602d = i12;
        }

        /* renamed from: a */
        public final int m468a() {
            return this.f601c;
        }

        /* renamed from: b */
        public final int m469b() {
            return this.f602d;
        }

        /* renamed from: c */
        public final long m470c() {
            return this.f600b;
        }

        /* renamed from: d */
        public final String m471d() {
            return this.f599a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f599a, aVar.f599a) && this.f600b == aVar.f600b && this.f601c == aVar.f601c && this.f602d == aVar.f602d;
        }

        public int hashCode() {
            return (((((this.f599a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f600b)) * 31) + this.f601c) * 31) + this.f602d;
        }

        public String toString() {
            return "DownloadSinglePhotoUsingAQueryUseCaseParam(url=" + this.f599a + ", timeout=" + this.f600b + ", qosCmdCode=" + this.f601c + ", targetWidth=" + this.f602d + ")";
        }

        public /* synthetic */ a(String str, long j11, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
            this(str, j11, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
        }
    }

    /* renamed from: a30.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f603s;

        /* renamed from: t */
        Object f604t;

        /* renamed from: u */
        /* synthetic */ Object f605u;

        /* renamed from: w */
        int f607w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f605u = obj;
            this.f607w |= Integer.MIN_VALUE;
            return C0104c.this.mo451b(null, this);
        }
    }

    /* renamed from: a30.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C19051f0 f608A;

        /* renamed from: B */
        final /* synthetic */ C19059j0 f609B;

        /* renamed from: t */
        Object f610t;

        /* renamed from: u */
        Object f611u;

        /* renamed from: v */
        Object f612v;

        /* renamed from: w */
        Object f613w;

        /* renamed from: x */
        int f614x;

        /* renamed from: z */
        final /* synthetic */ a f616z;

        /* renamed from: a30.c$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ C0104c f617l1;

            /* renamed from: m1 */
            final /* synthetic */ C19051f0 f618m1;

            /* renamed from: n1 */
            final /* synthetic */ a f619n1;

            /* renamed from: o1 */
            final /* synthetic */ CancellableContinuation f620o1;

            a(C0104c c0104c, C19051f0 c19051f0, a aVar, CancellableContinuation cancellableContinuation) {
                this.f617l1 = c0104c;
                this.f618m1 = c19051f0;
                this.f619n1 = aVar;
                this.f620o1 = cancellableContinuation;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                Bitmap bitmap;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c23995f, "status");
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                File m123603i = this.f617l1.m466d().m123603i(str);
                if (m123603i != null && m123603i.exists() && m123603i.length() > 0 && this.f618m1.f94928p) {
                    if (c3979l != null) {
                        bitmap = c3979l.m18839c();
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        C3142a m120703q = AbstractC23306f.m120703q();
                        String m471d = this.f619n1.m471d();
                        Bitmap m18839c = c3979l.m18839c();
                        AbstractC19074t.m100207e(m18839c, "getBitmap(...)");
                        m120703q.m15821f(m471d, m18839c);
                    }
                    CancellableContinuation cancellableContinuation = this.f620o1;
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuation.mo112492g(C24861r.m129218b(m123603i.getAbsolutePath()));
                    this.f618m1.f94928p = false;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, C19051f0 c19051f0, C19059j0 c19059j0, Continuation continuation) {
            super(2, continuation);
            this.f616z = aVar;
            this.f608A = c19051f0;
            this.f609B = c19059j0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f616z, this.f608A, this.f609B, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            C23999j c23999j;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f614x;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C0104c c0104c = C0104c.this;
                a aVar = this.f616z;
                C19051f0 c19051f0 = this.f608A;
                C19059j0 c19059j0 = this.f609B;
                this.f610t = c0104c;
                this.f611u = aVar;
                this.f612v = c19051f0;
                this.f613w = c19059j0;
                this.f614x = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                File m123603i = c0104c.m466d().m123603i(aVar.m471d());
                if (m123603i != null && m123603i.exists() && m123603i.length() > 0) {
                    if (c19051f0.f94928p) {
                        C24861r.a aVar2 = C24861r.f119264q;
                        cancellableContinuationImpl.mo112492g(C24861r.m129218b(m123603i.getAbsolutePath()));
                        c19051f0.f94928p = false;
                    }
                } else {
                    C3977j c3977j = new C3977j(MainApplication.Companion.m35500c());
                    c19059j0.f94941p = new a(c0104c, c19051f0, aVar, cancellableContinuationImpl);
                    if (aVar.m468a() != 0 && (c23999j = (C23999j) c19059j0.f94941p) != null) {
                    }
                    ((C23528a) c0104c.m466d().m123612r(c3977j)).m123584H(aVar.m471d(), true, true, aVar.m469b(), 0, (C23999j) c19059j0.f94941p);
                }
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
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C0104c(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        this.f598a = c23528a;
    }

    /* renamed from: c */
    private final void m465c(C23999j c23999j) {
        if (c23999j != null && !c23999j.m125588F0()) {
            c23999j.m125586E();
        }
    }

    /* renamed from: d */
    public final C23528a m466d() {
        return this.f598a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C0104c c0104c;
        C19059j0 c19059j0;
        Object m129218b;
        Throwable m129221e;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f607w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f607w = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f605u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar2.f607w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) bVar2.f604t;
                        c0104c = (C0104c) bVar2.f603s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            C24861r.a aVar2 = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
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
                    C19051f0 c19051f0 = new C19051f0();
                    c19051f0.f94928p = true;
                    C19059j0 c19059j02 = new C19059j0();
                    try {
                        C24861r.a aVar3 = C24861r.f119264q;
                        if (aVar.m471d().length() == 0) {
                            return "";
                        }
                        long m470c = aVar.m470c();
                        c cVar = new c(aVar, c19051f0, c19059j02, null);
                        bVar2.f603s = this;
                        bVar2.f604t = c19059j02;
                        bVar2.f607w = 1;
                        obj = TimeoutKt.m112878c(m470c, cVar, bVar2);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c0104c = this;
                        c19059j0 = c19059j02;
                    } catch (Throwable th3) {
                        th = th3;
                        c0104c = this;
                        c19059j0 = c19059j02;
                        C24861r.a aVar22 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
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
                    c0104c.m465c((C23999j) c19059j0.f94941p);
                    AbstractC23350e.m122778h(m129221e);
                }
                if (!C24861r.m129223g(m129218b)) {
                    return "";
                }
                return m129218b;
            }
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f605u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar22.f607w;
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
