package kp;

import ae.C0766k;
import com.zing.zalo.feed.mvp.likedetail.model.ExceptionGetLikeDetail;
import com.zing.zalo.feed.mvp.likedetail.model.ExceptionLikeDetailErrorNetwork;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.List;
import jp.C21337a;
import jp.C21338b;
import kotlin.coroutines.Continuation;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: kp.c */
/* loaded from: classes4.dex */
public final class C21907c implements InterfaceC21905a {

    /* renamed from: kp.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f107674a;

        /* renamed from: b */
        final /* synthetic */ int f107675b;

        /* renamed from: c */
        final /* synthetic */ Continuation f107676c;

        a(List list, int i11, Continuation continuation) {
            this.f107674a = list;
            this.f107675b = i11;
            this.f107676c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Continuation continuation = this.f107676c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetLikeDetail.f46296p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            try {
                C21337a c21337a = new C21337a(null, 0, null, null, null, 0, 0, 0, null, false, 1023, null);
                if (!this.f107674a.isEmpty()) {
                    str = (String) this.f107674a.get(0);
                } else {
                    str = "";
                }
                c21337a.m110521n(str);
                c21337a.m110525r(this.f107675b);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    c21337a.m110527t(optJSONObject.optInt("total_like", 0));
                    JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            c21337a.m110515h().add(new LikeContactItem(optJSONArray.getJSONObject(i11)));
                        }
                    }
                    c21337a.m110523p(optJSONObject.optBoolean("lmore"));
                    String optString = optJSONObject.optString("last_uid");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    c21337a.m110524q(optString);
                }
                this.f107676c.mo112492g(C24861r.m129218b(c21337a));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation = this.f107676c;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetLikeDetail.f46296p)));
            }
        }
    }

    /* renamed from: kp.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f107678b;

        /* renamed from: c */
        final /* synthetic */ int f107679c;

        /* renamed from: d */
        final /* synthetic */ Continuation f107680d;

        b(String str, int i11, Continuation continuation) {
            this.f107678b = str;
            this.f107679c = i11;
            this.f107680d = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Continuation continuation = this.f107680d;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetLikeDetail.f46296p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C21907c c21907c = C21907c.this;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                C21338b m114142e = c21907c.m114142e((JSONObject) obj);
                m114142e.m110539l(this.f107678b);
                m114142e.m110541n(this.f107679c);
                this.f107680d.mo112492g(C24861r.m129218b(m114142e));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation = this.f107680d;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetLikeDetail.f46296p)));
            }
        }
    }

    /* renamed from: kp.c$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f107682b;

        /* renamed from: c */
        final /* synthetic */ int f107683c;

        /* renamed from: d */
        final /* synthetic */ Continuation f107684d;

        c(String str, int i11, Continuation continuation) {
            this.f107682b = str;
            this.f107683c = i11;
            this.f107684d = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Continuation continuation = this.f107684d;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetLikeDetail.f46296p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C21907c c21907c = C21907c.this;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                C21338b m114142e = c21907c.m114142e((JSONObject) obj);
                m114142e.m110539l(this.f107682b);
                m114142e.m110541n(this.f107683c);
                this.f107684d.mo112492g(C24861r.m129218b(m114142e));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation = this.f107684d;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetLikeDetail.f46296p)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final C21338b m114142e(JSONObject jSONObject) {
        C21338b c21338b = new C21338b(null, 0, null, 0, null, false, 0, 127, null);
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            c21338b.m110542o(optJSONObject.optInt("total_like", 0));
            JSONArray optJSONArray = optJSONObject.optJSONArray("list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    c21338b.m110534g().add(new LikeContactItem(optJSONArray.getJSONObject(i11)));
                }
            }
            c21338b.m110538k(optJSONObject.optBoolean("lmore"));
            String optString = optJSONObject.optString("last_uid");
            AbstractC19074t.m100207e(optString, "optString(...)");
            c21338b.m110540m(optString);
        }
        return c21338b;
    }

    @Override // kp.InterfaceC21905a
    /* renamed from: a */
    public Object mo114135a(List list, int i11, String str, String str2, int i12, int i13, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionLikeDetailErrorNetwork.f46297p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(list, i12, c27317h));
            c0766k.mo1553V3(list, i11, str, str2, i12, i13);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // kp.InterfaceC21905a
    /* renamed from: b */
    public Object mo114136b(String str, int i11, int i12, String str2, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionLikeDetailErrorNetwork.f46297p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(str, i12, c27317h));
            c0766k.mo1644g7(str, i11, i12, str2);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // kp.InterfaceC21905a
    /* renamed from: c */
    public Object mo114137c(String str, int i11, int i12, String str2, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionLikeDetailErrorNetwork.f46297p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(str, i12, c27317h));
            c0766k.mo1786y9(str, i11, i12, str2);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
