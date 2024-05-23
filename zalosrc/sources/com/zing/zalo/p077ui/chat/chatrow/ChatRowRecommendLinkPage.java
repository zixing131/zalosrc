package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C18013y0;
import ig0.AbstractC20550a;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C32098s;
import p716zh.C32106s7;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowRecommendLinkPage extends ChatRowRecommendLinkBase {

    /* renamed from: k8 */
    public static boolean f58551k8 = false;

    /* renamed from: l8 */
    static final int f58552l8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: m8 */
    static final int f58553m8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: n8 */
    static final int f58554n8 = AbstractC23136l9.m118742r(18.0f);

    /* renamed from: o8 */
    static C13704p1 f58555o8;

    /* renamed from: p8 */
    static C13704p1 f58556p8;

    /* renamed from: q8 */
    static float f58557q8;

    /* renamed from: b8 */
    public String f58558b8;

    /* renamed from: c8 */
    private boolean f58559c8;

    /* renamed from: d8 */
    int f58560d8;

    /* renamed from: e8 */
    int f58561e8;

    /* renamed from: f8 */
    String f58562f8;

    /* renamed from: g8 */
    String f58563g8;

    /* renamed from: h8 */
    String f58564h8;

    /* renamed from: i8 */
    String f58565i8;

    /* renamed from: j8 */
    C3977j f58566j8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLinkPage$a */
    /* loaded from: classes5.dex */
    public class C11401a extends C23999j {
        C11401a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRowRecommendLinkPage chatRowRecommendLinkPage = ChatRowRecommendLinkPage.this;
                if (chatRowRecommendLinkPage.f57263B != null && TextUtils.equals(str, chatRowRecommendLinkPage.f58558b8) && c3979l != null && c3979l.m18839c() != null) {
                    boolean z11 = true;
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendLinkPage.this.f58559c8 = true;
                    ChatRowRecommendLinkPage.this.f58566j8.setImageInfo(c3979l, false);
                    C13697o c13697o = ChatRowRecommendLinkPage.this.f58489C7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() == 4) {
                        z11 = false;
                    }
                    c13697o.m76480u(m18839c, z11);
                    ChatRowRecommendLinkPage.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowRecommendLinkPage(Context context) {
        super(context);
        this.f58565i8 = "";
        this.f58566j8 = new C3977j(context);
        if (f58555o8 == null || f58551k8) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58555o8 = c13704p1;
            c13704p1.m76613c();
            f58555o8.setColor(AbstractC11531v0.m62153I3());
            f58555o8.setTextSize(AbstractC23136l9.m118759w1(14));
            f58557q8 = Math.max(0.0f, f58554n8 - (f58555o8.getFontMetrics().descent - f58555o8.getFontMetrics().ascent));
            C13704p1 c13704p12 = new C13704p1(1);
            f58556p8 = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
            f58556p8.setColor(C23212s8.m119607o(context, AbstractC16781w.LinkColor2));
            f58556p8.setTextSize(AbstractC23136l9.m118759w1(12));
            f58551k8 = false;
        }
        this.f58489C7.m76482w(ChatRow.f57255z5.getColor());
        this.f58489C7.m76461I(ChatRow.f57185D5);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        this.f58489C7.m76462J(2, i12 - (f58553m8 * 2));
        int m76472k = this.f58489C7.m76472k();
        StaticLayout staticLayout = this.f58490D7;
        if (staticLayout != null) {
            m76472k += staticLayout.getHeight() + f58552l8;
        }
        if (mo61163l4()) {
            m76472k += f58552l8 + getTextHeight();
        }
        StaticLayout staticLayout2 = this.f58496J7;
        if (staticLayout2 != null) {
            m76472k += f58552l8 + staticLayout2.getHeight();
        }
        c28227x3.f131649b = m76472k;
        c28227x3.f131648a = i12;
        return c28227x3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f57271C1 = false;
        if (c17945a0.m94929K2() instanceof C18013y0) {
            C18013y0 c18013y0 = (C18013y0) c17945a0.m94929K2();
            C32098s c32098s = c18013y0.f91251B;
            String str = "";
            if (c32098s != null) {
                String str2 = c32098s.f147951a;
                if (str2 == null) {
                    str2 = "";
                }
                this.f58500N7 = str2;
                String str3 = c32098s.f147953c;
                if (str3 == null) {
                    str3 = "";
                }
                this.f58562f8 = str3;
                int i11 = c32098s.f147956f;
                this.f58499M7 = i11;
                String str4 = c32098s.f147952b;
                if (str4 == null) {
                    str4 = "";
                }
                this.f58564h8 = str4;
                this.f58501O7 = c32098s.f147954d;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                this.f58563g8 = c18013y0.f91015t;
                                if (c32098s != null && c32098s.m154938h()) {
                                    this.f58502P7 = C32106s7.m154972a(c18013y0);
                                }
                            }
                        }
                    }
                    this.f58563g8 = c18013y0.f91015t;
                    this.f58565i8 = c32098s.f147961k;
                    if (c32098s != null) {
                        this.f58502P7 = C32106s7.m154972a(c18013y0);
                    }
                }
                String str5 = c32098s.f147957g;
                if (str5 == null) {
                    str5 = "";
                }
                this.f58563g8 = str5;
                if (c32098s != null) {
                }
            } else {
                this.f58562f8 = c18013y0.f91011p;
                this.f58499M7 = 0;
                this.f58563g8 = "";
                if (!TextUtils.isEmpty(c18013y0.f91014s)) {
                    this.f58565i8 = AbstractC20550a.m106804a(c18013y0.f91014s);
                }
            }
            String str6 = c18013y0.f91013r;
            if (str6 != null) {
                str = str6;
            }
            this.f58558b8 = str;
        }
    }

    /* renamed from: H4 */
    void m61629H4() {
        try {
            if (TextUtils.isEmpty(this.f58558b8)) {
                this.f58489C7.m76477r();
                invalidate();
                this.f58559c8 = true;
            } else {
                this.f58489C7.m76477r();
                this.f58566j8.setImageInfo(null);
                if (m60988L3() || C23999j.m125696L2(this.f58558b8, C23278z2.m120136k0())) {
                    ((C23528a) this.f57275D.m123612r(this.f58566j8)).m123579C(this.f58558b8, C23278z2.m120136k0(), new C11401a());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        String str;
        super.mo60975I3(c17945a0, c28769a, i11);
        int mo61198j4 = mo61198j4(i11);
        if (mo61198j4 <= 0) {
            return;
        }
        if (!TextUtils.isEmpty(this.f58562f8)) {
            if (!TextUtils.isEmpty(this.f58562f8) && !TextUtils.isEmpty(this.f58563g8)) {
                str = this.f58562f8 + " - " + this.f58563g8;
            } else if (!TextUtils.isEmpty(this.f58562f8)) {
                str = this.f58562f8;
            } else if (!TextUtils.isEmpty(this.f58563g8)) {
                str = this.f58563g8;
            } else {
                str = "";
            }
            this.f58490D7 = AbstractC23214t.m119625l(str, f58555o8, mo61198j4, 3);
        }
        if (!TextUtils.isEmpty(this.f58564h8)) {
            this.f58496J7 = AbstractC23214t.m119625l(this.f58564h8, f58556p8, mo61198j4, 1);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: S0 */
    public int mo61017S0(int i11, int i12, int i13, boolean z11) {
        return ((i11 + i12) / 2) - (i13 / 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58559c8) {
            m61629H4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f58489C7.m76460H(f58553m8 + i11, i12);
        int m76472k = i12 + this.f58489C7.m76472k();
        if (this.f58490D7 != null) {
            this.f58491E7 = getBubblePaddingLeft() + i11;
            int i15 = f58552l8;
            this.f58492F7 = m76472k + i15;
            m76472k += i15 + this.f58490D7.getHeight();
        }
        if (mo61163l4()) {
            this.f58560d8 = getBubblePaddingLeft() + i11;
            int i16 = f58552l8;
            this.f58561e8 = m76472k + i16;
            m76472k += i16 + getTextHeight();
        }
        if (this.f58496J7 != null) {
            this.f58497K7 = i11 + getBubblePaddingLeft();
            this.f58498L7 = m76472k + f58552l8;
            this.f58496J7.getHeight();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return getWidthMeasurement() - (ChatRow.f57197J5 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBubbleStyle() {
        return 1;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return f58552l8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58560d8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58561e8;
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
        this.f58489C7.m76467d(canvas);
        if (this.f58490D7 != null) {
            canvas.save();
            canvas.translate(this.f58491E7, this.f58492F7);
            this.f58490D7.draw(canvas);
            canvas.restore();
        }
        if (this.f58496J7 != null) {
            canvas.save();
            canvas.translate(this.f58497K7, this.f58498L7);
            this.f58496J7.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58499M7 = 0;
        this.f58562f8 = "";
        this.f58563g8 = "";
        this.f58564h8 = "";
        this.f58558b8 = "";
        this.f58501O7 = "";
        this.f58565i8 = "";
        this.f58512Z7 = false;
        this.f58509W7.m76349t(false);
        this.f58490D7 = null;
        this.f58496J7 = null;
        this.f58559c8 = false;
        this.f58488B7 = true;
    }
}
