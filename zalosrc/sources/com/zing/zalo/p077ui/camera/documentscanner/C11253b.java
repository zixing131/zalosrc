package com.zing.zalo.p077ui.camera.documentscanner;

import android.graphics.Bitmap;
import b00.C2480c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h00.C19695a;
import h00.InterfaceC19696b;
import j00.InterfaceC20898a;
import k00.AbstractC21426c;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import mm0.AbstractC23350e;
import p169fu.AbstractC19146a;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p236ic.AbstractC20504a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import t50.C26490b;
import t50.InterfaceC26489a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.camera.documentscanner.b */
/* loaded from: classes5.dex */
public final class C11253b extends AbstractC19962a implements InterfaceC11252a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f56587A;

    /* renamed from: B */
    private Job f56588B;

    /* renamed from: C */
    private Job f56589C;

    /* renamed from: D */
    private boolean f56590D;

    /* renamed from: E */
    private boolean f56591E;

    /* renamed from: F */
    private boolean f56592F;

    /* renamed from: t */
    private final InterfaceC19696b f56593t;

    /* renamed from: u */
    private final InterfaceC20898a f56594u;

    /* renamed from: v */
    private DocumentScanView.InterfaceC11249b f56595v;

    /* renamed from: w */
    private Bitmap f56596w;

    /* renamed from: x */
    private String f56597x;

    /* renamed from: y */
    private C2480c f56598y;

    /* renamed from: z */
    private Bitmap f56599z;

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.b$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56600t;

        /* renamed from: v */
        final /* synthetic */ C2480c f56602v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2480c c2480c, Continuation continuation) {
            super(2, continuation);
            this.f56602v = c2480c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f56602v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56600t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20898a interfaceC20898a = C11253b.this.f56594u;
                Bitmap m59060Op = C11253b.this.m59060Op();
                AbstractC19074t.m100205c(m59060Op);
                C2480c c2480c = this.f56602v;
                this.f56600t = 1;
                obj = interfaceC20898a.mo109335a(m59060Op, c2480c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Bitmap bitmap = (Bitmap) obj;
            if (AbstractC21426c.m110930a(bitmap)) {
                C2480c c2480c2 = this.f56602v;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Transform success: ");
                sb2.append(c2480c2);
                C11253b.this.m59062dq(bitmap);
                C11253b c11253b = C11253b.this;
                AbstractC19074t.m100205c(bitmap);
                c11253b.m59057cq(bitmap, false);
            } else {
                ((InterfaceC26489a) C11253b.this.m103742Dp()).mo59032jx(AbstractC8020f0.str_document_scanner_invalid_bound);
                C11253b.this.m59062dq(null);
            }
            C11253b.this.m59063eq(0);
            ((InterfaceC26489a) C11253b.this.m103742Dp()).mo59027c4();
            ((InterfaceC26489a) C11253b.this.m103742Dp()).mo59020P9();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.camera.documentscanner.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56603t;

        /* renamed from: v */
        final /* synthetic */ C19695a f56605v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C19695a c19695a, Continuation continuation) {
            super(2, continuation);
            this.f56605v = c19695a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f56605v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56603t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ((InterfaceC26489a) C11253b.this.m103742Dp()).mo59019Jb();
                ((InterfaceC26489a) C11253b.this.m103742Dp()).mo59023Y();
                InterfaceC19696b interfaceC19696b = C11253b.this.f56593t;
                C19695a c19695a = this.f56605v;
                this.f56603t = 1;
                obj = interfaceC19696b.mo103343a(c19695a, true, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C2480c c2480c = (C2480c) obj;
            if (c2480c != null) {
                C11253b.this.m59052Xp(c2480c, this.f56605v);
            } else {
                C11253b.this.m59051Wp();
            }
            C11253b.this.m59063eq(0);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11253b(InterfaceC26489a interfaceC26489a, InterfaceC19696b interfaceC19696b, InterfaceC20898a interfaceC20898a) {
        super(interfaceC26489a);
        AbstractC19074t.m100208f(interfaceC26489a, "mvpView");
        AbstractC19074t.m100208f(interfaceC19696b, "documentBoundDetector");
        AbstractC19074t.m100208f(interfaceC20898a, "imageTransformer");
        this.f56593t = interfaceC19696b;
        this.f56594u = interfaceC20898a;
        this.f56597x = "";
    }

    /* renamed from: Pp */
    private final boolean m59047Pp() {
        return this.f56587A == 1;
    }

    /* renamed from: Qp */
    private final boolean m59048Qp() {
        return this.f56591E || this.f56590D;
    }

    /* renamed from: Rp */
    private final boolean m59049Rp() {
        return this.f56587A != 0;
    }

    /* renamed from: Sp */
    private final boolean m59050Sp(C26490b c26490b) {
        return AbstractC21426c.m110930a(c26490b.m136455c());
    }

    /* renamed from: Wp */
    public final void m59051Wp() {
        ((InterfaceC26489a) m103742Dp()).mo59027c4();
        ((InterfaceC26489a) m103742Dp()).mo59020P9();
        DocumentScanView.InterfaceC11249b interfaceC11249b = this.f56595v;
        if (interfaceC11249b != null) {
            interfaceC11249b.mo38383b();
        }
    }

    /* renamed from: Xp */
    public final void m59052Xp(C2480c c2480c, C19695a c19695a) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDetectSuccess(");
        sb2.append(c19695a);
        sb2.append(")");
        if (!AbstractC19074t.m100204b(c19695a.m103341b(), this.f56597x)) {
            return;
        }
        c2480c.m12530n();
        this.f56598y = c2480c.clone();
        ((InterfaceC26489a) m103742Dp()).mo59027c4();
        ((InterfaceC26489a) m103742Dp()).mo59020P9();
        InterfaceC26489a interfaceC26489a = (InterfaceC26489a) m103742Dp();
        Bitmap bitmap = this.f56596w;
        AbstractC19074t.m100205c(bitmap);
        interfaceC26489a.mo59022VH(c2480c, bitmap);
    }

    /* renamed from: Yp */
    private final void m59053Yp(C26490b c26490b) {
        C2480c c2480c = this.f56598y;
        Bitmap bitmap = this.f56596w;
        String str = this.f56597x;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onSetViewArgs(");
        sb2.append(c26490b);
        sb2.append("). Prev scan: (Bound=");
        sb2.append(c2480c);
        sb2.append(", bitmap=");
        sb2.append(bitmap);
        sb2.append(", key: ");
        sb2.append(str);
        sb2.append(")");
        String m136454b = c26490b.m136454b();
        if (this.f56598y != null && this.f56596w != null && AbstractC19074t.m100204b(m136454b, this.f56597x)) {
            InterfaceC26489a interfaceC26489a = (InterfaceC26489a) m103742Dp();
            C2480c c2480c2 = this.f56598y;
            AbstractC19074t.m100205c(c2480c2);
            C2480c clone = c2480c2.clone();
            AbstractC19074t.m100207e(clone, "clone(...)");
            Bitmap bitmap2 = this.f56596w;
            AbstractC19074t.m100205c(bitmap2);
            interfaceC26489a.mo59022VH(clone, bitmap2);
            return;
        }
        this.f56598y = null;
        this.f56599z = null;
        if (!m59050Sp(c26490b)) {
            AbstractC23350e.m122774d("DocumentScanner", "Cannot detect an invalid bitmap");
            m59055aq();
            return;
        }
        this.f56596w = c26490b.m136455c();
        this.f56597x = m136454b;
        int width = c26490b.m136455c().getWidth();
        int height = c26490b.m136455c().getHeight();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Original Bitmap size: ");
        sb3.append(width);
        sb3.append(" x ");
        sb3.append(height);
        ((InterfaceC26489a) m103742Dp()).mo59018Bc(c26490b.m136455c());
        m59058fq(C19695a.Companion.m103342a(c26490b.m136455c(), m136454b));
    }

    /* renamed from: Zp */
    private final void m59054Zp(String str) {
        DocumentScanView.InterfaceC11249b interfaceC11249b = this.f56595v;
        if (interfaceC11249b != null) {
            interfaceC11249b.mo38385j(str);
        }
    }

    /* renamed from: aq */
    private final void m59055aq() {
        DocumentScanView.InterfaceC11249b interfaceC11249b = this.f56595v;
        if (interfaceC11249b != null) {
            interfaceC11249b.mo38384c();
        }
    }

    /* renamed from: bq */
    private final void m59056bq() {
        this.f56590D = false;
        this.f56591E = false;
        this.f56592F = false;
    }

    /* renamed from: cq */
    public final void m59057cq(Bitmap bitmap, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("returnScanResult(");
        sb2.append(z11);
        sb2.append(")");
        DocumentScanView.InterfaceC11249b interfaceC11249b = this.f56595v;
        if (interfaceC11249b != null) {
            interfaceC11249b.mo38382a(bitmap, z11);
        }
        ((InterfaceC26489a) m103742Dp()).mo59021Qn();
    }

    /* renamed from: fq */
    private final void m59058fq(C19695a c19695a) {
        Job m112540d;
        if (m59049Rp()) {
            int i11 = this.f56587A;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scanner is busy with state ");
            sb2.append(i11);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("startDocumentDetector(");
        sb3.append(c19695a);
        sb3.append("): Use shuffle = true");
        this.f56587A = 1;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new c(c19695a, null), 3, null);
        this.f56588B = m112540d;
    }

    /* renamed from: gq */
    private final void m59059gq() {
        if (m59048Qp() && this.f56592F) {
            m59054Zp("121N098");
            return;
        }
        if (m59048Qp()) {
            m59054Zp("121N096");
        } else if (this.f56592F) {
            m59054Zp("121N097");
        } else {
            m59054Zp("121N095");
        }
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: Db */
    public void mo59034Db() {
        if (m59049Rp()) {
            this.f56597x = "";
            this.f56596w = null;
            this.f56587A = 0;
            Job job = this.f56588B;
            if (job != null) {
                Job.DefaultImpls.m112740a(job, null, 1, null);
            }
            this.f56588B = null;
            Job job2 = this.f56589C;
            if (job2 != null) {
                Job.DefaultImpls.m112740a(job2, null, 1, null);
            }
            this.f56589C = null;
        }
        m59055aq();
        ((InterfaceC26489a) m103742Dp()).mo59021Qn();
        m59054Zp("121N099");
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: F9 */
    public void mo59035F9(C2480c c2480c) {
        Job m112540d;
        AbstractC19074t.m100208f(c2480c, "bound");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDoneBtnClick(");
        sb2.append(c2480c);
        sb2.append(")");
        if (!((InterfaceC26489a) m103742Dp()).mo59030h0()) {
            return;
        }
        if (m59049Rp()) {
            int i11 = this.f56587A;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Scanner is busy with state ");
            sb3.append(i11);
            return;
        }
        if (!c2480c.m12526i()) {
            ((InterfaceC26489a) m103742Dp()).mo59032jx(AbstractC8020f0.str_document_scanner_invalid_bound);
            return;
        }
        Bitmap bitmap = this.f56599z;
        if (bitmap != null && AbstractC19074t.m100204b(c2480c, this.f56598y)) {
            m59057cq(bitmap, true);
            return;
        }
        ((InterfaceC26489a) m103742Dp()).mo59019Jb();
        ((InterfaceC26489a) m103742Dp()).mo59023Y();
        this.f56598y = c2480c.clone();
        this.f56587A = 2;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new b(c2480c, null), 3, null);
        this.f56589C = m112540d;
        m59059gq();
        m59056bq();
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: Mf */
    public void mo59036Mf(DocumentScanView.InterfaceC11249b interfaceC11249b) {
        this.f56595v = interfaceC11249b;
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: N9 */
    public void mo59037N9(C2480c c2480c) {
        AbstractC19074t.m100208f(c2480c, "bound");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onLeftRotateBtnClick(");
        sb2.append(c2480c);
        sb2.append(")");
        if (m59049Rp()) {
            return;
        }
        Bitmap bitmap = this.f56596w;
        if (bitmap != null) {
            Bitmap m100467f = AbstractC19146a.m100467f(bitmap, bitmap.getWidth(), bitmap.getHeight(), -90);
            int width = m100467f.getWidth();
            int height = m100467f.getHeight();
            InterfaceC26489a interfaceC26489a = (InterfaceC26489a) m103742Dp();
            AbstractC19074t.m100205c(m100467f);
            interfaceC26489a.mo59018Bc(m100467f);
            C2480c m12534r = c2480c.m12534r((-r1) / 2.0f, (-r2) / 2.0f).m12528l(((-90) * 3.141592653589793d) / 180).m12534r(width / 2.0f, height / 2.0f);
            AbstractC19074t.m100207e(m12534r, "transformCopy(...)");
            m12534r.m12527k(-90);
            this.f56598y = m12534r.clone();
            this.f56599z = null;
            ((InterfaceC26489a) m103742Dp()).mo59022VH(m12534r, m100467f);
            this.f56596w = m100467f;
        }
        if (!this.f56592F) {
            this.f56592F = true;
            m59054Zp("121N094");
        }
    }

    /* renamed from: Op */
    public final Bitmap m59060Op() {
        return this.f56596w;
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Tp */
    public void mo995Nd(C26490b c26490b, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c26490b, interfaceC19968g);
        if (c26490b != null) {
            m59053Yp(c26490b);
            m59054Zp("121N090");
            return;
        }
        throw new IllegalArgumentException("DocumentScanViewArgs must not be null.".toString());
    }

    /* renamed from: dq */
    public final void m59062dq(Bitmap bitmap) {
        this.f56599z = bitmap;
    }

    /* renamed from: eq */
    public final void m59063eq(int i11) {
        this.f56587A = i11;
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: l8 */
    public void mo59038l8(int i11, C2480c c2480c) {
        Bitmap bitmap;
        AbstractC19074t.m100208f(c2480c, "bound");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onConfigurationChanged(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(c2480c);
        sb2.append(")");
        if (!m59047Pp() && (bitmap = this.f56596w) != null) {
            c2480c.m12530n();
            ((InterfaceC26489a) m103742Dp()).mo59022VH(c2480c, bitmap);
        }
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: lo */
    public void mo59039lo() {
        if (!this.f56591E) {
            this.f56591E = true;
            m59054Zp("121N093");
        }
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: nf */
    public void mo59040nf() {
        if (!this.f56590D) {
            m59054Zp("121N092");
            this.f56590D = true;
        }
    }

    @Override // com.zing.zalo.p077ui.camera.documentscanner.InterfaceC11252a
    /* renamed from: uc */
    public void mo59041uc() {
        if (!this.f56591E) {
            this.f56591E = true;
            m59054Zp("121N093");
        }
    }
}
