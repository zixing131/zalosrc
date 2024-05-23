package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C18013y0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C31887d9;
import p716zh.C32098s;
import p716zh.C32119t6;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowRecommendLinkMp3 extends ChatRowRecommendLinkBase {

    /* renamed from: B8 */
    public static boolean f58514B8 = false;

    /* renamed from: C8 */
    static final int f58515C8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: D8 */
    static final int f58516D8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: E8 */
    static final int f58517E8 = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: F8 */
    static final int f58518F8 = AbstractC23136l9.m118742r(18.0f);

    /* renamed from: G8 */
    static final int f58519G8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: H8 */
    static C13704p1 f58520H8;

    /* renamed from: I8 */
    static C13704p1 f58521I8;

    /* renamed from: J8 */
    static C13704p1 f58522J8;

    /* renamed from: A8 */
    C3977j f58523A8;

    /* renamed from: b8 */
    C13697o f58524b8;

    /* renamed from: c8 */
    public String f58525c8;

    /* renamed from: d8 */
    private boolean f58526d8;

    /* renamed from: e8 */
    int f58527e8;

    /* renamed from: f8 */
    int f58528f8;

    /* renamed from: g8 */
    String f58529g8;

    /* renamed from: h8 */
    String f58530h8;

    /* renamed from: i8 */
    Rect f58531i8;

    /* renamed from: j8 */
    Drawable f58532j8;

    /* renamed from: k8 */
    BitmapDrawable f58533k8;

    /* renamed from: l8 */
    boolean f58534l8;

    /* renamed from: m8 */
    int f58535m8;

    /* renamed from: n8 */
    int f58536n8;

    /* renamed from: o8 */
    String f58537o8;

    /* renamed from: p8 */
    int f58538p8;

    /* renamed from: q8 */
    int f58539q8;

    /* renamed from: r8 */
    boolean f58540r8;

    /* renamed from: s8 */
    String f58541s8;

    /* renamed from: t8 */
    int f58542t8;

    /* renamed from: u8 */
    int f58543u8;

    /* renamed from: v8 */
    int f58544v8;

    /* renamed from: w8 */
    int f58545w8;

    /* renamed from: x8 */
    boolean f58546x8;

    /* renamed from: y8 */
    boolean f58547y8;

    /* renamed from: z8 */
    C3977j f58548z8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLinkMp3$a */
    /* loaded from: classes5.dex */
    public class C11399a extends C23999j {
        C11399a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRowRecommendLinkMp3 chatRowRecommendLinkMp3 = ChatRowRecommendLinkMp3.this;
                if (chatRowRecommendLinkMp3.f57263B != null && TextUtils.equals(str, chatRowRecommendLinkMp3.f58537o8) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    C3977j c3977j = ChatRowRecommendLinkMp3.this.f58523A8;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    ChatRowRecommendLinkMp3.this.f58533k8 = new BitmapDrawable(ChatRowRecommendLinkMp3.this.getContext().getResources(), c3979l.m18839c());
                    ChatRowRecommendLinkMp3 chatRowRecommendLinkMp32 = ChatRowRecommendLinkMp3.this;
                    chatRowRecommendLinkMp32.f58534l8 = true;
                    chatRowRecommendLinkMp32.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLinkMp3$b */
    /* loaded from: classes5.dex */
    public class C11400b extends C23999j {
        C11400b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            boolean z11;
            try {
                ChatRowRecommendLinkMp3 chatRowRecommendLinkMp3 = ChatRowRecommendLinkMp3.this;
                if (chatRowRecommendLinkMp3.f57263B != null && TextUtils.equals(str, chatRowRecommendLinkMp3.f58525c8) && c3979l != null && c3979l.m18839c() != null) {
                    boolean z12 = true;
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendLinkMp3.this.f58526d8 = true;
                    C3977j c3977j = ChatRowRecommendLinkMp3.this.f58548z8;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13697o c13697o = ChatRowRecommendLinkMp3.this.f58489C7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() != 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c13697o.m76480u(m18839c, z11);
                    C13697o c13697o2 = ChatRowRecommendLinkMp3.this.f58524b8;
                    Bitmap m18839c2 = c3979l.m18839c();
                    if (c23995f.m125666q() == 4) {
                        z12 = false;
                    }
                    c13697o2.m76480u(m18839c2, z12);
                    ChatRowRecommendLinkMp3.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowRecommendLinkMp3(Context context) {
        super(context);
        this.f58531i8 = new Rect();
        this.f58541s8 = "";
        this.f58548z8 = new C3977j(context);
        this.f58523A8 = new C3977j(context);
        if (f58520H8 == null || f58514B8) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58520H8 = c13704p1;
            c13704p1.m76613c();
            f58520H8.setColor(-515);
            f58520H8.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p12 = new C13704p1(1);
            f58521I8 = c13704p12;
            Typeface typeface = Typeface.DEFAULT;
            c13704p12.setTypeface(typeface);
            f58521I8.setColor(-515);
            f58521I8.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p13 = new C13704p1(1);
            f58522J8 = c13704p13;
            c13704p13.setColor(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
            f58522J8.setTypeface(typeface);
            f58522J8.setTextSize(AbstractC23136l9.m118759w1(12));
            f58514B8 = false;
        }
        this.f58489C7.m76482w(ChatRow.f57255z5.getColor());
        this.f58489C7.m76461I(ChatRow.f57183C5);
        C13697o c13697o = this.f58489C7;
        int i11 = f58517E8;
        c13697o.m76463K(5, i11, i11);
        this.f58524b8 = new C13697o(this);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int m76472k = this.f58524b8.m76472k();
        if (mo61163l4()) {
            m76472k += ChatRow.f57201L5 + getTextHeight();
        }
        c28227x3.f131649b = m76472k;
        c28227x3.f131648a = this.f58524b8.m76473l();
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        C31887d9 m155014e;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (this.f57560z4.mo60993N() && c17945a0.m94963O0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57271C1 = z12;
        if (c17945a0.m94929K2() instanceof C18013y0) {
            C18013y0 c18013y0 = (C18013y0) c17945a0.m94929K2();
            C32098s c32098s = c18013y0.f91251B;
            String str = "";
            if (c32098s != null) {
                String str2 = c32098s.f147951a;
                if (str2 == null) {
                    str2 = "";
                }
                this.f58500N7 = str2;
                String str3 = c32098s.f147953c;
                if (str3 == null) {
                    str3 = "";
                }
                this.f58529g8 = str3;
                this.f58499M7 = c32098s.f147956f;
                String str4 = c32098s.f147957g;
                if (str4 == null) {
                    str4 = "";
                }
                this.f58530h8 = str4;
                this.f58501O7 = c32098s.f147954d;
                this.f58537o8 = c32098s.f147960j;
            } else {
                this.f58529g8 = c18013y0.f91011p;
                this.f58499M7 = 0;
                this.f58530h8 = "";
            }
            String str5 = c18013y0.f91013r;
            if (str5 != null) {
                str = str5;
            }
            this.f58525c8 = str;
        }
        if (getDelegate().mo62101s4() == 1 && m60955D1(c17945a0) && (m155014e = C32119t6.m155009c().m155014e(2)) != null) {
            this.f58547y8 = true;
            this.f58541s8 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sent_via), m155014e.m153213c());
        }
        this.f58548z8.setImageInfo(null);
        this.f58523A8.setImageInfo(null);
    }

    /* renamed from: H4 */
    boolean m61624H4(float f11, float f12) {
        try {
            if (f11 < this.f58542t8 || f11 > r1 + this.f58545w8 || f12 < this.f58543u8 - AbstractC23136l9.m118742r(15.0f)) {
                return false;
            }
            if (f12 > this.f58543u8 + AbstractC23136l9.m118742r(15.0f)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f58524b8.m76463K(5, i11, i11 / 3);
        int m76473l = this.f58524b8.m76473l();
        int i12 = f58515C8;
        int i13 = (m76473l - i12) - f58517E8;
        int i14 = f58519G8;
        int i15 = (((i13 - i14) - i14) - f58518F8) - i12;
        if (!TextUtils.isEmpty(this.f58529g8)) {
            this.f58490D7 = AbstractC23214t.m119625l(this.f58529g8, f58520H8, i15, 1);
        }
        if (!TextUtils.isEmpty(this.f58530h8)) {
            this.f58493G7 = AbstractC23214t.m119625l(this.f58530h8, f58521I8, i15, 1);
        }
        if (this.f58547y8 && !TextUtils.isEmpty(this.f58541s8)) {
            Rect rect = new Rect();
            C13704p1 c13704p1 = f58522J8;
            String str = this.f58541s8;
            c13704p1.getTextBounds(str, 0, str.length(), rect);
            this.f58545w8 = rect.width();
            this.f58544v8 = rect.height();
        }
    }

    /* renamed from: I4 */
    boolean m61625I4(float f11, float f12) {
        try {
            if (f11 < this.f58538p8 || f11 > r1 + this.f58489C7.m76473l()) {
                return false;
            }
            if (f12 < this.f58539q8) {
                return false;
            }
            if (f12 > r4 + this.f58489C7.m76472k()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: J4 */
    void m61626J4() {
        try {
            if (TextUtils.isEmpty(this.f58525c8)) {
                this.f58489C7.m76477r();
                this.f58524b8.m76477r();
                invalidate();
                this.f58526d8 = true;
                return;
            }
            C24003n m120136k0 = C23278z2.m120136k0();
            this.f58489C7.m76477r();
            this.f58524b8.m76477r();
            if (m60988L3() || C23999j.m125696L2(this.f58525c8, m120136k0)) {
                ((C23528a) this.f57275D.m123612r(this.f58548z8)).m123579C(this.f58525c8, m120136k0, new C11400b());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K4 */
    void m61627K4() {
        try {
            if (TextUtils.isEmpty(this.f58537o8)) {
                return;
            }
            if (!m60988L3() && !C23999j.m125696L2(this.f58537o8, C23278z2.m120146o0())) {
                return;
            }
            ((C23528a) this.f57275D.m123612r(this.f58523A8)).m123579C(this.f58537o8, C23278z2.m120146o0(), new C11399a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        try {
            m61616A4(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58534l8) {
            m61627K4();
        }
        if (!this.f58526d8) {
            m61626J4();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: d2 */
    public int mo61051d2(int i11, int i12, int i13, int i14, boolean z11) {
        int mo61051d2 = super.mo61051d2(i11, i12, i13, i14, z11);
        if (this.f58547y8) {
            if (m60986L1()) {
                this.f58542t8 = this.f57391W1 + this.f57401Y1 + ChatRow.f57189F5;
                this.f58543u8 = this.f57396X1;
                return mo61051d2;
            }
            this.f58542t8 = i11 + getBubblePaddingLeft();
            int i15 = ChatRow.f57189F5;
            int i16 = this.f58544v8;
            this.f58543u8 = mo61051d2 + i15 + i16;
            return mo61051d2 + i16 + (i15 * 2);
        }
        return mo61051d2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        Rect rect = this.f58531i8;
        int i15 = f58516D8;
        rect.set(i11 + i15, i12, i13 - i15, this.f58524b8.m76472k() + i12);
        C13697o c13697o = this.f58524b8;
        Rect rect2 = this.f58531i8;
        c13697o.m76460H(rect2.left, rect2.top);
        Rect rect3 = this.f58531i8;
        int i16 = rect3.left;
        int i17 = f58515C8;
        int i18 = i16 + i17;
        this.f58538p8 = i18;
        int i19 = rect3.bottom;
        int i21 = f58517E8;
        int i22 = (i19 - i21) - i17;
        this.f58539q8 = i22;
        this.f58489C7.m76460H(i18, i22);
        StaticLayout staticLayout = this.f58490D7;
        if (staticLayout != null) {
            this.f58491E7 = this.f58538p8 + i21 + f58519G8;
            this.f58492F7 = ((this.f58539q8 + (i21 / 2)) - staticLayout.getHeight()) - (i17 / 2);
        }
        if (this.f58493G7 != null) {
            this.f58494H7 = this.f58538p8 + i21 + f58519G8;
            this.f58495I7 = this.f58539q8 + (i21 / 2) + (i17 / 2);
        }
        Rect rect4 = this.f58531i8;
        this.f58535m8 = (rect4.right - i17) - f58518F8;
        this.f58536n8 = rect4.top + i17;
        if (mo61163l4()) {
            this.f58527e8 = i11 + getBubblePaddingLeft();
            this.f58528f8 = this.f58531i8.bottom + ChatRow.f57201L5;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f58516D8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58527e8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58528f8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f58540r8 && m61625I4(f11, f12)) {
                    m61616A4(true);
                    return true;
                }
                if (this.f58546x8 && m61624H4(f11, f12)) {
                    getDelegate().mo62052L3(m61008Q0(this.f57263B), m61003P0(this.f57263B));
                    return true;
                }
            }
        } else {
            boolean m61625I4 = m61625I4(f11, f12);
            this.f58540r8 = m61625I4;
            if (this.f58547y8 && m61624H4(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58546x8 = z11;
            if (m61625I4 | z11) {
                return true;
            }
        }
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        super.mo61093o0(canvas, i11, i12, i13, i14);
        this.f58524b8.m76467d(canvas);
        this.f58532j8.setBounds(this.f58531i8);
        this.f58532j8.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: q0 */
    public void mo61103q0(Canvas canvas) {
        super.mo61103q0(canvas);
        if (this.f58547y8) {
            canvas.drawText(this.f58541s8, this.f58542t8, this.f58543u8, f58522J8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        this.f58489C7.m76467d(canvas);
        if (this.f58490D7 != null) {
            canvas.save();
            canvas.translate(this.f58491E7, this.f58492F7);
            this.f58490D7.draw(canvas);
            canvas.restore();
        }
        if (this.f58493G7 != null) {
            canvas.save();
            canvas.translate(this.f58494H7, this.f58495I7);
            this.f58493G7.draw(canvas);
            canvas.restore();
        }
        BitmapDrawable bitmapDrawable = this.f58533k8;
        if (bitmapDrawable != null) {
            int i11 = this.f58535m8;
            int i12 = this.f58536n8;
            int i13 = f58518F8;
            bitmapDrawable.setBounds(i11, i12, i11 + i13, i13 + i12);
            this.f58533k8.draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58499M7 = 0;
        this.f58529g8 = "";
        this.f58530h8 = "";
        this.f58525c8 = "";
        this.f58501O7 = "";
        this.f58512Z7 = false;
        this.f58509W7.m76349t(false);
        this.f58490D7 = null;
        this.f58493G7 = null;
        this.f58537o8 = "";
        this.f58534l8 = false;
        this.f58538p8 = 0;
        this.f58539q8 = 0;
        this.f58547y8 = false;
        this.f58533k8 = null;
        this.f58488B7 = true;
        this.f58526d8 = false;
        this.f58524b8.m76461I(ChatRow.f57185D5);
        this.f58532j8 = AbstractC11531v0.m62241c3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C28227x3 mo61130z2 = super.mo61130z2(i11, i12, i13, c28227x3);
        if (this.f58547y8) {
            if (!m60986L1()) {
                mo61130z2.f131649b += (ChatRow.f57189F5 * 2) + this.f58544v8;
            }
            mo61130z2.f131648a = i11;
        }
        if (mo61130z2.f131649b == 0 && !mo61163l4()) {
            mo61130z2.f131649b = f58516D8;
            this.f58524b8.m76461I(ChatRow.f57183C5);
            this.f58532j8 = AbstractC11531v0.m62236b3();
        }
        return mo61130z2;
    }
}
