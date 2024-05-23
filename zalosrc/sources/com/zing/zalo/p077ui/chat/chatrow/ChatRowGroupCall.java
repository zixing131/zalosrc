package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23212s8;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowGroupCall extends ChatRow {

    /* renamed from: V6 */
    private int f57948V6;

    /* renamed from: W6 */
    private Drawable f57949W6;

    /* renamed from: X6 */
    private int f57950X6;

    /* renamed from: Y6 */
    private int f57951Y6;

    /* renamed from: Z6 */
    private final String f57952Z6;

    /* renamed from: a7 */
    private C13704p1 f57953a7;

    /* renamed from: b7 */
    private int f57954b7;

    /* renamed from: c7 */
    private int f57955c7;

    /* renamed from: d7 */
    private int f57956d7;

    /* renamed from: e7 */
    private int f57957e7;

    /* renamed from: f7 */
    private final String f57958f7;

    /* renamed from: g7 */
    private TextPaint f57959g7;

    /* renamed from: h7 */
    private int f57960h7;

    /* renamed from: i7 */
    private int f57961i7;

    /* renamed from: j7 */
    private int f57962j7;

    /* renamed from: k7 */
    private int f57963k7;

    /* renamed from: l7 */
    private Drawable f57964l7;

    /* renamed from: m7 */
    private int f57965m7;

    /* renamed from: n7 */
    private int f57966n7;

    /* renamed from: o7 */
    private int f57967o7;

    /* renamed from: p7 */
    private int f57968p7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowGroupCall(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f57948V6 = AbstractC23136l9.m118742r(180.0f);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_bubble_txt);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f57952Z6 = m118743r0;
        this.f57953a7 = new C13704p1(1);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_bubble_btn);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f57958f7 = m118743r02;
        this.f57959g7 = new C13704p1(1);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        this.f57964l7 = x3Var.m62551Y();
        this.f57953a7.m76613c();
        this.f57953a7.setColor(x3Var.m62529Q1());
        this.f57953a7.setTextSize(AbstractC23136l9.m118742r(14.0f));
        this.f57959g7.setColor(C23212s8.m119607o(context, AbstractC16781w.TextColor6));
        this.f57959g7.setTextSize(AbstractC23136l9.m118742r(14.0f));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int m116580c;
        AbstractC19074t.m100208f(c28227x3, "result");
        Drawable drawable = this.f57949W6;
        Drawable drawable2 = null;
        if (drawable == null) {
            AbstractC19074t.m100223u("iconDrawable");
            drawable = null;
        }
        m116580c = AbstractC22543l.m116580c(drawable.getIntrinsicWidth() + ChatRow.f57189F5 + this.f57954b7, this.f57948V6);
        c28227x3.f131648a = m116580c;
        this.f57965m7 = (m116580c - getBubblePaddingLeft()) - getBubblePaddingRight();
        int i13 = ChatRow.f57193H5;
        this.f57966n7 = this.f57961i7 + i13 + i13;
        Drawable drawable3 = this.f57949W6;
        if (drawable3 == null) {
            AbstractC19074t.m100223u("iconDrawable");
        } else {
            drawable2 = drawable3;
        }
        c28227x3.f131649b = drawable2.getIntrinsicHeight() + i13 + this.f57966n7;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        Drawable m62513L0;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m95032V6()) {
            m62513L0 = AbstractC11531v0.Companion.m62566d1();
            AbstractC19074t.m100205c(m62513L0);
        } else {
            m62513L0 = AbstractC11531v0.Companion.m62513L0();
            AbstractC19074t.m100205c(m62513L0);
        }
        this.f57949W6 = m62513L0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f57954b7 = AbstractC23136l9.m118764y0(ChatRow.f57251x5, this.f57952Z6);
        this.f57955c7 = AbstractC23136l9.m118761x0(ChatRow.f57251x5, this.f57952Z6);
        this.f57960h7 = AbstractC23136l9.m118764y0(ChatRow.f57251x5, this.f57958f7);
        this.f57961i7 = AbstractC23136l9.m118761x0(ChatRow.f57251x5, this.f57958f7);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: R */
    protected boolean mo61011R() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int bubblePaddingLeft = getBubblePaddingLeft() + i11;
        this.f57950X6 = bubblePaddingLeft;
        this.f57951Y6 = i12;
        Drawable drawable = this.f57949W6;
        Drawable drawable2 = null;
        if (drawable == null) {
            AbstractC19074t.m100223u("iconDrawable");
            drawable = null;
        }
        this.f57956d7 = bubblePaddingLeft + drawable.getIntrinsicWidth() + ChatRow.f57189F5;
        int i15 = this.f57951Y6;
        Drawable drawable3 = this.f57949W6;
        if (drawable3 == null) {
            AbstractC19074t.m100223u("iconDrawable");
            drawable3 = null;
        }
        this.f57957e7 = i15 + (drawable3.getIntrinsicHeight() / 2) + (this.f57955c7 / 2);
        this.f57967o7 = this.f57950X6;
        int i16 = this.f57951Y6;
        Drawable drawable4 = this.f57949W6;
        if (drawable4 == null) {
            AbstractC19074t.m100223u("iconDrawable");
        } else {
            drawable2 = drawable4;
        }
        int intrinsicHeight = i16 + drawable2.getIntrinsicHeight();
        int i17 = ChatRow.f57193H5;
        int i18 = intrinsicHeight + i17;
        this.f57968p7 = i18;
        this.f57962j7 = (i11 + ((i13 - i11) / 2)) - (this.f57960h7 / 2);
        this.f57963k7 = i18 + i17 + this.f57961i7;
    }

    public final int getMIN_WIDTH() {
        return this.f57948V6;
    }

    public final void setMIN_WIDTH(int i11) {
        this.f57948V6 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Drawable drawable = this.f57949W6;
        if (drawable == null) {
            AbstractC19074t.m100223u("iconDrawable");
            drawable = null;
        }
        AbstractC28236y3.m142204o(drawable, this.f57950X6, this.f57951Y6).draw(canvas);
        canvas.drawText(this.f57952Z6, this.f57956d7, this.f57957e7, this.f57953a7);
        Drawable drawable2 = this.f57964l7;
        if (drawable2 != null) {
            int i11 = this.f57967o7;
            int i12 = this.f57968p7;
            drawable2.setBounds(i11, i12, this.f57965m7 + i11, this.f57966n7 + i12);
        }
        Drawable drawable3 = this.f57964l7;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        canvas.drawText(this.f57958f7, this.f57962j7, this.f57963k7, this.f57959g7);
    }
}
