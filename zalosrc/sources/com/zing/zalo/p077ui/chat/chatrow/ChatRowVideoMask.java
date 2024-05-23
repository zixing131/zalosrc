package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import cg.AbstractC3460h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.widget.C13658k;
import com.zing.zalo.p077ui.widget.C13687m;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.MaskableImageView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dj.C17945a0;
import dj.C17961f1;
import gw.AbstractC19646n0;
import me0.AbstractC23006a0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p559uv.C27373c;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowVideoMask extends ChatRowHasCaption implements C17945a0.x {

    /* renamed from: Z7 */
    static final String f58898Z7 = ChatRowVideo.class.getSimpleName();

    /* renamed from: a8 */
    public static boolean f58899a8 = false;

    /* renamed from: b8 */
    static final int f58900b8;

    /* renamed from: c8 */
    static final int f58901c8;

    /* renamed from: d8 */
    static final int f58902d8;

    /* renamed from: e8 */
    static C13704p1 f58903e8;

    /* renamed from: f8 */
    static C13704p1 f58904f8;

    /* renamed from: B7 */
    boolean f58905B7;

    /* renamed from: C7 */
    int f58906C7;

    /* renamed from: D7 */
    int f58907D7;

    /* renamed from: E7 */
    int f58908E7;

    /* renamed from: F7 */
    int f58909F7;

    /* renamed from: G7 */
    C13658k f58910G7;

    /* renamed from: H7 */
    boolean f58911H7;

    /* renamed from: I7 */
    int f58912I7;

    /* renamed from: J7 */
    int f58913J7;

    /* renamed from: K7 */
    boolean f58914K7;

    /* renamed from: L7 */
    C13687m f58915L7;

    /* renamed from: M7 */
    float f58916M7;

    /* renamed from: N7 */
    float f58917N7;

    /* renamed from: O7 */
    boolean f58918O7;

    /* renamed from: P7 */
    C3977j f58919P7;

    /* renamed from: Q7 */
    String f58920Q7;

    /* renamed from: R7 */
    String f58921R7;

    /* renamed from: S7 */
    int f58922S7;

    /* renamed from: T7 */
    int f58923T7;

    /* renamed from: U7 */
    int f58924U7;

    /* renamed from: V7 */
    int f58925V7;

    /* renamed from: W7 */
    int f58926W7;

    /* renamed from: X7 */
    int f58927X7;

    /* renamed from: Y7 */
    Handler f58928Y7;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoMask$a */
    /* loaded from: classes5.dex */
    public class HandlerC11429a extends Handler {
        HandlerC11429a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ChatRowVideoMask chatRowVideoMask;
            C13687m c13687m;
            C17945a0 c17945a0;
            try {
                super.handleMessage(message);
                if (message.what == 1003 && (c13687m = (chatRowVideoMask = ChatRowVideoMask.this).f58915L7) != null && (c17945a0 = chatRowVideoMask.f57263B) != null) {
                    c13687m.m76416k(Math.max(c17945a0.m95001S2(), 10));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoMask$b */
    /* loaded from: classes5.dex */
    public class C11430b extends C23999j {
        C11430b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!str.equals(ChatRowVideoMask.this.f58920Q7)) {
                    return;
                }
                C3977j c3977j = ChatRowVideoMask.this.f58919P7;
                boolean z11 = false;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        ChatRowVideoMask chatRowVideoMask = ChatRowVideoMask.this;
                        chatRowVideoMask.f58914K7 = true;
                        C13658k c13658k = chatRowVideoMask.f58910G7;
                        if (c23995f.m125666q() != 4) {
                            z11 = true;
                        }
                        c13658k.m76334m(m18839c, z11);
                        ChatRowVideoMask.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(1.0f);
        f58900b8 = m118742r;
        f58901c8 = AbstractC23136l9.m118742r(3.0f) + m118742r;
        f58902d8 = AbstractC23136l9.m118742r(45.0f);
    }

    public ChatRowVideoMask(Context context) {
        super(context);
        this.f58905B7 = false;
        this.f58918O7 = false;
        this.f58920Q7 = "";
        this.f58921R7 = "";
        this.f58922S7 = 0;
        this.f58926W7 = AbstractC16803z.heart01_shape;
        this.f58927X7 = AbstractC16803z.heart01_frame;
        this.f58928Y7 = new HandlerC11429a(Looper.getMainLooper());
        this.f58919P7 = new C3977j(context);
        this.f58915L7 = new C13687m(this);
        this.f58911H7 = false;
        this.f58910G7 = new C13658k(this);
        if (f58899a8 || f58903e8 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58903e8 = c13704p1;
            Typeface typeface = Typeface.DEFAULT;
            c13704p1.setTypeface(typeface);
            f58903e8.setColor(-1);
            f58903e8.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p12 = new C13704p1(1);
            f58904f8 = c13704p12;
            c13704p12.setColor(getContext().getResources().getColor(AbstractC16801x.cMtxt1));
            f58904f8.setTypeface(typeface);
            f58904f8.setTextSize(AbstractC23136l9.m118759w1(15));
            f58899a8 = false;
        }
    }

    private int getCaptionWidth() {
        return Math.max(getTextWidth(), getBubbleMinWidth());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58905B7 = false;
        this.f58911H7 = false;
    }

    /* renamed from: A4 */
    void m61754A4() {
        if (!TextUtils.isEmpty(this.f58920Q7)) {
            C24003n m120068F = C23278z2.m120068F();
            this.f58910G7.m76331h();
            if (m60988L3() || C23999j.m125696L2(this.f58920Q7, m120068F)) {
                ((C23528a) this.f57275D.m123612r(this.f58919P7)).m123579C(this.f58920Q7, m120068F, new C11430b());
            }
        }
    }

    /* renamed from: B4 */
    void m61755B4() {
        C3979l m123610p;
        if (this.f57263B != null) {
            try {
                AbstractC23647d.m123907q("917720", ChatRow.f57200K6);
                C27373c m102936U0 = AbstractC19646n0.m102936U0(this.f57263B);
                if (this.f57275D.m123605k(m102936U0.m140268v() + "_mask", AbstractC23006a0.m117875E(), C23278z2.m120110a()) == null && (m123610p = this.f57275D.m123610p(m102936U0.m140268v(), C23278z2.m120110a())) != null) {
                    C23999j.m125714W2(m102936U0.m140268v() + "_mask", AbstractC23006a0.m117875E(), 0, MaskableImageView.m75788k(m123610p.m18839c(), this.f58926W7, this.f58927X7, getContext()), false, C23278z2.m120110a(), false, false);
                }
                getDelegate().mo62088i4(this, m102936U0);
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        c28227x3.f131648a = Math.max(c28227x3.f131648a, this.f58910G7.m76329f() + (f58901c8 * 2));
        c28227x3.f131649b += this.f58910G7.m76326c() + (ChatRow.f57195I5 * 2);
        if (mo61163l4()) {
            c28227x3.f131648a = Math.max(c28227x3.f131648a, getCaptionWidth());
            c28227x3.f131649b += getTextHeight() + ChatRow.f57201L5;
        }
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f57271C1 = c17945a0.m94954N0();
        if (c17945a0.m95032V6()) {
            String m94947M4 = c17945a0.m94947M4();
            this.f58920Q7 = m94947M4;
            if (TextUtils.isEmpty(m94947M4) || !AbstractC23041d2.m118194A(this.f58920Q7)) {
                this.f58920Q7 = c17945a0.m94929K2().f91013r;
            }
        } else {
            this.f58920Q7 = c17945a0.m94929K2().f91013r;
        }
        int i11 = c17945a0.m95051X3().f91060c;
        if (i11 != 1000) {
            if (i11 != 1002) {
                this.f58926W7 = AbstractC16803z.round05_shape;
                this.f58927X7 = AbstractC16803z.round05_frame;
            } else {
                this.f58926W7 = AbstractC16803z.heart03_shape;
                this.f58927X7 = AbstractC16803z.heart03_frame;
            }
        } else {
            this.f58926W7 = AbstractC16803z.heart01_shape;
            this.f58927X7 = AbstractC16803z.heart01_frame;
        }
        this.f58910G7.m76338q(true, this.f58926W7, this.f58927X7);
        if (c17945a0.m94929K2() instanceof C17961f1) {
            long m95508w = ((C17961f1) c17945a0.m94929K2()).m95508w();
            if (m95508w >= 0) {
                this.f58921R7 = AbstractC3460h.m17440h(m95508w);
                this.f58922S7 = (int) Math.ceil(f58903e8.measureText(r5));
            }
        }
        this.f58910G7.m76342u(false);
        this.f58910G7.m76331h();
        c17945a0.m94997R9(this);
        if (c17945a0.m95032V6()) {
            m61756C4();
        }
    }

    /* renamed from: C4 */
    void m61756C4() {
        try {
            if (this.f57263B.m95306y8() && this.f57263B.m95089b4() == 1) {
                this.f58918O7 = true;
                this.f58915L7.m76416k(Math.max(this.f57263B.m95001S2(), 10));
                this.f57263B.m94859Bb(this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: G */
    public void mo61268G(int i11, MessageId messageId) {
    }

    @Override // dj.C17945a0.x
    /* renamed from: H */
    public void mo61269H(MessageId messageId, boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f58910G7.m76341t(0, i11 - (f58901c8 * 2));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return mo61163l4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return mo61163l4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q2 */
    public void mo61009Q2() {
        super.mo61009Q2();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58914K7) {
            m61754A4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int m76329f;
        if (z11) {
            m76329f = f58901c8 + i11;
        } else {
            m76329f = (i13 - this.f58910G7.m76329f()) - f58901c8;
        }
        this.f58912I7 = m76329f;
        int i15 = ChatRow.f57195I5;
        int i16 = i12 + i15;
        this.f58913J7 = i16;
        this.f58910G7.m76339r(m76329f, i16);
        int m76329f2 = this.f58912I7 + (this.f58910G7.m76329f() / 2);
        int m76326c = this.f58913J7 + (this.f58910G7.m76326c() / 2);
        this.f58916M7 = m76329f2 - this.f58915L7.m76413g();
        this.f58917N7 = m76326c - this.f58915L7.m76413g();
        int i17 = f58902d8;
        this.f58906C7 = m76329f2 - (i17 / 2);
        this.f58907D7 = m76326c - (i17 / 2);
        this.f58908E7 = m76329f2 + (i17 / 2);
        this.f58909F7 = m76326c + (i17 / 2);
        int m76326c2 = i12 + this.f58910G7.m76326c() + (i15 * 2);
        if (mo61163l4()) {
            this.f58925V7 = m76326c2;
            this.f58923T7 = i11 + getBubblePaddingLeft();
            this.f58924U7 = this.f58925V7 + ChatRow.f57201L5;
            getTextHeight();
        }
    }

    public int getBubbleColor() {
        if (mo61124x1()) {
            if (m61099p1()) {
                return -5647632;
            }
            return -4989185;
        }
        if (this.f57263B.m94987Q7()) {
            if (m61099p1()) {
                return -1776412;
            }
            return -1;
        }
        if (m61099p1()) {
            return -3874063;
        }
        return -2952961;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return Math.max(getWidthMeasurement() - ChatRow.f57198J6, AbstractC11531v0.m62231a3());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f57263B == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        this.f57560z4.getLocationOnScreen(iArr);
        int i11 = iArr[0] + this.f58912I7;
        rect.left = i11;
        rect.top = iArr[1] + this.f58913J7;
        rect.right = i11 + this.f58910G7.m76329f();
        rect.bottom = rect.top + this.f58910G7.m76326c();
        return rect;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58923T7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58924U7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        if (!TextUtils.isEmpty(this.f58920Q7)) {
            C24003n m120068F = C23278z2.m120068F();
            return this.f57275D.m123606l(this.f58920Q7, m120068F.f116260a, m120068F.f116263d, m120068F.f116266g);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:            if ((r2 | r3) == false) goto L53;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f58905B7 && m61758z4(f11, f12)) {
                    m61755B4();
                } else if (this.f58911H7 && m61757y4(f11, f12)) {
                    m61755B4();
                }
            }
            if (!super.mo61075j3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (!this.f58918O7 && m61758z4(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58905B7 = z11;
            boolean m61757y4 = m61757y4(f11, f12);
            this.f58911H7 = m61757y4;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    @Override // dj.C17945a0.x
    /* renamed from: m */
    public void mo61273m(int i11, MessageId messageId) {
        C13687m c13687m;
        try {
            C17945a0 c17945a0 = this.f57263B;
            if (c17945a0 != null && c17945a0.m95135f9(messageId) && (c13687m = this.f58915L7) != null && i11 > c13687m.m76412f() && !this.f58928Y7.hasMessages(ZAbstractBase.ZVU_BLEND_GEN_THUMB, messageId)) {
                Handler handler = this.f58928Y7;
                handler.sendMessage(handler.obtainMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB, messageId));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        super.mo61093o0(canvas, i11, this.f58925V7, i13, i14);
    }

    @Override // dj.C17945a0.x
    /* renamed from: s */
    public void mo61274s(MessageId messageId, String str, boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        this.f58910G7.m76340s(getBubbleColor());
        this.f58910G7.m76325a(canvas);
        if (this.f58918O7) {
            canvas.save();
            canvas.translate(this.f58916M7, this.f58917N7);
            this.f58915L7.m76410b(canvas);
            canvas.restore();
            return;
        }
        if (this.f58905B7) {
            AbstractC11531v0.m62276j3().setBounds(this.f58906C7, this.f58907D7, this.f58908E7, this.f58909F7);
            AbstractC11531v0.m62276j3().draw(canvas);
        } else {
            AbstractC11531v0.m62271i3().setBounds(this.f58906C7, this.f58907D7, this.f58908E7, this.f58909F7);
            AbstractC11531v0.m62271i3().draw(canvas);
        }
        if (!TextUtils.isEmpty(this.f58921R7)) {
            canvas.drawText(this.f58921R7, this.f58912I7 + ((this.f58910G7.m76329f() - this.f58922S7) >> 1), this.f58909F7 + AbstractC23136l9.m118742r(20.0f), f58903e8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t1 */
    protected boolean mo61112t1() {
        if (!mo61163l4() && !this.f57319K1) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58914K7 = false;
        this.f58918O7 = false;
        this.f58920Q7 = "";
        this.f58921R7 = "";
        this.f58922S7 = 0;
        this.f58912I7 = -1;
        this.f58913J7 = -1;
        this.f58923T7 = -1;
        this.f58924U7 = -1;
        this.f58925V7 = -1;
    }

    /* renamed from: y4 */
    boolean m61757y4(float f11, float f12) {
        try {
            if (f11 < this.f58912I7 || f11 > r1 + this.f58910G7.m76329f()) {
                return false;
            }
            if (f12 < this.f58913J7) {
                return false;
            }
            if (f12 > r4 + this.f58910G7.m76326c()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: z4 */
    boolean m61758z4(float f11, float f12) {
        return f11 >= ((float) this.f58906C7) && f11 <= ((float) this.f58908E7) && f12 >= ((float) this.f58907D7) && f12 <= ((float) this.f58909F7);
    }
}
