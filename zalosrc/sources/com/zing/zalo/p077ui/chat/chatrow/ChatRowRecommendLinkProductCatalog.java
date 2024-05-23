package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import androidx.core.content.res.AbstractC1401h;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C32098s;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowRecommendLinkProductCatalog extends ChatRowRecommendLinkBase {

    /* renamed from: A8 */
    private static final int f58568A8;

    /* renamed from: B8 */
    private static final int f58569B8;

    /* renamed from: C8 */
    private static final int f58570C8;

    /* renamed from: D8 */
    private static final int f58571D8;

    /* renamed from: E8 */
    private static final int f58572E8;

    /* renamed from: F8 */
    private static final float[] f58573F8;

    /* renamed from: G8 */
    private static final int f58574G8;

    /* renamed from: H8 */
    private static final float[] f58575H8;

    /* renamed from: I8 */
    private static final int f58576I8;

    /* renamed from: J8 */
    private static final int f58577J8;

    /* renamed from: K8 */
    private static final int f58578K8;

    /* renamed from: L8 */
    private static final int f58579L8;

    /* renamed from: M8 */
    private static final int f58580M8;

    /* renamed from: N8 */
    private static C13704p1 f58581N8;

    /* renamed from: O8 */
    private static C13704p1 f58582O8;

    /* renamed from: P8 */
    private static C13704p1 f58583P8;

    /* renamed from: Q8 */
    private static float f58584Q8;

    /* renamed from: R8 */
    private static float f58585R8;

    /* renamed from: S8 */
    private static float f58586S8;

    /* renamed from: x8 */
    private static boolean f58587x8;

    /* renamed from: z8 */
    private static final int f58589z8;

    /* renamed from: b8 */
    private String f58590b8;

    /* renamed from: c8 */
    private boolean f58591c8;

    /* renamed from: d8 */
    private int f58592d8;

    /* renamed from: e8 */
    private int f58593e8;

    /* renamed from: f8 */
    private int f58594f8;

    /* renamed from: g8 */
    private int f58595g8;

    /* renamed from: h8 */
    private int f58596h8;

    /* renamed from: i8 */
    private int f58597i8;

    /* renamed from: j8 */
    private int f58598j8;

    /* renamed from: k8 */
    private int f58599k8;

    /* renamed from: l8 */
    private int f58600l8;

    /* renamed from: m8 */
    private int f58601m8;

    /* renamed from: n8 */
    private boolean f58602n8;

    /* renamed from: o8 */
    private int f58603o8;

    /* renamed from: p8 */
    private int f58604p8;

    /* renamed from: q8 */
    private int f58605q8;

    /* renamed from: r8 */
    private String f58606r8;

    /* renamed from: s8 */
    private int f58607s8;

    /* renamed from: t8 */
    private String f58608t8;

    /* renamed from: u8 */
    private int f58609u8;

    /* renamed from: v8 */
    private int f58610v8;

    /* renamed from: w8 */
    private final C3977j f58611w8;
    public static final C11402a Companion = new C11402a(null);

    /* renamed from: y8 */
    private static final int f58588y8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLinkProductCatalog$a */
    /* loaded from: classes5.dex */
    public static final class C11402a {
        private C11402a() {
        }

        public /* synthetic */ C11402a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m61637a() {
            return ChatRowRecommendLinkProductCatalog.f58587x8;
        }

        /* renamed from: b */
        public final void m61638b(boolean z11) {
            ChatRowRecommendLinkProductCatalog.f58587x8 = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLinkProductCatalog$b */
    /* loaded from: classes5.dex */
    public static final class C11403b extends C23999j {
        C11403b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                ChatRowRecommendLinkProductCatalog chatRowRecommendLinkProductCatalog = ChatRowRecommendLinkProductCatalog.this;
                if (chatRowRecommendLinkProductCatalog.f57263B != null && TextUtils.equals(str, chatRowRecommendLinkProductCatalog.f58590b8) && c3979l != null && c3979l.m18839c() != null) {
                    boolean z11 = true;
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendLinkProductCatalog.this.f58591c8 = true;
                    ChatRowRecommendLinkProductCatalog.this.f58611w8.setImageInfo(c3979l, false);
                    C13697o c13697o = ChatRowRecommendLinkProductCatalog.this.f58489C7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() == 4) {
                        z11 = false;
                    }
                    c13697o.m76480u(m18839c, z11);
                    ChatRowRecommendLinkProductCatalog.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(60.0f);
        f58589z8 = m118742r;
        f58568A8 = m118742r;
        f58569B8 = (m118742r * 16) / 9;
        f58570C8 = AbstractC23136l9.m118742r(60.0f);
        f58571D8 = AbstractC23136l9.m118742r(8.0f);
        int m118742r2 = AbstractC23136l9.m118742r(4.0f);
        f58572E8 = m118742r2;
        f58573F8 = new float[]{m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2};
        int m118742r3 = AbstractC23136l9.m118742r(4.0f);
        f58574G8 = m118742r3;
        f58575H8 = new float[]{m118742r3, m118742r3, m118742r3, m118742r3, m118742r3, m118742r3, m118742r3, m118742r3};
        f58576I8 = AbstractC23136l9.m118742r(4.0f);
        f58577J8 = AbstractC23136l9.m118742r(5.0f);
        f58578K8 = AbstractC23136l9.m118742r(10.0f);
        f58579L8 = AbstractC23136l9.m118742r(4.0f);
        f58580M8 = AbstractC23136l9.m118759w1(18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowRecommendLinkProductCatalog(Context context) {
        super(context);
        float m116579b;
        float m116579b2;
        float m116579b3;
        AbstractC19074t.m100208f(context, "context");
        if (f58581N8 == null || f58587x8) {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76613c();
            c13704p1.setColor(AbstractC11531v0.Companion.m62529Q1());
            c13704p1.setTextSize(AbstractC23136l9.m118759w1(14));
            int i11 = f58580M8;
            m116579b = AbstractC22543l.m116579b(0.0f, i11 - (c13704p1.getFontMetrics().descent - c13704p1.getFontMetrics().ascent));
            f58584Q8 = m116579b;
            f58581N8 = c13704p1;
            C13704p1 c13704p12 = new C13704p1(1);
            Typeface typeface = Typeface.DEFAULT;
            c13704p12.setTypeface(typeface);
            c13704p12.setColor(AbstractC1401h.m7080d(getContext().getResources(), AbstractC2808b.f150821b60, getContext().getTheme()));
            c13704p12.setTextSize(AbstractC23136l9.m118759w1(14));
            m116579b2 = AbstractC22543l.m116579b(0.0f, i11 - (c13704p12.getFontMetrics().descent - c13704p12.getFontMetrics().ascent));
            f58585R8 = m116579b2;
            f58582O8 = c13704p12;
            C13704p1 c13704p13 = new C13704p1(1);
            c13704p13.setTypeface(typeface);
            c13704p13.setColor(C23212s8.m119607o(context, AbstractC2807a.text_02));
            c13704p13.setTextSize(AbstractC23136l9.m118759w1(14));
            m116579b3 = AbstractC22543l.m116579b(0.0f, i11 - (c13704p13.getFontMetrics().descent - c13704p13.getFontMetrics().ascent));
            f58586S8 = m116579b3;
            f58583P8 = c13704p13;
            f58587x8 = false;
        }
        this.f58489C7.m76482w(ChatRow.f57255z5.getColor());
        this.f58489C7.m76484y(1);
        this.f58611w8 = new C3977j(context);
    }

    /* renamed from: L4 */
    private final boolean m61635L4() {
        return this.f58592d8 == 1;
    }

    /* renamed from: M4 */
    private final void m61636M4() {
        try {
            if (TextUtils.isEmpty(this.f58590b8)) {
                this.f58489C7.m76477r();
                invalidate();
                this.f58591c8 = true;
            } else {
                C24003n m120136k0 = C23278z2.m120136k0();
                this.f58489C7.m76477r();
                if (m60988L3() || C23999j.m125696L2(this.f58590b8, m120136k0)) {
                    ((C23528a) this.f57275D.m123612r(this.f58611w8)).m123579C(this.f58590b8, m120136k0, new C11403b());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final boolean getForceRefresh() {
        return Companion.m61637a();
    }

    public static final void setForceRefresh(boolean z11) {
        Companion.m61638b(z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int i14;
        int i15;
        int i16;
        int m116580c;
        int m116580c2;
        int m116584g;
        AbstractC19074t.m100208f(c28227x3, "result");
        int i17 = f58579L8;
        this.f58599k8 = i17;
        this.f58601m8 = i17;
        int i18 = this.f58592d8;
        int i19 = 0;
        if (i18 != -1 && i18 != 0) {
            if (i18 != 1) {
                m116580c2 = 0;
            } else {
                int i21 = f58577J8;
                this.f58599k8 = i21;
                int i22 = this.f58595g8 + i17;
                StaticLayout staticLayout = this.f58490D7;
                if (staticLayout != null) {
                    i22 += i21 + staticLayout.getHeight();
                }
                int i23 = i22;
                StaticLayout staticLayout2 = this.f58493G7;
                if (staticLayout2 != null) {
                    i23 += this.f58601m8 + staticLayout2.getHeight();
                }
                m116580c2 = i23;
                i19 = i12;
            }
        } else {
            StaticLayout staticLayout3 = this.f58490D7;
            if (staticLayout3 != null) {
                i13 = staticLayout3.getWidth();
            } else {
                i13 = 0;
            }
            StaticLayout staticLayout4 = this.f58490D7;
            if (staticLayout4 != null) {
                i14 = staticLayout4.getHeight();
            } else {
                i14 = 0;
            }
            StaticLayout staticLayout5 = this.f58493G7;
            if (staticLayout5 != null) {
                i15 = staticLayout5.getWidth();
            } else {
                i15 = 0;
            }
            StaticLayout staticLayout6 = this.f58493G7;
            if (staticLayout6 != null) {
                i16 = staticLayout6.getHeight();
            } else {
                i16 = 0;
            }
            this.f58601m8 = f58578K8;
            m116580c = AbstractC22543l.m116580c(i13, i15);
            if (i16 > 0) {
                i14 += i16 + this.f58601m8;
            }
            i19 = AbstractC22543l.m116580c(0, this.f58596h8 + f58588y8 + m116580c + (ChatRow.f57203M5 * 2));
            m116580c2 = AbstractC22543l.m116580c(i14, f58589z8);
            if (this.f58602n8) {
                m116580c2 += this.f58599k8;
            }
        }
        m116584g = AbstractC22543l.m116584g(i19, i12);
        c28227x3.f131648a = m116584g;
        c28227x3.f131649b = m116580c2;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        boolean z13 = false;
        if (c17945a0.m94929K2() instanceof C18013y0) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
            C18013y0 c18013y0 = (C18013y0) m94929K2;
            C32098s c32098s = c18013y0.f91251B;
            String str = "";
            if (c32098s != null) {
                String str2 = c32098s.f147953c;
                if (str2 != null) {
                    str = str2;
                }
                this.f58606r8 = str;
                this.f58499M7 = c32098s.f147956f;
                this.f58608t8 = c18013y0.f91015t;
                this.f58592d8 = c32098s.f147970t;
                this.f58593e8 = c32098s.f147971u;
                this.f58594f8 = c32098s.f147972v;
            } else {
                this.f58606r8 = c18013y0.f91011p;
                this.f58499M7 = 0;
                this.f58608t8 = "";
            }
            String str3 = c18013y0.f91013r;
            this.f58590b8 = str3;
            if (TextUtils.isEmpty(str3)) {
                this.f58592d8 = -1;
            }
        }
        if (this.f57560z4.mo60993N() && c17945a0.m94963O0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57271C1 = z12;
        if (this.f58592d8 != -1) {
            z13 = true;
        }
        this.f58488B7 = z13;
        this.f58602n8 = mo61163l4();
        this.f58611w8.setImageInfo(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: E2 */
    public C28227x3 mo60959E2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int m116580c;
        AbstractC19074t.m100208f(c28227x3, "result");
        super.mo60959E2(i11, i12, i13, c28227x3);
        if (mo61163l4()) {
            m116580c = AbstractC22543l.m116580c(c28227x3.f131648a, getTextWidth() + getBubblePaddingLeft() + getBubblePaddingRight());
            c28227x3.f131648a = m116580c;
            c28227x3.f131649b += getTextHeight() + ChatRow.f57201L5;
        }
        if (this.f58602n8) {
            c28227x3.f131649b += (int) (ChatRow.f57255z5.getStrokeWidth() + f58576I8);
        }
        return c28227x3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        int m116580c;
        int m116584g;
        C13704p1 c13704p1;
        float f11;
        StaticLayout m119626m;
        float f12;
        int i13;
        float m116583f;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        int i14 = this.f58592d8;
        if (i14 != -1 && i14 != 0) {
            if (i14 == 1) {
                int i15 = this.f58593e8;
                if (i15 > 0 && (i13 = this.f58594f8) > 0) {
                    m116583f = AbstractC22543l.m116583f(i13 / i15, 1.5f);
                    f12 = AbstractC22543l.m116579b(i11 * m116583f, f58570C8);
                } else {
                    f12 = i11 * 0.5625f;
                }
                int i16 = (int) f12;
                this.f58595g8 = i16;
                int i17 = f58571D8;
                this.f58489C7.m76463K(5, (i11 - 2) - (i17 * 2), (i16 - 1) - i17);
                this.f58489C7.m76457E(false);
                this.f58489C7.m76461I(f58573F8);
                this.f58602n8 = mo61163l4();
            }
        } else {
            int i18 = f58568A8;
            this.f58596h8 = i18;
            int i19 = this.f58593e8;
            if (i19 > 0 && (i12 = this.f58594f8) > 0) {
                int i21 = (f58589z8 * i19) / i12;
                this.f58596h8 = i21;
                m116580c = AbstractC22543l.m116580c(i21, i18);
                this.f58596h8 = m116580c;
                m116584g = AbstractC22543l.m116584g(m116580c, f58569B8);
                this.f58596h8 = m116584g;
            }
            this.f58600l8 = this.f58596h8 + f58588y8;
            this.f58607s8 = 2;
            this.f58489C7.m76461I(f58575H8);
            this.f58489C7.m76463K(5, this.f58596h8, f58589z8);
            this.f58489C7.m76457E(true);
        }
        int i22 = i11 - (ChatRow.f57203M5 * 2);
        if (!TextUtils.isEmpty(this.f58606r8)) {
            int i23 = i22 - this.f58600l8;
            int i24 = this.f58607s8;
            if (i24 <= 0) {
                m119626m = AbstractC23214t.m119628o(this.f58606r8, f58581N8, i23, Layout.Alignment.ALIGN_NORMAL, f58584Q8, 1.0f, false);
            } else {
                m119626m = AbstractC23214t.m119626m(this.f58606r8, f58581N8, i23, i24, 1.0f, f58584Q8);
            }
            this.f58490D7 = m119626m;
        }
        if (!TextUtils.isEmpty(this.f58608t8)) {
            int i25 = i22 - this.f58600l8;
            if (this.f58499M7 == 7) {
                c13704p1 = f58582O8;
                f11 = f58585R8;
            } else {
                c13704p1 = f58583P8;
                f11 = f58586S8;
            }
            this.f58493G7 = AbstractC23214t.m119628o(this.f58608t8, c13704p1, i25, Layout.Alignment.ALIGN_NORMAL, f11, 1.0f, false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q2 */
    public void mo61009Q2() {
        super.mo61009Q2();
        if (m61635L4()) {
            this.f58489C7.m76461I(f58573F8);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58591c8) {
            m61636M4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        int i17;
        int i18 = ChatRow.f57203M5 + i11;
        int i19 = this.f58592d8;
        if (i19 != -1 && i19 != 0) {
            if (i19 == 1) {
                int i21 = f58571D8;
                int i22 = i11 + 1 + i21;
                this.f58609u8 = i22;
                int i23 = i12 + 1 + i21;
                this.f58610v8 = i23;
                this.f58489C7.m76460H(i22, i23);
                int i24 = i12 + this.f58595g8 + f58579L8;
                StaticLayout staticLayout = this.f58490D7;
                if (staticLayout != null) {
                    this.f58491E7 = i18;
                    int i25 = this.f58599k8;
                    this.f58492F7 = i24 + i25;
                    i24 += i25 + staticLayout.getHeight();
                }
                if (this.f58493G7 != null) {
                    this.f58494H7 = i18;
                    this.f58495I7 = i24 + this.f58601m8;
                    return;
                }
                return;
            }
            return;
        }
        this.f58609u8 = i18;
        if (this.f58602n8) {
            i12 += this.f58599k8;
        }
        this.f58610v8 = i12;
        this.f58489C7.m76460H(i18, i12);
        StaticLayout staticLayout2 = this.f58490D7;
        int i26 = 0;
        if (staticLayout2 != null) {
            i15 = staticLayout2.getHeight();
        } else {
            i15 = 0;
        }
        StaticLayout staticLayout3 = this.f58493G7;
        if (staticLayout3 != null) {
            i26 = staticLayout3.getHeight();
        }
        if (i26 > 0) {
            i16 = i26 + this.f58601m8 + i15;
        } else {
            i16 = i15;
        }
        int i27 = this.f58609u8 + this.f58596h8 + f58588y8;
        this.f58491E7 = i27;
        int i28 = f58589z8;
        if (i16 < i28) {
            i17 = this.f58610v8 + ((i28 - i16) / 2);
        } else {
            i17 = this.f58610v8;
        }
        this.f58492F7 = i17;
        this.f58494H7 = i27;
        this.f58495I7 = i17 + i15 + this.f58601m8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        if (m61635L4() && !mo61163l4()) {
            return 0;
        }
        return super.getDefaultBubblePaddingTop();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58597i8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58598j8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: i2 */
    public int mo61071i2(int i11, int i12, int i13, int i14, boolean z11) {
        int mo61071i2 = super.mo61071i2(i11, i12, i13, i14, z11);
        if (mo61163l4()) {
            this.f58597i8 = getBubblePaddingLeft() + i11;
            this.f58598j8 = mo61071i2;
            mo61071i2 += getTextHeight();
        }
        if (this.f58602n8) {
            this.f58603o8 = i11 + getBubblePaddingLeft();
            this.f58604p8 = i13 - getBubblePaddingRight();
            this.f58605q8 = ChatRow.f57201L5 + mo61071i2;
            return mo61071i2 + ((int) (ChatRow.f57255z5.getStrokeWidth() + f58576I8));
        }
        return mo61071i2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f58488B7) {
            this.f58489C7.m76467d(canvas);
        } else {
            Drawable m62608r1 = AbstractC11531v0.Companion.m62608r1();
            if (m62608r1 != null) {
                canvas.save();
                canvas.translate(this.f58609u8, this.f58610v8);
                m62608r1.setBounds(0, 0, this.f58489C7.m76473l(), this.f58489C7.m76472k());
                m62608r1.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f58490D7 != null) {
            canvas.save();
            canvas.translate(this.f58491E7, this.f58492F7);
            this.f58490D7.draw(canvas);
            canvas.restore();
        }
        if (this.f58493G7 != null) {
            canvas.save();
            canvas.translate(this.f58494H7, this.f58495I7);
            this.f58493G7.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: v0 */
    public void mo61117v0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61117v0(canvas);
        if (this.f58602n8) {
            float f11 = this.f58603o8;
            int i11 = this.f58605q8;
            canvas.drawLine(f11, i11, this.f58604p8, i11, ChatRow.f57255z5);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58600l8 = 0;
        this.f58499M7 = 0;
        this.f58606r8 = "";
        this.f58607s8 = 0;
        this.f58608t8 = "";
        this.f58590b8 = "";
        this.f58490D7 = null;
        this.f58493G7 = null;
        this.f58609u8 = 0;
        this.f58610v8 = 0;
        this.f58488B7 = true;
        this.f58592d8 = 0;
        this.f58593e8 = 0;
        this.f58594f8 = 0;
        this.f58591c8 = false;
        this.f58602n8 = false;
        this.f58605q8 = 0;
        this.f58603o8 = 0;
        this.f58604p8 = 0;
    }
}
