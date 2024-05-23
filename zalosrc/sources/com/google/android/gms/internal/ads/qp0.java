package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.IOException;
import java.nio.ByteBuffer;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class qp0 extends kp0 implements InterfaceC4324ao {

    /* renamed from: A */
    private final String f26923A;

    /* renamed from: B */
    private final int f26924B;

    /* renamed from: C */
    private boolean f26925C;

    /* renamed from: s */
    private String f26926s;

    /* renamed from: t */
    private final en0 f26927t;

    /* renamed from: u */
    private boolean f26928u;

    /* renamed from: v */
    private final pp0 f26929v;

    /* renamed from: w */
    private final uo0 f26930w;

    /* renamed from: x */
    private ByteBuffer f26931x;

    /* renamed from: y */
    private boolean f26932y;

    /* renamed from: z */
    private final Object f26933z;

    public qp0(fn0 fn0Var, en0 en0Var) {
        super(fn0Var);
        String str;
        int i11;
        this.f26927t = en0Var;
        this.f26929v = new pp0();
        this.f26930w = new uo0();
        this.f26933z = new Object();
        if (fn0Var != null) {
            str = fn0Var.zzt();
        } else {
            str = "";
        }
        this.f26923A = str;
        if (fn0Var != null) {
            i11 = fn0Var.zzh();
        } else {
            i11 = 0;
        }
        this.f26924B = i11;
    }

    /* renamed from: y */
    protected static final String m25855y(String str) {
        return "cache:".concat(String.valueOf(rk0.m26104g(str)));
    }

    /* renamed from: z */
    private final void m25856z() {
        boolean z11;
        int m25502a = (int) this.f26929v.m25502a();
        int m27016a = (int) this.f26930w.m27016a(this.f26931x);
        int position = this.f26931x.position();
        int round = Math.round(m27016a * (position / m25502a));
        if (round > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m27656X = wm0.m27656X();
        int m27657Z = wm0.m27657Z();
        String str = this.f26926s;
        m23997m(str, m25855y(str), position, m25502a, round, m27016a, z11, m27656X, m27657Z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4324ao
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20195d(Object obj, int i11) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4324ao
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo20196e(Object obj, C4878pn c4878pn) {
        this.f26929v.m25503b((C4952rn) obj);
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: i */
    public final void mo23993i() {
        this.f26928u = true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:? -> B:51:0x00ce). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: s */
    public final boolean mo24003s(String str) {
        String str2;
        this.f26926s = str;
        String m25855y = m25855y(str);
        String str3 = ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
        try {
            String str4 = this.f23422q;
            en0 en0Var = this.f26927t;
            InterfaceC4840on c4952rn = new C4952rn(str4, null, this, en0Var.f19702d, en0Var.f19704f, true, null);
            if (this.f26927t.f19708j) {
                c4952rn = new bo0(this.f23421p, c4952rn, this.f26923A, this.f26924B, null, null, null);
            }
            c4952rn.mo20618b(new C4878pn(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            fn0 fn0Var = (fn0) this.f23423r.get();
            if (fn0Var != null) {
                fn0Var.mo22097q(m25855y, this);
            }
            InterfaceC20285f zzB = zzt.zzB();
            long mo105913a = zzB.mo105913a();
            long longValue = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21406w)).longValue();
            long longValue2 = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21396v)).longValue();
            this.f26931x = ByteBuffer.allocate(this.f26927t.f19701c);
            int i11 = 8192;
            byte[] bArr = new byte[8192];
            long j11 = mo105913a;
            while (true) {
                int mo20617a = c4952rn.mo20617a(bArr, 0, Math.min(this.f26931x.remaining(), i11));
                InterfaceC4840on interfaceC4840on = c4952rn;
                if (mo20617a == -1) {
                    this.f26925C = true;
                    m23996l(str, m25855y, (int) this.f26930w.m27016a(this.f26931x));
                    return true;
                }
                synchronized (this.f26933z) {
                    try {
                        if (!this.f26928u) {
                            str2 = str3;
                            str3 = null;
                            try {
                                this.f26931x.put(bArr, 0, mo20617a);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            str2 = str3;
                        }
                        try {
                            if (this.f26931x.remaining() <= 0) {
                                m25856z();
                                return true;
                            }
                            try {
                                if (!this.f26928u) {
                                    long mo105913a2 = zzB.mo105913a();
                                    if (mo105913a2 - j11 >= longValue) {
                                        m25856z();
                                        j11 = mo105913a2;
                                    }
                                    if (mo105913a2 - mo105913a <= 1000 * longValue2) {
                                        c4952rn = interfaceC4840on;
                                        str3 = str2;
                                        i11 = 8192;
                                    } else {
                                        throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                    }
                                } else {
                                    throw new IOException("Precache abort at " + this.f26931x.limit() + " bytes");
                                }
                            } catch (Exception e11) {
                                e = e11;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                yk0.zzj("Failed to preload url " + str + " Exception: " + str5);
                                m23994j(str, m25855y, str3, str5);
                                return false;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            yk0.zzj("Failed to preload url " + str + " Exception: " + str52);
                            m23994j(str, m25855y, str3, str52);
                            return false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
        } catch (Exception e13) {
            e = e13;
            str2 = str3;
        }
    }

    /* renamed from: v */
    public final String m25857v() {
        return this.f26926s;
    }

    /* renamed from: w */
    public final ByteBuffer m25858w() {
        synchronized (this.f26933z) {
            try {
                ByteBuffer byteBuffer = this.f26931x;
                if (byteBuffer != null && !this.f26932y) {
                    byteBuffer.flip();
                    this.f26932y = true;
                }
                this.f26928u = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f26931x;
    }

    /* renamed from: x */
    public final boolean m25859x() {
        return this.f26925C;
    }
}
