package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.dr2;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.ys1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zza(String str) {
        char c11;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        if (bundle == null) {
            return "unspecified";
        }
        return bundle.getString("query_info_type");
    }

    public static void zzc(it1 it1Var, ys1 ys1Var, String str, Pair... pairArr) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21223d6)).booleanValue()) {
            return;
        }
        kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
            public final /* synthetic */ ys1 zzb;
            public final /* synthetic */ String zzc;
            public final /* synthetic */ Pair[] zzd;

            public /* synthetic */ zze(ys1 ys1Var2, String str2, Pair[] pairArr2) {
                r2 = ys1Var2;
                r3 = str2;
                r4 = pairArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Map m28337a;
                it1 it1Var2 = it1.this;
                ys1 ys1Var2 = r2;
                String str2 = r3;
                Pair[] pairArr2 = r4;
                if (ys1Var2 == null) {
                    m28337a = it1Var2.m24033c();
                } else {
                    m28337a = ys1Var2.m28337a();
                }
                m28337a.put("action", str2);
                for (Pair pair : pairArr2) {
                    m28337a.put((String) pair.first, (String) pair.second);
                }
                it1Var2.m24035e(m28337a);
            }
        });
    }

    public static int zzd(dr2 dr2Var) {
        if (dr2Var.f19411q) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = dr2Var.f19398d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
