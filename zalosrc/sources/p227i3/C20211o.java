package p227i3;

import android.content.Context;
import com.adtima.Adtima;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0099d;
import p667y2.C30268e;

/* renamed from: i3.o */
/* loaded from: classes2.dex */
public final class C20211o {

    /* renamed from: b */
    private static final String f99946b = "o";

    /* renamed from: c */
    private static C20211o f99947c;

    /* renamed from: a */
    private Context f99948a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.o$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC0008c {
        a() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            JSONObject optJSONObject;
            Iterator<String> keys;
            String optString;
            C0099d m447c;
            try {
                String m105324b = C20197a.m105323a(C20211o.this.f99948a).m105324b();
                if (m105324b != null && m105324b.length() != 0) {
                    JSONObject jSONObject = new JSONObject(m105324b);
                    if (jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null && (keys = optJSONObject.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray jSONArray = optJSONObject.getJSONArray(next);
                            if (jSONArray != null && jSONArray.length() != 0) {
                                ArrayList arrayList = new ArrayList();
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                                    if (jSONObject2 != null && (optString = jSONObject2.optString("adNetwork")) != null && Adtima.isSupport(optString) && (m447c = C0099d.m447c(optString, "banner", jSONObject2)) != null) {
                                        arrayList.add(m447c);
                                    }
                                }
                                C30268e.m149370b().m149372c(next, arrayList);
                            }
                        }
                        return null;
                    }
                    return null;
                }
                Adtima.m18330p(C20211o.f99946b, "PRELOAD: Get ad preload failed!!!");
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20211o.f99946b, "loadNativeAds", e11);
                return null;
            }
        }
    }

    private C20211o(Context context) {
        this.f99948a = context;
    }

    /* renamed from: b */
    public static C20211o m105458b(Context context) {
        if (f99947c == null) {
            f99947c = new C20211o(context);
        }
        return f99947c;
    }

    /* renamed from: d */
    public List m105460d(String str) {
        try {
            return C30268e.m149370b().m149371a(str);
        } catch (Exception e11) {
            Adtima.m18329e(f99946b, "getAdsPreload", e11);
            return null;
        }
    }

    /* renamed from: e */
    public synchronized void m105461e() {
        C0009d.m11g(new a());
    }
}
