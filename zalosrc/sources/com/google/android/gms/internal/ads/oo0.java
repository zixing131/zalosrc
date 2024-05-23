package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class oo0 extends wm0 implements InterfaceC4324ao, InterfaceC4395cm, InterfaceC4693kp, InterfaceC4428di, InterfaceC5131wg {

    /* renamed from: L */
    public static final /* synthetic */ int f25702L = 0;

    /* renamed from: A */
    private final WeakReference f25703A;

    /* renamed from: B */
    private vm0 f25704B;

    /* renamed from: C */
    private int f25705C;

    /* renamed from: D */
    private int f25706D;

    /* renamed from: E */
    private long f25707E;

    /* renamed from: F */
    private final String f25708F;

    /* renamed from: G */
    private final int f25709G;

    /* renamed from: I */
    private final ArrayList f25711I;

    /* renamed from: J */
    private volatile bo0 f25712J;

    /* renamed from: r */
    private final Context f25714r;

    /* renamed from: s */
    private final co0 f25715s;

    /* renamed from: t */
    private final InterfaceC4760mh f25716t;

    /* renamed from: u */
    private final InterfaceC4760mh f25717u;

    /* renamed from: v */
    private final AbstractC4507fn f25718v;

    /* renamed from: w */
    private final en0 f25719w;

    /* renamed from: x */
    private InterfaceC5242zg f25720x;

    /* renamed from: y */
    private ByteBuffer f25721y;

    /* renamed from: z */
    private boolean f25722z;

    /* renamed from: H */
    private final Object f25710H = new Object();

    /* renamed from: K */
    private final Set f25713K = new HashSet();

    public oo0(Context context, en0 en0Var, fn0 fn0Var) {
        String str;
        this.f25714r = context;
        this.f25719w = en0Var;
        this.f25703A = new WeakReference(fn0Var);
        co0 co0Var = new co0();
        this.f25715s = co0Var;
        InterfaceC4505fl interfaceC4505fl = InterfaceC4505fl.f20182a;
        m23 m23Var = zzs.zza;
        C5250zo c5250zo = new C5250zo(context, interfaceC4505fl, 0L, m23Var, this, -1);
        this.f25716t = c5250zo;
        C4910qi c4910qi = new C4910qi(interfaceC4505fl, null, true, m23Var, this);
        this.f25717u = c4910qi;
        C4360bn c4360bn = new C4360bn(null);
        this.f25718v = c4360bn;
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        wm0.f30008p.incrementAndGet();
        InterfaceC5242zg m20118a = AbstractC4317ah.m20118a(new InterfaceC4760mh[]{c4910qi, c5250zo}, c4360bn, co0Var);
        this.f25720x = m20118a;
        m20118a.mo20884i(this);
        this.f25705C = 0;
        this.f25707E = 0L;
        this.f25706D = 0;
        this.f25711I = new ArrayList();
        this.f25712J = null;
        if (fn0Var != null && fn0Var.zzt() != null) {
            str = fn0Var.zzt();
        } else {
            str = "";
        }
        this.f25708F = str;
        this.f25709G = fn0Var != null ? fn0Var.zzh() : 0;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21316n)).booleanValue()) {
            this.f25720x.zzg();
        }
        if (fn0Var != null && fn0Var.zzg() > 0) {
            this.f25720x.mo20890o(fn0Var.zzg());
        }
        if (fn0Var != null && fn0Var.zzf() > 0) {
            this.f25720x.mo20888m(fn0Var.zzf());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21336p)).booleanValue()) {
            this.f25720x.zzi();
            this.f25720x.mo20881f(((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21346q)).intValue());
        }
    }

    /* renamed from: l0 */
    private final boolean m25226l0() {
        if (this.f25712J != null && this.f25712J.m20625i()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4693kp
    /* renamed from: B */
    public final void mo23988B(zzasw zzaswVar) {
        fn0 fn0Var = (fn0) this.f25703A.get();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && fn0Var != null && zzaswVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzaswVar.f31815A));
            hashMap.put("bitRate", String.valueOf(zzaswVar.f31832q));
            hashMap.put("resolution", zzaswVar.f31840y + "x" + zzaswVar.f31841z);
            hashMap.put("videoMime", zzaswVar.f31835t);
            hashMap.put("videoSampleMime", zzaswVar.f31836u);
            hashMap.put("videoCodec", zzaswVar.f31833r);
            fn0Var.mo23552V("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4693kp
    /* renamed from: C */
    public final void mo23989C(Surface surface) {
        vm0 vm0Var = this.f25704B;
        if (vm0Var != null) {
            vm0Var.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: E */
    public final long mo24665E() {
        if (!m25226l0()) {
            return this.f25705C;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: F */
    public final long mo24666F() {
        if (!m25226l0()) {
            synchronized (this.f25710H) {
                while (!this.f25711I.isEmpty()) {
                    long j11 = this.f25707E;
                    Map zze = ((InterfaceC5026tn) this.f25711I.remove(0)).zze();
                    long j12 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && q43.m25658c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j12 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f25707E = j11 + j12;
                }
            }
            return this.f25707E;
        }
        return this.f25712J.m20620d();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: G */
    public final void mo24667G(Uri[] uriArr, String str) {
        mo24668H(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: H */
    public final void mo24668H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z11) {
        InterfaceC4617im c4727lm;
        if (this.f25720x == null) {
            return;
        }
        this.f25721y = byteBuffer;
        this.f25722z = z11;
        int length = uriArr.length;
        if (length == 1) {
            c4727lm = m25234m0(uriArr[0], str);
        } else {
            InterfaceC4617im[] interfaceC4617imArr = new InterfaceC4617im[length];
            for (int i11 = 0; i11 < uriArr.length; i11++) {
                interfaceC4617imArr[i11] = m25234m0(uriArr[i11], str);
            }
            c4727lm = new C4727lm(interfaceC4617imArr);
        }
        this.f25720x.mo20886k(c4727lm);
        wm0.f30009q.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: I */
    public final void mo24669I() {
        InterfaceC5242zg interfaceC5242zg = this.f25720x;
        if (interfaceC5242zg != null) {
            interfaceC5242zg.mo20887l(this);
            this.f25720x.zzk();
            this.f25720x = null;
            wm0.f30009q.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: J */
    public final void mo24670J(long j11) {
        this.f25720x.mo20882g(j11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: K */
    public final void mo24671K(int i11) {
        this.f25715s.m20970f(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: L */
    public final void mo24672L(int i11) {
        this.f25715s.m20971g(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: M */
    public final void mo24673M(vm0 vm0Var) {
        this.f25704B = vm0Var;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: N */
    public final void mo24674N(int i11) {
        this.f25715s.m20972h(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: O */
    public final void mo24675O(int i11) {
        this.f25715s.m20973i(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: P */
    public final void mo24676P(boolean z11) {
        this.f25720x.mo20883h(z11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: Q */
    public final void mo24677Q(boolean z11) {
        if (this.f25720x != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                this.f25718v.m22088f(i11, !z11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: R */
    public final void mo24678R(int i11) {
        Iterator it = this.f25713K.iterator();
        while (it.hasNext()) {
            zn0 zn0Var = (zn0) ((WeakReference) it.next()).get();
            if (zn0Var != null) {
                zn0Var.m28565e(i11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: S */
    public final void mo24679S(Surface surface, boolean z11) {
        InterfaceC5242zg interfaceC5242zg = this.f25720x;
        if (interfaceC5242zg == null) {
            return;
        }
        C5205yg c5205yg = new C5205yg(this.f25716t, 1, surface);
        if (z11) {
            interfaceC5242zg.mo20889n(c5205yg);
        } else {
            interfaceC5242zg.mo20885j(c5205yg);
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: T */
    public final void mo24680T(float f11, boolean z11) {
        if (this.f25720x == null) {
            return;
        }
        this.f25720x.mo20885j(new C5205yg(this.f25717u, 2, Float.valueOf(f11)));
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: U */
    public final void mo24681U() {
        this.f25720x.zzr();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: V */
    public final boolean mo24682V() {
        return this.f25720x != null;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: W */
    public final int mo24683W() {
        return this.f25706D;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: Y */
    public final int mo24684Y() {
        return this.f25720x.zza();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: a0 */
    public final long mo24685a0() {
        return this.f25720x.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4395cm
    /* renamed from: b */
    public final void mo20955b(IOException iOException) {
        vm0 vm0Var = this.f25704B;
        if (vm0Var != null) {
            if (this.f25719w.f19710l) {
                vm0Var.mo26644c("onLoadException", iOException);
            } else {
                vm0Var.mo26646g("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: b0 */
    public final long mo24686b0() {
        return this.f25705C;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: c0 */
    public final long mo24687c0() {
        if (!m25226l0() || !this.f25712J.m20624h()) {
            return 0L;
        }
        return Math.min(this.f25705C, this.f25712J.m20619c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4324ao
    /* renamed from: d */
    public final /* synthetic */ void mo20195d(Object obj, int i11) {
        this.f25705C += i11;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: d0 */
    public final long mo24688d0() {
        return this.f25720x.zzc();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: e0 */
    public final long mo24689e0() {
        return this.f25720x.zzd();
    }

    /* renamed from: f0 */
    public final /* synthetic */ InterfaceC4840on m25227f0(String str, boolean z11) {
        oo0 oo0Var;
        if (true != z11) {
            oo0Var = null;
        } else {
            oo0Var = this;
        }
        en0 en0Var = this.f25719w;
        zn0 zn0Var = new zn0(str, oo0Var, en0Var.f19702d, en0Var.f19704f, en0Var.f19707i);
        this.f25713K.add(new WeakReference(zn0Var));
        return zn0Var;
    }

    public final void finalize() {
        wm0.f30008p.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    /* renamed from: g */
    public final void mo25228g(C4722lh c4722lh) {
    }

    /* renamed from: g0 */
    public final /* synthetic */ InterfaceC4840on m25229g0(String str, boolean z11) {
        oo0 oo0Var;
        if (true != z11) {
            oo0Var = null;
        } else {
            oo0Var = this;
        }
        en0 en0Var = this.f25719w;
        return new C4952rn(str, null, oo0Var, en0Var.f19702d, en0Var.f19704f, true, null);
    }

    /* renamed from: h0 */
    public final /* synthetic */ InterfaceC4840on m25230h0(InterfaceC4803nn interfaceC4803nn) {
        return new bo0(this.f25714r, interfaceC4803nn.zza(), this.f25708F, this.f25709G, this, new ko0(this), null);
    }

    /* renamed from: i0 */
    public final /* synthetic */ void m25231i0(boolean z11, long j11) {
        vm0 vm0Var = this.f25704B;
        if (vm0Var != null) {
            vm0Var.mo26645f(z11, j11);
        }
    }

    /* renamed from: j0 */
    public final void m25232j0(InterfaceC4840on interfaceC4840on, int i11) {
        this.f25705C += i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4324ao
    /* renamed from: k0 */
    public final void mo20196e(InterfaceC4840on interfaceC4840on, C4878pn c4878pn) {
        if (interfaceC4840on instanceof InterfaceC5026tn) {
            synchronized (this.f25710H) {
                this.f25711I.add((InterfaceC5026tn) interfaceC4840on);
            }
        } else if (interfaceC4840on instanceof bo0) {
            this.f25712J = (bo0) interfaceC4840on;
            fn0 fn0Var = (fn0) this.f25703A.get();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && fn0Var != null && this.f25712J.m20622f()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f25712J.m20624h()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f25712J.m20623g()));
                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.lo0

                    /* renamed from: q */
                    public final /* synthetic */ Map f23999q;

                    public /* synthetic */ lo0(Map hashMap2) {
                        r2 = hashMap2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        fn0 fn0Var2 = fn0.this;
                        Map map = r2;
                        int i11 = oo0.f25702L;
                        fn0Var2.mo23552V("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4428di
    /* renamed from: m */
    public final void mo21394m(zzasw zzaswVar) {
        fn0 fn0Var = (fn0) this.f25703A.get();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && fn0Var != null && zzaswVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzaswVar.f31835t);
            hashMap.put("audioSampleMime", zzaswVar.f31836u);
            hashMap.put("audioCodec", zzaswVar.f31833r);
            fn0Var.mo23552V("onMetadataEvent", hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(com.google.android.gms.internal.ads.AbstractC4554gx.f20963D1)).booleanValue() == false) goto L50;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final InterfaceC4617im m25234m0(Uri uri, String str) {
        InterfaceC4803nn go0Var;
        InterfaceC4803nn jo0Var;
        InterfaceC4724lj interfaceC4724lj;
        if (this.f25722z && this.f25721y.limit() > 0) {
            byte[] bArr = new byte[this.f25721y.limit()];
            this.f25721y.get(bArr);
            go0Var = new InterfaceC4803nn() { // from class: com.google.android.gms.internal.ads.do0

                /* renamed from: a */
                public final /* synthetic */ byte[] f19370a;

                public /* synthetic */ do0(byte[] bArr2) {
                    r1 = bArr2;
                }

                @Override // com.google.android.gms.internal.ads.InterfaceC4803nn
                public final InterfaceC4840on zza() {
                    return new C4766mn(r1);
                }
            };
        } else {
            boolean z11 = true;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21053M1)).booleanValue()) {
            }
            if (this.f25719w.f19708j) {
                z11 = false;
            }
            en0 en0Var = this.f25719w;
            if (en0Var.f19713o) {
                go0Var = new InterfaceC4803nn() { // from class: com.google.android.gms.internal.ads.eo0

                    /* renamed from: b */
                    public final /* synthetic */ String f19721b;

                    /* renamed from: c */
                    public final /* synthetic */ boolean f19722c;

                    public /* synthetic */ eo0(String str2, boolean z112) {
                        r2 = str2;
                        r3 = z112;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC4803nn
                    public final InterfaceC4840on zza() {
                        return oo0.this.m25236n0(r2, r3);
                    }
                };
            } else if (en0Var.f19707i > 0) {
                go0Var = new InterfaceC4803nn() { // from class: com.google.android.gms.internal.ads.fo0

                    /* renamed from: b */
                    public final /* synthetic */ String f20205b;

                    /* renamed from: c */
                    public final /* synthetic */ boolean f20206c;

                    public /* synthetic */ fo0(String str2, boolean z112) {
                        r2 = str2;
                        r3 = z112;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC4803nn
                    public final InterfaceC4840on zza() {
                        return oo0.this.m25227f0(r2, r3);
                    }
                };
            } else {
                go0Var = new InterfaceC4803nn() { // from class: com.google.android.gms.internal.ads.go0

                    /* renamed from: b */
                    public final /* synthetic */ String f20772b;

                    /* renamed from: c */
                    public final /* synthetic */ boolean f20773c;

                    public /* synthetic */ go0(String str2, boolean z112) {
                        r2 = str2;
                        r3 = z112;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC4803nn
                    public final InterfaceC4840on zza() {
                        return oo0.this.m25229g0(r2, r3);
                    }
                };
            }
            if (this.f25719w.f19708j) {
                go0Var = new InterfaceC4803nn() { // from class: com.google.android.gms.internal.ads.io0

                    /* renamed from: b */
                    public final /* synthetic */ InterfaceC4803nn f22243b;

                    public /* synthetic */ io0(InterfaceC4803nn go0Var2) {
                        r2 = go0Var2;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC4803nn
                    public final InterfaceC4840on zza() {
                        return oo0.this.m25230h0(r2);
                    }
                };
            }
            ByteBuffer byteBuffer = this.f25721y;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr2 = new byte[this.f25721y.limit()];
                this.f25721y.get(bArr2);
                jo0Var = new InterfaceC4803nn() { // from class: com.google.android.gms.internal.ads.jo0

                    /* renamed from: b */
                    public final /* synthetic */ byte[] f22895b;

                    public /* synthetic */ jo0(byte[] bArr22) {
                        r2 = bArr22;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC4803nn
                    public final InterfaceC4840on zza() {
                        InterfaceC4803nn interfaceC4803nn = InterfaceC4803nn.this;
                        byte[] bArr3 = r2;
                        int i11 = oo0.f25702L;
                        return new po0(new C4766mn(bArr3), bArr3.length, interfaceC4803nn.zza());
                    }
                };
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21306m)).booleanValue()) {
                    interfaceC4724lj = mo0.f24681a;
                } else {
                    interfaceC4724lj = no0.f25276a;
                }
                InterfaceC4724lj interfaceC4724lj2 = interfaceC4724lj;
                en0 en0Var2 = this.f25719w;
                return new C4469em(uri, jo0Var, interfaceC4724lj2, en0Var2.f19709k, zzs.zza, this, null, en0Var2.f19705g);
            }
        }
        jo0Var = go0Var2;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21306m)).booleanValue()) {
        }
        InterfaceC4724lj interfaceC4724lj22 = interfaceC4724lj;
        en0 en0Var22 = this.f25719w;
        return new C4469em(uri, jo0Var, interfaceC4724lj22, en0Var22.f19709k, zzs.zza, this, null, en0Var22.f19705g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    /* renamed from: n */
    public final void mo25235n(zzasi zzasiVar) {
        vm0 vm0Var = this.f25704B;
        if (vm0Var != null) {
            vm0Var.mo26646g("onPlayerError", zzasiVar);
        }
    }

    /* renamed from: n0 */
    public final /* synthetic */ InterfaceC4840on m25236n0(String str, boolean z11) {
        oo0 oo0Var;
        if (true != z11) {
            oo0Var = null;
        } else {
            oo0Var = this;
        }
        en0 en0Var = this.f25719w;
        return new so0(str, oo0Var, en0Var.f19702d, en0Var.f19704f, en0Var.f19714p, en0Var.f19715q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    /* renamed from: o */
    public final void mo25237o(boolean z11, int i11) {
        vm0 vm0Var = this.f25704B;
        if (vm0Var != null) {
            vm0Var.mo26643b(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    /* renamed from: p */
    public final void mo25238p(C5137wm c5137wm, C4581hn c4581hn) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    /* renamed from: r */
    public final void mo25239r(AbstractC4983sh abstractC4983sh, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4693kp
    /* renamed from: u */
    public final void mo23990u(int i11, int i12, int i13, float f11) {
        vm0 vm0Var = this.f25704B;
        if (vm0Var != null) {
            vm0Var.mo26642a(i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4693kp
    /* renamed from: z */
    public final void mo23991z(int i11, long j11) {
        this.f25706D += i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    public final void zza(boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5131wg
    public final void zze() {
    }
}
