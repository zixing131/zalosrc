package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.C28227x3;
import w50.C28769a;
import w50.C28771c;

/* loaded from: classes5.dex */
public final class ChatRowCollapsedMsgInfoGroup extends ChatRow {
    public static final C11348a Companion = new C11348a(null);

    /* renamed from: d7 */
    private static final int f57685d7 = ChatRowMsgInfo.f58151g8;

    /* renamed from: e7 */
    private static final int f57686e7 = ChatRowMsgInfo.f58152h8;

    /* renamed from: f7 */
    private static final int f57687f7 = ChatRowMsgInfo.f58153i8;

    /* renamed from: V6 */
    private final InterfaceC24854k f57688V6;

    /* renamed from: W6 */
    private int f57689W6;

    /* renamed from: X6 */
    private int f57690X6;

    /* renamed from: Y6 */
    private int f57691Y6;

    /* renamed from: Z6 */
    private int f57692Z6;

    /* renamed from: a7 */
    private int f57693a7;

    /* renamed from: b7 */
    private int f57694b7;

    /* renamed from: c7 */
    private boolean f57695c7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowCollapsedMsgInfoGroup$a */
    /* loaded from: classes5.dex */
    public static final class C11348a {
        private C11348a() {
        }

        public /* synthetic */ C11348a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowCollapsedMsgInfoGroup$b */
    /* loaded from: classes5.dex */
    static final class C11349b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f57696q;

        /* renamed from: r */
        final /* synthetic */ ChatRowCollapsedMsgInfoGroup f57697r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11349b(Context context, ChatRowCollapsedMsgInfoGroup chatRowCollapsedMsgInfoGroup) {
            super(0);
            this.f57696q = context;
            this.f57697r = chatRowCollapsedMsgInfoGroup;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StaticLayout mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setTypeface(Typeface.DEFAULT);
            c13704p1.setColor(AbstractC11531v0.Companion.m62540U0());
            c13704p1.setTextSize(AbstractC23136l9.m118742r(12.0f));
            return AbstractC23214t.m119623j(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more_msg_info_group), c13704p1, AbstractC23136l9.m118728m0(this.f57696q, this.f57697r.getDelegate().mo62071Y3()), 1, Layout.Alignment.ALIGN_NORMAL);
        }
    }

    public ChatRowCollapsedMsgInfoGroup(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C11349b(context, this));
        this.f57688V6 = m129210a;
    }

    /* renamed from: U3 */
    private final boolean m61186U3(float f11, float f12) {
        return f11 >= ((float) this.f57691Y6) && f11 <= ((float) this.f57693a7) && f12 >= ((float) this.f57692Z6) && f12 <= ((float) this.f57694b7);
    }

    private final StaticLayout getSeeMoreLayout() {
        Object value = this.f57688V6.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (StaticLayout) value;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        this.f57689W6 = (int) getSeeMoreLayout().getLineWidth(0);
        int height = getSeeMoreLayout().getHeight();
        this.f57690X6 = height;
        c28227x3.f131648a = this.f57689W6 + (f57685d7 * 2);
        c28227x3.f131649b = height + (f57686e7 * 2);
        return c28227x3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: E2 */
    public C28227x3 mo60959E2(int i11, int i12, int i13, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: F */
    protected boolean mo60961F() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I */
    protected boolean mo60971I() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: J */
    protected boolean mo60976J() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: K */
    protected boolean mo60981K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q */
    public boolean mo61007Q(boolean z11, boolean z12) {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: R */
    protected boolean mo61011R() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: S0 */
    public int mo61017S0(int i11, int i12, int i13, boolean z11) {
        return ((i11 + i12) / 2) - (i13 / 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T */
    public boolean mo61021T(C28769a c28769a) {
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: W */
    public boolean mo61028W(C28771c c28771c, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = (i11 + i13) / 2;
        int i16 = this.f57422c0;
        int i17 = i15 - (i16 / 2);
        this.f57691Y6 = i17;
        this.f57692Z6 = i12;
        this.f57693a7 = i17 + i16;
        this.f57694b7 = i12 + this.f57428d0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMarginBottom() {
        if (this.f57413a3) {
            return f57687f7;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMarginTop() {
        return f57687f7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f57686e7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return getSeeMoreLayout().getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || !this.f57695c7 || !m61186U3(x11, y11)) {
                return false;
            }
            getDelegate().mo62104v4(this);
            return true;
        }
        boolean m61186U3 = m61186U3(x11, y11);
        this.f57695c7 = m61186U3;
        C24848g0 c24848g0 = C24848g0.f119245a;
        return m61186U3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public void setMessage(C28771c c28771c) {
        AbstractC19074t.m100208f(c28771c, "multiChatContent");
        this.f57257A = c28771c;
        C17945a0 m143954n = c28771c.m143954n();
        if (m143954n != null) {
            setMessage(m143954n);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        x3Var.m62588l().setBounds(this.f57691Y6, this.f57692Z6, this.f57693a7, this.f57694b7);
        x3Var.m62588l().draw(canvas);
        canvas.save();
        canvas.translate(this.f57691Y6 + f57685d7, this.f57692Z6 + f57686e7);
        getSeeMoreLayout().draw(canvas);
        canvas.restore();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: x2 */
    protected C28227x3 mo61125x2(int i11, int i12, int i13, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        return c28227x3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: y2 */
    public C28227x3 mo61128y2(int i11, int i12, int i13, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        return c28227x3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        return c28227x3;
    }
}
