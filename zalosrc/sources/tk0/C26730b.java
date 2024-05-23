package tk0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tk0.C26729a;

/* renamed from: tk0.b */
/* loaded from: classes7.dex */
public final class C26730b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Map f126771a;

    /* renamed from: b */
    private final int f126772b;

    /* renamed from: tk0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26730b m137487a(Map map, int i11) {
            if (i11 == 0) {
                return null;
            }
            if (map == null) {
                map = new HashMap();
            }
            return new C26730b(map, i11, null);
        }
    }

    public /* synthetic */ C26730b(Map map, int i11, AbstractC19060k abstractC19060k) {
        this(map, i11);
    }

    /* renamed from: d */
    public static final C26730b m137483d(Map map, int i11) {
        return Companion.m137487a(map, i11);
    }

    /* renamed from: a */
    public final boolean m137484a(String str) {
        AbstractC19074t.m100208f(str, "action");
        Map map = this.f126771a;
        C26729a.a aVar = C26729a.Companion;
        boolean containsKey = map.containsKey(Integer.valueOf(aVar.m137480b().m137477e()));
        if (aVar.m137481c().m137478f() > this.f126772b) {
            return true;
        }
        if (containsKey || this.f126771a.containsKey(Integer.valueOf(aVar.m137481c().m137477e()))) {
            String str2 = (String) this.f126771a.get(Integer.valueOf(aVar.m137481c().m137477e()));
            if (str2 == null || str2.length() == 0) {
                return true;
            }
            try {
                JSONArray jSONArray = new JSONObject(str2).getJSONArray("data");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    if (AbstractC19074t.m100204b(str, jSONArray.getString(i11))) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m137485b(String str) {
        AbstractC19074t.m100208f(str, "action");
        C26729a.a aVar = C26729a.Companion;
        if (aVar.m137479a().m137478f() > this.f126772b) {
            return true;
        }
        if (this.f126771a.containsKey(Integer.valueOf(aVar.m137479a().m137477e()))) {
            String str2 = (String) this.f126771a.get(Integer.valueOf(aVar.m137479a().m137477e()));
            if (str2 == null || str2.length() == 0) {
                return true;
            }
            try {
                JSONArray jSONArray = new JSONObject(str2).getJSONArray("data");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    if (AbstractC19074t.m100204b(str, jSONArray.getString(i11))) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m137486c(String str) {
        AbstractC19074t.m100208f(str, "action");
        Map map = this.f126771a;
        C26729a.a aVar = C26729a.Companion;
        boolean containsKey = map.containsKey(Integer.valueOf(aVar.m137480b().m137477e()));
        if (aVar.m137482d().m137478f() > this.f126772b) {
            return true;
        }
        if (containsKey || this.f126771a.containsKey(Integer.valueOf(aVar.m137482d().m137477e()))) {
            String str2 = (String) this.f126771a.get(Integer.valueOf(aVar.m137482d().m137477e()));
            if (str2 == null || str2.length() == 0) {
                return true;
            }
            try {
                JSONArray jSONArray = new JSONObject(str2).getJSONArray("data");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    if (AbstractC19074t.m100204b(str, jSONArray.getString(i11))) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return false;
    }

    private C26730b(Map map, int i11) {
        this.f126771a = map;
        this.f126772b = i11;
    }
}
