package p667y2;

import android.content.Context;
import android.content.SharedPreferences;
import com.adtima.Adtima;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p144f.AbstractC18681a;

/* renamed from: y2.b */
/* loaded from: classes2.dex */
public final class C30265b extends AbstractC18681a {

    /* renamed from: e */
    private static final String f140609e = "b";

    /* renamed from: f */
    private static long f140610f = 86400000;

    /* renamed from: g */
    private static SharedPreferences f140611g;

    /* renamed from: h */
    private static C30265b f140612h;

    /* renamed from: d */
    private Context f140613d;

    private C30265b() {
        Context context = Adtima.SharedContext;
        this.f140613d = context;
        m98583b(context, C30265b.class);
    }

    /* renamed from: e */
    private String m149328e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(str);
            sb2.append("_");
            sb2.append(str2);
            sb2.append("_");
            sb2.append("QUEUE");
        } catch (Exception e11) {
            Adtima.m18328e(f140609e, e11.toString());
        }
        return sb2.toString();
    }

    /* renamed from: k */
    public static C30265b m149329k() {
        if (f140612h == null) {
            f140612h = new C30265b();
        }
        return f140612h;
    }

    /* renamed from: f */
    public String m149330f(HashMap hashMap) {
        JSONObject optJSONObject;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0);
            JSONObject jSONObject2 = new JSONObject();
            if (hashMap != null && hashMap.size() != 0) {
                for (String str : hashMap.keySet()) {
                    String m149334j = m149334j(str, (String) hashMap.get(str));
                    if (m149334j != null && m149334j.trim().length() != 0 && (optJSONObject = new JSONObject(m149334j).optJSONObject("data")) != null) {
                        jSONObject2.put(str, optJSONObject);
                    }
                }
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e11) {
            Adtima.m18328e(f140609e, e11.toString());
            return null;
        }
    }

    /* renamed from: g */
    public boolean m149331g(String str, String str2, String str3) {
        try {
            return m98585d(m149328e(str, str2), str3, f140610f);
        } catch (Exception e11) {
            Adtima.m18328e(f140609e, e11.toString());
            return false;
        }
    }

    /* renamed from: h */
    public void m149332h(String str, String str2) {
        try {
            Context context = this.f140613d;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(C30265b.class.getName(), 0);
                f140611g = sharedPreferences;
                sharedPreferences.edit().remove(m149328e(str, str2)).apply();
            }
        } catch (Exception e11) {
            Adtima.m18328e(f140609e, e11.toString());
        }
    }

    /* renamed from: i */
    public boolean m149333i() {
        try {
            Context context = this.f140613d;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(C30265b.class.getName(), 0);
                f140611g = sharedPreferences;
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    String m98582a = m98582a(entry.getKey());
                    if (m98582a != null && m98582a.trim().length() != 0 && new JSONObject(m98582a).optLong("expire") != 0) {
                        f140611g.edit().remove(entry.getKey()).apply();
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18328e(f140609e, e11.toString());
        }
        return false;
    }

    /* renamed from: j */
    public String m149334j(String str, String str2) {
        try {
            return m98582a(m149328e(str, str2));
        } catch (Exception e11) {
            Adtima.m18328e(f140609e, e11.toString());
            return null;
        }
    }
}
