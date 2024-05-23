package p207he;

import am.AbstractC0924m0;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import com.zing.zalo.calls.GroupCallOngoingData;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import lo0.AbstractC22605i0;
import lo0.C22603h0;
import mm0.AbstractC23349d;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25378x;
import tn0.C26788f;
import un0.AbstractC27323a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: he.f */
/* loaded from: classes3.dex */
public final class C20012f {

    /* renamed from: d */
    private static volatile boolean f98383d;

    /* renamed from: a */
    public static final C20012f f98380a = new C20012f();

    /* renamed from: b */
    private static volatile ArrayList f98381b = new ArrayList();

    /* renamed from: c */
    private static final ArrayList f98382c = new ArrayList();

    /* renamed from: e */
    private static final C20022p f98384e = new C20022p();

    /* renamed from: he.f$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98385t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f98386u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f98386u = jSONObject;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f98386u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98385t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C20012f c20012f = C20012f.f98380a;
                this.f98385t = 1;
                if (c20012f.m103855m(this) == m142578e) {
                    return m142578e;
                }
            }
            GroupCallOngoingData groupCallOngoingData = new GroupCallOngoingData(this.f98386u);
            if (C20012f.f98382c.contains(AbstractC29094b.m145341c(groupCallOngoingData.m37673a()))) {
                return C24848g0.f119245a;
            }
            C20012f c20012f2 = C20012f.f98380a;
            if (c20012f2.m103861o(groupCallOngoingData.m37673a())) {
                return C24848g0.f119245a;
            }
            C20012f.f98381b.add(groupCallOngoingData);
            c20012f2.m103858t();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98387t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98387t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C20012f c20012f = C20012f.f98380a;
                if (!c20012f.m103854j()) {
                    return C24848g0.f119245a;
                }
                this.f98387t = 1;
                if (c20012f.m103855m(this) == m142578e) {
                    return m142578e;
                }
            }
            Iterator it = C20012f.f98381b.iterator();
            while (it.hasNext()) {
                C20012f.f98380a.m103857s((GroupCallOngoingData) it.next());
            }
            AbstractC0924m0.m3056Fj(System.currentTimeMillis());
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.f$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98388t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98388t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!C20012f.f98383d) {
                    C20012f.f98380a.m103856n();
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.f$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98389t;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98389t == 0) {
                AbstractC24862s.m129228b(obj);
                C20012f.f98380a.m103856n();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.f$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98390t;

        /* renamed from: u */
        final /* synthetic */ int f98391u;

        /* renamed from: he.f$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ int f98392q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11) {
                super(1);
                this.f98392q = i11;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(GroupCallOngoingData groupCallOngoingData) {
                boolean z11;
                AbstractC19074t.m100208f(groupCallOngoingData, "it");
                if (groupCallOngoingData.m37673a() == this.f98392q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation continuation) {
            super(2, continuation);
            this.f98391u = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f98391u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98390t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C20012f c20012f = C20012f.f98380a;
                this.f98390t = 1;
                if (c20012f.m103855m(this) == m142578e) {
                    return m142578e;
                }
            }
            C20012f.f98382c.add(AbstractC29094b.m145341c(this.f98391u));
            AbstractC25378x.m131542D(C20012f.f98381b, new a(this.f98391u));
            C20012f.f98380a.m103858t();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.f$f */
    /* loaded from: classes3.dex */
    public static final class f implements IVoipServiceRequestCallback {

        /* renamed from: a */
        final /* synthetic */ GroupCallOngoingData f98393a;

        f(GroupCallOngoingData groupCallOngoingData) {
            this.f98393a = groupCallOngoingData;
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            AbstractC19074t.m100208f(str, "value");
            AbstractC22605i0 m15508P0 = AbstractC3096i0.m15508P0(str, 460);
            if ((m15508P0 instanceof C22603h0) && ((C22603h0) m15508P0).f110704f != 0) {
                C20012f.f98380a.m103863q(this.f98393a.m37673a());
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
        }
    }

