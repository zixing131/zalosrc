package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import dj.C17945a0;
import dj.C17993q0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p361nb.AbstractC23647d;
import p716zh.C31883d5;
import p716zh.C31887d9;
import p716zh.C32119t6;
import vg.AbstractC28236y3;
import vg.C28071g4;
import vg.C28203u6;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowGif extends ChatRow {

    /* renamed from: C7 */
    static RectF f57912C7 = null;

    /* renamed from: D7 */
    static Paint f57913D7 = null;

    /* renamed from: F7 */
    private static C13704p1 f57915F7 = null;

    /* renamed from: G7 */
    private static C13704p1 f57916G7 = null;

    /* renamed from: x7 */
    public static boolean f57917x7 = false;

    /* renamed from: V6 */
    private C17993q0 f57920V6;

    /* renamed from: W6 */
    private final ZSimpleGIFView f57921W6;

    /* renamed from: X6 */
    private boolean f57922X6;

    /* renamed from: Y6 */
    private int f57923Y6;

    /* renamed from: Z6 */
    private int f57924Z6;

    /* renamed from: a7 */
    private int f57925a7;

    /* renamed from: b7 */
    private int f57926b7;

    /* renamed from: c7 */
    private int f57927c7;

    /* renamed from: d7 */
    private int f57928d7;

    /* renamed from: e7 */
    private int f57929e7;

    /* renamed from: f7 */
    private int f57930f7;

    /* renamed from: g7 */
    private int f57931g7;

    /* renamed from: h7 */
    private int f57932h7;

    /* renamed from: i7 */
    private int f57933i7;

    /* renamed from: j7 */
    private int f57934j7;

    /* renamed from: k7 */
    private boolean f57935k7;

    /* renamed from: l7 */
    private final int f57936l7;

    /* renamed from: m7 */
    private boolean f57937m7;

    /* renamed from: n7 */
    private Rect f57938n7;

    /* renamed from: o7 */
    private String f57939o7;

    /* renamed from: p7 */
    private String f57940p7;

    /* renamed from: q7 */
    private int f57941q7;

    /* renamed from: r7 */
    private int f57942r7;

    /* renamed from: s7 */
    private int f57943s7;

    /* renamed from: t7 */
    private int f57944t7;

    /* renamed from: u7 */
    private boolean f57945u7;

    /* renamed from: v7 */
    private boolean f57946v7;

    /* renamed from: w7 */
    private boolean f57947w7;

    /* renamed from: y7 */
    public static final int f57918y7 = AbstractC23136l9.m118742r(220.0f);

    /* renamed from: z7 */
    public static final int f57919z7 = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: A7 */
    public static final int f57910A7 = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: B7 */
    public static final int f57911B7 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: E7 */
    private static final int f57914E7 = AbstractC23136l9.m118742r(48.0f);

    public ChatRowGif(Context context) {
        super(context);
        this.f57936l7 = AbstractC23136l9.m118742r(8.0f);
        this.f57922X6 = false;
        if (f57913D7 == null || f57917x7) {
            f57912C7 = new RectF();
            Paint paint = new Paint(1);
            f57913D7 = paint;
            paint.setColor(Integer.MIN_VALUE);
            f57913D7.setStyle(Paint.Style.FILL);
            C13704p1 c13704p1 = new C13704p1(1);
            f57915F7 = c13704p1;
            c13704p1.setColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            C13704p1 c13704p12 = f57915F7;
            Typeface typeface = Typeface.DEFAULT;
            c13704p12.setTypeface(typeface);
            f57915F7.setTextSize(AbstractC23136l9.m118759w1(15));
            C13704p1 c13704p13 = new C13704p1(1);
            f57916G7 = c13704p13;
            c13704p13.setColor(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
            f57916G7.setTypeface(typeface);
            f57916G7.setTextSize(AbstractC23136l9.m118759w1(12));
            f57917x7 = false;
        }
        ZSimpleGIFView zSimpleGIFView = new ZSimpleGIFView(getContext());
        this.f57921W6 = zSimpleGIFView;
        zSimpleGIFView.setCropMode(1);
        addView(zSimpleGIFView);
    }

    /* renamed from: Y3 */
    private void m61397Y3() {
        try {
            if (this.f57263B != null && C8917b.m47601f()) {
                if (getDelegate().mo62077c()) {
                    this.f57921W6.m88227l(new ZSimpleGIFView.C16554f(this.f57263B.m95090b5(), this.f57263B.m95131f5(), this.f57925a7, this.f57926b7, "ChatRowGIF"), getPosition(), null);
                    if (!m60973I1()) {
                        this.f57921W6.m88224g(100L);
                    }
                } else if (this.f57921W6.m88222e(this.f57263B.m95090b5()) && this.f57921W6.m88226i()) {
                    this.f57921W6.m88229n();
                } else {
                    this.f57921W6.m88227l(new ZSimpleGIFView.C16554f("", this.f57263B.m95131f5(), this.f57925a7, this.f57926b7, "ChatRowGIF"), getPosition(), null);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f57945u7 = false;
        this.f57935k7 = false;
        this.f57922X6 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        c28227x3.f131648a = this.f57925a7 + (getMarginBorder() * 2);
        c28227x3.f131649b = this.f57926b7;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        boolean z13;
        C31887d9 m155014e;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() instanceof C17993q0) {
            this.f57920V6 = (C17993q0) c17945a0.m94929K2();
        }
        boolean z14 = false;
        if (c17945a0.m94987Q7() && getDelegate().mo62103u4()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57947w7 = z12;
        if (z12) {
            if (c17945a0.m94954N0() && this.f57560z4.mo60993N()) {
                z14 = true;
            }
            this.f57937m7 = z14;
            return;
        }
        if (c17945a0.m94954N0() && this.f57560z4.mo60993N()) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f57271C1 = z13;
        if (getDelegate().mo62101s4() == 1 && m60955D1(c17945a0) && (m155014e = C32119t6.m155009c().m155014e(m61008Q0(c17945a0))) != null) {
            this.f57946v7 = true;
            this.f57940p7 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sent_via), m155014e.m153213c());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        if (this.f57920V6 != null) {
            this.f57920V6 = (C17993q0) c17945a0.m94929K2();
            int marginBorder = i11 - (getMarginBorder() * 2);
            this.f57925a7 = marginBorder;
            C17993q0 c17993q0 = this.f57920V6;
            Size m88218c = ZSimpleGIFView.m88218c(c17993q0.f91134B, c17993q0.f91135C, 1, marginBorder);
            this.f57925a7 = m88218c.getWidth();
            this.f57926b7 = m88218c.getHeight();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return !this.f57947w7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (!z12 && !this.f57935k7) {
            z15 = false;
        } else {
            z15 = true;
        }
        return super.mo60998O0(z11, z15, z13, z14);
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
        if (this.f57389W > getDefaultBubblePaddingTop() && this.f57416b0 > 0) {
            this.f57921W6.setRoundCorner(0);
            return;
        }
        if (this.f57389W > getDefaultBubblePaddingTop()) {
            this.f57921W6.setRoundCornerBottomOnly(f57911B7);
        } else if (this.f57416b0 > 0) {
            this.f57921W6.setRoundCornerTopOnly(f57911B7);
        } else {
            this.f57921W6.setRoundCorner(f57911B7);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T0 */
    protected int mo61022T0(int i11, int i12, int i13) {
        return this.f57924Z6 + ((this.f57926b7 - i13) / 2);
    }

    /* renamed from: U3 */
    boolean m61398U3(float f11, float f12) {
        try {
            if (f11 < this.f57941q7 || f11 > r1 + this.f57944t7) {
                return false;
            }
            int i11 = this.f57942r7 - this.f57943s7;
            int i12 = ChatRow.f57189F5;
            if (f12 < i11 - i12 || f12 > r4 + i12) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: V3 */
    boolean m61399V3(float f11, float f12) {
        try {
            if (f11 < this.f57923Y6 || f11 > r1 + this.f57925a7) {
                return false;
            }
            if (f12 < this.f57924Z6) {
                return false;
            }
            if (f12 > r4 + this.f57926b7) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: W3 */
    boolean m61400W3(float f11, float f12) {
        try {
            if (f11 < this.f57933i7 || f11 > r1 + this.f57938n7.width()) {
                return false;
            }
            if (f12 < this.f57934j7) {
                return false;
            }
            if (f12 > r4 + this.f57938n7.height()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: X3 */
    void m61401X3() {
        C17945a0 c17945a0;
        try {
            if (C8917b.m47601f()) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f57263B.m94862C4());
                if (m141809c == null) {
                    m141809c = new ContactProfile(this.f57263B.m94862C4());
                    m141809c.f42437s = this.f57263B.m94854B4();
                }
                getDelegate().mo62059P3(this, new C31883d5(this.f57263B.m95090b5(), this.f57263B.m94983Q3(), this.f57263B.m95131f5(), this.f57925a7, this.f57926b7), m141809c.m40383Q(true, false));
            }
            if (C8917b.m47601f() && !C8917b.m47600e() && (c17945a0 = this.f57263B) != null && !TextUtils.isEmpty(c17945a0.m94983Q3()) && AbstractC23041d2.m118194A(this.f57263B.m94983Q3())) {
                C28071g4.m141535a().m141536b(this.f57263B.m95029V3().m41044h() + "", this.f57263B.m94983Q3());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        m61397Y3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: d2 */
    public int mo61051d2(int i11, int i12, int i13, int i14, boolean z11) {
        int mo61051d2 = super.mo61051d2(i11, i12, i13, i14, z11);
        if (this.f57946v7) {
            if (m60986L1()) {
                this.f57942r7 = this.f57396X1;
                this.f57941q7 = this.f57391W1 + this.f57401Y1 + f57910A7;
            } else {
                this.f57942r7 = ChatRow.f57189F5 + mo61051d2 + this.f57943s7;
                this.f57941q7 = i11 + getBubblePaddingLeft();
            }
            mo61051d2 = Math.max(mo61051d2, this.f57942r7 + ChatRow.f57189F5);
        }
        if (this.f57937m7) {
            this.f57933i7 = this.f57923Y6;
            this.f57934j7 = mo61051d2;
            int i15 = this.f57925a7;
            int i16 = this.f57933i7;
            int i17 = this.f57934j7;
            int i18 = f57914E7;
            this.f57938n7 = new Rect(i16, i17, i16 + i15, i17 + i18);
            this.f57927c7 = this.f57933i7 + ((i15 - ((AbstractC11531v0.m62138F3().getIntrinsicWidth() + this.f57932h7) + this.f57936l7)) / 2);
            this.f57928d7 = this.f57934j7 + ((i18 - AbstractC11531v0.m62138F3().getIntrinsicWidth()) / 2);
            this.f57929e7 = this.f57927c7 + AbstractC11531v0.m62138F3().getIntrinsicWidth() + this.f57936l7;
            this.f57930f7 = this.f57934j7 + ((i18 - this.f57931g7) / 2);
            return mo61051d2 + i18;
        }
        return mo61051d2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f57923Y6 = i11 + getMarginBorder();
        this.f57924Z6 = i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        if (this.f57947w7) {
            return super.getBubbleMaxWidth();
        }
        return f57918y7 + (f57919z7 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBubbleStyle() {
        return this.f57947w7 ? 1 : 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        if (this.f57526t2) {
            return ChatRow.f57201L5;
        }
        return getMarginBorder();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getMarginBorder() {
        if (this.f57947w7) {
            return 0;
        }
        return f57919z7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_gif);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f57263B == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        this.f57560z4.getLocationOnScreen(iArr);
        int i11 = iArr[0] + this.f57923Y6;
        rect.left = i11;
        int i12 = iArr[1] + this.f57924Z6;
        rect.top = i12;
        rect.right = i11 + this.f57925a7;
        rect.bottom = i12 + this.f57926b7;
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f57945u7 && m61398U3(f11, f12)) {
                    AbstractC23647d.m123897g("10006011");
                    int m61008Q0 = m61008Q0(this.f57263B);
                    String m61003P0 = m61003P0(this.f57263B);
                    if (m61008Q0 != -1 && !TextUtils.isEmpty(m61003P0)) {
                        getDelegate().mo62052L3(m61008Q0, m61003P0);
                    } else {
                        getDelegate().mo62065S3();
                    }
                } else if (this.f57935k7 && m61400W3(f11, f12)) {
                    getDelegate().mo62094n4(this);
                    AbstractC23647d.m123897g("900111");
                } else if (this.f57922X6 && m61399V3(f11, f12)) {
                    m61401X3();
                }
            }
            z12 = false;
        } else {
            if (this.f57946v7 && m61398U3(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f57945u7 = z11;
            if (!this.f57937m7 || !m61400W3(f11, f12)) {
                z12 = false;
            }
            this.f57935k7 = z12;
            boolean m61399V3 = m61399V3(f11, f12);
            this.f57922X6 = m61399V3;
            z12 = z12 | z11 | m61399V3;
        }
        return super.mo61075j3(motionEvent, i11, f11, f12) | z12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.ChatRowBase, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        ZSimpleGIFView zSimpleGIFView = this.f57921W6;
        int i15 = this.f57923Y6;
        zSimpleGIFView.layout(i15, this.f57924Z6, zSimpleGIFView.getMeasuredWidth() + i15, this.f57924Z6 + this.f57921W6.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f57921W6.measure(View.MeasureSpec.makeMeasureSpec(this.f57925a7, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f57926b7, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: q0 */
    public void mo61103q0(Canvas canvas) {
        super.mo61103q0(canvas);
        if (this.f57937m7) {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62138F3(), this.f57927c7, this.f57928d7).draw(canvas);
            canvas.drawText(this.f57939o7, this.f57929e7, this.f57930f7 + this.f57931g7, f57915F7);
        }
        if (this.f57946v7) {
            canvas.drawText(this.f57940p7, this.f57941q7, this.f57942r7, f57916G7);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57946v7 = false;
        this.f57940p7 = "";
        this.f57925a7 = 0;
        this.f57926b7 = 0;
        this.f57920V6 = null;
        this.f57271C1 = false;
        this.f57937m7 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C28227x3 mo61130z2 = super.mo61130z2(i11, i12, i13, c28227x3);
        int i14 = mo61130z2.f131649b;
        if (this.f57937m7) {
            Rect rect = new Rect();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.forward_to_friend);
            this.f57939o7 = m118743r0;
            f57915F7.getTextBounds(m118743r0, 0, m118743r0.length(), rect);
            this.f57932h7 = rect.width();
            this.f57931g7 = rect.height();
            i14 += f57914E7;
        }
        if (this.f57946v7 && !TextUtils.isEmpty(this.f57940p7)) {
            Rect rect2 = new Rect();
            C13704p1 c13704p1 = f57916G7;
            String str = this.f57940p7;
            c13704p1.getTextBounds(str, 0, str.length(), rect2);
            this.f57944t7 = rect2.width();
            this.f57943s7 = rect2.height();
            if (!m60986L1()) {
                i14 += (ChatRow.f57189F5 * 2) + this.f57943s7;
            }
        }
        mo61130z2.f131648a = Math.max(mo61130z2.f131648a, i11);
        mo61130z2.f131649b = i14;
        return mo61130z2;
    }
}
