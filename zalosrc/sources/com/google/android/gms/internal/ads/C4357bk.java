package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.bk */
/* loaded from: classes2.dex */
public final class C4357bk implements InterfaceC4614ij {

    /* renamed from: Z */
    public static final InterfaceC4724lj f17776Z = new C5134wj();

    /* renamed from: a0 */
    private static final byte[] f17777a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0 */
    private static final byte[] f17778b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: c0 */
    private static final UUID f17779c0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private C4471eo f17780A;

    /* renamed from: B */
    private C4471eo f17781B;

    /* renamed from: C */
    private boolean f17782C;

    /* renamed from: D */
    private int f17783D;

    /* renamed from: E */
    private long f17784E;

    /* renamed from: F */
    private long f17785F;

    /* renamed from: G */
    private int f17786G;

    /* renamed from: H */
    private int f17787H;

    /* renamed from: I */
    private int[] f17788I;

    /* renamed from: J */
    private int f17789J;

    /* renamed from: K */
    private int f17790K;

    /* renamed from: L */
    private int f17791L;

    /* renamed from: M */
    private int f17792M;

    /* renamed from: N */
    private boolean f17793N;

    /* renamed from: O */
    private boolean f17794O;

    /* renamed from: P */
    private boolean f17795P;

    /* renamed from: Q */
    private boolean f17796Q;

    /* renamed from: R */
    private byte f17797R;

    /* renamed from: S */
    private int f17798S;

    /* renamed from: T */
    private int f17799T;

    /* renamed from: U */
    private int f17800U;

    /* renamed from: V */
    private boolean f17801V;

    /* renamed from: W */
    private boolean f17802W;

    /* renamed from: X */
    private InterfaceC4687kj f17803X;

    /* renamed from: Y */
    private final C5096vj f17804Y;

    /* renamed from: a */
    private final C4430dk f17805a;

    /* renamed from: b */
    private final SparseArray f17806b;

    /* renamed from: c */
    private final boolean f17807c;

    /* renamed from: d */
    private final C4655jo f17808d;

    /* renamed from: e */
    private final C4655jo f17809e;

    /* renamed from: f */
    private final C4655jo f17810f;

    /* renamed from: g */
    private final C4655jo f17811g;

    /* renamed from: h */
    private final C4655jo f17812h;

    /* renamed from: i */
    private final C4655jo f17813i;

    /* renamed from: j */
    private final C4655jo f17814j;

    /* renamed from: k */
    private final C4655jo f17815k;

    /* renamed from: l */
    private final C4655jo f17816l;

    /* renamed from: m */
    private ByteBuffer f17817m;

    /* renamed from: n */
    private long f17818n;

    /* renamed from: o */
    private long f17819o;

    /* renamed from: p */
    private long f17820p;

    /* renamed from: q */
    private long f17821q;

    /* renamed from: r */
    private long f17822r;

    /* renamed from: s */
    private C4320ak f17823s;

    /* renamed from: t */
    private boolean f17824t;

    /* renamed from: u */
    private int f17825u;

    /* renamed from: v */
    private long f17826v;

    /* renamed from: w */
    private boolean f17827w;

    /* renamed from: x */
    private long f17828x;

    /* renamed from: y */
    private long f17829y;

    /* renamed from: z */
    private long f17830z;

