package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import p667y2.C30268e;

/* loaded from: classes2.dex */
public final class a30 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                yk0.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                yk0.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long mo105914b = zzt.zzB().mo105914b() + (Long.parseLong(str4) - zzt.zzB().mo105913a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zq0Var.zzo().m26790c(str2, str3, mo105914b);
                return;
            } catch (NumberFormatException e11) {
                yk0.zzk("Malformed timestamp for CSI tick.", e11);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                yk0.zzj("No value given for CSI experiment.");
                return;
            } else {
                zq0Var.zzo().m26788a().m27426d(C30268e.f140632a, str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                yk0.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                yk0.zzj("No name given for CSI extra.");
            } else {
                zq0Var.zzo().m26788a().m27426d(str6, str7);
            }
        }
    }
}
