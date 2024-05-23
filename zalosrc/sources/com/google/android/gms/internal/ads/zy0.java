package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zy0 implements iy0 {

    /* renamed from: a */
    private final CookieManager f31719a;

    public zy0(Context context) {
        this.f31719a = zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        if (this.f31719a == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21002H0);
            String cookie = this.f31719a.getCookie(str);
            if (cookie != null) {
                List m27834f = x53.m27830c(v43.m27166b(';')).m27834f(cookie);
                for (int i11 = 0; i11 < m27834f.size(); i11++) {
                    CookieManager cookieManager = this.f31719a;
                    Iterator it = x53.m27830c(v43.m27166b('=')).m27833d((String) m27834f.get(i11)).iterator();
                    it.getClass();
                    if (it.hasNext()) {
                        cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzay.zzc().m21823b(AbstractC4554gx.f21387u0))));
                    } else {
                        throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                    }
                }
                return;
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f31719a.setCookie((String) zzay.zzc().m21823b(AbstractC4554gx.f21002H0), str2);
    }
}
