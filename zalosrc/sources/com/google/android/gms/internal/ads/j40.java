package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import p229i5.AbstractC20286g;

/* loaded from: classes2.dex */
public final class j40 implements c40 {

    /* renamed from: d */
    static final Map f22627d = AbstractC20286g.m105920e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final zzb f22628a;

    /* renamed from: b */
    private final jc0 f22629b;

    /* renamed from: c */
    private final rc0 f22630c;

    public j40(zzb zzbVar, jc0 jc0Var, rc0 rc0Var) {
        this.f22628a = zzbVar;
        this.f22629b = jc0Var;
        this.f22630c = rc0Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        int intValue = ((Integer) f22627d.get((String) map.get("a"))).intValue();
        int i11 = 6;
        boolean z11 = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (this.f22628a.zzc()) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 6) {
                                        if (intValue != 7) {
                                            yk0.zzi("Unknown MRAID command called.");
                                            return;
                                        }
                                    } else {
                                        this.f22629b.m23596h(true);
                                        return;
                                    }
                                }
                            } else {
                                new hc0(zq0Var, map).m22783j();
                                return;
                            }
                        } else {
                            new nc0(zq0Var, map).m24884i();
                            return;
                        }
                    } else {
                        this.f22629b.m23597i(map);
                        return;
                    }
                } else {
                    this.f22628a.zzb(null);
                    return;
                }
            }
            this.f22630c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z11 = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zq0Var == null) {
            yk0.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i11 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z11) {
                i11 = -1;
            } else {
                i11 = 14;
            }
        }
        zq0Var.mo26676K(i11);
    }
}
