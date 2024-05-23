package qf0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import lf0.C22472b;
import lf0.InterfaceC22471a;
import me0.C23055e5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import s00.AbstractC26080o;
import vm0.AbstractC28298d;
import wf0.C28964i;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xf0.C29620a;

/* renamed from: qf0.d */
/* loaded from: classes5.dex */
public final class C25257d implements InterfaceC22471a {

    /* renamed from: a */
    private final C22472b f121132a;

    /* renamed from: b */
    private final long f121133b;

    /* renamed from: c */
    private final C29620a f121134c;

    /* renamed from: d */
    private final CoroutineScope f121135d;

    /* renamed from: e */
    private final String f121136e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qf0.d$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121137t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qf0.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32948a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f121139t;

            /* renamed from: u */
            final /* synthetic */ C25257d f121140u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32948a(C25257d c25257d, Continuation continuation) {
                super(2, continuation);
                this.f121140u = c25257d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32948a(this.f121140u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f121139t == 0) {
                    AbstractC24862s.m129228b(obj);
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f121140u.f121136e).openConnection());
                    uRLConnection.setConnectTimeout(AbstractC26080o.a.f124275b);
                    return AbstractC29094b.m145341c(uRLConnection.getContentLength());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32948a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121137t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineDispatcher m112680b = Dispatchers.m112680b();
                C32948a c32948a = new C32948a(C25257d.this, null);
                this.f121137t = 1;
                obj = BuildersKt.m112534g(m112680b, c32948a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            int intValue = ((Number) obj).intValue();
            if (intValue < 0) {
                int i12 = (int) (5242880 - C25257d.this.f121133b);
                if (i12 > 0) {
                    C25257d.this.f121134c.m147225s(i12);
                    C25257d.this.f121134c.m147224j(C25257d.this.f121136e, false, C25257d.this.f121132a.m116190m());
                } else {
                    C25257d.this.f121132a.m116182D(C25257d.this.f121136e, intValue, C25257d.this.f121133b);
                }
            } else if (intValue + C25257d.this.f121133b <= 5242880) {
                C25257d.this.f121134c.m147224j(C25257d.this.f121136e, false, C25257d.this.f121132a.m116190m());
            } else {
                C25257d.this.f121132a.m116182D(C25257d.this.f121136e, intValue, C25257d.this.f121133b);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25257d(C22472b c22472b, long j11, C29620a c29620a, CoroutineScope coroutineScope, String str) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(c29620a, "downloadFileHelper");
        AbstractC19074t.m100208f(coroutineScope, "uiScope");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f121132a = c22472b;
        this.f121133b = j11;
        this.f121134c = c29620a;
        this.f121135d = coroutineScope;
        this.f121136e = str;
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        C28964i.a aVar = C28964i.Companion;
        if (aVar.m144662a().m144659d(this.f121136e)) {
            C22472b.m116177v(this.f121132a, -303, null, 2, null);
        } else if (!C23055e5.m118272g(false)) {
            C22472b.m116177v(this.f121132a, -304, null, 2, null);
        } else {
            aVar.m144662a().m144660e(this.f121136e);
            BuildersKt__Builders_commonKt.m112540d(this.f121135d, null, null, new a(null), 3, null);
        }
    }
}
