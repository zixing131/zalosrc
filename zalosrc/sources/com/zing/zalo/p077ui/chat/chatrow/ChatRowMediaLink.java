package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import dj.C17945a0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowMediaLink extends ChatRow {

    /* renamed from: l7 */
    static final String f58098l7 = ChatRowRecommendContact.class.getSimpleName();

    /* renamed from: m7 */
    static int f58099m7 = AbstractC23136l9.m118742r(58.0f);

    /* renamed from: n7 */
    static final int f58100n7 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: o7 */
    static final int f58101o7 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: V6 */
    String f58102V6;

    /* renamed from: W6 */
    StaticLayout f58103W6;

    /* renamed from: X6 */
    int f58104X6;

    /* renamed from: Y6 */
    int f58105Y6;

    /* renamed from: Z6 */
    String f58106Z6;

    /* renamed from: a7 */
    Drawable f58107a7;

    /* renamed from: b7 */
    boolean f58108b7;

    /* renamed from: c7 */
    int f58109c7;

    /* renamed from: d7 */
    int f58110d7;

    /* renamed from: e7 */
    Drawable f58111e7;

    /* renamed from: f7 */
    Rect f58112f7;

    /* renamed from: g7 */
    int f58113g7;

    /* renamed from: h7 */
    int f58114h7;

    /* renamed from: i7 */
    int f58115i7;

    /* renamed from: j7 */
    int f58116j7;

    /* renamed from: k7 */
    C3977j f58117k7;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMediaLink$a */
    /* loaded from: classes5.dex */
    public class C11374a extends C23999j {
        C11374a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRowMediaLink chatRowMediaLink = ChatRowMediaLink.this;
                if (chatRowMediaLink.f57263B != null && TextUtils.equals(str, chatRowMediaLink.f58106Z6) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowMediaLink chatRowMediaLink2 = ChatRowMediaLink.this;
                    chatRowMediaLink2.f58108b7 = true;
                    C3977j c3977j = chatRowMediaLink2.f58117k7;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    ChatRowMediaLink.this.f58107a7 = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    ChatRowMediaLink.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowMediaLink(Context context) {
        super(context);
        this.f58112f7 = new Rect();
        this.f58117k7 = new C3977j(context);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int max = Math.max(i11, this.f58104X6);
        int i13 = f58099m7;
        int i14 = f58100n7;
        int intrinsicWidth = i13 + i14 + max + i14 + AbstractC11531v0.m62132E2().getIntrinsicWidth();
        int max2 = Math.max(f58099m7, this.f58105Y6);
        c28227x3.f131648a = getBubblePaddingLeft() + intrinsicWidth + getBubblePaddingRight();
        c28227x3.f131649b = max2;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() != null) {
            this.f58106Z6 = c17945a0.m94929K2().f91013r;
            this.f58102V6 = c17945a0.m94929K2().f91011p;
        }
        this.f58111e7 = m61457U3(c17945a0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        int intrinsicWidth = AbstractC11531v0.m62132E2().getIntrinsicWidth();
        if (!TextUtils.isEmpty(this.f58102V6)) {
            StaticLayout m119625l = AbstractC23214t.m119625l(this.f58102V6, ChatRow.f57251x5, ((((i11 - getBubblePaddingLeft()) - f58099m7) - intrinsicWidth) - getBubblePaddingRight()) - f58100n7, 5);
            this.f58103W6 = m119625l;
            this.f58104X6 = AbstractC23136l9.m118695b0(m119625l);
            this.f58105Y6 = this.f58103W6.getHeight();
        }
    }

    /* renamed from: U3 */
    Drawable m61457U3(C17945a0 c17945a0) {
        if (c17945a0.m95041W4() == 12 && c17945a0.m94929K2() != null && c17945a0.m94929K2().f91016u != null && c17945a0.m94929K2().f91016u.equals("recommened.link")) {
            return AbstractC11531v0.m62350y2();
        }
        return AbstractC11531v0.m62350y2();
    }

    /* renamed from: V3 */
    void m61458V3() {
        try {
            this.f58107a7 = C23278z2.m120120d0().f116261b;
            if (TextUtils.isEmpty(this.f58106Z6)) {
                this.f58108b7 = true;
            } else if (getDelegate().mo62069W3() || C23999j.m125696L2(this.f58106Z6, C23278z2.m120120d0())) {
                ((C23528a) this.f57275D.m123612r(this.f58117k7)).m123579C(this.f58106Z6, C23278z2.m120120d0(), new C11374a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58108b7) {
            m61458V3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int bubblePaddingLeft = i11 + getBubblePaddingLeft();
        this.f58109c7 = bubblePaddingLeft;
        this.f58110d7 = i12;
        this.f58113g7 = bubblePaddingLeft + AbstractC23136l9.m118742r(2.0f);
        int m118742r = ((this.f58110d7 + f58099m7) - AbstractC23136l9.m118742r(2.0f)) - f58101o7;
        this.f58114h7 = m118742r;
        Rect rect = this.f58112f7;
        int i15 = this.f58109c7;
        int m118742r2 = m118742r - AbstractC23136l9.m118742r(2.0f);
        int i16 = this.f58109c7;
        int i17 = f58099m7;
        rect.set(i15, m118742r2, i16 + i17, this.f58110d7 + i17);
        this.f58115i7 = (i13 - getBubblePaddingRight()) - AbstractC11531v0.m62132E2().getIntrinsicWidth();
        this.f58116j7 = (i12 + (f58099m7 / 2)) - (AbstractC11531v0.m62132E2().getIntrinsicHeight() / 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        Drawable drawable = this.f58107a7;
        if (drawable != null) {
            int i11 = this.f58109c7;
            int i12 = this.f58110d7;
            int i13 = f58099m7;
            drawable.setBounds(i11, i12, i11 + i13, i13 + i12);
            this.f58107a7.draw(canvas);
        }
        if (this.f58103W6 != null) {
            canvas.save();
            canvas.translate(this.f58109c7 + f58099m7 + f58100n7, this.f58110d7);
            this.f58103W6.draw(canvas);
            canvas.restore();
        }
        if (this.f58111e7 != null) {
            canvas.drawRect(this.f58112f7, ChatRow.f57244s6);
            Drawable drawable2 = this.f58111e7;
            int i14 = this.f58113g7;
            int i15 = this.f58114h7;
            int i16 = f58101o7;
            drawable2.setBounds(i14, i15, i14 + i16, i16 + i15);
            this.f58111e7.draw(canvas);
        }
        AbstractC28236y3.m142204o(AbstractC11531v0.m62132E2(), this.f58115i7, this.f58116j7).draw(canvas);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58103W6 = null;
        this.f58106Z6 = "";
        this.f58102V6 = "";
        this.f58111e7 = null;
        this.f58108b7 = false;
        this.f58104X6 = 0;
        this.f58105Y6 = 0;
    }
}
