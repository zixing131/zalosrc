package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class fk4 extends kd4 {

    /* renamed from: g1 */
    private static final int[] f20148g1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: h1 */
    private static boolean f20149h1;

    /* renamed from: i1 */
    private static boolean f20150i1;

    /* renamed from: B0 */
    private final Context f20151B0;

    /* renamed from: C0 */
    private final qk4 f20152C0;

    /* renamed from: D0 */
    private final cl4 f20153D0;

    /* renamed from: E0 */
    private final boolean f20154E0;

    /* renamed from: F0 */
    private ek4 f20155F0;

    /* renamed from: G0 */
    private boolean f20156G0;

    /* renamed from: H0 */
    private boolean f20157H0;

    /* renamed from: I0 */
    private Surface f20158I0;

    /* renamed from: J0 */
    private zzxj f20159J0;

    /* renamed from: K0 */
    private boolean f20160K0;

    /* renamed from: L0 */
    private int f20161L0;

    /* renamed from: M0 */
    private boolean f20162M0;

    /* renamed from: N0 */
    private boolean f20163N0;

    /* renamed from: O0 */
    private boolean f20164O0;

    /* renamed from: P0 */
    private long f20165P0;

    /* renamed from: Q0 */
    private long f20166Q0;

    /* renamed from: R0 */
    private long f20167R0;

    /* renamed from: S0 */
    private int f20168S0;

    /* renamed from: T0 */
    private int f20169T0;

    /* renamed from: U0 */
    private int f20170U0;

    /* renamed from: V0 */
    private long f20171V0;

    /* renamed from: W0 */
    private long f20172W0;

    /* renamed from: X0 */
    private long f20173X0;

    /* renamed from: Y0 */
    private int f20174Y0;

    /* renamed from: Z0 */
    private int f20175Z0;

    /* renamed from: a1 */
    private int f20176a1;

    /* renamed from: b1 */
    private int f20177b1;

    /* renamed from: c1 */
    private float f20178c1;

    /* renamed from: d1 */
    private s41 f20179d1;

    /* renamed from: e1 */
    private int f20180e1;

    /* renamed from: f1 */
    private ik4 f20181f1;

    public fk4(Context context, fd4 fd4Var, md4 md4Var, long j11, boolean z11, Handler handler, dl4 dl4Var, int i11, float f11) {
        super(2, fd4Var, md4Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f20151B0 = applicationContext;
        this.f20152C0 = new qk4(applicationContext);
        this.f20153D0 = new cl4(handler, dl4Var);
        this.f20154E0 = "NVIDIA".equals(g92.f20476c);
        this.f20166Q0 = -9223372036854775807L;
        this.f20175Z0 = -1;
        this.f20176a1 = -1;
        this.f20178c1 = -1.0f;
        this.f20161L0 = 1;
        this.f20180e1 = 0;
        this.f20179d1 = null;
    }

    /* renamed from: A0 */
    private static List m22035A0(md4 md4Var, C4671k3 c4671k3, boolean z11, boolean z12) {
        String str = c4671k3.f23099l;
        if (str == null) {
            return c83.m20832w();
        }
        List m21358f = de4.m21358f(str, z11, z12);
        String m21357e = de4.m21357e(c4671k3);
        if (m21357e == null) {
            return c83.m20830u(m21358f);
        }
        List m21358f2 = de4.m21358f(m21357e, z11, z12);
        z73 m20826p = c83.m20826p();
        m20826p.m28453g(m21358f);
        m20826p.m28453g(m21358f2);
        return m20826p.m28454h();
    }

    /* renamed from: B0 */
    private final void m22036B0() {
        int i11 = this.f20175Z0;
        if (i11 == -1) {
            if (this.f20176a1 != -1) {
                i11 = -1;
            } else {
                return;
            }
        }
        s41 s41Var = this.f20179d1;
        if (s41Var != null && s41Var.f27529a == i11 && s41Var.f27530b == this.f20176a1 && s41Var.f27531c == this.f20177b1 && s41Var.f27532d == this.f20178c1) {
            return;
        }
        s41 s41Var2 = new s41(i11, this.f20176a1, this.f20177b1, this.f20178c1);
        this.f20179d1 = s41Var2;
        this.f20153D0.m20954t(s41Var2);
    }

    /* renamed from: C0 */
    private final void m22037C0() {
        s41 s41Var = this.f20179d1;
        if (s41Var != null) {
            this.f20153D0.m20954t(s41Var);
        }
    }

    /* renamed from: D0 */
    private final void m22038D0() {
        Surface surface = this.f20158I0;
        zzxj zzxjVar = this.f20159J0;
        if (surface == zzxjVar) {
            this.f20158I0 = null;
        }
        zzxjVar.release();
        this.f20159J0 = null;
    }

    /* renamed from: E0 */
    private static boolean m22039E0(long j11) {
        return j11 < -30000;
    }

    /* renamed from: F0 */
    private final boolean m22040F0(hd4 hd4Var) {
        if (g92.f20474a < 23 || m22043z0(hd4Var.f21638a)) {
            return false;
        }
        if (hd4Var.f21643f && !zzxj.m28838b(this.f20151B0)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:            if (r3.equals("video/mp4v-es") != false) goto L101;     */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m22041w0(hd4 hd4Var, C4671k3 c4671k3) {
        int m22321O;
        int intValue;
        int i11 = c4671k3.f23104q;
        int i12 = c4671k3.f23105r;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = c4671k3.f23099l;
        char c11 = 1;
        int i13 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair m21354b = de4.m21354b(c4671k3);
            if (m21354b != null && ((intValue = ((Integer) m21354b.first).intValue()) == 512 || intValue == 1 || intValue == 2)) {
                str = "video/avc";
            } else {
                str = "video/hevc";
            }
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 1187890754:
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 3:
            case 4:
                m22321O = i11 * i12;
                break;
            case 2:
                String str2 = g92.f20477d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(g92.f20476c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && hd4Var.f21643f)))) {
                    return -1;
                }
                m22321O = g92.m22321O(i11, 16) * g92.m22321O(i12, 16) * 256;
                break;
                break;
            case 5:
            case 6:
                m22321O = i11 * i12;
                i13 = 4;
                break;
            default:
                return -1;
        }
        return (m22321O * 3) / (i13 + i13);
    }

    /* renamed from: x0 */
    protected static int m22042x0(hd4 hd4Var, C4671k3 c4671k3) {
        if (c4671k3.f23100m != -1) {
            int size = c4671k3.f23101n.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) c4671k3.f23101n.get(i12)).length;
            }
            return c4671k3.f23100m + i11;
        }
        return m22041w0(hd4Var, c4671k3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c3, code lost:            if (r0.equals("deb") != false) goto L1032;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x07a0, code lost:            if (r13.equals("JSN-L21") == false) goto L1040;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean m22043z0(String str) {
        char c11;
        char c12;
        boolean z11 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (fk4.class) {
            if (!f20149h1) {
                int i11 = g92.f20474a;
                char c13 = 28;
                if (i11 <= 28) {
                    String str2 = g92.f20475b;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c12 = 7;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c12 = 4;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c12 = 6;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c12 = 5;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z11 = true;
                            break;
                    }
                    f20150i1 = z11;
                    f20149h1 = true;
                }
                if (i11 > 27 || !"HWEML".equals(g92.f20475b)) {
                    String str3 = g92.f20477d;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        default:
                            if (i11 <= 26) {
                                String str4 = g92.f20475b;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c13 = '6';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c13 = '7';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c13 = '8';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c13 = 'J';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c13 = 22;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c13 = 'Y';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c13 = 'Z';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c13 = 'e';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c13 = 'f';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c13 = 'g';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c13 = '\r';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c13 = 't';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c13 = 137;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c13 = 21;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c13 = 'h';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c13 = '_';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c13 = 130;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c13 = 'a';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c13 = 'b';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c13 = 'c';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c13 = '4';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c13 = 18;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c13 = 'F';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c13 = 'v';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c13 = 'W';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c13 = 5;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c13 = 6;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c13 = 'x';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c13 = '\"';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c13 = '~';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c13 = 'X';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c13 = '\t';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c13 = 'w';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c13 = 131;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c13 = 132;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c13 = '[';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c13 = '3';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c13 = '5';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c13 = 'i';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c13 = 'y';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c13 = 17;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c13 = 138;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c13 = 31;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c13 = 134;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c13 = 20;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c13 = 'q';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c13 = 127;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c13 = 129;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c13 = 16;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c13 = 'T';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c13 = 'I';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c13 = 'O';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c13 = 'P';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c13 = 'V';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c13 = '^';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c13 = 'k';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c13 = 's';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c13 = 139;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c13 = 26;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c13 = 27;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c13 = '1';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c13 = 0;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c13 = 1;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c13 = 2;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c13 = '$';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c13 = '%';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c13 = '&';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c13 = '\'';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c13 = '(';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c13 = ')';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c13 = ']';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c13 = 'm';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c13 = 'o';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c13 = 136;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c13 = '2';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c13 = 'K';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c13 = 'U';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c13 = '\\';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c13 = 'S';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c13 = 3;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c13 = 4;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c13 = 15;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c13 = 7;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c13 = 30;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c13 = '*';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c13 = '+';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c13 = ',';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c13 = '-';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c13 = '.';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c13 = '/';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c13 = '0';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c13 = 'l';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c13 = 'n';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c13 = 'p';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c13 = 128;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c13 = 135;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c13 = 'C';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c13 = 'L';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c13 = 'M';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c13 = '\b';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c13 = 25;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c13 = 'R';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c13 = '<';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c13 = 11;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c13 = '\f';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c13 = 'z';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c13 = '{';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c13 = '|';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c13 = '}';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c13 = 'j';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c13 = 'r';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c13 = '9';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c13 = ':';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c13 = ';';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c13 = 'Q';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c13 = '\n';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c13 = 'H';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c13 = '`';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c13 = 'N';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c13 = 'G';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c13 = '>';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c13 = '#';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c13 = '=';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c13 = 133;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c13 = 23;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c13 = 24;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c13 = 'D';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c13 = 'u';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c13 = 'd';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c13 = 'E';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c13 = 19;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c13 = 29;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c13 = '?';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c13 = '@';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c13 = 14;
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c13 = ' ';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c13 = '!';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c13 = 'A';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c13 = 'B';
                                            break;
                                        }
                                        c13 = 65535;
                                        break;
                                    default:
                                        c13 = 65535;
                                        break;
                                }
                                switch (c13) {
                                    default:
                                        if (str3.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
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
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                    case 31:
                                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                    case '*':
                                    case '+':
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            break;
                    }
                    f20150i1 = z11;
                    f20149h1 = true;
                }
                z11 = true;
                f20150i1 = z11;
                f20149h1 = true;
            }
        }
        return f20150i1;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: A */
    public final void mo22044A() {
        try {
            super.mo22044A();
            if (this.f20159J0 != null) {
                m22038D0();
            }
        } catch (Throwable th2) {
            if (this.f20159J0 != null) {
                m22038D0();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: B */
    protected final void mo22045B() {
        this.f20168S0 = 0;
        this.f20167R0 = SystemClock.elapsedRealtime();
        this.f20172W0 = SystemClock.elapsedRealtime() * 1000;
        this.f20173X0 = 0L;
        this.f20174Y0 = 0;
        this.f20152C0.m25770g();
    }

    @Override // com.google.android.gms.internal.ads.pu3
    /* renamed from: C */
    protected final void mo22046C() {
        this.f20166Q0 = -9223372036854775807L;
        if (this.f20168S0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f20153D0.m20938d(this.f20168S0, elapsedRealtime - this.f20167R0);
            this.f20168S0 = 0;
            this.f20167R0 = elapsedRealtime;
        }
        int i11 = this.f20174Y0;
        if (i11 != 0) {
            this.f20153D0.m20952r(this.f20173X0, i11);
            this.f20173X0 = 0L;
            this.f20174Y0 = 0;
        }
        this.f20152C0.m25771h();
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: E */
    protected final float mo22047E(float f11, C4671k3 c4671k3, C4671k3[] c4671k3Arr) {
        float f12 = -1.0f;
        for (C4671k3 c4671k32 : c4671k3Arr) {
            float f13 = c4671k32.f23106s;
            if (f13 != -1.0f) {
                f12 = Math.max(f12, f13);
            }
        }
        if (f12 == -1.0f) {
            return -1.0f;
        }
        return f12 * f11;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: F */
    protected final int mo22048F(md4 md4Var, C4671k3 c4671k3) {
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14 = 128;
        if (!k70.m23850h(c4671k3.f23099l)) {
            return 128;
        }
        int i15 = 0;
        if (c4671k3.f23102o != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        List m22035A0 = m22035A0(md4Var, c4671k3, z11, false);
        if (z11 && m22035A0.isEmpty()) {
            m22035A0 = m22035A0(md4Var, c4671k3, false, false);
        }
        if (m22035A0.isEmpty()) {
            return 129;
        }
        if (!kd4.m23907r0(c4671k3)) {
            return 130;
        }
        hd4 hd4Var = (hd4) m22035A0.get(0);
        boolean m22792d = hd4Var.m22792d(c4671k3);
        if (!m22792d) {
            for (int i16 = 1; i16 < m22035A0.size(); i16++) {
                hd4 hd4Var2 = (hd4) m22035A0.get(i16);
                if (hd4Var2.m22792d(c4671k3)) {
                    hd4Var = hd4Var2;
                    z12 = false;
                    m22792d = true;
                    break;
                }
            }
        }
        z12 = true;
        if (true != m22792d) {
            i11 = 3;
        } else {
            i11 = 4;
        }
        if (true != hd4Var.m22793e(c4671k3)) {
            i12 = 8;
        } else {
            i12 = 16;
        }
        if (true != hd4Var.f21644g) {
            i13 = 0;
        } else {
            i13 = 64;
        }
        if (true != z12) {
            i14 = 0;
        }
        if (m22792d) {
            List m22035A02 = m22035A0(md4Var, c4671k3, z11, true);
            if (!m22035A02.isEmpty()) {
                hd4 hd4Var3 = (hd4) de4.m21359g(m22035A02, c4671k3).get(0);
                if (hd4Var3.m22792d(c4671k3) && hd4Var3.m22793e(c4671k3)) {
                    i15 = 32;
                }
            }
        }
        return i11 | i12 | i15 | i13 | i14;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: G */
    protected final lw3 mo22049G(hd4 hd4Var, C4671k3 c4671k3, C4671k3 c4671k32) {
        int i11;
        int i12;
        lw3 m22791b = hd4Var.m22791b(c4671k3, c4671k32);
        int i13 = m22791b.f24264e;
        int i14 = c4671k32.f23104q;
        ek4 ek4Var = this.f20155F0;
        if (i14 > ek4Var.f19665a || c4671k32.f23105r > ek4Var.f19666b) {
            i13 |= 256;
        }
        if (m22042x0(hd4Var, c4671k32) > this.f20155F0.f19667c) {
            i13 |= 64;
        }
        String str = hd4Var.f21638a;
        if (i13 != 0) {
            i12 = i13;
            i11 = 0;
        } else {
            i11 = m22791b.f24263d;
            i12 = 0;
        }
        return new lw3(str, c4671k3, c4671k32, i11, i12);
    }

    /* renamed from: G0 */
    protected final void m22050G0(gd4 gd4Var, int i11, long j11) {
        m22036B0();
        int i12 = g92.f20474a;
        Trace.beginSection("releaseOutputBuffer");
        gd4Var.mo22000g(i11, true);
        Trace.endSection();
        this.f20172W0 = SystemClock.elapsedRealtime() * 1000;
        this.f23278u0.f24130e++;
        this.f20169T0 = 0;
        m22061X();
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: H */
    public final lw3 mo22051H(h34 h34Var) {
        lw3 mo22051H = super.mo22051H(h34Var);
        this.f20153D0.m20940f(h34Var.f21525a, mo22051H);
        return mo22051H;
    }

    /* renamed from: H0 */
    protected final void m22052H0(gd4 gd4Var, int i11, long j11, long j12) {
        m22036B0();
        int i12 = g92.f20474a;
        Trace.beginSection("releaseOutputBuffer");
        gd4Var.mo21994a(i11, j12);
        Trace.endSection();
        this.f20172W0 = SystemClock.elapsedRealtime() * 1000;
        this.f23278u0.f24130e++;
        this.f20169T0 = 0;
        m22061X();
    }

    /* renamed from: I0 */
    protected final void m22053I0(gd4 gd4Var, int i11, long j11) {
        int i12 = g92.f20474a;
        Trace.beginSection("skipVideoBuffer");
        gd4Var.mo22000g(i11, false);
        Trace.endSection();
        this.f23278u0.f24131f++;
    }

    /* renamed from: J0 */
    protected final void m22054J0(int i11, int i12) {
        lv3 lv3Var = this.f23278u0;
        lv3Var.f24133h += i11;
        int i13 = i11 + i12;
        lv3Var.f24132g += i13;
        this.f20168S0 += i13;
        int i14 = this.f20169T0 + i13;
        this.f20169T0 = i14;
        lv3Var.f24134i = Math.max(i14, lv3Var.f24134i);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: K */
    protected final ed4 mo22055K(hd4 hd4Var, C4671k3 c4671k3, MediaCrypto mediaCrypto, float f11) {
        String str;
        ek4 ek4Var;
        int i11;
        int i12;
        String str2;
        String str3;
        Point point;
        int i13;
        int i14;
        boolean z11;
        Pair m21354b;
        int m22041w0;
        zzxj zzxjVar = this.f20159J0;
        if (zzxjVar != null && zzxjVar.f32173p != hd4Var.f21643f) {
            m22038D0();
        }
        String str4 = hd4Var.f21640c;
        C4671k3[] m25547p = m25547p();
        int i15 = c4671k3.f23104q;
        int i16 = c4671k3.f23105r;
        int m22042x0 = m22042x0(hd4Var, c4671k3);
        int length = m25547p.length;
        if (length == 1) {
            if (m22042x0 != -1 && (m22041w0 = m22041w0(hd4Var, c4671k3)) != -1) {
                m22042x0 = Math.min((int) (m22042x0 * 1.5f), m22041w0);
            }
            ek4Var = new ek4(i15, i16, m22042x0);
            str = str4;
        } else {
            boolean z12 = false;
            for (int i17 = 0; i17 < length; i17++) {
                C4671k3 c4671k32 = m25547p[i17];
                if (c4671k3.f23111x != null && c4671k32.f23111x == null) {
                    C5004t1 m23809b = c4671k32.m23809b();
                    m23809b.m26510g0(c4671k3.f23111x);
                    c4671k32 = m23809b.m26529y();
                }
                if (hd4Var.m22791b(c4671k3, c4671k32).f24263d != 0) {
                    int i18 = c4671k32.f23104q;
                    if (i18 == -1 || c4671k32.f23105r == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 |= z11;
                    i15 = Math.max(i15, i18);
                    i16 = Math.max(i16, c4671k32.f23105r);
                    m22042x0 = Math.max(m22042x0, m22042x0(hd4Var, c4671k32));
                }
            }
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(i15);
                String str5 = "x";
                sb2.append("x");
                sb2.append(i16);
                String str6 = "MediaCodecVideoRenderer";
                lr1.m24356e("MediaCodecVideoRenderer", sb2.toString());
                int i19 = c4671k3.f23105r;
                int i21 = c4671k3.f23104q;
                if (i19 > i21) {
                    i11 = i19;
                } else {
                    i11 = i21;
                }
                if (i19 <= i21) {
                    i12 = i19;
                } else {
                    i12 = i21;
                }
                float f12 = i12 / i11;
                int[] iArr = f20148g1;
                str = str4;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = iArr[i22];
                    int[] iArr2 = iArr;
                    int i24 = (int) (i23 * f12);
                    if (i23 <= i11 || i24 <= i12) {
                        break;
                    }
                    int i25 = i11;
                    int i26 = i12;
                    if (g92.f20474a >= 21) {
                        if (i19 <= i21) {
                            i14 = i23;
                        } else {
                            i14 = i24;
                        }
                        if (i19 <= i21) {
                            i23 = i24;
                        }
                        point = hd4Var.m22790a(i14, i23);
                        str2 = str5;
                        str3 = str6;
                        if (hd4Var.m22794f(point.x, point.y, c4671k3.f23106s)) {
                            break;
                        }
                        i22++;
                        iArr = iArr2;
                        i11 = i25;
                        i12 = i26;
                        str5 = str2;
                        str6 = str3;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        try {
                            int m22321O = g92.m22321O(i23, 16) * 16;
                            int m22321O2 = g92.m22321O(i24, 16) * 16;
                            if (m22321O * m22321O2 <= de4.m21353a()) {
                                if (i19 <= i21) {
                                    i13 = m22321O;
                                } else {
                                    i13 = m22321O2;
                                }
                                if (i19 <= i21) {
                                    m22321O = m22321O2;
                                }
                                point = new Point(i13, m22321O);
                            } else {
                                i22++;
                                iArr = iArr2;
                                i11 = i25;
                                i12 = i26;
                                str5 = str2;
                                str6 = str3;
                            }
                        } catch (zzqz unused) {
                        }
                    }
                }
                str2 = str5;
                str3 = str6;
                point = null;
                if (point != null) {
                    i15 = Math.max(i15, point.x);
                    i16 = Math.max(i16, point.y);
                    C5004t1 m23809b2 = c4671k3.m23809b();
                    m23809b2.m26528x(i15);
                    m23809b2.m26507f(i16);
                    m22042x0 = Math.max(m22042x0, m22041w0(hd4Var, m23809b2.m26529y()));
                    lr1.m24356e(str3, "Codec max resolution adjusted to: " + i15 + str2 + i16);
                }
            } else {
                str = str4;
            }
            ek4Var = new ek4(i15, i16, m22042x0);
        }
        this.f20155F0 = ek4Var;
        boolean z13 = this.f20154E0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c4671k3.f23104q);
        mediaFormat.setInteger("height", c4671k3.f23105r);
        nt1.m25010b(mediaFormat, c4671k3.f23101n);
        float f13 = c4671k3.f23106s;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        nt1.m25009a(mediaFormat, "rotation-degrees", c4671k3.f23107t);
        sc4 sc4Var = c4671k3.f23111x;
        if (sc4Var != null) {
            nt1.m25009a(mediaFormat, "color-transfer", sc4Var.f27622c);
            nt1.m25009a(mediaFormat, "color-standard", sc4Var.f27620a);
            nt1.m25009a(mediaFormat, "color-range", sc4Var.f27621b);
            byte[] bArr = sc4Var.f27623d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c4671k3.f23099l) && (m21354b = de4.m21354b(c4671k3)) != null) {
            nt1.m25009a(mediaFormat, "profile", ((Integer) m21354b.first).intValue());
        }
        mediaFormat.setInteger("max-width", ek4Var.f19665a);
        mediaFormat.setInteger("max-height", ek4Var.f19666b);
        nt1.m25009a(mediaFormat, "max-input-size", ek4Var.f19667c);
        if (g92.f20474a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f20158I0 == null) {
            if (m22040F0(hd4Var)) {
                if (this.f20159J0 == null) {
                    this.f20159J0 = zzxj.m28837a(this.f20151B0, hd4Var.f21643f);
                }
                this.f20158I0 = this.f20159J0;
            } else {
                throw new IllegalStateException();
            }
        }
        return ed4.m21697b(hd4Var, mediaFormat, c4671k3, this.f20158I0, null);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: L */
    protected final List mo22056L(md4 md4Var, C4671k3 c4671k3, boolean z11) {
        return de4.m21359g(m22035A0(md4Var, c4671k3, false, false), c4671k3);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: M */
    protected final void mo22057M(Exception exc) {
        lr1.m24354c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f20153D0.m20953s(exc);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: N */
    protected final void mo22058N(String str, ed4 ed4Var, long j11, long j12) {
        this.f20153D0.m20935a(str, j11, j12);
        this.f20156G0 = m22043z0(str);
        hd4 m23918h0 = m23918h0();
        m23918h0.getClass();
        boolean z11 = false;
        if (g92.f20474a >= 29 && "video/x-vnd.on2.vp9".equals(m23918h0.f21639b)) {
            MediaCodecInfo.CodecProfileLevel[] m22795g = m23918h0.m22795g();
            int length = m22795g.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (m22795g[i11].profile == 16384) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        this.f20157H0 = z11;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: O */
    protected final void mo22059O(String str) {
        this.f20153D0.m20936b(str);
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: W */
    protected final void mo22060W(C4671k3 c4671k3, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        gd4 m23917f0 = m23917f0();
        if (m23917f0 != null) {
            m23917f0.mo21999f(this.f20161L0);
        }
        mediaFormat.getClass();
        boolean z11 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z11 = true;
        }
        if (z11) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f20175Z0 = integer;
        if (z11) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f20176a1 = integer2;
        float f11 = c4671k3.f23108u;
        this.f20178c1 = f11;
        if (g92.f20474a >= 21) {
            int i11 = c4671k3.f23107t;
            if (i11 == 90 || i11 == 270) {
                int i12 = this.f20175Z0;
                this.f20175Z0 = integer2;
                this.f20176a1 = i12;
                this.f20178c1 = 1.0f / f11;
            }
        } else {
            this.f20177b1 = c4671k3.f23107t;
        }
        this.f20152C0.m25766c(c4671k3.f23106s);
    }

    /* renamed from: X */
    final void m22061X() {
        this.f20164O0 = true;
        if (!this.f20162M0) {
            this.f20162M0 = true;
            this.f20153D0.m20951q(this.f20158I0);
            this.f20160K0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: Y */
    protected final void mo22062Y() {
        this.f20162M0 = false;
        int i11 = g92.f20474a;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: Z */
    protected final void mo22063Z(il3 il3Var) {
        this.f20170U0++;
        int i11 = g92.f20474a;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: b0 */
    protected final boolean mo22064b0(long j11, long j12, gd4 gd4Var, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, C4671k3 c4671k3) {
        boolean z13;
        int m25550t;
        gd4Var.getClass();
        if (this.f20165P0 == -9223372036854775807L) {
            this.f20165P0 = j11;
        }
        if (j13 != this.f20171V0) {
            this.f20152C0.m25767d(j13);
            this.f20171V0 = j13;
        }
        long m23916e0 = m23916e0();
        long j14 = j13 - m23916e0;
        if (z11 && !z12) {
            m22053I0(gd4Var, i11, j14);
            return true;
        }
        float m23915d0 = m23915d0();
        int mo20807n = mo20807n();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j13 - j11) / m23915d0);
        if (mo20807n == 2) {
            j15 -= elapsedRealtime - j12;
        }
        if (this.f20158I0 == this.f20159J0) {
            if (!m22039E0(j15)) {
                return false;
            }
            m22053I0(gd4Var, i11, j14);
            m22073y0(j15);
            return true;
        }
        long j16 = elapsedRealtime - this.f20172W0;
        boolean z14 = this.f20164O0 ? !this.f20162M0 : mo20807n == 2 || this.f20163N0;
        if (this.f20166Q0 == -9223372036854775807L && j11 >= m23916e0 && (z14 || (mo20807n == 2 && m22039E0(j15) && j16 > 100000))) {
            long nanoTime = System.nanoTime();
            if (g92.f20474a >= 21) {
                m22052H0(gd4Var, i11, j14, nanoTime);
            } else {
                m22050G0(gd4Var, i11, j14);
            }
            m22073y0(j15);
            return true;
        }
        if (mo20807n != 2 || j11 == this.f20165P0) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long m25765a = this.f20152C0.m25765a((j15 * 1000) + nanoTime2);
        long j17 = (m25765a - nanoTime2) / 1000;
        long j18 = this.f20166Q0;
        if (j17 < -500000 && !z12 && (m25550t = m25550t(j11)) != 0) {
            if (j18 != -9223372036854775807L) {
                lv3 lv3Var = this.f23278u0;
                lv3Var.f24129d += m25550t;
                lv3Var.f24131f += this.f20170U0;
            } else {
                this.f23278u0.f24135j++;
                m22054J0(m25550t, this.f20170U0);
            }
            m23922o0();
            return false;
        }
        if (m22039E0(j17) && !z12) {
            if (j18 != -9223372036854775807L) {
                m22053I0(gd4Var, i11, j14);
                z13 = true;
            } else {
                int i14 = g92.f20474a;
                Trace.beginSection("dropVideoBuffer");
                gd4Var.mo22000g(i11, false);
                Trace.endSection();
                z13 = true;
                m22054J0(0, 1);
            }
            m22073y0(j17);
            return z13;
        }
        if (g92.f20474a >= 21) {
            if (j17 < 50000) {
                m22052H0(gd4Var, i11, j14, m25765a);
                m22073y0(j17);
                return true;
            }
        } else if (j17 < 30000) {
            if (j17 > 11000) {
                try {
                    Thread.sleep(((-10000) + j17) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            m22050G0(gd4Var, i11, j14);
            m22073y0(j17);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.c44
    /* renamed from: c */
    public final void mo20799c(float f11, float f12) {
        super.mo20799c(f11, f12);
        this.f20152C0.m25768e(f11);
    }

    @Override // com.google.android.gms.internal.ads.c44, com.google.android.gms.internal.ads.d44
    /* renamed from: d */
    public final String mo20800d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: g0 */
    protected final zzqm mo22065g0(Throwable th2, hd4 hd4Var) {
        return new zzxe(th2, hd4Var, this.f20158I0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.x34
    /* renamed from: h */
    public final void mo22066h(int i11, Object obj) {
        zzxj zzxjVar;
        if (i11 != 1) {
            if (i11 != 7) {
                if (i11 != 10) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            this.f20152C0.m25773j(((Integer) obj).intValue());
                            return;
                        }
                        return;
                    } else {
                        int intValue = ((Integer) obj).intValue();
                        this.f20161L0 = intValue;
                        gd4 m23917f0 = m23917f0();
                        if (m23917f0 != null) {
                            m23917f0.mo21999f(intValue);
                            return;
                        }
                        return;
                    }
                }
                int intValue2 = ((Integer) obj).intValue();
                if (this.f20180e1 != intValue2) {
                    this.f20180e1 = intValue2;
                    return;
                }
                return;
            }
            this.f20181f1 = (ik4) obj;
            return;
        }
        if (obj instanceof Surface) {
            zzxjVar = (Surface) obj;
        } else {
            zzxjVar = null;
        }
        if (zzxjVar == null) {
            zzxj zzxjVar2 = this.f20159J0;
            if (zzxjVar2 != null) {
                zzxjVar = zzxjVar2;
            } else {
                hd4 m23918h0 = m23918h0();
                if (m23918h0 != null && m22040F0(m23918h0)) {
                    zzxjVar = zzxj.m28837a(this.f20151B0, m23918h0.f21643f);
                    this.f20159J0 = zzxjVar;
                }
            }
        }
        if (this.f20158I0 != zzxjVar) {
            this.f20158I0 = zzxjVar;
            this.f20152C0.m25772i(zzxjVar);
            this.f20160K0 = false;
            int mo20807n = mo20807n();
            gd4 m23917f02 = m23917f0();
            if (m23917f02 != null) {
                if (g92.f20474a >= 23 && zzxjVar != null && !this.f20156G0) {
                    m23917f02.mo21997d(zzxjVar);
                } else {
                    m23920l0();
                    m23919j0();
                }
            }
            if (zzxjVar != null && zzxjVar != this.f20159J0) {
                m22037C0();
                this.f20162M0 = false;
                int i12 = g92.f20474a;
                if (mo20807n == 2) {
                    this.f20166Q0 = -9223372036854775807L;
                    return;
                }
                return;
            }
            this.f20179d1 = null;
            this.f20162M0 = false;
            int i13 = g92.f20474a;
            return;
        }
        if (zzxjVar != null && zzxjVar != this.f20159J0) {
            m22037C0();
            if (this.f20160K0) {
                this.f20153D0.m20951q(this.f20158I0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: i0 */
    protected final void mo22067i0(il3 il3Var) {
        if (!this.f20157H0) {
            return;
        }
        ByteBuffer byteBuffer = il3Var.f22220f;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b11 = byteBuffer.get();
            short s7 = byteBuffer.getShort();
            short s11 = byteBuffer.getShort();
            byte b12 = byteBuffer.get();
            byte b13 = byteBuffer.get();
            byteBuffer.position(0);
            if (b11 == -75 && s7 == 60 && s11 == 1 && b12 == 4) {
                if (b13 == 0 || b13 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    gd4 m23917f0 = m23917f0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    m23917f0.mo22002p(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: k0 */
    public final void mo22068k0(long j11) {
        super.mo22068k0(j11);
        this.f20170U0--;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: m0 */
    public final void mo22069m0() {
        super.mo22069m0();
        this.f20170U0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.kd4
    /* renamed from: q0 */
    protected final boolean mo22070q0(hd4 hd4Var) {
        if (this.f20158I0 == null && !m22040F0(hd4Var)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: x */
    public final void mo22071x() {
        this.f20179d1 = null;
        this.f20162M0 = false;
        int i11 = g92.f20474a;
        this.f20160K0 = false;
        try {
            super.mo22071x();
        } finally {
            this.f20153D0.m20937c(this.f23278u0);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: y */
    public final void mo22072y(boolean z11, boolean z12) {
        super.mo22072y(z11, z12);
        m25552v();
        this.f20153D0.m20939e(this.f23278u0);
        this.f20163N0 = z12;
        this.f20164O0 = false;
    }

    /* renamed from: y0 */
    protected final void m22073y0(long j11) {
        lv3 lv3Var = this.f23278u0;
        lv3Var.f24136k += j11;
        lv3Var.f24137l++;
        this.f20173X0 += j11;
        this.f20174Y0++;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.pu3
    /* renamed from: z */
    public final void mo22074z(long j11, boolean z11) {
        super.mo22074z(j11, z11);
        this.f20162M0 = false;
        int i11 = g92.f20474a;
        this.f20152C0.m25769f();
        this.f20171V0 = -9223372036854775807L;
        this.f20165P0 = -9223372036854775807L;
        this.f20169T0 = 0;
        this.f20166Q0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.kd4, com.google.android.gms.internal.ads.c44
    public final boolean zzN() {
        zzxj zzxjVar;
        if (super.zzN() && (this.f20162M0 || (((zzxjVar = this.f20159J0) != null && this.f20158I0 == zzxjVar) || m23917f0() == null))) {
            this.f20166Q0 = -9223372036854775807L;
            return true;
        }
        if (this.f20166Q0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f20166Q0) {
            return true;
        }
        this.f20166Q0 = -9223372036854775807L;
        return false;
    }
}
