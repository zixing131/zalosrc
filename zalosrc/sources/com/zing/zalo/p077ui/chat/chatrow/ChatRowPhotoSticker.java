package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import bd0.C2770a;
import c30.C3255n;
import com.androidquery.util.C3977j;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.widget.C13646i;
import com.zing.zalo.p077ui.widget.C13700o2;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18009w0;
import ho0.AbstractC20110a;
import java.io.File;
import me0.AbstractC23080g8;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C24002m;
import p394oj.C24280f;
import p471r3.C25630b;
import p588vw.C28644j;
import th.AbstractC26683d;
import vg.AbstractC28236y3;
import vg.C28020b3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowPhotoSticker extends ChatRow implements C2770a.a {

    /* renamed from: V6 */
    private final C13700o2 f58323V6;

    /* renamed from: W6 */
    private final C3977j f58324W6;

    /* renamed from: X6 */
    private final C3977j f58325X6;

    /* renamed from: Y6 */
    private C25630b f58326Y6;

    /* renamed from: Z6 */
    private C18009w0 f58327Z6;

    /* renamed from: a7 */
    String f58328a7;

    /* renamed from: b7 */
    private C3255n.e f58329b7;

    /* renamed from: c7 */
    private int f58330c7;

    /* renamed from: d7 */
    private int f58331d7;

    /* renamed from: e7 */
    private int f58332e7;

    /* renamed from: f7 */
    private int f58333f7;

    /* renamed from: g7 */
    private boolean f58334g7;

    /* renamed from: h7 */
    private boolean f58335h7;

    /* renamed from: i7 */
    private boolean f58336i7;

    /* renamed from: j7 */
    private InterfaceC11505n2 f58337j7;

    /* renamed from: k7 */
    private C24280f f58338k7;

    /* renamed from: l7 */
    boolean f58339l7;

    /* renamed from: m7 */
    private String f58340m7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowPhotoSticker$a */
    /* loaded from: classes5.dex */
    public class C11385a extends C24002m {
        C11385a(int i11) {
            super(i11);
        }

        @Override // p379o3.C24002m
        /* renamed from: E1 */
        protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
            if (file != null && ChatRowPhotoSticker.this.m61557W3()) {
                C28020b3.f130648a.m141188Q(str, file.getPath());
                ChatRowPhotoSticker.this.m61556c4();
            }
        }
    }

    public ChatRowPhotoSticker(Context context, String str) {
        super(context);
        this.f58340m7 = "";
        this.f58323V6 = new C13700o2(new C2770a(this, C13700o2.d.f70835q, AbstractC23080g8.m118402g(context), null, true, false, false, C13700o2.Companion.m76549c(), true));
        this.f58324W6 = new C3977j(context);
        this.f58325X6 = new C3977j(context);
        this.f58340m7 = str;
    }

    /* renamed from: V3 */
    private boolean m61550V3() {
        if (this.f58329b7 != null && !C28644j.m143233Y().m143312x0(this.f58329b7.f13960b)) {
            return true;
        }
        return false;
    }

    /* renamed from: X3 */
    private void m61551X3() {
        C24280f c24280f = this.f58338k7;
        if (c24280f != null) {
            String str = c24280f.f117261a;
            C25630b c25630b = this.f58326Y6;
            if (c25630b == null || !c25630b.m132446x().equals(str)) {
                this.f58326Y6 = new C25630b(1, 2);
                String m141209z = C28020b3.f130648a.m141209z(str);
                this.f58326Y6.m132428f0(str);
                this.f58326Y6.m132407Q(m141209z);
            }
            C17969i0 m94929K2 = this.f57263B.m94929K2();
            if ((m94929K2 instanceof C18009w0) && ((C18009w0) m94929K2).m95786t() == 1) {
                this.f58326Y6.m132404N(-10);
                return;
            } else {
                this.f58326Y6.m132404N(-1);
                return;
            }
        }
        this.f58326Y6 = null;
    }

    /* renamed from: Y3 */
    private boolean m61552Y3(float f11, float f12) {
        if (f11 >= this.f58332e7 && f11 <= r0 + AbstractC11531v0.m62330u2().getIntrinsicWidth()) {
            if (f12 >= this.f58333f7 && f12 <= r3 + AbstractC11531v0.m62330u2().getIntrinsicHeight()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Z3 */
    private boolean m61553Z3(float f11, float f12) {
        try {
            if (f11 < this.f57530u0 || f11 > this.f57536v0 || f12 < this.f58331d7) {
                return false;
            }
            if (f12 > this.f57282E0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: a4 */
    private void m61554a4() {
        C24280f c24280f;
        try {
            try {
                String str = this.f58328a7;
                if (TextUtils.isEmpty(str) && (c24280f = this.f58338k7) != null) {
                    str = c24280f.f117261a;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f58323V6.m76543g0(this.f58328a7);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            invalidate();
        } catch (Throwable th2) {
            invalidate();
            throw th2;
        }
    }

    /* renamed from: b4 */
    private void m61555b4() {
        C24280f c24280f;
        this.f58323V6.m76540d0(this.f58326Y6);
        if (m61557W3() && m60988L3() && (c24280f = this.f58338k7) != null && !TextUtils.isEmpty(c24280f.f117261a) && AbstractC26683d.f126407z) {
            if (TextUtils.isEmpty(C28020b3.f130648a.m141209z(this.f58338k7.f117261a))) {
                ((C23528a) this.f57275D.m123612r(this.f58325X6)).m123602g(this.f58338k7.f117261a, new C11385a(3));
                return;
            } else {
                if (!this.f58339l7 || !this.f58323V6.m76526J()) {
                    m61556c4();
                    return;
                }
                return;
            }
        }
        m61554a4();
    }

    /* renamed from: c4 */
    public void m61556c4() {
        try {
            m61551X3();
            this.f58323V6.m76540d0(this.f58326Y6);
            if (this.f58338k7 != null) {
                this.f58323V6.m76529O(this.f58326Y6, this.f58340m7 + getMessage().m95029V3().m41045i() + this.f58338k7.f117261a, true, false, false, true);
                this.f58339l7 = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    private int getTopMarginForQuote() {
        if (this.f57526t2) {
            return ChatRowMultiStickers.f58224W7;
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58336i7 = false;
        this.f58335h7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: B2 */
    public C28227x3 mo60949B2(boolean z11, int i11, C28227x3 c28227x3) {
        C28227x3 mo60949B2 = super.mo60949B2(z11, i11, c28227x3);
        if (this.f58334g7) {
            int i12 = mo60949B2.f131648a;
            int intrinsicWidth = AbstractC11531v0.m62330u2().getIntrinsicWidth();
            int i13 = ChatRow.f57203M5;
            mo60949B2.f131648a = Math.max(i12, intrinsicWidth + i13);
            mo60949B2.f131649b += AbstractC11531v0.m62330u2().getIntrinsicHeight() + i13;
        }
        return mo60949B2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int m76524H;
        c28227x3.f131649b = this.f58323V6.m76522E() + getTopMarginForQuote();
        if (this.f57526t2) {
            m76524H = ChatRowMultiStickers.f58223V7;
        } else {
            m76524H = this.f58323V6.m76524H();
        }
        c28227x3.f131648a = m76524H;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() instanceof C18009w0) {
            this.f58327Z6 = (C18009w0) c17945a0.m94929K2();
        }
        if (this.f58327Z6 != null) {
            this.f58329b7 = C3255n.m16562n().m16574p(this.f58327Z6.m95774k());
            C24280f m95742G = this.f58327Z6.m95742G();
            this.f58338k7 = m95742G;
            if (m95742G != null && !TextUtils.isEmpty(m95742G.f117264d)) {
                this.f58328a7 = this.f58338k7.f117264d;
            } else if (!TextUtils.isEmpty(c17945a0.m94929K2().f91014s)) {
                this.f58328a7 = c17945a0.m94929K2().f91014s;
            } else if (!TextUtils.isEmpty(c17945a0.m94929K2().f91013r)) {
                this.f58328a7 = c17945a0.m94929K2().f91013r;
            } else {
                this.f58328a7 = c17945a0.m94983Q3();
            }
        }
        this.f58334g7 = m61550V3();
        if (c17945a0.m94954N0() && mo60993N() && !this.f58334g7) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57271C1 = z12;
        C25630b c25630b = this.f58326Y6;
        if (c25630b == null || this.f58338k7 == null || !c25630b.m132446x().equals(this.f58338k7.f117261a)) {
            this.f58323V6.m76530R(false);
            this.f58324W6.setImageInfo(null);
            this.f58326Y6 = null;
        }
        this.f58323V6.m76539b0(C13700o2.d.f70835q, ((Integer) AbstractC23080g8.m118396a(getContext(), getDelegate().mo62071Y3()).first).intValue(), null);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L */
    public int mo60984L(int i11, C13646i c13646i) {
        return this.f58330c7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return this.f57526t2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        int i11;
        int mo60998O0 = super.mo60998O0(z11, z12, z13, z14);
        if (this.f57526t2) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        return mo60998O0 | i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T0 */
    protected int mo61022T0(int i11, int i12, int i13) {
        return (((getTopMarginForQuote() + this.f57288F0) + this.f57294G0) - i13) / 2;
    }

    /* renamed from: W3 */
    boolean m61557W3() {
        return getDelegate().mo62077c();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        m61555b4();
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        return !getDelegate().mo62077c();
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return this.f57263B.m95032V6();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        if (!this.f58334g7 && m61550V3()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: f2 */
    public int mo61058f2(int i11, int i12, int i13, int i14, boolean z11) {
        if (!this.f57526t2) {
            int i15 = this.f58330c7;
            if (z11) {
                i11 = i15 + this.f58323V6.m76524H();
            } else {
                i11 = i15 - ChatRow.f57203M5;
            }
        }
        int mo61058f2 = super.mo61058f2(i11, i12, i13, i14, z11);
        if (this.f58334g7) {
            int i16 = ChatRow.f57203M5;
            this.f58333f7 = (i16 / 2) + mo61058f2;
            if (z11) {
                this.f58332e7 = i11 + (i16 / 2);
            } else {
                this.f58332e7 = (i13 - AbstractC11531v0.m62330u2().getIntrinsicWidth()) - (i16 / 2);
            }
            return mo61058f2 + AbstractC11531v0.m62330u2().getIntrinsicHeight() + i16;
        }
        return mo61058f2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        if (!z11 || this.f57526t2) {
            i11 = ((i11 + i13) / 2) - (this.f58323V6.m76524H() / 2);
        }
        this.f58330c7 = i11;
        int topMarginForQuote = i12 + getTopMarginForQuote();
        this.f58331d7 = topMarginForQuote;
        this.f58323V6.m76538a0(this.f58330c7, topMarginForQuote);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBackgroundTopRegionHeight() {
        if (this.f57526t2) {
            return this.f57389W;
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        if (this.f57526t2) {
            return ChatRowMultiStickers.f58223V7;
        }
        return super.getBubbleMaxWidth();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return AbstractC23222t7.f112556e;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return AbstractC23222t7.f112556e;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean m61553Z3;
        C3255n.e eVar;
        if (i11 != 0) {
            m61553Z3 = true;
            if (i11 != 1 || !this.f58336i7 || !m61553Z3(f11, f12)) {
                m61553Z3 = false;
            } else {
                C25630b c25630b = this.f58326Y6;
                if (c25630b != null && c25630b.m132447y()) {
                    InterfaceC11505n2 interfaceC11505n2 = this.f58337j7;
                    if (interfaceC11505n2 != null) {
                        interfaceC11505n2.mo62025c(this.f58326Y6.m132427f());
                    }
                } else {
                    InterfaceC11505n2 interfaceC11505n22 = this.f58337j7;
                    if (interfaceC11505n22 != null && (eVar = this.f58329b7) != null && this.f58334g7) {
                        interfaceC11505n22.mo62024b(eVar.f13960b);
                    }
                }
            }
        } else {
            m61553Z3 = m61553Z3(f11, f12);
            this.f58336i7 = m61553Z3;
        }
        return super.mo61075j3(motionEvent, i11, f11, f12) | m61553Z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:            if (r2 == false) goto L51;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61079k3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        C3255n.e eVar;
        if (i11 != 0) {
            if (i11 == 1 && this.f58335h7 && m61552Y3(f11, f12)) {
                InterfaceC11505n2 interfaceC11505n2 = this.f58337j7;
                if (interfaceC11505n2 != null && (eVar = this.f58329b7) != null) {
                    interfaceC11505n2.mo62024b(eVar.f13960b);
                }
            }
            if (!super.mo61079k3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (this.f58334g7 && m61552Y3(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58335h7 = z11;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58323V6.m76532U();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58323V6.m76528N();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: s0 */
    public void mo61109s0(Canvas canvas) {
        Drawable m62330u2;
        super.mo61109s0(canvas);
        if (this.f58334g7) {
            if (this.f58335h7) {
                m62330u2 = AbstractC11531v0.m62335v2();
            } else {
                m62330u2 = AbstractC11531v0.m62330u2();
            }
            AbstractC28236y3.m142204o(m62330u2, this.f58332e7, this.f58333f7);
            m62330u2.draw(canvas);
        }
    }

    public void setStickerDelegate(InterfaceC11505n2 interfaceC11505n2) {
        this.f58337j7 = interfaceC11505n2;
        this.f58323V6.m76533V(interfaceC11505n2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        this.f58323V6.m76545v(canvas);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t1 */
    protected boolean mo61112t1() {
        return this.f57526t2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58328a7 = "";
        this.f58338k7 = null;
        this.f58329b7 = null;
        this.f58339l7 = false;
    }
}
