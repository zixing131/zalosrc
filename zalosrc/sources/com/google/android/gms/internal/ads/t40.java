package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t40 implements c40 {

    /* renamed from: a */
    private final s40 f28192a;

    public t40(s40 s40Var) {
        this.f28192a = s40Var;
    }

    /* renamed from: b */
    public static void m26563b(zq0 zq0Var, s40 s40Var) {
        zq0Var.mo26687S("/reward", new t40(s40Var));
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzcce zzcceVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    zzcceVar = new zzcce(str2, parseInt);
                }
            } catch (NumberFormatException e11) {
                yk0.zzk("Unable to parse reward amount.", e11);
            }
            this.f28192a.mo23710n(zzcceVar);
            return;
        }
        if ("video_start".equals(str)) {
            this.f28192a.zzc();
        } else if ("video_complete".equals(str)) {
            this.f28192a.zzb();
        }
    }
}
