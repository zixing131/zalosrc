package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.C20219w;
import p667y2.C30271h;

/* loaded from: classes2.dex */
public final class xo0 implements c40 {

    /* renamed from: a */
    private boolean f30548a;

    /* renamed from: b */
    private static int m27948b(Context context, Map map, String str, int i11) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzaw.zzb();
                i11 = rk0.m26115y(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                yk0.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i11 + ".");
        }
        return i11;
    }

    /* renamed from: c */
    private static void m27949c(zzcim zzcimVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcimVar.m28763d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                yk0.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcimVar.m28762b(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcimVar.m28760D(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcimVar.m28761E(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcimVar.m28765f(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        Integer num;
        Integer num2;
        int min;
        int min2;
        int i11;
        fn0 fn0Var = (fn0) obj;
        Integer num3 = null;
        if (map.containsKey("playerId")) {
            num = Integer.valueOf(Integer.parseInt((String) map.get("playerId")));
        } else {
            num = null;
        }
        if (fn0Var.mo22093a0() != null && fn0Var.mo22093a0().m26994a() != null) {
            num2 = fn0Var.mo22093a0().m26994a().m28771p();
        } else {
            num2 = null;
        }
        int i12 = 0;
        if (num != null && num2 != null && !num.equals(num2)) {
            yk0.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", num, num2));
            return;
        }
        String str = (String) map.get("action");
        if (str == null) {
            yk0.zzj("Action missing from video GMSG.");
            return;
        }
        if (yk0.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            yk0.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                yk0.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                fn0Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                yk0.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                yk0.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                fn0Var.mo22089G(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                yk0.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                yk0.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "missingMimeTypes");
                fn0Var.mo23552V("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str4.split(",");
            int length = split.length;
            while (i12 < length) {
                String str5 = split[i12];
                hashMap2.put(str5, zzch.zza(str5.trim()));
                i12++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            fn0Var.mo23552V("onVideoEvent", hashMap3);
            return;
        }
        um0 mo22093a0 = fn0Var.mo22093a0();
        if (mo22093a0 == null) {
            yk0.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (!equals && !equals2) {
            wr0 zzs = fn0Var.zzs();
            if (zzs != null) {
                if ("timeupdate".equals(str)) {
                    String str6 = (String) map.get("currentTime");
                    if (str6 == null) {
                        yk0.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzs.m27701X4(Float.parseFloat(str6));
                        return;
                    } catch (NumberFormatException unused3) {
                        yk0.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                        return;
                    }
                }
                if ("skip".equals(str)) {
                    zzs.m27703a();
                    return;
                }
            }
            zzcim m26994a = mo22093a0.m26994a();
            if (m26994a == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                fn0Var.mo23552V("onVideoEvent", hashMap4);
                return;
            }
            if ("click".equals(str)) {
                Context context = fn0Var.getContext();
                int m27948b = m27948b(context, map, "x", 0);
                int m27948b2 = m27948b(context, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, m27948b, m27948b2, 0);
                m26994a.m28759C(obtain);
                obtain.recycle();
                return;
            }
            if ("currentTime".equals(str)) {
                String str7 = (String) map.get("time");
                if (str7 == null) {
                    yk0.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    m26994a.m28758B((int) (Float.parseFloat(str7) * 1000.0f));
                    return;
                } catch (NumberFormatException unused4) {
                    yk0.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                    return;
                }
            }
            if ("hide".equals(str)) {
                m26994a.setVisibility(4);
                return;
            }
            if ("load".equals(str)) {
                m26994a.m28776w();
                return;
            }
            if ("loadControl".equals(str)) {
                m27949c(m26994a, map);
                return;
            }
            if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    m26994a.m28777x();
                    return;
                } else {
                    m26994a.m28770k();
                    return;
                }
            }
            if ("pause".equals(str)) {
                m26994a.m28779z();
                return;
            }
            if ("play".equals(str)) {
                m26994a.m28757A();
                return;
            }
            if ("show".equals(str)) {
                m26994a.setVisibility(0);
                return;
            }
            if ("src".equals(str)) {
                String str8 = (String) map.get("src");
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num3 = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused5) {
                        yk0.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    }
                }
                String[] strArr = {str8};
                String str9 = (String) map.get("demuxed");
                if (str9 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str9);
                        String[] strArr2 = new String[jSONArray.length()];
                        while (i12 < jSONArray.length()) {
                            strArr2[i12] = jSONArray.getString(i12);
                            i12++;
                        }
                        strArr = strArr2;
                    } catch (JSONException unused6) {
                        yk0.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                        strArr = new String[]{str8};
                    }
                }
                if (num3 != null) {
                    fn0Var.mo22100z(num3.intValue());
                }
                m26994a.m28766g(str8, strArr);
                return;
            }
            if ("touchMove".equals(str)) {
                Context context2 = fn0Var.getContext();
                m26994a.m28769j(m27948b(context2, map, "dx", 0), m27948b(context2, map, "dy", 0));
                if (!this.f30548a) {
                    fn0Var.mo22095g();
                    this.f30548a = true;
                    return;
                }
                return;
            }
            if ("volume".equals(str)) {
                String str10 = (String) map.get("volume");
                if (str10 == null) {
                    yk0.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    m26994a.m28768i(Float.parseFloat(str10));
                    return;
                } catch (NumberFormatException unused7) {
                    yk0.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                    return;
                }
            }
            if ("watermark".equals(str)) {
                m26994a.m28772r();
                return;
            } else {
                yk0.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        Context context3 = fn0Var.getContext();
        int m27948b3 = m27948b(context3, map, "x", 0);
        int m27948b4 = m27948b(context3, map, "y", 0);
        int m27948b5 = m27948b(context3, map, C20219w.f100062c, -1);
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21171Y2;
        if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
            if (m27948b5 == -1) {
                min = fn0Var.zzj();
            } else {
                min = Math.min(m27948b5, fn0Var.zzj());
            }
        } else {
            if (zze.zzc()) {
                zze.zza("Calculate width with original width " + m27948b5 + ", videoHost.getVideoBoundingWidth() " + fn0Var.zzj() + ", x " + m27948b3 + ".");
            }
            min = Math.min(m27948b5, fn0Var.zzj() - m27948b3);
        }
        int m27948b6 = m27948b(context3, map, C30271h.f140642d, -1);
        if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
            if (m27948b6 == -1) {
                min2 = fn0Var.zzi();
            } else {
                min2 = Math.min(m27948b6, fn0Var.zzi());
            }
        } else {
            if (zze.zzc()) {
                zze.zza("Calculate height with original height " + m27948b6 + ", videoHost.getVideoBoundingHeight() " + fn0Var.zzi() + ", y " + m27948b4 + ".");
            }
            min2 = Math.min(m27948b6, fn0Var.zzi() - m27948b4);
        }
        int i13 = min2;
        try {
            i11 = Integer.parseInt((String) map.get("player"));
        } catch (NumberFormatException unused8) {
            i11 = 0;
        }
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
        if (equals && mo22093a0.m26994a() == null) {
            mo22093a0.m26996c(m27948b3, m27948b4, min, i13, i11, parseBoolean, new en0((String) map.get("flags")), num);
            zzcim m26994a2 = mo22093a0.m26994a();
            if (m26994a2 != null) {
                m27949c(m26994a2, map);
                return;
            }
            return;
        }
        mo22093a0.m26995b(m27948b3, m27948b4, min, i13);
    }
}
