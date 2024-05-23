package c30;

import ae.C0766k;
import ae.InterfaceC0765j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fi.C18953k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gi.EnumC19449b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p683yj.AbstractC30996a;
import p683yj.C30997b;
import p716zh.C31902e9;
import p716zh.C31917f9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import v30.C27517h;

/* renamed from: c30.e */
/* loaded from: classes5.dex */
public final class C3237e extends Thread {

    /* renamed from: p */
    private final String f13822p;

    /* renamed from: q */
    private final AbstractC30996a f13823q;

    /* renamed from: r */
    private final boolean f13824r;

    /* renamed from: s */
    private final C30997b.c f13825s;

    /* renamed from: t */
    private final a f13826t;

    /* renamed from: u */
    private final InterfaceC24854k f13827u;

    /* renamed from: v */
    private final InterfaceC24854k f13828v;

    /* renamed from: c30.e$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo16447a(int i11, C31917f9 c31917f9);
    }

    /* renamed from: c30.e$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f13830b;

        b(String str) {
            this.f13830b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C3237e.this.m16440d(-1, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                EnumC19449b m101747a = EnumC19449b.Companion.m101747a(jSONObject.optInt("layoutType", -1));
                String optString = jSONObject.optString("layoutTitle");
                JSONArray jSONArray = jSONObject.getJSONArray("suggestion");
                long optLong = jSONObject.optLong("expired_time");
                C18953k.a aVar = C18953k.Companion;
                AbstractC19074t.m100205c(jSONArray);
                List m99427h = aVar.m99427h(jSONArray);
                if (!m99427h.isEmpty() && optLong >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3237e c3237e = C3237e.this;
                if (!z11) {
                    throw new IllegalArgumentException(("sticker list is null by kwd: " + c3237e.f13823q).toString());
                }
                String str = this.f13830b;
                AbstractC30996a abstractC30996a = c3237e.f13823q;
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                c3237e.m16445i(str, abstractC30996a, jSONObject2, C18953k.e.f94578q);
                C3237e.this.m16440d(0, new C31917f9(m99427h, m101747a, optString));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                C3237e.this.m16440d(-1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.e$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f13831q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18953k mo12V4() {
            return AbstractC23306f.m120729y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.e$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f13832q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C27517h mo12V4() {
            return AbstractC23306f.m120576E1();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3237e(AbstractC30996a abstractC30996a, boolean z11, C30997b.c cVar, a aVar) {
        this(null, abstractC30996a, z11, cVar, aVar, 1, null);
        AbstractC19074t.m100208f(abstractC30996a, "mSuggestKeyword");
        AbstractC19074t.m100208f(cVar, "userInputData");
        AbstractC19074t.m100208f(aVar, "mListener");
    }

    /* renamed from: d */
    public final void m16440d(int i11, C31917f9 c31917f9) {
        this.f13826t.mo16447a(i11, c31917f9);
    }

    /* renamed from: e */
    private final void m16441e(InterfaceC0765j interfaceC0765j, AbstractC30996a abstractC30996a) {
        if (abstractC30996a.mo150663g() == 1) {
            interfaceC0765j.mo1763w3(abstractC30996a.m150661e());
            return;
        }
        AbstractC19074t.m100206d(abstractC30996a, "null cannot be cast to non-null type com.zing.zalo.data.entity.chat.suggestion.SuggestKeyword");
        C30997b c30997b = (C30997b) abstractC30996a;
        interfaceC0765j.mo1494N8(c30997b.m150661e(), c30997b.m150669l().m150687k(), c30997b.m150669l().m150683g(), c30997b.m150669l().m150681e()[0], c30997b.m150669l().m150680d(), c30997b.m150669l().m150679c()[0], c30997b.m150669l().m150686j(), c30997b.m150669l().m150685i(), c30997b.m150669l().m150684h()[0]);
    }

