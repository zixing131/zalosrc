package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.s2 */
/* loaded from: classes2.dex */
public final class C4968s2 {

    /* renamed from: N */
    public byte[] f27460N;

    /* renamed from: T */
    public C4965s f27466T;

    /* renamed from: U */
    public boolean f27467U;

    /* renamed from: X */
    public InterfaceC4928r f27470X;

    /* renamed from: Y */
    public int f27471Y;

    /* renamed from: a */
    public String f27472a;

    /* renamed from: b */
    public String f27473b;

    /* renamed from: c */
    public int f27474c;

    /* renamed from: d */
    public int f27475d;

    /* renamed from: e */
    public int f27476e;

    /* renamed from: f */
    public int f27477f;

    /* renamed from: g */
    private int f27478g;

    /* renamed from: h */
    public boolean f27479h;

    /* renamed from: i */
    public byte[] f27480i;

    /* renamed from: j */
    public C4891q f27481j;

    /* renamed from: k */
    public byte[] f27482k;

    /* renamed from: l */
    public zzx f27483l;

    /* renamed from: m */
    public int f27484m = -1;

    /* renamed from: n */
    public int f27485n = -1;

    /* renamed from: o */
    public int f27486o = -1;

    /* renamed from: p */
    public int f27487p = -1;

    /* renamed from: q */
    public int f27488q = 0;

    /* renamed from: r */
    public int f27489r = -1;

    /* renamed from: s */
    public float f27490s = 0.0f;

    /* renamed from: t */
    public float f27491t = 0.0f;

    /* renamed from: u */
    public float f27492u = 0.0f;

    /* renamed from: v */
    public byte[] f27493v = null;

    /* renamed from: w */
    public int f27494w = -1;

    /* renamed from: x */
    public boolean f27495x = false;

    /* renamed from: y */
    public int f27496y = -1;

    /* renamed from: z */
    public int f27497z = -1;

    /* renamed from: A */
    public int f27447A = -1;

    /* renamed from: B */
    public int f27448B = 1000;

    /* renamed from: C */
    public int f27449C = 200;

    /* renamed from: D */
    public float f27450D = -1.0f;

    /* renamed from: E */
    public float f27451E = -1.0f;

    /* renamed from: F */
    public float f27452F = -1.0f;

    /* renamed from: G */
    public float f27453G = -1.0f;

    /* renamed from: H */
    public float f27454H = -1.0f;

    /* renamed from: I */
    public float f27455I = -1.0f;

    /* renamed from: J */
    public float f27456J = -1.0f;

    /* renamed from: K */
    public float f27457K = -1.0f;

    /* renamed from: L */
    public float f27458L = -1.0f;

    /* renamed from: M */
    public float f27459M = -1.0f;

    /* renamed from: O */
    public int f27461O = 1;

    /* renamed from: P */
    public int f27462P = -1;

    /* renamed from: Q */
    public int f27463Q = 8000;

    /* renamed from: R */
    public long f27464R = 0;

    /* renamed from: S */
    public long f27465S = 0;

    /* renamed from: V */
    public boolean f27468V = true;

    /* renamed from: W */
    private String f27469W = "eng";

