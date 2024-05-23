package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowRecommendSticker extends ChatRow {

    /* renamed from: l7 */
    public static boolean f58613l7 = false;

    /* renamed from: p7 */
    static TextPaint f58617p7;

    /* renamed from: q7 */
    static C13704p1 f58618q7;

    /* renamed from: r7 */
    static String f58619r7;

    /* renamed from: s7 */
    static C13704p1 f58620s7;

    /* renamed from: t7 */
    static int f58621t7;

    /* renamed from: u7 */
    static int f58622u7;

    /* renamed from: y7 */
    static int f58626y7;

    /* renamed from: V6 */
    StaticLayout f58627V6;

    /* renamed from: W6 */
    Drawable f58628W6;

    /* renamed from: X6 */
    boolean f58629X6;

    /* renamed from: Y6 */
    int f58630Y6;

    /* renamed from: Z6 */
    int f58631Z6;

    /* renamed from: a7 */
    int f58632a7;

    /* renamed from: b7 */
    int f58633b7;

    /* renamed from: c7 */
    int f58634c7;

    /* renamed from: d7 */
    int f58635d7;

    /* renamed from: e7 */
    int f58636e7;

    /* renamed from: f7 */
    int f58637f7;

    /* renamed from: g7 */
    int f58638g7;

    /* renamed from: h7 */
    String f58639h7;

    /* renamed from: i7 */
    boolean f58640i7;

    /* renamed from: j7 */
    String f58641j7;

    /* renamed from: k7 */
    C3977j f58642k7;

    /* renamed from: m7 */
    static final int f58614m7 = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: n7 */
    static final int f58615n7 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: o7 */
    static final int f58616o7 = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: v7 */
    static int f58623v7 = -1;

    /* renamed from: w7 */
    static final int f58624w7 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: x7 */
    static String f58625x7 = "";

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendSticker$a */
    /* loaded from: classes5.dex */
    public class C11404a extends C23999j {
        C11404a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRowRecommendSticker chatRowRecommendSticker = ChatRowRecommendSticker.this;
                if (chatRowRecommendSticker.f57263B != null && TextUtils.equals(str, chatRowRecommendSticker.f58639h7) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendSticker chatRowRecommendSticker2 = ChatRowRecommendSticker.this;
                    chatRowRecommendSticker2.f58640i7 = true;
                    C3977j c3977j = chatRowRecommendSticker2.f58642k7;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    ChatRowRecommendSticker.this.f58628W6 = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    ChatRowRecommendSticker.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowRecommendSticker(Context context) {
        super(context);
        this.f58629X6 = false;
        this.f58639h7 = "";
        this.f58641j7 = "";
        this.f58642k7 = new C3977j(context);
        this.f58628W6 = C23278z2.m120120d0().f116261b;
        if (f58617p7 == null || f58613l7) {
            m61639U3();
            f58613l7 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13 = f58623v7;
        int i14 = f58626y7;
        StaticLayout staticLayout = this.f58627V6;
        if (staticLayout != null) {
            i13 = Math.max(i13, staticLayout.getWidth());
            i14 += this.f58627V6.getHeight() + f58616o7;
        }
        int i15 = f58614m7;
        int i16 = i13 + f58624w7 + i15;
        int max = Math.max(i14, i15);
        c28227x3.f131648a = getBubblePaddingLeft() + i16 + getBubblePaddingRight();
        c28227x3.f131649b = max;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f58629X6 = c17945a0.m94987Q7();
        if (c17945a0.m94929K2() != null) {
            if (!TextUtils.isEmpty(c17945a0.m94929K2().f91011p)) {
                this.f58641j7 = c17945a0.m94929K2().f91011p;
            }
            if (!TextUtils.isEmpty(c17945a0.m94929K2().f91013r)) {
                this.f58639h7 = c17945a0.m94929K2().f91013r;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        if (!TextUtils.isEmpty(this.f58641j7)) {
            this.f58627V6 = AbstractC23214t.m119625l(this.f58641j7, f58618q7, Math.min((int) Math.ceil(f58618q7.measureText(this.f58641j7)), (((i11 - getBubblePaddingLeft()) - f58614m7) - getBubblePaddingRight()) - f58624w7), 2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return false;
    }

    /* renamed from: U3 */
    void m61639U3() {
        C13704p1 c13704p1 = new C13704p1(1);
        f58617p7 = c13704p1;
        c13704p1.setTypeface(Typeface.DEFAULT);
        f58617p7.setColor(AbstractC11531v0.m62143G3());
        f58617p7.setTextSize(AbstractC23136l9.m118759w1(14));
        f58625x7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_recommend_sticker_set_bubble);
        Rect rect = new Rect();
        TextPaint textPaint = f58617p7;
        String str = f58625x7;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        f58623v7 = rect.width();
        f58626y7 = rect.height();
        C13704p1 c13704p12 = new C13704p1(1);
        f58618q7 = c13704p12;
        c13704p12.m76613c();
        f58618q7.setColor(AbstractC11531v0.m62153I3());
        f58618q7.setTextSize(AbstractC23136l9.m118759w1(14));
        C13704p1 c13704p13 = new C13704p1(1);
        f58620s7 = c13704p13;
        c13704p13.m76613c();
        f58620s7.setColor(AbstractC11531v0.m62222Y2());
        f58620s7.setTextSize(AbstractC23136l9.m118759w1(12));
        String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_msg_recommend_sticker_download);
        f58619r7 = string;
        f58621t7 = AbstractC23136l9.m118764y0(f58620s7, string);
        f58622u7 = AbstractC23136l9.m118761x0(f58620s7, f58619r7);
    }

    /* renamed from: V3 */
    void m61640V3() {
        try {
            if (TextUtils.isEmpty(this.f58639h7)) {
                return;
            }
            if (!getDelegate().mo62069W3() && !C23999j.m125696L2(this.f58639h7, C23278z2.m120120d0())) {
                return;
            }
            ((C23528a) this.f57275D.m123612r(this.f58642k7)).m123579C(this.f58639h7, C23278z2.m120120d0(), new C11404a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58640i7) {
            m61640V3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: d2 */
    public int mo61051d2(int i11, int i12, int i13, int i14, boolean z11) {
        int mo61051d2 = super.mo61051d2(i11, i12, i13, i14, z11);
        if (this.f58629X6) {
            int i15 = ChatRow.f57201L5;
            int i16 = mo61051d2 + i15;
            this.f58638g7 = i16;
            this.f58636e7 = ((i11 + i13) / 2) - (f58621t7 / 2);
            int i17 = f58615n7;
            int i18 = f58622u7;
            this.f58637f7 = i16 + i17 + i18;
            return mo61051d2 + i15 + i18 + (i17 * 2);
        }
        return mo61051d2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int bubblePaddingLeft = i11 + getBubblePaddingLeft();
        this.f58630Y6 = bubblePaddingLeft;
        this.f58631Z6 = i12;
        int i15 = bubblePaddingLeft + f58614m7 + f58624w7;
        this.f58632a7 = i15;
        int i16 = i12 + f58626y7;
        this.f58633b7 = i16;
        this.f58634c7 = i15;
        this.f58635d7 = i16 + f58616o7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        return AbstractC23136l9.m118742r(30.0f);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: q0 */
    public void mo61103q0(Canvas canvas) {
        super.mo61103q0(canvas);
        if (this.f58629X6) {
            canvas.drawText(f58619r7, this.f58636e7, this.f58637f7, f58620s7);
            float f11 = this.f57530u0 + ChatRow.f57195I5;
            int i11 = this.f58638g7;
            canvas.drawLine(f11, i11, this.f57536v0 - r1, i11, ChatRow.f57255z5);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        Drawable drawable = this.f58628W6;
        int i11 = this.f58630Y6;
        int i12 = this.f58631Z6;
        int i13 = f58614m7;
        drawable.setBounds(i11, i12, i11 + i13, i13 + i12);
        this.f58628W6.draw(canvas);
        canvas.drawText(f58625x7, this.f58632a7, this.f58633b7, f58617p7);
        if (this.f58627V6 != null) {
            canvas.save();
            canvas.translate(this.f58634c7, this.f58635d7);
            this.f58627V6.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58639h7 = "";
        this.f58641j7 = "";
        this.f58627V6 = null;
        this.f58640i7 = false;
        this.f58628W6 = C23278z2.m120120d0().f116261b;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C28227x3 mo61130z2 = super.mo61130z2(i11, i12, i13, c28227x3);
        if (this.f58629X6) {
            mo61130z2.f131648a = Math.max(mo61130z2.f131648a, f58621t7 + getBubblePaddingLeft() + getBubblePaddingRight());
            mo61130z2.f131649b += ChatRow.f57201L5 + f58622u7 + (f58615n7 * 2);
        }
        return mo61130z2;
    }
}
