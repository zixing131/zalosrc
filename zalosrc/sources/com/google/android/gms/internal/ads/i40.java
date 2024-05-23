package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i40 implements c40 {

    /* renamed from: a */
    private final Context f22056a;

    public i40(Context context) {
        this.f22056a = context;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        char c11;
        if (!zzt.zzn().m21425z(this.f22056a)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c11 = 1;
                }
                c11 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c11 = 0;
                }
                c11 = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c11 = 2;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    yk0.zzg("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    zzt.zzn().m21415p(this.f22056a, str2);
                    return;
                }
            }
            zzt.zzn().m21418s(this.f22056a, str2);
            return;
        }
        zzt.zzn().m21417r(this.f22056a, str2);
    }
}
