package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m145345f = "TickerChannels.kt", m145346l = {72, 73}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TickerChannelsKt$ticker$3 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106314t;

    /* renamed from: u */
    private /* synthetic */ Object f106315u;

    /* renamed from: v */
    final /* synthetic */ TickerMode f106316v;

    /* renamed from: w */
    final /* synthetic */ long f106317w;

    /* renamed from: x */
    final /* synthetic */ long f106318x;

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f106319a;

        static {
            int[] iArr = new int[TickerMode.values().length];
            try {
                iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f106319a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TickerChannelsKt$ticker$3(TickerMode tickerMode, long j11, long j12, Continuation continuation) {
        super(2, continuation);
        this.f106316v = tickerMode;
        this.f106317w = j11;
        this.f106318x = j12;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.f106316v, this.f106317w, this.f106318x, continuation);
        tickerChannelsKt$ticker$3.f106315u = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Object m113199d;
        Object m113198c;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106314t;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope = (ProducerScope) this.f106315u;
            int i12 = WhenMappings.f106319a[this.f106316v.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    long j11 = this.f106317w;
                    long j12 = this.f106318x;
                    SendChannel mo112918q = producerScope.mo112918q();
                    this.f106314t = 2;
                    m113198c = TickerChannelsKt.m113198c(j11, j12, mo112918q, this);
                    if (m113198c == m142578e) {
                        return m142578e;
                    }
                }
            } else {
                long j13 = this.f106317w;
                long j14 = this.f106318x;
                SendChannel mo112918q2 = producerScope.mo112918q();
                this.f106314t = 1;
                m113199d = TickerChannelsKt.m113199d(j13, j14, mo112918q2, this);
                if (m113199d == m142578e) {
                    return m142578e;
                }
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((TickerChannelsKt$ticker$3) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
