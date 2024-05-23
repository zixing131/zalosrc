package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ph2 implements sh2 {

    /* renamed from: a */
    private final uc3 f26220a;

    /* renamed from: b */
    private final Context f26221b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ph2(uc3 uc3Var, Context context) {
        this.f26220a = uc3Var;
        this.f26221b = context;
    }

    /* renamed from: a */
    public static Bundle m25470a(Context context, JSONArray jSONArray) {
        int i11;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i12);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
            if (optInt != 0) {
                if (optInt != 1) {
                    if (optInt != 2) {
                        i11 = 0;
                    } else {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 1;
            }
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i11 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i13 = i11 - 1;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ rh2 m25471b() {
        String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21272i5);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle m25470a = m25470a(this.f26221b, new JSONArray(str));
            return new rh2() { // from class: com.google.android.gms.internal.ads.oh2
                @Override // com.google.android.gms.internal.ads.rh2
                /* renamed from: a */
                public final void mo20086a(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", m25470a);
                }
            };
        } catch (JSONException e11) {
            yk0.zzf("JSON parsing error", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f26220a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.mh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ph2.this.m25471b();
            }
        });
    }
}
