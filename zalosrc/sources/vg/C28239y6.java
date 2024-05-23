package vg;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.zing.zalo.MainApplication;
import p093d6.AbstractC17762d;
import p093d6.AbstractC17764e;
import p093d6.C17758b;
import p247ix.AbstractC20879d;

/* renamed from: vg.y6 */
/* loaded from: classes3.dex */
public class C28239y6 extends AbstractC28248z6 {

    /* renamed from: A */
    AbstractC17762d f131661A = new a();

    /* renamed from: v */
    LocationRequest f131662v;

    /* renamed from: w */
    AbstractC4073c f131663w;

    /* renamed from: x */
    AbstractC4073c.b f131664x;

    /* renamed from: y */
    AbstractC4073c.c f131665y;

    /* renamed from: z */
    C17758b f131666z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.y6$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC17762d {
        a() {
        }

        @Override // p093d6.AbstractC17762d
        /* renamed from: b */
        public void mo93910b(LocationResult locationResult) {
            super.mo93910b(locationResult);
            if (locationResult == null) {
                return;
            }
            try {
                C28239y6.this.f131707u.mo40758a(locationResult.m30613t(), 3);
                C28239y6 c28239y6 = C28239y6.this;
                if (c28239y6.f131692f) {
                    if (c28239y6.f131700n) {
                        AbstractC20879d.m109125w(c28239y6.f131703q, 3, c28239y6.f131701o);
                    } else {
                        AbstractC20879d.m109126x(3, c28239y6.f131701o);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.y6$b */
    /* loaded from: classes3.dex */
    class b implements AbstractC4073c.b {
        b() {
        }

        @Override // p704z4.InterfaceC31220c
        /* renamed from: E */
        public void mo19480E(Bundle bundle) {
            try {
                C28239y6 c28239y6 = C28239y6.this;
                if (c28239y6.f131700n) {
                    c28239y6.f131666z = AbstractC17764e.m93911a(MainApplication.getAppContext());
                    C28239y6 c28239y62 = C28239y6.this;
                    c28239y62.f131666z.m93907x(c28239y62.f131662v, c28239y62.f131661A, null);
                } else {
                    Location mo93904a = AbstractC17764e.f89939b.mo93904a(c28239y6.f131663w);
                    if (mo93904a != null && System.currentTimeMillis() - mo93904a.getTime() < 60000) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Last known loc by google service:");
                        sb2.append(AbstractC28248z6.m142221g(mo93904a));
                        C28239y6.this.f131707u.mo40758a(mo93904a, 3);
                    } else {
                        C28239y6.this.f131666z = AbstractC17764e.m93911a(MainApplication.getAppContext());
                        C28239y6 c28239y63 = C28239y6.this;
                        c28239y63.f131666z.m93907x(c28239y63.f131662v, c28239y63.f131661A, null);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p704z4.InterfaceC31220c
        /* renamed from: N */
        public void mo19482N(int i11) {
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m142207o(ConnectionResult connectionResult) {
    }

    @Override // vg.AbstractC28248z6
    /* renamed from: c */
    protected void mo142208c() {
        try {
            if (this.f131662v == null) {
                this.f131662v = m142210n();
            }
            if (this.f131664x == null) {
                this.f131664x = new b();
            }
            if (this.f131665y == null) {
                this.f131665y = new AbstractC4073c.c() { // from class: vg.x6
                    @Override // p704z4.InterfaceC31228g
                    /* renamed from: Q */
                    public final void mo19443Q(ConnectionResult connectionResult) {
                        C28239y6.m142207o(connectionResult);
                    }
                };
            }
            if (this.f131663w == null) {
                this.f131663w = new AbstractC4073c.a(MainApplication.getAppContext()).m19267a(AbstractC17764e.f89938a).m19268b(this.f131664x).m19269c(this.f131665y).m19270d();
            }
            this.f131663w.mo19256d();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // vg.AbstractC28248z6
    /* renamed from: d */
    protected void mo142209d() {
        try {
            C17758b c17758b = this.f131666z;
            if (c17758b != null) {
                c17758b.m93906w(this.f131661A);
            }
            AbstractC4073c abstractC4073c = this.f131663w;
            if (abstractC4073c != null) {
                abstractC4073c.mo19257e();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    protected LocationRequest m142210n() {
        LocationRequest m30604t = LocationRequest.m30604t();
        m30604t.m30609Q(100);
        m30604t.m30607K(this.f131696j);
        long j11 = this.f131698l;
        if (j11 > 0) {
            m30604t.m30606J(j11);
        }
        long j12 = this.f131699m;
        if (j12 > 0) {
            m30604t.m30608M(j12);
        }
        float f11 = this.f131697k;
        if (f11 > 0.0f) {
            m30604t.m30610Z(f11);
        }
        return m30604t;
    }
}
