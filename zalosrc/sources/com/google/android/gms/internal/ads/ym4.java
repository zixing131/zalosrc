package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ym4 {

    /* renamed from: c */
    private static final Pattern f31038c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f31039a = -1;

    /* renamed from: b */
    public int f31040b = -1;

    /* renamed from: c */
    private final boolean m28267c(String str) {
        Matcher matcher = f31038c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i11 = g92.f20474a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f31039a = parseInt;
                    this.f31040b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m28268a() {
        return (this.f31039a == -1 || this.f31040b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m28269b(zzbq zzbqVar) {
        for (int i11 = 0; i11 < zzbqVar.m28707a(); i11++) {
            zzbp m28708b = zzbqVar.m28708b(i11);
            if (m28708b instanceof zzacw) {
                zzacw zzacwVar = (zzacw) m28708b;
                if ("iTunSMPB".equals(zzacwVar.f31780r) && m28267c(zzacwVar.f31781s)) {
                    return true;
                }
            } else if (m28708b instanceof zzadf) {
                zzadf zzadfVar = (zzadf) m28708b;
                if ("com.apple.iTunes".equals(zzadfVar.f31787q) && "iTunSMPB".equals(zzadfVar.f31788r) && m28267c(zzadfVar.f31789s)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
