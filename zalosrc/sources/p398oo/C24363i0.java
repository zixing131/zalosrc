package p398oo;

import ae.C0766k;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p425po.C24893o;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: oo.i0 */
/* loaded from: classes4.dex */
public final class C24363i0 implements InterfaceC24370m {

    /* renamed from: oo.i0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117631t;

        /* renamed from: u */
        private /* synthetic */ Object f117632u;

        /* renamed from: v */
        final /* synthetic */ List f117633v;

        /* renamed from: w */
        final /* synthetic */ int f117634w;

        /* renamed from: oo.i0$a$a */
        /* loaded from: classes4.dex */
        public static final class C32914a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f117635a;

            C32914a(ProducerScope producerScope) {
                this.f117635a = producerScope;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "error_message");
                CoroutineScopeKt.m112638b(this.f117635a, new CancellationException(c20096c.m104492d()));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                JSONObject jSONObject;
                boolean z11;
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        ProducerScope producerScope = this.f117635a;
                        if (jSONObject.optInt("error_code") == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        producerScope.mo112912p(Boolean.valueOf(z11));
                        return;
                    }
                    CoroutineScopeKt.m112638b(this.f117635a, new CancellationException("API Error"));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    CoroutineScopeKt.m112638b(this.f117635a, new CancellationException("API Error"));
                }
            }
        }

        /* renamed from: oo.i0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f117636q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m127428a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m127428a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, int i11, Continuation continuation) {
            super(2, continuation);
            this.f117633v = list;
            this.f117634w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f117633v, this.f117634w, continuation);
            aVar.f117632u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117631t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f117632u;
                C0766k c0766k = new C0766k();
                List list = this.f117633v;
                int i12 = this.f117634w;
                c0766k.mo1704o8(new C32914a(producerScope));
                c0766k.m1845g(list, i12);
                b bVar = b.f117636q;
                this.f117631t = 1;
                if (ProduceKt.m113184a(producerScope, bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((a) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.i0$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117637t;

        /* renamed from: u */
        private /* synthetic */ Object f117638u;

        /* renamed from: v */
        final /* synthetic */ int f117639v;

        /* renamed from: w */
        final /* synthetic */ C24363i0 f117640w;

        /* renamed from: oo.i0$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f117641a;

            /* renamed from: b */
            final /* synthetic */ C24363i0 f117642b;

            a(ProducerScope producerScope, C24363i0 c24363i0) {
                this.f117641a = producerScope;
                this.f117642b = c24363i0;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "error_message");
                CoroutineScopeKt.m112638b(this.f117641a, new CancellationException(c20096c.m104492d()));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                JSONObject jSONObject;
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null && jSONObject.has("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        int optInt = jSONObject2.optInt("expiredTime", 21600);
                        if (jSONObject2.has("list")) {
                            this.f117641a.mo112912p(new C24385z(this.f117642b.m127422f(jSONObject2.optJSONArray("list")), optInt));
                            return;
                        }
                        return;
                    }
                    CoroutineScopeKt.m112638b(this.f117641a, new CancellationException("API Error"));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    CoroutineScopeKt.m112638b(this.f117641a, new CancellationException("API Error"));
                }
            }
        }

        /* renamed from: oo.i0$b$b */
        /* loaded from: classes4.dex */
        public static final class C32915b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32915b f117643q = new C32915b();

            C32915b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m127430a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m127430a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, C24363i0 c24363i0, Continuation continuation) {
            super(2, continuation);
            this.f117639v = i11;
            this.f117640w = c24363i0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f117639v, this.f117640w, continuation);
            bVar.f117638u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117637t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f117638u;
                C0766k c0766k = new C0766k();
                int i12 = this.f117639v;
                c0766k.mo1704o8(new a(producerScope, this.f117640w));
                c0766k.m1820N(i12);
                C32915b c32915b = C32915b.f117643q;
                this.f117637t = 1;
                if (ProduceKt.m113184a(producerScope, c32915b, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((b) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.i0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117644t;

        /* renamed from: u */
        private /* synthetic */ Object f117645u;

        /* renamed from: v */
        final /* synthetic */ String f117646v;

        /* renamed from: w */
        final /* synthetic */ int f117647w;

        /* renamed from: x */
        final /* synthetic */ int f117648x;

        /* renamed from: oo.i0$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f117649a;

            a(ProducerScope producerScope) {
                this.f117649a = producerScope;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "error_message");
                CoroutineScopeKt.m112638b(this.f117649a, new CancellationException(c20096c.m104492d()));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                JSONObject jSONObject;
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null && jSONObject.has("data")) {
                        ProducerScope producerScope = this.f117649a;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                        producerScope.mo112912p(new C24375p(jSONObject2));
                        return;
                    }
                    CoroutineScopeKt.m112638b(this.f117649a, new CancellationException("API Error"));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    CoroutineScopeKt.m112638b(this.f117649a, new CancellationException("API Error"));
                }
            }
        }

        /* renamed from: oo.i0$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f117650q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m127432a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m127432a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i11, int i12, Continuation continuation) {
            super(2, continuation);
            this.f117646v = str;
            this.f117647w = i11;
            this.f117648x = i12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f117646v, this.f117647w, this.f117648x, continuation);
            cVar.f117645u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117644t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f117645u;
                C0766k c0766k = new C0766k();
                String str = this.f117646v;
                int i12 = this.f117647w;
                int i13 = this.f117648x;
                c0766k.mo1704o8(new a(producerScope));
                c0766k.m1821O(str, i12, i13);
                b bVar = b.f117650q;
                this.f117644t = 1;
                if (ProduceKt.m113184a(producerScope, bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((c) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.i0$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117651t;

        /* renamed from: u */
        private /* synthetic */ Object f117652u;

        /* renamed from: v */
        final /* synthetic */ List f117653v;

        /* renamed from: w */
        final /* synthetic */ int f117654w;

        /* renamed from: oo.i0$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f117655a;

            a(ProducerScope producerScope) {
                this.f117655a = producerScope;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "error_message");
                CoroutineScopeKt.m112638b(this.f117655a, new CancellationException(c20096c.m104492d()));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                JSONObject jSONObject;
                boolean z11;
                AbstractC19074t.m100208f(obj, "entity");
                try {
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        ProducerScope producerScope = this.f117655a;
                        if (jSONObject.optInt("error_code") == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        producerScope.mo112912p(Boolean.valueOf(z11));
                        return;
                    }
                    CoroutineScopeKt.m112638b(this.f117655a, new CancellationException("API Error"));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    CoroutineScopeKt.m112638b(this.f117655a, new CancellationException("API Error"));
                }
            }
        }

        /* renamed from: oo.i0$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f117656q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m127434a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m127434a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, int i11, Continuation continuation) {
            super(2, continuation);
            this.f117653v = list;
            this.f117654w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f117653v, this.f117654w, continuation);
            dVar.f117652u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117651t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f117652u;
                C0766k c0766k = new C0766k();
                List list = this.f117653v;
                int i12 = this.f117654w;
                c0766k.mo1704o8(new a(producerScope));
                c0766k.m1862o0(list, i12);
                b bVar = b.f117656q;
                this.f117651t = 1;
                if (ProduceKt.m113184a(producerScope, bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((d) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: f */
    public final List m127422f(JSONArray jSONArray) {
        List m131502j;
        if (jSONArray == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (jSONObject != null) {
                AbstractC19074t.m100205c(jSONObject);
                arrayList.add(new C24893o(jSONObject));
            }
        }
        return arrayList;
    }

    @Override // p398oo.InterfaceC24370m
    /* renamed from: a */
    public Flow mo127423a(int i11) {
        return FlowKt.m113287e(new b(i11, this, null));
    }

    @Override // p398oo.InterfaceC24370m
    /* renamed from: b */
    public Flow mo127424b(List list, int i11) {
        AbstractC19074t.m100208f(list, "userIds");
        return FlowKt.m113287e(new d(list, i11, null));
    }

    @Override // p398oo.InterfaceC24370m
    /* renamed from: c */
    public Flow mo127425c(List list, int i11) {
        AbstractC19074t.m100208f(list, "userIds");
        return FlowKt.m113287e(new a(list, i11, null));
    }

    @Override // p398oo.InterfaceC24370m
    /* renamed from: d */
    public Flow mo127426d(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "lastUserId");
        return FlowKt.m113287e(new c(str, i11, i12, null));
    }
}
