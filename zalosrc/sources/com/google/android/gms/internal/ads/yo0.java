package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class yo0 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        float parseFloat;
        fn0 fn0Var = (fn0) obj;
        wr0 zzs = fn0Var.zzs();
        if (zzs == null) {
            try {
                wr0 wr0Var = new wr0(fn0Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                fn0Var.mo22099s(wr0Var);
                zzs = wr0Var;
            } catch (NullPointerException e11) {
                e = e11;
                yk0.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().m22945t(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e12) {
                e = e12;
                yk0.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().m22945t(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat2 = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat3 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i11 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i11 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        if (TextUtils.isEmpty(str)) {
            parseFloat = 0.0f;
        } else {
            parseFloat = Float.parseFloat(str);
        }
        if (yk0.zzm(3)) {
            yk0.zze("Video Meta GMSG: currentTime : " + parseFloat3 + " , duration : " + parseFloat2 + " , isMuted : " + equals + " , playbackState : " + i11 + " , aspectRatio : " + str);
        }
        zzs.m27698N(parseFloat3, parseFloat2, i11, equals, parseFloat);
    }
}
