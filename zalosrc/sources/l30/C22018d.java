package l30;

import ae.C0764i;
import com.zing.zalo.story.ExceptionLoadStoryAds;
import cr.C17566a;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import ln0.AbstractC22543l;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p458qr.C25482o;
import p604wb.C28905e;
import p716zh.C31980jc;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: l30.d */
/* loaded from: classes5.dex */
public final class C22018d {

    /* renamed from: a */
    public static final C22018d f108408a = new C22018d();

    /* renamed from: b */
    private static final Object f108409b = new Object();

    /* renamed from: c */
    private static final List f108410c = new ArrayList();

    /* renamed from: d */
    private static final InterfaceC24854k f108411d;

    /* renamed from: e */
    private static final InterfaceC24854k f108412e;

    /* renamed from: l30.d$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f108413q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo12V4() {
            return Dispatchers.m112680b();
        }
    }

    /* renamed from: l30.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f108414q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo12V4() {
            return CoroutineScopeKt.m112637a(C22018d.f108408a.m114946g().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108415t;

        /* renamed from: u */
        private /* synthetic */ Object f108416u;

        /* renamed from: v */
        final /* synthetic */ int f108417v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC22016c f108418w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l30.d$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f108419t;

            /* renamed from: u */
            int f108420u;

            /* renamed from: v */
            private /* synthetic */ Object f108421v;

            /* renamed from: w */
            final /* synthetic */ int f108422w;

            /* renamed from: l30.d$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32876a implements InterfaceC20094a {

                /* renamed from: a */
                final /* synthetic */ CoroutineScope f108423a;

                /* renamed from: b */
                final /* synthetic */ CancellableContinuation f108424b;

                C32876a(CoroutineScope coroutineScope, CancellableContinuation cancellableContinuation) {
                    this.f108423a = coroutineScope;
                    this.f108424b = cancellableContinuation;
                }