    /* renamed from: f */
    private static Pair m26228f(x02 x02Var) {
        try {
            x02Var.m27776g(16);
            long m27794y = x02Var.m27794y();
            if (m27794y == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (m27794y == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (m27794y == 826496599) {
                int m27780k = x02Var.m27780k() + 20;
                byte[] m27777h = x02Var.m27777h();
                while (true) {
                    int length = m27777h.length;
                    if (m27780k < length - 4) {
                        if (m27777h[m27780k] == 0 && m27777h[m27780k + 1] == 0 && m27777h[m27780k + 2] == 1 && m27777h[m27780k + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m27777h, m27780k, length)));
                        }
                        m27780k++;
                    } else {
                        throw zzbu.m28711a("Failed to find FourCC VC1 initialization data", null);
                    }
                }
            } else {
                lr1.m24356e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.m28711a("Error parsing FourCC private data", null);
        }
    }

    /* renamed from: g */
    private static List m26229g(byte[] bArr) {
        int i11;
        int i12;
        try {
            if (bArr[0] == 2) {
                int i13 = 1;
                int i14 = 0;
                while (true) {
                    i11 = bArr[i13] & 255;
                    if (i11 != 255) {
                        break;
                    }
                    i14 += 255;
                    i13++;
                }
                int i15 = i13 + 1;
                int i16 = i14 + i11;
                int i17 = 0;
                while (true) {
                    i12 = bArr[i15] & 255;
                    if (i12 != 255) {
                        break;
                    }
                    i17 += 255;
                    i15++;
                }
                int i18 = i15 + 1;
                int i19 = i17 + i12;
                if (bArr[i18] == 1) {
                    byte[] bArr2 = new byte[i16];
                    System.arraycopy(bArr, i18, bArr2, 0, i16);
                    int i21 = i18 + i16;
                    if (bArr[i21] == 3) {
                        int i22 = i21 + i19;
                        if (bArr[i22] == 5) {
                            int length = bArr.length - i22;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i22, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbu.m28711a("Error parsing vorbis codec private", null);
                    }
                    throw zzbu.m28711a("Error parsing vorbis codec private", null);
                }
                throw zzbu.m28711a("Error parsing vorbis codec private", null);
            }
            throw zzbu.m28711a("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.m28711a("Error parsing vorbis codec private", null);
        }
    }

    /* renamed from: h */
    private static boolean m26230h(x02 x02Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int m27786q = x02Var.m27786q();
            if (m27786q == 1) {
                return true;
            }
            if (m27786q == 65534) {
                x02Var.m27775f(24);
                long m27795z = x02Var.m27795z();
                uuid = C5005t2.f28121h0;
                if (m27795z == uuid.getMostSignificantBits()) {
                    long m27795z2 = x02Var.m27795z();
                    uuid2 = C5005t2.f28121h0;
                    if (m27795z2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.m28711a("Error parsing MS/ACM codec private", null);
        }
    }

    /* renamed from: i */
    private final byte[] m26231i(String str) {
        byte[] bArr = this.f27482k;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.m28711a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x01a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03db  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26232e(mm4 mm4Var, int i11) {
        char c11;
        List singletonList;
        List list;
        String str;
        String str2;
        int i12;
        byte[] bArr;
        byte[] bArr2;
        String str3;
        int i13;
        int i14;
        Map map;
        Map map2;
        int i15;
        Map map3;
        fm4 m22085a;
        String str4 = this.f27473b;
        int i16 = 4;
        int i17 = 0;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c11 = ' ';
                    break;
                }
                c11 = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c11 = 30;
                    break;
                }
                c11 = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c11 = 31;
                    break;
                }
                c11 = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c11 = 26;
                    break;
                }
                c11 = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c11 = 28;
                    break;
                }
                c11 = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c11 = 29;
                    break;
                }
                c11 = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c11 = 27;
                    break;
                }
                c11 = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        String str5 = "audio/raw";
        sc4 sc4Var = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        byte[] bArr3 = null;
        switch (c11) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null && (m22085a = fm4.m22085a(new x02(bArr2))) != null) {
                    str2 = m22085a.f20194a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i18 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1 = new C5004t1();
                if (k70.m23849g(str3)) {
                    c5004t1.m26506e0(this.f27461O);
                    c5004t1.m26524t(this.f27463Q);
                    c5004t1.m26518n(i16);
                    i13 = 1;
                } else if (k70.m23850h(str3)) {
                    if (this.f27488q == 0) {
                        int i19 = this.f27486o;
                        i14 = -1;
                        if (i19 == -1) {
                            i19 = this.f27484m;
                        }
                        this.f27486o = i19;
                        int i21 = this.f27487p;
                        if (i21 == -1) {
                            i21 = this.f27485n;
                        }
                        this.f27487p = i21;
                    } else {
                        i14 = -1;
                    }
                    float f11 = (this.f27486o == i14 || (i15 = this.f27487p) == i14) ? -1.0f : (this.f27485n * r6) / (this.f27484m * i15);
                    if (this.f27495x) {
                        if (this.f27450D != -1.0f && this.f27451E != -1.0f && this.f27452F != -1.0f && this.f27453G != -1.0f && this.f27454H != -1.0f && this.f27455I != -1.0f && this.f27456J != -1.0f && this.f27457K != -1.0f && this.f27458L != -1.0f && this.f27459M != -1.0f) {
                            bArr3 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.f27450D * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27451E * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27452F * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27453G * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27454H * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27455I * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27456J * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.f27457K * 50000.0f) + 0.5f));
                            order.putShort((short) (this.f27458L + 0.5f));
                            order.putShort((short) (this.f27459M + 0.5f));
                            order.putShort((short) this.f27448B);
                            order.putShort((short) this.f27449C);
                        }
                        sc4Var = new sc4(this.f27496y, this.f27447A, this.f27497z, bArr3);
                    }
                    if (this.f27472a != null) {
                        map = C5005t2.f28122i0;
                        if (map.containsKey(this.f27472a)) {
                            map2 = C5005t2.f28122i0;
                            i14 = ((Integer) map2.get(this.f27472a)).intValue();
                        }
                    }
                    if (this.f27489r == 0 && Float.compare(this.f27490s, 0.0f) == 0 && Float.compare(this.f27491t, 0.0f) == 0) {
                        if (Float.compare(this.f27492u, 0.0f) != 0) {
                            if (Float.compare(this.f27491t, 90.0f) == 0) {
                                i17 = 90;
                            } else if (Float.compare(this.f27491t, -180.0f) == 0 || Float.compare(this.f27491t, 180.0f) == 0) {
                                i17 = 180;
                            } else if (Float.compare(this.f27491t, -90.0f) == 0) {
                                i17 = 270;
                            }
                        }
                        c5004t1.m26528x(this.f27484m);
                        c5004t1.m26507f(this.f27485n);
                        c5004t1.m26520p(f11);
                        c5004t1.m26522r(i17);
                        c5004t1.m26521q(this.f27493v);
                        c5004t1.m26526v(this.f27494w);
                        c5004t1.m26510g0(sc4Var);
                        i13 = 2;
                    }
                    i17 = i14;
                    c5004t1.m26528x(this.f27484m);
                    c5004t1.m26507f(this.f27485n);
                    c5004t1.m26520p(f11);
                    c5004t1.m26522r(i17);
                    c5004t1.m26521q(this.f27493v);
                    c5004t1.m26526v(this.f27494w);
                    c5004t1.m26510g0(sc4Var);
                    i13 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzbu.m28711a("Unexpected MIME type.", null);
                    }
                    i13 = 3;
                }
                if (this.f27472a != null) {
                    map3 = C5005t2.f28122i0;
                    if (!map3.containsKey(this.f27472a)) {
                        c5004t1.m26514j(this.f27472a);
                    }
                }
                c5004t1.m26509g(i11);
                c5004t1.m26523s(str3);
                c5004t1.m26516l(i12);
                c5004t1.m26515k(this.f27469W);
                c5004t1.m26525u(i18);
                c5004t1.m26513i(singletonList);
                c5004t1.m26508f0(str2);
                c5004t1.m26500b(this.f27483l);
                C4671k3 m26529y = c5004t1.m26529y();
                InterfaceC4928r mo21604i = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i;
                mo21604i.mo23300d(m26529y);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                    str2 = m22085a.f20194a;
                    str5 = "video/dolby-vision";
                    break;
                }
                str3 = str5;
                int i182 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12.m26509g(i11);
                c5004t12.m26523s(str3);
                c5004t12.m26516l(i12);
                c5004t12.m26515k(this.f27469W);
                c5004t12.m26525u(i182);
                c5004t12.m26513i(singletonList);
                c5004t12.m26508f0(str2);
                c5004t12.m26500b(this.f27483l);
                C4671k3 m26529y2 = c5004t12.m26529y();
                InterfaceC4928r mo21604i2 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2;
                mo21604i2.mo23300d(m26529y2);
                return;
            case 2:
                str5 = "video/av01";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122.m26509g(i11);
                c5004t122.m26523s(str3);
                c5004t122.m26516l(i12);
                c5004t122.m26515k(this.f27469W);
                c5004t122.m26525u(i1822);
                c5004t122.m26513i(singletonList);
                c5004t122.m26508f0(str2);
                c5004t122.m26500b(this.f27483l);
                C4671k3 m26529y22 = c5004t122.m26529y();
                InterfaceC4928r mo21604i22 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22;
                mo21604i22.mo23300d(m26529y22);
                return;
            case 3:
                str5 = "video/mpeg2";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222.m26509g(i11);
                c5004t1222.m26523s(str3);
                c5004t1222.m26516l(i12);
                c5004t1222.m26515k(this.f27469W);
                c5004t1222.m26525u(i18222);
                c5004t1222.m26513i(singletonList);
                c5004t1222.m26508f0(str2);
                c5004t1222.m26500b(this.f27483l);
                C4671k3 m26529y222 = c5004t1222.m26529y();
                InterfaceC4928r mo21604i222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222;
                mo21604i222.mo23300d(m26529y222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.f27482k;
                singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                str5 = "video/mp4v-es";
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222.m26509g(i11);
                c5004t12222.m26523s(str3);
                c5004t12222.m26516l(i12);
                c5004t12222.m26515k(this.f27469W);
                c5004t12222.m26525u(i182222);
                c5004t12222.m26513i(singletonList);
                c5004t12222.m26508f0(str2);
                c5004t12222.m26500b(this.f27483l);
                C4671k3 m26529y2222 = c5004t12222.m26529y();
                InterfaceC4928r mo21604i2222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222;
                mo21604i2222.mo23300d(m26529y2222);
                return;
            case 7:
                nl4 m24946a = nl4.m24946a(new x02(m26231i(str4)));
                list = m24946a.f25239a;
                this.f27471Y = m24946a.f25240b;
                str = m24946a.f25244f;
                str5 = "video/avc";
                str2 = str;
                singletonList = list;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222.m26509g(i11);
                c5004t122222.m26523s(str3);
                c5004t122222.m26516l(i12);
                c5004t122222.m26515k(this.f27469W);
                c5004t122222.m26525u(i1822222);
                c5004t122222.m26513i(singletonList);
                c5004t122222.m26508f0(str2);
                c5004t122222.m26500b(this.f27483l);
                C4671k3 m26529y22222 = c5004t122222.m26529y();
                InterfaceC4928r mo21604i22222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222;
                mo21604i22222.mo23300d(m26529y22222);
                return;
            case '\b':
                zm4 m28552a = zm4.m28552a(new x02(m26231i(str4)));
                list = m28552a.f31591a;
                this.f27471Y = m28552a.f31592b;
                str = m28552a.f31594d;
                str5 = "video/hevc";
                str2 = str;
                singletonList = list;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222.m26509g(i11);
                c5004t1222222.m26523s(str3);
                c5004t1222222.m26516l(i12);
                c5004t1222222.m26515k(this.f27469W);
                c5004t1222222.m26525u(i18222222);
                c5004t1222222.m26513i(singletonList);
                c5004t1222222.m26508f0(str2);
                c5004t1222222.m26500b(this.f27483l);
                C4671k3 m26529y222222 = c5004t1222222.m26529y();
                InterfaceC4928r mo21604i222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222;
                mo21604i222222.mo23300d(m26529y222222);
                return;
            case '\t':
                Pair m26228f = m26228f(new x02(m26231i(str4)));
                str5 = (String) m26228f.first;
                singletonList = (List) m26228f.second;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222.m26509g(i11);
                c5004t12222222.m26523s(str3);
                c5004t12222222.m26516l(i12);
                c5004t12222222.m26515k(this.f27469W);
                c5004t12222222.m26525u(i182222222);
                c5004t12222222.m26513i(singletonList);
                c5004t12222222.m26508f0(str2);
                c5004t12222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222 = c5004t12222222.m26529y();
                InterfaceC4928r mo21604i2222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222;
                mo21604i2222222.mo23300d(m26529y2222222);
                return;
            case '\n':
                str5 = "video/x-unknown";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222.m26509g(i11);
                c5004t122222222.m26523s(str3);
                c5004t122222222.m26516l(i12);
                c5004t122222222.m26515k(this.f27469W);
                c5004t122222222.m26525u(i1822222222);
                c5004t122222222.m26513i(singletonList);
                c5004t122222222.m26508f0(str2);
                c5004t122222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222 = c5004t122222222.m26529y();
                InterfaceC4928r mo21604i22222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222;
                mo21604i22222222.mo23300d(m26529y22222222);
                return;
            case 11:
                singletonList = m26229g(m26231i(str4));
                str5 = "audio/vorbis";
                i12 = 8192;
                str2 = null;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222.m26509g(i11);
                c5004t1222222222.m26523s(str3);
                c5004t1222222222.m26516l(i12);
                c5004t1222222222.m26515k(this.f27469W);
                c5004t1222222222.m26525u(i18222222222);
                c5004t1222222222.m26513i(singletonList);
                c5004t1222222222.m26508f0(str2);
                c5004t1222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222 = c5004t1222222222.m26529y();
                InterfaceC4928r mo21604i222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222;
                mo21604i222222222.mo23300d(m26529y222222222);
                return;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(m26231i(this.f27473b));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                singletonList.add(allocate.order(byteOrder).putLong(this.f27464R).array());
                singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f27465S).array());
                str5 = "audio/opus";
                i12 = 5760;
                str2 = null;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222.m26509g(i11);
                c5004t12222222222.m26523s(str3);
                c5004t12222222222.m26516l(i12);
                c5004t12222222222.m26515k(this.f27469W);
                c5004t12222222222.m26525u(i182222222222);
                c5004t12222222222.m26513i(singletonList);
                c5004t12222222222.m26508f0(str2);
                c5004t12222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222 = c5004t12222222222.m26529y();
                InterfaceC4928r mo21604i2222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222;
                mo21604i2222222222.mo23300d(m26529y2222222222);
                return;
            case '\r':
                singletonList = Collections.singletonList(m26231i(str4));
                fl4 m22466a = gl4.m22466a(this.f27482k);
                this.f27463Q = m22466a.f20186a;
                this.f27461O = m22466a.f20187b;
                str5 = "audio/mp4a-latm";
                str2 = m22466a.f20188c;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222.m26509g(i11);
                c5004t122222222222.m26523s(str3);
                c5004t122222222222.m26516l(i12);
                c5004t122222222222.m26515k(this.f27469W);
                c5004t122222222222.m26525u(i1822222222222);
                c5004t122222222222.m26513i(singletonList);
                c5004t122222222222.m26508f0(str2);
                c5004t122222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222 = c5004t122222222222.m26529y();
                InterfaceC4928r mo21604i22222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222;
                mo21604i22222222222.mo23300d(m26529y22222222222);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i12 = 4096;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222222.m26509g(i11);
                c5004t1222222222222.m26523s(str3);
                c5004t1222222222222.m26516l(i12);
                c5004t1222222222222.m26515k(this.f27469W);
                c5004t1222222222222.m26525u(i18222222222222);
                c5004t1222222222222.m26513i(singletonList);
                c5004t1222222222222.m26508f0(str2);
                c5004t1222222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222222 = c5004t1222222222222.m26529y();
                InterfaceC4928r mo21604i222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222222;
                mo21604i222222222222.mo23300d(m26529y222222222222);
                return;
            case 15:
                str5 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i12 = 4096;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222222.m26509g(i11);
                c5004t12222222222222.m26523s(str3);
                c5004t12222222222222.m26516l(i12);
                c5004t12222222222222.m26515k(this.f27469W);
                c5004t12222222222222.m26525u(i182222222222222);
                c5004t12222222222222.m26513i(singletonList);
                c5004t12222222222222.m26508f0(str2);
                c5004t12222222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222222 = c5004t12222222222222.m26529y();
                InterfaceC4928r mo21604i2222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222222;
                mo21604i2222222222222.mo23300d(m26529y2222222222222);
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                str5 = "audio/ac3";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222222.m26509g(i11);
                c5004t122222222222222.m26523s(str3);
                c5004t122222222222222.m26516l(i12);
                c5004t122222222222222.m26515k(this.f27469W);
                c5004t122222222222222.m26525u(i1822222222222222);
                c5004t122222222222222.m26513i(singletonList);
                c5004t122222222222222.m26508f0(str2);
                c5004t122222222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222222 = c5004t122222222222222.m26529y();
                InterfaceC4928r mo21604i22222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222222;
                mo21604i22222222222222.mo23300d(m26529y22222222222222);
                return;
            case 17:
                str5 = "audio/eac3";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222222222.m26509g(i11);
                c5004t1222222222222222.m26523s(str3);
                c5004t1222222222222222.m26516l(i12);
                c5004t1222222222222222.m26515k(this.f27469W);
                c5004t1222222222222222.m26525u(i18222222222222222);
                c5004t1222222222222222.m26513i(singletonList);
                c5004t1222222222222222.m26508f0(str2);
                c5004t1222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222222222 = c5004t1222222222222222.m26529y();
                InterfaceC4928r mo21604i222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222222222;
                mo21604i222222222222222.mo23300d(m26529y222222222222222);
                return;
            case 18:
                this.f27466T = new C4965s();
                str5 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222222222.m26509g(i11);
                c5004t12222222222222222.m26523s(str3);
                c5004t12222222222222222.m26516l(i12);
                c5004t12222222222222222.m26515k(this.f27469W);
                c5004t12222222222222222.m26525u(i182222222222222222);
                c5004t12222222222222222.m26513i(singletonList);
                c5004t12222222222222222.m26508f0(str2);
                c5004t12222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222222222 = c5004t12222222222222222.m26529y();
                InterfaceC4928r mo21604i2222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222222222;
                mo21604i2222222222222222.mo23300d(m26529y2222222222222222);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222222222.m26509g(i11);
                c5004t122222222222222222.m26523s(str3);
                c5004t122222222222222222.m26516l(i12);
                c5004t122222222222222222.m26515k(this.f27469W);
                c5004t122222222222222222.m26525u(i1822222222222222222);
                c5004t122222222222222222.m26513i(singletonList);
                c5004t122222222222222222.m26508f0(str2);
                c5004t122222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222222222 = c5004t122222222222222222.m26529y();
                InterfaceC4928r mo21604i22222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222222222;
                mo21604i22222222222222222.mo23300d(m26529y22222222222222222);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222222222222.m26509g(i11);
                c5004t1222222222222222222.m26523s(str3);
                c5004t1222222222222222222.m26516l(i12);
                c5004t1222222222222222222.m26515k(this.f27469W);
                c5004t1222222222222222222.m26525u(i18222222222222222222);
                c5004t1222222222222222222.m26513i(singletonList);
                c5004t1222222222222222222.m26508f0(str2);
                c5004t1222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222222222222 = c5004t1222222222222222222.m26529y();
                InterfaceC4928r mo21604i222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222222222222;
                mo21604i222222222222222222.mo23300d(m26529y222222222222222222);
                return;
            case 22:
                singletonList = Collections.singletonList(m26231i(str4));
                str5 = "audio/flac";
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222222222222.m26509g(i11);
                c5004t12222222222222222222.m26523s(str3);
                c5004t12222222222222222222.m26516l(i12);
                c5004t12222222222222222222.m26515k(this.f27469W);
                c5004t12222222222222222222.m26525u(i182222222222222222222);
                c5004t12222222222222222222.m26513i(singletonList);
                c5004t12222222222222222222.m26508f0(str2);
                c5004t12222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222222222222 = c5004t12222222222222222222.m26529y();
                InterfaceC4928r mo21604i2222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222222222222;
                mo21604i2222222222222222222.mo23300d(m26529y2222222222222222222);
                return;
            case 23:
                if (m26230h(new x02(m26231i(str4)))) {
                    i16 = g92.m22330X(this.f27462P);
                    if (i16 == 0) {
                        lr1.m24356e("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f27462P + ". Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str2 = null;
                    i12 = -1;
                    bArr2 = this.f27460N;
                    if (bArr2 != null) {
                    }
                    str3 = str5;
                    int i1822222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                    C5004t1 c5004t122222222222222222222 = new C5004t1();
                    if (k70.m23849g(str3)) {
                    }
                    if (this.f27472a != null) {
                    }
                    c5004t122222222222222222222.m26509g(i11);
                    c5004t122222222222222222222.m26523s(str3);
                    c5004t122222222222222222222.m26516l(i12);
                    c5004t122222222222222222222.m26515k(this.f27469W);
                    c5004t122222222222222222222.m26525u(i1822222222222222222222);
                    c5004t122222222222222222222.m26513i(singletonList);
                    c5004t122222222222222222222.m26508f0(str2);
                    c5004t122222222222222222222.m26500b(this.f27483l);
                    C4671k3 m26529y22222222222222222222 = c5004t122222222222222222222.m26529y();
                    InterfaceC4928r mo21604i22222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                    this.f27470X = mo21604i22222222222222222222;
                    mo21604i22222222222222222222.mo23300d(m26529y22222222222222222222);
                    return;
                }
                lr1.m24356e("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                singletonList = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222222222222222.m26509g(i11);
                c5004t1222222222222222222222.m26523s(str3);
                c5004t1222222222222222222222.m26516l(i12);
                c5004t1222222222222222222222.m26515k(this.f27469W);
                c5004t1222222222222222222222.m26525u(i18222222222222222222222);
                c5004t1222222222222222222222.m26513i(singletonList);
                c5004t1222222222222222222222.m26508f0(str2);
                c5004t1222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222222222222222 = c5004t1222222222222222222222.m26529y();
                InterfaceC4928r mo21604i222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222222222222222;
                mo21604i222222222222222222222.mo23300d(m26529y222222222222222222222);
                return;
            case 24:
                i16 = g92.m22330X(this.f27462P);
                if (i16 == 0) {
                    lr1.m24356e("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f27462P + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i12 = -1;
                    i16 = -1;
                    bArr2 = this.f27460N;
                    if (bArr2 != null) {
                    }
                    str3 = str5;
                    int i182222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                    C5004t1 c5004t12222222222222222222222 = new C5004t1();
                    if (k70.m23849g(str3)) {
                    }
                    if (this.f27472a != null) {
                    }
                    c5004t12222222222222222222222.m26509g(i11);
                    c5004t12222222222222222222222.m26523s(str3);
                    c5004t12222222222222222222222.m26516l(i12);
                    c5004t12222222222222222222222.m26515k(this.f27469W);
                    c5004t12222222222222222222222.m26525u(i182222222222222222222222);
                    c5004t12222222222222222222222.m26513i(singletonList);
                    c5004t12222222222222222222222.m26508f0(str2);
                    c5004t12222222222222222222222.m26500b(this.f27483l);
                    C4671k3 m26529y2222222222222222222222 = c5004t12222222222222222222222.m26529y();
                    InterfaceC4928r mo21604i2222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                    this.f27470X = mo21604i2222222222222222222222;
                    mo21604i2222222222222222222222.mo23300d(m26529y2222222222222222222222);
                    return;
                }
                singletonList = null;
                str2 = null;
                i12 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222222222222222.m26509g(i11);
                c5004t122222222222222222222222.m26523s(str3);
                c5004t122222222222222222222222.m26516l(i12);
                c5004t122222222222222222222222.m26515k(this.f27469W);
                c5004t122222222222222222222222.m26525u(i1822222222222222222222222);
                c5004t122222222222222222222222.m26513i(singletonList);
                c5004t122222222222222222222222.m26508f0(str2);
                c5004t122222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222222222222222 = c5004t122222222222222222222222.m26529y();
                InterfaceC4928r mo21604i22222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222222222222222;
                mo21604i22222222222222222222222.mo23300d(m26529y22222222222222222222222);
                return;
            case 25:
                int i22 = this.f27462P;
                if (i22 == 8) {
                    singletonList = null;
                    str2 = null;
                    i12 = -1;
                    i16 = 3;
                    bArr2 = this.f27460N;
                    if (bArr2 != null) {
                    }
                    str3 = str5;
                    int i18222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                    C5004t1 c5004t1222222222222222222222222 = new C5004t1();
                    if (k70.m23849g(str3)) {
                    }
                    if (this.f27472a != null) {
                    }
                    c5004t1222222222222222222222222.m26509g(i11);
                    c5004t1222222222222222222222222.m26523s(str3);
                    c5004t1222222222222222222222222.m26516l(i12);
                    c5004t1222222222222222222222222.m26515k(this.f27469W);
                    c5004t1222222222222222222222222.m26525u(i18222222222222222222222222);
                    c5004t1222222222222222222222222.m26513i(singletonList);
                    c5004t1222222222222222222222222.m26508f0(str2);
                    c5004t1222222222222222222222222.m26500b(this.f27483l);
                    C4671k3 m26529y222222222222222222222222 = c5004t1222222222222222222222222.m26529y();
                    InterfaceC4928r mo21604i222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                    this.f27470X = mo21604i222222222222222222222222;
                    mo21604i222222222222222222222222.mo23300d(m26529y222222222222222222222222);
                    return;
                }
                if (i22 != 16) {
                    lr1.m24356e("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i22 + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i12 = -1;
                    i16 = -1;
                    bArr2 = this.f27460N;
                    if (bArr2 != null) {
                    }
                    str3 = str5;
                    int i182222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                    C5004t1 c5004t12222222222222222222222222 = new C5004t1();
                    if (k70.m23849g(str3)) {
                    }
                    if (this.f27472a != null) {
                    }
                    c5004t12222222222222222222222222.m26509g(i11);
                    c5004t12222222222222222222222222.m26523s(str3);
                    c5004t12222222222222222222222222.m26516l(i12);
                    c5004t12222222222222222222222222.m26515k(this.f27469W);
                    c5004t12222222222222222222222222.m26525u(i182222222222222222222222222);
                    c5004t12222222222222222222222222.m26513i(singletonList);
                    c5004t12222222222222222222222222.m26508f0(str2);
                    c5004t12222222222222222222222222.m26500b(this.f27483l);
                    C4671k3 m26529y2222222222222222222222222 = c5004t12222222222222222222222222.m26529y();
                    InterfaceC4928r mo21604i2222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                    this.f27470X = mo21604i2222222222222222222222222;
                    mo21604i2222222222222222222222222.mo23300d(m26529y2222222222222222222222222);
                    return;
                }
                i16 = 268435456;
                singletonList = null;
                str2 = null;
                i12 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222222222222222222.m26509g(i11);
                c5004t122222222222222222222222222.m26523s(str3);
                c5004t122222222222222222222222222.m26516l(i12);
                c5004t122222222222222222222222222.m26515k(this.f27469W);
                c5004t122222222222222222222222222.m26525u(i1822222222222222222222222222);
                c5004t122222222222222222222222222.m26513i(singletonList);
                c5004t122222222222222222222222222.m26508f0(str2);
                c5004t122222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222222222222222222 = c5004t122222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i22222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222222222222222222;
                mo21604i22222222222222222222222222.mo23300d(m26529y22222222222222222222222222);
                return;
            case 26:
                int i23 = this.f27462P;
                if (i23 != 32) {
                    lr1.m24356e("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i23 + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i12 = -1;
                    i16 = -1;
                    bArr2 = this.f27460N;
                    if (bArr2 != null) {
                    }
                    str3 = str5;
                    int i18222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                    C5004t1 c5004t1222222222222222222222222222 = new C5004t1();
                    if (k70.m23849g(str3)) {
                    }
                    if (this.f27472a != null) {
                    }
                    c5004t1222222222222222222222222222.m26509g(i11);
                    c5004t1222222222222222222222222222.m26523s(str3);
                    c5004t1222222222222222222222222222.m26516l(i12);
                    c5004t1222222222222222222222222222.m26515k(this.f27469W);
                    c5004t1222222222222222222222222222.m26525u(i18222222222222222222222222222);
                    c5004t1222222222222222222222222222.m26513i(singletonList);
                    c5004t1222222222222222222222222222.m26508f0(str2);
                    c5004t1222222222222222222222222222.m26500b(this.f27483l);
                    C4671k3 m26529y222222222222222222222222222 = c5004t1222222222222222222222222222.m26529y();
                    InterfaceC4928r mo21604i222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                    this.f27470X = mo21604i222222222222222222222222222;
                    mo21604i222222222222222222222222222.mo23300d(m26529y222222222222222222222222222);
                    return;
                }
                singletonList = null;
                str2 = null;
                i12 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222222222222222222222.m26509g(i11);
                c5004t12222222222222222222222222222.m26523s(str3);
                c5004t12222222222222222222222222222.m26516l(i12);
                c5004t12222222222222222222222222222.m26515k(this.f27469W);
                c5004t12222222222222222222222222222.m26525u(i182222222222222222222222222222);
                c5004t12222222222222222222222222222.m26513i(singletonList);
                c5004t12222222222222222222222222222.m26508f0(str2);
                c5004t12222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222222222222222222222 = c5004t12222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i2222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222222222222222222222;
                mo21604i2222222222222222222222222222.mo23300d(m26529y2222222222222222222222222222);
                return;
            case 27:
                str5 = "application/x-subrip";
                singletonList = null;
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222222222222222222222.m26509g(i11);
                c5004t122222222222222222222222222222.m26523s(str3);
                c5004t122222222222222222222222222222.m26516l(i12);
                c5004t122222222222222222222222222222.m26515k(this.f27469W);
                c5004t122222222222222222222222222222.m26525u(i1822222222222222222222222222222);
                c5004t122222222222222222222222222222.m26513i(singletonList);
                c5004t122222222222222222222222222222.m26508f0(str2);
                c5004t122222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222222222222222222222 = c5004t122222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i22222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222222222222222222222;
                mo21604i22222222222222222222222222222.mo23300d(m26529y22222222222222222222222222222);
                return;
            case 28:
                bArr = C5005t2.f28118e0;
                singletonList = c83.m20834z(bArr, m26231i(this.f27473b));
                str5 = "text/x-ssa";
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222222222222222222222222.m26509g(i11);
                c5004t1222222222222222222222222222222.m26523s(str3);
                c5004t1222222222222222222222222222222.m26516l(i12);
                c5004t1222222222222222222222222222222.m26515k(this.f27469W);
                c5004t1222222222222222222222222222222.m26525u(i18222222222222222222222222222222);
                c5004t1222222222222222222222222222222.m26513i(singletonList);
                c5004t1222222222222222222222222222222.m26508f0(str2);
                c5004t1222222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222222222222222222222222 = c5004t1222222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i222222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222222222222222222222222;
                mo21604i222222222222222222222222222222.mo23300d(m26529y222222222222222222222222222222);
                return;
            case 29:
                singletonList = null;
                str2 = null;
                str5 = "text/vtt";
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222222222222222222222222.m26509g(i11);
                c5004t12222222222222222222222222222222.m26523s(str3);
                c5004t12222222222222222222222222222222.m26516l(i12);
                c5004t12222222222222222222222222222222.m26515k(this.f27469W);
                c5004t12222222222222222222222222222222.m26525u(i182222222222222222222222222222222);
                c5004t12222222222222222222222222222222.m26513i(singletonList);
                c5004t12222222222222222222222222222222.m26508f0(str2);
                c5004t12222222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222222222222222222222222 = c5004t12222222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i2222222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222222222222222222222222;
                mo21604i2222222222222222222222222222222.mo23300d(m26529y2222222222222222222222222222222);
                return;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                singletonList = c83.m20833x(m26231i(str4));
                str2 = null;
                str5 = "application/vobsub";
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i1822222222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t122222222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t122222222222222222222222222222222.m26509g(i11);
                c5004t122222222222222222222222222222222.m26523s(str3);
                c5004t122222222222222222222222222222222.m26516l(i12);
                c5004t122222222222222222222222222222222.m26515k(this.f27469W);
                c5004t122222222222222222222222222222222.m26525u(i1822222222222222222222222222222222);
                c5004t122222222222222222222222222222222.m26513i(singletonList);
                c5004t122222222222222222222222222222222.m26508f0(str2);
                c5004t122222222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y22222222222222222222222222222222 = c5004t122222222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i22222222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i22222222222222222222222222222222;
                mo21604i22222222222222222222222222222222.mo23300d(m26529y22222222222222222222222222222222);
                return;
            case 31:
                singletonList = null;
                str2 = null;
                str5 = "application/pgs";
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i18222222222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t1222222222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t1222222222222222222222222222222222.m26509g(i11);
                c5004t1222222222222222222222222222222222.m26523s(str3);
                c5004t1222222222222222222222222222222222.m26516l(i12);
                c5004t1222222222222222222222222222222222.m26515k(this.f27469W);
                c5004t1222222222222222222222222222222222.m26525u(i18222222222222222222222222222222222);
                c5004t1222222222222222222222222222222222.m26513i(singletonList);
                c5004t1222222222222222222222222222222222.m26508f0(str2);
                c5004t1222222222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y222222222222222222222222222222222 = c5004t1222222222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i222222222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i222222222222222222222222222222222;
                mo21604i222222222222222222222222222222222.mo23300d(m26529y222222222222222222222222222222222);
                return;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                byte[] bArr5 = new byte[4];
                System.arraycopy(m26231i(str4), 0, bArr5, 0, 4);
                singletonList = c83.m20833x(bArr5);
                str5 = "application/dvbsubs";
                str2 = null;
                i12 = -1;
                i16 = -1;
                bArr2 = this.f27460N;
                if (bArr2 != null) {
                }
                str3 = str5;
                int i182222222222222222222222222222222222 = (this.f27468V ? 1 : 0) | (true != this.f27467U ? 0 : 2);
                C5004t1 c5004t12222222222222222222222222222222222 = new C5004t1();
                if (k70.m23849g(str3)) {
                }
                if (this.f27472a != null) {
                }
                c5004t12222222222222222222222222222222222.m26509g(i11);
                c5004t12222222222222222222222222222222222.m26523s(str3);
                c5004t12222222222222222222222222222222222.m26516l(i12);
                c5004t12222222222222222222222222222222222.m26515k(this.f27469W);
                c5004t12222222222222222222222222222222222.m26525u(i182222222222222222222222222222222222);
                c5004t12222222222222222222222222222222222.m26513i(singletonList);
                c5004t12222222222222222222222222222222222.m26508f0(str2);
                c5004t12222222222222222222222222222222222.m26500b(this.f27483l);
                C4671k3 m26529y2222222222222222222222222222222222 = c5004t12222222222222222222222222222222222.m26529y();
                InterfaceC4928r mo21604i2222222222222222222222222222222222 = mm4Var.mo21604i(this.f27474c, i13);
                this.f27470X = mo21604i2222222222222222222222222222222222;
                mo21604i2222222222222222222222222222222222.mo23300d(m26529y2222222222222222222222222222222222);
                return;
            default:
                throw zzbu.m28711a("Unrecognized codec identifier.", null);
        }
    }
}
