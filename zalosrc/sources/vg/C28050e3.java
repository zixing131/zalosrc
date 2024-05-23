package vg;

import ag0.AbstractC0837p0;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.zing.zalo.zlottie.widget.C17291a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.AbstractC23193r0;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p566v3.C27508p;
import p588vw.C28652r;
import tg.C26657h;
import tg.C26674y;
import vg.C28050e3;
import vg.C28092i5;

/* renamed from: vg.e3 */
/* loaded from: classes.dex */
public class C28050e3 {

    /* renamed from: a */
    Map f130924a;

    /* renamed from: b */
    Map f130925b;

    /* renamed from: c */
    Map f130926c;

    /* renamed from: d */
    Map f130927d;

    /* renamed from: e */
    Map f130928e;

    /* renamed from: f */
    boolean f130929f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.e3$a */
    /* loaded from: classes.dex */
    public class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: vg.e3$b */
    /* loaded from: classes3.dex */
    public class b extends LinkedHashMap {
        b() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: vg.e3$c */
    /* loaded from: classes3.dex */
    public enum c {
        KEYFRAMES_EMOJI,
        LOTTIE_EMOJI
    }

    /* renamed from: vg.e3$d */
    /* loaded from: classes3.dex */
    public class d implements C26674y.b {

        /* renamed from: a */
        String f130935a;

        /* renamed from: b */
        String f130936b;

        /* renamed from: c */
        int f130937c;

        /* renamed from: vg.e3$d$a */
        /* loaded from: classes3.dex */
        class a implements C28092i5.a {
            a() {
            }

            @Override // vg.C28092i5.a
            /* renamed from: a */
            public void mo141505a(C27508p c27508p) {
            }

            @Override // vg.C28092i5.a
            /* renamed from: b */
            public void mo141506b() {
            }

            @Override // vg.C28092i5.a
            /* renamed from: c */
            public void mo141507c() {
            }

            @Override // vg.C28092i5.a
            /* renamed from: d */
            public void mo141508d(C27508p c27508p, String str) {
                if (!d.this.f130935a.equals(str)) {
                    return;
                }
                C28050e3.this.f130924a.put(str, c27508p);
                Map map = C28050e3.this.f130928e;
                if (map != null && map.containsKey(str)) {
                    for (e eVar : (List) C28050e3.this.f130928e.remove(str)) {
                        if (eVar != null) {
                            eVar.mo76136a(str, C28092i5.m141562c().m141565e(c27508p), c.KEYFRAMES_EMOJI);
                        }
                    }
                }
            }
        }

        public d(String str, String str2, int i11) {
            this.f130935a = str;
            this.f130936b = str2;
            this.f130937c = i11;
        }

        /* renamed from: c */
        public /* synthetic */ void m141504c(String str, String str2) {
            Map map = C28050e3.this.f130928e;
            if (map != null && map.containsKey(this.f130935a)) {
                for (e eVar : (List) C28050e3.this.f130928e.remove(this.f130935a)) {
                    if (eVar != null) {
                        eVar.mo76136a(this.f130935a, C28050e3.this.m141491c(str, str2, this.f130937c), c.LOTTIE_EMOJI);
                    }
                }
            }
        }