    private C20012f() {
    }

    /* renamed from: i */
    private final void m103853i(JSONObject jSONObject) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(jSONObject, null), 3, null);
    }

    /* renamed from: j */
    public final boolean m103854j() {
        String str;
        boolean m127128x;
        if (AbstractC23304d.f113287I1 > 0 && AbstractC23349d.m122770h() && (str = CoreUtility.f89233i) != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (m127128x || System.currentTimeMillis() - AbstractC0924m0.m3097H2() <= AbstractC23304d.f113287I1) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final Object m103855m(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new c(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: n */
    public final void m103856n() {
        boolean m127128x;
        try {
            String m3950k4 = AbstractC0924m0.m3950k4();
            f98381b.clear();
            AbstractC19074t.m100205c(m3950k4);
            m127128x = AbstractC24341v.m127128x(m3950k4);
            if (m127128x) {
                f98383d = true;
                return;
            }
            JSONArray jSONArray = new JSONArray(m3950k4);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                AbstractC27323a.a aVar = AbstractC27323a.f128573d;
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                aVar.mo131586a();
                f98381b.add((GroupCallOngoingData) aVar.m139867d(GroupCallOngoingData.Companion.serializer(), jSONObject2));
            }
            f98383d = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public final void m103857s(GroupCallOngoingData groupCallOngoingData) {
        boolean m127128x;
        String str = CoreUtility.f89233i;
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                try {
                    AbstractC3082b0.m15424f(C20012f.class.getName(), "pingOngoingGroupCall " + groupCallOngoingData.m37673a());
                    f fVar = new f(groupCallOngoingData);
                    C20022p c20022p = f98384e;
                    int m37675c = groupCallOngoingData.m37675c();
                    int m37673a = groupCallOngoingData.m37673a();
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    c20022p.groupPing(fVar, m37675c, m37673a, Integer.parseInt(str2), -1, 1, 1, "");
                } catch (Exception e11) {
                    AbstractC3082b0.m15422d(C20012f.class.getName(), "pingOngoingGroupCall " + e11);
                }
            }
        }
    }

    /* renamed from: t */
    public final void m103858t() {
        try {
            AbstractC27323a.a aVar = AbstractC27323a.f128573d;
            ArrayList arrayList = f98381b;
            aVar.mo131586a();
            AbstractC0924m0.m3290Nl(aVar.mo131597b(new C26788f(GroupCallOngoingData.Companion.serializer()), arrayList));
        } catch (Exception e11) {
            AbstractC3082b0.m15424f(C20012f.class.getName(), "saveCalls exception " + e11);
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public final void m103859k() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new b(null), 3, null);
    }

    /* renamed from: l */
    public final boolean m103860l(String str) {
        Object obj;
        AbstractC19074t.m100208f(str, "groupID");
        Iterator it = f98381b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(String.valueOf(((GroupCallOngoingData) obj).m37674b()), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        GroupCallOngoingData groupCallOngoingData = (GroupCallOngoingData) obj;
        if (groupCallOngoingData != null && !f98382c.contains(Integer.valueOf(groupCallOngoingData.m37673a()))) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m103861o(int i11) {
        Object obj;
        Iterator it = f98381b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((GroupCallOngoingData) obj).m37673a() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((GroupCallOngoingData) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m103862p() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new d(null), 3, null);
    }

    /* renamed from: q */
    public final void m103863q(int i11) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new e(i11, null), 3, null);
    }

    /* renamed from: r */
    public final void m103864r(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        try {
            if (AbstractC19074t.m100204b(c17945a0.m94929K2().f91016u, "recommened.groupcall")) {
                JSONObject jSONObject = new JSONObject(c17945a0.m94929K2().f91017v);
                if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE) && jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1) == 0) {
                    m103853i(jSONObject);
                }
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15424f(C20012f.class.getName(), "check isGroupCallEndedMsg exception " + e11);
            e11.printStackTrace();
        }
    }
}
