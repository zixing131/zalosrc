package wo0;

import com.zing.zalocore.CoreUtility;
import gp0.C19577z;
import java.util.HashMap;
import lo0.C22592c;
import p097db.EnumC17859r;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import ro0.C25942f;
import so0.C26350a;
import to0.InterfaceC26860e;
import to0.InterfaceC26861f;
import vg.C28203u6;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32318n3;
import zm.voip.service.C32328p3;

/* renamed from: wo0.x0 */
/* loaded from: classes7.dex */
public class C29179x0 extends AbstractC19962a implements InterfaceC26860e {

    /* renamed from: t */
    private final C19577z f135174t;

    /* renamed from: u */
    private final AbstractC32273e3 f135175u;

    /* renamed from: v */
    private final C32318n3 f135176v;

    /* renamed from: w */
    private final C22592c f135177w;

    /* renamed from: x */
    private int f135178x;

    /* renamed from: y */
    private int f135179y;

    public C29179x0(InterfaceC26861f interfaceC26861f, C19577z c19577z, AbstractC32273e3 abstractC32273e3, C32328p3 c32328p3, C32318n3 c32318n3) {
        super(interfaceC26861f);
        this.f135179y = -1;
        this.f135174t = c19577z;
        this.f135175u = abstractC32273e3;
        this.f135176v = c32318n3;
        this.f135177w = c32328p3.m156362c();
    }

    /* renamed from: L4 */
    private void m145679L4(String str, int i11) {
        if (this.f135177w.m116850H()) {
            this.f135175u.mo155785B2(str, i11);
        }
    }

    /* renamed from: Np */
    private int m145681Np() {
        C25942f c25942f;
        int i11 = -1;
        if (this.f135177w.m116923x() != -1) {
            c25942f = (C25942f) this.f135174t.m102392S().get(Integer.valueOf(this.f135177w.m116923x()));
        } else {
            c25942f = null;
        }
        if (c25942f != null && c25942f.m133659i() != 4) {
            return c25942f.m133661k();
        }
        for (C25942f c25942f2 : C19577z.m102341J().m102407a0()) {
            int m133661k = c25942f2.m133661k();
            if (c25942f2.m133659i() == 3) {
                return m133661k;
            }
            i11 = m133661k;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Op */
    public /* synthetic */ void m145682Op(Integer num) {
        HashMap m102392S = this.f135174t.m102392S();
        C25942f c25942f = (C25942f) m102392S.get(Integer.valueOf(this.f135178x));
        if (c25942f != null && c25942f.m133659i() == 3) {
            if (this.f135178x == num.intValue()) {
                ((InterfaceC26861f) m103742Dp()).mo138244qr(c25942f);
                ((InterfaceC26861f) m103742Dp()).mo138243qj(c25942f);
                return;
            }
            return;
        }
        int m145681Np = m145681Np();
        this.f135178x = m145681Np;
        if (m145681Np == -1) {
            return;
        }
        C25942f c25942f2 = (C25942f) m102392S.get(Integer.valueOf(m145681Np));
        ((InterfaceC26861f) m103742Dp()).mo138244qr(c25942f2);
        ((InterfaceC26861f) m103742Dp()).mo138243qj(c25942f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pp */
    public /* synthetic */ void m145683Pp(C25942f c25942f) {
        ((InterfaceC26861f) m103742Dp()).mo138244qr(c25942f);
        ((InterfaceC26861f) m103742Dp()).mo138243qj(c25942f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qp */
    public /* synthetic */ void m145684Qp(int i11, int i12) {
        if (i11 == this.f135178x) {
            InterfaceC26861f interfaceC26861f = (InterfaceC26861f) m103742Dp();
            boolean z11 = true;
            if (i12 != 1) {
                z11 = false;
            }
            interfaceC26861f.mo138241Um(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rp */
    public /* synthetic */ void m145685Rp(int i11) {
        if ((i11 == EnumC17859r.START_CAPTURE.ordinal() || i11 == EnumC17859r.STOP_CAPTURE.ordinal()) && this.f135177w.m116854J()) {
            ((InterfaceC26861f) m103742Dp()).mo138239JB(this.f135177w.m116850H());
        }
    }

    @Override // to0.InterfaceC26860e
    /* renamed from: A0 */
    public void mo138232A0(final int i11) {
        ((InterfaceC26861f) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.u0
            @Override // java.lang.Runnable
            public final void run() {
                C29179x0.this.m145685Rp(i11);
            }
        });
    }

    @Override // to0.InterfaceC26860e
    /* renamed from: Ck */
    public void mo138233Ck(final int i11, final int i12) {
        ((InterfaceC26861f) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.w0
            @Override // java.lang.Runnable
            public final void run() {
                C29179x0.this.m145684Qp(i11, i12);
            }
        });
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Sp, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C26350a c26350a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c26350a, interfaceC19968g);
        this.f135176v.m156254M(false);
    }

    @Override // to0.InterfaceC26860e
    /* renamed from: b3 */
    public void mo138234b3() {
        HashMap m102392S = this.f135174t.m102392S();
        int m145681Np = m145681Np();
        this.f135178x = m145681Np;
        C25942f c25942f = (C25942f) m102392S.get(Integer.valueOf(m145681Np));
        if (this.f135178x != -1 && c25942f != null) {
            if (this.f135175u.mo155855W().f123737b) {
                m145679L4("onResume", 8);
            }
            boolean m116850H = this.f135177w.m116850H();
            ((InterfaceC26861f) m103742Dp()).mo138242hi(c25942f, m116850H);
            ((InterfaceC26861f) m103742Dp()).mo138243qj(c25942f);
            ((InterfaceC26861f) m103742Dp()).mo138238Hd(C28203u6.f131407a.m141809c(CoreUtility.f89233i));
            ((InterfaceC26861f) m103742Dp()).mo138239JB(m116850H);
            ((InterfaceC26861f) m103742Dp()).mo138240Ov(!this.f135177w.m116848G());
        }
    }

    @Override // to0.InterfaceC26860e
    /* renamed from: q9 */
    public void mo138235q9(Object obj, boolean z11, int i11) {
        int i12 = this.f135179y;
        if (i12 != -1) {
            this.f135175u.mo155883g2(null, z11, i12);
        }
        this.f135179y = i11;
        this.f135175u.mo155883g2(obj, z11, i11);
    }

    @Override // to0.InterfaceC26860e
    /* renamed from: u2 */
    public void mo138236u2(final Integer num) {
        ((InterfaceC26861f) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.v0
            @Override // java.lang.Runnable
            public final void run() {
                C29179x0.this.m145682Op(num);
            }
        });
    }

    @Override // to0.InterfaceC26860e
    /* renamed from: yn */
    public void mo138237yn(C25942f c25942f, int i11) {
        if (c25942f.m133661k() == this.f135178x) {
            this.f135178x = m145681Np();
            final C25942f c25942f2 = (C25942f) this.f135174t.m102392S().get(Integer.valueOf(this.f135178x));
            if (this.f135178x != -1 && c25942f2 != null) {
                ((InterfaceC26861f) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29179x0.this.m145683Pp(c25942f2);
                    }
                });
            }
        }
    }
}
