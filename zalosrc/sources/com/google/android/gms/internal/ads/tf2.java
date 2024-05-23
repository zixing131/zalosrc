package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tf2 implements sh2 {

    /* renamed from: a */
    private final uc3 f28307a;

    /* renamed from: b */
    private final dr2 f28308b;

    /* renamed from: c */
    private final PackageInfo f28309c;

    /* renamed from: d */
    private final zzg f28310d;

    public tf2(uc3 uc3Var, dr2 dr2Var, PackageInfo packageInfo, zzg zzgVar) {
        this.f28307a = uc3Var;
        this.f28308b = dr2Var;
        this.f28309c = packageInfo;
        this.f28310d = zzgVar;
    }

    /* renamed from: a */
    public static /* synthetic */ uf2 m26608a(final tf2 tf2Var) {
        final ArrayList arrayList = tf2Var.f28308b.f19401g;
        if (arrayList == null) {
            return new uf2() { // from class: com.google.android.gms.internal.ads.pf2
                @Override // com.google.android.gms.internal.ads.rh2
                /* renamed from: a */
                public final void mo20086a(Object obj) {
                }
            };
        }
        if (arrayList.isEmpty()) {
            return new uf2() { // from class: com.google.android.gms.internal.ads.qf2
                @Override // com.google.android.gms.internal.ads.rh2
                /* renamed from: a */
                public final void mo20086a(Object obj) {
                    ((Bundle) obj).putInt("native_version", 0);
                }
            };
        }
        return new uf2() { // from class: com.google.android.gms.internal.ads.rf2
            @Override // com.google.android.gms.internal.ads.rh2
            /* renamed from: a */
            public final void mo20086a(Object obj) {
                tf2.this.m26609b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:            if (r9 == 3) goto L60;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void m26609b(ArrayList arrayList, Bundle bundle) {
        int i11;
        JSONArray optJSONArray;
        String str;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f28308b.f19402h);
        String str2 = "any";
        if (this.f28308b.f19403i.f31894p > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i12 = this.f28308b.f19403i.f31901w;
            if (i12 == 1) {
                str = "any";
            } else if (i12 == 2) {
                str = "landscape";
            } else if (i12 == 3) {
                str = "portrait";
            } else if (i12 != 4) {
                str = "unknown";
            } else {
                str = "square";
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_media_orientation", str);
            }
        }
        int i13 = this.f28308b.f19403i.f31896r;
        if (i13 != 0) {
            if (i13 == 1) {
                str2 = "portrait";
            } else if (i13 == 2) {
                str2 = "landscape";
            } else {
                str2 = "unknown";
            }
        }
        if (!"unknown".equals(str2)) {
            bundle.putString("native_image_orientation", str2);
        }
        bundle.putBoolean("native_multiple_images", this.f28308b.f19403i.f31897s);
        bundle.putBoolean("use_custom_mute", this.f28308b.f19403i.f31900v);
        PackageInfo packageInfo = this.f28309c;
        if (packageInfo == null) {
            i11 = 0;
        } else {
            i11 = packageInfo.versionCode;
        }
        if (i11 > this.f28310d.zza()) {
            this.f28310d.zzs();
            this.f28310d.zzv(i11);
        }
        JSONObject zzp = this.f28310d.zzp();
        String str3 = null;
        if (zzp != null && (optJSONArray = zzp.optJSONArray(this.f28308b.f19400f)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i14 = this.f28308b.f19405k;
        if (i14 > 1) {
            bundle.putInt("max_num_ads", i14);
        }
        zzbsc zzbscVar = this.f28308b.f19396b;
        if (zzbscVar != null) {
            if (TextUtils.isEmpty(zzbscVar.f31923r)) {
                String str4 = "p";
                if (zzbscVar.f31921p >= 2) {
                    int i15 = zzbscVar.f31924s;
                    if (i15 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i16 = zzbscVar.f31922q;
                    if (i16 != 1) {
                        if (i16 != 2) {
                            yk0.zzg("Instream ad video aspect ratio " + i16 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzbscVar.f31923r);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.f28308b.m21534a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f28307a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.sf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tf2.m26608a(tf2.this);
            }
        });
    }
}
