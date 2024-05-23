package p282jz;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.Map;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONObject;
import p191gz.C19683a;
import p191gz.C19684b;
import p282jz.AbstractC21416a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25363p0;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: jz.c */
/* loaded from: classes4.dex */
public final class C21418c implements InterfaceC21417b {

    /* renamed from: a */
    private final InterfaceC21766a f104382a;

    /* renamed from: jz.c$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f104383t;

        /* renamed from: u */
        Object f104384u;

        /* renamed from: v */
        int f104385v;

        /* renamed from: w */
        int f104386w;

        /* renamed from: y */
        final /* synthetic */ int f104388y;

        /* renamed from: z */
        final /* synthetic */ String f104389z;

        /* renamed from: jz.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32853a implements InterfaceC21769d {

            /* renamed from: a */
            final /* synthetic */ Continuation f104390a;

            C32853a(Continuation continuation) {
                this.f104390a = continuation;
            }

            @Override // km0.InterfaceC21769d
            /* renamed from: a */
            public void mo13651a(int i11, String str) {
                AbstractC19074t.m100208f(str, "errorMessage");
                this.f104390a.mo112492g(C24861r.m129218b(new AbstractC21416a.a(i11, str)));
            }

            @Override // km0.InterfaceC21769d
            /* renamed from: b */
            public void mo13652b(EnumC21773h enumC21773h, Object obj) {
                AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                AbstractC19074t.m100208f(obj, "result");
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt("error_code");
                String optString = jSONObject.optString("error_message");
                if (optInt == 0) {
                    if (jSONObject.has("data")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null && optJSONObject.has("settings")) {
                            boolean optBoolean = optJSONObject.optBoolean("hasMore");
                            String optString2 = optJSONObject.optString("keyLv0");
                            AbstractC19074t.m100207e(optString2, "data.optString(\"keyLv0\")");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            C19684b c19684b = new C19684b(optBoolean, optString2, optJSONObject2);
                            Continuation continuation = this.f104390a;
                            C24861r.a aVar = C24861r.f119264q;
                            continuation.mo112492g(C24861r.m129218b(new AbstractC21416a.b(c19684b)));
                            return;
                        }
                        return;
                    }
                    Continuation continuation2 = this.f104390a;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(new AbstractC21416a.a(optInt, "No data json")));
                    return;
                }
                Continuation continuation3 = this.f104390a;
                C24861r.a aVar3 = C24861r.f119264q;
                AbstractC19074t.m100207e(optString, "errorMsg");
                continuation3.mo112492g(C24861r.m129218b(new AbstractC21416a.a(optInt, optString)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, String str, Continuation continuation) {
            super(2, continuation);
            this.f104388y = i11;
            this.f104389z = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f104388y, this.f104389z, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Map m131417v;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104386w;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21418c c21418c = C21418c.this;
                int i12 = this.f104388y;
                String str = this.f104389z;
                this.f104383t = c21418c;
                this.f104384u = str;
                this.f104385v = i12;
                this.f104386w = 1;
                m142576c = AbstractC28297c.m142576c(this);
                C27317h c27317h = new C27317h(m142576c);
                C32853a c32853a = new C32853a(c27317h);
                m131417v = AbstractC25363p0.m131417v(c21418c.f104382a.mo1371g());
                m131417v.put("page", String.valueOf(i12));
                m131417v.put("keyLv0", str);
                c21418c.f104382a.mo1365a(AbstractC19074t.m100216n(c21418c.f104382a.mo1370f("register_talk_m_s"), "/api/settings/getAllZaloSettingsPaging"), 11276, true, m131417v, c32853a);
                obj = c27317h.m139856a();
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

    /* renamed from: jz.c$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f104391t;

        /* renamed from: u */
        Object f104392u;

        /* renamed from: v */
        int f104393v;

        /* renamed from: x */
        final /* synthetic */ JSONArray f104395x;

        /* renamed from: jz.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC21769d {

            /* renamed from: a */
            final /* synthetic */ Continuation f104396a;

            a(Continuation continuation) {
                this.f104396a = continuation;
            }

            @Override // km0.InterfaceC21769d
            /* renamed from: a */
            public void mo13651a(int i11, String str) {
                AbstractC19074t.m100208f(str, "errorMessage");
                this.f104396a.mo112492g(C24861r.m129218b(new AbstractC21416a.a(i11, str)));
            }

            @Override // km0.InterfaceC21769d
            /* renamed from: b */
            public void mo13652b(EnumC21773h enumC21773h, Object obj) {
                AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                AbstractC19074t.m100208f(obj, "result");
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt("error_code");
                String optString = jSONObject.optString("error_message");
                if (optInt == 0) {
                    if (jSONObject.has("data")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null && optJSONObject.has("settings")) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            C19684b c19684b = new C19684b(false, null, optJSONObject2, 3, null);
                            Continuation continuation = this.f104396a;
                            C24861r.a aVar = C24861r.f119264q;
                            continuation.mo112492g(C24861r.m129218b(new AbstractC21416a.b(c19684b)));
                            return;
                        }
                        return;
                    }
                    Continuation continuation2 = this.f104396a;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(new AbstractC21416a.a(optInt, "No data json")));
                    return;
                }
                Continuation continuation3 = this.f104396a;
                C24861r.a aVar3 = C24861r.f119264q;
                AbstractC19074t.m100207e(optString, "errorMsg");
                continuation3.mo112492g(C24861r.m129218b(new AbstractC21416a.a(optInt, optString)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JSONArray jSONArray, Continuation continuation) {
            super(2, continuation);
            this.f104395x = jSONArray;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f104395x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Map m131417v;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104393v;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21418c c21418c = C21418c.this;
                JSONArray jSONArray = this.f104395x;
                this.f104391t = c21418c;
                this.f104392u = jSONArray;
                this.f104393v = 1;
                m142576c = AbstractC28297c.m142576c(this);
                C27317h c27317h = new C27317h(m142576c);
                a aVar = new a(c27317h);
                m131417v = AbstractC25363p0.m131417v(c21418c.f104382a.mo1371g());
                String jSONArray2 = jSONArray.toString();
                AbstractC19074t.m100207e(jSONArray2, "listKeyLv0.toString()");
                m131417v.put("listKeyLv0", jSONArray2);
                c21418c.f104382a.mo1365a(AbstractC19074t.m100216n(c21418c.f104382a.mo1370f("register_talk_m_s"), "/api/settings/getListZaloSettings"), 11277, true, m131417v, aVar);
                obj = c27317h.m139856a();
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
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: jz.c$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f104397t;

        /* renamed from: u */
        Object f104398u;

        /* renamed from: v */
        int f104399v;

        /* renamed from: x */
        final /* synthetic */ JSONObject f104401x;

        /* renamed from: jz.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC21769d {

            /* renamed from: a */
            final /* synthetic */ Continuation f104402a;

            a(Continuation continuation) {
                this.f104402a = continuation;
            }

            @Override // km0.InterfaceC21769d
            /* renamed from: a */
            public void mo13651a(int i11, String str) {
                AbstractC19074t.m100208f(str, "errorMessage");
                this.f104402a.mo112492g(C24861r.m129218b(new AbstractC21416a.a(i11, str)));
            }

            @Override // km0.InterfaceC21769d
            /* renamed from: b */
            public void mo13652b(EnumC21773h enumC21773h, Object obj) {
                AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                AbstractC19074t.m100208f(obj, "result");
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt("error_code");
                String optString = jSONObject.optString("error_message");
                if (optInt == 0) {
                    Continuation continuation = this.f104402a;
                    C24861r.a aVar = C24861r.f119264q;
                    AbstractC19074t.m100207e(optString, "errorMsg");
                    continuation.mo112492g(C24861r.m129218b(new AbstractC21416a.b(new C19683a(optInt, optString, null, 4, null))));
                    return;
                }
                Continuation continuation2 = this.f104402a;
                C24861r.a aVar2 = C24861r.f119264q;
                AbstractC19074t.m100207e(optString, "errorMsg");
                continuation2.mo112492g(C24861r.m129218b(new AbstractC21416a.a(optInt, optString)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f104401x = jSONObject;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f104401x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Map m131417v;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f104399v;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21418c c21418c = C21418c.this;
                JSONObject jSONObject = this.f104401x;
                this.f104397t = c21418c;
                this.f104398u = jSONObject;
                this.f104399v = 1;
                m142576c = AbstractC28297c.m142576c(this);
                C27317h c27317h = new C27317h(m142576c);
                a aVar = new a(c27317h);
                m131417v = AbstractC25363p0.m131417v(c21418c.f104382a.mo1371g());
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "settings.toString()");
                m131417v.put("settings", jSONObject2);
                c21418c.f104382a.mo1365a(AbstractC19074t.m100216n(c21418c.f104382a.mo1370f("register_talk_m_s"), "/api/settings/pushLogZaloSettings"), 11278, true, m131417v, aVar);
                obj = c27317h.m139856a();
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
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C21418c(InterfaceC21766a interfaceC21766a) {
        AbstractC19074t.m100208f(interfaceC21766a, "networkProvider");
        this.f104382a = interfaceC21766a;
    }

    @Override // p282jz.InterfaceC21417b
    /* renamed from: a */
    public Object mo110914a(JSONObject jSONObject, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(jSONObject, null), continuation);
    }

    @Override // p282jz.InterfaceC21417b
    /* renamed from: b */
    public Object mo110915b(JSONArray jSONArray, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new b(jSONArray, null), continuation);
    }

    @Override // p282jz.InterfaceC21417b
    /* renamed from: c */
    public Object mo110916c(int i11, String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new a(i11, str, null), continuation);
    }
}
