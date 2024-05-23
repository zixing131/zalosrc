package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C17999s0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowVideoLiveStream extends ChatRow {

    /* renamed from: s7 */
    public static boolean f58867s7 = false;

    /* renamed from: t7 */
    static final int f58868t7 = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: u7 */
    static final int f58869u7 = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: v7 */
    static final int f58870v7 = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: w7 */
    static final int f58871w7 = AbstractC23136l9.m118742r(9.0f);

    /* renamed from: x7 */
    static C13704p1 f58872x7;

    /* renamed from: y7 */
    static C13704p1 f58873y7;

    /* renamed from: V6 */
    int f58874V6;

    /* renamed from: W6 */
    int f58875W6;

    /* renamed from: X6 */
    StaticLayout f58876X6;

    /* renamed from: Y6 */
    StaticLayout f58877Y6;

    /* renamed from: Z6 */
    C13697o f58878Z6;

    /* renamed from: a7 */
    int f58879a7;

    /* renamed from: b7 */
    int f58880b7;

    /* renamed from: c7 */
    String f58881c7;

    /* renamed from: d7 */
    int f58882d7;

    /* renamed from: e7 */
    int f58883e7;

    /* renamed from: f7 */
    int f58884f7;

    /* renamed from: g7 */
    int f58885g7;

    /* renamed from: h7 */
    int f58886h7;

    /* renamed from: i7 */
    int f58887i7;

    /* renamed from: j7 */
    int f58888j7;

    /* renamed from: k7 */
    int f58889k7;

    /* renamed from: l7 */
    String f58890l7;

    /* renamed from: m7 */
    String f58891m7;

    /* renamed from: n7 */
    boolean f58892n7;

    /* renamed from: o7 */
    boolean f58893o7;

    /* renamed from: p7 */
    int f58894p7;

    /* renamed from: q7 */
    int f58895q7;

    /* renamed from: r7 */
    C3977j f58896r7;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoLiveStream$a */
    /* loaded from: classes5.dex */
    public class C11428a extends C23999j {
        C11428a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRowVideoLiveStream chatRowVideoLiveStream = ChatRowVideoLiveStream.this;
                if (chatRowVideoLiveStream.f57263B != null && TextUtils.equals(str, chatRowVideoLiveStream.f58881c7) && c3979l != null && c3979l.m18839c() != null) {
                    boolean z11 = true;
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowVideoLiveStream chatRowVideoLiveStream2 = ChatRowVideoLiveStream.this;
                    chatRowVideoLiveStream2.f58893o7 = true;
                    C3977j c3977j = chatRowVideoLiveStream2.f58896r7;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13697o c13697o = ChatRowVideoLiveStream.this.f58878Z6;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() == 4) {
                        z11 = false;
                    }
                    c13697o.m76480u(m18839c, z11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowVideoLiveStream(Context context) {
        super(context);
        this.f58892n7 = false;
        this.f58893o7 = false;
        this.f58896r7 = new C3977j(context);
        if (f58872x7 == null || f58867s7) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58872x7 = c13704p1;
            c13704p1.m76613c();
            f58872x7.setColor(C23212s8.m119607o(context, AbstractC16781w.TextColor3));
            f58872x7.setTextSize(AbstractC23136l9.m118759w1(11));
            C13704p1 c13704p12 = new C13704p1(1);
            f58873y7 = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
            f58873y7.setColor(C23212s8.m119607o(context, AbstractC16781w.TextColor3));
            f58873y7.setTextSize(AbstractC23136l9.m118759w1(11));
            f58867s7 = false;
        }
        float m118742r = AbstractC23136l9.m118742r(5.0f);
        C13697o c13697o = new C13697o(this);
        this.f58878Z6 = c13697o;
        c13697o.m76461I(new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r});
    }

    /* renamed from: U3 */
    private void m61753U3() {
        try {
            if (TextUtils.isEmpty(this.f58881c7)) {
                this.f58878Z6.m76477r();
                invalidate();
                return;
            }
            C24003n m120068F = C23278z2.m120068F();
            this.f58878Z6.m76477r();
            if (getDelegate().mo62069W3() || C23999j.m125696L2(this.f58881c7, m120068F)) {
                ((C23528a) this.f57275D.m123612r(this.f58896r7)).m123579C(this.f58881c7, m120068F, new C11428a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int height;
        StaticLayout staticLayout = this.f58876X6;
        int i13 = 0;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        StaticLayout staticLayout2 = this.f58877Y6;
        if (staticLayout2 != null) {
            i13 = staticLayout2.getHeight();
        }
        c28227x3.f131649b = AbstractC23136l9.m118742r(3.0f) + height + i13 + f58871w7 + this.f58878Z6.m76472k();
        c28227x3.f131648a = this.f58878Z6.m76473l() + (f58868t7 * 2);
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        String m114539f;
        String str;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() != null) {
            this.f58890l7 = c17945a0.m94929K2().f91011p;
            if (c17945a0.m94929K2().f91013r == null) {
                str = "";
            } else {
                str = c17945a0.m94929K2().f91013r;
            }
            this.f58881c7 = str;
            if (c17945a0.m94929K2() instanceof C17999s0) {
                this.f58892n7 = ((C17999s0) c17945a0.m94929K2()).f91168B;
            }
        }
        if (!TextUtils.isEmpty(c28769a.f133305a)) {
            m114539f = c28769a.f133305a;
        } else {
            m114539f = AbstractC21935u.m114539f("", c17945a0.m94862C4(), c17945a0.m94854B4());
        }
        this.f58890l7 = m114539f;
        if (this.f58892n7) {
            this.f58891m7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_live_streaming_end_without_name);
        } else {
            this.f58891m7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_live_streaming_active_without_name);
        }
        if (!TextUtils.isEmpty(c17945a0.m94929K2().f91017v)) {
            try {
                JSONObject jSONObject = new JSONObject(c17945a0.m94929K2().f91017v);
                this.f58879a7 = jSONObject.optInt("thumbWidth");
                this.f58880b7 = jSONObject.optInt("thumbHeight");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f58878Z6.m76462J(0, i11 - (f58868t7 * 2));
        int i13 = this.f58879a7;
        if (i13 > 0 && (i12 = this.f58880b7) > 0) {
            this.f58878Z6.m76481v(i13, i12);
        } else {
            this.f58878Z6.m76478s();
        }
        int m76473l = (((this.f58878Z6.m76473l() - getBubblePaddingLeft()) - AbstractC11531v0.m62355z2().getIntrinsicWidth()) - getBubblePaddingRight()) - f58869u7;
        this.f58876X6 = AbstractC23214t.m119625l(this.f58890l7, f58872x7, m76473l, 1);
        this.f58877Y6 = AbstractC23214t.m119625l(this.f58891m7, f58873y7, m76473l, 2);
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
        if (!this.f58893o7) {
            m61753U3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        if ((c17945a0.m94929K2() instanceof C17999s0) && this.f58892n7 != ((C17999s0) c17945a0.m94929K2()).f91168B) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int height;
        int bubblePaddingLeft = getBubblePaddingLeft() + i11;
        this.f58874V6 = bubblePaddingLeft;
        int i15 = f58869u7;
        this.f58875W6 = i12 + i15;
        this.f58886h7 = bubblePaddingLeft + AbstractC11531v0.m62355z2().getIntrinsicWidth() + i15;
        this.f58887i7 = i12 + AbstractC23136l9.m118742r(3.0f);
        StaticLayout staticLayout = this.f58876X6;
        int i16 = 0;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        this.f58888j7 = this.f58886h7;
        this.f58889k7 = this.f58887i7 + height;
        StaticLayout staticLayout2 = this.f58877Y6;
        if (staticLayout2 != null) {
            i16 = staticLayout2.getHeight();
        }
        int i17 = i11 + f58868t7;
        this.f58894p7 = i17;
        this.f58895q7 = this.f58889k7 + i16 + f58871w7;
        int m76473l = this.f58878Z6.m76473l();
        int i18 = f58870v7;
        this.f58882d7 = i17 + ((m76473l - i18) / 2);
        int m76472k = this.f58895q7 + ((this.f58878Z6.m76472k() - i18) / 2);
        this.f58883e7 = m76472k;
        this.f58884f7 = this.f58882d7 + i18;
        this.f58885g7 = m76472k + i18;
        this.f58878Z6.m76460H(this.f58894p7, this.f58895q7);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return Math.max(getWidthMeasurement() - ChatRow.f57198J6, AbstractC11531v0.m62231a3());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f58868t7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getMarginBorder() {
        return f58868t7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        StringBuilder sb2 = new StringBuilder();
        try {
            StaticLayout staticLayout = this.f58876X6;
            if (staticLayout != null) {
                sb2.append(staticLayout.getText());
                sb2.append(" ");
            }
            StaticLayout staticLayout2 = this.f58877Y6;
            if (staticLayout2 != null) {
                sb2.append(staticLayout2.getText());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f58878Z6 != null && this.f57263B != null) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            this.f57560z4.getLocationOnScreen(iArr);
            int i11 = iArr[0] + this.f58894p7;
            rect.left = i11;
            rect.top = iArr[1] + this.f58895q7;
            rect.right = i11 + this.f58878Z6.m76473l();
            rect.bottom = rect.top + this.f58878Z6.m76472k();
            return rect;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        Drawable m62355z2;
        if (this.f58892n7) {
            m62355z2 = AbstractC11531v0.m62112A2();
        } else {
            m62355z2 = AbstractC11531v0.m62355z2();
        }
        int i11 = 0;
        if (m62355z2 != null) {
            m62355z2.setBounds(0, 0, m62355z2.getIntrinsicWidth(), m62355z2.getIntrinsicHeight());
            canvas.save();
            canvas.translate(this.f58874V6, this.f58875W6);
            m62355z2.draw(canvas);
            canvas.restore();
        }
        if (this.f58876X6 != null) {
            canvas.save();
            canvas.translate(this.f58886h7, this.f58887i7);
            this.f58876X6.draw(canvas);
            canvas.restore();
        }
        if (this.f58877Y6 != null) {
            canvas.save();
            canvas.translate(this.f58888j7, this.f58889k7);
            this.f58877Y6.draw(canvas);
            canvas.restore();
        }
        C13697o c13697o = this.f58878Z6;
        if (c13697o != null) {
            c13697o.m76467d(canvas);
        }
        AbstractC11531v0.m62271i3().setBounds(this.f58882d7, this.f58883e7, this.f58884f7, this.f58885g7);
        AbstractC11531v0.m62271i3().draw(canvas);
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m94849A8() && AbstractC11531v0.m62147H2() != null && AbstractC11531v0.m62137F2() != null) {
            int i12 = this.f58894p7;
            int i13 = this.f58895q7;
            C13697o c13697o2 = this.f58878Z6;
            if (c13697o2 != null) {
                i11 = c13697o2.m76472k();
            }
            int i14 = i13 + i11;
            int dimensionPixelSize = i12 + getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            int intrinsicHeight = (i14 - AbstractC11531v0.m62137F2().getIntrinsicHeight()) - getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            AbstractC28236y3.m142204o(AbstractC11531v0.m62137F2(), dimensionPixelSize, intrinsicHeight);
            AbstractC11531v0.m62137F2().draw(canvas);
            int m118742r = AbstractC23136l9.m118742r(2.0f);
            int m118742r2 = AbstractC23136l9.m118742r(2.0f);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            int i15 = dimensionPixelSize + m118742r;
            int i16 = intrinsicHeight + m118742r2;
            AbstractC11531v0.m62147H2().setBounds(i15, i16, i15 + m118742r3, m118742r3 + i16);
            AbstractC11531v0.m62147H2().draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58893o7 = false;
        this.f58890l7 = "";
        this.f58881c7 = "";
        this.f58892n7 = false;
        this.f58876X6 = null;
        this.f58877Y6 = null;
        this.f58878Z6.m76476p();
        this.f58879a7 = 0;
        this.f58880b7 = 0;
    }
}
