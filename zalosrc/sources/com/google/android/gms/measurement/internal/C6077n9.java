package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C5296b;
import com.google.android.gms.internal.measurement.C5300b3;
import com.google.android.gms.internal.measurement.C5302b5;
import com.google.android.gms.internal.measurement.C5334d3;
import com.google.android.gms.internal.measurement.C5336d5;
import com.google.android.gms.internal.measurement.C5353e5;
import com.google.android.gms.internal.measurement.C5370f5;
import com.google.android.gms.internal.measurement.C5403h4;
import com.google.android.gms.internal.measurement.C5419i3;
import com.google.android.gms.internal.measurement.C5425i9;
import com.google.android.gms.internal.measurement.C5437j4;
import com.google.android.gms.internal.measurement.C5453k3;
import com.google.android.gms.internal.measurement.C5454k4;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5522o4;
import com.google.android.gms.internal.measurement.C5538p3;
import com.google.android.gms.internal.measurement.C5539p4;
import com.google.android.gms.internal.measurement.C5617te;
import com.google.android.gms.internal.measurement.C5624u4;
import com.google.android.gms.internal.measurement.C5641v4;
import com.google.android.gms.internal.measurement.C5658w4;
import com.google.android.gms.internal.measurement.C5684xd;
import com.google.android.gms.internal.measurement.InterfaceC5630ua;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p230i6.AbstractC20325q;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* loaded from: classes.dex */
public final class C6077n9 extends AbstractC6208z8 {
    public C6077n9(C6055l9 c6055l9) {
        super(c6055l9);
    }

    /* renamed from: C */
    public static InterfaceC5630ua m31151C(InterfaceC5630ua interfaceC5630ua, byte[] bArr) {
        C5425i9 m29212a = C5425i9.m29212a();
        if (m29212a != null) {
            return interfaceC5630ua.mo29154o0(bArr, m29212a);
        }
        return interfaceC5630ua.mo29151K(bArr);
    }

