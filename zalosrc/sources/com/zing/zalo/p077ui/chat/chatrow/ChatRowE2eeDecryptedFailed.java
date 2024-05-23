package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowE2eeDecryptedFailed extends ChatRowHasCaption {
    public static final C11351a Companion = new C11351a(null);

    /* renamed from: G7 */
    private static final int f57737G7 = AbstractC23136l9.m118742r(13.0f);

    /* renamed from: H7 */
    private static final int f57738H7 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: B7 */
    private boolean f57739B7;

    /* renamed from: C7 */
    private int f57740C7;

    /* renamed from: D7 */
    private int f57741D7;

    /* renamed from: E7 */
    private int f57742E7;

    /* renamed from: F7 */
    private int f57743F7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowE2eeDecryptedFailed$a */
    /* loaded from: classes5.dex */
    public static final class C11351a {
        private C11351a() {
        }

        public /* synthetic */ C11351a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowE2eeDecryptedFailed(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        int i13 = f57738H7;
        int i14 = f57737G7;
        c28227x3.f131648a = i13 + i14 + getTextWidth() + (i13 * 2);
        c28227x3.f131649b = Math.max(getTextHeight(), i14);
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f57739B7 = c17945a0.m95187l6();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = f57738H7;
        int i16 = i11 + i15;
        this.f57742E7 = i16;
        int i17 = (i12 + i14) / 2;
        int i18 = f57737G7;
        this.f57743F7 = i17 - (i18 / 2);
        this.f57740C7 = i16 + i18 + i15;
        this.f57741D7 = i17 - (getTextHeight() / 2);
    }

    public final int getMIconX() {
        return this.f57742E7;
    }

    public final int getMIconY() {
        return this.f57743F7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f57740C7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f57741D7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: h4 */
    protected AbstractC23214t.a mo61199h4(C17945a0 c17945a0, String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (i11 <= 0) {
            return null;
        }
        return c17945a0.m94940L5(this.f57739B7, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return (i11 - f57737G7) - (f57738H7 * 3);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: l4 */
    public boolean mo61163l4() {
        return true;
    }

    public final void setMIconX(int i11) {
        this.f57742E7 = i11;
    }

    public final void setMIconY(int i11) {
        this.f57743F7 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        Drawable m62497G;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f57739B7) {
            m62497G = AbstractC11531v0.Companion.m62500H();
        } else {
            m62497G = AbstractC11531v0.Companion.m62497G();
        }
        int i11 = this.f57742E7;
        int i12 = this.f57743F7;
        int i13 = f57737G7;
        m62497G.setBounds(i11, i12, i11 + i13, i13 + i12);
        m62497G.draw(canvas);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57739B7 = false;
        this.f57741D7 = -1;
        this.f57740C7 = -1;
        this.f57742E7 = -1;
        this.f57743F7 = -1;
    }
}
