package is;

import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gq.C19581d;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import mm0.AbstractC23350e;
import p107dq.C18045a;
import p107dq.C18049e;
import p107dq.C18054j;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: is.w0 */
/* loaded from: classes4.dex */
public abstract class AbstractC20828w0 {
    public static final a Companion = new a(null);

    /* renamed from: is.w0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: is.w0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32846a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f102387t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18494a f102388u;

            /* renamed from: v */
            final /* synthetic */ InterfaceC18494a f102389v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32846a(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, Continuation continuation) {
                super(2, continuation);
                this.f102388u = interfaceC18494a;
                this.f102389v = interfaceC18494a2;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32846a(this.f102388u, this.f102389v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f102387t;
                if (i11 != 0 && i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                while (!((Boolean) this.f102388u.mo12V4()).booleanValue()) {
                    this.f102387t = 1;
                    if (DelayKt.m112666b(5000L, this) == m142578e) {
                        return m142578e;
                    }
                }
                this.f102389v.mo12V4();
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32846a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m108852a(C3020p0 c3020p0, String str) {
            C18054j c18054j;
            String str2;
            C18049e c18049e;
            C18045a m95928a;
            AbstractC19074t.m100208f(str, "displayedBackgroundUrl");
            if (c3020p0 == null) {
                return false;
            }
            try {
                if (c3020p0.f12023C.f12127r.m95929b() == 3) {
                    C3025q0 c3025q0 = c3020p0.f12023C;
                    if (c3025q0 != null && (c18049e = c3025q0.f12127r) != null && (m95928a = c18049e.m95928a()) != null) {
                        c18054j = m95928a.m95914b();
                    } else {
                        c18054j = null;
                    }
                    C19581d c19581d = C19581d.f97279a;
                    if (c18054j == null || (str2 = c18054j.m95948b()) == null) {
                        str2 = "";
                    }
                    int m102500w = c19581d.m102500w(str2);
                    int m102500w2 = c19581d.m102500w(str);
                    if (m102500w == 2 && m102500w != m102500w2) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:            r1 = on0.AbstractC24340u.m127109o(r1);     */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TrackingSource m108853b(C3020p0 c3020p0) {
            long j11;
            Long m127109o;
            TrackingSource trackingSource = new TrackingSource(10);
            if (c3020p0 != null) {
                String str = c3020p0.f12057p;
                if (str != null && m127109o != null) {
                    j11 = m127109o.longValue();
                } else {
                    j11 = 0;
                }
                trackingSource.m40677a("feedid", Long.valueOf(j11));
                trackingSource.m40677a("feedtype", Integer.valueOf(c3020p0.f12058q));
            }
            return trackingSource;
        }

        /* renamed from: c */
        public final Job m108854c(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
            Job m112540d;
            AbstractC19074t.m100208f(interfaceC18494a, "condition");
            AbstractC19074t.m100208f(interfaceC18494a2, "onTimeOut");
            m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new C32846a(interfaceC18494a, interfaceC18494a2, null), 3, null);
            return m112540d;
        }
    }
}
