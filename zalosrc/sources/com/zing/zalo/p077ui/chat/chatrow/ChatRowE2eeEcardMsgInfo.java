package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import bp0.AbstractC3096i0;
import dj.C17945a0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowE2eeEcardMsgInfo extends ChatRowMsgInfo {

    /* renamed from: q8 */
    private final int f57744q8;

    /* renamed from: r8 */
    private final int f57745r8;

    /* renamed from: s8 */
    private Drawable f57746s8;

    /* renamed from: t8 */
    private int f57747t8;

    /* renamed from: u8 */
    private int f57748u8;

    /* renamed from: v8 */
    private int f57749v8;

    /* renamed from: w8 */
    private int f57750w8;

    /* renamed from: x8 */
    private final int f57751x8;

    /* renamed from: y8 */
    private Paint f57752y8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowE2eeEcardMsgInfo(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f57744q8 = AbstractC23136l9.m118742r(24.0f);
        this.f57745r8 = AbstractC23136l9.m118742r(4.0f);
        this.f57751x8 = (AbstractC23136l9.m118683W(context) - (ChatRowMsgInfo.f58151g8 * 2)) - (AbstractC23136l9.m118742r(32.0f) * 2);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(AbstractC23136l9.m118742r(1.0f));
        paint.setColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        paint.setAlpha(20);
        this.f57752y8 = paint;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        AbstractC19074t.m100208f(c28227x3, "result");
        Drawable drawable = this.f57746s8;
        int i14 = 0;
        if (drawable != null) {
            i14 = AbstractC3096i0.m15527a0(0, drawable.getIntrinsicWidth() + (ChatRowMsgInfo.f58151g8 * 2));
            i13 = drawable.getIntrinsicHeight() + (this.f57744q8 * 2);
        } else {
            i13 = 0;
        }
        int textWidth = getTextWidth();
        int i15 = ChatRowMsgInfo.f58151g8;
        int m15527a0 = AbstractC3096i0.m15527a0(i14, textWidth + (i15 * 2));
        int textHeight = i13 + getTextHeight() + i15 + this.f57745r8;
        c28227x3.f131648a = m15527a0;
        c28227x3.f131649b = textHeight;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f57746s8 = AbstractC11531v0.Companion.m62510K0();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = (i11 + i13) / 2;
        this.f58166G7 = i15 - (this.f57422c0 / 2);
        Drawable drawable = this.f57746s8;
        if (drawable != null) {
            int i16 = i12 + this.f57744q8;
            this.f57747t8 = i15 - (drawable.getIntrinsicWidth() / 2);
            this.f57748u8 = i16;
            int intrinsicHeight = i16 + drawable.getIntrinsicHeight() + this.f57744q8;
            this.f57749v8 = this.f58166G7;
            this.f57750w8 = intrinsicHeight;
            i12 = intrinsicHeight + ChatRowMsgInfo.f58151g8;
        }
        this.f58162C7 = this.f58166G7 + ChatRowMsgInfo.f58151g8;
        this.f58163D7 = i12;
    }

    public final Drawable getImageDrawable() {
        return this.f57746s8;
    }

    public final Paint getLinePaint() {
        return this.f57752y8;
    }

    public final int getMImageX() {
        return this.f57747t8;
    }

    public final int getMImageY() {
        return this.f57748u8;
    }

    public final int getMLineX() {
        return this.f57749v8;
    }

    public final int getMLineY() {
        return this.f57750w8;
    }

    public final int getMaxTextWidth() {
        return this.f57751x8;
    }

    public final int getPADDING_BOTTOM_TEXT() {
        return this.f57745r8;
    }

    public final int getPADDING_TOP() {
        return this.f57744q8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: h4 */
    protected AbstractC23214t.a mo61199h4(C17945a0 c17945a0, String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        int i12 = this.f57751x8;
        if (i12 <= 0) {
            return null;
        }
        return c17945a0.m94948M5(i12);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.f57746s8 = drawable;
    }

    public final void setLinePaint(Paint paint) {
        AbstractC19074t.m100208f(paint, "<set-?>");
        this.f57752y8 = paint;
    }

    public final void setMImageX(int i11) {
        this.f57747t8 = i11;
    }

    public final void setMImageY(int i11) {
        this.f57748u8 = i11;
    }

    public final void setMLineX(int i11) {
        this.f57749v8 = i11;
    }

    public final void setMLineY(int i11) {
        this.f57750w8 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Drawable drawable = this.f57746s8;
        if (drawable != null) {
            int i11 = this.f57747t8;
            drawable.setBounds(i11, this.f57748u8, drawable.getIntrinsicWidth() + i11, this.f57748u8 + drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            int i12 = this.f57749v8;
            int i13 = this.f57750w8;
            canvas.drawLine(i12, i13, i12 + this.f57422c0, i13, this.f57752y8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57747t8 = -1;
        this.f57748u8 = -1;
        this.f57749v8 = -1;
        this.f57750w8 = -1;
    }
}