                @Override // hm0.InterfaceC20094a
                /* renamed from: a */
                public void mo926a(C20096c c20096c) {
                    if (CoroutineScopeKt.m112642f(this.f108423a)) {
                        CancellableContinuation cancellableContinuation = this.f108424b;
                        C24861r.a aVar = C24861r.f119264q;
                        cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionLoadStoryAds(c20096c))));
                    }
                }

                @Override // hm0.InterfaceC20094a
                /* renamed from: b */
                public void mo927b(Object obj) {
                    JSONObject jSONObject;
                    JSONObject optJSONObject;
                    JSONArray optJSONArray;
                    if (CoroutineScopeKt.m112642f(this.f108423a)) {
                        ArrayList arrayList = new ArrayList();
                        if (obj instanceof JSONObject) {
                            jSONObject = (JSONObject) obj;
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null && (optJSONArray = optJSONObject.optJSONArray("ads")) != null) {
                            int length = optJSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                                if (optJSONObject2 != null) {
                                    AbstractC19074t.m100205c(optJSONObject2);
                                    C17566a m93548a = C17566a.Companion.m93548a(optJSONObject2);
                                    arrayList.add(m93548a);
                                    C28905e.m144373n().m144383L(40, m93548a.m93545p(), m93548a.m93530a());
                                    C28905e.m144373n().m144383L(50, m93548a.m93545p(), m93548a.m93530a());
                                }
                            }
                            if (optJSONArray.length() == 0) {
                                C25482o.f122075a.m131988I(500061);
                            }
                        }
                        this.f108424b.mo112492g(C24861r.m129218b(arrayList));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, Continuation continuation) {
                super(2, continuation);
                this.f108422w = i11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f108422w, continuation);
                aVar.f108421v = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                Continuation m142576c;
                Object m142578e2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f108420u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f108421v;
                    int i12 = this.f108422w;
                    this.f108421v = coroutineScope;
                    this.f108419t = i12;
                    this.f108420u = 1;
                    m142576c = AbstractC28297c.m142576c(this);
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                    cancellableContinuationImpl.m112574F();
                    C0764i c0764i = new C0764i();
                    c0764i.m1341j(new C32876a(coroutineScope, cancellableContinuationImpl));
                    c0764i.m1383m(i12);
                    obj = cancellableContinuationImpl.m112571A();
                    m142578e2 = AbstractC28298d.m142578e();
                    if (obj == m142578e2) {
                        AbstractC29100h.m145355c(this);
                    }
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                return obj;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, InterfaceC22016c interfaceC22016c, Continuation continuation) {
            super(2, continuation);
            this.f108417v = i11;
            this.f108418w = interfaceC22016c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f108417v, this.f108418w, continuation);
            cVar.f108416u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long m116589l;
            CoroutineScope coroutineScope;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f108415t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f108416u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f108416u;
                    m116589l = AbstractC22543l.m116589l(C19172a.m100600k("social@story@story_ads@timeout", 1000), 500L, 5000L);
                    a aVar = new a(this.f108417v, null);
                    this.f108416u = coroutineScope2;
                    this.f108415t = 1;
                    Object m112878c = TimeoutKt.m112878c(m116589l, aVar, this);
                    if (m112878c == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                    obj = m112878c;
                }
                List list = (List) obj;
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    Object obj2 = C22018d.f108409b;
                    InterfaceC22016c interfaceC22016c = this.f108418w;
                    synchronized (obj2) {
                        C22018d.f108408a.m114949d();
                        C22018d.f108410c.addAll(list);
                        interfaceC22016c.mo114938a();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
            } catch (ExceptionLoadStoryAds unused) {
                Object obj3 = C22018d.f108409b;
                InterfaceC22016c interfaceC22016c2 = this.f108418w;
                synchronized (obj3) {
                    C22018d.f108408a.m114949d();
                    interfaceC22016c2.mo114939b();
                    C24848g0 c24848g02 = C24848g0.f119245a;
                }
            } catch (Exception e11) {
                Object obj4 = C22018d.f108409b;
                InterfaceC22016c interfaceC22016c3 = this.f108418w;
                synchronized (obj4) {
                    C22018d.f108408a.m114949d();
                    interfaceC22016c3.mo114940c();
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    if (e11 instanceof TimeoutCancellationException) {
                        C25482o.f122075a.m131988I(500060);
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f108413q);
        f108411d = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f108414q);
        f108412e = m129210a2;
    }

    private C22018d() {
    }

    /* renamed from: e */
    public static final void m114944e(List list, int i11) {
        AbstractC19074t.m100208f(list, "lstUserStory");
        synchronized (f108409b) {
            try {
                for (C17566a c17566a : f108410c) {
                    if ((c17566a.m93541l() + i11) - 1 < list.size()) {
                        int m93541l = (c17566a.m93541l() + i11) - 1;
                        C31980jc m153810l = C31980jc.m153810l(c17566a);
                        AbstractC19074t.m100207e(m153810l, "createFromAdsItem(...)");
                        list.add(m93541l, m153810l);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static final void m114945f(C31980jc c31980jc, InterfaceC22016c interfaceC22016c) {
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(c31980jc, "userStory");
        AbstractC19074t.m100208f(interfaceC22016c, "listener");
        List list = C22021e0.f108429m;
        AbstractC19074t.m100207e(list, "userStoryList");
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                i11 = 0;
                int i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        C31980jc c31980jc2 = (C31980jc) it.next();
                        if (c31980jc2 != null && AbstractC19074t.m100204b(c31980jc.f147023p, c31980jc2.f147023p)) {
                            z11 = !c31980jc2.m153829v();
                            break;
                        }
                        i12++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                List list2 = C22021e0.f108429m;
                int size = list2.size() - i12;
                if (z11) {
                    AbstractC19074t.m100207e(list2, "userStoryList");
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if ((!((C31980jc) it2.next()).m153829v()) && (i11 = i11 + 1) < 0) {
                                AbstractC25368s.m131508p();
                            }
                        }
                    }
                } else {
                    i11 = size;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        BuildersKt__Builders_commonKt.m112540d(f108408a.m114947h(), null, null, new c(i11, interfaceC22016c, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final CoroutineDispatcher m114946g() {
        return (CoroutineDispatcher) f108411d.getValue();
    }

    /* renamed from: h */
    private final CoroutineScope m114947h() {
        return (CoroutineScope) f108412e.getValue();
    }

    /* renamed from: i */
    public static final boolean m114948i(int i11) {
        return i11 == 334;
    }

    /* renamed from: d */
    public final void m114949d() {
        f108410c.clear();
    }
}
