package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;

/* loaded from: classes2.dex */
public final class ai0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Context f17049a;

    /* renamed from: b */
    private final SharedPreferences f17050b;

    /* renamed from: c */
    private final zzg f17051c;

    /* renamed from: d */
    private final dj0 f17052d;

    /* renamed from: e */
    private String f17053e = "-1";

    /* renamed from: f */
    private int f17054f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ai0(Context context, zzg zzgVar, dj0 dj0Var) {
        this.f17050b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f17051c = zzgVar;
        this.f17049a = context;
        this.f17052d = dj0Var;
    }

    /* renamed from: b */
    private final void m20121b(String str, int i11) {
        Context context;
        boolean z11 = true;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21377t0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i11 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z11 = false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21357r0)).booleanValue()) {
            this.f17051c.zzH(z11);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue() && z11 && (context = this.f17049a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21307m0)).booleanValue()) {
            this.f17052d.m21424y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m20122a() {
        this.f17050b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f17050b, "gad_has_consent_for_cookies");
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21397v0)).booleanValue()) {
            onSharedPreferenceChanged(this.f17050b, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.f17050b, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.f17050b, "IABTCF_PurposeConsents");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c11;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21397v0)).booleanValue()) {
            if (zh0.m28510a(str, "gad_has_consent_for_cookies")) {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21377t0)).booleanValue()) {
                    return;
                }
                int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i11 != this.f17051c.zzb()) {
                    this.f17051c.zzH(true);
                }
                this.f17051c.zzE(i11);
                return;
            }
            if (zh0.m28510a(str, "IABTCF_gdprApplies") || zh0.m28510a(str, "IABTCF_TCString") || zh0.m28510a(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.f17051c.zzn(str))) {
                    this.f17051c.zzH(true);
                }
                this.f17051c.zzF(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i12 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c11 = 1;
            }
            c11 = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c11 = 0;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                return;
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21377t0)).booleanValue() && i12 != -1 && this.f17054f != i12) {
                this.f17054f = i12;
                m20121b(string2, i12);
                return;
            }
            return;
        }
        if (!string2.equals("-1") && !this.f17053e.equals(string2)) {
            this.f17053e = string2;
            m20121b(string2, i12);
        }
    }
}
