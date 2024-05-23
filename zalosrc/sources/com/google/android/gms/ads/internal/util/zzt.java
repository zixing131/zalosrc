package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C4808ns;
import com.google.android.gms.internal.ads.ds0;
import com.google.android.gms.internal.ads.ir0;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zq0;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes2.dex */
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zza() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            yk0.zzh("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzc(String str, String str2, int i11, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i11, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final ir0 zzd(zq0 zq0Var, C4808ns c4808ns, boolean z11) {
        return new ds0(zq0Var, c4808ns, z11);
    }
}