    public C4357bk(int i11) {
        C5096vj c5096vj = new C5096vj();
        this.f17819o = -1L;
        this.f17820p = -9223372036854775807L;
        this.f17821q = -9223372036854775807L;
        this.f17822r = -9223372036854775807L;
        this.f17828x = -1L;
        this.f17829y = -1L;
        this.f17830z = -9223372036854775807L;
        this.f17804Y = c5096vj;
        c5096vj.m27229b(new C5208yj(this, null));
        this.f17807c = true;
        this.f17805a = new C4430dk();
        this.f17806b = new SparseArray();
        this.f17810f = new C4655jo(4);
        this.f17811g = new C4655jo(ByteBuffer.allocate(4).putInt(-1).array());
        this.f17812h = new C4655jo(4);
        this.f17808d = new C4655jo(AbstractC4582ho.f21849a);
        this.f17809e = new C4655jo(4);
        this.f17813i = new C4655jo();
        this.f17814j = new C4655jo();
        this.f17815k = new C4655jo(8);
        this.f17816l = new C4655jo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static final int m20534l(int i11) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static final boolean m20535m(int i11) {
        return i11 == 357149030 || i11 == 524531317 || i11 == 475249515 || i11 == 374648427;
    }

    /* renamed from: n */
    private final long m20536n(long j11) {
        long j12 = this.f17820p;
        if (j12 != -9223372036854775807L) {
            return AbstractC4916qo.m25834j(j11, j12, 1000L);
        }
        throw new zzasz("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: o */
    private final void m20537o(C4320ak c4320ak, long j11) {
        byte[] m25841q;
        if ("S_TEXT/UTF8".equals(c4320ak.f17115a)) {
            byte[] bArr = this.f17814j.f22891a;
            long j12 = this.f17785F;
            if (j12 == -9223372036854775807L) {
                m25841q = f17778b0;
            } else {
                int i11 = (int) (j12 / 3600000000L);
                long j13 = j12 - (i11 * 3600000000L);
                int i12 = (int) (j13 / 60000000);
                long j14 = j13 - (60000000 * i12);
                m25841q = AbstractC4916qo.m25841q(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) (j14 / 1000000)), Integer.valueOf((int) ((j14 - (r4 * 1000000)) / 1000))));
            }
            System.arraycopy(m25841q, 0, bArr, 19, 12);
            InterfaceC4985sj interfaceC4985sj = c4320ak.f17113O;
            C4655jo c4655jo = this.f17814j;
            interfaceC4985sj.mo25796b(c4655jo, c4655jo.m23668d());
            this.f17800U += this.f17814j.m23668d();
        }
        c4320ak.f17113O.mo25795a(j11, this.f17791L, this.f17800U, 0, c4320ak.f17121g);
        this.f17801V = true;
        m20538p();
    }

    /* renamed from: p */
    private final void m20538p() {
        this.f17792M = 0;
        this.f17800U = 0;
        this.f17799T = 0;
        this.f17793N = false;
        this.f17794O = false;
        this.f17796Q = false;
        this.f17798S = 0;
        this.f17797R = (byte) 0;
        this.f17795P = false;
        this.f17813i.m23682r();
    }

