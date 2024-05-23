package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.C4208p;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p229i5.AbstractC20281b;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22878e;
import p704z4.C31218b;
import s00.AbstractC26080o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* loaded from: classes2.dex */
public final class C4137u0 implements InterfaceC22878e {

    /* renamed from: a */
    private final C4083c f16450a;

    /* renamed from: b */
    private final int f16451b;

    /* renamed from: c */
    private final C31218b f16452c;

    /* renamed from: d */
    private final long f16453d;

    /* renamed from: e */
    private final long f16454e;

    C4137u0(C4083c c4083c, int i11, C31218b c31218b, long j11, long j12, String str, String str2) {
        this.f16450a = c4083c;
        this.f16451b = i11;
        this.f16452c = c31218b;
        this.f16453d = j11;
        this.f16454e = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4137u0 m19556b(C4083c c4083c, int i11, C31218b c31218b) {
        boolean z11;
        long j11;
        long j12;
        if (!c4083c.m19382g()) {
            return null;
        }
        RootTelemetryConfiguration m19740a = C4208p.m19739b().m19740a();
        if (m19740a != null) {
            if (!m19740a.m19619J()) {
                return null;
            }
            z11 = m19740a.m19620K();
            C4123p0 m19385x = c4083c.m19385x(c31218b);
            if (m19385x != null) {
                if (!(m19385x.m19541r() instanceof AbstractC4172d)) {
                    return null;
                }
                AbstractC4172d abstractC4172d = (AbstractC4172d) m19385x.m19541r();
                if (abstractC4172d.hasConnectionInfo() && !abstractC4172d.isConnecting()) {
                    ConnectionTelemetryConfiguration m19557c = m19557c(m19385x, abstractC4172d, i11);
                    if (m19557c == null) {
                        return null;
                    }
                    m19385x.m19531C();
                    z11 = m19557c.m19614M();
                }
            }
        } else {
            z11 = true;
        }
        if (z11) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        if (z11) {
            j12 = SystemClock.elapsedRealtime();
        } else {
            j12 = 0;
        }
        return new C4137u0(c4083c, i11, c31218b, j11, j12, null, null);
    }

    /* renamed from: c */
    private static ConnectionTelemetryConfiguration m19557c(C4123p0 c4123p0, AbstractC4172d abstractC4172d, int i11) {
        int[] m19611F;
        int[] m19612J;
        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC4172d.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m19613K() || ((m19611F = telemetryConfiguration.m19611F()) != null ? !AbstractC20281b.m105899a(m19611F, i11) : !((m19612J = telemetryConfiguration.m19612J()) == null || !AbstractC20281b.m105899a(m19612J, i11))) || c4123p0.m19540p() >= telemetryConfiguration.m19616t()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // p342m6.InterfaceC22878e
    /* renamed from: a */
    public final void mo16804a(AbstractC22888j abstractC22888j) {
        C4123p0 m19385x;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int m19188t;
        int i15;
        long j11;
        long j12;
        int i16;
        if (!this.f16450a.m19382g()) {
            return;
        }
        RootTelemetryConfiguration m19740a = C4208p.m19739b().m19740a();
        if ((m19740a == null || m19740a.m19619J()) && (m19385x = this.f16450a.m19385x(this.f16452c)) != null && (m19385x.m19541r() instanceof AbstractC4172d)) {
            AbstractC4172d abstractC4172d = (AbstractC4172d) m19385x.m19541r();
            boolean z12 = true;
            if (this.f16453d > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int gCoreServiceId = abstractC4172d.getGCoreServiceId();
            if (m19740a != null) {
                z11 &= m19740a.m19620K();
                int m19622t = m19740a.m19622t();
                int m19618F = m19740a.m19618F();
                i11 = m19740a.m19621M();
                if (abstractC4172d.hasConnectionInfo() && !abstractC4172d.isConnecting()) {
                    ConnectionTelemetryConfiguration m19557c = m19557c(m19385x, abstractC4172d, this.f16451b);
                    if (m19557c == null) {
                        return;
                    }
                    if (!m19557c.m19614M() || this.f16453d <= 0) {
                        z12 = false;
                    }
                    m19618F = m19557c.m19616t();
                    z11 = z12;
                }
                i12 = m19622t;
                i13 = m19618F;
            } else {
                i11 = 0;
                i12 = AbstractC26080o.a.f124275b;
                i13 = 100;
            }
            C4083c c4083c = this.f16450a;
            if (abstractC22888j.mo117588q()) {
                i14 = 0;
                i15 = 0;
            } else {
                if (abstractC22888j.mo117586o()) {
                    i14 = 100;
                } else {
                    Exception mo117583l = abstractC22888j.mo117583l();
                    if (mo117583l instanceof ApiException) {
                        Status m19215a = ((ApiException) mo117583l).m19215a();
                        int m19220F = m19215a.m19220F();
                        ConnectionResult m19225t = m19215a.m19225t();
                        if (m19225t == null) {
                            m19188t = -1;
                        } else {
                            m19188t = m19225t.m19188t();
                        }
                        i15 = m19188t;
                        i14 = m19220F;
                    } else {
                        i14 = 101;
                    }
                }
                i15 = -1;
            }
            if (z11) {
                long j13 = this.f16453d;
                j12 = System.currentTimeMillis();
                j11 = j13;
                i16 = (int) (SystemClock.elapsedRealtime() - this.f16454e);
            } else {
                j11 = 0;
                j12 = 0;
                i16 = -1;
            }
            c4083c.m19376I(new MethodInvocation(this.f16451b, i14, i15, j11, j12, null, null, gCoreServiceId, i16), i11, i12, i13);
        }
    }
}
