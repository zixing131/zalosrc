package p398oo;

import ae.C0766k;
import android.text.TextUtils;
import bo.C3000l0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedAPI;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedNetwork;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import li.AbstractC22490a;
import me0.AbstractC23216t1;
import me0.C23055e5;
import on0.AbstractC24340u;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23304d;
import p458qr.C25487t;
import p509sp.C26359h;
import p716zh.C32002l4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pr.C24906b;
import tn.C26747f0;
import tr.C26877a;
import ue0.AbstractC27241b;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: oo.b */
/* loaded from: classes4.dex */
public final class C24348b {
    public static final a Companion = new a(null);

    /* renamed from: oo.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oo.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends Exception {
    }

    /* renamed from: oo.b$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ List f117455b;

        /* renamed from: c */
        final /* synthetic */ Continuation f117456c;

        c(List list, Continuation continuation) {
            this.f117455b = list;
            this.f117456c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C24348b.this.m127226i("addHiddenListUser Error " + this.f117455b + " " + c20096c);
            Continuation continuation = this.f117456c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeed(c20096c))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C24348b.this.m127226i("addHiddenListUser Success " + this.f117455b);
                Continuation continuation = this.f117456c;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation2 = this.f117456c;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
            }
        }
    }

    /* renamed from: oo.b$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f117458b;

        /* renamed from: c */
        final /* synthetic */ Continuation f117459c;

        d(String str, Continuation continuation) {
            this.f117458b = str;
            this.f117459c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C24348b.this.m127226i("deleteFeed Error " + c20096c);
            Continuation continuation = this.f117459c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C24348b.this.m127226i("deleteFeed Success " + this.f117458b);
                Continuation continuation = this.f117459c;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation2 = this.f117459c;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
            }
        }
    }

    /* renamed from: oo.b$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ Continuation f117461b;

        e(Continuation continuation) {
            this.f117461b = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C24348b.this.m127226i("deleteMultiFeed Error " + c20096c);
            Continuation continuation = this.f117461b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                ArrayList arrayList = new ArrayList();
                if (jSONObject.has("delete_error") && (jSONArray = jSONObject.getJSONArray("delete_error")) != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = jSONArray.getString(i11);
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC19074t.m100205c(string);
                            arrayList.add(string);
                        }
                    }
                }
                C24348b.this.m127226i("deleteMultiFeed Success exclude " + arrayList);
                Continuation continuation = this.f117461b;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new C24347a0(arrayList)));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation2 = this.f117461b;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
            }
        }
    }

    /* renamed from: oo.b$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f117462a;

        /* renamed from: b */
        final /* synthetic */ Continuation f117463b;

        /* renamed from: c */
        final /* synthetic */ int f117464c;

        /* renamed from: d */
        final /* synthetic */ C24348b f117465d;

        /* renamed from: e */
        final /* synthetic */ String f117466e;

        /* renamed from: f */
        final /* synthetic */ String f117467f;

        f(int i11, Continuation continuation, int i12, C24348b c24348b, String str, String str2) {
            this.f117462a = i11;
            this.f117463b = continuation;
            this.f117464c = i12;
            this.f117465d = c24348b;
            this.f117466e = str;
            this.f117467f = str2;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC27241b.m139381b("10000002").m139377b();
            try {
                String m104490b = c20096c.m104490b();
                if (m104490b != null && m104490b.length() != 0) {
                    C26877a.f127182a.m138446f(new JSONObject(c20096c.m104490b()), true, this.f117462a, true);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (AbstractC23216t1.m119640e(c20096c.m104491c())) {
                Continuation continuation = this.f117463b;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionFeedNetwork.f46209q)));
            } else {
                Continuation continuation2 = this.f117463b;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(c20096c))));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC27241b.m139381b("10000002").m139377b();
            AbstractC27241b.m139381b("10000003").m139379d();
            AbstractC23304d.f113387g1 = System.currentTimeMillis();
            try {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    if (this.f117464c == 0) {
                        C26877a.f127182a.m138442a(this.f117462a);
                    }
                    long j11 = jSONObject.getLong("ver");
                    int i11 = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    boolean optBoolean = jSONObject.optBoolean("lmore");
                    C24348b c24348b = this.f117465d;
                    String str = "Get feed success; Last Feed Remote= " + this.f117466e + "; Last Feed Local= " + this.f117467f + "; Version= " + j11 + "; Type : " + i11 + "; Tab : " + this.f117462a + "; Page : " + this.f117464c;
                    AbstractC19074t.m100207e(str, "toString(...)");
                    c24348b.m127226i(str);
                    String optString = jSONObject.optString("last_feed_id");
                    C26877a c26877a = C26877a.f127182a;
                    boolean z11 = false;
                    if (c26877a.m138448h(i11)) {
                        C26747f0.m137582I().m137675n0(0);
                    }
                    if (this.f117464c == 0) {
                        AbstractC19074t.m100205c(jSONObject);
                        c26877a.m138445d(jSONObject);
                        c26877a.m138444c(jSONObject);
                    }
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject.optJSONArray("list");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i12 = 0; i12 < length; i12++) {
                            C3000l0 m108750B0 = AbstractC20826v0.m108750B0(optJSONArray.getJSONObject(i12));
                            if (m108750B0 != null) {
                                m108750B0.m14350o1();
                                if (m108750B0.m14349o()) {
                                    arrayList.add(m108750B0);
                                }
                            }
                        }
                    }
                    AbstractC27241b.m139381b("10000005").m139377b();
                    AbstractC27241b.m139381b("10000006").m139379d();
                    if (i11 == 3 || i11 == 2 || i11 == 1 || i11 == 0) {
                        z11 = true;
                    }
                    C26877a c26877a2 = C26877a.f127182a;
                    AbstractC19074t.m100205c(jSONObject);
                    c26877a2.m138446f(jSONObject, z11, this.f117462a, this.f117465d.m127227j(jSONObject));
                    c26877a2.m138443b(jSONObject, this.f117462a);
                    if (arrayList.size() > 0) {
                        C24906b.f119505a.m129545D(arrayList, C32002l4.Companion.m154287a(10002));
                    }
                    AbstractC27241b.m139381b("10000006").m139377b();
                    c26877a2.m138447g(this.f117462a, System.currentTimeMillis());
                    Continuation continuation = this.f117463b;
                    C24861r.a aVar = C24861r.f119264q;
                    AbstractC19074t.m100205c(optString);
                    continuation.mo112492g(C24861r.m129218b(new C24358g(i11, arrayList, optBoolean, j11, optString)));
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    Continuation continuation2 = this.f117463b;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
                }
                AbstractC27241b.m139381b("10000003").m139377b();
            } catch (Throwable th2) {
                AbstractC27241b.m139381b("10000003").m139377b();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117468q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.f117468q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f117468q;
        }
    }

    /* renamed from: oo.b$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f117470b;

        /* renamed from: c */
        final /* synthetic */ Continuation f117471c;

        h(String str, Continuation continuation) {
            this.f117470b = str;
            this.f117471c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C24348b.this.m127226i("removeHiddenListUser Error " + this.f117470b + " " + c20096c);
            Continuation continuation = this.f117471c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeed(c20096c))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C24348b.this.m127226i("removeHiddenListUser Success " + this.f117470b);
                Continuation continuation = this.f117471c;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation2 = this.f117471c;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
            }
        }
    }

    /* renamed from: oo.b$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f117473b;

        /* renamed from: c */
        final /* synthetic */ Continuation f117474c;

        i(String str, Continuation continuation) {
            this.f117473b = str;
            this.f117474c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C24348b.this.m127226i("untagFeed Error " + this.f117473b + " " + c20096c);
            Continuation continuation = this.f117474c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeed(c20096c))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C24348b.this.m127226i("untagFeed Success " + this.f117473b);
                Continuation continuation = this.f117474c;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation2 = this.f117474c;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionFeedAPI(null, 1, null))));
            }
        }
    }

    /* renamed from: d */
    private final String m127224d(String str, String str2, long j11, long j12, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("last_feed_id_server", str);
        jSONObject.put("last_feed_id_local", str2);
        jSONObject.put("feed_version", j11);
        jSONObject.put("max_feed_id", j12);
        jSONObject.put("page", i11);
        jSONObject.put("tab", i12);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: g */
    private final boolean m127225g(String str, String str2, int i11) {
        Long m127109o;
        Long m127109o2;
        boolean z11;
        m127109o = AbstractC24340u.m127109o(str);
        m127109o2 = AbstractC24340u.m127109o(str2);
        if (m127109o != null && m127109o2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i11 > 0 && m127109o != null && m127109o.longValue() == 0) {
            return true;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m127226i(String str) {
        C26359h.f125209a.mo135685a("FEED_TIMELINE", "FEED_API", new g(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m127227j(JSONObject jSONObject) {
        try {
            if (jSONObject.has("update_sug")) {
                if (AbstractC18069a.m96085d(jSONObject, "update_sug") != 1) {
                    return false;
                }
                return true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return false;
    }

    /* renamed from: l */
    private final void m127228l(String str) {
        AbstractC22490a.m116281d("invalid params get feed: " + str);
        AbstractC20110a.f98889a.mo104552e(new b());
    }

    /* renamed from: c */
    public final Object m127229c(List list, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(list, c27317h));
        m127226i("addHiddenListUser " + list);
        c0766k.mo1400C3(list.toString(), trackingSource);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m139856a == m142578e2) {
            return m139856a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: e */
    public final Object m127230e(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        d dVar = new d(str, c27317h);
        m127226i("deleteFeed " + str);
        c0766k.mo1704o8(dVar);
        c0766k.mo1505P3(str);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m139856a == m142578e2) {
            return m139856a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f */
    public final Object m127231f(List list, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        e eVar = new e(c27317h);
        m127226i("deleteMultiFeed " + list);
        c0766k.mo1704o8(eVar);
        c0766k.mo1767w7(list);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:            r2 = on0.AbstractC24340u.m127109o(r26);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:            r0 = on0.AbstractC24340u.m127109o(r25);     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127232h(int i11, String str, String str2, long j11, long j12, int i12, Continuation continuation) {
        Continuation m142576c;
        Long m127109o;
        long longValue;
        Long m127109o2;
        long longValue2;
        long j13;
        int i13;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionFeedNetwork.f46209q)));
        } else {
            C0766k c0766k = new C0766k();
            f fVar = new f(i11, c27317h, i12, this, str, str2);
            String m127224d = m127224d(str, str2, j12, j11, i12, i11);
            String str3 = " ------- Getting feed --------\n" + m127224d;
            AbstractC19074t.m100207e(str3, "toString(...)");
            m127226i(str3);
            C25487t c25487t = C25487t.f122084a;
            int m132030c = c25487t.m132026a().m132030c();
            c25487t.m132027b();
            boolean m127225g = m127225g(str, str2, i12);
            if (m127225g) {
                m127228l(m127224d);
            }
            if (m127225g || m127109o == null) {
                longValue = 0;
            } else {
                longValue = m127109o.longValue();
            }
            if (m127225g || m127109o2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = m127109o2.longValue();
            }
            if (m127225g) {
                j13 = 0;
            } else {
                j13 = j12;
            }
            if (m127225g) {
                i13 = 0;
            } else {
                i13 = i12;
            }
            c0766k.mo1704o8(fVar);
            c0766k.mo1703o7(i11, longValue, longValue2, j11, j13, i13, m132030c);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: k */
    public final Object m127233k(String str, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h(str, c27317h));
        m127226i("removeHiddenListUser " + str);
        c0766k.mo1600ab(str, trackingSource);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m139856a == m142578e2) {
            return m139856a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: m */
    public final Object m127234m(String str, List list, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i(str, c27317h));
        m127226i("untagFeed " + str);
        c0766k.mo1438G9(str, list);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m139856a == m142578e2) {
            return m139856a;
        }
        return C24848g0.f119245a;
    }
}
