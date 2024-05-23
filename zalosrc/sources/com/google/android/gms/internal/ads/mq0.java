package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
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
public final class mq0 extends wm0 implements dc3, u44 {

    /* renamed from: K */
    public static final /* synthetic */ int f24693K = 0;

    /* renamed from: A */
    private vm0 f24694A;

    /* renamed from: B */
    private int f24695B;

    /* renamed from: C */
    private int f24696C;

    /* renamed from: D */
    private long f24697D;

    /* renamed from: E */
    private final String f24698E;

    /* renamed from: F */
    private final int f24699F;

    /* renamed from: H */
    private final ArrayList f24701H;

    /* renamed from: I */
    private volatile yp0 f24702I;

    /* renamed from: r */
    private final Context f24704r;

    /* renamed from: s */
    private final wp0 f24705s;

    /* renamed from: t */
    private final si4 f24706t;

    /* renamed from: u */
    private final en0 f24707u;

    /* renamed from: v */
    private final WeakReference f24708v;

    /* renamed from: w */
    private final kg4 f24709w;

    /* renamed from: x */
    private h44 f24710x;

    /* renamed from: y */
    private ByteBuffer f24711y;

    /* renamed from: z */
    private boolean f24712z;

    /* renamed from: G */
    private final Object f24700G = new Object();

