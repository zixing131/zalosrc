package p327lm;

import android.content.Context;
import android.os.AsyncTask;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import gh0.C19447a;
import hh0.AbstractC20064b;
import hh0.AbstractC20066d;
import hh0.C20063a;
import ih0.C20558b;
import java.lang.ref.WeakReference;
import kh0.C21726b;
import org.json.JSONObject;

/* renamed from: lm.f */
/* loaded from: classes3.dex */
public class AsyncTaskC22526f extends AsyncTask {

    /* renamed from: a */
    WeakReference f110272a;

    /* renamed from: b */
    String f110273b;

    /* renamed from: c */
    long f110274c;

    /* renamed from: d */
    long f110275d;

    /* renamed from: e */
    boolean f110276e;

    /* renamed from: lm.f$a */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public AsyncTaskC22526f(Context context, a aVar, String str) {
        this.f110272a = new WeakReference(context);
        this.f110273b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Context... contextArr) {
        Context context;
        JSONObject jSONObject;
        try {
            context = (Context) this.f110272a.get();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (context == null) {
            return "";
        }
        C19447a m101720d = C19447a.m101720d();
        C20558b c20558b = new C20558b(C20558b.a.GET, C21726b.m112130b().m112136h("centralized_http_s", "/sdk/mobile/setting"));
        c20558b.m106850b("pl", "android");
        c20558b.m106850b("appId", C20063a.m104233b(context));
        c20558b.m106850b("sdkv", C22523c.m116498g().m116508j());
        c20558b.m106850b("pkg", context.getPackageName());
        c20558b.m106850b("adid", AbstractC20064b.m104251a(context));
        c20558b.m106850b("zdId", this.f110273b);
        try {
            JSONObject m106851c = c20558b.m106851c();
            if (m106851c.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 0 && (jSONObject = m106851c.getJSONObject("data")) != null && jSONObject.has("setting")) {
                m101720d.m101742w(context, AbstractC20066d.m104285d(jSONObject, "webview_login"));
                m101720d.m101739t(context, AbstractC20066d.m104285d(jSONObject, "isOutAppLogin"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("setting");
                if (jSONObject2.has("model_preload")) {
                    m101720d.m101740u(context, jSONObject2.getJSONArray("model_preload").toString());
                }
                if (jSONObject2.has("brand_preload")) {
                    m101720d.m101738s(context, jSONObject2.getJSONArray("brand_preload").toString());
                }
                if (jSONObject2.has("preload_default")) {
                    m101720d.m101741v(context, jSONObject2.getJSONArray("preload_default").toString());
                }
                if (jSONObject2.has("wakeup_interval")) {
                    long j11 = jSONObject2.getLong("wakeup_interval");
                    this.f110274c = j11;
                    m101720d.m101736q(context, j11);
                    if (jSONObject2.has("expiredTime")) {
                        long j12 = jSONObject2.getLong("expiredTime");
                        this.f110275d = j12;
                        m101720d.m101732m(context, j12 + System.currentTimeMillis());
                    }
                    if (jSONObject2.has("wakeup_interval_enable")) {
                        boolean z11 = jSONObject2.getBoolean("wakeup_interval_enable");
                        this.f110276e = z11;
                        m101720d.m101737r(context, z11);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
