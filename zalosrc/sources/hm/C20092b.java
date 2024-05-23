package hm;

import android.text.TextUtils;
import com.adtima.Adtima;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17946a1;
import dj.C17949b1;
import dj.C17952c1;
import dj.C17955d1;
import dj.C17958e1;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17970i1;
import dj.C17972j0;
import dj.C17976k1;
import dj.C17979l1;
import dj.C17981m0;
import dj.C17984n0;
import dj.C17987o0;
import dj.C17990p0;
import dj.C17993q0;
import dj.C17994q1;
import dj.C17996r0;
import dj.C17997r1;
import dj.C17999s0;
import dj.C18002t0;
import dj.C18005u0;
import dj.C18009w0;
import dj.C18011x0;
import dj.C18013y0;
import dj.C18015z0;
import fn0.AbstractC19074t;
import gm.C19490a;
import gm.C19498i;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import if0.C20534g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import me0.AbstractC23008a2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p056cj.C3541i;
import p111du.AbstractC18069a;
import p248iy.AbstractC20887g;
import p471r3.C25630b;
import p620wt.AbstractC29239n;
import p716zh.C31897e4;
import p716zh.C32012m;
import pm0.C24860q;
import tj.C26713e;

/* renamed from: hm.b */
/* loaded from: classes3.dex */
public final class C20092b {

    /* renamed from: a */
    public static final C20092b f98828a = new C20092b();

    private C20092b() {
    }

