package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import vg.C28227x3;

/* loaded from: classes5.dex */
public class ChatRowUnSupport extends ChatRow {

    /* renamed from: X6 */
    static TextPaint f58751X6 = null;

    /* renamed from: Y6 */
    static String f58752Y6 = null;

    /* renamed from: Z6 */
    static int f58753Z6 = 0;

    /* renamed from: a7 */
    static int f58754a7 = 0;

    /* renamed from: b7 */
    public static boolean f58755b7 = false;

    /* renamed from: V6 */
    int f58756V6;

    /* renamed from: W6 */
    int f58757W6;

    public ChatRowUnSupport(Context context) {
        super(context);
        if (f58751X6 == null || f58755b7) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58751X6 = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f58751X6.setColor(AbstractC11531v0.m62168L3());
            f58751X6.setTextSize(ChatRow.f57202L6);
            f58752Y6 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_unsupport_message);
            Rect rect = new Rect();
            TextPaint textPaint = f58751X6;
            String str = f58752Y6;
            textPaint.getTextBounds(str, 0, str.length(), rect);
            f58753Z6 = rect.width();
            f58754a7 = rect.height();
            f58755b7 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        c28227x3.f131648a = this.f57560z4.getBubblePaddingLeft() + f58753Z6 + this.f57560z4.getBubblePaddingRight();
        c28227x3.f131649b = f58754a7;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f58756V6 = i11 + getBubblePaddingLeft();
        this.f58757W6 = i12 - f58751X6.getFontMetricsInt().ascent;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_unsupport_message);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        canvas.drawText(f58752Y6, this.f58756V6, this.f58757W6, f58751X6);
    }
}
