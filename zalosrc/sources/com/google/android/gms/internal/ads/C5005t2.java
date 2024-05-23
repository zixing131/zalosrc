package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.t2 */
/* loaded from: classes2.dex */
public final class C5005t2 implements jm4 {

    /* renamed from: c0 */
    public static final qm4 f28116c0 = new qm4() { // from class: com.google.android.gms.internal.ads.p2
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C5005t2(0)};
        }
    };

    /* renamed from: d0 */
    private static final byte[] f28117d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0 */
    private static final byte[] f28118e0 = g92.m22308B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    private static final byte[] f28119f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    private static final byte[] f28120g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0 */
    private static final UUID f28121h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0 */
    private static final Map f28122i0;

    /* renamed from: A */
    private long f28123A;

    /* renamed from: B */
    private long f28124B;

    /* renamed from: C */
    private ms1 f28125C;

    /* renamed from: D */
    private ms1 f28126D;

    /* renamed from: E */
    private boolean f28127E;

    /* renamed from: F */
    private boolean f28128F;

    /* renamed from: G */
    private int f28129G;

    /* renamed from: H */
    private long f28130H;

    /* renamed from: I */
    private long f28131I;

    /* renamed from: J */
    private int f28132J;

    /* renamed from: K */
    private int f28133K;

    /* renamed from: L */
    private int[] f28134L;

    /* renamed from: M */
    private int f28135M;

    /* renamed from: N */
    private int f28136N;

    /* renamed from: O */
    private int f28137O;

    /* renamed from: P */
    private int f28138P;

    /* renamed from: Q */
    private boolean f28139Q;

    /* renamed from: R */
    private long f28140R;

    /* renamed from: S */
    private int f28141S;

    /* renamed from: T */
    private int f28142T;

    /* renamed from: U */
    private int f28143U;

    /* renamed from: V */
    private boolean f28144V;

    /* renamed from: W */
    private boolean f28145W;

    /* renamed from: X */
    private boolean f28146X;

    /* renamed from: Y */
    private int f28147Y;

    /* renamed from: Z */
    private byte f28148Z;

    /* renamed from: a */
    private final InterfaceC4819o2 f28149a;

    /* renamed from: a0 */
    private boolean f28150a0;

    /* renamed from: b */
    private final C5079v2 f28151b;

    /* renamed from: b0 */
    private mm4 f28152b0;

    /* renamed from: c */
    private final SparseArray f28153c;

    /* renamed from: d */
    private final boolean f28154d;

    /* renamed from: e */
    private final x02 f28155e;

    /* renamed from: f */
    private final x02 f28156f;

    /* renamed from: g */
    private final x02 f28157g;

    /* renamed from: h */
    private final x02 f28158h;

    /* renamed from: i */
    private final x02 f28159i;

    /* renamed from: j */
    private final x02 f28160j;

    /* renamed from: k */
    private final x02 f28161k;

    /* renamed from: l */
    private final x02 f28162l;

    /* renamed from: m */
    private final x02 f28163m;

    /* renamed from: n */
    private final x02 f28164n;

    /* renamed from: o */
    private ByteBuffer f28165o;

    /* renamed from: p */
    private long f28166p;

    /* renamed from: q */
    private long f28167q;

    /* renamed from: r */
    private long f28168r;

    /* renamed from: s */
    private long f28169s;

    /* renamed from: t */
    private long f28170t;

    /* renamed from: u */
    private C4968s2 f28171u;

    /* renamed from: v */
    private boolean f28172v;

    /* renamed from: w */
    private int f28173w;

    /* renamed from: x */
    private long f28174x;

    /* renamed from: y */
    private boolean f28175y;

    /* renamed from: z */
    private long f28176z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f28122i0 = Collections.unmodifiableMap(hashMap);
    }

    public C5005t2(int i11) {
        C4744m2 c4744m2 = new C4744m2();
        this.f28167q = -1L;
        this.f28168r = -9223372036854775807L;
        this.f28169s = -9223372036854775807L;
        this.f28170t = -9223372036854775807L;
        this.f28176z = -1L;
        this.f28123A = -1L;
        this.f28124B = -9223372036854775807L;
        this.f28149a = c4744m2;
        c4744m2.mo24447b(new C4931r2(this, null));
        this.f28154d = true;
        this.f28151b = new C5079v2();
        this.f28153c = new SparseArray();
        this.f28157g = new x02(4);
        this.f28158h = new x02(ByteBuffer.allocate(4).putInt(-1).array());
        this.f28159i = new x02(4);
        this.f28155e = new x02(AbstractC4557h.f21470a);
        this.f28156f = new x02(4);
        this.f28160j = new x02();
        this.f28161k = new x02();
        this.f28162l = new x02(8);
        this.f28163m = new x02();
        this.f28164n = new x02();
        this.f28134L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static final int m26540n(int i11) {
        switch (i11) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static final boolean m26541o(int i11) {
        return i11 == 357149030 || i11 == 524531317 || i11 == 475249515 || i11 == 374648427;
    }

    /* renamed from: p */
    private final int m26542p(km4 km4Var, C4968s2 c4968s2, int i11, boolean z11) {
        int i12;
        if ("S_TEXT/UTF8".equals(c4968s2.f27473b)) {
            m26550x(km4Var, f28117d0, i11);
            int i13 = this.f28142T;
            m26549w();
            return i13;
        }
        if ("S_TEXT/ASS".equals(c4968s2.f27473b)) {
            m26550x(km4Var, f28119f0, i11);
            int i14 = this.f28142T;
            m26549w();
            return i14;
        }
        if ("S_TEXT/WEBVTT".equals(c4968s2.f27473b)) {
            m26550x(km4Var, f28120g0, i11);
            int i15 = this.f28142T;
            m26549w();
            return i15;
        }
        InterfaceC4928r interfaceC4928r = c4968s2.f27470X;
        boolean z12 = true;
        if (!this.f28144V) {
            if (c4968s2.f27479h) {
                this.f28137O &= -1073741825;
                int i16 = 128;
                if (!this.f28145W) {
                    ((yl4) km4Var).mo23962e(this.f28157g.m27777h(), 0, 1, false);
                    this.f28141S++;
                    if ((this.f28157g.m27777h()[0] & 128) != 128) {
                        this.f28148Z = this.f28157g.m27777h()[0];
                        this.f28145W = true;
                    } else {
                        throw zzbu.m28711a("Extension bit is set in signal byte", null);
                    }
                }
                byte b11 = this.f28148Z;
                if ((b11 & 1) == 1) {
                    int i17 = b11 & 2;
                    this.f28137O |= 1073741824;
                    if (!this.f28150a0) {
                        ((yl4) km4Var).mo23962e(this.f28162l.m27777h(), 0, 8, false);
                        this.f28141S += 8;
                        this.f28150a0 = true;
                        byte[] m27777h = this.f28157g.m27777h();
                        if (i17 != 2) {
                            i16 = 0;
                        }
                        m27777h[0] = (byte) (i16 | 8);
                        this.f28157g.m27775f(0);
                        interfaceC4928r.mo23299c(this.f28157g, 1, 1);
                        this.f28142T++;
                        this.f28162l.m27775f(0);
                        interfaceC4928r.mo23299c(this.f28162l, 8, 1);
                        this.f28142T += 8;
                    }
                    if (i17 == 2) {
                        if (!this.f28146X) {
                            ((yl4) km4Var).mo23962e(this.f28157g.m27777h(), 0, 1, false);
                            this.f28141S++;
                            this.f28157g.m27775f(0);
                            this.f28147Y = this.f28157g.m27788s();
                            this.f28146X = true;
                        }
                        int i18 = this.f28147Y * 4;
                        this.f28157g.m27772c(i18);
                        ((yl4) km4Var).mo23962e(this.f28157g.m27777h(), 0, i18, false);
                        this.f28141S += i18;
                        int i19 = (this.f28147Y >> 1) + 1;
                        int i21 = (i19 * 6) + 2;
                        ByteBuffer byteBuffer = this.f28165o;
                        if (byteBuffer == null || byteBuffer.capacity() < i21) {
                            this.f28165o = ByteBuffer.allocate(i21);
                        }
                        this.f28165o.position(0);
                        this.f28165o.putShort((short) i19);
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            i12 = this.f28147Y;
                            if (i22 >= i12) {
                                break;
                            }
                            int m27791v = this.f28157g.m27791v();
                            if (i22 % 2 == 0) {
                                this.f28165o.putShort((short) (m27791v - i23));
                            } else {
                                this.f28165o.putInt(m27791v - i23);
                            }
                            i22++;
                            i23 = m27791v;
                        }
                        int i24 = (i11 - this.f28141S) - i23;
                        if ((i12 & 1) == 1) {
                            this.f28165o.putInt(i24);
                        } else {
                            this.f28165o.putShort((short) i24);
                            this.f28165o.putInt(0);
                        }
                        this.f28163m.m27773d(this.f28165o.array(), i21);
                        interfaceC4928r.mo23299c(this.f28163m, i21, 1);
                        this.f28142T += i21;
                    }
                }
            } else {
                byte[] bArr = c4968s2.f27480i;
                if (bArr != null) {
                    this.f28160j.m27773d(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(c4968s2.f27473b) ? c4968s2.f27477f > 0 : z11) {
                this.f28137O |= 268435456;
                this.f28164n.m27772c(0);
                int m27781l = (this.f28160j.m27781l() + i11) - this.f28141S;
                this.f28157g.m27772c(4);
                this.f28157g.m27777h()[0] = (byte) ((m27781l >> 24) & 255);
                this.f28157g.m27777h()[1] = (byte) ((m27781l >> 16) & 255);
                this.f28157g.m27777h()[2] = (byte) ((m27781l >> 8) & 255);
                this.f28157g.m27777h()[3] = (byte) (m27781l & 255);
                interfaceC4928r.mo23299c(this.f28157g, 4, 2);
                this.f28142T += 4;
            }
            this.f28144V = true;
        }
        int m27781l2 = i11 + this.f28160j.m27781l();
        if (!"V_MPEG4/ISO/AVC".equals(c4968s2.f27473b) && !"V_MPEGH/ISO/HEVC".equals(c4968s2.f27473b)) {
            if (c4968s2.f27466T != null) {
                if (this.f28160j.m27781l() != 0) {
                    z12 = false;
                }
                v71.m27175f(z12);
                c4968s2.f27466T.m26216d(km4Var);
            }
            while (true) {
                int i25 = this.f28141S;
                if (i25 >= m27781l2) {
                    break;
                }
                int m26543q = m26543q(km4Var, interfaceC4928r, m27781l2 - i25);
                this.f28141S += m26543q;
                this.f28142T += m26543q;
            }
        } else {
            byte[] m27777h2 = this.f28156f.m27777h();
            m27777h2[0] = 0;
            m27777h2[1] = 0;
            m27777h2[2] = 0;
            int i26 = c4968s2.f27471Y;
            int i27 = 4 - i26;
            while (this.f28141S < m27781l2) {
                int i28 = this.f28143U;
                if (i28 == 0) {
                    int min = Math.min(i26, this.f28160j.m27778i());
                    ((yl4) km4Var).mo23962e(m27777h2, i27 + min, i26 - min, false);
                    if (min > 0) {
                        this.f28160j.m27771b(m27777h2, i27, min);
                    }
                    this.f28141S += i26;
                    this.f28156f.m27775f(0);
                    this.f28143U = this.f28156f.m27791v();
                    this.f28155e.m27775f(0);
                    AbstractC4853p.m25366b(interfaceC4928r, this.f28155e, 4);
                    this.f28142T += 4;
                } else {
                    int m26543q2 = m26543q(km4Var, interfaceC4928r, i28);
                    this.f28141S += m26543q2;
                    this.f28142T += m26543q2;
                    this.f28143U -= m26543q2;
                }
            }
        }
        if ("A_VORBIS".equals(c4968s2.f27473b)) {
            this.f28158h.m27775f(0);
            AbstractC4853p.m25366b(interfaceC4928r, this.f28158h, 4);
            this.f28142T += 4;
        }
        int i29 = this.f28142T;
        m26549w();
        return i29;
    }

    /* renamed from: q */
    private final int m26543q(km4 km4Var, InterfaceC4928r interfaceC4928r, int i11) {
        int m27778i = this.f28160j.m27778i();
        if (m27778i > 0) {
            int min = Math.min(i11, m27778i);
            AbstractC4853p.m25366b(interfaceC4928r, this.f28160j, min);
            return min;
        }
        return AbstractC4853p.m25365a(interfaceC4928r, km4Var, i11, false);
    }

    /* renamed from: r */
    private final long m26544r(long j11) {
        long j12 = this.f28168r;
        if (j12 != -9223372036854775807L) {
            return g92.m22346g0(j11, j12, 1000L);
        }
        throw zzbu.m28711a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* renamed from: s */
    private final void m26545s(int i11) {
        if (this.f28125C != null && this.f28126D != null) {
            return;
        }
        throw zzbu.m28711a("Element " + i11 + " must be in a Cues", null);
    }

    /* renamed from: t */
    private final void m26546t(int i11) {
        if (this.f28171u != null) {
            return;
        }
        throw zzbu.m28711a("Element " + i11 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m26547u(C4968s2 c4968s2, long j11, int i11, int i12, int i13) {
        char c11;
        byte[] m26551y;
        int i14;
        int m27780k;
        int m27781l;
        C4965s c4965s = c4968s2.f27466T;
        if (c4965s != null) {
            c4965s.m26215c(c4968s2.f27470X, j11, i11, i12, i13, c4968s2.f27481j);
        } else {
            if ("S_TEXT/UTF8".equals(c4968s2.f27473b) || "S_TEXT/ASS".equals(c4968s2.f27473b) || "S_TEXT/WEBVTT".equals(c4968s2.f27473b)) {
                if (this.f28133K > 1) {
                    lr1.m24356e("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.f28131I;
                    if (j12 == -9223372036854775807L) {
                        lr1.m24356e("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c4968s2.f27473b;
                        byte[] m27777h = this.f28161k.m27777h();
                        int hashCode = str.hashCode();
                        if (hashCode != 738597099) {
                            if (hashCode != 1045209816) {
                                if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    c11 = 0;
                                    if (c11 == 0) {
                                        if (c11 != 1) {
                                            if (c11 == 2) {
                                                m26551y = m26551y(j12, "%02d:%02d:%02d.%03d", 1000L);
                                                i14 = 25;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            m26551y = m26551y(j12, "%01d:%02d:%02d:%02d", 10000L);
                                            i14 = 21;
                                        }
                                    } else {
                                        m26551y = m26551y(j12, "%02d:%02d:%02d,%03d", 1000L);
                                        i14 = 19;
                                    }
                                    System.arraycopy(m26551y, 0, m27777h, i14, m26551y.length);
                                    m27780k = this.f28161k.m27780k();
                                    while (true) {
                                        if (m27780k >= this.f28161k.m27781l()) {
                                            break;
                                        }
                                        if (this.f28161k.m27777h()[m27780k] == 0) {
                                            this.f28161k.m27774e(m27780k);
                                            break;
                                        }
                                        m27780k++;
                                    }
                                    InterfaceC4928r interfaceC4928r = c4968s2.f27470X;
                                    x02 x02Var = this.f28161k;
                                    AbstractC4853p.m25366b(interfaceC4928r, x02Var, x02Var.m27781l());
                                    m27781l = i12 + this.f28161k.m27781l();
                                    if ((i11 & 268435456) != 0) {
                                        if (this.f28133K > 1) {
                                            this.f28164n.m27772c(0);
                                        } else {
                                            int m27781l2 = this.f28164n.m27781l();
                                            c4968s2.f27470X.mo23299c(this.f28164n, m27781l2, 2);
                                            m27781l += m27781l2;
                                        }
                                    }
                                    c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                System.arraycopy(m26551y, 0, m27777h, i14, m26551y.length);
                                m27780k = this.f28161k.m27780k();
                                while (true) {
                                    if (m27780k >= this.f28161k.m27781l()) {
                                    }
                                    m27780k++;
                                }
                                InterfaceC4928r interfaceC4928r2 = c4968s2.f27470X;
                                x02 x02Var2 = this.f28161k;
                                AbstractC4853p.m25366b(interfaceC4928r2, x02Var2, x02Var2.m27781l());
                                m27781l = i12 + this.f28161k.m27781l();
                                if ((i11 & 268435456) != 0) {
                                }
                                c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
                            } else {
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c11 = 2;
                                    if (c11 == 0) {
                                    }
                                    System.arraycopy(m26551y, 0, m27777h, i14, m26551y.length);
                                    m27780k = this.f28161k.m27780k();
                                    while (true) {
                                        if (m27780k >= this.f28161k.m27781l()) {
                                        }
                                        m27780k++;
                                    }
                                    InterfaceC4928r interfaceC4928r22 = c4968s2.f27470X;
                                    x02 x02Var22 = this.f28161k;
                                    AbstractC4853p.m25366b(interfaceC4928r22, x02Var22, x02Var22.m27781l());
                                    m27781l = i12 + this.f28161k.m27781l();
                                    if ((i11 & 268435456) != 0) {
                                    }
                                    c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                System.arraycopy(m26551y, 0, m27777h, i14, m26551y.length);
                                m27780k = this.f28161k.m27780k();
                                while (true) {
                                    if (m27780k >= this.f28161k.m27781l()) {
                                    }
                                    m27780k++;
                                }
                                InterfaceC4928r interfaceC4928r222 = c4968s2.f27470X;
                                x02 x02Var222 = this.f28161k;
                                AbstractC4853p.m25366b(interfaceC4928r222, x02Var222, x02Var222.m27781l());
                                m27781l = i12 + this.f28161k.m27781l();
                                if ((i11 & 268435456) != 0) {
                                }
                                c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
                            }
                        } else {
                            if (str.equals("S_TEXT/ASS")) {
                                c11 = 1;
                                if (c11 == 0) {
                                }
                                System.arraycopy(m26551y, 0, m27777h, i14, m26551y.length);
                                m27780k = this.f28161k.m27780k();
                                while (true) {
                                    if (m27780k >= this.f28161k.m27781l()) {
                                    }
                                    m27780k++;
                                }
                                InterfaceC4928r interfaceC4928r2222 = c4968s2.f27470X;
                                x02 x02Var2222 = this.f28161k;
                                AbstractC4853p.m25366b(interfaceC4928r2222, x02Var2222, x02Var2222.m27781l());
                                m27781l = i12 + this.f28161k.m27781l();
                                if ((i11 & 268435456) != 0) {
                                }
                                c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
                            }
                            c11 = 65535;
                            if (c11 == 0) {
                            }
                            System.arraycopy(m26551y, 0, m27777h, i14, m26551y.length);
                            m27780k = this.f28161k.m27780k();
                            while (true) {
                                if (m27780k >= this.f28161k.m27781l()) {
                                }
                                m27780k++;
                            }
                            InterfaceC4928r interfaceC4928r22222 = c4968s2.f27470X;
                            x02 x02Var22222 = this.f28161k;
                            AbstractC4853p.m25366b(interfaceC4928r22222, x02Var22222, x02Var22222.m27781l());
                            m27781l = i12 + this.f28161k.m27781l();
                            if ((i11 & 268435456) != 0) {
                            }
                            c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
                        }
                    }
                }
            }
            m27781l = i12;
            if ((i11 & 268435456) != 0) {
            }
            c4968s2.f27470X.mo23302f(j11, i11, m27781l, i13, c4968s2.f27481j);
        }
        this.f28128F = true;
    }

    /* renamed from: v */
    private final void m26548v(km4 km4Var, int i11) {
        if (this.f28157g.m27781l() >= i11) {
            return;
        }
        if (this.f28157g.m27779j() < i11) {
            x02 x02Var = this.f28157g;
            int m27779j = x02Var.m27779j();
            x02Var.m27769H(Math.max(m27779j + m27779j, i11));
        }
        ((yl4) km4Var).mo23962e(this.f28157g.m27777h(), this.f28157g.m27781l(), i11 - this.f28157g.m27781l(), false);
        this.f28157g.m27774e(i11);
    }

    /* renamed from: w */
    private final void m26549w() {
        this.f28141S = 0;
        this.f28142T = 0;
        this.f28143U = 0;
        this.f28144V = false;
        this.f28145W = false;
        this.f28146X = false;
        this.f28147Y = 0;
        this.f28148Z = (byte) 0;
        this.f28150a0 = false;
        this.f28160j.m27772c(0);
    }

    /* renamed from: x */
    private final void m26550x(km4 km4Var, byte[] bArr, int i11) {
        int length = bArr.length;
        int i12 = length + i11;
        if (this.f28161k.m27779j() < i12) {
            x02 x02Var = this.f28161k;
            byte[] copyOf = Arrays.copyOf(bArr, i12 + i11);
            x02Var.m27773d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f28161k.m27777h(), 0, length);
        }
        ((yl4) km4Var).mo23962e(this.f28161k.m27777h(), length, i11, false);
        this.f28161k.m27775f(0);
        this.f28161k.m27774e(i12);
    }

    /* renamed from: y */
    private static byte[] m26551y(long j11, String str, long j12) {
        boolean z11;
        if (j11 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (i11 * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (i12 * 60000000);
        int i13 = (int) (j14 / 1000000);
        return g92.m22308B(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (i13 * 1000000)) / j12))));
    }

    /* renamed from: z */
    private static int[] m26552z(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[i11];
        }
        int length = iArr.length;
        if (length >= i11) {
            return iArr;
        }
        return new int[Math.max(length + length, i11)];
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        return new C5042u2().m26827a(km4Var);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f28152b0 = mm4Var;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f28124B = -9223372036854775807L;
        this.f28129G = 0;
        this.f28149a.zzb();
        this.f28151b.m27127e();
        m26549w();
        for (int i11 = 0; i11 < this.f28153c.size(); i11++) {
            C4965s c4965s = ((C4968s2) this.f28153c.valueAt(i11)).f27466T;
            if (c4965s != null) {
                c4965s.m26214b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        this.f28128F = false;
        while (!this.f28128F) {
            if (this.f28149a.mo24446a(km4Var)) {
                long zzf = km4Var.zzf();
                if (this.f28175y) {
                    this.f28123A = zzf;
                    c4667k.f23035a = this.f28176z;
                    this.f28175y = false;
                    return 1;
                }
                if (this.f28172v) {
                    long j11 = this.f28123A;
                    if (j11 != -1) {
                        c4667k.f23035a = j11;
                        this.f28123A = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i11 = 0; i11 < this.f28153c.size(); i11++) {
                    C4968s2 c4968s2 = (C4968s2) this.f28153c.valueAt(i11);
                    C4968s2.m26227d(c4968s2);
                    C4965s c4965s = c4968s2.f27466T;
                    if (c4965s != null) {
                        c4965s.m26213a(c4968s2.f27470X, c4968s2.f27481j);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0286, code lost:            throw com.google.android.gms.internal.ads.zzbu.m28711a("EBML lacing sample size out of range.", null);     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26553g(int i11, int i12, km4 km4Var) {
        long j11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        Throwable th2 = null;
        int i19 = 1;
        int i21 = 0;
        if (i18 != 161 && i18 != 163) {
            if (i18 != 165) {
                if (i18 != 16877) {
                    if (i18 != 16981) {
                        if (i18 != 18402) {
                            if (i18 != 21419) {
                                if (i18 != 25506) {
                                    if (i18 == 30322) {
                                        m26546t(i11);
                                        byte[] bArr = new byte[i12];
                                        this.f28171u.f27493v = bArr;
                                        ((yl4) km4Var).mo23962e(bArr, 0, i12, false);
                                        return;
                                    }
                                    throw zzbu.m28711a("Unexpected id: " + i18, null);
                                }
                                m26546t(i11);
                                byte[] bArr2 = new byte[i12];
                                this.f28171u.f27482k = bArr2;
                                ((yl4) km4Var).mo23962e(bArr2, 0, i12, false);
                                return;
                            }
                            Arrays.fill(this.f28159i.m27777h(), (byte) 0);
                            ((yl4) km4Var).mo23962e(this.f28159i.m27777h(), 4 - i12, i12, false);
                            this.f28159i.m27775f(0);
                            this.f28173w = (int) this.f28159i.m27762A();
                            return;
                        }
                        byte[] bArr3 = new byte[i12];
                        ((yl4) km4Var).mo23962e(bArr3, 0, i12, false);
                        m26546t(i11);
                        this.f28171u.f27481j = new C4891q(1, bArr3, 0, 0);
                        return;
                    }
                    m26546t(i11);
                    byte[] bArr4 = new byte[i12];
                    this.f28171u.f27480i = bArr4;
                    ((yl4) km4Var).mo23962e(bArr4, 0, i12, false);
                    return;
                }
                m26546t(i11);
                C4968s2 c4968s2 = this.f28171u;
                if (C4968s2.m26224a(c4968s2) != 1685485123 && C4968s2.m26224a(c4968s2) != 1685480259) {
                    ((yl4) km4Var).m28248l(i12, false);
                    return;
                }
                byte[] bArr5 = new byte[i12];
                c4968s2.f27460N = bArr5;
                ((yl4) km4Var).mo23962e(bArr5, 0, i12, false);
                return;
            }
            if (this.f28129G != 2) {
                return;
            }
            C4968s2 c4968s22 = (C4968s2) this.f28153c.get(this.f28135M);
            if (this.f28138P == 4 && "V_VP9".equals(c4968s22.f27473b)) {
                this.f28164n.m27772c(i12);
                ((yl4) km4Var).mo23962e(this.f28164n.m27777h(), 0, i12, false);
                return;
            }
            ((yl4) km4Var).m28248l(i12, false);
            return;
        }
        if (this.f28129G == 0) {
            this.f28135M = (int) this.f28151b.m27126d(km4Var, false, true, 8);
            this.f28136N = this.f28151b.m27125a();
            this.f28131I = -9223372036854775807L;
            this.f28129G = 1;
            this.f28157g.m27772c(0);
        }
        C4968s2 c4968s23 = (C4968s2) this.f28153c.get(this.f28135M);
        if (c4968s23 == null) {
            ((yl4) km4Var).m28248l(i12 - this.f28136N, false);
            this.f28129G = 0;
            return;
        }
        C4968s2.m26227d(c4968s23);
        if (this.f28129G == 1) {
            m26548v(km4Var, 3);
            int i22 = (this.f28157g.m27777h()[2] & 6) >> 1;
            byte b11 = 255;
            if (i22 == 0) {
                this.f28133K = 1;
                int[] m26552z = m26552z(this.f28134L, 1);
                this.f28134L = m26552z;
                m26552z[0] = (i12 - this.f28136N) - 3;
            } else {
                m26548v(km4Var, 4);
                int i23 = (this.f28157g.m27777h()[3] & 255) + 1;
                this.f28133K = i23;
                int[] m26552z2 = m26552z(this.f28134L, i23);
                this.f28134L = m26552z2;
                if (i22 == 2) {
                    int i24 = this.f28136N;
                    int i25 = this.f28133K;
                    Arrays.fill(m26552z2, 0, i25, ((i12 - i24) - 4) / i25);
                } else if (i22 == 1) {
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 4;
                    while (true) {
                        i14 = this.f28133K - 1;
                        if (i26 >= i14) {
                            break;
                        }
                        this.f28134L[i26] = 0;
                        while (true) {
                            i15 = i28 + 1;
                            m26548v(km4Var, i15);
                            int i29 = this.f28157g.m27777h()[i28] & 255;
                            int[] iArr = this.f28134L;
                            i16 = iArr[i26] + i29;
                            iArr[i26] = i16;
                            if (i29 != 255) {
                                break;
                            } else {
                                i28 = i15;
                            }
                        }
                        i27 += i16;
                        i26++;
                        i28 = i15;
                    }
                    this.f28134L[i14] = ((i12 - this.f28136N) - i28) - i27;
                } else if (i22 == 3) {
                    int i31 = 0;
                    int i32 = 4;
                    int i33 = 0;
                    while (true) {
                        int i34 = this.f28133K - 1;
                        if (i31 < i34) {
                            this.f28134L[i31] = i21;
                            int i35 = i32 + 1;
                            m26548v(km4Var, i35);
                            if (this.f28157g.m27777h()[i32] != 0) {
                                int i36 = 0;
                                while (true) {
                                    if (i36 < 8) {
                                        int i37 = i19 << (7 - i36);
                                        if ((this.f28157g.m27777h()[i32] & i37) != 0) {
                                            int i38 = i35 + i36;
                                            m26548v(km4Var, i38);
                                            int i39 = i32 + 1;
                                            j11 = this.f28157g.m27777h()[i32] & b11 & (~i37);
                                            while (i39 < i38) {
                                                j11 = (j11 << 8) | (this.f28157g.m27777h()[i39] & b11);
                                                i39++;
                                                i38 = i38;
                                                b11 = 255;
                                            }
                                            i13 = i38;
                                            if (i31 > 0) {
                                                j11 -= (1 << ((i36 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i36++;
                                            i19 = 1;
                                            b11 = 255;
                                        }
                                    } else {
                                        j11 = 0;
                                        i13 = i35;
                                        break;
                                    }
                                }
                                if (j11 < -2147483648L || j11 > 2147483647L) {
                                    break;
                                }
                                int i41 = (int) j11;
                                int[] iArr2 = this.f28134L;
                                if (i31 != 0) {
                                    i41 += iArr2[i31 - 1];
                                }
                                iArr2[i31] = i41;
                                i33 += i41;
                                i31++;
                                i32 = i13;
                                th2 = null;
                                i19 = 1;
                                i21 = 0;
                                b11 = 255;
                            } else {
                                throw zzbu.m28711a("No valid varint length mask found", th2);
                            }
                        } else {
                            this.f28134L[i34] = ((i12 - this.f28136N) - i32) - i33;
                            break;
                        }
                    }
                } else {
                    throw zzbu.m28711a("Unexpected lacing value: 2", null);
                }
            }
            this.f28130H = this.f28124B + m26544r((this.f28157g.m27777h()[0] << 8) | (this.f28157g.m27777h()[1] & 255));
            if (c4968s23.f27475d != 2) {
                if (i18 == 163) {
                    if ((this.f28157g.m27777h()[2] & 128) == 128) {
                        i18 = 163;
                    } else {
                        i18 = 163;
                    }
                }
                i17 = 0;
                this.f28137O = i17;
                this.f28129G = 2;
                this.f28132J = 0;
            }
            i17 = 1;
            this.f28137O = i17;
            this.f28129G = 2;
            this.f28132J = 0;
        }
        if (i18 == 163) {
            while (true) {
                int i42 = this.f28132J;
                if (i42 < this.f28133K) {
                    m26547u(c4968s23, ((this.f28132J * c4968s23.f27476e) / 1000) + this.f28130H, this.f28137O, m26542p(km4Var, c4968s23, this.f28134L[i42], false), 0);
                    this.f28132J++;
                } else {
                    this.f28129G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i43 = this.f28132J;
                if (i43 < this.f28133K) {
                    int[] iArr3 = this.f28134L;
                    iArr3[i43] = m26542p(km4Var, c4968s23, iArr3[i43], true);
                    this.f28132J++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025e, code lost:            if (r5.equals("V_AV1") != false) goto L188;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26554h(int i11) {
        int i12;
        int i13;
        InterfaceC4779n c4741m;
        int i14;
        v71.m27171b(this.f28152b0);
        char c11 = 2;
        if (i11 != 160) {
            if (i11 != 174) {
                if (i11 != 19899) {
                    if (i11 != 25152) {
                        if (i11 != 28032) {
                            if (i11 != 357149030) {
                                if (i11 != 374648427) {
                                    if (i11 == 475249515) {
                                        if (!this.f28172v) {
                                            mm4 mm4Var = this.f28152b0;
                                            ms1 ms1Var = this.f28125C;
                                            ms1 ms1Var2 = this.f28126D;
                                            if (this.f28167q != -1 && this.f28170t != -9223372036854775807L && ms1Var != null && ms1Var.m24702a() != 0 && ms1Var2 != null && ms1Var2.m24702a() == ms1Var.m24702a()) {
                                                int m24702a = ms1Var.m24702a();
                                                int[] iArr = new int[m24702a];
                                                long[] jArr = new long[m24702a];
                                                long[] jArr2 = new long[m24702a];
                                                long[] jArr3 = new long[m24702a];
                                                for (int i15 = 0; i15 < m24702a; i15++) {
                                                    jArr3[i15] = ms1Var.m24703b(i15);
                                                    jArr[i15] = this.f28167q + ms1Var2.m24703b(i15);
                                                }
                                                int i16 = 0;
                                                while (true) {
                                                    i14 = m24702a - 1;
                                                    if (i16 >= i14) {
                                                        break;
                                                    }
                                                    int i17 = i16 + 1;
                                                    iArr[i16] = (int) (jArr[i17] - jArr[i16]);
                                                    jArr2[i16] = jArr3[i17] - jArr3[i16];
                                                    i16 = i17;
                                                }
                                                iArr[i14] = (int) ((this.f28167q + this.f28166p) - jArr[i14]);
                                                long j11 = this.f28170t - jArr3[i14];
                                                jArr2[i14] = j11;
                                                if (j11 <= 0) {
                                                    lr1.m24356e("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j11);
                                                    iArr = Arrays.copyOf(iArr, i14);
                                                    jArr = Arrays.copyOf(jArr, i14);
                                                    jArr2 = Arrays.copyOf(jArr2, i14);
                                                    jArr3 = Arrays.copyOf(jArr3, i14);
                                                }
                                                c4741m = new wl4(iArr, jArr, jArr2, jArr3);
                                            } else {
                                                c4741m = new C4741m(this.f28170t, 0L);
                                            }
                                            mm4Var.mo21603f(c4741m);
                                            this.f28172v = true;
                                        }
                                        this.f28125C = null;
                                        this.f28126D = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.f28153c.size() != 0) {
                                    this.f28152b0.zzC();
                                    return;
                                }
                                throw zzbu.m28711a("No valid tracks were found", null);
                            }
                            if (this.f28168r == -9223372036854775807L) {
                                this.f28168r = 1000000L;
                            }
                            long j12 = this.f28169s;
                            if (j12 != -9223372036854775807L) {
                                this.f28170t = m26544r(j12);
                                return;
                            }
                            return;
                        }
                        m26546t(i11);
                        C4968s2 c4968s2 = this.f28171u;
                        if (c4968s2.f27479h && c4968s2.f27480i != null) {
                            throw zzbu.m28711a("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    m26546t(i11);
                    C4968s2 c4968s22 = this.f28171u;
                    if (c4968s22.f27479h) {
                        if (c4968s22.f27481j != null) {
                            c4968s22.f27483l = new zzx(null, new zzw(da4.f19166a, null, "video/webm", this.f28171u.f27481j.f26589b));
                            return;
                        }
                        throw zzbu.m28711a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i18 = this.f28173w;
                if (i18 != -1) {
                    long j13 = this.f28174x;
                    if (j13 != -1) {
                        if (i18 == 475249515) {
                            this.f28176z = j13;
                            return;
                        }
                        return;
                    }
                }
                throw zzbu.m28711a("Mandatory element SeekID or SeekPosition not found", null);
            }
            C4968s2 c4968s23 = this.f28171u;
            v71.m27171b(c4968s23);
            String str = c4968s23.f27473b;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2095576542:
                        if (str.equals("V_MPEG4/ISO/AP")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -2095575984:
                        if (str.equals("V_MPEG4/ISO/SP")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1985379776:
                        if (str.equals("A_MS/ACM")) {
                            c11 = 23;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1784763192:
                        if (str.equals("A_TRUEHD")) {
                            c11 = 18;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1730367663:
                        if (str.equals("A_VORBIS")) {
                            c11 = '\f';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1482641358:
                        if (str.equals("A_MPEG/L2")) {
                            c11 = 14;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1482641357:
                        if (str.equals("A_MPEG/L3")) {
                            c11 = 15;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1373388978:
                        if (str.equals("V_MS/VFW/FOURCC")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -933872740:
                        if (str.equals("S_DVBSUB")) {
                            c11 = ' ';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -538363189:
                        if (str.equals("V_MPEG4/ISO/ASP")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -538363109:
                        if (str.equals("V_MPEG4/ISO/AVC")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -425012669:
                        if (str.equals("S_VOBSUB")) {
                            c11 = 30;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -356037306:
                        if (str.equals("A_DTS/LOSSLESS")) {
                            c11 = 21;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 62923557:
                        if (str.equals("A_AAC")) {
                            c11 = '\r';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 62923603:
                        if (str.equals("A_AC3")) {
                            c11 = 16;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 62927045:
                        if (str.equals("A_DTS")) {
                            c11 = 19;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 82318131:
                        break;
                    case 82338133:
                        if (str.equals("V_VP8")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 82338134:
                        if (str.equals("V_VP9")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 99146302:
                        if (str.equals("S_HDMV/PGS")) {
                            c11 = 31;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 444813526:
                        if (str.equals("V_THEORA")) {
                            c11 = '\n';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 542569478:
                        if (str.equals("A_DTS/EXPRESS")) {
                            c11 = 20;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 635596514:
                        if (str.equals("A_PCM/FLOAT/IEEE")) {
                            c11 = 26;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 725948237:
                        if (str.equals("A_PCM/INT/BIG")) {
                            c11 = 25;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 725957860:
                        if (str.equals("A_PCM/INT/LIT")) {
                            c11 = 24;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 738597099:
                        if (str.equals("S_TEXT/ASS")) {
                            c11 = 28;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 855502857:
                        if (str.equals("V_MPEGH/ISO/HEVC")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1045209816:
                        if (str.equals("S_TEXT/WEBVTT")) {
                            c11 = 29;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1422270023:
                        if (str.equals("S_TEXT/UTF8")) {
                            c11 = 27;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1809237540:
                        if (str.equals("V_MPEG2")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1950749482:
                        if (str.equals("A_EAC3")) {
                            c11 = 17;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1950789798:
                        if (str.equals("A_FLAC")) {
                            c11 = 22;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1951062397:
                        if (str.equals("A_OPUS")) {
                            c11 = 11;
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
                        c4968s23.m26232e(this.f28152b0, c4968s23.f27474c);
                        this.f28153c.put(c4968s23.f27474c, c4968s23);
                        break;
                }
                this.f28171u = null;
                return;
            }
            throw zzbu.m28711a("CodecId is missing in TrackEntry element", null);
        }
        if (this.f28129G != 2) {
            return;
        }
        C4968s2 c4968s24 = (C4968s2) this.f28153c.get(this.f28135M);
        C4968s2.m26227d(c4968s24);
        if (this.f28140R > 0 && "A_OPUS".equals(c4968s24.f27473b)) {
            x02 x02Var = this.f28164n;
            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f28140R).array();
            x02Var.m27773d(array, array.length);
        }
        int i19 = 0;
        for (int i21 = 0; i21 < this.f28133K; i21++) {
            i19 += this.f28134L[i21];
        }
        int i22 = 0;
        while (i22 < this.f28133K) {
            long j14 = this.f28130H + ((c4968s24.f27476e * i22) / 1000);
            int i23 = this.f28137O;
            if (i22 == 0) {
                if (!this.f28139Q) {
                    i23 |= 1;
                }
                i13 = i23;
                i12 = 0;
            } else {
                i12 = i22;
                i13 = i23;
            }
            int i24 = this.f28134L[i12];
            int i25 = i19 - i24;
            m26547u(c4968s24, j14, i13, i24, i25);
            i22 = i12 + 1;
            i19 = i25;
        }
        this.f28129G = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m26555i(int i11, double d11) {
        if (i11 != 181) {
            if (i11 != 17545) {
                switch (i11) {
                    case 21969:
                        m26546t(i11);
                        this.f28171u.f27450D = (float) d11;
                        return;
                    case 21970:
                        m26546t(i11);
                        this.f28171u.f27451E = (float) d11;
                        return;
                    case 21971:
                        m26546t(i11);
                        this.f28171u.f27452F = (float) d11;
                        return;
                    case 21972:
                        m26546t(i11);
                        this.f28171u.f27453G = (float) d11;
                        return;
                    case 21973:
                        m26546t(i11);
                        this.f28171u.f27454H = (float) d11;
                        return;
                    case 21974:
                        m26546t(i11);
                        this.f28171u.f27455I = (float) d11;
                        return;
                    case 21975:
                        m26546t(i11);
                        this.f28171u.f27456J = (float) d11;
                        return;
                    case 21976:
                        m26546t(i11);
                        this.f28171u.f27457K = (float) d11;
                        return;
                    case 21977:
                        m26546t(i11);
                        this.f28171u.f27458L = (float) d11;
                        return;
                    case 21978:
                        m26546t(i11);
                        this.f28171u.f27459M = (float) d11;
                        return;
                    default:
                        switch (i11) {
                            case 30323:
                                m26546t(i11);
                                this.f28171u.f27490s = (float) d11;
                                return;
                            case 30324:
                                m26546t(i11);
                                this.f28171u.f27491t = (float) d11;
                                return;
                            case 30325:
                                m26546t(i11);
                                this.f28171u.f27492u = (float) d11;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f28169s = (long) d11;
            return;
        }
        m26546t(i11);
        this.f28171u.f27463Q = (int) d11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final void m26556j(int i11, long j11) {
        if (i11 != 20529) {
            if (i11 != 20530) {
                boolean z11 = false;
                switch (i11) {
                    case 131:
                        m26546t(i11);
                        this.f28171u.f27475d = (int) j11;
                        return;
                    case 136:
                        m26546t(i11);
                        C4968s2 c4968s2 = this.f28171u;
                        if (j11 == 1) {
                            z11 = true;
                        }
                        c4968s2.f27468V = z11;
                        return;
                    case 155:
                        this.f28131I = m26544r(j11);
                        return;
                    case 159:
                        m26546t(i11);
                        this.f28171u.f27461O = (int) j11;
                        return;
                    case 176:
                        m26546t(i11);
                        this.f28171u.f27484m = (int) j11;
                        return;
                    case 179:
                        m26545s(i11);
                        this.f28125C.m24704c(m26544r(j11));
                        return;
                    case 186:
                        m26546t(i11);
                        this.f28171u.f27485n = (int) j11;
                        return;
                    case 215:
                        m26546t(i11);
                        this.f28171u.f27474c = (int) j11;
                        return;
                    case 231:
                        this.f28124B = m26544r(j11);
                        return;
                    case 238:
                        this.f28138P = (int) j11;
                        return;
                    case 241:
                        if (!this.f28127E) {
                            m26545s(i11);
                            this.f28126D.m24704c(j11);
                            this.f28127E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f28139Q = true;
                        return;
                    case 16871:
                        m26546t(i11);
                        C4968s2.m26225b(this.f28171u, (int) j11);
                        return;
                    case 16980:
                        if (j11 != 3) {
                            throw zzbu.m28711a("ContentCompAlgo " + j11 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j11 < 1 || j11 > 2) {
                            throw zzbu.m28711a("DocTypeReadVersion " + j11 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j11 != 1) {
                            throw zzbu.m28711a("EBMLReadVersion " + j11 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j11 != 5) {
                            throw zzbu.m28711a("ContentEncAlgo " + j11 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j11 != 1) {
                            throw zzbu.m28711a("AESSettingsCipherMode " + j11 + " not supported", null);
                        }
                        return;
                    case 21420:
                        this.f28174x = j11 + this.f28167q;
                        return;
                    case 21432:
                        m26546t(i11);
                        int i12 = (int) j11;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 3) {
                                    if (i12 == 15) {
                                        this.f28171u.f27494w = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.f28171u.f27494w = 1;
                                return;
                            }
                            this.f28171u.f27494w = 2;
                            return;
                        }
                        this.f28171u.f27494w = 0;
                        return;
                    case 21680:
                        m26546t(i11);
                        this.f28171u.f27486o = (int) j11;
                        return;
                    case 21682:
                        m26546t(i11);
                        this.f28171u.f27488q = (int) j11;
                        return;
                    case 21690:
                        m26546t(i11);
                        this.f28171u.f27487p = (int) j11;
                        return;
                    case 21930:
                        m26546t(i11);
                        C4968s2 c4968s22 = this.f28171u;
                        if (j11 == 1) {
                            z11 = true;
                        }
                        c4968s22.f27467U = z11;
                        return;
                    case 21998:
                        m26546t(i11);
                        this.f28171u.f27477f = (int) j11;
                        return;
                    case 22186:
                        m26546t(i11);
                        this.f28171u.f27464R = j11;
                        return;
                    case 22203:
                        m26546t(i11);
                        this.f28171u.f27465S = j11;
                        return;
                    case 25188:
                        m26546t(i11);
                        this.f28171u.f27462P = (int) j11;
                        return;
                    case 30114:
                        this.f28140R = j11;
                        return;
                    case 30321:
                        m26546t(i11);
                        int i13 = (int) j11;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 == 3) {
                                        this.f28171u.f27489r = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.f28171u.f27489r = 2;
                                return;
                            }
                            this.f28171u.f27489r = 1;
                            return;
                        }
                        this.f28171u.f27489r = 0;
                        return;
                    case 2352003:
                        m26546t(i11);
                        this.f28171u.f27476e = (int) j11;
                        return;
                    case 2807729:
                        this.f28168r = j11;
                        return;
                    default:
                        switch (i11) {
                            case 21945:
                                m26546t(i11);
                                int i14 = (int) j11;
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        this.f28171u.f27447A = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.f28171u.f27447A = 2;
                                return;
                            case 21946:
                                m26546t(i11);
                                int m26273b = sc4.m26273b((int) j11);
                                if (m26273b != -1) {
                                    this.f28171u.f27497z = m26273b;
                                    return;
                                }
                                return;
                            case 21947:
                                m26546t(i11);
                                C4968s2 c4968s23 = this.f28171u;
                                c4968s23.f27495x = true;
                                int m26272a = sc4.m26272a((int) j11);
                                if (m26272a != -1) {
                                    c4968s23.f27496y = m26272a;
                                    return;
                                }
                                return;
                            case 21948:
                                m26546t(i11);
                                this.f28171u.f27448B = (int) j11;
                                return;
                            case 21949:
                                m26546t(i11);
                                this.f28171u.f27449C = (int) j11;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j11 != 1) {
                throw zzbu.m28711a("ContentEncodingScope " + j11 + " not supported", null);
            }
            return;
        }
        if (j11 == 0) {
            return;
        }
        throw zzbu.m28711a("ContentEncodingOrder " + j11 + " not supported", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m26557k(int i11, long j11, long j12) {
        v71.m27171b(this.f28152b0);
        if (i11 != 160) {
            if (i11 != 174) {
                if (i11 != 187) {
                    if (i11 != 19899) {
                        if (i11 != 20533) {
                            if (i11 != 21968) {
                                if (i11 != 408125543) {
                                    if (i11 != 475249515) {
                                        if (i11 == 524531317 && !this.f28172v) {
                                            if (this.f28154d && this.f28176z != -1) {
                                                this.f28175y = true;
                                                return;
                                            } else {
                                                this.f28152b0.mo21603f(new C4741m(this.f28170t, 0L));
                                                this.f28172v = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.f28125C = new ms1(32);
                                    this.f28126D = new ms1(32);
                                    return;
                                }
                                long j13 = this.f28167q;
                                if (j13 != -1 && j13 != j11) {
                                    throw zzbu.m28711a("Multiple Segment elements not supported", null);
                                }
                                this.f28167q = j11;
                                this.f28166p = j12;
                                return;
                            }
                            m26546t(i11);
                            this.f28171u.f27495x = true;
                            return;
                        }
                        m26546t(i11);
                        this.f28171u.f27479h = true;
                        return;
                    }
                    this.f28173w = -1;
                    this.f28174x = -1L;
                    return;
                }
                this.f28127E = false;
                return;
            }
            this.f28171u = new C4968s2();
            return;
        }
        this.f28139Q = false;
        this.f28140R = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m26558l(int i11, String str) {
        if (i11 != 134) {
            if (i11 != 17026) {
                if (i11 != 21358) {
                    if (i11 == 2274716) {
                        m26546t(i11);
                        C4968s2.m26226c(this.f28171u, str);
                        return;
                    }
                    return;
                }
                m26546t(i11);
                this.f28171u.f27472a = str;
                return;
            }
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw zzbu.m28711a("DocType " + str + " not supported", null);
            }
            return;
        }
        m26546t(i11);
        this.f28171u.f27473b = str;
    }
}
