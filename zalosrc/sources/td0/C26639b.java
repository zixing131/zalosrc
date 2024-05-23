package td0;

import android.text.TextUtils;
import com.androidquery.util.BitmapEncoder;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23041d2;
import mm0.AbstractC23352g;
import od0.C24230h;
import od0.EnumC24229g;
import on0.AbstractC24341v;
import p239ih.C20556f;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p645xh.C29630g;
import p645xh.C29632i;
import te0.C26644b;
import th.AbstractC26684e;
import th.AbstractC26689j;

/* renamed from: td0.b */
/* loaded from: classes4.dex */
public final class C26639b {

    /* renamed from: a */
    public static final C26639b f126100a = new C26639b();

    /* renamed from: td0.b$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f126101a;

        static {
            int[] iArr = new int[EnumC24229g.values().length];
            try {
                iArr[EnumC24229g.f116966E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24229g.f116967F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24229g.f116990x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24229g.f116971J.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC24229g.f116968G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC24229g.f116991y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC24229g.f116984r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC24229g.f116962A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC24229g.f116963B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC24229g.f116964C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC24229g.f116965D.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC24229g.f116972K.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC24229g.f116976O.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC24229g.f116973L.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC24229g.f116974M.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC24229g.f116975N.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC24229g.f116983q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC24229g.f116992z.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC24229g.f116977P.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC24229g.f116986t.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC24229g.f116985s.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC24229g.f116969H.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC24229g.f116970I.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC24229g.f116978Q.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC24229g.f116979R.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC24229g.f116980S.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC24229g.f116987u.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC24229g.f116988v.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC24229g.f116989w.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f126101a = iArr;
        }
    }

    private C26639b() {
    }

    /* renamed from: A */
    public static final boolean m136737A(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g != EnumC24229g.f116992z && enumC24229g != EnumC24229g.f116977P) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static final boolean m136738B(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        switch (a.f126101a[enumC24229g.ordinal()]) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: C */
    public static final void m136739C(String str) {
        AbstractC20110a.f98889a.mo104558r(str, new Object[0]);
    }

    /* renamed from: D */
    public static final void m136740D(String str) {
        AbstractC20110a.f98889a.m104564x("Renew_link").mo104556o(8, str, new Object[0]);
    }

    /* renamed from: E */
    public static final boolean m136741E(String str, int i11, boolean z11) {
        if (z11) {
            return m136742F(str, i11);
        }
        return m136743G(str, i11);
    }

    /* renamed from: F */
    public static final boolean m136742F(String str, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = 1228800;
        } else {
            i12 = 307200;
        }
        if (new C20556f(str).m106845r() > i12 || !C26644b.f126107a.m136773b(str, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static final boolean m136743G(String str, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = 1228800;
        } else {
            i12 = 307200;
        }
        if (new C20556f(str).m106845r() > i12 || !C26644b.f126107a.m136772a(str, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ String m136744c(C26639b c26639b, int i11, EnumC24229g enumC24229g, String str, String str2, boolean z11, boolean z12, int i12, Object obj) {
        boolean z13;
        boolean z14;
        if ((i12 & 8) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i12 & 32) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        return c26639b.m136769b(i11, enumC24229g, str, str3, z13, z14);
    }

    /* renamed from: d */
    public static final String m136745d(int i11) {
        return CoreUtility.f89233i + "_" + i11;
    }

    /* renamed from: e */
    public static final int m136746e(EnumC24229g enumC24229g) {
        int m122192n1;
        AbstractC19074t.m100208f(enumC24229g, "feature");
        switch (a.f126101a[enumC24229g.ordinal()]) {
            case 1:
            case 2:
            case 4:
                m122192n1 = AbstractC23309i.m122192n1();
                break;
            case 3:
            case 6:
            case 22:
            case 23:
            default:
                return ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
            case 5:
                m122192n1 = AbstractC23309i.m121231Nd();
                break;
            case 7:
            case 15:
                return AbstractC26689j.m137104m();
            case 8:
            case 9:
                m122192n1 = AbstractC26689j.m137115x(0);
                break;
            case 10:
                m122192n1 = AbstractC26689j.m137115x(3);
                break;
            case 11:
            case 12:
                m122192n1 = AbstractC26689j.m137115x(2);
                break;
            case 13:
                m122192n1 = AbstractC26689j.m137108q(1);
                break;
            case 14:
            case 17:
            case 24:
            case 25:
            case 26:
                return AbstractC26689j.m137105n();
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return AbstractC26689j.m137105n();
            case 18:
            case 19:
                return AbstractC26689j.m137079F();
            case 20:
            case 21:
                return AbstractC26689j.m137102k();
        }
        return ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE * m122192n1;
    }

    /* renamed from: f */
    public static final String m136747f(String str, String str2, EnumC24229g enumC24229g, boolean z11) {
        AbstractC19074t.m100208f(str, "originPath");
        AbstractC19074t.m100208f(str2, "clientMsgId");
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (m136765x(enumC24229g)) {
            String m136752k = m136752k(enumC24229g);
            short m136755n = (short) m136755n(enumC24229g);
            String m118220s = AbstractC23041d2.m118220s(str);
            AbstractC19074t.m100207e(m118220s, "getFileExtension(...)");
            if (m136764w(enumC24229g) && (!z11 || BitmapEncoder.f15688e.m18741d())) {
                m118220s = ".jxl";
            } else if (m136759r(enumC24229g)) {
                m118220s = ".jpg";
            } else if (m118220s.length() <= 0) {
                m118220s = "jpg";
            }
            String m122788d = AbstractC23352g.m122788d(str + str2 + ((int) m136755n));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m122788d);
            sb2.append(m118220s);
            return m136752k + sb2.toString();
        }
        return "";
    }

    /* renamed from: g */
    public static final int m136748g(short s7) {
        if (s7 == 754) {
            return 0;
        }
        if (s7 != 755) {
            return s7 != 1247 ? 2 : 3;
        }
        return 1;
    }

    /* renamed from: h */
    public static final long m136749h(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "feature");
        return AbstractC23306f.m120687l2().m152931i();
    }

    /* renamed from: i */
    public static final int m136750i(C24230h c24230h) {
        boolean m127120J;
        AbstractC19074t.m100208f(c24230h, "uploadItem");
        m127120J = AbstractC24341v.m127120J(c24230h.m126489F(), "group_", false, 2, null);
        if (m127120J) {
            return 6;
        }
        if (TextUtils.isEmpty(c24230h.m126489F())) {
            return 3;
        }
        return -1;
    }

    /* renamed from: j */
    public static final int m136751j(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        switch (a.f126101a[enumC24229g.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
                return 12;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 6;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return 7;
            case 13:
                return 9;
            case 14:
                return 31;
            case 15:
                return 36;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return 33;
            default:
                return 1;
        }
    }

    /* renamed from: k */
    public static final String m136752k(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        int i11 = a.f126101a[enumC24229g.ordinal()];
        if (i11 != 7 && i11 != 17) {
            String m104894s0 = AbstractC20130d.m104894s0();
            AbstractC19074t.m100207e(m104894s0, "getTempPhotoUploadExternalStorageDirectory(...)");
            return m104894s0;
        }
        String m104874i0 = AbstractC20130d.m104874i0();
        AbstractC19074t.m100207e(m104874i0, "getPictureExternalStorageDirectory(...)");
        return m104874i0;
    }

    /* renamed from: l */
    public static final int m136753l(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        int i11 = a.f126101a[enumC24229g.ordinal()];
        if (i11 != 6) {
            if (i11 != 7) {
                switch (i11) {
                    case 14:
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    case 17:
                        break;
                    case 15:
                        break;
                    case 18:
                    case 19:
                        return 3;
                    case 20:
                    case 21:
                    default:
                        return 2;
                }
            }
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    /* renamed from: m */
    public static final boolean m136754m(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        int i11 = a.f126101a[enumC24229g.ordinal()];
        if (i11 != 3) {
            switch (i11) {
                default:
                    switch (i11) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            break;
                        default:
                            return true;
                    }
                case 10:
                case 11:
                case 12:
                    return false;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static final int m136755n(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        switch (a.f126101a[enumC24229g.ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 14:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 17:
            case 24:
            case 25:
            case 26:
                return 754;
            case 2:
                return 167;
            case 3:
                return 179;
            case 5:
                return 1563;
            case 7:
            case 15:
                return 755;
            case 8:
            case 13:
                return 756;
            case 9:
                return 1561;
            case 10:
                return 1260;
            case 11:
                return 1600;
            case 12:
                return 2040;
            case 18:
                return 1247;
            case 19:
                return 1797;
            case 20:
                return 166;
            case 21:
                return 1246;
            case 22:
                return 1607;
            case 23:
                return 1850;
            case 27:
                return 164;
            case 28:
                return 162;
            case 29:
                return 230;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: o */
    public static final boolean m136756o(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (!AbstractC26684e.f126408a) {
            return false;
        }
        switch (a.f126101a[enumC24229g.ordinal()]) {
            case 8:
            case 13:
                return true;
            case 9:
            default:
                return false;
            case 10:
            case 11:
            case 12:
                return C29632i.m147326E0().m93434z();
        }
    }

    /* renamed from: p */
    public static final boolean m136757p(int i11) {
        return i11 == 1 || i11 == 6 || i11 == 31 || i11 == 36;
    }

    /* renamed from: q */
    public static final boolean m136758q(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (m136756o(enumC24229g)) {
            return C29632i.m147326E0().m93434z();
        }
        return C29630g.m147299E0().m93434z();
    }

    /* renamed from: r */
    public static final boolean m136759r(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g != EnumC24229g.f116983q && enumC24229g != EnumC24229g.f116984r) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static final boolean m136760s(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g == EnumC24229g.f116984r) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static final boolean m136761t(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        int i11 = a.f126101a[enumC24229g.ordinal()];
        if (i11 != 8 && i11 != 13) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static final boolean m136762u(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g == EnumC24229g.f116976O) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static final boolean m136763v(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g == EnumC24229g.f116968G) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static final boolean m136764w(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if ((m136767z(enumC24229g) && BitmapEncoder.f15688e.m18738a()) || ((m136737A(enumC24229g) && BitmapEncoder.f15688e.m18739b()) || (m136759r(enumC24229g) && BitmapEncoder.f15688e.m18740c()))) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static final boolean m136765x(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        int i11 = a.f126101a[enumC24229g.ordinal()];
        if (i11 != 6 && i11 != 7) {
            switch (i11) {
                case 14:
                case 15:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public static final boolean m136766y(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g == EnumC24229g.f116974M) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static final boolean m136767z(EnumC24229g enumC24229g) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        if (enumC24229g != EnumC24229g.f116985s && enumC24229g != EnumC24229g.f116986t) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String m136768a(String str) {
        AbstractC19074t.m100208f(str, "path");
        String m118220s = AbstractC23041d2.m118220s(str);
        AbstractC19074t.m100207e(m118220s, "getFileExtension(...)");
        if (m118220s.length() > 0) {
            return AbstractC23041d2.m118199F(str) + "_resized" + m118220s;
        }
        return str + "_resized";
    }

    /* renamed from: b */
    public final String m136769b(int i11, EnumC24229g enumC24229g, String str, String str2, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        AbstractC19074t.m100208f(str, "originPath");
        AbstractC19074t.m100208f(str2, "outputPath");
        if (str2.length() == 0) {
            if (m136765x(enumC24229g)) {
                String m136752k = m136752k(enumC24229g);
                short m136755n = (short) m136755n(enumC24229g);
                String m118216o = AbstractC23041d2.m118216o(str);
                AbstractC19074t.m100207e(m118216o, "getExtension(...)");
                if (m118216o.length() > 0) {
                    m118216o = "." + m118216o;
                }
                boolean m136759r = m136759r(enumC24229g);
                if (m136764w(enumC24229g) && (!z11 || BitmapEncoder.f15688e.m18741d())) {
                    m118216o = ".jxl";
                } else if (!m136759r ? AbstractC19074t.m100204b(m118216o, ".jxl") : z12) {
                    m118216o = ".jpg";
                }
                str = m136752k + (AbstractC23352g.m122788d(str + i11 + ((int) m136755n)) + m118216o);
            }
            return str;
        }
        return str2;
    }
}
