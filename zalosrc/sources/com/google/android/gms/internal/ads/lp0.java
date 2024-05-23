package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lp0 implements c40 {
    /* renamed from: b */
    private static final Integer m24342b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            yk0.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        kp0 kp0Var;
        fn0 fn0Var = (fn0) obj;
        if (yk0.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            yk0.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        cp0 zzy = zzt.zzy();
        if (map.containsKey("abort")) {
            if (!zzy.m20981j(fn0Var)) {
                yk0.zzj("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer m24342b = m24342b(map, "periodicReportIntervalMs");
        Integer m24342b2 = m24342b(map, "exoPlayerRenderingIntervalMs");
        Integer m24342b3 = m24342b(map, "exoPlayerIdleIntervalMs");
        en0 en0Var = new en0((String) map.get("flags"));
        boolean z11 = en0Var.f19712n;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            bp0 bp0Var = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        strArr2[i11] = jSONArray.getString(i11);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    yk0.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z11) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bp0 bp0Var2 = (bp0) it.next();
                    if (bp0Var2.f17943a == fn0Var && str.equals(bp0Var2.m20643b())) {
                        bp0Var = bp0Var2;
                        break;
                    }
                }
            } else {
                bp0Var = zzy.m20978d(fn0Var);
            }
            if (bp0Var != null) {
                yk0.zzj("Precache task is already running.");
                return;
            }
            if (fn0Var.zzm() == null) {
                yk0.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer m24342b4 = m24342b(map, "player");
            if (m24342b4 == null) {
                m24342b4 = 0;
            }
            if (m24342b != null) {
                fn0Var.mo22100z(m24342b.intValue());
            }
            if (m24342b2 != null) {
                fn0Var.mo22090Q(m24342b2.intValue());
            }
            if (m24342b3 != null) {
                fn0Var.mo22091Y(m24342b3.intValue());
            }
            int intValue = m24342b4.intValue();
            vo0 vo0Var = fn0Var.zzm().zzb;
            if (intValue > 0) {
                int m27657Z = wm0.m27657Z();
                if (m27657Z < en0Var.f19706h) {
                    kp0Var = new tp0(fn0Var, en0Var);
                } else if (m27657Z < en0Var.f19700b) {
                    kp0Var = new qp0(fn0Var, en0Var);
                } else {
                    kp0Var = new op0(fn0Var);
                }
            } else {
                kp0Var = new np0(fn0Var);
            }
            new bp0(fn0Var, kp0Var, str, strArr).zzb();
        } else {
            bp0 m20978d = zzy.m20978d(fn0Var);
            if (m20978d != null) {
                kp0Var = m20978d.f17944b;
            } else {
                yk0.zzj("Precache must specify a source.");
                return;
            }
        }
        Integer m24342b5 = m24342b(map, "minBufferMs");
        if (m24342b5 != null) {
            kp0Var.mo24002r(m24342b5.intValue());
        }
        Integer m24342b6 = m24342b(map, "maxBufferMs");
        if (m24342b6 != null) {
            kp0Var.mo24001q(m24342b6.intValue());
        }
        Integer m24342b7 = m24342b(map, "bufferForPlaybackMs");
        if (m24342b7 != null) {
            kp0Var.mo23999o(m24342b7.intValue());
        }
        Integer m24342b8 = m24342b(map, "bufferForPlaybackAfterRebufferMs");
        if (m24342b8 != null) {
            kp0Var.mo24000p(m24342b8.intValue());
        }
    }
}
