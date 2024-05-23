package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jw2 {
    /* renamed from: a */
    public static kw2 m23764a(Context context, int i11) {
        boolean booleanValue;
        if (xw2.m28052a()) {
            int i12 = i11 - 2;
            if (i12 != 20 && i12 != 21) {
                switch (i12) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) AbstractC4963ry.f27407b.m24091e()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue();
            }
            if (booleanValue) {
                return new mw2(context, i11);
            }
        }
        return new hx2();
    }

    /* renamed from: b */
    public static kw2 m23765b(Context context, int i11, int i12, zzl zzlVar) {
        kw2 m23764a = m23764a(context, i11);
        if (!(m23764a instanceof mw2)) {
            return m23764a;
        }
        m23764a.zzf();
        m23764a.mo23065n(i12);
        if (uw2.m27079e(zzlVar.zzp)) {
            m23764a.mo23066o(zzlVar.zzp);
        }
        return m23764a;
    }
}
