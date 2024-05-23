package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
public final class gc2 implements sh2 {

    /* renamed from: a */
    private final sh2 f20536a;

    /* renamed from: b */
    private final dr2 f20537b;

    /* renamed from: c */
    private final Context f20538c;

    /* renamed from: d */
    private final hk0 f20539d;

    public gc2(zd2 zd2Var, dr2 dr2Var, Context context, hk0 hk0Var) {
        this.f20536a = zd2Var;
        this.f20537b = dr2Var;
        this.f20538c = context;
        this.f20539d = hk0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ hc2 m22413a(xh2 xh2Var) {
        String str;
        boolean z11;
        String str2;
        float f11;
        int i11;
        int i12;
        int i13;
        DisplayMetrics displayMetrics;
        zzq zzqVar = this.f20537b.f19399e;
        zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z11 = zzqVar.zzi;
        } else {
            str = null;
            boolean z12 = false;
            boolean z13 = false;
            z11 = false;
            for (zzq zzqVar2 : zzqVarArr) {
                boolean z14 = zzqVar2.zzi;
                if (!z14 && !z12) {
                    str = zzqVar2.zza;
                    z12 = true;
                }
                if (z14) {
                    if (!z13) {
                        z13 = true;
                        z11 = true;
                    } else {
                        z13 = true;
                    }
                }
                if (z12 && z13) {
                    break;
                }
            }
        }
        Resources resources = this.f20538c.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f12 = displayMetrics.density;
            int i14 = displayMetrics.widthPixels;
            i12 = displayMetrics.heightPixels;
            str2 = this.f20539d.m22936h().zzm();
            i11 = i14;
            f11 = f12;
        } else {
            str2 = null;
            f11 = 0.0f;
            i11 = 0;
            i12 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z15 = false;
            for (zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z15 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i15 = zzqVar3.zze;
                    if (i15 == -1) {
                        if (f11 != 0.0f) {
                            i15 = (int) (zzqVar3.zzf / f11);
                        } else {
                            i15 = -1;
                        }
                    }
                    sb2.append(i15);
                    sb2.append("x");
                    int i16 = zzqVar3.zzb;
                    if (i16 == -2) {
                        if (f11 != 0.0f) {
                            i16 = (int) (zzqVar3.zzc / f11);
                        } else {
                            i16 = -2;
                        }
                    }
                    sb2.append(i16);
                }
            }
            if (z15) {
                if (sb2.length() != 0) {
                    i13 = 0;
                    sb2.insert(0, "|");
                } else {
                    i13 = 0;
                }
                sb2.insert(i13, "320x50");
            }
        }
        return new hc2(zzqVar, str, z11, sb2.toString(), f11, i11, i12, str2, this.f20537b.f19410p);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23881m(this.f20536a.zzb(), new y43() { // from class: com.google.android.gms.internal.ads.fc2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return gc2.this.m22413a((xh2) obj);
            }
        }, kl0.f23368f);
    }
}
