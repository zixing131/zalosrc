package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17972j0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ti0.C26702a;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowBankCardOffline extends ChatRowHasCaption {
    public static final C11344e Companion = new C11344e(null);

    /* renamed from: o8 */
    private static final C29234i f57584o8;

    /* renamed from: p8 */
    private static final InterfaceC29232g f57585p8;

    /* renamed from: q8 */
    private static final InterfaceC29232g f57586q8;

    /* renamed from: r8 */
    private static final InterfaceC29232g f57587r8;

    /* renamed from: s8 */
    private static final InterfaceC29232g f57588s8;

    /* renamed from: B7 */
    private final int f57589B7;

    /* renamed from: C7 */
    private int f57590C7;

    /* renamed from: D7 */
    private String f57591D7;

    /* renamed from: E7 */
    private String f57592E7;

    /* renamed from: F7 */
    private String f57593F7;

    /* renamed from: G7 */
    private final int f57594G7;

    /* renamed from: H7 */
    private final float f57595H7;

    /* renamed from: I7 */
    private final float f57596I7;

    /* renamed from: J7 */
    private final float f57597J7;

    /* renamed from: K7 */
    private final float f57598K7;

    /* renamed from: L7 */
    private final float f57599L7;

    /* renamed from: M7 */
    private final float f57600M7;

    /* renamed from: N7 */
    private final float f57601N7;

    /* renamed from: O7 */
    private final float f57602O7;

    /* renamed from: P7 */
    private final float f57603P7;

    /* renamed from: Q7 */
    private float f57604Q7;

    /* renamed from: R7 */
    private float f57605R7;

    /* renamed from: S7 */
    private float f57606S7;

    /* renamed from: T7 */
    private float f57607T7;

    /* renamed from: U7 */
    private float f57608U7;

    /* renamed from: V7 */
    private float f57609V7;

    /* renamed from: W7 */
    private float f57610W7;

    /* renamed from: X7 */
    private float f57611X7;

    /* renamed from: Y7 */
    private int f57612Y7;

    /* renamed from: Z7 */
    private float f57613Z7;

    /* renamed from: a8 */
    private int f57614a8;

    /* renamed from: b8 */
    private float f57615b8;

    /* renamed from: c8 */
    private int f57616c8;

    /* renamed from: d8 */
    private Drawable f57617d8;

    /* renamed from: e8 */
    private Drawable f57618e8;

    /* renamed from: f8 */
    private final Paint f57619f8;

    /* renamed from: g8 */
    private StaticLayout f57620g8;

    /* renamed from: h8 */
    private StaticLayout f57621h8;

    /* renamed from: i8 */
    private StaticLayout f57622i8;

    /* renamed from: j8 */
    private final int f57623j8;

    /* renamed from: k8 */
    private final int f57624k8;

    /* renamed from: l8 */
    private int f57625l8;

    /* renamed from: m8 */
    private boolean f57626m8;

    /* renamed from: n8 */
    private final InterfaceC24854k f57627n8;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBankCardOffline$a */
    /* loaded from: classes5.dex */
    static final class C11340a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11340a f57628q = new C11340a();

        C11340a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26702a mo12V4() {
            C26702a c26702a = new C26702a(MainApplication.Companion.m35500c(), 1);
            c26702a.setColor(C23212s8.m119606n(AbstractC2807a.text_02));
            return c26702a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBankCardOffline$b */
    /* loaded from: classes5.dex */
    static final class C11341b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11341b f57629q = new C11341b();

        C11341b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118639A(AbstractC2808b.blk_a20));
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBankCardOffline$c */
    /* loaded from: classes5.dex */
    static final class C11342c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11342c f57630q = new C11342c();

        C11342c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26702a mo12V4() {
            C26702a c26702a = new C26702a(MainApplication.Companion.m35500c(), 1);
            c26702a.setColor(C23212s8.m119606n(AbstractC2807a.text_01));
            return c26702a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBankCardOffline$d */
    /* loaded from: classes5.dex */
    static final class C11343d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11343d f57631q = new C11343d();

        C11343d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26702a mo12V4() {
            C26702a c26702a = new C26702a(MainApplication.Companion.m35500c(), 1);
            c26702a.setTypeface(Typeface.DEFAULT_BOLD);
            c26702a.setColor(C23212s8.m119606n(AbstractC2807a.text_01));
            return c26702a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBankCardOffline$e */
    /* loaded from: classes5.dex */
    public static final class C11344e {
        private C11344e() {
        }

        public /* synthetic */ C11344e(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: f */
        public final C26702a m61172f() {
            return (C26702a) ChatRowBankCardOffline.f57587r8.getValue();
        }

        /* renamed from: g */
        public final int m61173g() {
            return ((Number) ChatRowBankCardOffline.f57588s8.getValue()).intValue();
        }

        /* renamed from: h */
        public final C26702a m61174h() {
            return (C26702a) ChatRowBankCardOffline.f57585p8.getValue();
        }

        /* renamed from: i */
        public final C26702a m61175i() {
            return (C26702a) ChatRowBankCardOffline.f57586q8.getValue();
        }

        /* renamed from: e */
        public final void m61176e() {
            ChatRowBankCardOffline.f57584o8.m145993b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBankCardOffline$f */
    /* loaded from: classes5.dex */
    public static final class C11345f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11345f f57632q = new C11345f();

        C11345f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Path mo12V4() {
            return new Path();
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f57584o8 = m145994a;
        f57585p8 = AbstractC29233h.m145991b(m145994a, C11342c.f57630q);
        f57586q8 = AbstractC29233h.m145991b(m145994a, C11343d.f57631q);
        f57587r8 = AbstractC29233h.m145991b(m145994a, C11340a.f57628q);
        f57588s8 = AbstractC29233h.m145991b(m145994a, C11341b.f57629q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowBankCardOffline(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f57589B7 = AbstractC23136l9.m118742r(16.0f);
        this.f57591D7 = "---";
        this.f57592E7 = "---";
        this.f57593F7 = "---";
        this.f57594G7 = AbstractC23136l9.m118742r(0.5f);
        this.f57595H7 = 270.0f;
        this.f57596I7 = 172.0f;
        this.f57597J7 = 32.0f;
        this.f57598K7 = 6.0f;
        this.f57599L7 = 12.0f;
        this.f57600M7 = 8.0f;
        this.f57601N7 = 13.0f;
        this.f57602O7 = 18.0f;
        this.f57603P7 = 10.0f;
        this.f57604Q7 = 1.0f;
        this.f57605R7 = 270.0f;
        this.f57606S7 = 172.0f;
        this.f57607T7 = 32.0f;
        this.f57608U7 = 6.0f;
        this.f57609V7 = 12.0f;
        this.f57610W7 = 8.0f;
        this.f57611X7 = 13.0f;
        this.f57613Z7 = 18.0f;
        this.f57615b8 = 10.0f;
        this.f57619f8 = new Paint(1);
        this.f57626m8 = true;
        m129210a = AbstractC24856m.m129210a(C11345f.f57632q);
        this.f57627n8 = m129210a;
    }

    /* renamed from: D4 */
    private final float m61158D4(float f11) {
        return AbstractC23136l9.m118742r(f11);
    }

    /* renamed from: E4 */
    public static final void m61159E4() {
        Companion.m61176e();
    }

    private final Path getBackgroundClipPath() {
        return (Path) this.f57627n8.getValue();
    }

    private static /* synthetic */ void getDesignCardHeight$annotations() {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        c28227x3.f131648a = this.f57371T;
        c28227x3.f131649b = AbstractC23136l9.m118742r(172.0f) - ChatRow.f57201L5;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C17972j0 c17972j0;
        String str;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17972j0) {
            c17972j0 = (C17972j0) m94929K2;
        } else {
            c17972j0 = null;
        }
        if (c17972j0 != null) {
            String str2 = "---";
            if (c17972j0.m95611h().length() <= 0) {
                str = "---";
            } else {
                str = "Ngân Hàng " + c17972j0.m95611h();
            }
            this.f57591D7 = str;
            String m95612i = c17972j0.m95612i();
            if (m95612i.length() == 0) {
                m95612i = "---";
            }
            this.f57592E7 = m95612i;
            String m95610g = c17972j0.m95610g();
            if (m95610g.length() != 0) {
                str2 = m95610g;
            }
            this.f57593F7 = str2;
        }
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        this.f57617d8 = x3Var.m62597o();
        this.f57618e8 = x3Var.m62479A();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: P2 */
    public void mo61005P2() {
        super.mo61005P2();
        int floatToIntBits = (((((((this.f57530u0 * 31) + this.f57524t0) * 31) + this.f57536v0) * 31) + this.f57541w0) * 31) + Float.floatToIntBits(ChatRow.f57179A5);
        if (this.f57625l8 != floatToIntBits) {
            this.f57626m8 = true;
            this.f57625l8 = floatToIntBits;
        }
        this.f57605R7 = this.f57536v0 - this.f57530u0;
        this.f57606S7 = this.f57541w0 - this.f57524t0;
        this.f57590C7 = getBottom();
        float m61158D4 = this.f57605R7 / m61158D4(this.f57595H7);
        this.f57604Q7 = m61158D4;
        this.f57607T7 = m61158D4(m61158D4 * this.f57597J7);
        this.f57608U7 = m61158D4(this.f57604Q7 * this.f57598K7);
        this.f57609V7 = m61158D4(this.f57604Q7 * this.f57599L7);
        this.f57610W7 = m61158D4(this.f57604Q7 * this.f57600M7);
        this.f57611X7 = m61158D4(this.f57604Q7 * this.f57601N7);
        this.f57613Z7 = m61158D4(this.f57604Q7 * this.f57602O7);
        this.f57615b8 = m61158D4(this.f57604Q7 * this.f57603P7);
        if (this.f57591D7.length() > 0) {
            C11344e c11344e = Companion;
            c11344e.m61174h().setTextSize(this.f57611X7);
            StaticLayout m119624k = AbstractC23214t.m119624k(this.f57591D7, c11344e.m61174h(), (int) (((this.f57605R7 - (2 * this.f57609V7)) - this.f57607T7) - this.f57610W7));
            this.f57612Y7 = m119624k.getHeight();
            this.f57620g8 = m119624k;
        }
        if (this.f57592E7.length() > 0) {
            C11344e c11344e2 = Companion;
            c11344e2.m61175i().setTextSize(this.f57613Z7);
            StaticLayout m119624k2 = AbstractC23214t.m119624k(this.f57592E7, c11344e2.m61175i(), (int) (this.f57605R7 - (2 * this.f57609V7)));
            this.f57614a8 = m119624k2.getHeight();
            this.f57621h8 = m119624k2;
        }
        if (this.f57593F7.length() > 0) {
            C11344e c11344e3 = Companion;
            c11344e3.m61172f().setTextSize(this.f57615b8);
            StaticLayout m119624k3 = AbstractC23214t.m119624k(this.f57593F7, c11344e3.m61172f(), (int) (this.f57605R7 - (2 * this.f57609V7)));
            this.f57616c8 = m119624k3.getHeight();
            this.f57622i8 = m119624k3;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMinWidth() {
        return AbstractC23136l9.m118742r(270.0f);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingLeft() {
        return this.f57589B7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        return this.f57589B7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f57623j8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f57624k8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: l4 */
    public boolean mo61163l4() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61093o0(canvas, i11, i12, i13, i14);
        if (this.f57626m8) {
            this.f57626m8 = false;
            getBackgroundClipPath().rewind();
            Path backgroundClipPath = getBackgroundClipPath();
            int i15 = this.f57594G7;
            float f11 = ChatRow.f57179A5;
            backgroundClipPath.addRoundRect(i11 + i15, i12 + i15, i13 - i15, i14 - i15, f11, f11, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(getBackgroundClipPath());
        Drawable drawable = this.f57617d8;
        if (drawable != null) {
            drawable.setBounds(i11, i12, i13, i14);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        this.f57619f8.setColor(Companion.m61173g());
        this.f57619f8.setStyle(Paint.Style.FILL);
        int i11 = this.f57530u0;
        float f11 = this.f57609V7;
        int i12 = this.f57524t0;
        float f12 = this.f57607T7;
        float f13 = this.f57608U7;
        canvas.drawRoundRect(i11 + f11, i12 + f11, i11 + f11 + f12, i12 + f11 + f12, f13, f13, this.f57619f8);
        Drawable drawable = this.f57618e8;
        if (drawable != null) {
            int i13 = this.f57530u0;
            float f14 = this.f57609V7;
            int i14 = this.f57524t0;
            float f15 = this.f57607T7;
            drawable.setBounds(((int) f14) + i13, ((int) f14) + i14, i13 + ((int) (f14 + f15)), i14 + ((int) (f14 + f15)));
            drawable.draw(canvas);
        }
        StaticLayout staticLayout = this.f57620g8;
        if (staticLayout != null) {
            canvas.save();
            float f16 = this.f57530u0;
            float f17 = this.f57609V7;
            float f18 = this.f57607T7;
            canvas.translate(f16 + f17 + f18 + this.f57610W7, ((this.f57524t0 + f17) + (f18 / 2)) - (this.f57612Y7 / 2));
            staticLayout.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f57621h8;
        if (staticLayout2 != null) {
            canvas.save();
            float f19 = this.f57530u0;
            float f21 = this.f57609V7;
            canvas.translate(f19 + f21, (((this.f57524t0 + this.f57606S7) - f21) - this.f57616c8) - this.f57614a8);
            staticLayout2.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout3 = this.f57622i8;
        if (staticLayout3 != null) {
            canvas.save();
            float f22 = this.f57530u0;
            float f23 = this.f57609V7;
            canvas.translate(f22 + f23, ((this.f57524t0 + this.f57606S7) - f23) - this.f57616c8);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
    }
}