    /* renamed from: q */
    private static int[] m20539q(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[i11];
        }
        int length = iArr.length;
        if (length >= i11) {
            return iArr;
        }
        return new int[Math.max(length + length, i11)];
    }

    /* renamed from: r */
    private final int m20540r(C4577hj c4577hj, InterfaceC4985sj interfaceC4985sj, int i11) {
        int mo25797c;
        int m23665a = this.f17813i.m23665a();
        if (m23665a > 0) {
            mo25797c = Math.min(i11, m23665a);
            interfaceC4985sj.mo25796b(this.f17813i, mo25797c);
        } else {
            mo25797c = interfaceC4985sj.mo25797c(c4577hj, i11, false);
        }
        this.f17792M += mo25797c;
        this.f17800U += mo25797c;
        return mo25797c;
    }

    /* renamed from: s */
    private final void m20541s(C4577hj c4577hj, int i11) {
        if (this.f17810f.m23668d() >= i11) {
            return;
        }
        if (this.f17810f.m23666b() < i11) {
            C4655jo c4655jo = this.f17810f;
            byte[] bArr = c4655jo.f22891a;
            int length = bArr.length;
            c4655jo.m23684t(Arrays.copyOf(bArr, Math.max(length + length, i11)), this.f17810f.m23668d());
        }
        C4655jo c4655jo2 = this.f17810f;
        c4577hj.m22921h(c4655jo2.f22891a, c4655jo2.m23668d(), i11 - this.f17810f.m23668d(), false);
        this.f17810f.m23685u(i11);
    }

    /* renamed from: t */
    private final void m20542t(C4577hj c4577hj, C4320ak c4320ak, int i11) {
        int i12;
        if ("S_TEXT/UTF8".equals(c4320ak.f17115a)) {
            int i13 = i11 + 32;
            if (this.f17814j.m23666b() < i13) {
                this.f17814j.f22891a = Arrays.copyOf(f17777a0, i13 + i11);
            }
            c4577hj.m22921h(this.f17814j.f22891a, 32, i11, false);
            this.f17814j.m23686v(0);
            this.f17814j.m23685u(i13);
            return;
        }
        InterfaceC4985sj interfaceC4985sj = c4320ak.f17113O;
        if (!this.f17793N) {
            if (c4320ak.f17119e) {
                this.f17791L &= -1073741825;
                int i14 = 128;
                if (!this.f17794O) {
                    c4577hj.m22921h(this.f17810f.f22891a, 0, 1, false);
                    this.f17792M++;
                    byte b11 = this.f17810f.f22891a[0];
                    if ((b11 & 128) != 128) {
                        this.f17797R = b11;
                        this.f17794O = true;
                    } else {
                        throw new zzasz("Extension bit is set in signal byte");
                    }
                }
                byte b12 = this.f17797R;
                if ((b12 & 1) == 1) {
                    int i15 = b12 & 2;
                    this.f17791L |= 1073741824;
                    if (!this.f17795P) {
                        c4577hj.m22921h(this.f17815k.f22891a, 0, 8, false);
                        this.f17792M += 8;
                        this.f17795P = true;
                        C4655jo c4655jo = this.f17810f;
                        byte[] bArr = c4655jo.f22891a;
                        if (i15 != 2) {
                            i14 = 0;
                        }
                        bArr[0] = (byte) (i14 | 8);
                        c4655jo.m23686v(0);
                        interfaceC4985sj.mo25796b(this.f17810f, 1);
                        this.f17800U++;
                        this.f17815k.m23686v(0);
                        interfaceC4985sj.mo25796b(this.f17815k, 8);
                        this.f17800U += 8;
                    }
                    if (i15 == 2) {
                        if (!this.f17796Q) {
                            c4577hj.m22921h(this.f17810f.f22891a, 0, 1, false);
                            this.f17792M++;
                            this.f17810f.m23686v(0);
                            this.f17798S = this.f17810f.m23671g();
                            this.f17796Q = true;
                        }
                        int i16 = this.f17798S * 4;
                        this.f17810f.m23683s(i16);
                        c4577hj.m22921h(this.f17810f.f22891a, 0, i16, false);
                        this.f17792M += i16;
                        int i17 = (this.f17798S >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.f17817m;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f17817m = ByteBuffer.allocate(i18);
                        }
                        this.f17817m.position(0);
                        this.f17817m.putShort((short) i17);
                        int i19 = 0;
                        int i21 = 0;
                        while (true) {
                            i12 = this.f17798S;
                            if (i19 >= i12) {
                                break;
                            }
                            int m23673i = this.f17810f.m23673i();
                            if (i19 % 2 == 0) {
                                this.f17817m.putShort((short) (m23673i - i21));
                            } else {
                                this.f17817m.putInt(m23673i - i21);
                            }
                            i19++;
                            i21 = m23673i;
                        }
                        int i22 = (i11 - this.f17792M) - i21;
                        if ((i12 & 1) == 1) {
                            this.f17817m.putInt(i22);
                        } else {
                            this.f17817m.putShort((short) i22);
                            this.f17817m.putInt(0);
                        }
                        this.f17816l.m23684t(this.f17817m.array(), i18);
                        interfaceC4985sj.mo25796b(this.f17816l, i18);
                        this.f17800U += i18;
                    }
                }
            } else {
                byte[] bArr2 = c4320ak.f17120f;
                if (bArr2 != null) {
                    this.f17813i.m23684t(bArr2, bArr2.length);
                }
            }
            this.f17793N = true;
        }
        int m23668d = i11 + this.f17813i.m23668d();
        if (!"V_MPEG4/ISO/AVC".equals(c4320ak.f17115a) && !"V_MPEGH/ISO/HEVC".equals(c4320ak.f17115a)) {
            while (true) {
                int i23 = this.f17792M;
                if (i23 >= m23668d) {
                    break;
                } else {
                    m20540r(c4577hj, interfaceC4985sj, m23668d - i23);
                }
            }
        } else {
            byte[] bArr3 = this.f17809e.f22891a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = c4320ak.f17114P;
            int i25 = 4 - i24;
            while (this.f17792M < m23668d) {
                int i26 = this.f17799T;
                if (i26 == 0) {
                    int min = Math.min(i24, this.f17813i.m23665a());
                    c4577hj.m22921h(bArr3, i25 + min, i24 - min, false);
                    if (min > 0) {
                        this.f17813i.m23681q(bArr3, i25, min);
                    }
                    this.f17792M += i24;
                    this.f17809e.m23686v(0);
                    this.f17799T = this.f17809e.m23673i();
                    this.f17808d.m23686v(0);
                    interfaceC4985sj.mo25796b(this.f17808d, 4);
                    this.f17800U += 4;
                } else {
                    this.f17799T = i26 - m20540r(c4577hj, interfaceC4985sj, i26);
                }
            }
        }
        if ("A_VORBIS".equals(c4320ak.f17115a)) {
            this.f17811g.m23686v(0);
            interfaceC4985sj.mo25796b(this.f17811g, 4);
            this.f17800U += 4;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: b */
    public final int mo20543b(C4577hj c4577hj, C4836oj c4836oj) {
        this.f17801V = false;
        while (!this.f17801V) {
            if (this.f17804Y.m27230c(c4577hj)) {
                long m22917d = c4577hj.m22917d();
                if (this.f17827w) {
                    this.f17829y = m22917d;
                    c4836oj.f25657a = this.f17828x;
                    this.f17827w = false;
                    return 1;
                }
                if (this.f17824t) {
                    long j11 = this.f17829y;
                    if (j11 != -1) {
                        c4836oj.f25657a = j11;
                        this.f17829y = -1L;
                        return 1;
                    }
                }
            } else {
                return -1;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: c */
    public final void mo20544c(long j11, long j12) {
        this.f17830z = -9223372036854775807L;
        this.f17783D = 0;
        this.f17804Y.m27228a();
        this.f17805a.m21430d();
        m20538p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: d */
    public final void mo20545d(InterfaceC4687kj interfaceC4687kj) {
        this.f17803X = interfaceC4687kj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: e */
    public final boolean mo20546e(C4577hj c4577hj) {
        return new C4393ck().m20912a(c4577hj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m20547f(int i11) {
        InterfaceC4911qj c4874pj;
        C4471eo c4471eo;
        C4471eo c4471eo2;
        int i12;
        int i13 = 0;
        if (i11 != 160) {
            if (i11 != 174) {
                if (i11 != 19899) {
                    if (i11 != 25152) {
                        if (i11 != 28032) {
                            if (i11 != 357149030) {
                                if (i11 != 374648427) {
                                    if (i11 == 475249515 && !this.f17824t) {
                                        InterfaceC4687kj interfaceC4687kj = this.f17803X;
                                        if (this.f17819o != -1 && this.f17822r != -9223372036854775807L && (c4471eo = this.f17780A) != null && c4471eo.m21765a() != 0 && (c4471eo2 = this.f17781B) != null && c4471eo2.m21765a() == c4471eo.m21765a()) {
                                            int m21765a = c4471eo.m21765a();
                                            int[] iArr = new int[m21765a];
                                            long[] jArr = new long[m21765a];
                                            long[] jArr2 = new long[m21765a];
                                            long[] jArr3 = new long[m21765a];
                                            for (int i14 = 0; i14 < m21765a; i14++) {
                                                jArr3[i14] = this.f17780A.m21766b(i14);
                                                jArr[i14] = this.f17819o + this.f17781B.m21766b(i14);
                                            }
                                            while (true) {
                                                i12 = m21765a - 1;
                                                if (i13 >= i12) {
                                                    break;
                                                }
                                                int i15 = i13 + 1;
                                                iArr[i13] = (int) (jArr[i15] - jArr[i13]);
                                                jArr2[i13] = jArr3[i15] - jArr3[i13];
                                                i13 = i15;
                                            }
                                            iArr[i12] = (int) ((this.f17819o + this.f17818n) - jArr[i12]);
                                            jArr2[i12] = this.f17822r - jArr3[i12];
                                            this.f17780A = null;
                                            this.f17781B = null;
                                            c4874pj = new C4540gj(iArr, jArr, jArr2, jArr3);
                                        } else {
                                            this.f17780A = null;
                                            this.f17781B = null;
                                            c4874pj = new C4874pj(this.f17822r);
                                        }
                                        interfaceC4687kj.mo20587b(c4874pj);
                                        this.f17824t = true;
                                        return;
                                    }
                                    return;
                                }
                                if (this.f17806b.size() != 0) {
                                    this.f17803X.zzb();
                                    return;
                                }
                                throw new zzasz("No valid tracks were found");
                            }
                            if (this.f17820p == -9223372036854775807L) {
                                this.f17820p = 1000000L;
                            }
                            long j11 = this.f17821q;
                            if (j11 != -9223372036854775807L) {
                                this.f17822r = m20536n(j11);
                                return;
                            }
                            return;
                        }
                        C4320ak c4320ak = this.f17823s;
                        if (c4320ak.f17119e && c4320ak.f17120f != null) {
                            throw new zzasz("Combining encryption and compression is not supported");
                        }
                        return;
                    }
                    C4320ak c4320ak2 = this.f17823s;
                    if (c4320ak2.f17119e) {
                        if (c4320ak2.f17121g != null) {
                            c4320ak2.f17123i = new zzauv(new zzauu(AbstractC5093vg.f29306b, "video/webm", this.f17823s.f17121g.f27244b, false));
                            return;
                        }
                        throw new zzasz("Encrypted Track found but ContentEncKeyID was not found");
                    }
                    return;
                }
                int i16 = this.f17825u;
                if (i16 != -1) {
                    long j12 = this.f17826v;
                    if (j12 != -1) {
                        if (i16 == 475249515) {
                            this.f17828x = j12;
                            return;
                        }
                        return;
                    }
                }
                throw new zzasz("Mandatory element SeekID or SeekPosition not found");
            }
            String str = this.f17823s.f17115a;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                C4320ak c4320ak3 = this.f17823s;
                c4320ak3.m20149b(this.f17803X, c4320ak3.f17116b);
                SparseArray sparseArray = this.f17806b;
                C4320ak c4320ak4 = this.f17823s;
                sparseArray.put(c4320ak4.f17116b, c4320ak4);
            }
            this.f17823s = null;
            return;
        }
        if (this.f17783D != 2) {
            return;
        }
        if (!this.f17802W) {
            this.f17791L |= 1;
        }
        m20537o((C4320ak) this.f17806b.get(this.f17789J), this.f17784E);
        this.f17783D = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m20548g(int i11, double d11) {
        if (i11 != 181) {
            if (i11 != 17545) {
                switch (i11) {
                    case 21969:
                        this.f17823s.f17137w = (float) d11;
                        return;
                    case 21970:
                        this.f17823s.f17138x = (float) d11;
                        return;
                    case 21971:
                        this.f17823s.f17139y = (float) d11;
                        return;
                    case 21972:
                        this.f17823s.f17140z = (float) d11;
                        return;
                    case 21973:
                        this.f17823s.f17099A = (float) d11;
                        return;
                    case 21974:
                        this.f17823s.f17100B = (float) d11;
                        return;
                    case 21975:
                        this.f17823s.f17101C = (float) d11;
                        return;
                    case 21976:
                        this.f17823s.f17102D = (float) d11;
                        return;
                    case 21977:
                        this.f17823s.f17103E = (float) d11;
                        return;
                    case 21978:
                        this.f17823s.f17104F = (float) d11;
                        return;
                    default:
                        return;
                }
            }
            this.f17821q = (long) d11;
            return;
        }
        this.f17823s.f17107I = (int) d11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m20549h(int i11, long j11) {
        if (i11 != 20529) {
            if (i11 != 20530) {
                boolean z11 = false;
                switch (i11) {
                    case 131:
                        this.f17823s.f17117c = (int) j11;
                        return;
                    case 136:
                        C4320ak c4320ak = this.f17823s;
                        if (j11 == 1) {
                            z11 = true;
                        }
                        c4320ak.f17110L = z11;
                        return;
                    case 155:
                        this.f17785F = m20536n(j11);
                        return;
                    case 159:
                        this.f17823s.f17105G = (int) j11;
                        return;
                    case 176:
                        this.f17823s.f17124j = (int) j11;
                        return;
                    case 179:
                        this.f17780A.m21767c(m20536n(j11));
                        return;
                    case 186:
                        this.f17823s.f17125k = (int) j11;
                        return;
                    case 215:
                        this.f17823s.f17116b = (int) j11;
                        return;
                    case 231:
                        this.f17830z = m20536n(j11);
                        return;
                    case 241:
                        if (!this.f17782C) {
                            this.f17781B.m21767c(j11);
                            this.f17782C = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f17802W = true;
                        return;
                    case 16980:
                        if (j11 != 3) {
                            throw new zzasz("ContentCompAlgo " + j11 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j11 < 1 || j11 > 2) {
                            throw new zzasz("DocTypeReadVersion " + j11 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j11 != 1) {
                            throw new zzasz("EBMLReadVersion " + j11 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j11 != 5) {
                            throw new zzasz("ContentEncAlgo " + j11 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j11 != 1) {
                            throw new zzasz("AESSettingsCipherMode " + j11 + " not supported");
                        }
                        return;
                    case 21420:
                        this.f17826v = j11 + this.f17819o;
                        return;
                    case 21432:
                        int i12 = (int) j11;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 3) {
                                    if (i12 == 15) {
                                        this.f17823s.f17130p = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.f17823s.f17130p = 1;
                                return;
                            }
                            this.f17823s.f17130p = 2;
                            return;
                        }
                        this.f17823s.f17130p = 0;
                        return;
                    case 21680:
                        this.f17823s.f17126l = (int) j11;
                        return;
                    case 21682:
                        this.f17823s.f17128n = (int) j11;
                        return;
                    case 21690:
                        this.f17823s.f17127m = (int) j11;
                        return;
                    case 21930:
                        C4320ak c4320ak2 = this.f17823s;
                        if (j11 == 1) {
                            z11 = true;
                        }
                        c4320ak2.f17111M = z11;
                        return;
                    case 22186:
                        this.f17823s.f17108J = j11;
                        return;
                    case 22203:
                        this.f17823s.f17109K = j11;
                        return;
                    case 25188:
                        this.f17823s.f17106H = (int) j11;
                        return;
                    case 2352003:
                        this.f17823s.f17118d = (int) j11;
                        return;
                    case 2807729:
                        this.f17820p = j11;
                        return;
                    default:
                        switch (i11) {
                            case 21945:
                                int i13 = (int) j11;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        this.f17823s.f17134t = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.f17823s.f17134t = 2;
                                return;
                            case 21946:
                                int i14 = (int) j11;
                                if (i14 != 1) {
                                    if (i14 != 16) {
                                        if (i14 != 18) {
                                            if (i14 != 6 && i14 != 7) {
                                                return;
                                            }
                                        } else {
                                            this.f17823s.f17133s = 7;
                                            return;
                                        }
                                    } else {
                                        this.f17823s.f17133s = 6;
                                        return;
                                    }
                                }
                                this.f17823s.f17133s = 3;
                                return;
                            case 21947:
                                C4320ak c4320ak3 = this.f17823s;
                                c4320ak3.f17131q = true;
                                int i15 = (int) j11;
                                if (i15 != 1) {
                                    if (i15 != 9) {
                                        if (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) {
                                            c4320ak3.f17132r = 2;
                                            return;
                                        }
                                        return;
                                    }
                                    c4320ak3.f17132r = 6;
                                    return;
                                }
                                c4320ak3.f17132r = 1;
                                return;
                            case 21948:
                                this.f17823s.f17135u = (int) j11;
                                return;
                            case 21949:
                                this.f17823s.f17136v = (int) j11;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j11 != 1) {
                throw new zzasz("ContentEncodingScope " + j11 + " not supported");
            }
            return;
        }
        if (j11 == 0) {
            return;
        }
        throw new zzasz("ContentEncodingOrder " + j11 + " not supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m20550i(int i11, long j11, long j12) {
        if (i11 != 160) {
            if (i11 != 174) {
                if (i11 != 187) {
                    if (i11 != 19899) {
                        if (i11 != 20533) {
                            if (i11 != 21968) {
                                if (i11 != 408125543) {
                                    if (i11 != 475249515) {
                                        if (i11 == 524531317 && !this.f17824t) {
                                            if (this.f17807c && this.f17828x != -1) {
                                                this.f17827w = true;
                                                return;
                                            } else {
                                                this.f17803X.mo20587b(new C4874pj(this.f17822r));
                                                this.f17824t = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.f17780A = new C4471eo(32);
                                    this.f17781B = new C4471eo(32);
                                    return;
                                }
                                long j13 = this.f17819o;
                                if (j13 != -1 && j13 != j11) {
                                    throw new zzasz("Multiple Segment elements not supported");
                                }
                                this.f17819o = j11;
                                this.f17818n = j12;
                                return;
                            }
                            this.f17823s.f17131q = true;
                            return;
                        }
                        this.f17823s.f17119e = true;
                        return;
                    }
                    this.f17825u = -1;
                    this.f17826v = -1L;
                    return;
                }
                this.f17782C = false;
                return;
            }
            this.f17823s = new C4320ak(null);
            return;
        }
        this.f17802W = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m20551j(int i11, String str) {
        if (i11 != 134) {
            if (i11 != 17026) {
                if (i11 == 2274716) {
                    C4320ak.m20145a(this.f17823s, str);
                    return;
                }
                return;
            } else {
                if (!"webm".equals(str) && !"matroska".equals(str)) {
                    throw new zzasz("DocType " + str + " not supported");
                }
                return;
            }
        }
        this.f17823s.f17115a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:            throw new com.google.android.gms.internal.ads.zzasz("EBML lacing sample size out of range.");     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20552k(int i11, int i12, C4577hj c4577hj) {
        long j11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        int i19 = 1;
        if (i18 != 161 && i18 != 163) {
            if (i18 != 16981) {
                if (i18 != 18402) {
                    if (i18 != 21419) {
                        if (i18 != 25506) {
                            if (i18 == 30322) {
                                byte[] bArr = new byte[i12];
                                this.f17823s.f17129o = bArr;
                                c4577hj.m22921h(bArr, 0, i12, false);
                                return;
                            } else {
                                throw new zzasz("Unexpected id: " + i18);
                            }
                        }
                        byte[] bArr2 = new byte[i12];
                        this.f17823s.f17122h = bArr2;
                        c4577hj.m22921h(bArr2, 0, i12, false);
                        return;
                    }
                    Arrays.fill(this.f17812h.f22891a, (byte) 0);
                    c4577hj.m22921h(this.f17812h.f22891a, 4 - i12, i12, false);
                    this.f17812h.m23686v(0);
                    this.f17825u = (int) this.f17812h.m23677m();
                    return;
                }
                byte[] bArr3 = new byte[i12];
                c4577hj.m22921h(bArr3, 0, i12, false);
                this.f17823s.f17121g = new C4948rj(1, bArr3);
                return;
            }
            byte[] bArr4 = new byte[i12];
            this.f17823s.f17120f = bArr4;
            c4577hj.m22921h(bArr4, 0, i12, false);
            return;
        }
        int i21 = 8;
        if (this.f17783D == 0) {
            this.f17789J = (int) this.f17805a.m21431e(c4577hj, false, true, 8);
            this.f17790K = this.f17805a.m21429a();
            this.f17785F = -9223372036854775807L;
            this.f17783D = 1;
            this.f17810f.m23682r();
        }
        C4320ak c4320ak = (C4320ak) this.f17806b.get(this.f17789J);
        if (c4320ak == null) {
            c4577hj.m22922i(i12 - this.f17790K, false);
            this.f17783D = 0;
            return;
        }
        if (this.f17783D == 1) {
            m20541s(c4577hj, 3);
            int i22 = (this.f17810f.f22891a[2] & 6) >> 1;
            byte b11 = 255;
            if (i22 == 0) {
                this.f17787H = 1;
                int[] m20539q = m20539q(this.f17788I, 1);
                this.f17788I = m20539q;
                m20539q[0] = (i12 - this.f17790K) - 3;
            } else if (i18 == 163) {
                int i23 = 4;
                m20541s(c4577hj, 4);
                int i24 = (this.f17810f.f22891a[3] & 255) + 1;
                this.f17787H = i24;
                int[] m20539q2 = m20539q(this.f17788I, i24);
                this.f17788I = m20539q2;
                if (i22 == 2) {
                    int i25 = this.f17790K;
                    int i26 = this.f17787H;
                    Arrays.fill(m20539q2, 0, i26, ((i12 - i25) - 4) / i26);
                } else if (i22 == 1) {
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        i13 = this.f17787H - 1;
                        if (i27 >= i13) {
                            break;
                        }
                        this.f17788I[i27] = 0;
                        while (true) {
                            i14 = i23 + 1;
                            m20541s(c4577hj, i14);
                            int i29 = this.f17810f.f22891a[i23] & 255;
                            int[] iArr = this.f17788I;
                            i15 = iArr[i27] + i29;
                            iArr[i27] = i15;
                            if (i29 != 255) {
                                break;
                            } else {
                                i23 = i14;
                            }
                        }
                        i28 += i15;
                        i27++;
                        i23 = i14;
                    }
                    this.f17788I[i13] = ((i12 - this.f17790K) - i23) - i28;
                } else if (i22 == 3) {
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        int i33 = this.f17787H - 1;
                        if (i31 < i33) {
                            this.f17788I[i31] = 0;
                            int i34 = i23 + 1;
                            m20541s(c4577hj, i34);
                            if (this.f17810f.f22891a[i23] != 0) {
                                int i35 = 0;
                                while (true) {
                                    if (i35 < i21) {
                                        int i36 = i19 << (7 - i35);
                                        if ((this.f17810f.f22891a[i23] & i36) != 0) {
                                            i34 += i35;
                                            m20541s(c4577hj, i34);
                                            int i37 = i23 + 1;
                                            j11 = (~i36) & this.f17810f.f22891a[i23] & b11;
                                            while (i37 < i34) {
                                                j11 = (j11 << i21) | (this.f17810f.f22891a[i37] & b11);
                                                i37++;
                                                i21 = 8;
                                                b11 = 255;
                                            }
                                            if (i31 > 0) {
                                                j11 -= (1 << ((i35 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i35++;
                                            i19 = 1;
                                            i21 = 8;
                                            b11 = 255;
                                        }
                                    } else {
                                        j11 = 0;
                                        break;
                                    }
                                }
                                i23 = i34;
                                if (j11 < -2147483648L || j11 > 2147483647L) {
                                    break;
                                }
                                int i38 = (int) j11;
                                int[] iArr2 = this.f17788I;
                                if (i31 != 0) {
                                    i38 += iArr2[i31 - 1];
                                }
                                iArr2[i31] = i38;
                                i32 += i38;
                                i31++;
                                i19 = 1;
                                i21 = 8;
                                b11 = 255;
                            } else {
                                throw new zzasz("No valid varint length mask found");
                            }
                        } else {
                            this.f17788I[i33] = ((i12 - this.f17790K) - i23) - i32;
                            break;
                        }
                    }
                } else {
                    throw new zzasz("Unexpected lacing value: 2");
                }
            } else {
                throw new zzasz("Lacing only supported in SimpleBlocks.");
            }
            byte b12 = this.f17810f.f22891a[0];
            this.f17784E = this.f17830z + m20536n((r2[1] & 255) | (b12 << 8));
            byte b13 = this.f17810f.f22891a[2];
            int i39 = b13 & 8;
            if (c4320ak.f17117c != 2) {
                if (i18 == 163) {
                    if ((b13 & 128) == 128) {
                        i18 = 163;
                    } else {
                        i18 = 163;
                    }
                }
                i16 = 0;
                if (i39 != 8) {
                    i17 = Integer.MIN_VALUE;
                } else {
                    i17 = 0;
                }
                this.f17791L = i16 | i17;
                this.f17783D = 2;
                this.f17786G = 0;
            }
            i16 = 1;
            if (i39 != 8) {
            }
            this.f17791L = i16 | i17;
            this.f17783D = 2;
            this.f17786G = 0;
        }
        if (i18 != 163) {
            m20542t(c4577hj, c4320ak, this.f17788I[0]);
            return;
        }
        while (true) {
            int i41 = this.f17786G;
            if (i41 < this.f17787H) {
                m20542t(c4577hj, c4320ak, this.f17788I[i41]);
                m20537o(c4320ak, this.f17784E + ((this.f17786G * c4320ak.f17118d) / 1000));
                this.f17786G++;
            } else {
                this.f17783D = 0;
                return;
            }
        }
    }
}
