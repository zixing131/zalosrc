package com.zing.zalo.p077ui.chat.chatrow;

import android.graphics.Paint;
import com.zing.zalo.AbstractC16781w;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import me0.C23212s8;

/* renamed from: com.zing.zalo.ui.chat.chatrow.c2 */
/* loaded from: classes5.dex */
final class C11461c2 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ ChatRowWebContentPlus f59096q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11461c2(ChatRowWebContentPlus chatRowWebContentPlus) {
        super(0);
        this.f59096q = chatRowWebContentPlus;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final Paint mo12V4() {
        Paint paint = new Paint();
        ChatRowWebContentPlus chatRowWebContentPlus = this.f59096q;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(C23212s8.m119607o(chatRowWebContentPlus.getContext(), AbstractC16781w.BubbleChatBackgroundSearchHighlight));
        return paint;
    }
}
