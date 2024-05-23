package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C4008R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nc0 extends qc0 {

    /* renamed from: c */
    private final Map f25126c;

    /* renamed from: d */
    private final Context f25127d;

    public nc0(zq0 zq0Var, Map map) {
        super(zq0Var, "storePicture");
        this.f25126c = map;
        this.f25127d = zq0Var.zzk();
    }

    /* renamed from: i */
    public final void m24884i() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f25127d == null) {
            m25683c("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new C4887pw(this.f25127d).m25562c()) {
            m25683c("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.f25126c.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            m25683c("Image url cannot be empty.");
            return;
        }
        if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources m22933d = zzt.zzo().m22933d();
                zzt.zzp();
                AlertDialog.Builder zzG = zzs.zzG(this.f25127d);
                if (m22933d != null) {
                    str = m22933d.getString(C4008R.string.f15884s1);
                } else {
                    str = "Save image";
                }
                zzG.setTitle(str);
                if (m22933d != null) {
                    str2 = m22933d.getString(C4008R.string.f15885s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzG.setMessage(str2);
                if (m22933d != null) {
                    str3 = m22933d.getString(C4008R.string.f15886s3);
                } else {
                    str3 = "Accept";
                }
                zzG.setPositiveButton(str3, new lc0(this, str5, lastPathSegment));
                if (m22933d != null) {
                    str4 = m22933d.getString(C4008R.string.f15887s4);
                } else {
                    str4 = "Decline";
                }
                zzG.setNegativeButton(str4, new mc0(this));
                zzG.create().show();
                return;
            }
            m25683c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        m25683c("Invalid image url: ".concat(String.valueOf(str5)));
    }
}
