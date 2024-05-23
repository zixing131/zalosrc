package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.zing.zalo.AbstractC8020f0;
import dj.C17945a0;
import dj.C17958e1;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowUndo extends ChatRowHasCaption {

    /* renamed from: H7 */
    public static boolean f58758H7 = false;

    /* renamed from: I7 */
    static final int f58759I7 = AbstractC23136l9.m118742r(24.0f);

    /* renamed from: B7 */
    int f58760B7;

    /* renamed from: C7 */
    int f58761C7;

    /* renamed from: D7 */
    boolean f58762D7;

    /* renamed from: E7 */
    int f58763E7;

    /* renamed from: F7 */
    int f58764F7;

    /* renamed from: G7 */
    boolean f58765G7;

    public ChatRowUndo(Context context) {
        super(context);
        this.f58762D7 = false;
        this.f58765G7 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58765G7 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: B2 */
    public C28227x3 mo60949B2(boolean z11, int i11, C28227x3 c28227x3) {
        C28227x3 mo60949B2 = super.mo60949B2(z11, i11, c28227x3);
        if (this.f58762D7) {
            int i12 = mo60949B2.f131648a;
            int i13 = f58759I7;
            int i14 = ChatRow.f57203M5;
            mo60949B2.f131648a = Math.max(i12, i13 + i14);
            mo60949B2.f131649b += i13 + i14;
        }
        return mo60949B2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        c28227x3.f131648a = getTextWidth() + getBubblePaddingLeft() + getBubblePaddingRight();
        c28227x3.f131649b = getTextHeight();
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f58762D7 = c17945a0.m95053X5();
        this.f58760B7 = -1;
        this.f58761C7 = -1;
        this.f58764F7 = -1;
        this.f58763E7 = -1;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a) || this.f58762D7 != c17945a0.m95053X5()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: f2 */
    public int mo61058f2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int mo61058f2 = super.mo61058f2(i11, i12, i13, i14, z11);
        if (this.f58762D7) {
            if (z11) {
                i15 = i11 + (ChatRow.f57203M5 / 2);
            } else {
                i15 = (i13 - f58759I7) - (ChatRow.f57203M5 / 2);
            }
            this.f58763E7 = i15;
            int i16 = ChatRow.f57203M5;
            this.f58764F7 = (i16 / 2) + mo61058f2;
            return mo61058f2 + f58759I7 + i16;
        }
        return mo61058f2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f58760B7 = i11 + getBubblePaddingLeft();
        this.f58761C7 = i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58760B7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58761C7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: h4 */
    protected AbstractC23214t.a mo61199h4(C17945a0 c17945a0, String str, int i11, boolean z11) {
        if (i11 > 0 && !TextUtils.isEmpty(str)) {
            return c17945a0.m95004S5(str, i11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:            if (r2 == false) goto L19;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61079k3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 == 1 && this.f58765G7 && m61690y4(f11, f12)) {
                getDelegate().mo62054M3(this.f57263B);
            }
            if (!super.mo61079k3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (this.f58762D7 && m61690y4(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58765G7 = z11;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        int i11;
        if (c17945a0.m95219o8()) {
            i11 = AbstractC8020f0.str_bubble_undo_sent_message;
        } else {
            i11 = AbstractC8020f0.str_bubble_delete_message;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        if (c17945a0.m94929K2() instanceof C17958e1) {
            return ((C17958e1) c17945a0.m94929K2()).m95420i();
        }
        return m118743r0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: p4 */
    protected boolean mo61430p4(int i11, C17945a0 c17945a0) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: s0 */
    public void mo61109s0(Canvas canvas) {
        Drawable m62240c2;
        super.mo61109s0(canvas);
        if (this.f58762D7) {
            if (this.f58765G7) {
                m62240c2 = AbstractC11531v0.m62235b2();
            } else {
                m62240c2 = AbstractC11531v0.m62240c2();
            }
            int i11 = this.f58763E7;
            int i12 = this.f58764F7;
            int i13 = f58759I7;
            m62240c2.setBounds(i11, i12, i11 + i13, i13 + i12);
            m62240c2.draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
    }

    /* renamed from: y4 */
    boolean m61690y4(float f11, float f12) {
        if (f11 >= this.f58763E7) {
            int i11 = f58759I7;
            if (f11 <= r0 + i11) {
                if (f12 >= this.f58764F7 && f12 <= r3 + i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