        @Override // tg.C26674y.b
        /* renamed from: a */
        public void mo15759a(int i11, String str, String str2, C26657h c26657h) {
            if (!this.f130936b.equals(str)) {
                return;
            }
            if (i11 != 0) {
                List<e> list = (List) C28050e3.this.f130928e.remove(this.f130935a);
                if (list != null) {
                    for (e eVar : list) {
                        if (eVar != null) {
                            eVar.mo76136a(this.f130935a, null, c.KEYFRAMES_EMOJI);
                        }
                    }
                    return;
                }
                return;
            }
            try {
                int i12 = c26657h.f126157b;
                if (i12 == 11) {
                    C28092i5.m141562c().m141564b(str2, str2 + "/script_kf.json", this.f130935a, new a());
                } else if (i12 == 14) {
                    String str3 = str2 + "/data.json";
                    C28050e3.this.f130925b.put(this.f130935a, str3);
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.f3

                        /* renamed from: q */
                        public final /* synthetic */ String f130958q;

                        /* renamed from: r */
                        public final /* synthetic */ String f130959r;

                        public /* synthetic */ RunnableC28060f3(String str4, String str32) {
                            r2 = str4;
                            r3 = str32;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C28050e3.d.this.m141504c(r2, r3);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.e3$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        void mo76136a(String str, Drawable drawable, c cVar);
    }

    /* renamed from: vg.e3$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        static final C28050e3 f130940a = new C28050e3();
    }

    /* synthetic */ C28050e3(AbstractC28070g3 abstractC28070g3) {
        this();
    }

    /* renamed from: l */
    public static C28050e3 m141486l() {
        return f.f130940a;
    }

    /* renamed from: o */
    public /* synthetic */ void m141487o() {
        this.f130929f = true;
        String m120960G1 = AbstractC23309i.m120960G1();
        if (!TextUtils.isEmpty(m120960G1)) {
            try {
                m141501n(new JSONObject(m120960G1));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        String m120997H1 = AbstractC23309i.m120997H1();
        if (!TextUtils.isEmpty(m120997H1)) {
            try {
                AbstractC28245z3.m142220c(new JSONObject(m120997H1));
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m141488p(String str, d dVar, boolean z11) {
        try {
            C26674y.m136865t().m136878o(str, System.currentTimeMillis() + "", dVar, z11, (byte) 1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    private void m141489q(String str, String str2, int i11, e eVar) {
        m141490r(str, str2, i11, eVar, true);
    }

    /* renamed from: r */
    private void m141490r(String str, String str2, int i11, e eVar, boolean z11) {
        if (!AbstractC23309i.m122610yb()) {
            return;
        }
        if (this.f130928e.containsKey(str)) {
            ((List) this.f130928e.get(str)).add(eVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        this.f130928e.put(str, arrayList);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.c3

            /* renamed from: p */
            public final /* synthetic */ String f130879p;

            /* renamed from: q */
            public final /* synthetic */ C28050e3.d f130880q;

            /* renamed from: r */
            public final /* synthetic */ boolean f130881r;

            public /* synthetic */ RunnableC28030c3(String str22, C28050e3.d dVar, boolean z112) {
                r1 = str22;
                r2 = dVar;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28050e3.m141488p(r1, r2, r3);
            }
        });
    }

    /* renamed from: c */
    C17291a m141491c(String str, String str2, int i11) {
        C17291a c17291a = new C17291a(new File(str2), "emoji_lottie_" + str, i11, i11, !AbstractC23193r0.m119506o(), false);
        c17291a.m92215V(C17291a.g.INFINITE);
        return c17291a;
    }

    /* renamed from: d */
    public boolean m141492d(String str) {
        Map map = this.f130924a;
        if (map != null && map.containsKey(str) && this.f130924a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m141493e(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        if (!m141492d(lowerCase) && !m141494f(lowerCase)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m141494f(String str) {
        Map map = this.f130925b;
        if (map != null && map.containsKey(str) && this.f130925b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public Drawable m141495g(String str, int i11) {
        String lowerCase = str.toLowerCase(Locale.US);
        if (m141493e(str)) {
            if (m141492d(lowerCase)) {
                return C28092i5.m141562c().m141565e((C27508p) this.f130924a.get(lowerCase));
            }
            if (m141494f(lowerCase)) {
                return m141491c((String) this.f130926c.get(lowerCase), (String) this.f130925b.get(lowerCase), AbstractC23136l9.m118742r(i11));
            }
            return null;
        }
        return null;
    }

    /* renamed from: h */
    public void m141496h(String str, int i11, e eVar) {
        m141497i(str, i11, eVar, true);
    }

    /* renamed from: i */
    public void m141497i(String str, int i11, e eVar, boolean z11) {
        String str2;
        try {
            String m115155o = AbstractC22055v0.m115155o(str);
            if (m141493e(m115155o)) {
                if (eVar != null) {
                    if (m141492d(m115155o)) {
                        eVar.mo76136a(m115155o, C28092i5.m141562c().m141565e((C27508p) this.f130924a.get(m115155o)), c.KEYFRAMES_EMOJI);
                    } else if (m141494f(m115155o)) {
                        eVar.mo76136a(m115155o, m141491c((String) this.f130926c.get(m115155o), (String) this.f130925b.get(m115155o), AbstractC23136l9.m118742r(i11)), c.LOTTIE_EMOJI);
                    }
                }
            } else {
                eVar.mo76136a(m115155o, C28652r.m143349v().m143375n(m115155o, i11), c.KEYFRAMES_EMOJI);
                if (TextUtils.isEmpty(m115155o)) {
                    str2 = str;
                } else {
                    str2 = m115155o;
                }
                m141490r(str2, str, AbstractC23136l9.m118742r(i11), eVar, z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public void m141498j(String str, int i11, e eVar) {
        String lowerCase = str.toLowerCase(Locale.US);
        try {
            if (m141493e(str)) {
                if (eVar != null) {
                    if (m141492d(lowerCase)) {
                        eVar.mo76136a(lowerCase, C28092i5.m141562c().m141565e((C27508p) this.f130924a.get(lowerCase)), c.KEYFRAMES_EMOJI);
                    } else if (m141494f(lowerCase)) {
                        eVar.mo76136a(lowerCase, m141491c((String) this.f130926c.get(lowerCase), (String) this.f130925b.get(lowerCase), AbstractC23136l9.m118742r(i11)), c.LOTTIE_EMOJI);
                    }
                }
            } else {
                Map map = this.f130926c;
                if (map != null && map.containsKey(lowerCase)) {
                    m141489q(lowerCase, (String) this.f130926c.get(lowerCase), AbstractC23136l9.m118742r(i11), eVar);
                }
            }
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    /* renamed from: k */
    public String m141499k(String str) {
        return (String) this.f130927d.get(str);
    }

    /* renamed from: m */
    public void m141500m() {
        if (this.f130929f) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.d3
            public /* synthetic */ RunnableC28040d3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28050e3.this.m141487o();
            }
        });
    }

    /* renamed from: n */
    public void m141501n(JSONObject jSONObject) {
        this.f130929f = true;
        this.f130926c = Collections.synchronizedMap(new HashMap());
        this.f130927d = Collections.synchronizedMap(new HashMap());
        this.f130925b = Collections.synchronizedMap(new HashMap());
        this.f130924a = Collections.synchronizedMap(new b());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                int i11 = jSONObject.getInt(next);
                if (i11 > 0) {
                    String lowerCase = next.toLowerCase(Locale.US);
                    this.f130926c.put(lowerCase, i11 + "");
                    this.f130927d.put(i11 + "", lowerCase);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    private C28050e3() {
        this.f130926c = null;
        this.f130927d = null;
        this.f130929f = false;
        this.f130924a = Collections.synchronizedMap(new a());
        this.f130925b = Collections.synchronizedMap(new HashMap());
        this.f130928e = Collections.synchronizedMap(new HashMap());
        this.f130929f = false;
    }
}
