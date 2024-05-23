package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4926qy;
import com.google.android.gms.internal.ads.C4881pq;
import com.google.android.gms.internal.ads.bk0;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.yk0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20295p;

/* loaded from: classes2.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private tc3 zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private C4881pq zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private String zzm = "-1";
    private String zzn = "-1";
    private int zzo = -1;
    private bk0 zzp = new bk0("", 0);
    private long zzq = 0;
    private long zzr = 0;
    private int zzs = -1;
    private int zzt = 0;
    private Set zzu = Collections.emptySet();
    private JSONObject zzv = new JSONObject();
    private boolean zzw = true;
    private boolean zzx = true;
    private String zzy = null;
    private String zzz = "";
    private boolean zzA = false;
    private String zzB = "";
    private int zzC = -1;
    private int zzD = -1;
    private long zzE = 0;

    private final void zzR() {
        tc3 tc3Var = this.zzd;
        if (tc3Var == null || tc3Var.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            yk0.zzk("Interrupted while waiting for preferences loaded.", e11);
        } catch (CancellationException e12) {
            e = e12;
            yk0.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e13) {
            e = e13;
            yk0.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e14) {
            e = e14;
            yk0.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzB.equals(str)) {
                    return;
                }
                this.zzB = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z11) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzA == z11) {
                    return;
                }
                this.zzA = z11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        zzR();
        synchronized (this.zza) {
            try {
                if (TextUtils.equals(this.zzy, str)) {
                    return;
                }
                this.zzy = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzr == j11) {
                    return;
                }
                this.zzr = j11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i11) {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzo = i11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    if (i11 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i11);
                    }
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        char c11;
        zzR();
        synchronized (this.zza) {
            try {
                int hashCode = str.hashCode();
                if (hashCode != -2004976699) {
                    if (hashCode != 83641339) {
                        if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                            c11 = 1;
                        }
                        c11 = 65535;
                    } else {
                        if (str.equals("IABTCF_gdprApplies")) {
                            c11 = 0;
                        }
                        c11 = 65535;
                    }
                } else {
                    if (str.equals("IABTCF_PurposeConsents")) {
                        c11 = 2;
                    }
                    c11 = 65535;
                }
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 != 2) {
                            return;
                        } else {
                            this.zzn = str2;
                        }
                    } else {
                        this.zzm = str2;
                    }
                } else {
                    this.zzl = str2;
                }
                if (this.zzg != null) {
                    if (str2.equals("-1")) {
                        this.zzg.remove(str);
                    } else {
                        this.zzg.putString(str, str2);
                    }
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (z11 == this.zzk) {
                    return;
                }
                this.zzk = z11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z11) {
        zzR();
        synchronized (this.zza) {
            try {
                JSONArray optJSONArray = this.zzv.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z11 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        }
                        length = i11;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z11);
                    jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().mo105913a());
                    optJSONArray.put(length, jSONObject);
                    this.zzv.put(str, optJSONArray);
                } catch (JSONException e11) {
                    yk0.zzk("Could not update native advanced settings", e11);
                }
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.zzv.toString());
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzs == i11) {
                    return;
                }
                this.zzs = i11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzD == i11) {
                    return;
                }
                this.zzD = i11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzE == j11) {
                    return;
                }
                this.zzE = j11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z11;
        zzR();
        synchronized (this.zza) {
            z11 = this.zzw;
        }
        return z11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z11;
        zzR();
        synchronized (this.zza) {
            z11 = this.zzx;
        }
        return z11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z11;
        zzR();
        synchronized (this.zza) {
            z11 = this.zzA;
        }
        return z11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z11;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21357r0)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z11 = this.zzk;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ(Context context, String str) {
        NetworkSecurityPolicy networkSecurityPolicy;
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.zza) {
            try {
                this.zzf = sharedPreferences;
                this.zzg = edit;
                if (AbstractC20295p.m105953g()) {
                    networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
                    networkSecurityPolicy.isCleartextTrafficPermitted();
                }
                this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
                this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
                this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                this.zzt = this.zzf.getInt("version_code", this.zzt);
                this.zzp = new bk0(this.zzf.getString("app_settings_json", this.zzp.m20555c()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.m20553a()));
                this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
                this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
                this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
                this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
                this.zzy = this.zzf.getString("display_cutout", this.zzy);
                this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
                this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
                this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
                this.zzz = this.zzf.getString("inspector_info", this.zzz);
                this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
                this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
                this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
                this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
                this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
                this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
                try {
                    this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
                } catch (JSONException e11) {
                    yk0.zzk("Could not convert native advanced settings to json object", e11);
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i11;
        zzR();
        synchronized (this.zza) {
            i11 = this.zzt;
        }
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i11;
        zzR();
        synchronized (this.zza) {
            i11 = this.zzo;
        }
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i11;
        zzR();
        synchronized (this.zza) {
            i11 = this.zzs;
        }
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j11;
        zzR();
        synchronized (this.zza) {
            j11 = this.zzq;
        }
        return j11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j11;
        zzR();
        synchronized (this.zza) {
            j11 = this.zzr;
        }
        return j11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j11;
        zzR();
        synchronized (this.zza) {
            j11 = this.zzE;
        }
        return j11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final C4881pq zzg() {
        if (!this.zzb) {
            return null;
        }
        if ((zzM() && zzN()) || !((Boolean) AbstractC4926qy.f26989b.m24091e()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.zze == null) {
                    this.zze = new C4881pq();
                }
                this.zze.m25517e();
                yk0.zzi("start fetching content...");
                return this.zze;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final bk0 zzh() {
        bk0 bk0Var;
        zzR();
        synchronized (this.zza) {
            bk0Var = this.zzp;
        }
        return bk0Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final bk0 zzi() {
        bk0 bk0Var;
        synchronized (this.zza) {
            bk0Var = this.zzp;
        }
        return bk0Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzB;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzy;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        char c11;
        zzR();
        synchronized (this.zza) {
            try {
                int hashCode = str.hashCode();
                if (hashCode != -2004976699) {
                    if (hashCode != 83641339) {
                        if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                            c11 = 1;
                        }
                        c11 = 65535;
                    } else {
                        if (str.equals("IABTCF_gdprApplies")) {
                            c11 = 0;
                        }
                        c11 = 65535;
                    }
                } else {
                    if (str.equals("IABTCF_PurposeConsents")) {
                        c11 = 2;
                    }
                    c11 = 65535;
                }
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 != 2) {
                            return null;
                        }
                        return this.zzn;
                    }
                    return this.zzm;
                }
                return this.zzl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzv;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    return;
                }
                final String str = "admob";
                this.zzd = kl0.f23363a.mo21340T(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzh
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj.this.zzQ(this.zzb, this.zzc);
                    }
                });
                this.zzb = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzv = new JSONObject();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzq == j11) {
                    return;
                }
                this.zzq = j11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        zzR();
        synchronized (this.zza) {
            try {
                long mo105913a = com.google.android.gms.ads.internal.zzt.zzB().mo105913a();
                if (str != null && !str.equals(this.zzp.m20555c())) {
                    this.zzp = new bk0(str, mo105913a);
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.zzg.putLong("app_settings_last_update_ms", mo105913a);
                        this.zzg.apply();
                    }
                    zzS();
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.zzp.m20559g(mo105913a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzt == i11) {
                    return;
                }
                this.zzt = i11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("version_code", i11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        zzR();
        synchronized (this.zza) {
            try {
                if (str.equals(this.zzi)) {
                    return;
                }
                this.zzi = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzw == z11) {
                    return;
                }
                this.zzw = z11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            try {
                if (str.equals(this.zzj)) {
                    return;
                }
                this.zzj = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z11) {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzx == z11) {
                    return;
                }
                this.zzx = z11;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z11);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
