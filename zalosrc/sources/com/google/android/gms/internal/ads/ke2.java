package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ke2 implements sh2 {

    /* renamed from: a */
    private final Context f23293a;

    /* renamed from: b */
    private final uc3 f23294b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ke2(Context context, uc3 uc3Var) {
        this.f23293a = context;
        this.f23294b = uc3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ je2 m23929a() {
        String string;
        Bundle bundle;
        zzt.zzp();
        Context context = this.f23293a;
        String str = "";
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21242f5)).booleanValue()) {
            string = "";
        } else {
            string = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21262h5)).booleanValue()) {
            str = this.f23293a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
        }
        zzt.zzp();
        Context context2 = this.f23293a;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21252g5)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i11 = 0; i11 < 4; i11++) {
                String str2 = strArr[i11];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        }
        return new je2(string, str, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f23294b.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.he2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ke2.this.m23929a();
            }
        });
    }
}
