package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* loaded from: classes2.dex */
final class o30 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        o33 m25386j = p33.m25386j();
        m25386j.mo25068b((String) map.get("appId"));
        m25386j.mo25074h(zq0Var.getWidth());
        m25386j.mo25073g(zq0Var.mo23737i().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            m25386j.mo25070d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            m25386j.mo25070d(81);
        }
        if (map.containsKey("verticalMargin")) {
            m25386j.mo25071e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            m25386j.mo25071e(0.02f);
        }
        if (map.containsKey("enifd")) {
            m25386j.mo25067a((String) map.get("enifd"));
        }
        try {
            zzt.zzj().zzj(zq0Var, m25386j.mo25075i());
        } catch (NullPointerException e11) {
            zzt.zzo().m22945t(e11, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
