package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C17946a1;
import dj.C17969i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowSectionDivider extends ChatRow {
    public static final C11407c Companion = new C11407c(null);

    /* renamed from: c7 */
    private static final float f58644c7 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: d7 */
    private static final int f58645d7 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: e7 */
    private static final float f58646e7 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: f7 */
    private static final C29234i f58647f7;

    /* renamed from: g7 */
    private static final InterfaceC29232g f58648g7;

    /* renamed from: h7 */
    private static final InterfaceC29232g f58649h7;

    /* renamed from: i7 */
    private static boolean f58650i7;

    /* renamed from: V6 */
    private int f58651V6;

    /* renamed from: W6 */
    private String f58652W6;

    /* renamed from: X6 */
    private int f58653X6;

    /* renamed from: Y6 */
    private int f58654Y6;

    /* renamed from: Z6 */
    private int f58655Z6;

    /* renamed from: a7 */
    private int f58656a7;

    /* renamed from: b7 */
    private float f58657b7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowSectionDivider$a */
    /* loaded from: classes5.dex */
    static final class C11405a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11405a f58658q = new C11405a();

        C11405a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint(1);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowSectionDivider$b */
    /* loaded from: classes5.dex */
    static final class C11406b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11406b f58659q = new C11406b();

        C11406b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setTextSize(AbstractC23136l9.m118742r(12.0f));
            c13704p1.setTypeface(Typeface.DEFAULT);
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowSectionDivider$c */
    /* loaded from: classes5.dex */
    public static final class C11407c {
        private C11407c() {
        }

        public /* synthetic */ C11407c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final Paint m61648c() {
            return (Paint) ChatRowSectionDivider.f58649h7.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final C13704p1 m61649d() {
            return (C13704p1) ChatRowSectionDivider.f58648g7.getValue();
        }

        /* renamed from: e */
        public final void m61650e(boolean z11) {
            ChatRowSectionDivider.f58650i7 = z11;
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f58647f7 = m145994a;
        f58648g7 = AbstractC29233h.m145991b(m145994a, C11406b.f58659q);
        f58649h7 = AbstractC29233h.m145991b(m145994a, C11405a.f58658q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowSectionDivider(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f58652W6 = "";
        if (f58650i7) {
            f58647f7.m145993b();
            f58650i7 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C17946a1 c17946a1;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        this.f57263B = c17945a0;
        c17945a0.m95292x1();
        this.f57269C = getDelegate().mo62079c4(c17945a0.m95029V3());
        this.f57413a3 = c28769a.f133312h;
        this.f57262A4 = c28769a.f133311g;
        this.f57261A3 = c28769a.f133316l;
        this.f57267B3 = c28769a.f133317m;
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17946a1) {
            c17946a1 = (C17946a1) m94929K2;
        } else {
            c17946a1 = null;
        }
        if (c17946a1 != null) {
            this.f58651V6 = c17946a1.m95395h();
            this.f58652W6 = c17946a1.m95394g();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: H2 */
    protected C28227x3 mo60969H2(int i11, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        return c28227x3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I2 */
    public int mo60974I2() {
        return super.mo60974I2() + this.f58656a7 + (((int) f58646e7) * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        if (this.f58652W6.length() > 0) {
            Rect rect = new Rect();
            C13704p1 m61649d = Companion.m61649d();
            String str = this.f58652W6;
            m61649d.getTextBounds(str, 0, str.length(), rect);
            this.f58655Z6 = rect.width();
            int height = rect.height();
            this.f58656a7 = height;
            this.f58657b7 = f58646e7 + (height * 0.75f);
        }
        this.f57273C3 = getDelegate().mo62032A4();
        C11407c c11407c = Companion;
        c11407c.m61649d().setColor(this.f57273C3);
        c11407c.m61648c().setColor(this.f57273C3);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: X */
    public void mo61031X(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        C17946a1 c17946a1;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        boolean z11 = true;
        if (this.f57413a3 != c28769a.f133312h || this.f57262A4 != c28769a.f133311g || this.f57261A3 != c28769a.f133316l || this.f57267B3 != c28769a.f133317m || this.f57273C3 != c28769a.f133308d) {
            return true;
        }
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17946a1) {
            c17946a1 = (C17946a1) m94929K2;
        } else {
            c17946a1 = null;
        }
        if (c17946a1 == null) {
            return false;
        }
        if (this.f58651V6 != c17946a1.m95395h()) {
            z11 = false;
        }
        return z11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
    }

    public final String getDisplayText() {
        return this.f58652W6;
    }

    public final float getDividerY() {
        return this.f58657b7;
    }

    public final int getSectionType() {
        return this.f58651V6;
    }

    public final int getTextHeight() {
        return this.f58656a7;
    }

    public final int getTextLeft() {
        return this.f58653X6;
    }

    public final int getTextRight() {
        return this.f58654Y6;
    }

    public final int getTextWidth() {
        return this.f58655Z6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: m2 */
    public void mo61086m2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = i12 + this.f58656a7 + (((int) f58646e7) * 2);
        int i16 = this.f58655Z6;
        int i17 = ((i11 + i13) - i16) / 2;
        this.f58653X6 = i17;
        this.f58654Y6 = i17 + i16;
        super.mo61086m2(i11, i15, i13, i14, z11);
    }

    public final void setDisplayText(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f58652W6 = str;
    }

    public final void setDividerY(float f11) {
        this.f58657b7 = f11;
    }

    public final void setSectionType(int i11) {
        this.f58651V6 = i11;
    }

    public final void setTextHeight(int i11) {
        this.f58656a7 = i11;
    }

    public final void setTextLeft(int i11) {
        this.f58653X6 = i11;
    }

    public final void setTextRight(int i11) {
        this.f58654Y6 = i11;
    }

    public final void setTextWidth(int i11) {
        this.f58655Z6 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58651V6 = 0;
        this.f58655Z6 = 0;
        this.f58656a7 = 0;
        this.f58653X6 = 0;
        this.f58654Y6 = 0;
        this.f58657b7 = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: y0 */
    public void mo61126y0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f58652W6.length() > 0) {
            canvas.drawText(this.f58652W6, this.f58653X6, f58646e7 + this.f58656a7, Companion.m61649d());
        }
        int i11 = this.f58653X6;
        float f11 = i11;
        float f12 = f58644c7;
        if (f11 > f12) {
            float f13 = this.f58657b7;
            int i12 = f58645d7;
            C11407c c11407c = Companion;
            canvas.drawLine(f12, f13, i11 - i12, f13, c11407c.m61648c());
            canvas.drawLine(i12 + this.f58654Y6, this.f58657b7, getMeasuredWidth() - f12, this.f58657b7, c11407c.m61648c());
        }
        super.mo61126y0(canvas);
    }
}
