package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import bd0.C2770a;
import c30.C3255n;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.widget.C13700o2;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C17949b1;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p471r3.C25630b;
import p588vw.C28644j;
import vg.AbstractC28236y3;
import vg.C28020b3;

/* renamed from: com.zing.zalo.ui.chat.chatrow.m2 */
/* loaded from: classes5.dex */
public class C11501m2 extends AbstractC11473f2 {

    /* renamed from: W */
    public static boolean f59309W = false;

    /* renamed from: X */
    private static final float f59310X;

    /* renamed from: Y */
    private static final float[] f59311Y;

    /* renamed from: Z */
    private static final int f59312Z;

    /* renamed from: a0 */
    private static final int f59313a0;

    /* renamed from: b0 */
    private static final int f59314b0;

    /* renamed from: c0 */
    private static Paint f59315c0;

    /* renamed from: d0 */
    private static C13704p1 f59316d0;

    /* renamed from: e0 */
    private static Paint f59317e0;

    /* renamed from: C */
    private C25630b f59318C;

    /* renamed from: D */
    private final C13700o2 f59319D;

    /* renamed from: E */
    private final C3977j f59320E;

    /* renamed from: F */
    private final C23528a f59321F;

    /* renamed from: I */
    private final String f59324I;

    /* renamed from: J */
    private final int f59325J;

    /* renamed from: K */
    private final int f59326K;

    /* renamed from: O */
    private int f59330O;

    /* renamed from: P */
    private int f59331P;

    /* renamed from: Q */
    private final String f59332Q;

    /* renamed from: R */
    private final int f59333R;

    /* renamed from: S */
    private final int f59334S;

    /* renamed from: T */
    private InterfaceC11505n2 f59335T;

    /* renamed from: U */
    private final boolean f59336U;

    /* renamed from: G */
    private final Path f59322G = new Path();

    /* renamed from: H */
    private final RectF f59323H = new RectF();

    /* renamed from: L */
    private final RectF f59327L = new RectF();

    /* renamed from: M */
    private final RectF f59328M = new RectF();

    /* renamed from: N */
    private final Path f59329N = new Path();

    /* renamed from: V */
    private String f59337V = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.m2$a */
    /* loaded from: classes5.dex */
    public class a extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f59338a;

        /* renamed from: b */
        final /* synthetic */ String f59339b;

        /* renamed from: c */
        final /* synthetic */ boolean f59340c;

        a(C17945a0 c17945a0, String str, boolean z11) {
            this.f59338a = c17945a0;
            this.f59339b = str;
            this.f59340c = z11;
        }

