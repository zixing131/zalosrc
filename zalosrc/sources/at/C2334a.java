package at;

import ae.C0766k;
import am.C0927o;
import am.C0943w;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p716zh.C31973j5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: at.a */
/* loaded from: classes4.dex */
public final class C2334a {

    /* renamed from: at.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f9823t;

        /* renamed from: u */
        private /* synthetic */ Object f9824u;

        /* renamed from: v */
        final /* synthetic */ String f9825v;

        /* renamed from: w */
        final /* synthetic */ int f9826w;

        /* renamed from: x */
        final /* synthetic */ boolean f9827x;

        /* renamed from: at.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32645a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f9828a;

            /* renamed from: b */
            final /* synthetic */ String f9829b;

            C32645a(ProducerScope producerScope, String str) {
                this.f9828a = producerScope;
                this.f9829b = str;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                boolean z11;
                AbstractC19074t.m100208f(c20096c, "errorMessage");
                C31973j5 m4472f = C0943w.f3447a.m4472f(this.f9829b);
                if (m4472f != null) {
                    z11 = m4472f.m153747Y();
                } else {
                    z11 = false;
                }
                ToastUtils.m89261i(c20096c, z11);
                CoroutineScopeKt.m112638b(this.f9828a, new CancellationException(c20096c.m104492d()));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                AbstractC19074t.m100208f(obj, C0927o.f3427r);
                this.f9828a.mo112912p(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: at.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f9830q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m12291a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m12291a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i11, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f9825v = str;
            this.f9826w = i11;
            this.f9827x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f9825v, this.f9826w, this.f9827x, continuation);
            aVar.f9824u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f9823t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f9824u;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C32645a(producerScope, this.f9825v));
                c0766k.mo1412D7(this.f9825v, this.f9826w, this.f9827x);
                b bVar = b.f9830q;
                this.f9823t = 1;
                if (ProduceKt.m113184a(producerScope, bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((a) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public final Flow m12289a(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "groupId");
        return FlowKt.m113287e(new a(str, i11, z11, null));
    }
}
