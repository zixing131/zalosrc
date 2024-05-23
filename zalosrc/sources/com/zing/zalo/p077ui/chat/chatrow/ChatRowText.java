package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13718q1;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.Map;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p038bl.C2829a;
import p348mi.AbstractC23306f;
import p560uw.EnumC27374a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowText extends ChatRowHasCaption {
    public static final C11422b Companion = new C11422b(null);

    /* renamed from: Q7 */
    private static final int f58732Q7 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: R7 */
    private static final C29234i f58733R7;

    /* renamed from: S7 */
    private static final InterfaceC29232g f58734S7;

    /* renamed from: B7 */
    private boolean f58735B7;

    /* renamed from: C7 */
    private int f58736C7;

    /* renamed from: D7 */
    private int f58737D7;

    /* renamed from: E7 */
    private int f58738E7;

    /* renamed from: F7 */
    private EnumC27374a f58739F7;

    /* renamed from: G7 */
    private String f58740G7;

    /* renamed from: H7 */
    private int f58741H7;

    /* renamed from: I7 */
    private int f58742I7;

    /* renamed from: J7 */
    private int f58743J7;

    /* renamed from: K7 */
    private int f58744K7;

    /* renamed from: L7 */
    private Drawable f58745L7;

    /* renamed from: M7 */
    private int f58746M7;

    /* renamed from: N7 */
    private int f58747N7;

    /* renamed from: O7 */
    private int f58748O7;

    /* renamed from: P7 */
    private int f58749P7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowText$a */
    /* loaded from: classes5.dex */
    static final class C11421a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11421a f58750q = new C11421a();

        C11421a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setTypeface(C13718q1.m76694c(MainApplication.Companion.m35500c(), 7));
            c13704p1.setTextSize(AbstractC23136l9.m118742r(14.0f));
            c13704p1.setColor(C23212s8.m119606n(AbstractC2807a.text_secondary));
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowText$b */
    /* loaded from: classes5.dex */
    public static final class C11422b {
        private C11422b() {
        }

        public /* synthetic */ C11422b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final C13704p1 m61688b() {
            return (C13704p1) ChatRowText.f58734S7.getValue();
        }

        /* renamed from: c */
        public final void m61689c() {
            ChatRowText.f58733R7.m145993b();
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f58733R7 = m145994a;
        f58734S7 = AbstractC29233h.m145991b(m145994a, C11421a.f58750q);
    }

    public ChatRowText(Context context) {
        super(context);
        this.f58739F7 = EnumC27374a.f128964q;
        this.f58740G7 = "";
    }

    /* renamed from: A4 */
    private final void m61682A4() {
        try {
            Map mo150728A = AbstractC23306f.m120726x1().mo150728A();
            if (this.f57263B != null && (!mo150728A.isEmpty()) && getDelegate().mo62073a()) {
                String mo95039W2 = this.f57263B.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                int m13676a = C2829a.m13676a(mo150728A, mo95039W2, this.f57263B.m95029V3().m41045i());
                if (m13676a > 0) {
                    getDelegate().mo62068V3(this.f57263B, m13676a, false, false, false);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: B4 */
    private final void m61683B4(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f58746M7, this.f58747N7);
        Drawable drawable = this.f58745L7;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        c28227x3.f131648a = getTextWidth() + getBubblePaddingLeft() + getBubblePaddingRight();
        c28227x3.f131649b = getTextHeight();
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: E2 */
    public C28227x3 mo60959E2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int m116580c;
        int m116580c2;
        AbstractC19074t.m100208f(c28227x3, "result");
        super.mo60959E2(i11, i12, i13, c28227x3);
        if (this.f58735B7) {
            C11422b c11422b = Companion;
            this.f58743J7 = AbstractC23136l9.m118764y0(c11422b.m61688b(), this.f58740G7);
            this.f58744K7 = AbstractC23136l9.m118761x0(c11422b.m61688b(), this.f58740G7);
            int i14 = c28227x3.f131648a;
            Drawable drawable = this.f58745L7;
            AbstractC19074t.m100205c(drawable);
            m116580c = AbstractC22543l.m116580c(i14, drawable.getIntrinsicWidth() + ChatRow.f57195I5 + this.f58743J7 + getBubblePaddingLeft() + getBubblePaddingRight());
            c28227x3.f131648a = m116580c;
            int i15 = c28227x3.f131649b;
            int i16 = this.f58744K7;
            int i17 = ChatRow.f57201L5;
            Drawable drawable2 = this.f58745L7;
            AbstractC19074t.m100205c(drawable2);
            m116580c2 = AbstractC22543l.m116580c(i16 + i17, drawable2.getIntrinsicHeight() + i17);
            int i18 = i15 + m116580c2;
            c28227x3.f131649b = i18;
            c28227x3.f131649b = i18 + ((int) (ChatRow.f57255z5.getStrokeWidth() + f58732Q7));
        }
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        boolean z11;
        Drawable m62547W1;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        boolean z12 = false;
        if (m61429n4() && this.f57560z4.mo60993N()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57271C1 = z11;
        if (c17945a0.m95051X3() != null) {
            EnumC27374a enumC27374a = c17945a0.m95051X3().f91068k;
            AbstractC19074t.m100207e(enumC27374a, "msgWarningType");
            this.f58739F7 = enumC27374a;
            if (enumC27374a == EnumC27374a.f128968u || enumC27374a == EnumC27374a.f128967t) {
                z12 = true;
            }
            this.f58735B7 = z12;
            if (z12) {
                if (enumC27374a == EnumC27374a.f128967t) {
                    m62547W1 = AbstractC11531v0.Companion.m62550X1();
                } else {
                    m62547W1 = AbstractC11531v0.Companion.m62547W1();
                }
                this.f58745L7 = m62547W1;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unsafe_link_warning_bubble);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                this.f58740G7 = m118743r0;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        c17945a0.m95257t1();
        m61682A4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: b4 */
    protected boolean mo61424b4() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f58748O7 = i11 + getBubblePaddingLeft();
        this.f58749P7 = i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58748O7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58749P7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: i2 */
    public int mo61071i2(int i11, int i12, int i13, int i14, boolean z11) {
        int m116580c;
        int mo61071i2 = super.mo61071i2(i11, i12, i13, i14, z11);
        if (this.f58735B7) {
            int bubblePaddingLeft = getBubblePaddingLeft() + i11;
            this.f58746M7 = bubblePaddingLeft;
            this.f58747N7 = mo61071i2;
            Drawable drawable = this.f58745L7;
            AbstractC19074t.m100205c(drawable);
            this.f58741H7 = bubblePaddingLeft + drawable.getIntrinsicWidth() + ChatRow.f57189F5;
            int i15 = this.f58747N7;
            Drawable drawable2 = this.f58745L7;
            AbstractC19074t.m100205c(drawable2);
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i16 = this.f58744K7;
            this.f58742I7 = i15 + ((intrinsicHeight + i16) / 2);
            int i17 = ChatRow.f57201L5;
            Drawable drawable3 = this.f58745L7;
            AbstractC19074t.m100205c(drawable3);
            m116580c = AbstractC22543l.m116580c(i16 + i17, drawable3.getIntrinsicHeight() + i17);
            int i18 = mo61071i2 + m116580c;
            this.f58736C7 = i11;
            this.f58737D7 = i13;
            this.f58738E7 = i18;
            return i18 + ((int) (ChatRow.f57255z5.getStrokeWidth() + f58732Q7));
        }
        return mo61071i2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return c17945a0.m95019U3();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: v0 */
    public void mo61117v0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61117v0(canvas);
        if (this.f58735B7) {
            m61683B4(canvas);
            canvas.drawText(this.f58740G7, this.f58741H7, this.f58742I7, Companion.m61688b());
            float f11 = this.f58736C7;
            int i11 = this.f58738E7;
            canvas.drawLine(f11, i11, this.f58737D7, i11, ChatRow.f57255z5);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58735B7 = false;
        this.f58736C7 = 0;
        this.f58737D7 = 0;
        this.f58738E7 = 0;
        this.f58741H7 = 0;
        this.f58742I7 = 0;
        this.f58743J7 = 0;
        this.f58744K7 = 0;
        this.f58746M7 = 0;
        this.f58747N7 = 0;
    }
}
