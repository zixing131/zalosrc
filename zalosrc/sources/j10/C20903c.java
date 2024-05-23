package j10;

import com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import e10.InterfaceC18165b;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h10.C19700a;
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

/* renamed from: j10.c */
/* loaded from: classes5.dex */
public final class C20903c {

    /* renamed from: a */
    private final InterfaceC18165b f102718a;

    /* renamed from: b */
    private final LiveChanelStats f102719b;

    /* renamed from: c */
    private final CoroutineScope f102720c;

    /* renamed from: d */
    private InterfaceC19713n f102721d;

    /* renamed from: e */
    private final AtomicBoolean f102722e;

    /* renamed from: j10.c$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102723t;

        /* renamed from: v */
        final /* synthetic */ String f102725v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j10.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32848a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f102726t;

            /* renamed from: u */
            final /* synthetic */ C20903c f102727u;

            /* renamed from: v */
            final /* synthetic */ C19700a f102728v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32848a(C20903c c20903c, C19700a c19700a, Continuation continuation) {
                super(2, continuation);
                this.f102727u = c20903c;
                this.f102728v = c19700a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32848a(this.f102727u, this.f102728v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f102726t == 0) {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC19713n interfaceC19713n = this.f102727u.f102721d;
                    if (interfaceC19713n != null) {
                        interfaceC19713n.mo53272j(this.f102728v);
                        return C24848g0.f119245a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32848a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation continuation) {
            super(2, continuation);
            this.f102725v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f102725v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            Integer num;
            Long m51689e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f102723t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        C20903c.this.f102722e.set(false);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18165b interfaceC18165b = C20903c.this.f102718a;
                String str2 = this.f102725v;
                this.f102723t = 1;
                obj = interfaceC18165b.mo96484g(str2, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            StreamData streamData = (StreamData) ((C24608l) obj).m128099a();
            String m51602d = C20903c.this.f102719b.m51602d();
            if (streamData != null && (m51689e = streamData.m51689e()) != null) {
                str = m51689e.toString();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(m51602d, str)) {
                C20903c.this.f102719b.m51606h(streamData);
            }
            if (streamData != null) {
                num = streamData.m51696l();
            } else {
                num = null;
            }
            if (num != null) {
                C19700a m103380a = C19700a.Companion.m103380a(streamData);
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                C32848a c32848a = new C32848a(C20903c.this, m103380a, null);
                this.f102723t = 2;
                if (BuildersKt.m112534g(m112681c, c32848a, this) == m142578e) {
                    return m142578e;
                }
            }
            C20903c.this.f102722e.set(false);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20903c(InterfaceC18165b interfaceC18165b, LiveChanelStats liveChanelStats, CoroutineScope coroutineScope, InterfaceC19713n interfaceC19713n) {
        AbstractC19074t.m100208f(interfaceC18165b, "liveStreamRepo");
        AbstractC19074t.m100208f(liveChanelStats, "liveChannelStats");
        AbstractC19074t.m100208f(coroutineScope, "scope");
        this.f102718a = interfaceC18165b;
        this.f102719b = liveChanelStats;
        this.f102720c = coroutineScope;
        this.f102721d = interfaceC19713n;
        this.f102722e = new AtomicBoolean(false);
    }

    /* renamed from: e */
    public final Object m109366e(String str, String str2, Continuation continuation) {
        if (AbstractC19074t.m100204b(str, str2)) {
            if (this.f102722e.get()) {
                return C24848g0.f119245a;
            }
            this.f102722e.set(true);
            BuildersKt__Builders_commonKt.m112540d(this.f102720c, null, null, new a(str, null), 3, null);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f */
    public final void m109367f(InterfaceC19713n interfaceC19713n) {
        this.f102721d = interfaceC19713n;
    }

    public /* synthetic */ C20903c(InterfaceC18165b interfaceC18165b, LiveChanelStats liveChanelStats, CoroutineScope coroutineScope, InterfaceC19713n interfaceC19713n, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18165b, liveChanelStats, coroutineScope, (i11 & 8) != 0 ? null : interfaceC19713n);
    }
}
