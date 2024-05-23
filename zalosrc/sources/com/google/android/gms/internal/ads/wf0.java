package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wf0 extends xf0 {

    /* renamed from: a */
    private final Object f29902a = new Object();

    /* renamed from: b */
    private final Context f29903b;

    /* renamed from: c */
    private SharedPreferences f29904c;

    /* renamed from: d */
    private final k80 f29905d;

    public wf0(Context context, k80 k80Var) {
        this.f29903b = context.getApplicationContext();
        this.f29905d = k80Var;
    }

    /* renamed from: c */
    public static JSONObject m27604c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcgv.m28720t().f32030p);
            jSONObject.put("mf", AbstractC5223yy.f31268a.m24091e());
            jSONObject.put("cl", "474357726");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", AbstractC4150d.f16480a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m19919c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", AbstractC4150d.f16480a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.xf0
    /* renamed from: a */
    public final tc3 mo27605a() {
        synchronized (this.f29902a) {
            try {
                if (this.f29904c == null) {
                    this.f29904c = this.f29903b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        if (zzt.zzB().mo105913a() - this.f29904c.getLong("js_last_update", 0L) < ((Long) AbstractC5223yy.f31269b.m24091e()).longValue()) {
            return kc3.m23877i(null);
        }
        return kc3.m23881m(this.f29905d.zzb(m27604c(this.f29903b)), new y43() { // from class: com.google.android.gms.internal.ads.vf0
            public /* synthetic */ vf0() {
            }

            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                wf0.this.m27606b((JSONObject) obj);
                return null;
            }
        }, kl0.f23368f);
    }

    /* renamed from: b */
    public final /* synthetic */ Void m27606b(JSONObject jSONObject) {
        AbstractC4554gx.m22623d(this.f29903b, 1, jSONObject);
        this.f29904c.edit().putLong("js_last_update", zzt.zzB().mo105913a()).apply();
        return null;
    }
}
