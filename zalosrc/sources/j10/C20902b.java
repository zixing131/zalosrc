package j10;

import com.zing.zalo.shortvideo.data.remote.ws.response.GetStatLivestreamRes;
import e10.InterfaceC18165b;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h10.InterfaceC19713n;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import p10.C24608l;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: j10.b */
/* loaded from: classes5.dex */
public final class C20902b {

    /* renamed from: a */
    private final InterfaceC18165b f102707a;

    /* renamed from: b */
    private final CoroutineScope f102708b;

    /* renamed from: c */
    private InterfaceC19713n f102709c;

    /* renamed from: d */
    private final AtomicBoolean f102710d;

    /* renamed from: j10.b$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102711t;

        /* renamed from: v */
        final /* synthetic */ String f102713v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j10.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32847a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f102714t;

            /* renamed from: u */
            final /* synthetic */ C20902b f102715u;

            /* renamed from: v */
            final /* synthetic */ String f102716v;

            /* renamed from: w */
            final /* synthetic */ GetStatLivestreamRes f102717w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32847a(C20902b c20902b, String str, GetStatLivestreamRes getStatLivestreamRes, Continuation continuation) {
                super(2, continuation);
                this.f102715u = c20902b;
                this.f102716v = str;
                this.f102717w = getStatLivestreamRes;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32847a(this.f102715u, this.f102716v, this.f102717w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                long j11;
                long j12;
                AbstractC28298d.m142578e();
                if (this.f102714t == 0) {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC19713n interfaceC19713n = this.f102715u.f102709c;
                    if (interfaceC19713n != null) {
                        String str = this.f102716v;
                        Long m51658b = this.f102717w.m51658b();
                        if (m51658b != null) {
                            j11 = m51658b.longValue();
                        } else {
                            j11 = 0;
                        }
                        Long m51657a = this.f102717w.m51657a();
                        if (m51657a != null) {
                            j12 = m51657a.longValue();
                        } else {
                            j12 = 2;
                        }
                        interfaceC19713n.mo53271g(str, j11, j12);
                        return C24848g0.f119245a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32847a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation continuation) {
            super(2, continuation);
            this.f102713v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f102713v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f102711t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        C20902b.this.f102710d.set(false);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18165b interfaceC18165b = C20902b.this.f102707a;
                String str = this.f102713v;
                this.f102711t = 1;
                obj = interfaceC18165b.mo96479b(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            GetStatLivestreamRes getStatLivestreamRes = (GetStatLivestreamRes) ((C24608l) obj).m128099a();
            if (getStatLivestreamRes != null) {
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                C32847a c32847a = new C32847a(C20902b.this, this.f102713v, getStatLivestreamRes, null);
                this.f102711t = 2;
                if (BuildersKt.m112534g(m112681c, c32847a, this) == m142578e) {
                    return m142578e;
                }
            }
            C20902b.this.f102710d.set(false);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20902b(InterfaceC18165b interfaceC18165b, CoroutineScope coroutineScope, InterfaceC19713n interfaceC19713n) {
        AbstractC19074t.m100208f(interfaceC18165b, "liveStreamRepo");
        AbstractC19074t.m100208f(coroutineScope, "scope");
        this.f102707a = interfaceC18165b;
        this.f102708b = coroutineScope;
        this.f102709c = interfaceC19713n;
        this.f102710d = new AtomicBoolean(false);
    }

    /* renamed from: d */
    public final Object m109358d(String str, String str2, Continuation continuation) {
        if (this.f102710d.get()) {
            return C24848g0.f119245a;
        }
        if (AbstractC19074t.m100204b(str, str2)) {
            this.f102710d.set(true);
            BuildersKt__Builders_commonKt.m112540d(this.f102708b, null, null, new a(str, null), 3, null);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: e */
    public final void m109359e(InterfaceC19713n interfaceC19713n) {
        this.f102709c = interfaceC19713n;
    }

    public /* synthetic */ C20902b(InterfaceC18165b interfaceC18165b, CoroutineScope coroutineScope, InterfaceC19713n interfaceC19713n, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18165b, coroutineScope, (i11 & 4) != 0 ? null : interfaceC19713n);
    }
}
