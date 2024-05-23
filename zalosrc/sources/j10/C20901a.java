package j10;

import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import e10.InterfaceC18165b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h10.C19712m;
import h10.InterfaceC19713n;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p10.C24608l;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: j10.a */
/* loaded from: classes5.dex */
public final class C20901a {

    /* renamed from: a */
    private final InterfaceC18165b f102698a;

    /* renamed from: b */
    private final CoroutineScope f102699b;

    /* renamed from: c */
    private InterfaceC19713n f102700c;

    /* renamed from: d */
    private final AtomicBoolean f102701d;

    /* renamed from: e */
    private C19712m f102702e;

    /* renamed from: j10.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102703t;

        /* renamed from: v */
        final /* synthetic */ String f102705v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f102706w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f102705v = str;
            this.f102706w = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f102705v, this.f102706w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List list;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f102703t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18165b interfaceC18165b = C20901a.this.f102698a;
                String str = this.f102705v;
                int m103452a = C20901a.this.f102702e.m103452a();
                long m103453b = C20901a.this.f102702e.m103453b();
                int m103454c = C20901a.this.f102702e.m103454c();
                this.f102703t = 1;
                obj = interfaceC18165b.mo96482e(str, m103452a, m103453b, m103454c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C24608l c24608l = (C24608l) obj;
            GetCommentLiveRes getCommentLiveRes = (GetCommentLiveRes) c24608l.m128099a();
            if (c24608l.m128100b()) {
                C20901a.this.f102702e.m103456e((GetCommentLiveRes) c24608l.m128099a());
                if (getCommentLiveRes != null) {
                    list = getCommentLiveRes.m51638b();
                } else {
                    list = null;
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    this.f102706w.mo205i9(list);
                }
            }
            C20901a.this.f102701d.set(false);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20901a(InterfaceC18165b interfaceC18165b, CoroutineScope coroutineScope, InterfaceC19713n interfaceC19713n) {
        AbstractC19074t.m100208f(interfaceC18165b, "liveStreamRepo");
        AbstractC19074t.m100208f(coroutineScope, "scope");
        this.f102698a = interfaceC18165b;
        this.f102699b = coroutineScope;
        this.f102700c = interfaceC19713n;
        this.f102701d = new AtomicBoolean(false);
        this.f102702e = new C19712m(0L, 0, 0, 7, null);
    }

    /* renamed from: d */
    public final void m109350d() {
        this.f102702e.m103455d();
    }

    /* renamed from: e */
    public final Object m109351e(String str, String str2, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        if (this.f102701d.get()) {
            return C24848g0.f119245a;
        }
        if (AbstractC19074t.m100204b(str, str2)) {
            this.f102701d.set(true);
            BuildersKt__Builders_commonKt.m112540d(this.f102699b, null, null, new a(str, interfaceC18505l, null), 3, null);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f */
    public final void m109352f(GetCommentLiveRes getCommentLiveRes) {
        this.f102702e.m103456e(getCommentLiveRes);
    }

    /* renamed from: g */
    public final void m109353g(InterfaceC19713n interfaceC19713n) {
        this.f102700c = interfaceC19713n;
    }

    public /* synthetic */ C20901a(InterfaceC18165b interfaceC18165b, CoroutineScope coroutineScope, InterfaceC19713n interfaceC19713n, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18165b, coroutineScope, (i11 & 4) != 0 ? null : interfaceC19713n);
    }
}