        @Override // vg.C28020b3.b
        /* renamed from: a */
        public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                C28020b3.f130648a.m141189R(c23995f);
                if (c23995f.m125657h() == -10003) {
                    this.f59338a.m95111d9();
                    C23744a.m124114c().m124116d(6, this.f59338a.m95029V3());
                }
                if (C11501m2.this.m62013H().equals(this.f59339b)) {
                    C11501m2.this.m62005W();
                    C11501m2.this.f59120p.invalidate();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            boolean z11;
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                String m62013H = C11501m2.this.m62013H();
                boolean z12 = true;
                if (c23995f.m125666q() == 1) {
                    this.f59338a.m95111d9();
                    C23744a.m124114c().m124116d(6, this.f59338a.m95029V3());
                } else if (m62013H.equals(this.f59339b)) {
                    boolean m76526J = C11501m2.this.f59319D.m76526J();
                    if (c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                        interfaceC3968a.setImageInfo(c3979l, false);
                        if (!C25630b.m132391I(C11501m2.this.f59318C)) {
                            C11501m2.this.f59319D.m76541e0(c3979l.m18839c());
                        }
                    }
                    if (C11501m2.this.f59318C.m132395C() && C11501m2.this.f59319D.m76526J()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!m76526J && C11501m2.this.m62011E()) {
                        C28020b3 c28020b3 = C28020b3.f130648a;
                        C25630b c25630b2 = C11501m2.this.f59318C;
                        String m41044h = C11501m2.this.f59122r.m95029V3().m41044h();
                        InterfaceC11530v interfaceC11530v = C11501m2.this.f59119A;
                        if (interfaceC11530v == null || !interfaceC11530v.mo62073a()) {
                            z12 = false;
                        }
                        c28020b3.m141192f(c25630b2, m41044h, z12);
                        C11501m2.this.f59319D.m76529O(c25630b, this.f59339b, true, z11, this.f59340c, false);
                    }
                    C11501m2.this.m62006X(c25630b);
                    C11501m2.this.f59120p.invalidate();
                }
                C11501m2.this.m61998F(c25630b);
                C17949b1 c17949b1 = (C17949b1) C11501m2.this.f59122r.m94929K2();
                if (c17949b1.m95399i() && c25630b.m132427f() != -1) {
                    c17949b1.m95405p(false);
                    c17949b1.m95403n(c25630b);
                    C7956b.m41474B().m41515K0(C11501m2.this.f59122r, c17949b1);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    static {
        float m118742r = AbstractC23136l9.m118742r(10.0f);
        f59310X = m118742r;
        f59311Y = new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r};
        f59312Z = AbstractC23136l9.m118742r(12.0f);
        f59313a0 = AbstractC23136l9.m118742r(12.0f);
        f59314b0 = AbstractC23136l9.m118742r(0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11501m2(C2770a.a aVar) {
        View view = (View) aVar;
        this.f59120p = view;
        Context context = view.getContext();
        this.f59319D = new C13700o2(new C2770a(aVar, C13700o2.d.f70835q, 150, null, true, false, true, C13700o2.Companion.m76549c(), true));
        this.f59320E = new C3977j(context);
        this.f59321F = new C23528a(context);
        if (f59316d0 == null || f59309W) {
            C13704p1 c13704p1 = new C13704p1(1);
            f59316d0 = c13704p1;
            c13704p1.setColor(AbstractC11531v0.m62143G3());
            f59316d0.m76613c();
            f59316d0.setTextSize(f59312Z);
            Paint paint = new Paint(1);
            f59315c0 = paint;
            paint.setStyle(Paint.Style.FILL);
            f59315c0.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatMultiPhotoItemRecallBackgroundColor));
            Paint paint2 = new Paint(1);
            f59317e0 = paint2;
            paint2.setColor(-1999054632);
            f59317e0.setStyle(Paint.Style.STROKE);
            f59317e0.setStrokeWidth(f59314b0);
            f59309W = false;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.recalled_group_msg);
        this.f59324I = m118743r0;
        this.f59325J = AbstractC23136l9.m118764y0(f59316d0, m118743r0);
        this.f59326K = AbstractC23136l9.m118761x0(f59316d0, m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleted);
        this.f59332Q = m118743r02;
        this.f59333R = AbstractC23136l9.m118764y0(f59316d0, m118743r02);
        this.f59334S = AbstractC23136l9.m118761x0(f59316d0, m118743r02);
        this.f59336U = aVar instanceof ChatRowMultiStickers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m61998F(C25630b c25630b) {
        if (!C25630b.m132391I(c25630b) && this.f59336U) {
            if ((!C11318b.m60507e().m60518m(this.f59122r.mo95039W2()) || this.f59119A.mo62083g4()) && this.f59123s != 3) {
                ((ChatRowMultiStickers) this.f59120p).m61524I4(this.f59122r, c25630b.m132425e());
            }
        }
    }

    /* renamed from: J */
    private boolean m61999J() {
        C25630b c25630b = this.f59318C;
        if (c25630b != null && this.f59122r != null && c25630b.m132423d() == 2 && !this.f59122r.m95032V6()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m62000K(C17945a0 c17945a0, C25630b c25630b) {
        C17945a0 c17945a02 = this.f59122r;
        if (c17945a02 == c17945a0 && c17945a02.m95110d8()) {
            C25630b m95397g = ((C17949b1) this.f59122r.m94929K2()).m95397g();
            if (c25630b != null) {
                if (c25630b.m132396D(m95397g) || c25630b.m132397E()) {
                    m62004V(c25630b);
                    if (!c25630b.m132397E()) {
                        ((ChatRow) this.f59120p).m61119v3(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m62001L(final C17945a0 c17945a0, final C25630b c25630b) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.l2
            @Override // java.lang.Runnable
            public final void run() {
                C11501m2.this.m62000K(c17945a0, c25630b);
            }
        });
    }

    /* renamed from: M */
    private void m62002M(String str, C25630b c25630b, C3977j c3977j, C23528a c23528a) {
        boolean z11;
        try {
            if (!TextUtils.isEmpty(c25630b.m132446x())) {
                C17945a0 c17945a0 = this.f59122r;
                if (c25630b.m132423d() == 2 && !this.f59122r.m95032V6()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C28020b3.f130648a.m141182F(c3977j, c23528a, c25630b, null, true, new a(c17945a0, str, z11));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Q */
    private void m62003Q() {
        this.f59319D.m76530R(false);
        this.f59319D.m76531T();
    }

    /* renamed from: V */
    private void m62004V(C25630b c25630b) {
        this.f59318C = c25630b;
        try {
            ((C17949b1) this.f59122r.m94929K2()).m95403n(c25630b);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (this.f59318C.m132427f() != -1) {
            this.f59319D.m76540d0(this.f59318C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m62005W() {
        if (this.f59336U && this.f59123s != 3) {
            ((ChatRowMultiStickers) this.f59120p).m61529u4(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m62006X(C25630b c25630b) {
        if (this.f59336U && this.f59123s != 3) {
            ChatRowMultiStickers chatRowMultiStickers = (ChatRowMultiStickers) this.f59120p;
            boolean z11 = false;
            if (c25630b.m132399G()) {
                if (!AbstractC23041d2.m118194A(c25630b.m132435m())) {
                    C28020b3.f130648a.m141202r(c25630b);
                    chatRowMultiStickers.m61529u4(false);
                    return;
                }
                InterfaceC11530v interfaceC11530v = this.f59119A;
                if (interfaceC11530v != null && !interfaceC11530v.mo62086i0()) {
                    z11 = true;
                }
                chatRowMultiStickers.m61529u4(z11);
                return;
            }
            chatRowMultiStickers.m61529u4(false);
        }
    }

    /* renamed from: Y */
    private void m62007Y() {
        boolean z11;
        if (this.f59122r.m95110d8()) {
            String m62013H = m62013H();
            boolean m76526J = this.f59319D.m76526J();
            this.f59319D.m76544n(this.f59318C, m61999J());
            boolean z12 = false;
            if (this.f59318C.m132448z()) {
                if (m62011E()) {
                    C13700o2 c13700o2 = this.f59319D;
                    C28020b3 c28020b3 = C28020b3.f130648a;
                    C25630b c25630b = this.f59318C;
                    String m41044h = this.f59122r.m95029V3().m41044h();
                    InterfaceC11530v interfaceC11530v = this.f59119A;
                    if (interfaceC11530v != null && interfaceC11530v.mo62073a()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c13700o2.m76537Z(c28020b3.m141192f(c25630b, m41044h, z11));
                    if (!m76526J) {
                        this.f59319D.m76529O(this.f59318C, m62013H, false, false, false, false);
                    }
                }
            } else if (this.f59122r.m95032V6() || this.f59122r.m95107d3() != 3) {
                m62002M(m62013H, this.f59318C, this.f59320E, this.f59321F);
            }
            InterfaceC11505n2 interfaceC11505n2 = this.f59335T;
            if (interfaceC11505n2 != null) {
                if (interfaceC11505n2.mo62022A(this.f59318C.m132435m(), this.f59122r.m95029V3())) {
                    this.f59319D.m76534W(true);
                    return;
                }
                C13700o2 c13700o22 = this.f59319D;
                if (C3255n.m16556g() && !this.f59318C.m132395C()) {
                    z12 = true;
                }
                c13700o22.m76534W(z12);
            }
        }
    }

    /* renamed from: E */
    boolean m62011E() {
        InterfaceC11530v interfaceC11530v = this.f59119A;
        if (interfaceC11530v != null && interfaceC11530v.mo62077c()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m62012G() {
        this.f59319D.m76532U();
    }

    /* renamed from: H */
    String m62013H() {
        return C3255n.m16562n().m16572l(this.f59337V, this.f59122r.m95029V3().m41044h(), this.f59318C);
    }

    /* renamed from: I */
    public boolean m62014I() {
        return this.f59319D.m76525I();
    }

    /* renamed from: N */
    public void m62015N() {
        m62007Y();
    }

    /* renamed from: O */
    public void m62016O() {
        this.f59319D.m76528N();
    }

    /* renamed from: P */
    public void m62017P() {
        this.f59319D.m76529O(this.f59318C, m62013H(), true, true, m61999J(), false);
    }

    /* renamed from: R */
    public void m62018R(String str) {
        this.f59337V = str;
    }

    /* renamed from: S */
    public void m62019S(final C17945a0 c17945a0, int i11) {
        boolean z11;
        C25630b m95397g;
        C17945a0 c17945a02 = this.f59122r;
        if (c17945a02 != null && c17945a02.equals(c17945a0) && this.f59122r.m95041W4() == c17945a0.m95041W4()) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f59122r = c17945a0;
        this.f59123s = i11;
        this.f59124t = c17945a0.m95089b4();
        this.f59125u = this.f59122r.m95107d3();
        this.f59126v = this.f59122r.m95041W4();
        this.f59128x = false;
        this.f59129y = false;
        this.f59127w.m143917j(this.f59122r.m94930K3());
        if (z11) {
            m62003Q();
        }
        if (this.f59122r.m95219o8()) {
            this.f59129y = false;
        }
        if (this.f59122r.m95091b6()) {
            this.f59129y = true;
            return;
        }
        if (!this.f59122r.m95110d8() || (m95397g = ((C17949b1) this.f59122r.m94929K2()).m95397g()) == null) {
            return;
        }
        if (!z11 && this.f59318C.m132429g() != m95397g.m132429g()) {
            m62003Q();
        }
        C25630b m143290W = C28644j.m143233Y().m143290W(m95397g.m132429g() + "");
        if (m143290W.m132427f() >= 0) {
            m62004V(m143290W);
        } else {
            m62004V(m95397g);
            C28644j.m143233Y().m143281O0(m95397g, this, new C28644j.m() { // from class: com.zing.zalo.ui.chat.chatrow.k2
                @Override // p588vw.C28644j.m
                /* renamed from: a */
                public final void mo35936a(C25630b c25630b) {
                    C11501m2.this.m62001L(c17945a0, c25630b);
                }
            });
        }
    }

    /* renamed from: T */
    public void m62020T(InterfaceC11505n2 interfaceC11505n2) {
        this.f59335T = interfaceC11505n2;
        this.f59319D.m76533V(interfaceC11505n2);
    }

    /* renamed from: U */
    public void m62021U(C17945a0 c17945a0, boolean z11, int i11, int i12) {
        if (c17945a0.m95110d8() && C25630b.m132391I(this.f59318C)) {
            this.f59319D.m76539b0(C13700o2.d.f70837s, Math.max(i11, AbstractC23136l9.m118742r(120.0f)), this.f59318C.m132443u());
        } else if (z11) {
            this.f59319D.m76539b0(C13700o2.d.f70835q, i12, null);
        } else {
            this.f59319D.m76539b0(C13700o2.d.f70835q, i11, null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: e */
    protected int mo61913e() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: h */
    protected void mo61915h(Canvas canvas) {
        this.f59319D.m76545v(canvas);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: j */
    protected void mo61917j(Canvas canvas) {
        String str;
        canvas.drawPath(this.f59322G, f59315c0);
        AbstractC28236y3.m142204o(AbstractC11531v0.m62162K2(), this.f59330O, this.f59331P).draw(canvas);
        if (this.f59129y) {
            str = this.f59332Q;
        } else {
            str = this.f59324I;
        }
        RectF rectF = this.f59327L;
        canvas.drawText(str, rectF.left, rectF.bottom, f59316d0);
        canvas.drawPath(this.f59329N, f59317e0);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: k */
    public int mo61918k() {
        return this.f59319D.m76522E();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: l */
    public int mo61919l() {
        return this.f59130z.x;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: o */
    public int mo61922o() {
        return this.f59130z.y;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: q */
    public int mo61923q() {
        return this.f59319D.m76524H();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: r */
    protected void mo61924r(Message message) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: w */
    public void mo61928w(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        Point point = this.f59130z;
        point.x = i11;
        point.y = i12;
        RectF rectF = this.f59328M;
        float f11 = i11;
        int i16 = f59314b0;
        float f12 = i12;
        rectF.set((i16 / 2.0f) + f11, (i16 / 2.0f) + f12, (mo61923q() + i11) - (i16 / 2.0f), (mo61918k() + i12) - (i16 / 2.0f));
        this.f59329N.reset();
        Path path = this.f59329N;
        RectF rectF2 = this.f59328M;
        float[] fArr = f59311Y;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fArr, direction);
        if (this.f59122r.m95219o8() || this.f59122r.m95091b6()) {
            this.f59330O = ((((int) this.f59328M.width()) - AbstractC11531v0.m62162K2().getIntrinsicWidth()) / 2) + i11;
            int height = (((int) this.f59328M.height()) / 2) + i12;
            int intrinsicHeight = AbstractC11531v0.m62162K2().getIntrinsicHeight();
            int i17 = f59313a0;
            this.f59331P = height - (((intrinsicHeight + i17) + this.f59326K) / 2);
            int mo61923q = mo61923q();
            if (this.f59129y) {
                i13 = this.f59333R;
            } else {
                i13 = this.f59325J;
            }
            int i18 = ((mo61923q - i13) / 2) + i11;
            int intrinsicHeight2 = this.f59331P + AbstractC11531v0.m62162K2().getIntrinsicHeight() + i17;
            RectF rectF3 = this.f59327L;
            float f13 = i18;
            float f14 = intrinsicHeight2;
            boolean z11 = this.f59129y;
            if (z11) {
                i14 = this.f59333R;
            } else {
                i14 = this.f59325J;
            }
            float f15 = i18 + i14;
            if (z11) {
                i15 = this.f59334S;
            } else {
                i15 = this.f59326K;
            }
            rectF3.set(f13, f14, f15, intrinsicHeight2 + i15);
            this.f59323H.set(f11, f12, i11 + mo61923q(), i12 + mo61918k());
            this.f59322G.reset();
            this.f59322G.addRoundRect(this.f59323H, fArr, direction);
        }
        C13700o2 c13700o2 = this.f59319D;
        Point point2 = this.f59130z;
        c13700o2.m76538a0(point2.x, point2.y);
    }
}
