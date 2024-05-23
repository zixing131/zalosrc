package p647xj;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: xj.c */
/* loaded from: classes3.dex */
public final class C29677c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private Map f137104a;

    /* renamed from: b */
    private int f137105b;

    /* renamed from: c */
    private long f137106c;

    /* renamed from: d */
    private long f137107d;

    /* renamed from: xj.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29677c(JSONObject jSONObject) {
        JSONArray jSONArray;
        AbstractC19074t.m100208f(jSONObject, "js");
        try {
            if (jSONObject.has("startedTime")) {
                this.f137106c = AbstractC18069a.m96087f(jSONObject, "startedTime");
            }
            if (jSONObject.has("endTime")) {
                this.f137107d = AbstractC18069a.m96087f(jSONObject, "endTime");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                this.f137105b = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("map")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("map");
                if (jSONArray2.length() > 0) {
                    this.f137104a = new HashMap();
                    int length = jSONArray2.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            JSONObject optJSONObject = jSONArray2.optJSONObject(i11);
                            if (optJSONObject != null) {
                                jSONArray = optJSONObject.names();
                            } else {
                                jSONArray = null;
                            }
                            if (jSONArray != null) {
                                JSONArray names = optJSONObject.names();
                                String string = names != null ? names.getString(0) : null;
                                int optInt = optJSONObject.optInt(string);
                                if (string != null && string.length() != 0 && optInt > 0) {
                                    String lowerCase = string.toLowerCase(Locale.ROOT);
                                    AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                                    Map map = this.f137104a;
                                    AbstractC19074t.m100206d(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Int>");
                                    ((HashMap) map).put(lowerCase, Integer.valueOf(optInt));
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: a */
    public final Map m147608a() {
        return this.f137104a;
    }

    /* renamed from: b */
    public final int m147609b() {
        return this.f137105b;
    }

    /* renamed from: c */
    public final boolean m147610c() {
        Map map = this.f137104a;
        if (map != null) {
            AbstractC19074t.m100205c(map);
            if (!map.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m147611d() {
        long j11 = this.f137106c;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f137107d;
        if (j12 <= 0 || j11 > j12) {
            return false;
        }
        long mo124314i = C23793c.Companion.m124321a().mo124314i();
        long j13 = this.f137106c;
        if (mo124314i > this.f137107d || j13 > mo124314i) {
            return false;
        }
        return true;
    }
}
