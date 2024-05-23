package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.InterfaceC1479a;
import androidx.window.layout.C2096c0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: androidx.window.layout.c0 */
/* loaded from: classes2.dex */
public final class C2096c0 implements InterfaceC2092a0 {

    /* renamed from: d */
    public static final a f8960d = new a(null);

    /* renamed from: b */
    private final InterfaceC2108i0 f8961b;

    /* renamed from: c */
    private final InterfaceC2127y f8962c;

    /* renamed from: androidx.window.layout.c0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: androidx.window.layout.c0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f8963t;

        /* renamed from: u */
        Object f8964u;

        /* renamed from: v */
        int f8965v;

        /* renamed from: w */
        private /* synthetic */ Object f8966w;

        /* renamed from: y */
        final /* synthetic */ Activity f8968y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, Continuation continuation) {
            super(2, continuation);
            this.f8968y = activity;
        }

        /* renamed from: t */
        public static final void m11332t(Channel channel, C2102f0 c2102f0) {
            AbstractC19074t.m100207e(c2102f0, "info");
            channel.mo112912p(c2102f0);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f8968y, continuation);
            bVar.f8966w = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0068, B:16:0x007a, B:18:0x0082), top: B:10:0x0068 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:10:0x0068). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            b bVar;
            FlowCollector flowCollector;
            InterfaceC1479a c2098d0;
            ChannelIterator it;
            Object mo113028a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f8965v;
            try {
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
            }
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            it = (ChannelIterator) this.f8964u;
                            c2098d0 = (InterfaceC1479a) this.f8963t;
                            FlowCollector flowCollector2 = (FlowCollector) this.f8966w;
                            AbstractC24862s.m129228b(obj);
                            flowCollector = flowCollector2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        it = (ChannelIterator) this.f8964u;
                        c2098d0 = (InterfaceC1479a) this.f8963t;
                        FlowCollector flowCollector3 = (FlowCollector) this.f8966w;
                        AbstractC24862s.m129228b(obj);
                        FlowCollector flowCollector4 = flowCollector3;
                        bVar = this;
                        if (!((Boolean) obj).booleanValue()) {
                            C2102f0 c2102f0 = (C2102f0) it.next();
                            bVar.f8966w = flowCollector4;
                            bVar.f8963t = c2098d0;
                            bVar.f8964u = it;
                            bVar.f8965v = 2;
                            if (flowCollector4.mo12109b(c2102f0, bVar) == m142578e) {
                                return m142578e;
                            }
                            flowCollector = flowCollector4;
                            bVar.f8966w = flowCollector;
                            bVar.f8963t = c2098d0;
                            bVar.f8964u = it;
                            bVar.f8965v = 1;
                            mo113028a = it.mo113028a(bVar);
                            if (mo113028a != m142578e) {
                                return m142578e;
                            }
                            flowCollector4 = flowCollector;
                            obj = mo113028a;
                            if (!((Boolean) obj).booleanValue()) {
                                C2096c0.this.f8962c.mo11363b(c2098d0);
                                return C24848g0.f119245a;
                            }
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    flowCollector = (FlowCollector) this.f8966w;
                    Channel m113079b = ChannelKt.m113079b(10, BufferOverflow.DROP_OLDEST, null, 4, null);
                    c2098d0 = new InterfaceC1479a() { // from class: androidx.window.layout.d0
                        public /* synthetic */ C2098d0() {
                        }

                        @Override // androidx.core.util.InterfaceC1479a
                        public final void accept(Object obj2) {
                            C2096c0.b.m11332t(Channel.this, (C2102f0) obj2);
                        }
                    };
                    C2096c0.this.f8962c.mo11362a(this.f8968y, new ExecutorC2100e0(), c2098d0);
                    it = m113079b.iterator();
                }
                bVar.f8966w = flowCollector;
                bVar.f8963t = c2098d0;
                bVar.f8964u = it;
                bVar.f8965v = 1;
                mo113028a = it.mo113028a(bVar);
                if (mo113028a != m142578e) {
                }
            } catch (Throwable th3) {
                th = th3;
                C2096c0.this.f8962c.mo11363b(c2098d0);
                throw th;
            }
            bVar = this;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C2096c0(InterfaceC2108i0 interfaceC2108i0, InterfaceC2127y interfaceC2127y) {
        AbstractC19074t.m100208f(interfaceC2108i0, "windowMetricsCalculator");
        AbstractC19074t.m100208f(interfaceC2127y, "windowBackend");
        this.f8961b = interfaceC2108i0;
        this.f8962c = interfaceC2127y;
    }

    @Override // androidx.window.layout.InterfaceC2092a0
    /* renamed from: a */
    public Flow mo11324a(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        return FlowKt.m113265A(new b(activity, null));
    }
}
