package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xq2 implements qj2 {

    /* renamed from: a */
    private final Context f30577a;

    /* renamed from: b */
    private final List f30578b = new ArrayList();

    /* renamed from: c */
    private final qj2 f30579c;

    /* renamed from: d */
    private qj2 f30580d;

    /* renamed from: e */
    private qj2 f30581e;

    /* renamed from: f */
    private qj2 f30582f;

    /* renamed from: g */
    private qj2 f30583g;

    /* renamed from: h */
    private qj2 f30584h;

    /* renamed from: i */
    private qj2 f30585i;

    /* renamed from: j */
    private qj2 f30586j;

    /* renamed from: k */
    private qj2 f30587k;

    public xq2(Context context, qj2 qj2Var) {
        this.f30577a = context.getApplicationContext();
        this.f30579c = qj2Var;
    }

    /* renamed from: k */
    private final qj2 m27975k() {
        if (this.f30581e == null) {
            jc2 jc2Var = new jc2(this.f30577a);
            this.f30581e = jc2Var;
            m27976l(jc2Var);
        }
        return this.f30581e;
    }

    /* renamed from: l */
    private final void m27976l(qj2 qj2Var) {
        for (int i11 = 0; i11 < this.f30578b.size(); i11++) {
            qj2Var.mo20854g((dc3) this.f30578b.get(i11));
        }
    }

    /* renamed from: m */
    private static final void m27977m(qj2 qj2Var, dc3 dc3Var) {
        if (qj2Var != null) {
            qj2Var.mo20854g(dc3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        qj2 qj2Var = this.f30587k;
        qj2Var.getClass();
        return qj2Var.mo19942a(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        boolean z11;
        qj2 qj2Var;
        if (this.f30587k == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        String scheme = wo2Var.f30043a.getScheme();
        if (g92.m22365w(wo2Var.f30043a)) {
            String path = wo2Var.f30043a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f30587k = m27975k();
            } else {
                if (this.f30580d == null) {
                    a03 a03Var = new a03();
                    this.f30580d = a03Var;
                    m27976l(a03Var);
                }
                this.f30587k = this.f30580d;
            }
        } else if ("asset".equals(scheme)) {
            this.f30587k = m27975k();
        } else if ("content".equals(scheme)) {
            if (this.f30582f == null) {
                mg2 mg2Var = new mg2(this.f30577a);
                this.f30582f = mg2Var;
                m27976l(mg2Var);
            }
            this.f30587k = this.f30582f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f30583g == null) {
                try {
                    qj2 qj2Var2 = (qj2) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f30583g = qj2Var2;
                    m27976l(qj2Var2);
                } catch (ClassNotFoundException unused) {
                    lr1.m24356e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating RTMP extension", e11);
                }
                if (this.f30583g == null) {
                    this.f30583g = this.f30579c;
                }
            }
            this.f30587k = this.f30583g;
        } else if ("udp".equals(scheme)) {
            if (this.f30584h == null) {
                ee3 ee3Var = new ee3(ZAbstractBase.ZVU_PROCESS_FLUSH);
                this.f30584h = ee3Var;
                m27976l(ee3Var);
            }
            this.f30587k = this.f30584h;
        } else if ("data".equals(scheme)) {
            if (this.f30585i == null) {
                nh2 nh2Var = new nh2();
                this.f30585i = nh2Var;
                m27976l(nh2Var);
            }
            this.f30587k = this.f30585i;
        } else {
            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                qj2Var = this.f30579c;
            } else {
                if (this.f30586j == null) {
                    o93 o93Var = new o93(this.f30577a);
                    this.f30586j = o93Var;
                    m27976l(o93Var);
                }
                qj2Var = this.f30586j;
            }
            this.f30587k = qj2Var;
        }
        return this.f30587k.mo19943d(wo2Var);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: g */
    public final void mo20854g(dc3 dc3Var) {
        dc3Var.getClass();
        this.f30579c.mo20854g(dc3Var);
        this.f30578b.add(dc3Var);
        m27977m(this.f30580d, dc3Var);
        m27977m(this.f30581e, dc3Var);
        m27977m(this.f30582f, dc3Var);
        m27977m(this.f30583g, dc3Var);
        m27977m(this.f30584h, dc3Var);
        m27977m(this.f30585i, dc3Var);
        m27977m(this.f30586j, dc3Var);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        qj2 qj2Var = this.f30587k;
        if (qj2Var == null) {
            return null;
        }
        return qj2Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        qj2 qj2Var = this.f30587k;
        if (qj2Var != null) {
            try {
                qj2Var.zzd();
            } finally {
                this.f30587k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        qj2 qj2Var = this.f30587k;
        if (qj2Var == null) {
            return Collections.emptyMap();
        }
        return qj2Var.zze();
    }
}
