package p327lm;

import android.content.Context;
import android.os.AsyncTask;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import gh0.C19447a;
import hh0.AbstractC20064b;
import hh0.C20063a;
import ih0.C20558b;
import java.lang.ref.WeakReference;
import kh0.C21726b;
import org.json.JSONObject;

/* renamed from: lm.e */
/* loaded from: classes3.dex */
public class AsyncTaskC22525e extends AsyncTask {

    /* renamed from: a */
    WeakReference f110269a;

    /* renamed from: b */
    String f110270b;

    /* renamed from: c */
    a f110271c;

    /* renamed from: lm.e$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo104274a();

        /* renamed from: b */
        void mo104275b(int i11, String str);
    }

    public AsyncTaskC22525e(Context context, a aVar, String str) {
        this.f110269a = new WeakReference(context);
        this.f110271c = aVar;
        this.f110270b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) {
        Context context;
        try {
            context = (Context) this.f110269a.get();
        } catch (Exception e11) {
            a aVar = this.f110271c;
            if (aVar != null) {
                aVar.mo104275b(-1, "Exception error " + e11.getMessage());
            }
        }
        if (context == null) {
            this.f110271c.mo104275b(-1, "Error message: GetPreloadSettingAsyncTask has empty context!");
            return Boolean.FALSE;
        }
        C19447a m101720d = C19447a.m101720d();
        C20558b c20558b = new C20558b(C20558b.a.GET, C21726b.m112130b().m112136h("centralized_http_s", "sdk/mobile/preload/setting"));
        c20558b.m106850b("pl", "android");
        c20558b.m106850b("appId", C20063a.m104233b(context));
        c20558b.m106850b("sdkv", C22523c.m116498g().m116508j());
        c20558b.m106850b("pkg", context.getPackageName());
        c20558b.m106850b("adid", AbstractC20064b.m104251a(context));
        c20558b.m106850b("zdId", this.f110270b);
        try {
            JSONObject m106851c = c20558b.m106851c();
            int i11 = m106851c.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            if (i11 == 0) {
                JSONObject jSONObject = m106851c.getJSONObject("data");
                if (jSONObject != null && jSONObject.has("setting")) {
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
                    if (jSONObject2.has("expiredTime")) {
                        m101720d.m101733n(context, jSONObject2.getLong("expiredTime") + System.currentTimeMillis());
                    }
                    if (jSONObject2.has("token_resubmit_age")) {
                        m101720d.m101735p(context, jSONObject2.getInt("token_resubmit_age"));
                    }
                }
                a aVar2 = this.f110271c;
                if (aVar2 != null) {
                    aVar2.mo104275b(i11, "");
                }
            } else {
                a aVar3 = this.f110271c;
                if (aVar3 != null) {
                    aVar3.mo104275b(i11, "");
                }
            }
        } catch (Exception e12) {
            a aVar4 = this.f110271c;
            if (aVar4 != null) {
                aVar4.mo104275b(-108, "Exception error " + e12.getMessage());
            }
        }
        a aVar5 = this.f110271c;
        if (aVar5 != null) {
            aVar5.mo104274a();
        }
        return Boolean.TRUE;
    }
}
