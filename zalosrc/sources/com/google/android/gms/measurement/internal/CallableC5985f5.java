package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5353e5;
import com.google.android.gms.internal.measurement.C5370f5;
import com.google.android.gms.internal.measurement.C5454k4;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5488m4;
import com.google.android.gms.internal.measurement.C5505n4;
import com.google.android.gms.internal.measurement.C5522o4;
import com.google.android.gms.internal.measurement.C5539p4;
import com.google.android.gms.internal.measurement.C5607t4;
import com.google.android.gms.internal.measurement.C5617te;
import com.google.android.gms.internal.measurement.C5624u4;
import com.google.android.gms.internal.measurement.C5641v4;
import com.google.android.gms.internal.measurement.C5658w4;
import com.google.android.gms.internal.measurement.C5675x4;
import com.google.android.gms.internal.measurement.C5684xd;
import com.google.android.gms.internal.measurement.C5709z4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p230i6.C20307b;
import p230i6.EnumC20305a;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes2.dex */
final class CallableC5985f5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzaw f33991a;

    /* renamed from: b */
    final /* synthetic */ String f33992b;

    /* renamed from: c */
    final /* synthetic */ BinderC6040k5 f33993c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5985f5(BinderC6040k5 binderC6040k5, zzaw zzawVar, String str) {
        this.f33993c = binderC6040k5;
        this.f33991a = zzawVar;
        this.f33992b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        C6099p9 c6099p9;
        C6084o5 c6084o5;
        C5607t4 c5607t4;
        String str;
        Bundle bundle;
        C5641v4 c5641v4;
        String str2;
        C6100q m31280c;
        long j11;
        byte[] bArr;
        C6055l9 c6055l93;
        c6055l9 = this.f33993c.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f33993c.f34135p;
        C6173w6 m31081d0 = c6055l92.m31081d0();
        zzaw zzawVar = this.f33991a;
        String str3 = this.f33992b;
        m31081d0.mo31036g();
        C6127s4.m31365s();
        AbstractC4205o.m19722k(zzawVar);
        AbstractC4205o.m19718g(str3);
        if (!m31081d0.f34158a.m31401z().m30913B(str3, AbstractC5972e3.f33903W)) {
            m31081d0.f34158a.mo31033c().m31196p().m31109b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        }
        if (!"_iap".equals(zzawVar.f34676p) && !"_iapx".equals(zzawVar.f34676p)) {
            m31081d0.f34158a.mo31033c().m31196p().m31110c("Generating a payload for this event is not available. package_name, event_name", str3, zzawVar.f34676p);
            return null;
        }
        C5607t4 m29671A = C5624u4.m29671A();
        m31081d0.f34628b.m31074W().m31002e0();
        try {
            C6084o5 m30990R = m31081d0.f34628b.m31074W().m30990R(str3);
            if (m30990R == null) {
                m31081d0.f34158a.mo31033c().m31196p().m31109b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                c6055l93 = m31081d0.f34628b;
            } else if (!m30990R.m31217M()) {
                m31081d0.f34158a.mo31033c().m31196p().m31109b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                c6055l93 = m31081d0.f34628b;
            } else {
                C5641v4 m29872R1 = C5658w4.m29872R1();
                m29872R1.m29736Y(1);
                m29872R1.m29731T("android");
                if (!TextUtils.isEmpty(m30990R.m31248i0())) {
                    m29872R1.m29755r(m30990R.m31248i0());
                }
                if (!TextUtils.isEmpty(m30990R.m31252k0())) {
                    m29872R1.m29760u((String) AbstractC4205o.m19722k(m30990R.m31252k0()));
                }
                if (!TextUtils.isEmpty(m30990R.m31254l0())) {
                    m29872R1.m29762v((String) AbstractC4205o.m19722k(m30990R.m31254l0()));
                }
                if (m30990R.m31220P() != -2147483648L) {
                    m29872R1.m29764w((int) m30990R.m31220P());
                }
                m29872R1.m29723O(m30990R.m31232a0());
                m29872R1.m29707E(m30990R.m31229Y());
                String m31258n0 = m30990R.m31258n0();
                String m31244g0 = m30990R.m31244g0();
                if (!TextUtils.isEmpty(m31258n0)) {
                    m29872R1.m29721N(m31258n0);
                } else if (!TextUtils.isEmpty(m31244g0)) {
                    m29872R1.m29753q(m31244g0);
                }
                C5684xd.m30030b();
                if (m31081d0.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33885G0)) {
                    m29872R1.m29742f0(m30990R.m31240e0());
                }
                C20307b m31073V = m31081d0.f34628b.m31073V(str3);
                m29872R1.m29701B(m30990R.m31228X());
                if (m31081d0.f34158a.m31394n() && m31081d0.f34158a.m31401z().m30914C(m29872R1.m29749n0()) && m31073V.m106014i(EnumC20305a.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    m29872R1.m29705D(null);
                }
                m29872R1.m29699A(m31073V.m106013h());
                if (m31073V.m106014i(EnumC20305a.AD_STORAGE) && m30990R.m31216L()) {
                    Pair m30948m = m31081d0.f34628b.m31083e0().m30948m(m30990R.m31248i0(), m31073V);
                    if (m30990R.m31216L() && !TextUtils.isEmpty((CharSequence) m30948m.first)) {
                        try {
                            m29872R1.m29737a0(C6173w6.m31474d((String) m30948m.first, Long.toString(zzawVar.f34679s)));
                            Object obj = m30948m.second;
                            if (obj != null) {
                                m29872R1.m29728R(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e11) {
                            m31081d0.f34158a.mo31033c().m31196p().m31109b("Resettable device id encryption failed", e11.getMessage());
                            bArr = new byte[0];
                            c6055l93 = m31081d0.f34628b;
                        }
                    }
                }
                m31081d0.f34158a.m31369A().m31140j();
                m29872R1.m29703C(Build.MODEL);
                m31081d0.f34158a.m31369A().m31140j();
                m29872R1.m29730S(Build.VERSION.RELEASE);
                m29872R1.m29743g0((int) m31081d0.f34158a.m31369A().m31182o());
                m29872R1.m29747l0(m31081d0.f34158a.m31369A().m31183p());
                try {
                    if (m31073V.m106014i(EnumC20305a.ANALYTICS_STORAGE) && m30990R.m31250j0() != null) {
                        m29872R1.m29757s(C6173w6.m31474d((String) AbstractC4205o.m19722k(m30990R.m31250j0()), Long.toString(zzawVar.f34679s)));
                    }
                    if (!TextUtils.isEmpty(m30990R.m31256m0())) {
                        m29872R1.m29718L((String) AbstractC4205o.m19722k(m30990R.m31256m0()));
                    }
                    String m31248i0 = m30990R.m31248i0();
                    List m31000c0 = m31081d0.f34628b.m31074W().m31000c0(m31248i0);
                    Iterator it = m31000c0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c6099p9 = (C6099p9) it.next();
                            if ("_lte".equals(c6099p9.f34340c)) {
                                break;
                            }
                        } else {
                            c6099p9 = null;
                            break;
                        }
                    }
                    if (c6099p9 == null || c6099p9.f34342e == null) {
                        C6099p9 c6099p92 = new C6099p9(m31248i0, "auto", "_lte", m31081d0.f34158a.mo31031a().mo105913a(), 0L);
                        m31000c0.add(c6099p92);
                        m31081d0.f34628b.m31074W().m31017x(c6099p92);
                    }
                    C6077n9 m31085g0 = m31081d0.f34628b.m31085g0();
                    m31085g0.f34158a.mo31033c().m31201u().m31108a("Checking account type status for ad personalization signals");
                    if (m31085g0.f34158a.m31369A().m31185r()) {
                        String m31248i02 = m30990R.m31248i0();
                        AbstractC4205o.m19722k(m31248i02);
                        if (m30990R.m31216L() && m31085g0.f34628b.m31078a0().m31120B(m31248i02)) {
                            m31085g0.f34158a.mo31033c().m31196p().m31108a("Turning off ad personalization due to account type");
                            Iterator it2 = m31000c0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(((C6099p9) it2.next()).f34340c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            m31000c0.add(new C6099p9(m31248i02, "auto", "_npa", m31085g0.f34158a.mo31031a().mo105913a(), 1L));
                        }
                    }
                    C5370f5[] c5370f5Arr = new C5370f5[m31000c0.size()];
                    for (int i11 = 0; i11 < m31000c0.size(); i11++) {
                        C5353e5 m29116D = C5370f5.m29116D();
                        m29116D.m29078u(((C6099p9) m31000c0.get(i11)).f34340c);
                        m29116D.m29079v(((C6099p9) m31000c0.get(i11)).f34341d);
                        m31081d0.f34628b.m31085g0().m31175K(m29116D, ((C6099p9) m31000c0.get(i11)).f34342e);
                        c5370f5Arr[i11] = (C5370f5) m29116D.m29557k();
                    }
                    m29872R1.m29702B0(Arrays.asList(c5370f5Arr));
                    C6093p3 m31273b = C6093p3.m31273b(zzawVar);
                    m31081d0.f34158a.m31381N().m31362z(m31273b.f34323d, m31081d0.f34628b.m31074W().m30989Q(str3));
                    m31081d0.f34158a.m31381N().m31316B(m31273b, m31081d0.f34158a.m31401z().m30923m(str3));
                    Bundle bundle2 = m31273b.f34323d;
                    bundle2.putLong("_c", 1L);
                    m31081d0.f34158a.mo31033c().m31196p().m31108a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzawVar.f34678r);
                    if (m31081d0.f34158a.m31381N().m31335U(m29872R1.m29749n0())) {
                        m31081d0.f34158a.m31381N().m31318D(bundle2, "_dbg", 1L);
                        m31081d0.f34158a.m31381N().m31318D(bundle2, "_r", 1L);
                    }
                    C6100q m30994V = m31081d0.f34628b.m31074W().m30994V(str3, zzawVar.f34676p);
                    if (m30994V == null) {
                        c5641v4 = m29872R1;
                        c6084o5 = m30990R;
                        c5607t4 = m29671A;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        m31280c = new C6100q(str3, zzawVar.f34676p, 0L, 0L, 0L, zzawVar.f34679s, 0L, null, null, null, null);
                        j11 = 0;
                    } else {
                        c6084o5 = m30990R;
                        c5607t4 = m29671A;
                        str = str3;
                        bundle = bundle2;
                        c5641v4 = m29872R1;
                        str2 = null;
                        long j12 = m30994V.f34348f;
                        m31280c = m30994V.m31280c(zzawVar.f34679s);
                        j11 = j12;
                    }
                    m31081d0.f34628b.m31074W().m31010p(m31280c);
                    C6089p c6089p = new C6089p(m31081d0.f34158a, zzawVar.f34678r, str, zzawVar.f34676p, zzawVar.f34679s, j11, bundle);
                    C5454k4 m29382E = C5471l4.m29382E();
                    m29382E.m29343B(c6089p.f34314d);
                    m29382E.m29356x(c6089p.f34312b);
                    m29382E.m29342A(c6089p.f34315e);
                    C6111r c6111r = new C6111r(c6089p.f34316f);
                    while (c6111r.hasNext()) {
                        String next = c6111r.next();
                        C5522o4 m29501E = C5539p4.m29501E();
                        m29501E.m29482y(next);
                        Object m31512M = c6089p.f34316f.m31512M(next);
                        if (m31512M != null) {
                            m31081d0.f34628b.m31085g0().m31174J(m29501E, m31512M);
                            m29382E.m29352s(m29501E);
                        }
                    }
                    C5641v4 c5641v42 = c5641v4;
                    c5641v42.m29704C0(m29382E);
                    C5675x4 m30105A = C5709z4.m30105A();
                    C5488m4 m29460A = C5505n4.m29460A();
                    m29460A.m29436o(m31280c.f34345c);
                    m29460A.m29437p(zzawVar.f34676p);
                    m30105A.m30011o(m29460A);
                    c5641v42.m29733V(m30105A);
                    c5641v42.m29767x0(m31081d0.f34628b.m31071T().m30802l(c6084o5.m31248i0(), Collections.emptyList(), c5641v42.m29758s0(), Long.valueOf(m29382E.m29350q()), Long.valueOf(m29382E.m29350q())));
                    if (m29382E.m29347G()) {
                        c5641v42.m29741e0(m29382E.m29350q());
                        c5641v42.m29710G(m29382E.m29350q());
                    }
                    long m31234b0 = c6084o5.m31234b0();
                    if (m31234b0 != 0) {
                        c5641v42.m29734W(m31234b0);
                    }
                    long m31238d0 = c6084o5.m31238d0();
                    if (m31238d0 != 0) {
                        c5641v42.m29735X(m31238d0);
                    } else if (m31234b0 != 0) {
                        c5641v42.m29735X(m31234b0);
                    }
                    String m31235c = c6084o5.m31235c();
                    C5617te.m29656b();
                    String str4 = str;
                    if (m31081d0.f34158a.m31401z().m30913B(str4, AbstractC5972e3.f33940q0) && m31235c != null) {
                        c5641v42.m29740d0(m31235c);
                    }
                    c6084o5.m31241f();
                    c5641v42.m29766x((int) c6084o5.m31236c0());
                    m31081d0.f34158a.m31401z().m30926p();
                    c5641v42.m29745j0(76003L);
                    c5641v42.m29744h0(m31081d0.f34158a.mo31031a().mo105913a());
                    c5641v42.m29739c0(true);
                    if (m31081d0.f34158a.m31401z().m30913B(str2, AbstractC5972e3.f33948u0)) {
                        m31081d0.f34628b.m31084g(c5641v42.m29749n0(), c5641v42);
                    }
                    C5607t4 c5607t42 = c5607t4;
                    c5607t42.m29608o(c5641v42);
                    C6084o5 c6084o52 = c6084o5;
                    c6084o52.m31208D(c5641v42.m29763v0());
                    c6084o52.m31206B(c5641v42.m29761u0());
                    m31081d0.f34628b.m31074W().m31009o(c6084o52);
                    m31081d0.f34628b.m31074W().m31008n();
                    m31081d0.f34628b.m31074W().m31003f0();
                    try {
                        return m31081d0.f34628b.m31085g0().m31177O(((C5624u4) c5607t42.m29557k()).m29188f());
                    } catch (IOException e12) {
                        m31081d0.f34158a.mo31033c().m31197q().m31110c("Data loss. Failed to bundle and serialize. appId", C6082o3.m31193z(str4), e12);
                        return str2;
                    }
                } catch (SecurityException e13) {
                    m31081d0.f34158a.mo31033c().m31196p().m31109b("app instance id encryption failed", e13.getMessage());
                    byte[] bArr2 = new byte[0];
                    m31081d0.f34628b.m31074W().m31003f0();
                    return bArr2;
                }
            }
            c6055l93.m31074W().m31003f0();
            return bArr;
        } catch (Throwable th2) {
            m31081d0.f34628b.m31074W().m31003f0();
            throw th2;
        }
    }
}
