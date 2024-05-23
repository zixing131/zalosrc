package com.google.android.gms.internal.ads;

import com.zing.zalo.zinstant.zom.node.ZOM;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.ak */
/* loaded from: classes2.dex */
public final class C4320ak {

    /* renamed from: L */
    public boolean f17110L;

    /* renamed from: O */
    public InterfaceC4985sj f17113O;

    /* renamed from: P */
    public int f17114P;

    /* renamed from: a */
    public String f17115a;

    /* renamed from: b */
    public int f17116b;

    /* renamed from: c */
    public int f17117c;

    /* renamed from: d */
    public int f17118d;

    /* renamed from: e */
    public boolean f17119e;

    /* renamed from: f */
    public byte[] f17120f;

    /* renamed from: g */
    public C4948rj f17121g;

    /* renamed from: h */
    public byte[] f17122h;

    /* renamed from: i */
    public zzauv f17123i;

    /* renamed from: j */
    public int f17124j = -1;

    /* renamed from: k */
    public int f17125k = -1;

    /* renamed from: l */
    public int f17126l = -1;

    /* renamed from: m */
    public int f17127m = -1;

    /* renamed from: n */
    public int f17128n = 0;

    /* renamed from: o */
    public byte[] f17129o = null;

    /* renamed from: p */
    public int f17130p = -1;

    /* renamed from: q */
    public boolean f17131q = false;

    /* renamed from: r */
    public int f17132r = -1;

    /* renamed from: s */
    public int f17133s = -1;

    /* renamed from: t */
    public int f17134t = -1;

    /* renamed from: u */
    public int f17135u = 1000;

    /* renamed from: v */
    public int f17136v = 200;

    /* renamed from: w */
    public float f17137w = -1.0f;

    /* renamed from: x */
    public float f17138x = -1.0f;

    /* renamed from: y */
    public float f17139y = -1.0f;

    /* renamed from: z */
    public float f17140z = -1.0f;

    /* renamed from: A */
    public float f17099A = -1.0f;

    /* renamed from: B */
    public float f17100B = -1.0f;

    /* renamed from: C */
    public float f17101C = -1.0f;

    /* renamed from: D */
    public float f17102D = -1.0f;

    /* renamed from: E */
    public float f17103E = -1.0f;

    /* renamed from: F */
    public float f17104F = -1.0f;

    /* renamed from: G */
    public int f17105G = 1;

    /* renamed from: H */
    public int f17106H = -1;

    /* renamed from: I */
    public int f17107I = 8000;

    /* renamed from: J */
    public long f17108J = 0;

    /* renamed from: K */
    public long f17109K = 0;

    /* renamed from: M */
    public boolean f17111M = true;

    /* renamed from: N */
    private String f17112N = "eng";

    public /* synthetic */ C4320ak(AbstractC5245zj abstractC5245zj) {
    }