    /* renamed from: a */
    private final C17969i0 m104472a(C19490a.a aVar, int i11) {
        if (i11 != 0) {
            if (i11 != 6) {
                if (i11 != 10) {
                    if (i11 != 12) {
                        if (i11 != 29) {
                            if (i11 != 45) {
                                if (i11 != 100) {
                                    if (i11 != 2) {
                                        if (i11 != 3 && i11 != 4) {
                                            switch (i11) {
                                                case 18:
                                                    return new C18002t0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 19:
                                                    return new C17961f1(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 20:
                                                    return new C18005u0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 21:
                                                    return new C17984n0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 22:
                                                    return new C17990p0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 23:
                                                    return new C17993q0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 24:
                                                    return new C17967h1(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 25:
                                                    return new C17999s0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                case 26:
                                                    return new C18011x0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                default:
                                                    switch (i11) {
                                                        case 31:
                                                            break;
                                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                            return new C17996r0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                        case 33:
                                                            String str = aVar.f96747g;
                                                            AbstractC19074t.m100207e(str, "title");
                                                            int i12 = aVar.f96741a;
                                                            String str2 = aVar.f96749i;
                                                            AbstractC19074t.m100207e(str2, "thumb");
                                                            String str3 = aVar.f96748h;
                                                            AbstractC19074t.m100207e(str3, "href");
                                                            String str4 = aVar.f96750j;
                                                            AbstractC19074t.m100207e(str4, "description");
                                                            String str5 = aVar.f96746f;
                                                            AbstractC19074t.m100207e(str5, "action");
                                                            String str6 = aVar.f96751k;
                                                            AbstractC19074t.m100207e(str6, "params");
                                                            C17958e1 c17958e1 = new C17958e1(str, i12, str2, str3, str4, str5, str6);
                                                            c17958e1.m95433w(true);
                                                            return c17958e1;
                                                        case 34:
                                                            return new C17987o0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                        case 35:
                                                            return new C17952c1(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                        case 36:
                                                            String str7 = aVar.f96747g;
                                                            AbstractC19074t.m100207e(str7, "title");
                                                            int i13 = aVar.f96741a;
                                                            String str8 = aVar.f96749i;
                                                            AbstractC19074t.m100207e(str8, "thumb");
                                                            String str9 = aVar.f96748h;
                                                            AbstractC19074t.m100207e(str9, "href");
                                                            String str10 = aVar.f96750j;
                                                            AbstractC19074t.m100207e(str10, "description");
                                                            String str11 = aVar.f96746f;
                                                            AbstractC19074t.m100207e(str11, "action");
                                                            String str12 = aVar.f96751k;
                                                            AbstractC19074t.m100207e(str12, "params");
                                                            return new C17958e1(str7, i13, str8, str9, str10, str11, str12);
                                                        default:
                                                            return new C17969i0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                                    }
                                            }
                                        }
                                        return new C18009w0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                    }
                                    return new C17981m0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                                }
                                return new C17972j0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                            }
                            return new C17946a1(aVar.f96751k);
                        }
                        return new C17955d1(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                    }
                    return new C18013y0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
                }
                int i14 = aVar.f96743c;
                int i15 = aVar.f96742b;
                int m146002a = AbstractC29239n.m146002a(aVar.f96744d, -1);
                String str13 = aVar.f96745e;
                AbstractC19074t.m100207e(str13, "extInfo");
                return new C17949b1(new C25630b(i14, i15, m146002a, str13));
            }
            return new C17964g1(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
        }
        return new C18015z0(aVar.f96747g, aVar.f96741a, aVar.f96749i, aVar.f96748h, aVar.f96750j, aVar.f96746f, aVar.f96751k);
    }

    /* renamed from: k */
    public static /* synthetic */ C17945a0 m104473k(C20092b c20092b, C19490a c19490a, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c20092b.m104483j(c19490a, z11);
    }

    /* renamed from: m */
    private final void m104474m(C17945a0 c17945a0, Vector vector) {
        C17984n0 c17984n0;
        try {
            if (c17945a0.m95041W4() == 15) {
                c17945a0.m94918Ia(new ArrayList());
                Iterator it = vector.iterator();
                while (it.hasNext()) {
                    C19490a.a aVar = (C19490a.a) it.next();
                    C17970i1 c17970i1 = new C17970i1(aVar.f96747g, aVar.f96741a, aVar.f96750j, aVar.f96746f, aVar.f96744d, aVar.f96749i, aVar.f96748h, aVar.f96751k);
                    if (c17970i1.m95608j()) {
                        c17945a0.m95124eb(c17970i1);
                    } else {
                        c17945a0.m94922J3().add(c17970i1);
                    }
                }
                return;
            }
            Object obj = vector.get(0);
            AbstractC19074t.m100207e(obj, "get(...)");
            c17945a0.m95191la(m104472a((C19490a.a) obj, c17945a0.m95041W4()));
            C17969i0 m94929K2 = c17945a0.m94929K2();
            C18005u0 c18005u0 = null;
            if (m94929K2 instanceof C17984n0) {
                c17984n0 = (C17984n0) m94929K2;
            } else {
                c17984n0 = null;
            }
            if (c17984n0 != null && c17984n0.f91090M == 1) {
                c17945a0.m94926Ja(1);
            }
            C17969i0 m94929K22 = c17945a0.m94929K2();
            if (m94929K22 instanceof C18005u0) {
                c18005u0 = (C18005u0) m94929K22;
            }
            if (c18005u0 != null && c18005u0.f91187J) {
                c17945a0.m94926Ja(3);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final C19490a.a m104475b(C17970i1 c17970i1) {
        AbstractC19074t.m100208f(c17970i1, "<this>");
        C19490a.a aVar = new C19490a.a();
        aVar.f96747g = c17970i1.m95606h();
        aVar.f96741a = c17970i1.m95601c();
        aVar.f96750j = c17970i1.m95602d();
        aVar.f96746f = c17970i1.m95599a();
        aVar.f96749i = c17970i1.m95605g();
        aVar.f96748h = c17970i1.m95603e();
        aVar.f96744d = c17970i1.m95607i();
        aVar.f96751k = c17970i1.m95604f();
        return aVar;
    }

    /* renamed from: c */
    public final Vector m104476c(C17945a0 c17945a0) {
        Vector m104477d;
        AbstractC19074t.m100208f(c17945a0, "<this>");
        if (c17945a0.m95041W4() == 15) {
            Vector vector = new Vector();
            C17970i1 m95285w4 = c17945a0.m95285w4();
            if (m95285w4 != null) {
                AbstractC19074t.m100205c(m95285w4);
                vector.add(f98828a.m104475b(m95285w4));
            }
            ArrayList m94922J3 = c17945a0.m94922J3();
            if (m94922J3 != null && !m94922J3.isEmpty()) {
                Iterator it = c17945a0.m94922J3().iterator();
                while (it.hasNext()) {
                    C17970i1 c17970i1 = (C17970i1) it.next();
                    C20092b c20092b = f98828a;
                    AbstractC19074t.m100205c(c17970i1);
                    vector.add(c20092b.m104475b(c17970i1));
                }
            }
            return vector;
        }
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 == null || (m104477d = m104477d(m94929K2)) == null) {
            return new Vector();
        }
        return m104477d;
    }

    /* renamed from: d */
    public final Vector m104477d(C17969i0 c17969i0) {
        AbstractC19074t.m100208f(c17969i0, "<this>");
        Vector vector = new Vector();
        if (c17969i0 instanceof C17949b1) {
            C25630b m95397g = ((C17949b1) c17969i0).m95397g();
            if (m95397g != null) {
                C19490a.a aVar = new C19490a.a();
                aVar.f96742b = m95397g.m132427f();
                aVar.f96743c = m95397g.m132429g();
                aVar.f96744d = String.valueOf(m95397g.m132434l());
                aVar.f96745e = m95397g.m132417a();
                vector.add(aVar);
            }
        } else {
            C19490a.a aVar2 = new C19490a.a();
            aVar2.f96747g = c17969i0.f91011p;
            aVar2.f96741a = c17969i0.f91012q;
            aVar2.f96750j = c17969i0.f91015t;
            aVar2.f96746f = c17969i0.f91016u;
            aVar2.f96749i = c17969i0.f91013r;
            aVar2.f96748h = c17969i0.f91014s;
            aVar2.f96751k = c17969i0.f91017v;
            vector.add(aVar2);
        }
        return vector;
    }

    /* renamed from: e */
    public final String m104478e(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        AbstractC19074t.m100208f(c17945a0, "<this>");
        JSONObject jSONObject = new JSONObject();
        if (c17945a0.m95316z8()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 != null) {
                if (c17964g1.m95540r()) {
                    jSONObject.put("isPlayed", 1);
                }
                if (c17964g1.m95533k() != 0) {
                    jSONObject.put("log_flags", c17964g1.m95533k());
                }
                if (c17964g1.m95535m() > 0) {
                    jSONObject.put("played_count", c17964g1.m95535m());
                }
                String m95538p = c17964g1.m95538p();
                if (m95538p != null && m95538p.length() != 0) {
                    jSONObject.put("vtt", c17964g1.m95538p());
                }
                String m95536n = c17964g1.m95536n();
                if (m95536n != null && m95536n.length() != 0) {
                    jSONObject.put("rawUrl", c17964g1.m95536n());
                }
            }
        }
        if (jSONObject.length() == 0) {
            return "";
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x003e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0041. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072 A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m104479f(int i11) {
        if (i11 == -4) {
            return 45;
        }
        if (i11 != 0) {
            if (i11 != 11) {
                if (i11 != 13) {
                    if (i11 != 17) {
                        if (i11 != 39) {
                            if (i11 != 41) {
                                if (i11 != 45) {
                                    if (i11 == 2) {
                                        return 2;
                                    }
                                    if (i11 != 3) {
                                        if (i11 != 4) {
                                            if (i11 != 29) {
                                                if (i11 != 30) {
                                                    if (i11 != 60) {
                                                        if (i11 != 61) {
                                                            if (i11 != 76) {
                                                                if (i11 != 77) {
                                                                    switch (i11) {
                                                                        case 19:
                                                                            return 18;
                                                                        case 20:
                                                                            return 4;
                                                                        case 21:
                                                                            return 19;
                                                                        case 22:
                                                                            break;
                                                                        case 23:
                                                                            return 21;
                                                                        case 24:
                                                                            break;
                                                                        case 25:
                                                                            break;
                                                                        case 26:
                                                                            break;
                                                                        case 27:
                                                                            return 25;
                                                                        default:
                                                                            switch (i11) {
                                                                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                                                    return 2;
                                                                                case 33:
                                                                                    break;
                                                                                case 34:
                                                                                    break;
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case 47:
                                                                                            break;
                                                                                        case 48:
                                                                                            break;
                                                                                        case 49:
                                                                                            break;
                                                                                        case 50:
                                                                                            return 36;
                                                                                        case 51:
                                                                                            return 34;
                                                                                        default:
                                                                                            switch (i11) {
                                                                                                case 53:
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                case 55:
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i11) {
                                                                                                        case 65:
                                                                                                            return 28;
                                                                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                                                                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                                                                            return 29;
                                                                                                        case 68:
                                                                                                            return 30;
                                                                                                        case 69:
                                                                                                        case 72:
                                                                                                            return 31;
                                                                                                        case 70:
                                                                                                            return 35;
                                                                                                        case 71:
                                                                                                            break;
                                                                                                        case 73:
                                                                                                        case 74:
                                                                                                            return 32;
                                                                                                        default:
                                                                                                            return -1;
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                                }
                                                                return 20;
                                                            }
                                                            return 24;
                                                        }
                                                        return 23;
                                                    }
                                                    return 22;
                                                }
                                            }
                                            return 26;
                                        }
                                        return 6;
                                    }
                                    return 3;
                                }
                            }
                        }
                    }
                    return 15;
                }
                return 12;
            }
            return 10;
        }
        return 0;
    }

    /* renamed from: g */
    public final C24860q m104480g(int i11, int i12, boolean z11) {
        if (!z11) {
            switch (i11) {
                case -1:
                case 0:
                case 13:
                    return new C24860q(3, 2);
                case 1:
                case 2:
                    return new C24860q(3, 4);
                case 3:
                    return new C24860q(3, 3);
                case 4:
                case 14:
                    return new C24860q(3, 5);
                case 5:
                case 18:
                    return new C24860q(3, 2);
                case 6:
                case 7:
                    return new C24860q(0, 2);
                case 8:
                case 10:
                    return new C24860q(0, 2);
                case 9:
                    return new C24860q(2, 2);
                case 11:
                case 12:
                case 15:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i12);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(z11);
                    AbstractC23350e.m122777g("ZDB Convert Type", "Not support state: %s, state sync: %s, pc: %s", sb2.toString(), sb3.toString(), sb4.toString());
                    return new C24860q(3, 2);
                case 17:
                    return new C24860q(4, 2);
                case 19:
                    return new C24860q(3, 6);
                case 20:
                    return new C24860q(3, 7);
            }
        }
        if (i12 != 0) {
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            if (i12 != 14) {
                                switch (i12) {
                                    case 18:
                                        break;
                                    case 19:
                                        return new C24860q(3, 6);
                                    case 20:
                                        return new C24860q(3, 7);
                                    default:
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(i11);
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(i12);
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(z11);
                                        AbstractC23350e.m122777g("ZDB Convert Type", "Not support state: %s, state sync: %s, pc: %s", sb5.toString(), sb6.toString(), sb7.toString());
                                        return new C24860q(3, 2);
                                }
                            }
                        }
                        return new C24860q(3, 2);
                    }
                    return new C24860q(3, 5);
                }
                return new C24860q(3, 3);
            }
            return new C24860q(3, 4);
        }
        return new C24860q(3, 2);
    }

    /* renamed from: h */
    public final C19490a m104481h(int i11, int i12, boolean z11) {
        C19490a c19490a = new C19490a();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        c19490a.f96740z = Integer.parseInt(str);
        c19490a.f96715a = z11 ? (byte) 1 : (byte) 0;
        c19490a.f96716b = Byte.MIN_VALUE;
        c19490a.f96717c = Byte.MIN_VALUE;
        c19490a.f96718d = i11;
        c19490a.f96719e = i12;
        c19490a.f96720f = Integer.MIN_VALUE;
        c19490a.f96721g = Long.MIN_VALUE;
        c19490a.f96722h = Long.MIN_VALUE;
        c19490a.f96723i = Long.MIN_VALUE;
        c19490a.f96724j = Long.MIN_VALUE;
        c19490a.f96725k = Long.MIN_VALUE;
        c19490a.f96726l = null;
        c19490a.f96732r = null;
        c19490a.f96727m = null;
        C19490a.b bVar = new C19490a.b();
        bVar.f96753a = null;
        c19490a.f96735u = bVar;
        return c19490a;
    }

    /* renamed from: i */
    public final C19490a m104482i(C17945a0 c17945a0, String str) {
        int parseInt;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        List<C7907e.a> m40856f;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(str, "userId");
        C19490a c19490a = new C19490a();
        c19490a.f96740z = Integer.parseInt(str);
        c19490a.f96726l = c17945a0.m95019U3();
        c19490a.f96725k = c17945a0.m94974P4();
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        c19490a.f96718d = Integer.parseInt(m94862C4);
        c19490a.f96715a = c17945a0.m94847A6() ? (byte) 1 : (byte) 0;
        if (c17945a0.m94847A6()) {
            String m94853B3 = c17945a0.m94853B3();
            AbstractC19074t.m100207e(m94853B3, "getGroupId(...)");
            parseInt = Integer.parseInt(m94853B3);
        } else {
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            parseInt = Integer.parseInt(mo95039W2);
        }
        c19490a.f96719e = parseInt;
        int m95041W4 = c17945a0.m95041W4();
        c19490a.f96720f = m95041W4;
        if (m95041W4 == 31) {
            c19490a.f96720f = 3;
        }
        c19490a.f96716b = (byte) c17945a0.m95089b4();
        byte m95107d3 = (byte) c17945a0.m95107d3();
        c19490a.f96717c = m95107d3;
        if (m95107d3 == 1) {
            c19490a.f96717c = (byte) 2;
        }
        c19490a.f96723i = c17945a0.m95029V3().m41045i();
        c19490a.f96732r = f98828a.m104476c(c17945a0);
        c19490a.f96721g = c17945a0.m95029V3().m41047k();
        c19490a.f96722h = c17945a0.m94937L2();
        c19490a.f96724j = c17945a0.m95030V4();
        C17997r1 m95275v4 = c17945a0.m95275v4();
        if (m95275v4 != null) {
            AbstractC19074t.m100205c(m95275v4);
            C19490a.g gVar = new C19490a.g();
            gVar.f96783a = AbstractC29239n.m146002a(m95275v4.m95693j(), 0);
            gVar.f96784b = m95275v4.m95687d();
            gVar.f96785c = m95275v4.m95689f().m41045i();
            gVar.f96786d = m95275v4.m95689f().m41047k();
            gVar.f96787e = m95275v4.m95696m();
            gVar.f96789g = m95275v4.m95688e();
            gVar.f96790h = m95275v4.m95686c();
            gVar.f96791i = m95275v4.m95692i();
            gVar.f96788f = m95275v4.m95695l();
            gVar.f96792j = m95275v4.m95691h();
            c19490a.f96733s = gVar;
        }
        C7907e m95011T3 = c17945a0.m95011T3();
        if (m95011T3 != null && (m40856f = m95011T3.m40856f()) != null) {
            AbstractC19074t.m100205c(m40856f);
            for (C7907e.a aVar : m40856f) {
                Vector vector = c19490a.f96734t;
                C19490a.c cVar = new C19490a.c();
                cVar.f96768a = aVar.f42791a;
                cVar.f96769b = (int) aVar.f42792b;
                cVar.f96770c = aVar.f42795e;
                cVar.f96771d = aVar.f42794d;
                cVar.f96772e = aVar.f42793c;
                vector.add(cVar);
            }
        }
        C17979l1 m95051X3 = c17945a0.m95051X3();
        if (m95051X3 != null) {
            AbstractC19074t.m100205c(m95051X3);
            C19490a.f fVar = new C19490a.f();
            fVar.f96778a = m95051X3.f91058a;
            fVar.f96779b = m95051X3.f91061d;
            fVar.f96780c = m95051X3.f91060c;
            fVar.f96781d = m95051X3.f91059b;
            fVar.f96782e = m95051X3.m95619a(false).toString();
            c19490a.f96731q = fVar;
        }
        C17994q1 m95239r4 = c17945a0.m95239r4();
        if (m95239r4 != null) {
            AbstractC19074t.m100205c(m95239r4);
            C19490a.e eVar = new C19490a.e();
            eVar.f96776a = m95239r4.f91140b;
            eVar.f96777b = m95239r4.f91139a;
            c19490a.f96736v = eVar;
        }
        C17976k1 m95040W3 = c17945a0.m95040W3();
        String str5 = "";
        if (m95040W3 == null || (str2 = m95040W3.f91049c) == null) {
            str2 = "";
        }
        c19490a.f96729o = str2;
        C26713e m95071Z3 = c17945a0.m95071Z3();
        if (m95071Z3 != null) {
            AbstractC19074t.m100205c(m95071Z3);
            C19490a.d dVar = new C19490a.d();
            dVar.f96773a = m95071Z3.m137359d();
            dVar.f96774b = m95071Z3.m137361f();
            dVar.f96775c = m95071Z3.m137362g() ? (byte) 1 : (byte) 0;
            c19490a.f96737w = dVar;
        }
        C3541i m95002S3 = c17945a0.m95002S3();
        if (m95002S3 == null || (str3 = m95002S3.m18001b()) == null) {
            str3 = "";
        }
        c19490a.f96728n = str3;
        C19490a.b bVar = new C19490a.b();
        bVar.f96753a = c17945a0.m95249s4();
        bVar.f96755c = "";
        String m95267u3 = c17945a0.m95267u3();
        if (m95267u3 == null) {
            m95267u3 = "";
        }
        bVar.f96756d = m95267u3;
        bVar.f96757e = c17945a0.m94877E3() ? 1 : 0;
        bVar.f96759g = c17945a0.m95180k8() ? (byte) 1 : (byte) 0;
        bVar.f96760h = c17945a0.m94854B4();
        bVar.f96761i = (short) c17945a0.m94905H4();
        bVar.f96763k = c17945a0.m95206n4();
        bVar.f96762j = (short) c17945a0.m95196m4();
        C7908f m94993R4 = c17945a0.m94993R4();
        if (m94993R4 == null || (str4 = m94993R4.m40877g()) == null) {
            str4 = "";
        }
        bVar.f96764l = str4;
        bVar.f96765m = c17945a0.m94938L3();
        bVar.f96767o = c17945a0.m94956N2();
        if (c17945a0.m95224p4() != null) {
            str5 = c17945a0.m95224p4().toString();
        }
        bVar.f96766n = str5;
        c19490a.f96735u = bVar;
        c19490a.f96730p = f98828a.m104478e(c17945a0);
        if (c17945a0.m95170j6()) {
            C31897e4 m95184l3 = c17945a0.m95184l3();
            if (m95184l3 != null) {
                jSONObject = m95184l3.m153260A();
            } else {
                jSONObject = null;
            }
            c19490a.f96727m = String.valueOf(jSONObject);
        }
        return c19490a;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02ff A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #1 {Exception -> 0x0119, blocks: (B:24:0x00e5, B:28:0x011c, B:30:0x0120, B:32:0x0126, B:35:0x0130, B:37:0x0179, B:39:0x017d, B:40:0x0186, B:42:0x018c, B:44:0x01b2, B:46:0x01b6, B:51:0x01bd, B:50:0x01bf, B:56:0x01c3, B:57:0x01c6, B:59:0x01ca, B:60:0x01e7, B:62:0x01eb, B:63:0x01f7, B:65:0x01fb, B:66:0x0203, B:68:0x0207, B:71:0x020e, B:73:0x021f, B:75:0x0223, B:76:0x022b, B:78:0x0237, B:80:0x023d, B:82:0x0241, B:86:0x024b, B:88:0x0250, B:90:0x0254, B:92:0x0270, B:93:0x027c, B:96:0x0283, B:99:0x028d, B:101:0x02aa, B:102:0x02af, B:104:0x02c1, B:105:0x02c9, B:109:0x02cc, B:111:0x02d4, B:112:0x02d9, B:114:0x02dd, B:118:0x02e6, B:119:0x02e9, B:122:0x02ef, B:125:0x02f6, B:126:0x02fa, B:128:0x02ff, B:133:0x010b, B:135:0x010f, B:137:0x0113), top: B:23:0x00e5 }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C17945a0 m104483j(C19490a c19490a, boolean z11) {
        String valueOf;
        long j11;
        C19490a.f fVar;
        byte b11;
        boolean z12;
        boolean z13;
        C7908f c7908f;
        Vector vector;
        boolean z14;
        String str;
        long j12;
        boolean z15;
        AbstractC19074t.m100208f(c19490a, "chatMsg");
        if (c19490a.f96715a != 0) {
            valueOf = "group_" + c19490a.f96719e;
        } else {
            valueOf = String.valueOf(c19490a.f96719e);
        }
        String str2 = valueOf;
        long j13 = c19490a.f96723i;
        if (j13 == 0 && c19490a.f96721g == 0) {
            AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("MessageID Invalid: Msg from DB: Type=" + c19490a.f96720f));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, c19490a.f96720f);
                jSONObject.put("senderUid", c19490a.f96718d);
                jSONObject.put("ownerId", str2);
                jSONObject.put("ts", c19490a.f96725k);
                C19490a.b bVar = c19490a.f96735u;
                if (bVar != null) {
                    AbstractC19074t.m100205c(bVar);
                    jSONObject.put("platform_type", Short.valueOf(bVar.f96762j));
                    if (AbstractC19074t.m100204b(String.valueOf(c19490a.f96718d), CoreUtility.f89233i) && bVar.f96759g == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    jSONObject.put("is_mine_mobile", z15);
                }
                String jSONObject2 = jSONObject.toString();
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                AbstractC20887g.m109235m(500100, jSONObject2, str3, 0, 0L, CoreUtility.f89236l);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            j11 = -123;
        } else {
            j11 = j13;
        }
        MessageId.C7932a c7932a = MessageId.Companion;
        C17945a0.w m95359K = new C17945a0.w(c7932a.m41063a(j11, c19490a.f96721g, str2, String.valueOf(c19490a.f96718d)), c19490a.f96720f).m95359K(c19490a.f96725k);
        try {
            m95359K.m95352D(c19490a.f96738x).m95382r(c19490a.f96726l).m95386v(c19490a.f96716b).m95369e(c19490a.f96722h).m95361M(c19490a.f96724j);
            int i11 = c19490a.f96720f;
            if ((i11 == 3 || i11 == 4) && (fVar = c19490a.f96731q) != null && fVar.f96780c == 3) {
                m95359K.m95362N(31);
            }
            C19490a.g gVar = c19490a.f96733s;
            if (gVar != null) {
                long j14 = gVar.f96785c;
                if (j14 == 0 && gVar.f96786d == 0) {
                    j12 = -123;
                } else {
                    j12 = j14;
                }
                C17997r1 c17997r1 = new C17997r1(c7932a.m41063a(j12, gVar.f96786d, str2, String.valueOf(gVar.f96783a)));
                c17997r1.m95705v(String.valueOf(gVar.f96783a));
                c17997r1.m95700q(gVar.f96784b);
                c17997r1.m95708y(gVar.f96787e);
                c17997r1.m95701r(gVar.f96789g);
                c17997r1.m95699p(gVar.f96790h);
                c17997r1.m95704u(gVar.f96791i);
                c17997r1.m95707x(gVar.f96788f);
                c17997r1.m95703t(gVar.f96792j);
                c17997r1.m95697n();
                m95359K.m95351C(c17997r1);
            }
            Vector<C19490a.c> vector2 = c19490a.f96734t;
            if (vector2 != null) {
                C7907e c7907e = new C7907e();
                for (C19490a.c cVar : vector2) {
                    C7907e.a aVar = new C7907e.a(cVar.f96768a, cVar.f96769b, cVar.f96770c, cVar.f96771d);
                    aVar.f42793c = cVar.f96772e;
                    if (aVar.m40866d() <= 0 && (str = aVar.f42793c) != null && str.length() != 0) {
                        c7907e.f42789b = true;
                    }
                    c7907e.m40852b(aVar);
                }
                m95359K.m95381q(c7907e);
            }
            C19490a.f fVar2 = c19490a.f96731q;
            if (fVar2 != null) {
                C17979l1 c17979l1 = new C17979l1();
                c17979l1.f91058a = fVar2.f96778a;
                c17979l1.f91061d = fVar2.f96779b;
                c17979l1.f91060c = fVar2.f96780c;
                c17979l1.f91059b = fVar2.f96781d;
                c17979l1.m95624f(fVar2.f96782e);
                m95359K.m95385u(c17979l1);
            }
            C19490a.e eVar = c19490a.f96736v;
            if (eVar != null) {
                m95359K.m95350B(new C17994q1(eVar.f96777b, eVar.f96776a));
            }
            String str4 = c19490a.f96729o;
            if (str4 != null) {
                m95359K.m95384t(new C17976k1(str4));
            }
            C19490a.d dVar = c19490a.f96737w;
            if (dVar != null) {
                if (dVar.f96775c != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i12 = dVar.f96774b;
                String str5 = dVar.f96773a;
                AbstractC19074t.m100207e(str5, "data");
                m95359K.m95383s(new C26713e(i12, str5, z14));
            }
            String str6 = c19490a.f96728n;
            if (str6 != null) {
                m95359K.m95380p(new C3541i(str6));
            }
            C17945a0 m95365a = m95359K.m95365a();
            AbstractC19074t.m100207e(m95365a, "build(...)");
            Vector vector3 = c19490a.f96732r;
            String str7 = null;
            if (vector3 != null && vector3.size() > 0 && (vector = c19490a.f96732r) != null) {
                if (vector.size() <= 0) {
                    vector = null;
                }
                if (vector != null) {
                    f98828a.m104474m(m95365a, vector);
                }
            }
            C19490a.b bVar2 = c19490a.f96735u;
            if (bVar2 != null) {
                m95365a.m94934Ka(AbstractC19646n0.m103034u0(bVar2.f96753a, m95365a.m95041W4()));
                m95365a.m95299xa(bVar2.f96756d);
                if (!TextUtils.isEmpty(m95365a.m95267u3())) {
                    m95365a.m95181ka(new C32012m(m95365a.m95267u3()));
                }
                if (bVar2.f96757e != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m95365a.m94873Da(z12);
                if (bVar2.f96759g != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                m95365a.m95265tb(z13);
                m95365a.m95164ib(bVar2.f96760h);
                m95365a.m95221ob(bVar2.f96761i);
                m95365a.m95085ab(bVar2.f96763k);
                m95365a.m95076Za(bVar2.f96762j);
                if (m95365a.m94938L3() == 0) {
                    m95365a.m94926Ja(bVar2.f96765m);
                }
                m95365a.m95210na(bVar2.f96767o);
                m95365a.m95038W1(bVar2.f96766n, true);
                JSONObject m117932a = AbstractC23008a2.m117932a(bVar2.f96764l, true);
                if (m117932a != null) {
                    c7908f = C7908f.Companion.m40878a(m117932a);
                } else {
                    c7908f = null;
                }
                m95365a.m95290wb(c7908f);
            }
            JSONObject m96098q = AbstractC18069a.m96098q(c19490a.f96730p);
            if (m96098q != null) {
                f98828a.m104485n(m95365a, m96098q);
            }
            String str8 = c19490a.f96727m;
            if (str8 != null) {
                if (str8.length() > 0) {
                    str7 = str8;
                }
                if (str7 != null) {
                    m95365a.m95010T1(str7, true);
                }
            }
            byte b12 = c19490a.f96717c;
            if (b12 != 1 && (b12 != 0 || !m95365a.m94960N7())) {
                b11 = c19490a.f96717c;
                m95365a.m95264ta(b11);
                if (z11) {
                    m95365a.m94951M9();
                }
                return m95365a;
            }
            b11 = 2;
            m95365a.m95264ta(b11);
            if (z11) {
            }
            return m95365a;
        } catch (Exception e12) {
            AbstractC20110a.f98889a.m104564x("ChatContent").mo104552e(e12);
            C17945a0 m95365a2 = m95359K.m95365a();
            AbstractC19074t.m100207e(m95365a2, "build(...)");
            return m95365a2;
        }
    }

    /* renamed from: l */
    public final String m104484l(C19498i c19498i) {
        AbstractC19074t.m100208f(c19498i, "msgIdentifyVec");
        StringBuilder sb2 = new StringBuilder();
        int m101944c = c19498i.m101944c();
        for (int i11 = 0; i11 < m101944c; i11++) {
            if (c19498i.m101943b(i11) != null) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(c19498i.m101943b(i11).f96813b);
                sb2.append("'");
            }
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: n */
    public final void m104485n(C17945a0 c17945a0, JSONObject jSONObject) {
        C17964g1 c17964g1;
        AbstractC19074t.m100208f(c17945a0, "<this>");
        AbstractC19074t.m100208f(jSONObject, "json");
        if (c17945a0.m95316z8()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 != null) {
                boolean z11 = true;
                if (jSONObject.optInt("isPlayed") != 1) {
                    z11 = false;
                }
                c17964g1.m95522C(z11);
                c17964g1.m95520A(jSONObject.optInt("log_flags", 0));
                c17964g1.m95523D(jSONObject.optInt("played_count", 0));
                if (C20534g.f100864a.m106694h()) {
                    c17964g1.m95528I(jSONObject.optString("vtt", ""));
                    c17964g1.m95524E(jSONObject.optString("rawUrl", ""));
                }
            }
        }
    }
}
