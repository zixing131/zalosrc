package be0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mh.AbstractC23295a;
import mh.C23298d;
import p185gc.AbstractC19382f;
import p461qu.AbstractC25495a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28081h4;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: be0.f */
/* loaded from: classes4.dex */
public final class C2781f extends AbstractC19382f {

    /* renamed from: a */
    private final C19636i1 f11046a;

    /* renamed from: b */
    private final C23298d f11047b;

    /* renamed from: c */
    private final C28081h4 f11048c;

    /* renamed from: be0.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f11049a;

        /* renamed from: b */
        private final C17945a0 f11050b;

        public a(String str, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(str, "conversationId");
            this.f11049a = str;
            this.f11050b = c17945a0;
        }

        /* renamed from: a */
        public final String m13399a() {
            return this.f11049a;
        }

        /* renamed from: b */
        public final C17945a0 m13400b() {
            return this.f11050b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f11049a, aVar.f11049a) && AbstractC19074t.m100204b(this.f11050b, aVar.f11050b);
        }

        public int hashCode() {
            int hashCode = this.f11049a.hashCode() * 31;
            C17945a0 c17945a0 = this.f11050b;
            return hashCode + (c17945a0 == null ? 0 : c17945a0.hashCode());
        }

        public String toString() {
            return "Params(conversationId=" + this.f11049a + ", message=" + this.f11050b + ")";
        }

        public /* synthetic */ a(String str, C17945a0 c17945a0, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : c17945a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f11051t;

        /* renamed from: u */
        final /* synthetic */ a f11052u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f11052u = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f11052u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f11051t == 0) {
                AbstractC24862s.m129228b(obj);
                return C7959d.Companion.m41850e().m41793i2(this.f11052u.m13399a());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C2781f(C19636i1 c19636i1, C23298d c23298d, C28081h4 c28081h4) {
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        AbstractC19074t.m100208f(c28081h4, "oldGroupDeliveredSeenManager");
        this.f11046a = c19636i1;
        this.f11047b = c23298d;
        this.f11048c = c28081h4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19382f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo13397b(a aVar, Continuation continuation) {
        Object m142578e;
        MessageId m95029V3;
        Object m142578e2;
        if (AbstractC25495a.m132079d(aVar.m13399a())) {
            if (AbstractC23295a.m120435b()) {
                Object m120472e = this.f11047b.m120472e(AbstractC25495a.m132088m(aVar.m13399a()), continuation);
                m142578e2 = AbstractC28298d.m142578e();
                if (m120472e == m142578e2) {
                    return m120472e;
                }
                return C24848g0.f119245a;
            }
            C17945a0 m13400b = aVar.m13400b();
            if (m13400b != null && (m95029V3 = m13400b.m95029V3()) != null) {
                long m41045i = m95029V3.m41045i();
                if (!this.f11048c.m141542b(m41045i)) {
                    this.f11048c.m141546g(m41045i);
                }
            }
        } else if (this.f11046a.m102794x(aVar.m13399a()) == null) {
            Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new b(aVar, null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112534g == m142578e) {
                return m112534g;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }
}
