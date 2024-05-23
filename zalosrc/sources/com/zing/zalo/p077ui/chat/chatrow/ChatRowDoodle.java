package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C17981m0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p698yz.AbstractC31125u;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowDoodle extends ChatRowHasCaption {

    /* renamed from: f8 */
    public static boolean f57698f8 = false;

    /* renamed from: i8 */
    static C13704p1 f57701i8;

    /* renamed from: j8 */
    static Drawable f57702j8;

    /* renamed from: k8 */
    private static Paint f57703k8;

    /* renamed from: l8 */
    private static Paint f57704l8;

    /* renamed from: B7 */
    String f57706B7;

    /* renamed from: C7 */
    int f57707C7;

    /* renamed from: D7 */
    int f57708D7;

    /* renamed from: E7 */
    Context f57709E7;

    /* renamed from: F7 */
    C17981m0 f57710F7;

    /* renamed from: G7 */
    int f57711G7;

    /* renamed from: H7 */
    int f57712H7;

    /* renamed from: I7 */
    C13697o f57713I7;

    /* renamed from: J7 */
    C3977j f57714J7;

    /* renamed from: K7 */
    C23528a f57715K7;

    /* renamed from: L7 */
    String f57716L7;

    /* renamed from: M7 */
    int f57717M7;

    /* renamed from: N7 */
    int f57718N7;

    /* renamed from: O7 */
    int f57719O7;

    /* renamed from: P7 */
    int f57720P7;

    /* renamed from: Q7 */
    int f57721Q7;

    /* renamed from: R7 */
    int f57722R7;

    /* renamed from: S7 */
    boolean f57723S7;

    /* renamed from: T7 */
    boolean f57724T7;

    /* renamed from: U7 */
    boolean f57725U7;

    /* renamed from: V7 */
    Paint f57726V7;

    /* renamed from: W7 */
    private int f57727W7;

    /* renamed from: X7 */
    private int f57728X7;

    /* renamed from: Y7 */
    private int f57729Y7;

    /* renamed from: Z7 */
    private int f57730Z7;

    /* renamed from: a8 */
    private int f57731a8;

    /* renamed from: b8 */
    private int f57732b8;

    /* renamed from: c8 */
    private final Path f57733c8;

    /* renamed from: d8 */
    private final RectF f57734d8;

    /* renamed from: e8 */
    private final Path f57735e8;

    /* renamed from: g8 */
    static final int f57699g8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: h8 */
    static final int f57700h8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: m8 */
    private static final int f57705m8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowDoodle$a */
    /* loaded from: classes5.dex */
    public class C11350a extends C23999j {
        C11350a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            C17981m0 c17981m0;
            try {
                if (TextUtils.equals(ChatRowDoodle.this.f57716L7, str) && c3979l != null && c3979l.m18839c() != null) {
                    ChatRowDoodle chatRowDoodle = ChatRowDoodle.this;
                    boolean z11 = true;
                    chatRowDoodle.f57724T7 = true;
                    if (chatRowDoodle.m60999O1()) {
                        ChatRowDoodle.this.f57725U7 = true;
                        Bitmap m18839c = c3979l.m18839c();
                        C3977j c3977j = ChatRowDoodle.this.f57714J7;
                        if (c3977j != null) {
                            c3977j.setImageInfo(c3979l, false);
                        }
                        C13697o c13697o = ChatRowDoodle.this.f57713I7;
                        if (c23995f.m125666q() == 4) {
                            z11 = false;
                        }
                        c13697o.m76480u(m18839c, z11);
                        ChatRowDoodle.this.invalidate();
                        ChatRowDoodle chatRowDoodle2 = ChatRowDoodle.this;
                        if ((chatRowDoodle2.f57717M7 == 0 || chatRowDoodle2.f57718N7 == 0) && (c17981m0 = chatRowDoodle2.f57710F7) != null) {
                            c17981m0.f91074B = m18839c.getWidth();
                            ChatRowDoodle.this.f57710F7.f91075C = m18839c.getHeight();
                            ChatRowDoodle.this.m61119v3(false);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowDoodle(Context context) {
        super(context);
        this.f57733c8 = new Path();
        this.f57734d8 = new RectF();
        this.f57735e8 = new Path();
        this.f57709E7 = context;
        this.f57715K7 = new C23528a(context);
        this.f57714J7 = new C3977j(context);
        C13697o c13697o = new C13697o(this);
        this.f57713I7 = c13697o;
        c13697o.m76461I(ChatRow.f57183C5);
        this.f57713I7.m76455C(new C13697o.a() { // from class: com.zing.zalo.ui.chat.chatrow.w
            public /* synthetic */ C11533w() {
            }

            @Override // com.zing.zalo.p077ui.widget.C13697o.a
            /* renamed from: a */
            public final void mo61944a(float f11) {
                ChatRowDoodle.this.m61189D4(f11);
            }
        });
        Paint paint = new Paint(1);
        this.f57726V7 = paint;
        paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.blk_a55));
        if (f57698f8) {
            f57701i8 = null;
            f57698f8 = false;
        }
    }

    /* renamed from: A4 */
    private void m61188A4(Canvas canvas) {
        canvas.drawPath(this.f57733c8, f57703k8);
        canvas.drawPath(this.f57735e8, f57704l8);
    }

    /* renamed from: D4 */
    public /* synthetic */ void m61189D4(float f11) {
        C28769a c28769a;
        if (f11 == 0.0f && (c28769a = this.f57269C) != null) {
            c28769a.f133324t = 0;
        }
    }

    /* renamed from: G4 */
    private void m61190G4(C17945a0 c17945a0) {
        try {
            int m95107d3 = c17945a0.m95107d3();
            if (m95107d3 != 2) {
                if (m95107d3 != 3) {
                    if (m95107d3 != 5) {
                        if (m95107d3 != 6 && m95107d3 != 7) {
                            if (m95107d3 == 8) {
                                setRetryVisible(true);
                            }
                        } else {
                            this.f57382U4 = true;
                        }
                    } else if (!this.f57268B4.m143918k() && !this.f57268B4.m143920m()) {
                        setRetryVisible(true);
                        this.f57373T1 = true;
                    }
                } else {
                    setRetryVisible(true);
                    this.f57373T1 = true;
                }
            } else if (!this.f57268B4.m143919l()) {
                setRetryVisible(true);
                this.f57373T1 = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRow", e11);
        }
    }

    /* renamed from: H4 */
    private void m61191H4(C17945a0 c17945a0) {
        float f11;
        try {
            if (c17945a0.m95107d3() != 6 && c17945a0.m95107d3() != 7) {
                if (c17945a0.m94959N6()) {
                    setRetryVisible(true);
                    return;
                }
                int m95089b4 = c17945a0.m95089b4();
                if (m95089b4 != 0) {
                    if (m95089b4 != 1) {
                        if (m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4) {
                            C28769a c28769a = this.f57269C;
                            if (c28769a.f133324t == 1) {
                                c28769a.f133324t = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f57269C.f133324t = 0;
                    return;
                }
                this.f57269C.f133324t = c17945a0.m95180k8() ? 1 : 0;
                C13697o c13697o = this.f57713I7;
                if (c17945a0.m95180k8()) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                c13697o.m76454B(f11);
                return;
            }
            this.f57382U4 = true;
            this.f57269C.f133324t = 1;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRow", e11);
        }
    }

    /* renamed from: z4 */
    private void m61193z4(Canvas canvas) {
        canvas.drawCircle(this.f57719O7 + (this.f57713I7.m76473l() / 2.0f), this.f57720P7 + (this.f57713I7.m76472k() / 2.0f), ChatRow.f57224Y5 / 2.0f, this.f57726V7);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f57723S7 = false;
    }

    /* renamed from: B4 */
    public void m61194B4() {
        if (f57701i8 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f57701i8 = c13704p1;
            c13704p1.setColor(AbstractC11531v0.m62143G3());
            f57701i8.m76613c();
            f57701i8.m76614d(AbstractC23136l9.m118742r(13.0f), false);
            f57702j8 = AbstractC11531v0.m62113A3();
            Paint paint = new Paint(1);
            f57703k8 = paint;
            paint.setStyle(Paint.Style.FILL);
            f57703k8.setColor(C23212s8.m119607o(this.f57709E7, AbstractC16781w.ChatMultiPhotoItemRecallBackgroundColor));
            Paint paint2 = new Paint(1);
            f57704l8 = paint2;
            paint2.setColor(-1999054632);
            f57704l8.setStyle(Paint.Style.STROKE);
            f57704l8.setStrokeWidth(f57705m8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        c28227x3.f131648a = this.f57713I7.m76473l() + (f57699g8 * 2);
        int m76472k = this.f57713I7.m76472k();
        if (mo61163l4()) {
            i13 = ChatRow.f57201L5 + getTextHeight();
        } else {
            i13 = 0;
        }
        c28227x3.f131649b = m76472k + i13;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m95032V6() || c17945a0.m95107d3() == 5) {
            this.f57716L7 = c17945a0.m94983Q3();
        }
        if (c17945a0.m94929K2() instanceof C17981m0) {
            C17981m0 c17981m0 = (C17981m0) c17945a0.m94929K2();
            this.f57710F7 = c17981m0;
            this.f57717M7 = c17981m0.f91074B;
            this.f57718N7 = c17981m0.f91075C;
        }
        if (c17945a0.m95032V6()) {
            m61191H4(c17945a0);
        } else {
            m61190G4(c17945a0);
        }
        if (this.f57382U4) {
            m61194B4();
        }
        if (this.f57382U4) {
            this.f57713I7.m76456D(AbstractC11531v0.m62356z3());
            this.f57713I7.m76454B(1.0f);
            String m151165W = AbstractC31125u.m151165W(getContext(), c17945a0);
            this.f57706B7 = m151165W;
            this.f57707C7 = AbstractC23136l9.m118764y0(f57701i8, m151165W);
            this.f57708D7 = AbstractC23136l9.m118761x0(f57701i8, this.f57706B7);
            return;
        }
        this.f57713I7.m76454B(0.0f);
        if (this.f57259A1 && c17945a0.m95180k8() && c17945a0.m95107d3() == 3) {
            this.f57713I7.m76456D(AbstractC11531v0.m62261g3());
            this.f57713I7.m76454B(1.0f);
        }
        if (c28769a.f133324t == 2) {
            this.f57713I7.m76475o(1.0f);
        }
    }

    /* renamed from: C4 */
    boolean m61195C4(float f11, float f12) {
        return f11 >= ((float) this.f57719O7) && f11 <= ((float) this.f57721Q7) && f12 >= ((float) this.f57720P7) && f12 <= ((float) this.f57722R7);
    }

    /* renamed from: E4 */
    void m61196E4() {
        try {
            this.f57713I7.m76477r();
            if (!m60988L3() && !C23999j.m125696L2(this.f57716L7, C23278z2.m120084N())) {
                return;
            }
            ((C23528a) this.f57715K7.m123612r(this.f57714J7)).m123579C(this.f57716L7, C23278z2.m120084N(), new C11350a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: F1 */
    public boolean mo60962F1() {
        return true;
    }

    /* renamed from: F4 */
    public boolean m61197F4() {
        if (!this.f57382U4 && (!this.f57724T7 || (!this.f57725U7 && m60999O1()))) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        this.f57713I7.m76462J(0, i11 - (f57699g8 * 2));
        int i13 = this.f57717M7;
        if (i13 > 0 && (i12 = this.f57718N7) > 0) {
            this.f57713I7.m76481v(i13, i12);
        } else {
            this.f57713I7.m76478s();
        }
        super.mo60975I3(c17945a0, c28769a, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return mo61163l4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O */
    public boolean mo60997O() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T0 */
    protected int mo61022T0(int i11, int i12, int i13) {
        return this.f57720P7 + ((this.f57713I7.m76472k() - i13) / 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (m61197F4()) {
            m61196E4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, dj.C17985n1.c
    /* renamed from: c */
    public void mo61045c() {
        super.mo61045c();
        if (m61197F4()) {
            m61196E4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e0 */
    protected boolean mo61053e0() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m95022U7()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g0 */
    protected Point mo61061g0() {
        int i11 = this.f57719O7;
        int m76473l = this.f57713I7.m76473l();
        int i12 = ChatRow.f57223X5;
        return new Point(i11 + ((m76473l - i12) / 2), this.f57720P7 + ((this.f57713I7.m76472k() - i12) / 2));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = f57699g8;
        int i16 = i11 + i15;
        this.f57719O7 = i16;
        this.f57720P7 = i12;
        this.f57721Q7 = i16 + this.f57713I7.m76473l();
        this.f57722R7 = this.f57720P7 + this.f57713I7.m76472k();
        this.f57713I7.m76460H(this.f57719O7, this.f57720P7);
        this.f57712H7 = this.f57722R7 + ChatRow.f57201L5;
        this.f57711G7 = i11 + ChatRow.f57203M5;
        if (m60965G1() && mo60962F1()) {
            int intrinsicWidth = AbstractC11531v0.m62290m2().getIntrinsicWidth();
            int intrinsicHeight = AbstractC11531v0.m62290m2().getIntrinsicHeight();
            this.f57727W7 = this.f57719O7 + ((this.f57713I7.m76473l() - intrinsicWidth) / 2);
            this.f57728X7 = this.f57720P7 + ((this.f57713I7.m76472k() - intrinsicHeight) / 2);
        }
        if (this.f57382U4) {
            this.f57733c8.reset();
            RectF rectF = new RectF(this.f57719O7, this.f57720P7, r7 + this.f57713I7.m76473l(), this.f57720P7 + this.f57713I7.m76472k());
            Path path = this.f57733c8;
            float[] m76470i = this.f57713I7.m76470i();
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, m76470i, direction);
            RectF rectF2 = this.f57734d8;
            int i17 = this.f57719O7;
            int i18 = f57705m8;
            rectF2.set(i17 + (i18 / 2.0f), this.f57720P7 + (i18 / 2.0f), (i17 + this.f57713I7.m76473l()) - (i18 / 2.0f), (this.f57720P7 + this.f57713I7.m76472k()) - (i18 / 2.0f));
            this.f57735e8.reset();
            this.f57735e8.addRoundRect(this.f57734d8, this.f57713I7.m76470i(), direction);
            this.f57729Y7 = this.f57719O7 + ((this.f57713I7.m76473l() - f57702j8.getIntrinsicWidth()) / 2);
            this.f57730Z7 = this.f57720P7 + ((this.f57713I7.m76472k() - ((f57702j8.getIntrinsicHeight() + i15) + this.f57708D7)) / 2);
            this.f57731a8 = this.f57719O7 + ((this.f57713I7.m76473l() - this.f57707C7) / 2);
            int intrinsicHeight2 = this.f57730Z7 + f57702j8.getIntrinsicHeight() + this.f57708D7 + f57700h8;
            this.f57732b8 = intrinsicHeight2;
            this.f57732b8 = Math.min(intrinsicHeight2, (this.f57720P7 + this.f57713I7.m76472k()) - AbstractC23136l9.m118742r(5.0f));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return Math.max(getWidthMeasurement() - ChatRow.f57198J6, AbstractC11531v0.m62231a3());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f57699g8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getMarginBorder() {
        return f57699g8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_doodle) + "\n" + super.getMsgContentTalkText();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f57711G7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f57712H7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (i11 != 0) {
            if (i11 == 1 && this.f57723S7 && m61195C4(f11, f12)) {
                if (m60965G1() && mo60962F1()) {
                    getDelegate().mo62034C4(this);
                    return true;
                }
                getDelegate().mo62074a4(this);
                return true;
            }
        } else {
            boolean m61195C4 = m61195C4(f11, f12);
            this.f57723S7 = m61195C4;
            if (m61195C4) {
                return true;
            }
        }
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return this.f57713I7.m76473l() - (ChatRow.f57203M5 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k0 */
    public int mo61076k0(C17945a0 c17945a0) {
        int mo61076k0 = super.mo61076k0(c17945a0);
        if (c17945a0.m95032V6()) {
            if (!c17945a0.m95180k8()) {
                int m95089b4 = c17945a0.m95089b4();
                if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                    return mo61076k0;
                }
            } else {
                int m95107d3 = c17945a0.m95107d3();
                if (m95107d3 != 5 && ((m95107d3 != 6 && m95107d3 != 7) || c17945a0.m95022U7())) {
                    return mo61076k0;
                }
            }
        } else {
            int m95107d32 = c17945a0.m95107d3();
            if (m95107d32 != 2) {
                if (m95107d32 != 5 && ((m95107d32 != 6 && m95107d32 != 7) || c17945a0.m95022U7())) {
                    return mo61076k0;
                }
            } else {
                return mo61076k0 | 2;
            }
        }
        return mo61076k0 | 9;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        boolean z11;
        Drawable m62290m2;
        if (!this.f57382U4) {
            this.f57713I7.m76467d(canvas);
        }
        if (this.f57263B.m94849A8() && AbstractC11531v0.m62147H2() != null && AbstractC11531v0.m62137F2() != null) {
            int i11 = this.f57719O7;
            int m76472k = this.f57720P7 + this.f57713I7.m76472k();
            int dimensionPixelSize = i11 + getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            int intrinsicHeight = (m76472k - AbstractC11531v0.m62137F2().getIntrinsicHeight()) - getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            AbstractC28236y3.m142204o(AbstractC11531v0.m62137F2(), dimensionPixelSize, intrinsicHeight);
            AbstractC11531v0.m62137F2().draw(canvas);
            int m118742r = AbstractC23136l9.m118742r(2.0f);
            int m118742r2 = AbstractC23136l9.m118742r(2.0f);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            int i12 = dimensionPixelSize + m118742r;
            int i13 = intrinsicHeight + m118742r2;
            AbstractC11531v0.m62147H2().setBounds(i12, i13, i12 + m118742r3, m118742r3 + i13);
            AbstractC11531v0.m62147H2().draw(canvas);
        }
        if (m60965G1() && mo60962F1()) {
            if (this.f57263B.m95180k8() && this.f57263B.m95107d3() == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                m62290m2 = AbstractC11531v0.m62230a2();
            } else {
                m62290m2 = AbstractC11531v0.m62290m2();
            }
            if (!z11) {
                m61193z4(canvas);
            }
            int i14 = this.f57727W7;
            m62290m2.setBounds(i14, this.f57728X7, m62290m2.getIntrinsicWidth() + i14, this.f57728X7 + m62290m2.getIntrinsicHeight());
            m62290m2.draw(canvas);
        }
        if (this.f57382U4) {
            m61188A4(canvas);
            Drawable drawable = f57702j8;
            int i15 = this.f57729Y7;
            drawable.setBounds(i15, this.f57730Z7, drawable.getIntrinsicWidth() + i15, this.f57730Z7 + f57702j8.getIntrinsicHeight());
            f57702j8.draw(canvas);
            canvas.drawText(this.f57706B7, this.f57731a8, this.f57732b8, f57701i8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57710F7 = null;
        this.f57716L7 = "";
        this.f57724T7 = false;
        this.f57725U7 = false;
        this.f57717M7 = 0;
        this.f57718N7 = 0;
        this.f57711G7 = -1;
        this.f57712H7 = -1;
    }
}
