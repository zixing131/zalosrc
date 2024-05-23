package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u12 extends v12 {

    /* renamed from: h */
    private static final SparseArray f28700h;

    /* renamed from: c */
    private final Context f28701c;

    /* renamed from: d */
    private final b71 f28702d;

    /* renamed from: e */
    private final TelephonyManager f28703e;

    /* renamed from: f */
    private final m12 f28704f;

    /* renamed from: g */
    private int f28705g;

    static {
        SparseArray sparseArray = new SparseArray();
        f28700h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC4478ev.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC4478ev enumC4478ev = EnumC4478ev.CONNECTING;
        sparseArray.put(ordinal, enumC4478ev);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC4478ev);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC4478ev);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC4478ev.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC4478ev enumC4478ev2 = EnumC4478ev.DISCONNECTED;
        sparseArray.put(ordinal2, enumC4478ev2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC4478ev2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC4478ev2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC4478ev2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC4478ev2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC4478ev.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC4478ev);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC4478ev);
    }

    public u12(Context context, b71 b71Var, m12 m12Var, i12 i12Var, zzg zzgVar) {
        super(i12Var, zzgVar);
        this.f28701c = context;
        this.f28702d = b71Var;
        this.f28704f = m12Var;
        this.f28703e = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ C5070uu m26815b(u12 u12Var, Bundle bundle) {
        C4810nu m27051F = C5070uu.m27051F();
        int i11 = bundle.getInt("cnt", -2);
        int i12 = bundle.getInt("gnt", 0);
        int i13 = 2;
        if (i11 == -1) {
            u12Var.f28705g = 2;
        } else {
            u12Var.f28705g = 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    m27051F.m25012r(1);
                } else {
                    m27051F.m25012r(3);
                }
            } else {
                m27051F.m25012r(2);
            }
            switch (i12) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i13 = 3;
                    break;
                case 13:
                    i13 = 5;
                    break;
                default:
                    i13 = 1;
                    break;
            }
            m27051F.m25011q(i13);
        }
        return (C5070uu) m27051F.m25898n();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ EnumC4478ev m26816c(u12 u12Var, Bundle bundle) {
        return (EnumC4478ev) f28700h.get(nr2.m24982a(nr2.m24982a(bundle, "device"), "network").getInt("active_network_state", -1), EnumC4478ev.UNSPECIFIED);
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ byte[] m26818f(u12 u12Var, boolean z11, ArrayList arrayList, C5070uu c5070uu, EnumC4478ev enumC4478ev) {
        boolean z12;
        C5219yu m28620N = C5256zu.m28620N();
        m28620N.m28346q(arrayList);
        boolean z13 = false;
        if (Settings.Global.getInt(u12Var.f28701c.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m28620N.m28354z(m26819g(z12));
        m28620N.m28342A(zzt.zzq().zzh(u12Var.f28701c, u12Var.f28703e));
        m28620N.m28351w(u12Var.f28704f.m24439e());
        m28620N.m28350v(u12Var.f28704f.m24436b());
        m28620N.m28347r(u12Var.f28704f.m24435a());
        m28620N.m28348s(enumC4478ev);
        m28620N.m28349u(c5070uu);
        m28620N.m28343B(u12Var.f28705g);
        m28620N.m28344C(m26819g(z11));
        m28620N.m28353y(u12Var.f28704f.m24438d());
        m28620N.m28352x(zzt.zzB().mo105913a());
        if (Settings.Global.getInt(u12Var.f28701c.getContentResolver(), "wifi_on", 0) != 0) {
            z13 = true;
        }
        m28620N.m28345D(m26819g(z13));
        return ((C5256zu) m28620N.m25898n()).mo27346a();
    }

    /* renamed from: g */
    private static final int m26819g(boolean z11) {
        return z11 ? 2 : 1;
    }

    /* renamed from: e */
    public final void m26820e(boolean z11) {
        kc3.m23886r(this.f28702d.m20425b(), new t12(this, z11), kl0.f23368f);
    }
}
