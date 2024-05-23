package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class kx2 {

    /* renamed from: a */
    private final p62 f23632a;

    /* renamed from: b */
    private final String f23633b;

    /* renamed from: c */
    private final String f23634c;

    /* renamed from: d */
    private final String f23635d;

    /* renamed from: e */
    private final Context f23636e;

    /* renamed from: f */
    private final uq2 f23637f;

    /* renamed from: g */
    private final vq2 f23638g;

    /* renamed from: h */
    private final InterfaceC20285f f23639h;

    /* renamed from: i */
    private final C4830od f23640i;

    public kx2(p62 p62Var, zzcgv zzcgvVar, String str, String str2, Context context, uq2 uq2Var, vq2 vq2Var, InterfaceC20285f interfaceC20285f, C4830od c4830od) {
        this.f23632a = p62Var;
        this.f23633b = zzcgvVar.f32030p;
        this.f23634c = str;
        this.f23635d = str2;
        this.f23636e = context;
        this.f23637f = uq2Var;
        this.f23638g = vq2Var;
        this.f23639h = interfaceC20285f;
        this.f23640i = c4830od;
    }

    /* renamed from: f */
    public static final List m24077f(int i11, int i12, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m24079h((String) it.next(), "@gw_mpe@", "2." + i12));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static String m24078g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (xk0.m27903l()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }

    /* renamed from: h */
    private static String m24079h(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: c */
    public final List m24080c(tq2 tq2Var, iq2 iq2Var, List list) {
        return m24081d(tq2Var, iq2Var, false, "", "", list);
    }

    /* renamed from: d */
    public final List m24081d(tq2 tq2Var, iq2 iq2Var, boolean z11, String str, String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        if (true != z11) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String m24079h = m24079h(m24079h(m24079h((String) it.next(), "@gw_adlocid@", tq2Var.f28472a.f26941a.f19400f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f23633b);
            if (iq2Var != null) {
                m24079h = fj0.m22027c(m24079h(m24079h(m24079h(m24079h, "@gw_qdata@", iq2Var.f22354z), "@gw_adnetid@", iq2Var.f22353y), "@gw_allocid@", iq2Var.f22352x), this.f23636e, iq2Var.f22310X);
            }
            String m24079h2 = m24079h(m24079h(m24079h(m24079h, "@gw_adnetstatus@", this.f23632a.m25411f()), "@gw_seqnum@", this.f23634c), "@gw_sessid@", this.f23635d);
            boolean z12 = false;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21014I2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (!z12) {
                if (z13) {
                    z13 = true;
                } else {
                    arrayList.add(m24079h2);
                }
            }
            if (this.f23640i.m25163f(Uri.parse(m24079h2))) {
                Uri.Builder buildUpon = Uri.parse(m24079h2).buildUpon();
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z13) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                m24079h2 = buildUpon.build().toString();
            }
            arrayList.add(m24079h2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[LOOP:0: B:10:0x005a->B:12:0x0060, LOOP_END] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m24082e(iq2 iq2Var, List list, cg0 cg0Var) {
        uq2 uq2Var;
        f53 m21948d;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long mo105913a = this.f23639h.mo105913a();
        try {
            String zzc = cg0Var.zzc();
            String num = Integer.toString(cg0Var.zzb());
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21024J2)).booleanValue()) {
                vq2 vq2Var = this.f23638g;
                if (vq2Var == null) {
                    m21948d = f53.m21947c();
                    String str = (String) m21948d.mo21949a(ix2.f22539a).mo21950b("");
                    String str2 = (String) m21948d.mo21949a(jx2.f23023a).mo21950b("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fj0.m22027c(m24079h(m24079h(m24079h(m24079h(m24079h(m24079h((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(mo105913a)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f23633b), this.f23636e, iq2Var.f22310X));
                    }
                    return arrayList;
                }
                uq2Var = vq2Var.f29452a;
            } else {
                uq2Var = this.f23637f;
            }
            m21948d = f53.m21948d(uq2Var);
            String str3 = (String) m21948d.mo21949a(ix2.f22539a).mo21950b("");
            String str22 = (String) m21948d.mo21949a(jx2.f23023a).mo21950b("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e11) {
            yk0.zzh("Unable to determine award type and amount.", e11);
            return arrayList;
        }
    }
}
