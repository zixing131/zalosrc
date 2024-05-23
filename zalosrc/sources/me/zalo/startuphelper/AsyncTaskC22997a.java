package me.zalo.startuphelper;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import hh0.AbstractC20064b;
import hh0.AbstractC20066d;
import hh0.C20063a;
import java.util.Date;
import java.util.Locale;
import jh0.AbstractC21254a;
import om.C24310c;
import org.json.JSONObject;
import p327lm.C22523c;

/* renamed from: me.zalo.startuphelper.a */
/* loaded from: classes7.dex */
class AsyncTaskC22997a extends AsyncTask {

    /* renamed from: a */
    private final a f111831a;

    /* renamed from: b */
    private final String f111832b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.zalo.startuphelper.a$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo117801a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC22997a(String str, a aVar) {
        this.f111831a = aVar;
        this.f111832b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Context... contextArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = contextArr[0];
            if (!TextUtils.isEmpty(this.f111832b)) {
                jSONObject.put("wakeupZdid", this.f111832b);
            }
            jSONObject.put("pkgName", context.getPackageName());
            jSONObject.put("appId", C20063a.m104233b(context));
            jSONObject.put("pl", "android");
            jSONObject.put("osv", AbstractC20064b.m104263m());
            jSONObject.put("sdkv", AbstractC20066d.m104288g());
            jSONObject.put("sdkId", C22523c.m116498g().m116507i());
            jSONObject.put("an", C20063a.m104234c(context));
            jSONObject.put("av", C20063a.m104248q(context));
            jSONObject.put("dId", AbstractC20064b.m104251a(context));
            jSONObject.put("aId", AbstractC20064b.m104252b(context));
            jSONObject.put("ser", AbstractC20064b.m104268r());
            jSONObject.put("mod", AbstractC20064b.m104261k());
            jSONObject.put("ss", AbstractC20064b.m104267q(context));
            jSONObject.put("mac", AbstractC20064b.m104270t(context));
            jSONObject.put("conn", AbstractC20064b.m104254d(context));
            jSONObject.put("mno", AbstractC20064b.m104260j(context));
            jSONObject.put("zdid", C22523c.m116498g().m116503d());
            jSONObject.put("adid", AbstractC20064b.m104251a(context));
            jSONObject.put("ts", String.valueOf(new Date().getTime()));
            jSONObject.put("brd", AbstractC20064b.m104253c());
            jSONObject.put("dev", Build.DEVICE);
            jSONObject.put("prd", AbstractC20064b.m104266p());
            jSONObject.put("adk_ver", Build.VERSION.SDK_INT);
            jSONObject.put("mnft", AbstractC20064b.m104257g());
            jSONObject.put("dev_type", Build.TYPE);
            jSONObject.put("avc", C20063a.m104247p(context));
            jSONObject.put("lang", Locale.getDefault().toString());
            jSONObject.put("dpi", context.getResources().getDisplayMetrics().density);
            try {
                C24310c m104264n = AbstractC20064b.m104264n(context);
                jSONObject.put("preload", m104264n.f117392a);
                jSONObject.put("preloadDefault", C20063a.m104244m(context));
                if (!m104264n.m126955c()) {
                    jSONObject.put("preloadFailed", m104264n.f117393b);
                }
            } catch (Exception unused) {
            }
            jSONObject.put("permNoti", AbstractC23000d.m117849g(context));
            jSONObject.put("sleepMode", AbstractC23000d.m117850h(context));
        } catch (Exception e11) {
            AbstractC21254a.m110062d(AsyncTaskC22997a.class.getSimpleName(), e11);
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f111831a;
        if (aVar != null) {
            aVar.mo117801a(str);
        }
        super.onPostExecute(str);
    }
}
