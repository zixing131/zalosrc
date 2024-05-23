package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.zing.zalo.p077ui.widget.C13636g;
import dj.C17945a0;
import dj.C17984n0;
import me0.AbstractC23136l9;
import p450qj.C25301c;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowEcard extends ChatRow implements C13636g.c {

    /* renamed from: Z6 */
    public static final int f57753Z6 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: a7 */
    public static boolean f57754a7 = false;

    /* renamed from: V6 */
    private final C13636g f57755V6;

    /* renamed from: W6 */
    private float f57756W6;

    /* renamed from: X6 */
    private float f57757X6;

    /* renamed from: Y6 */
    private InterfaceC11352a f57758Y6;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowEcard$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11352a {
        /* renamed from: a */
        void mo61201a(C25301c c25301c, C17945a0 c17945a0);
    }

    public ChatRowEcard(Context context) {
        super(context);
        C13636g c13636g = new C13636g(this);
        this.f57755V6 = c13636g;
        c13636g.m76234p(this);
        if (f57754a7) {
            c13636g.m76232n();
            f57754a7 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int widthMeasurement = getWidthMeasurement() - (f57753Z6 * 2);
        this.f57755V6.m76237s(widthMeasurement, (int) (widthMeasurement / 1.55f));
        c28227x3.f131648a = this.f57755V6.m76222d();
        c28227x3.f131649b = this.f57755V6.m76220b();
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() instanceof C17984n0) {
            this.f57755V6.m76235q((C17984n0) c17945a0.m94929K2());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: J */
    protected boolean mo60976J() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        this.f57755V6.m76236r(getDelegate().mo62069W3());
        this.f57755V6.m76229k();
    }

    @Override // com.zing.zalo.p077ui.widget.C13636g.c
    /* renamed from: e */
    public void mo61200e(C25301c c25301c) {
        try {
            InterfaceC11352a interfaceC11352a = this.f57758Y6;
            if (interfaceC11352a != null) {
                interfaceC11352a.mo61201a(c25301c, this.f57263B);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f57756W6 = i11;
        this.f57757X6 = i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return AbstractC23136l9.m118728m0(getContext(), getDelegate().mo62071Y3()) - (f57753Z6 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingLeft() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        try {
            return "" + this.f57755V6.m76221c();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (!this.f57755V6.m76230l(motionEvent.getAction(), motionEvent.getX() - this.f57756W6, motionEvent.getY() - this.f57757X6) && !super.mo61075j3(motionEvent, i11, f11, f12)) {
            return false;
        }
        return true;
    }

    public void setEcardDelegate(InterfaceC11352a interfaceC11352a) {
        this.f57758Y6 = interfaceC11352a;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f57756W6, this.f57757X6);
        this.f57755V6.m76219a(canvas);
        canvas.restore();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t1 */
    protected boolean mo61112t1() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57755V6.m76233o();
    }
}