    /* renamed from: f */
    private final C31917f9 m16442f(AbstractC30996a abstractC30996a, C18953k.e eVar) {
        int mo150663g = abstractC30996a.mo150663g();
        if (mo150663g != 0) {
            if (mo150663g != 1) {
                return null;
            }
            return C7960e.m41971c6().m42379e7(abstractC30996a.m150658b(), eVar);
        }
        C7960e m41971c6 = C7960e.m41971c6();
        AbstractC19074t.m100206d(abstractC30996a, "null cannot be cast to non-null type com.zing.zalo.data.entity.chat.suggestion.SuggestKeyword");
        return m41971c6.m42293V6((C30997b) abstractC30996a, eVar);
    }

    /* renamed from: g */
    private final C18953k m16443g() {
        return (C18953k) this.f13827u.getValue();
    }

    /* renamed from: h */
    private final C27517h m16444h() {
        return (C27517h) this.f13828v.getValue();
    }

    /* renamed from: i */
    public final void m16445i(String str, AbstractC30996a abstractC30996a, String str2, C18953k.e eVar) {
        int mo150663g = abstractC30996a.mo150663g();
        if (mo150663g != 0) {
            if (mo150663g == 1) {
                C7960e.m41971c6().m42476n9(str, str2, eVar);
                return;
            }
            return;
        }
        C7960e.m41971c6().m42381e9(str, str2, eVar);
    }

    /* renamed from: j */
    private final JSONObject m16446j(List list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C31902e9) it.next()).m153308B());
        }
        jSONObject.put("layoutType", EnumC19449b.f96542q.m101746d());
        jSONObject.put("layoutTitle", "");
        jSONObject.put("suggestion", jSONArray);
        return jSONObject;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C18953k.e eVar;
        try {
            String m150661e = this.f13823q.m150661e();
            AbstractC19074t.m100207e(m150661e, "getKeyword(...)");
            if (m150661e.length() > 0) {
                String m150658b = this.f13823q.m150658b();
                AbstractC19074t.m100207e(m150658b, "generateKey(...)");
                if (this.f13824r) {
                    eVar = C18953k.e.f94579r;
                } else {
                    eVar = C18953k.e.f94578q;
                }
                C31917f9 m16442f = m16442f(this.f13823q, eVar);
                if (m16442f != null && m16442f.f146629a.size() > 0) {
                    m16440d(0, m16442f);
                    return;
                }
                if (this.f13824r) {
                    C18953k m16443g = m16443g();
                    String m150661e2 = this.f13823q.m150661e();
                    AbstractC19074t.m100207e(m150661e2, "getKeyword(...)");
                    List m99381D = m16443g.m99381D(m150661e2, this.f13825s);
                    m16444h().m140707U(this.f13822p, m99381D);
                    if (m99381D.size() > 0) {
                        JSONObject m16446j = m16446j(m99381D);
                        AbstractC30996a abstractC30996a = this.f13823q;
                        String jSONObject = m16446j.toString();
                        AbstractC19074t.m100207e(jSONObject, "toString(...)");
                        m16445i(m150658b, abstractC30996a, jSONObject, C18953k.e.f94579r);
                        m16440d(0, new C31917f9(m99381D, EnumC19449b.f96542q));
                        return;
                    }
                    m16440d(-1, null);
                    return;
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b(m150658b));
                m16441e(c0766k, this.f13823q);
                return;
            }
            throw new IllegalArgumentException("Keyword is empty".toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            m16440d(-1, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3237e(String str, AbstractC30996a abstractC30996a, boolean z11, C30997b.c cVar, a aVar, int i11, AbstractC19060k abstractC19060k) {
        this(str, abstractC30996a, z11, cVar, aVar);
        if ((i11 & 1) != 0) {
            str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3237e(String str, AbstractC30996a abstractC30996a, boolean z11, C30997b.c cVar, a aVar) {
        super("Z:GetSuggestStickersTask");
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(str, "currentUid");
        AbstractC19074t.m100208f(abstractC30996a, "mSuggestKeyword");
        AbstractC19074t.m100208f(cVar, "userInputData");
        AbstractC19074t.m100208f(aVar, "mListener");
        this.f13822p = str;
        this.f13823q = abstractC30996a;
        this.f13824r = z11;
        this.f13825s = cVar;
        this.f13826t = aVar;
        m129210a = AbstractC24856m.m129210a(c.f13831q);
        this.f13827u = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f13832q);
        this.f13828v = m129210a2;
    }
}