    /* renamed from: c */
    private static List m20146c(C4655jo c4655jo) {
        try {
            c4655jo.m23687w(16);
            if (c4655jo.m23675k() != 826496599) {
                return null;
            }
            int m23667c = c4655jo.m23667c() + 20;
            byte[] bArr = c4655jo.f22891a;
            while (true) {
                int length = bArr.length;
                if (m23667c < length - 4) {
                    if (bArr[m23667c] == 0 && bArr[m23667c + 1] == 0 && bArr[m23667c + 2] == 1 && bArr[m23667c + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, m23667c, length));
                    }
                    m23667c++;
                } else {
                    throw new zzasz("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzasz("Error parsing FourCC VC1 codec private");
        }
    }

    /* renamed from: d */
    private static List m20147d(byte[] bArr) {
        int i11;
        int i12;
        try {
            if (bArr[0] == 2) {
                int i13 = 1;
                int i14 = 0;
                while (true) {
                    i11 = bArr[i13];
                    if (i11 != -1) {
                        break;
                    }
                    i14 += 255;
                    i13++;
                }
                int i15 = i13 + 1;
                int i16 = i14 + i11;
                int i17 = 0;
                while (true) {
                    i12 = bArr[i15];
                    if (i12 != -1) {
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
                        throw new zzasz("Error parsing vorbis codec private");
                    }
                    throw new zzasz("Error parsing vorbis codec private");
                }
                throw new zzasz("Error parsing vorbis codec private");
            }
            throw new zzasz("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzasz("Error parsing vorbis codec private");
        }
    }

    /* renamed from: e */
    private static boolean m20148e(C4655jo c4655jo) {
        UUID uuid;
        UUID uuid2;
        try {
            int m23670f = c4655jo.m23670f();
            if (m23670f == 1) {
                return true;
            }
            if (m23670f == 65534) {
                c4655jo.m23686v(24);
                long m23676l = c4655jo.m23676l();
                uuid = C4357bk.f17779c0;
                if (m23676l == uuid.getMostSignificantBits()) {
                    long m23676l2 = c4655jo.m23676l();
                    uuid2 = C4357bk.f17779c0;
                    if (m23676l2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzasz("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0168. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d0  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20149b(InterfaceC4687kj interfaceC4687kj, int i11) {
        char c11;
        List singletonList;
        List list;
        String str;
        int i12;
        int i13;
        int m25832h;
        int i14;
        zzasw m28681i;
        int i15;
        float f11;
        zzbau zzbauVar;
        byte[] bArr;
        int i16;
        String str2 = this.f17115a;
        int i17 = 1;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals("V_MPEG4/ISO/AP")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -2095575984:
                if (str2.equals("V_MPEG4/ISO/SP")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1985379776:
                if (str2.equals("A_MS/ACM")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case -1784763192:
                if (str2.equals("A_TRUEHD")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case -1730367663:
                if (str2.equals("A_VORBIS")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -1482641358:
                if (str2.equals("A_MPEG/L2")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case -1482641357:
                if (str2.equals("A_MPEG/L3")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case -1373388978:
                if (str2.equals("V_MS/VFW/FOURCC")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -933872740:
                if (str2.equals("S_DVBSUB")) {
                    c11 = 27;
                    break;
                }
                c11 = 65535;
                break;
            case -538363189:
                if (str2.equals("V_MPEG4/ISO/ASP")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -538363109:
                if (str2.equals("V_MPEG4/ISO/AVC")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -425012669:
                if (str2.equals("S_VOBSUB")) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            case -356037306:
                if (str2.equals("A_DTS/LOSSLESS")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 62923557:
                if (str2.equals("A_AAC")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 62923603:
                if (str2.equals("A_AC3")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 62927045:
                if (str2.equals("A_DTS")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 82338133:
                if (str2.equals("V_VP8")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 82338134:
                if (str2.equals("V_VP9")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 99146302:
                if (str2.equals("S_HDMV/PGS")) {
                    c11 = 26;
                    break;
                }
                c11 = 65535;
                break;
            case 444813526:
                if (str2.equals("V_THEORA")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 542569478:
                if (str2.equals("A_DTS/EXPRESS")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 725957860:
                if (str2.equals("A_PCM/INT/LIT")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case 855502857:
                if (str2.equals("V_MPEGH/ISO/HEVC")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 1422270023:
                if (str2.equals("S_TEXT/UTF8")) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 1809237540:
                if (str2.equals("V_MPEG2")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1950749482:
                if (str2.equals("A_EAC3")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 1950789798:
                if (str2.equals("A_FLAC")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 1951062397:
                if (str2.equals("A_OPUS")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        String str3 = "video/x-unknown";
        switch (c11) {
            case 0:
                str3 = "video/x-vnd.on2.vp8";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z11 = this.f17111M;
                if (true != this.f17110L) {
                    i14 = 0;
                } else {
                    i14 = 2;
                }
                int i18 = (z11 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                    m28681i = zzasw.m28680h(Integer.toString(i11), str3, null, -1, i13, this.f17105G, this.f17107I, i12, -1, -1, singletonList, this.f17123i, i18, this.f17112N, null);
                } else if (AbstractC4545go.m22494b(str3)) {
                    if (this.f17128n == 0) {
                        int i19 = this.f17126l;
                        i15 = -1;
                        if (i19 == -1) {
                            i19 = this.f17124j;
                        }
                        this.f17126l = i19;
                        int i21 = this.f17127m;
                        if (i21 == -1) {
                            i21 = this.f17125k;
                        }
                        this.f17127m = i21;
                    } else {
                        i15 = -1;
                    }
                    if (this.f17126l != i15 && (i16 = this.f17127m) != i15) {
                        f11 = (this.f17125k * r3) / (this.f17124j * i16);
                    } else {
                        f11 = -1.0f;
                    }
                    if (this.f17131q) {
                        if (this.f17137w == -1.0f || this.f17138x == -1.0f || this.f17139y == -1.0f || this.f17140z == -1.0f || this.f17099A == -1.0f || this.f17100B == -1.0f || this.f17101C == -1.0f || this.f17102D == -1.0f || this.f17103E == -1.0f || this.f17104F == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.f17137w * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17138x * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17139y * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17140z * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17099A * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17100B * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17101C * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f17102D * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.f17103E + 0.5f));
                            wrap.putShort((short) (this.f17104F + 0.5f));
                            wrap.putShort((short) this.f17135u);
                            wrap.putShort((short) this.f17136v);
                        }
                        zzbauVar = new zzbau(this.f17132r, this.f17134t, this.f17133s, bArr);
                    } else {
                        zzbauVar = null;
                    }
                    m28681i = zzasw.m28684l(Integer.toString(i11), str3, null, -1, i13, this.f17124j, this.f17125k, -1.0f, singletonList, -1, f11, this.f17129o, this.f17130p, zzbauVar, this.f17123i);
                    i17 = 2;
                } else {
                    if ("application/x-subrip".equals(str3)) {
                        m28681i = zzasw.m28683k(Integer.toString(i11), str3, null, -1, i18, this.f17112N, -1, this.f17123i, Long.MAX_VALUE, Collections.emptyList());
                    } else {
                        if (!"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw new zzasz("Unexpected MIME type.");
                        }
                        m28681i = zzasw.m28681i(Integer.toString(i11), str3, null, -1, singletonList, this.f17112N, this.f17123i);
                    }
                    i17 = 3;
                }
                InterfaceC4985sj mo20591f = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f;
                mo20591f.mo25798d(m28681i);
                return;
            case 1:
                str3 = "video/x-vnd.on2.vp9";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z112 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182 = (z112 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2;
                mo20591f2.mo25798d(m28681i);
                return;
            case 2:
                str3 = "video/mpeg2";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z1122 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822 = (z1122 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22;
                mo20591f22.mo25798d(m28681i);
                return;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.f17122h;
                if (bArr2 == null) {
                    singletonList = null;
                } else {
                    singletonList = Collections.singletonList(bArr2);
                }
                str3 = "video/mp4v-es";
                i12 = -1;
                i13 = -1;
                boolean z11222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222 = (z11222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222;
                mo20591f222.mo25798d(m28681i);
                return;
            case 6:
                C4953ro m26146a = C4953ro.m26146a(new C4655jo(this.f17122h));
                list = m26146a.f27327a;
                this.f17114P = m26146a.f27328b;
                str = "video/avc";
                i12 = -1;
                i13 = -1;
                List list2 = list;
                str3 = str;
                singletonList = list2;
                boolean z112222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222 = (z112222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222;
                mo20591f2222.mo25798d(m28681i);
                return;
            case 7:
                C5101vo m27323a = C5101vo.m27323a(new C4655jo(this.f17122h));
                list = m27323a.f29421a;
                this.f17114P = m27323a.f29422b;
                str = "video/hevc";
                i12 = -1;
                i13 = -1;
                List list22 = list;
                str3 = str;
                singletonList = list22;
                boolean z1122222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222 = (z1122222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222;
                mo20591f22222.mo25798d(m28681i);
                return;
            case '\b':
                singletonList = m20146c(new C4655jo(this.f17122h));
                if (singletonList != null) {
                    str3 = "video/wvc1";
                }
                i12 = -1;
                i13 = -1;
                boolean z11222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222222 = (z11222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222222;
                mo20591f222222.mo25798d(m28681i);
                return;
            case '\t':
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z112222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222222 = (z112222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222222;
                mo20591f2222222.mo25798d(m28681i);
                return;
            case '\n':
                singletonList = m20147d(this.f17122h);
                str3 = "audio/vorbis";
                i12 = -1;
                i13 = 8192;
                boolean z1122222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222 = (z1122222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222;
                mo20591f22222222.mo25798d(m28681i);
                return;
            case 11:
                singletonList = new ArrayList(3);
                singletonList.add(this.f17122h);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f17108J).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f17109K).array());
                str3 = "audio/opus";
                i12 = -1;
                i13 = 5760;
                boolean z11222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222222222 = (z11222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222222222;
                mo20591f222222222.mo25798d(m28681i);
                return;
            case '\f':
                singletonList = Collections.singletonList(this.f17122h);
                str3 = "audio/mp4a-latm";
                i12 = -1;
                i13 = -1;
                boolean z112222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222222222 = (z112222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222222222;
                mo20591f2222222222.mo25798d(m28681i);
                return;
            case '\r':
                str3 = "audio/mpeg-L2";
                singletonList = null;
                i12 = -1;
                i13 = 4096;
                boolean z1122222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222222 = (z1122222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222222;
                mo20591f22222222222.mo25798d(m28681i);
                return;
            case 14:
                str3 = "audio/mpeg";
                singletonList = null;
                i12 = -1;
                i13 = 4096;
                boolean z11222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222222222222 = (z11222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222222222222;
                mo20591f222222222222.mo25798d(m28681i);
                return;
            case 15:
                str3 = "audio/ac3";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z112222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222222222222 = (z112222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222222222222;
                mo20591f2222222222222.mo25798d(m28681i);
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                str3 = "audio/eac3";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z1122222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222222222 = (z1122222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222222222;
                mo20591f22222222222222.mo25798d(m28681i);
                return;
            case 17:
                str3 = "audio/true-hd";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z11222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222222222222222 = (z11222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222222222222222;
                mo20591f222222222222222.mo25798d(m28681i);
                return;
            case 18:
            case 19:
                str3 = "audio/vnd.dts";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z112222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222222222222222 = (z112222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222222222222222;
                mo20591f2222222222222222.mo25798d(m28681i);
                return;
            case 20:
                str3 = "audio/vnd.dts.hd";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z1122222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222222222222 = (z1122222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222222222222;
                mo20591f22222222222222222.mo25798d(m28681i);
                return;
            case 21:
                singletonList = Collections.singletonList(this.f17122h);
                str3 = "audio/x-flac";
                i12 = -1;
                i13 = -1;
                boolean z11222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222222222222222222 = (z11222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222222222222222222;
                mo20591f222222222222222222.mo25798d(m28681i);
                return;
            case 22:
                if (m20148e(new C4655jo(this.f17122h))) {
                    m25832h = AbstractC4916qo.m25832h(this.f17106H);
                    if (m25832h == 0) {
                        int i22 = this.f17106H;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported PCM bit depth: ");
                        sb2.append(i22);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                    }
                    i12 = m25832h;
                    str3 = "audio/raw";
                    singletonList = null;
                    i13 = -1;
                    boolean z112222222222222222222 = this.f17111M;
                    if (true != this.f17110L) {
                    }
                    int i182222222222222222222 = (z112222222222222222222 ? 1 : 0) | i14;
                    if (AbstractC4545go.m22493a(str3)) {
                    }
                    InterfaceC4985sj mo20591f2222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                    this.f17113O = mo20591f2222222222222222222;
                    mo20591f2222222222222222222.mo25798d(m28681i);
                    return;
                }
                str3 = "audio/x-unknown";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z1122222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222222222222222 = (z1122222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222222222222222;
                mo20591f22222222222222222222.mo25798d(m28681i);
                return;
            case 23:
                m25832h = AbstractC4916qo.m25832h(this.f17106H);
                if (m25832h == 0) {
                    int i23 = this.f17106H;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unsupported PCM bit depth: ");
                    sb3.append(i23);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    str3 = "audio/x-unknown";
                    singletonList = null;
                    i12 = -1;
                    i13 = -1;
                    boolean z11222222222222222222222 = this.f17111M;
                    if (true != this.f17110L) {
                    }
                    int i18222222222222222222222 = (z11222222222222222222222 ? 1 : 0) | i14;
                    if (AbstractC4545go.m22493a(str3)) {
                    }
                    InterfaceC4985sj mo20591f222222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                    this.f17113O = mo20591f222222222222222222222;
                    mo20591f222222222222222222222.mo25798d(m28681i);
                    return;
                }
                i12 = m25832h;
                str3 = "audio/raw";
                singletonList = null;
                i13 = -1;
                boolean z112222222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222222222222222222222 = (z112222222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222222222222222222222;
                mo20591f2222222222222222222222.mo25798d(m28681i);
                return;
            case 24:
                str3 = "application/x-subrip";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z1122222222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222222222222222222 = (z1122222222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222222222222222222;
                mo20591f22222222222222222222222.mo25798d(m28681i);
                return;
            case 25:
                singletonList = Collections.singletonList(this.f17122h);
                str3 = "application/vobsub";
                i12 = -1;
                i13 = -1;
                boolean z11222222222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i18222222222222222222222222 = (z11222222222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f222222222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f222222222222222222222222;
                mo20591f222222222222222222222222.mo25798d(m28681i);
                return;
            case 26:
                str3 = "application/pgs";
                singletonList = null;
                i12 = -1;
                i13 = -1;
                boolean z112222222222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i182222222222222222222222222 = (z112222222222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f2222222222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f2222222222222222222222222;
                mo20591f2222222222222222222222222.mo25798d(m28681i);
                return;
            case 27:
                byte[] bArr3 = this.f17122h;
                singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str3 = "application/dvbsubs";
                i12 = -1;
                i13 = -1;
                boolean z1122222222222222222222222222 = this.f17111M;
                if (true != this.f17110L) {
                }
                int i1822222222222222222222222222 = (z1122222222222222222222222222 ? 1 : 0) | i14;
                if (AbstractC4545go.m22493a(str3)) {
                }
                InterfaceC4985sj mo20591f22222222222222222222222222 = interfaceC4687kj.mo20591f(this.f17116b, i17);
                this.f17113O = mo20591f22222222222222222222222222;
                mo20591f22222222222222222222222222.mo25798d(m28681i);
                return;
            default:
                throw new zzasz("Unrecognized codec identifier.");
        }
    }
}
