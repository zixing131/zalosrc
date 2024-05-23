package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x */
/* loaded from: classes2.dex */
public abstract class AbstractC5151x {
    /* renamed from: a */
    public static int m27757a(int i11) {
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    /* renamed from: b */
    public static zzbq m27758b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = (String) list.get(i11);
            String[] m22315I = g92.m22315I(str, "=");
            if (m22315I.length != 2) {
                lr1.m24356e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (m22315I[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaci.m28673a(new x02(Base64.decode(m22315I[1], 0))));
                } catch (RuntimeException e11) {
                    lr1.m24357f("VorbisUtil", "Failed to parse vorbis picture", e11);
                }
            } else {
                arrayList.add(new zzady(m22315I[0], m22315I[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* renamed from: c */
    public static C5039u m27759c(x02 x02Var, boolean z11, boolean z12) {
        if (z11) {
            m27760d(3, x02Var, false);
        }
        String m27767F = x02Var.m27767F((int) x02Var.m27794y(), w43.f29782c);
        long m27794y = x02Var.m27794y();
        String[] strArr = new String[(int) m27794y];
        int length = m27767F.length() + 15;
        for (int i11 = 0; i11 < m27794y; i11++) {
            String m27767F2 = x02Var.m27767F((int) x02Var.m27794y(), w43.f29782c);
            strArr[i11] = m27767F2;
            length = length + 4 + m27767F2.length();
        }
        if (z12 && (x02Var.m27788s() & 1) == 0) {
            throw zzbu.m28711a("framing bit expected to be set", null);
        }
        return new C5039u(m27767F, strArr, length + 1);
    }

    /* renamed from: d */
    public static boolean m27760d(int i11, x02 x02Var, boolean z11) {
        if (x02Var.m27778i() < 7) {
            if (z11) {
                return false;
            }
            throw zzbu.m28711a("too short header: " + x02Var.m27778i(), null);
        }
        if (x02Var.m27788s() != i11) {
            if (z11) {
                return false;
            }
            throw zzbu.m28711a("expected header type ".concat(String.valueOf(Integer.toHexString(i11))), null);
        }
        if (x02Var.m27788s() == 118 && x02Var.m27788s() == 111 && x02Var.m27788s() == 114 && x02Var.m27788s() == 98 && x02Var.m27788s() == 105 && x02Var.m27788s() == 115) {
            return true;
        }
        if (z11) {
            return false;
        }
        throw zzbu.m28711a("expected characters 'vorbis'", null);
    }
}
