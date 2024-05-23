package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.nj */
/* loaded from: classes2.dex */
public final class C4799nj {

    /* renamed from: c */
    public static final InterfaceC4950rl f25209c = new C4762mj();

    /* renamed from: d */
    private static final Pattern f25210d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f25211a = -1;

    /* renamed from: b */
    public int f25212b = -1;

    /* renamed from: a */
    public final boolean m24930a() {
        return (this.f25211a == -1 || this.f25212b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m24931b(zzaxh zzaxhVar) {
        for (int i11 = 0; i11 < zzaxhVar.m28694a(); i11++) {
            zzaxg m28695b = zzaxhVar.m28695b(i11);
            if (m28695b instanceof zzaxl) {
                zzaxl zzaxlVar = (zzaxl) m28695b;
                String str = zzaxlVar.f31860r;
                String str2 = zzaxlVar.f31861s;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f25210d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f25211a = parseInt;
                                this.f25212b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