    /* renamed from: J */
    private final Set f24703J = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(com.google.android.gms.internal.ads.AbstractC4554gx.f20963D1)).booleanValue() == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f8, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:            if (r7.f19713o == false) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:            r8 = new com.google.android.gms.internal.ads.cq0(r5, r6, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:            if (r7.f19708j == false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:            r7 = new com.google.android.gms.internal.ads.fq0(r5, r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0124, code lost:            r6 = r5.f24711y;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0126, code lost:            if (r6 == null) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:            if (r6.limit() <= 0) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012e, code lost:            r6 = new byte[r5.f24711y.limit()];        r5.f24711y.get(r6);        r7 = new com.google.android.gms.internal.ads.gq0(r7, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:            r7 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:            if (r7.f19707i <= 0) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:            r8 = new com.google.android.gms.internal.ads.dq0(r5, r6, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:            r8 = new com.google.android.gms.internal.ads.eq0(r5, r6, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:            if (r7.f19708j == false) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mq0(Context context, en0 en0Var, fn0 fn0Var) {
        String str;
        int i11;
        final pi2 pi2Var;
        qm4 qm4Var;
        this.f24704r = context;
        this.f24707u = en0Var;
        this.f24708v = new WeakReference(fn0Var);
        wp0 wp0Var = new wp0();
        this.f24705s = wp0Var;
        si4 si4Var = new si4(context);
        this.f24706t = si4Var;
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        wm0.f30008p.incrementAndGet();
        g44 g44Var = new g44(context, new hq0(this), null);
        g44Var.m22281b(si4Var);
        g44Var.m22280a(wp0Var);
        this.f24710x = g44Var.m22282c();
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21033K1)).booleanValue()) {
            g34.m22276a(this.f24710x);
        }
        this.f24710x.m22705m(this);
        final boolean z11 = false;
        this.f24695B = 0;
        this.f24697D = 0L;
        this.f24696C = 0;
        this.f24701H = new ArrayList();
        this.f24702I = null;
        if (fn0Var != null && fn0Var.zzt() != null) {
            str = fn0Var.zzt();
        } else {
            str = "";
        }
        this.f24698E = str;
        if (fn0Var != null) {
            i11 = fn0Var.zzh();
        } else {
            i11 = 0;
        }
        this.f24699F = i11;
        final String zzc = zzt.zzp().zzc(context, fn0Var.zzp().f32030p);
        if (this.f24712z && this.f24711y.limit() > 0) {
            final byte[] bArr = new byte[this.f24711y.limit()];
            this.f24711y.get(bArr);
            pi2Var = new pi2() { // from class: com.google.android.gms.internal.ads.aq0
                @Override // com.google.android.gms.internal.ads.pi2
                public final qj2 zza() {
                    return new le2(bArr);
                }
            };
        } else {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21053M1)).booleanValue()) {
            }
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21306m)).booleanValue()) {
            qm4Var = new qm4() { // from class: com.google.android.gms.internal.ads.kq0
                @Override // com.google.android.gms.internal.ads.qm4
                /* renamed from: a */
                public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
                    return pm4.m25488a(this, uri, map);
                }

                @Override // com.google.android.gms.internal.ads.qm4
                public final jm4[] zza() {
                    int i12 = mq0.f24693K;
                    return new jm4[]{new C4341b4(0), new C5005t2(0), new C5117w3(0, null)};
                }
            };
        } else {
            qm4Var = new qm4() { // from class: com.google.android.gms.internal.ads.lq0
                @Override // com.google.android.gms.internal.ads.qm4
                /* renamed from: a */
                public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
                    return pm4.m25488a(this, uri, map);
                }

                @Override // com.google.android.gms.internal.ads.qm4
                public final jm4[] zza() {
                    int i12 = mq0.f24693K;
                    return new jm4[]{new C4341b4(0), new C5005t2(0)};
                }
            };
        }
        this.f24709w = new kg4(pi2Var, new jg4(qm4Var), null);
    }

    /* renamed from: m0 */
    private final boolean m24664m0() {
        if (this.f24702I != null && this.f24702I.m28291u()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: A */
    public final void mo21341A(qj2 qj2Var, wo2 wo2Var, boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: D */
    public final void mo21342D(qj2 qj2Var, wo2 wo2Var, boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: E */
    public final long mo24665E() {
        if (!m24664m0()) {
            return this.f24695B;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: F */
    public final long mo24666F() {
        if (!m24664m0()) {
            synchronized (this.f24700G) {
                while (!this.f24701H.isEmpty()) {
                    long j11 = this.f24697D;
                    Map zze = ((n63) this.f24701H.remove(0)).zze();
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
                    this.f24697D = j11 + j12;
                }
            }
            return this.f24697D;
        }
        return this.f24702I.m28286p();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: G */
    public final void mo24667G(Uri[] uriArr, String str) {
        mo24668H(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: H */
    public final void mo24668H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z11) {
        if4 wf4Var;
        if (this.f24710x == null) {
            return;
        }
        this.f24711y = byteBuffer;
        this.f24712z = z11;
        int length = uriArr.length;
        if (length == 1) {
            wf4Var = m24694j0(uriArr[0]);
        } else {
            if4[] if4VarArr = new if4[length];
            for (int i11 = 0; i11 < uriArr.length; i11++) {
                if4VarArr[i11] = m24694j0(uriArr[i11]);
            }
            wf4Var = new wf4(false, false, if4VarArr);
        }
        this.f24710x.m22695c(wf4Var);
        this.f24710x.m22706n();
        wm0.f30009q.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: I */
    public final void mo24669I() {
        h44 h44Var = this.f24710x;
        if (h44Var != null) {
            h44Var.m22694b(this);
            this.f24710x.m22707o();
            this.f24710x = null;
            wm0.f30009q.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: J */
    public final void mo24670J(long j11) {
        h44 h44Var = this.f24710x;
        h44Var.mo22693a(h44Var.zzf(), j11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: K */
    public final void mo24671K(int i11) {
        this.f24705s.m27673e(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: L */
    public final void mo24672L(int i11) {
        this.f24705s.m27674f(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: M */
    public final void mo24673M(vm0 vm0Var) {
        this.f24694A = vm0Var;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: N */
    public final void mo24674N(int i11) {
        this.f24705s.m27675g(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: O */
    public final void mo24675O(int i11) {
        this.f24705s.m27676h(i11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: P */
    public final void mo24676P(boolean z11) {
        this.f24710x.m22696d(z11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: Q */
    public final void mo24677Q(boolean z11) {
        if (this.f24710x != null) {
            int i11 = 0;
            while (true) {
                this.f24710x.m22701i();
                if (i11 < 2) {
                    si4 si4Var = this.f24706t;
                    yh4 m20130c = si4Var.m26335k().m20130c();
                    m20130c.m28217o(i11, !z11);
                    si4Var.m26336p(m20130c);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: R */
    public final void mo24678R(int i11) {
        Iterator it = this.f24703J.iterator();
        while (it.hasNext()) {
            vp0 vp0Var = (vp0) ((WeakReference) it.next()).get();
            if (vp0Var != null) {
                vp0Var.m27327q(i11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: S */
    public final void mo24679S(Surface surface, boolean z11) {
        h44 h44Var = this.f24710x;
        if (h44Var == null) {
            return;
        }
        h44Var.m22698f(surface);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: T */
    public final void mo24680T(float f11, boolean z11) {
        h44 h44Var = this.f24710x;
        if (h44Var == null) {
            return;
        }
        h44Var.m22699g(f11);
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: U */
    public final void mo24681U() {
        this.f24710x.m22700h();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: V */
    public final boolean mo24682V() {
        return this.f24710x != null;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: W */
    public final int mo24683W() {
        return this.f24696C;
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: Y */
    public final int mo24684Y() {
        return this.f24710x.zzh();
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: a */
    public final /* synthetic */ void mo21300a(jk0 jk0Var, t44 t44Var) {
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: a0 */
    public final long mo24685a0() {
        return this.f24710x.m22702j();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: b0 */
    public final long mo24686b0() {
        return this.f24695B;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: c */
    public final /* synthetic */ void mo21302c(s44 s44Var, cf4 cf4Var) {
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: c0 */
    public final long mo24687c0() {
        if (!m24664m0() || !this.f24702I.m28290t()) {
            return 0L;
        }
        return Math.min(this.f24695B, this.f24702I.m28285o());
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: d0 */
    public final long mo24688d0() {
        return this.f24710x.zzl();
    }

    @Override // com.google.android.gms.internal.ads.wm0
    /* renamed from: e0 */
    public final long mo24689e0() {
        return this.f24710x.m22703k();
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: f */
    public final void mo21305f(s44 s44Var, C4671k3 c4671k3, lw3 lw3Var) {
        fn0 fn0Var = (fn0) this.f24708v.get();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && fn0Var != null && c4671k3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", c4671k3.f23098k);
            hashMap.put("audioSampleMime", c4671k3.f23099l);
            hashMap.put("audioCodec", c4671k3.f23096i);
            fn0Var.mo23552V("onMetadataEvent", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ qj2 m24690f0(String str, boolean z11) {
        mq0 mq0Var;
        if (true != z11) {
            mq0Var = null;
        } else {
            mq0Var = this;
        }
        en0 en0Var = this.f24707u;
        return new pq0(str, mq0Var, en0Var.f19702d, en0Var.f19704f, en0Var.f19714p, en0Var.f19715q);
    }

    public final void finalize() {
        wm0.f30008p.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final /* synthetic */ qj2 m24691g0(String str, boolean z11) {
        mq0 mq0Var;
        if (true != z11) {
            mq0Var = null;
        } else {
            mq0Var = this;
        }
        en0 en0Var = this.f24707u;
        vp0 vp0Var = new vp0(str, mq0Var, en0Var.f19702d, en0Var.f19704f, en0Var.f19707i);
        this.f24703J.add(new WeakReference(vp0Var));
        return vp0Var;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: h */
    public final /* synthetic */ void mo21306h(s44 s44Var, int i11, long j11, long j12) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ qj2 m24692h0(String str, boolean z11) {
        mq0 mq0Var;
        xr2 xr2Var = new xr2();
        xr2Var.m28001e(str);
        if (true != z11) {
            mq0Var = null;
        } else {
            mq0Var = this;
        }
        xr2Var.m28000d(mq0Var);
        xr2Var.m27998b(this.f24707u.f19702d);
        xr2Var.m27999c(this.f24707u.f19704f);
        xr2Var.m27997a(true);
        return xr2Var.zza();
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: i */
    public final void mo21343i(qj2 qj2Var, wo2 wo2Var, boolean z11, int i11) {
        this.f24695B += i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ qj2 m24693i0(pi2 pi2Var) {
        return new yp0(this.f24704r, pi2Var.zza(), this.f24698E, this.f24699F, this, new bq0(this), null);
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: j */
    public final /* synthetic */ void mo21307j(s44 s44Var, jj0 jj0Var, jj0 jj0Var2, int i11) {
    }

    /* renamed from: j0 */
    final if4 m24694j0(Uri uri) {
        C4787n7 c4787n7 = new C4787n7();
        c4787n7.m24857b(uri);
        C4330au m24858c = c4787n7.m24858c();
        kg4 kg4Var = this.f24709w;
        kg4Var.m23947a(this.f24707u.f19705g);
        return kg4Var.m23948b(m24858c);
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: k */
    public final void mo21308k(s44 s44Var, C4671k3 c4671k3, lw3 lw3Var) {
        fn0 fn0Var = (fn0) this.f24708v.get();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && fn0Var != null && c4671k3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(c4671k3.f23106s));
            hashMap.put("bitRate", String.valueOf(c4671k3.f23095h));
            hashMap.put("resolution", c4671k3.f23104q + "x" + c4671k3.f23105r);
            hashMap.put("videoMime", c4671k3.f23098k);
            hashMap.put("videoSampleMime", c4671k3.f23099l);
            hashMap.put("videoCodec", c4671k3.f23096i);
            fn0Var.mo23552V("onMetadataEvent", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* synthetic */ void m24695k0(boolean z11, long j11) {
        vm0 vm0Var = this.f24694A;
        if (vm0Var != null) {
            vm0Var.mo26645f(z11, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: l */
    public final void mo21309l(s44 s44Var, Object obj, long j11) {
        vm0 vm0Var = this.f24694A;
        if (vm0Var != null) {
            vm0Var.zzv();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final /* synthetic */ c44[] m24696l0(Handler handler, dl4 dl4Var, z94 z94Var, eh4 eh4Var, ge4 ge4Var) {
        Context context = this.f24704r;
        md4 md4Var = md4.f24480a;
        l94 l94Var = l94.f23798c;
        n94[] n94VarArr = new n94[0];
        oa4 oa4Var = new oa4();
        if (l94Var != null || l94Var != null) {
            oa4Var.m25109b(l94Var);
            oa4Var.m25110c(n94VarArr);
            ob4 m25111d = oa4Var.m25111d();
            fd4 fd4Var = fd4.f20089a;
            return new c44[]{new vb4(context, fd4Var, md4Var, false, handler, z94Var, m25111d), new fk4(this.f24704r, fd4Var, md4Var, 0L, false, handler, dl4Var, -1, 30.0f)};
        }
        throw new NullPointerException("Both parameters are null");
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: q */
    public final void mo21310q(s44 s44Var, s41 s41Var) {
        vm0 vm0Var = this.f24694A;
        if (vm0Var != null) {
            vm0Var.mo26642a(s41Var.f27529a, s41Var.f27530b);
        }
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: s */
    public final /* synthetic */ void mo21311s(s44 s44Var, lv3 lv3Var) {
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: t */
    public final void mo21312t(s44 s44Var, zzbw zzbwVar) {
        vm0 vm0Var = this.f24694A;
        if (vm0Var != null) {
            vm0Var.mo26646g("onPlayerError", zzbwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: v */
    public final void mo21313v(s44 s44Var, int i11, long j11) {
        this.f24696C += i11;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: w */
    public final void mo21314w(s44 s44Var, we4 we4Var, cf4 cf4Var, IOException iOException, boolean z11) {
        vm0 vm0Var = this.f24694A;
        if (vm0Var != null) {
            if (this.f24707u.f19710l) {
                vm0Var.mo26644c("onLoadException", iOException);
            } else {
                vm0Var.mo26646g("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: x */
    public final void mo21344x(qj2 qj2Var, wo2 wo2Var, boolean z11) {
        if (qj2Var instanceof n63) {
            synchronized (this.f24700G) {
                this.f24701H.add((n63) qj2Var);
            }
        } else if (qj2Var instanceof yp0) {
            this.f24702I = (yp0) qj2Var;
            final fn0 fn0Var = (fn0) this.f24708v.get();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && fn0Var != null && this.f24702I.m28288r()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f24702I.m28290t()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f24702I.m28289s()));
                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.iq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fn0 fn0Var2 = fn0.this;
                        Map map = hashMap;
                        int i11 = mq0.f24693K;
                        fn0Var2.mo23552V("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: y */
    public final void mo21315y(s44 s44Var, int i11) {
        vm0 vm0Var = this.f24694A;
        if (vm0Var != null) {
            vm0Var.mo26643b(i11);
        }
    }
}