    /* renamed from: H */
    public static List m31152H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = 0;
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = (i11 * 64) + i12;
                if (i13 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i13)) {
                    j11 |= 1 << i12;
                }
            }
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m31153L(List list, int i11) {
        if (i11 < list.size() * 64) {
            if (((1 << (i11 % 64)) & ((Long) list.get(i11 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m31154N(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public static final void m31155P(C5454k4 c5454k4, String str, Object obj) {
        List m29346E = c5454k4.m29346E();
        int i11 = 0;
        while (true) {
            if (i11 < m29346E.size()) {
                if (str.equals(((C5539p4) m29346E.get(i11)).m29518G())) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        C5522o4 m29501E = C5539p4.m29501E();
        m29501E.m29482y(str);
        if (obj instanceof Long) {
            m29501E.m29481x(((Long) obj).longValue());
        }
        if (i11 >= 0) {
            c5454k4.m29357y(i11, m29501E);
        } else {
            c5454k4.m29352s(m29501E);
        }
    }

    /* renamed from: l */
    public static final boolean m31156l(zzaw zzawVar, zzq zzqVar) {
        AbstractC4205o.m19722k(zzawVar);
        AbstractC4205o.m19722k(zzqVar);
        if (TextUtils.isEmpty(zzqVar.f34703q) && TextUtils.isEmpty(zzqVar.f34692F)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final C5539p4 m31157m(C5471l4 c5471l4, String str) {
        for (C5539p4 c5539p4 : c5471l4.m29399I()) {
            if (c5539p4.m29518G().equals(str)) {
                return c5539p4;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static final Object m31158n(C5471l4 c5471l4, String str) {
        C5539p4 m31157m = m31157m(c5471l4, str);
        if (m31157m != null) {
            if (m31157m.m29525Y()) {
                return m31157m.m29519H();
            }
            if (m31157m.m29523W()) {
                return Long.valueOf(m31157m.m29517D());
            }
            if (m31157m.m29521U()) {
                return Double.valueOf(m31157m.m29514A());
            }
            if (m31157m.m29516C() > 0) {
                List<C5539p4> m29520I = m31157m.m29520I();
                ArrayList arrayList = new ArrayList();
                for (C5539p4 c5539p4 : m29520I) {
                    if (c5539p4 != null) {
                        Bundle bundle = new Bundle();
                        for (C5539p4 c5539p42 : c5539p4.m29520I()) {
                            if (c5539p42.m29525Y()) {
                                bundle.putString(c5539p42.m29518G(), c5539p42.m29519H());
                            } else if (c5539p42.m29523W()) {
                                bundle.putLong(c5539p42.m29518G(), c5539p42.m29517D());
                            } else if (c5539p42.m29521U()) {
                                bundle.putDouble(c5539p42.m29518G(), c5539p42.m29514A());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: o */
    private final void m31159o(StringBuilder sb2, int i11, List list) {
        String str;
        String str2;
        Long l11;
        if (list == null) {
            return;
        }
        int i12 = i11 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5539p4 c5539p4 = (C5539p4) it.next();
            if (c5539p4 != null) {
                m31161q(sb2, i12);
                sb2.append("param {\n");
                Double d11 = null;
                if (c5539p4.m29524X()) {
                    str = this.f34158a.m31372D().m30965e(c5539p4.m29518G());
                } else {
                    str = null;
                }
                m31164t(sb2, i12, "name", str);
                if (c5539p4.m29525Y()) {
                    str2 = c5539p4.m29519H();
                } else {
                    str2 = null;
                }
                m31164t(sb2, i12, "string_value", str2);
                if (c5539p4.m29523W()) {
                    l11 = Long.valueOf(c5539p4.m29517D());
                } else {
                    l11 = null;
                }
                m31164t(sb2, i12, "int_value", l11);
                if (c5539p4.m29521U()) {
                    d11 = Double.valueOf(c5539p4.m29514A());
                }
                m31164t(sb2, i12, "double_value", d11);
                if (c5539p4.m29516C() > 0) {
                    m31159o(sb2, i12, c5539p4.m29520I());
                }
                m31161q(sb2, i12);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: p */
    private final void m31160p(StringBuilder sb2, int i11, C5334d3 c5334d3) {
        String str;
        if (c5334d3 == null) {
            return;
        }
        m31161q(sb2, i11);
        sb2.append("filter {\n");
        if (c5334d3.m29050H()) {
            m31164t(sb2, i11, "complement", Boolean.valueOf(c5334d3.m29049G()));
        }
        if (c5334d3.m29052J()) {
            m31164t(sb2, i11, "param_name", this.f34158a.m31372D().m30965e(c5334d3.m29048E()));
        }
        if (c5334d3.m29053L()) {
            int i12 = i11 + 1;
            C5538p3 m29047D = c5334d3.m29047D();
            if (m29047D != null) {
                m31161q(sb2, i12);
                sb2.append("string_filter {\n");
                if (m29047D.m29499I()) {
                    switch (m29047D.m29500J()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m31164t(sb2, i12, "match_type", str);
                }
                if (m29047D.m29498H()) {
                    m31164t(sb2, i12, "expression", m29047D.m29494D());
                }
                if (m29047D.m29497G()) {
                    m31164t(sb2, i12, "case_sensitive", Boolean.valueOf(m29047D.m29496F()));
                }
                if (m29047D.m29493A() > 0) {
                    m31161q(sb2, i11 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : m29047D.m29495E()) {
                        m31161q(sb2, i11 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m31161q(sb2, i12);
                sb2.append("}\n");
            }
        }
        if (c5334d3.m29051I()) {
            m31165u(sb2, i11 + 1, "number_filter", c5334d3.m29046C());
        }
        m31161q(sb2, i11);
        sb2.append("}\n");
    }

    /* renamed from: q */
    private static final void m31161q(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
    }

    /* renamed from: r */
    private static final String m31162r(boolean z11, boolean z12, boolean z13) {
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("Dynamic ");
        }
        if (z12) {
            sb2.append("Sequence ");
        }
        if (z13) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* renamed from: s */
    private static final void m31163s(StringBuilder sb2, int i11, String str, C5302b5 c5302b5) {
        Integer num;
        Integer num2;
        Long l11;
        if (c5302b5 == null) {
            return;
        }
        m31161q(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c5302b5.m28937B() != 0) {
            m31161q(sb2, 4);
            sb2.append("results: ");
            int i12 = 0;
            for (Long l12 : c5302b5.m28941I()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (c5302b5.m28939D() != 0) {
            m31161q(sb2, 4);
            sb2.append("status: ");
            int i14 = 0;
            for (Long l13 : c5302b5.m28943L()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l13);
                i14 = i15;
            }
            sb2.append('\n');
        }
        if (c5302b5.m28936A() != 0) {
            m31161q(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i16 = 0;
            for (C5437j4 c5437j4 : c5302b5.m28940H()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                if (c5437j4.m29279H()) {
                    num2 = Integer.valueOf(c5437j4.m29276A());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (c5437j4.m29278G()) {
                    l11 = Long.valueOf(c5437j4.m29277B());
                } else {
                    l11 = null;
                }
                sb2.append(l11);
                i16 = i17;
            }
            sb2.append("}\n");
        }
        if (c5302b5.m28938C() != 0) {
            m31161q(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i18 = 0;
            for (C5336d5 c5336d5 : c5302b5.m28942J()) {
                int i19 = i18 + 1;
                if (i18 != 0) {
                    sb2.append(", ");
                }
                if (c5336d5.m29063I()) {
                    num = Integer.valueOf(c5336d5.m29060B());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                Iterator it = c5336d5.m29062F().iterator();
                int i21 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i22 = i21 + 1;
                    if (i21 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i21 = i22;
                }
                sb2.append("]");
                i18 = i19;
            }
            sb2.append("}\n");
        }
        m31161q(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: t */
    private static final void m31164t(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m31161q(sb2, i11 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: u */
    private static final void m31165u(StringBuilder sb2, int i11, String str, C5419i3 c5419i3) {
        String str2;
        if (c5419i3 == null) {
            return;
        }
        m31161q(sb2, i11);
        sb2.append(str);
        sb2.append(" {\n");
        if (c5419i3.m29198G()) {
            int m29203M = c5419i3.m29203M();
            if (m29203M != 1) {
                if (m29203M != 2) {
                    if (m29203M != 3) {
                        if (m29203M != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            m31164t(sb2, i11, "comparison_type", str2);
        }
        if (c5419i3.m29200I()) {
            m31164t(sb2, i11, "match_as_float", Boolean.valueOf(c5419i3.m29197F()));
        }
        if (c5419i3.m29199H()) {
            m31164t(sb2, i11, "comparison_value", c5419i3.m29194C());
        }
        if (c5419i3.m29202L()) {
            m31164t(sb2, i11, "min_comparison_value", c5419i3.m29196E());
        }
        if (c5419i3.m29201J()) {
            m31164t(sb2, i11, "max_comparison_value", c5419i3.m29195D());
        }
        m31161q(sb2, i11);
        sb2.append("}\n");
    }

    /* renamed from: w */
    public static int m31166w(C5641v4 c5641v4, String str) {
        for (int i11 = 0; i11 < c5641v4.m29759t0(); i11++) {
            if (str.equals(c5641v4.m29748m0(i11).m29129F())) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: A */
    public final zzaw m31167A(C5296b c5296b) {
        String str;
        Object obj;
        Bundle m31179y = m31179y(c5296b.m28902e(), true);
        if (m31179y.containsKey("_o") && (obj = m31179y.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String m106025b = AbstractC20325q.m106025b(c5296b.m28901d());
        if (m106025b == null) {
            m106025b = c5296b.m28901d();
        }
        return new zzaw(m106025b, new zzau(m31179y), str2, c5296b.m28898a());
    }

    /* renamed from: B */
    public final C5471l4 m31168B(C6089p c6089p) {
        C5454k4 m29382E = C5471l4.m29382E();
        m29382E.m29342A(c6089p.f34315e);
        C6111r c6111r = new C6111r(c6089p.f34316f);
        while (c6111r.hasNext()) {
            String next = c6111r.next();
            C5522o4 m29501E = C5539p4.m29501E();
            m29501E.m29482y(next);
            Object m31512M = c6089p.f34316f.m31512M(next);
            AbstractC4205o.m19722k(m31512M);
            m31174J(m29501E, m31512M);
            m29382E.m29352s(m29501E);
        }
        return (C5471l4) m29382E.m29557k();
    }

    /* renamed from: D */
    public final String m31169D(C5624u4 c5624u4) {
        Long l11;
        Long l12;
        Double d11;
        if (c5624u4 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (C5658w4 c5658w4 : c5624u4.m29675D()) {
            if (c5658w4 != null) {
                m31161q(sb2, 1);
                sb2.append("bundle {\n");
                if (c5658w4.m29971r1()) {
                    m31164t(sb2, 1, "protocol_version", Integer.valueOf(c5658w4.m29923B1()));
                }
                C5617te.m29656b();
                if (this.f34158a.m31401z().m30913B(c5658w4.m29956V1(), AbstractC5972e3.f33940q0) && c5658w4.m29974u1()) {
                    m31164t(sb2, 1, "session_stitching_token", c5658w4.m29944M());
                }
                m31164t(sb2, 1, "platform", c5658w4.m29939J());
                if (c5658w4.m29967n1()) {
                    m31164t(sb2, 1, "gmp_version", Long.valueOf(c5658w4.m29940J1()));
                }
                if (c5658w4.m29979z1()) {
                    m31164t(sb2, 1, "uploading_gmp_version", Long.valueOf(c5658w4.m29951P1()));
                }
                if (c5658w4.m29965l1()) {
                    m31164t(sb2, 1, "dynamite_version", Long.valueOf(c5658w4.m29936H1()));
                }
                if (c5658w4.m29962i1()) {
                    m31164t(sb2, 1, "config_version", Long.valueOf(c5658w4.m29932F1()));
                }
                m31164t(sb2, 1, "gmp_app_id", c5658w4.m29933G());
                m31164t(sb2, 1, "admob_app_id", c5658w4.m29955U1());
                m31164t(sb2, 1, "app_id", c5658w4.m29956V1());
                m31164t(sb2, 1, "app_version", c5658w4.m29921B());
                if (c5658w4.m29960g1()) {
                    m31164t(sb2, 1, "app_version_major", Integer.valueOf(c5658w4.m29958b0()));
                }
                m31164t(sb2, 1, "firebase_instance_id", c5658w4.m29931F());
                if (c5658w4.m29964k1()) {
                    m31164t(sb2, 1, "dev_cert_hash", Long.valueOf(c5658w4.m29934G1()));
                }
                m31164t(sb2, 1, "app_store", c5658w4.m29919A());
                if (c5658w4.m29978y1()) {
                    m31164t(sb2, 1, "upload_timestamp_millis", Long.valueOf(c5658w4.m29949O1()));
                }
                if (c5658w4.m29975v1()) {
                    m31164t(sb2, 1, "start_timestamp_millis", Long.valueOf(c5658w4.m29945M1()));
                }
                if (c5658w4.m29966m1()) {
                    m31164t(sb2, 1, "end_timestamp_millis", Long.valueOf(c5658w4.m29938I1()));
                }
                if (c5658w4.m29970q1()) {
                    m31164t(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c5658w4.m29943L1()));
                }
                if (c5658w4.m29969p1()) {
                    m31164t(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c5658w4.m29941K1()));
                }
                m31164t(sb2, 1, "app_instance_id", c5658w4.m29957W1());
                m31164t(sb2, 1, "resettable_device_id", c5658w4.m29942L());
                m31164t(sb2, 1, "ds_id", c5658w4.m29929E());
                if (c5658w4.m29968o1()) {
                    m31164t(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c5658w4.m29922B0()));
                }
                m31164t(sb2, 1, "os_version", c5658w4.m29937I());
                m31164t(sb2, 1, "device_model", c5658w4.m29927D());
                m31164t(sb2, 1, "user_default_language", c5658w4.m29946N());
                if (c5658w4.m29977x1()) {
                    m31164t(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c5658w4.m29928D1()));
                }
                if (c5658w4.m29961h1()) {
                    m31164t(sb2, 1, "bundle_sequential_index", Integer.valueOf(c5658w4.m29959d1()));
                }
                if (c5658w4.m29973t1()) {
                    m31164t(sb2, 1, "service_upload", Boolean.valueOf(c5658w4.m29925C0()));
                }
                m31164t(sb2, 1, "health_monitor", c5658w4.m29935H());
                if (c5658w4.m29972s1()) {
                    m31164t(sb2, 1, "retry_counter", Integer.valueOf(c5658w4.m29926C1()));
                }
                if (c5658w4.m29963j1()) {
                    m31164t(sb2, 1, "consent_signals", c5658w4.m29924C());
                }
                C5684xd.m30030b();
                if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33885G0) && c5658w4.m29976w1()) {
                    m31164t(sb2, 1, "target_os_version", Long.valueOf(c5658w4.m29947N1()));
                }
                List<C5370f5> m29952Q = c5658w4.m29952Q();
                if (m29952Q != null) {
                    for (C5370f5 c5370f5 : m29952Q) {
                        if (c5370f5 != null) {
                            m31161q(sb2, 2);
                            sb2.append("user_property {\n");
                            if (c5370f5.m29133S()) {
                                l11 = Long.valueOf(c5370f5.m29128C());
                            } else {
                                l11 = null;
                            }
                            m31164t(sb2, 2, "set_timestamp_millis", l11);
                            m31164t(sb2, 2, "name", this.f34158a.m31372D().m30966f(c5370f5.m29129F()));
                            m31164t(sb2, 2, "string_value", c5370f5.m29130G());
                            if (c5370f5.m29132R()) {
                                l12 = Long.valueOf(c5370f5.m29127B());
                            } else {
                                l12 = null;
                            }
                            m31164t(sb2, 2, "int_value", l12);
                            if (c5370f5.m29131Q()) {
                                d11 = Double.valueOf(c5370f5.m29126A());
                            } else {
                                d11 = null;
                            }
                            m31164t(sb2, 2, "double_value", d11);
                            m31161q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C5403h4> m29948O = c5658w4.m29948O();
                if (m29948O != null) {
                    for (C5403h4 c5403h4 : m29948O) {
                        if (c5403h4 != null) {
                            m31161q(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c5403h4.m29178L()) {
                                m31164t(sb2, 2, "audience_id", Integer.valueOf(c5403h4.m29174A()));
                            }
                            if (c5403h4.m29179M()) {
                                m31164t(sb2, 2, "new_audience", Boolean.valueOf(c5403h4.m29177J()));
                            }
                            m31163s(sb2, 2, "current_data", c5403h4.m29175D());
                            if (c5403h4.m29180N()) {
                                m31163s(sb2, 2, "previous_data", c5403h4.m29176E());
                            }
                            m31161q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C5471l4> m29950P = c5658w4.m29950P();
                if (m29950P != null) {
                    for (C5471l4 c5471l4 : m29950P) {
                        if (c5471l4 != null) {
                            m31161q(sb2, 2);
                            sb2.append("event {\n");
                            m31164t(sb2, 2, "name", this.f34158a.m31372D().m30964d(c5471l4.m29398H()));
                            if (c5471l4.m29402U()) {
                                m31164t(sb2, 2, "timestamp_millis", Long.valueOf(c5471l4.m29396D()));
                            }
                            if (c5471l4.m29401T()) {
                                m31164t(sb2, 2, "previous_timestamp_millis", Long.valueOf(c5471l4.m29395C()));
                            }
                            if (c5471l4.m29400S()) {
                                m31164t(sb2, 2, "count", Integer.valueOf(c5471l4.m29393A()));
                            }
                            if (c5471l4.m29394B() != 0) {
                                m31159o(sb2, 2, c5471l4.m29399I());
                            }
                            m31161q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m31161q(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: E */
    public final String m31170E(C5300b3 c5300b3) {
        if (c5300b3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c5300b3.m28919P()) {
            m31164t(sb2, 0, "filter_id", Integer.valueOf(c5300b3.m28910B()));
        }
        m31164t(sb2, 0, "event_name", this.f34158a.m31372D().m30964d(c5300b3.m28913G()));
        String m31162r = m31162r(c5300b3.m28915L(), c5300b3.m28916M(), c5300b3.m28917N());
        if (!m31162r.isEmpty()) {
            m31164t(sb2, 0, "filter_type", m31162r);
        }
        if (c5300b3.m28918O()) {
            m31165u(sb2, 1, "event_count_filter", c5300b3.m28912F());
        }
        if (c5300b3.m28909A() > 0) {
            sb2.append("  filters {\n");
            Iterator it = c5300b3.m28914H().iterator();
            while (it.hasNext()) {
                m31160p(sb2, 2, (C5334d3) it.next());
            }
        }
        m31161q(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* renamed from: F */
    public final String m31171F(C5453k3 c5453k3) {
        if (c5453k3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (c5453k3.m29340J()) {
            m31164t(sb2, 0, "filter_id", Integer.valueOf(c5453k3.m29334A()));
        }
        m31164t(sb2, 0, "property_name", this.f34158a.m31372D().m30966f(c5453k3.m29336E()));
        String m31162r = m31162r(c5453k3.m29337G(), c5453k3.m29338H(), c5453k3.m29339I());
        if (!m31162r.isEmpty()) {
            m31164t(sb2, 0, "filter_type", m31162r);
        }
        m31160p(sb2, 1, c5453k3.m29335B());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: G */
    public final List m31172G(List list, List list2) {
        int i11;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f34158a.mo31033c().m31202w().m31109b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f34158a.mo31033c().m31202w().m31110c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i12 = size2;
            i11 = size;
            size = i12;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:            r5 = new java.util.ArrayList();     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:            if (r4 == false) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:            r3 = (android.os.Parcelable[]) r3;        r4 = r3.length;        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:            if (r7 >= r4) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:            r8 = r3[r7];     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:            if ((r8 instanceof android.os.Bundle) == false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:            r5.add(m31173I((android.os.Bundle) r8, false));     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:            r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:            r0.put(r2, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:            if ((r3 instanceof java.util.ArrayList) == false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:            r3 = (java.util.ArrayList) r3;        r4 = r3.size();        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:            if (r7 >= r4) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:            r8 = r3.get(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:            if ((r8 instanceof android.os.Bundle) == false) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:            r5.add(m31173I((android.os.Bundle) r8, false));     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:            r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:            if ((r3 instanceof android.os.Bundle) == false) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:            r5.add(m31173I((android.os.Bundle) r3, false));     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map m31173I(Bundle bundle, boolean z11) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z12 = obj instanceof Parcelable[];
            if (!z12 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public final void m31174J(C5522o4 c5522o4, Object obj) {
        AbstractC4205o.m19722k(obj);
        c5522o4.m29479v();
        c5522o4.m29477s();
        c5522o4.m29476r();
        c5522o4.m29478u();
        if (obj instanceof String) {
            c5522o4.m29483z((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c5522o4.m29481x(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            c5522o4.m29480w(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C5522o4 m29501E = C5539p4.m29501E();
                    for (String str : bundle.keySet()) {
                        C5522o4 m29501E2 = C5539p4.m29501E();
                        m29501E2.m29482y(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            m29501E2.m29481x(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            m29501E2.m29483z((String) obj2);
                        } else if (obj2 instanceof Double) {
                            m29501E2.m29480w(((Double) obj2).doubleValue());
                        }
                        m29501E.m29475q(m29501E2);
                    }
                    if (m29501E.m29473o() > 0) {
                        arrayList.add((C5539p4) m29501E.m29557k());
                    }
                }
            }
            c5522o4.m29474p(arrayList);
            return;
        }
        this.f34158a.mo31033c().m31197q().m31109b("Ignoring invalid (type) event param value", obj);
    }

    /* renamed from: K */
    public final void m31175K(C5353e5 c5353e5, Object obj) {
        AbstractC4205o.m19722k(obj);
        c5353e5.m29075q();
        c5353e5.m29074p();
        c5353e5.m29073o();
        if (obj instanceof String) {
            c5353e5.m29080w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c5353e5.m29077s(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c5353e5.m29076r(((Double) obj).doubleValue());
        } else {
            this.f34158a.mo31033c().m31197q().m31109b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: M */
    public final boolean m31176M(long j11, long j12) {
        if (j11 != 0 && j12 > 0 && Math.abs(this.f34158a.mo31031a().mo105913a() - j11) <= j12) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public final byte[] m31177O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            this.f34158a.mo31033c().m31197q().m31109b("Failed to gzip content", e11);
            throw e11;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        return false;
    }

    /* renamed from: x */
    public final long m31178x(byte[] bArr) {
        AbstractC4205o.m19722k(bArr);
        this.f34158a.m31381N().mo31036g();
        MessageDigest m31311s = C6121r9.m31311s();
        if (m31311s == null) {
            this.f34158a.mo31033c().m31197q().m31108a("Failed to get MD5");
            return 0L;
        }
        return C6121r9.m31312s0(m31311s.digest(bArr));
    }

    /* renamed from: y */
    final Bundle m31179y(Map map, boolean z11) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z11) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList2.add(m31179y((Map) arrayList.get(i11), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* renamed from: z */
    public final Parcelable m31180z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f34158a.mo31033c().m31197q().m31108a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
