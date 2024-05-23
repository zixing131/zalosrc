package j50;

import ae.C0766k;
import am.C0927o;
import android.text.TextUtils;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneLoadInfo;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneNotFound;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionSearchRingtone;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k50.C21473a;
import k50.C21475c;
import k50.C21476d;
import k50.C21477e;
import kotlin.coroutines.Continuation;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p399op.C24401m;
import p588vw.C28647m;
import p588vw.C28655u;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: j50.g */
/* loaded from: classes5.dex */
public final class C20927g implements InterfaceC20921a {

    /* renamed from: j50.g$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f102788a;

        /* renamed from: b */
        final /* synthetic */ C20927g f102789b;

        a(Continuation continuation, C20927g c20927g) {
            this.f102788a = continuation;
            this.f102789b = c20927g;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() != 1001) {
                this.f102789b.m109456e(this.f102788a);
                return;
            }
            Continuation continuation = this.f102788a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingtoneNotFound.f56347p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && jSONObject.optInt("error_code") != 1001) {
                    this.f102788a.mo112492g(C24861r.m129218b(new C21475c(jSONObject.optJSONObject("data"))));
                } else {
                    Continuation continuation = this.f102788a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingtoneNotFound.f56347p)));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f102789b.m109456e(this.f102788a);
            }
        }
    }

    /* renamed from: j50.g$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f102790a;

        /* renamed from: b */
        final /* synthetic */ String f102791b;

        /* renamed from: c */
        final /* synthetic */ C20927g f102792c;

        b(Continuation continuation, String str, C20927g c20927g) {
            this.f102790a = continuation;
            this.f102791b = str;
            this.f102792c = c20927g;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() != 1001) {
                this.f102792c.m109456e(this.f102790a);
                return;
            }
            Continuation continuation = this.f102790a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingtoneNotFound.f56347p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                String optString = ((JSONObject) obj).optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                if (TextUtils.isEmpty(optString)) {
                    this.f102792c.m109456e(this.f102790a);
                } else {
                    Continuation continuation = this.f102790a;
                    C24861r.a aVar = C24861r.f119264q;
                    String str = this.f102791b;
                    AbstractC19074t.m100205c(optString);
                    continuation.mo112492g(C24861r.m129218b(new C21477e(str, optString, 0L, 0, 12, null)));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f102792c.m109456e(this.f102790a);
            }
        }
    }

    /* renamed from: j50.g$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f102793a;

        c(Continuation continuation) {
            this.f102793a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Continuation continuation = this.f102793a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchRingtone.f56349p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("songs");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("categories");
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (optJSONArray2 != null) {
                        int length = optJSONArray2.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                AbstractC19074t.m100205c(optJSONObject2);
                                C21473a c21473a = new C21473a(optJSONObject2);
                                arrayList.add(c21473a);
                                linkedHashMap.put(Integer.valueOf(c21473a.m111074f()), c21473a);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray != null) {
                        int length2 = optJSONArray.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i12);
                            if (optJSONObject3 != null) {
                                AbstractC19074t.m100205c(optJSONObject3);
                                Object opt = optJSONObject3.opt("cate");
                                C21475c c21475c = new C21475c(optJSONObject3);
                                arrayList2.add(c21475c);
                                C21473a c21473a2 = (C21473a) linkedHashMap.get(opt);
                                if (c21473a2 != null) {
                                    c21473a2.m111070a(c21475c);
                                }
                            }
                        }
                    }
                    Continuation continuation = this.f102793a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C20925e(arrayList, arrayList2)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Continuation continuation2 = this.f102793a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchRingtone.f56349p)));
        }
    }

    /* renamed from: j50.g$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f102794a;

        /* renamed from: b */
        final /* synthetic */ int f102795b;

        d(Continuation continuation, int i11) {
            this.f102794a = continuation;
            this.f102795b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Continuation continuation = this.f102794a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchRingtone.f56349p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    boolean z11 = true;
                    if (optJSONObject.optInt("hasMore") != 1) {
                        z11 = false;
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("songs");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                AbstractC19074t.m100205c(optJSONObject2);
                                arrayList.add(new C21475c(optJSONObject2));
                            }
                        }
                    }
                    Continuation continuation = this.f102794a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C20926f(arrayList, this.f102795b, z11)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Continuation continuation2 = this.f102794a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchRingtone.f56349p)));
        }
    }

    /* renamed from: j50.g$e */
    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f102796a;

        /* renamed from: b */
        final /* synthetic */ String f102797b;

        /* renamed from: c */
        final /* synthetic */ C20927g f102798c;

        e(Continuation continuation, String str, C20927g c20927g) {
            this.f102796a = continuation;
            this.f102797b = str;
            this.f102798c = c20927g;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f102798c.m109456e(this.f102796a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            arrayList.add(new C21475c(optJSONObject));
                        }
                    }
                    Continuation continuation = this.f102796a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C21476d(this.f102797b, arrayList)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f102798c.m109456e(this.f102796a);
        }
    }

    /* renamed from: j50.g$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f102799a;

        /* renamed from: b */
        final /* synthetic */ C20927g f102800b;

        f(Continuation continuation, C20927g c20927g) {
            this.f102799a = continuation;
            this.f102800b = c20927g;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f102800b.m109456e(this.f102799a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            Continuation continuation = this.f102799a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* renamed from: d */
    private final int m109455d() {
        try {
            C28655u c28655u = (C28655u) C28647m.m143325c().m143328b().get(C24401m.f117816a.m127633f());
            if (c28655u != null) {
                String str = c28655u.f132865c;
                AbstractC19074t.m100207e(str, "countrycode");
                return Integer.parseInt(str);
            }
            return 84;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 84;
        }
    }

    /* renamed from: e */
    public final void m109456e(Continuation continuation) {
        C24861r.a aVar = C24861r.f119264q;
        continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingtoneLoadInfo.f56346p)));
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: a */
    public Object mo105981a(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(c27317h));
            c0766k.mo1435G6(20);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: b */
    public Object mo105982b(int i11, int i12, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(c27317h, i12));
            c0766k.mo1742t6(i11, 20, i12, true);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: f */
    public Object mo105986f(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(c27317h, this));
            c0766k.mo1611c6(str, 0, true);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: h */
    public Object mo105988h(String str, int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new e(c27317h, str, this));
            c0766k.mo1548U6(str, 0, i11, m109455d(), true);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: i */
    public Object mo105989i(String str, String str2, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(c27317h, str, this));
            c0766k.mo1723r3(str2);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // j50.InterfaceC20921a
    /* renamed from: k */
    public Object mo105991k(int i11, String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(c27317h, this));
            c0766k.mo1712p8(i11, str);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
