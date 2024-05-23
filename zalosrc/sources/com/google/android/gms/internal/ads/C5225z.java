package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.z */
/* loaded from: classes2.dex */
public final class C5225z implements jm4 {

    /* renamed from: p */
    private static final int[] f31290p;

    /* renamed from: s */
    private static final int f31293s;

    /* renamed from: b */
    private boolean f31295b;

    /* renamed from: c */
    private long f31296c;

    /* renamed from: d */
    private int f31297d;

    /* renamed from: e */
    private int f31298e;

    /* renamed from: f */
    private boolean f31299f;

    /* renamed from: h */
    private int f31301h;

    /* renamed from: i */
    private long f31302i;

    /* renamed from: j */
    private mm4 f31303j;

    /* renamed from: k */
    private InterfaceC4928r f31304k;

    /* renamed from: l */
    private InterfaceC4779n f31305l;

    /* renamed from: m */
    private boolean f31306m;

    /* renamed from: n */
    public static final qm4 f31288n = new qm4() { // from class: com.google.android.gms.internal.ads.y
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C5225z(0)};
        }
    };

    /* renamed from: o */
    private static final int[] f31289o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q */
    private static final byte[] f31291q = g92.m22308B("#!AMR\n");

    /* renamed from: r */
    private static final byte[] f31292r = g92.m22308B("#!AMR-WB\n");

    /* renamed from: a */
    private final byte[] f31294a = new byte[1];

    /* renamed from: g */
    private int f31300g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f31290p = iArr;
        f31293s = iArr[8];
    }

    public C5225z(int i11) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:13:0x0007, B:15:0x001b, B:23:0x0039, B:24:0x0042, B:30:0x003e, B:40:0x005c, B:41:0x0079, B:42:0x007a, B:43:0x008f), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:13:0x0007, B:15:0x001b, B:23:0x0039, B:24:0x0042, B:30:0x003e, B:40:0x005c, B:41:0x0079, B:42:0x007a, B:43:0x008f), top: B:12:0x0007 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m28407b(km4 km4Var) {
        int i11;
        int i12 = this.f31298e;
        if (i12 == 0) {
            try {
                km4Var.zzj();
                ((yl4) km4Var).mo23963f(this.f31294a, 0, 1, false);
                byte b11 = this.f31294a[0];
                if ((b11 & 131) <= 0) {
                    int i13 = (b11 >> 3) & 15;
                    boolean z11 = this.f31295b;
                    if (z11) {
                        if (i13 >= 10) {
                            if (i13 > 13) {
                            }
                        }
                        if (!z11) {
                            i12 = f31290p[i13];
                        } else {
                            i12 = f31289o[i13];
                        }
                        this.f31297d = i12;
                        this.f31298e = i12;
                        i11 = this.f31300g;
                        if (i11 == -1) {
                            this.f31300g = i12;
                            i11 = i12;
                        }
                        if (i11 == i12) {
                            this.f31301h++;
                        }
                    }
                    if (!z11) {
                        if (i13 >= 12 && i13 <= 14) {
                        }
                        if (!z11) {
                        }
                        this.f31297d = i12;
                        this.f31298e = i12;
                        i11 = this.f31300g;
                        if (i11 == -1) {
                        }
                        if (i11 == i12) {
                        }
                    }
                    String str = "WB";
                    if (true != z11) {
                        str = "NB";
                    }
                    throw zzbu.m28711a("Illegal AMR " + str + " frame type " + i13, null);
                }
                throw zzbu.m28711a("Invalid padding bits for frame header " + ((int) b11), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int m25365a = AbstractC4853p.m25365a(this.f31304k, km4Var, i12, true);
        if (m25365a == -1) {
            return -1;
        }
        int i14 = this.f31298e - m25365a;
        this.f31298e = i14;
        if (i14 > 0) {
            return 0;
        }
        this.f31304k.mo23302f(this.f31296c, 1, this.f31297d, 0, null);
        this.f31296c += 20000;
        return 0;
    }

    /* renamed from: d */
    private static boolean m28408d(km4 km4Var, byte[] bArr) {
        km4Var.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((yl4) km4Var).mo23963f(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: g */
    private final boolean m28409g(km4 km4Var) {
        byte[] bArr = f31291q;
        if (m28408d(km4Var, bArr)) {
            this.f31295b = false;
            ((yl4) km4Var).m28248l(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f31292r;
        if (!m28408d(km4Var, bArr2)) {
            return false;
        }
        this.f31295b = true;
        ((yl4) km4Var).m28248l(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        return m28409g(km4Var);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f31303j = mm4Var;
        this.f31304k = mm4Var.mo21604i(0, 1);
        mm4Var.zzC();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f31296c = 0L;
        this.f31297d = 0;
        this.f31298e = 0;
        this.f31302i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        String str;
        int i11;
        v71.m27171b(this.f31304k);
        int i12 = g92.f20474a;
        if (km4Var.zzf() == 0 && !m28409g(km4Var)) {
            throw zzbu.m28711a("Could not find AMR header.", null);
        }
        if (!this.f31306m) {
            this.f31306m = true;
            boolean z11 = this.f31295b;
            if (true != z11) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            if (true != z11) {
                i11 = 8000;
            } else {
                i11 = 16000;
            }
            InterfaceC4928r interfaceC4928r = this.f31304k;
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26523s(str);
            c5004t1.m26516l(f31293s);
            c5004t1.m26506e0(1);
            c5004t1.m26524t(i11);
            interfaceC4928r.mo23300d(c5004t1.m26529y());
        }
        int m28407b = m28407b(km4Var);
        if (this.f31299f) {
            return m28407b;
        }
        C4741m c4741m = new C4741m(-9223372036854775807L, 0L);
        this.f31305l = c4741m;
        this.f31303j.mo21603f(c4741m);
        this.f31299f = true;
        return m28407b;
    }
}
