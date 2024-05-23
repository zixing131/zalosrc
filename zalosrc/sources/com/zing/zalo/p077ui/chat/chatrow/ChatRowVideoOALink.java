package com.zing.zalo.p077ui.chat.chatrow;

import ag0.AbstractC0837p0;
import ag0.C0807c;
import am.AbstractC0939u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoOALink;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.uicontrol.C16660t2;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o;
import com.zing.zalo.zmedia.view.ZVideoView;
import dj.C17945a0;
import dj.C18013y0;
import gg0.AbstractC19444a;
import hf0.AbstractC20049k;
import hf0.C20040b;
import java.util.Objects;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import p105dn.EnumC18030a;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p394oj.C24278d;
import p716zh.C31840a7;
import p716zh.C32098s;
import p716zh.C32106s7;
import vg.C28075g8;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowVideoOALink extends ChatRowHasCaption implements C20040b.c {

    /* renamed from: j8 */
    public static boolean f58931j8 = false;

    /* renamed from: k8 */
    static final int f58932k8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: l8 */
    public static final int f58933l8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: m8 */
    static C13704p1 f58934m8;

    /* renamed from: n8 */
    static C13704p1 f58935n8;

    /* renamed from: o8 */
    static C13704p1 f58936o8;

    /* renamed from: B7 */
    C32098s f58937B7;

    /* renamed from: C7 */
    protected ZVideoView f58938C7;

    /* renamed from: D7 */
    VideoController f58939D7;

    /* renamed from: E7 */
    C16660t2 f58940E7;

    /* renamed from: F7 */
    C13697o f58941F7;

    /* renamed from: G7 */
    float f58942G7;

    /* renamed from: H7 */
    int f58943H7;

    /* renamed from: I7 */
    int f58944I7;

    /* renamed from: J7 */
    String f58945J7;

    /* renamed from: K7 */
    boolean f58946K7;

    /* renamed from: L7 */
    C3977j f58947L7;

    /* renamed from: M7 */
    int f58948M7;

    /* renamed from: N7 */
    int f58949N7;

    /* renamed from: O7 */
    int f58950O7;

    /* renamed from: P7 */
    int f58951P7;

    /* renamed from: Q7 */
    int f58952Q7;

    /* renamed from: R7 */
    int f58953R7;

    /* renamed from: S7 */
    int f58954S7;

    /* renamed from: T7 */
    int f58955T7;

    /* renamed from: U7 */
    C32106s7 f58956U7;

    /* renamed from: V7 */
    String f58957V7;

    /* renamed from: W7 */
    String f58958W7;

    /* renamed from: X7 */
    String f58959X7;

    /* renamed from: Y7 */
    String f58960Y7;

    /* renamed from: Z7 */
    StaticLayout f58961Z7;

    /* renamed from: a8 */
    StaticLayout f58962a8;

    /* renamed from: b8 */
    int f58963b8;

    /* renamed from: c8 */
    int f58964c8;

    /* renamed from: d8 */
    C17391z f58965d8;

    /* renamed from: e8 */
    boolean f58966e8;

    /* renamed from: f8 */
    boolean f58967f8;

    /* renamed from: g8 */
    MessageId f58968g8;

    /* renamed from: h8 */
    boolean f58969h8;

    /* renamed from: i8 */
    boolean f58970i8;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoOALink$a */
    /* loaded from: classes5.dex */
    class C11431a implements C16660t2.b {
        C11431a() {
        }

        @Override // com.zing.zalo.uicontrol.C16660t2.b
        /* renamed from: a */
        public void mo61771a() {
            if (AbstractC19444a.m101693a()) {
                ChatRowVideoOALink.this.invalidate();
            } else {
                ChatRowVideoOALink.this.postInvalidate();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoOALink$b */
    /* loaded from: classes5.dex */
    public class C11432b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f58972a;

        C11432b(C17945a0 c17945a0) {
            this.f58972a = c17945a0;
        }

        /* renamed from: d */
        public /* synthetic */ void m61773d(C17945a0 c17945a0) {
            try {
                ChatRowVideoOALink chatRowVideoOALink = ChatRowVideoOALink.this;
                if (c17945a0 == chatRowVideoOALink.f57263B) {
                    chatRowVideoOALink.f58938C7.setZVideo(chatRowVideoOALink.f58965d8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String str;
            String str2;
            C17945a0 c17945a0;
            try {
                C31840a7 m152973c = C31840a7.m152973c();
                ChatRowVideoOALink chatRowVideoOALink = ChatRowVideoOALink.this;
                C24278d m152979g = m152973c.m152979g(chatRowVideoOALink.f58957V7, chatRowVideoOALink.f58958W7);
                if (m152979g != null && !m152979g.m126783a()) {
                    String str3 = m152979g.f117250c;
                    str2 = m152979g.f117251d;
                    str = str3;
                    c17945a0 = this.f58972a;
                    if (c17945a0 == null && c17945a0.m94929K2() != null) {
                        ChatRowVideoOALink.this.f58965d8 = new C17391z(this.f58972a.m95029V3().m41044h(), "", str, str2, ChatRowVideoOALink.this.f58945J7, AbstractC23006a0.m117875E(), false, 9, ChatRowVideoOALink.this.f58942G7, 3, null, this.f58972a.mo95039W2(), ChatRowVideoOALink.this.getPosition());
                        if (ChatRowVideoOALink.this.f58938C7.getVideo() != null && ChatRowVideoOALink.this.f58938C7.getVideo().m92539d(ZMediaPlayerSettings.getVideoConfig(3))) {
                            C23744a.m124114c().m124116d(54, this.f58972a.mo95039W2());
                        }
                        ChatRowVideoOALink.this.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.i1

                            /* renamed from: q */
                            public final /* synthetic */ C17945a0 f59170q;

                            public /* synthetic */ RunnableC11484i1(C17945a0 c17945a02) {
                                r2 = c17945a02;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ChatRowVideoOALink.C11432b.this.m61773d(r2);
                            }
                        });
                        return;
                    }
                }
                ChatRowVideoOALink chatRowVideoOALink2 = ChatRowVideoOALink.this;
                chatRowVideoOALink2.m61762D4(chatRowVideoOALink2.f58957V7, chatRowVideoOALink2.f58958W7);
                str = "";
                str2 = str;
                c17945a0 = this.f58972a;
                if (c17945a0 == null) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoOALink$c */
    /* loaded from: classes5.dex */
    public class C11433c extends C23999j {
        C11433c() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (ChatRowVideoOALink.this.f58945J7.equals(str) && c3979l != null) {
                    ChatRowVideoOALink chatRowVideoOALink = ChatRowVideoOALink.this;
                    chatRowVideoOALink.f58946K7 = true;
                    C3977j c3977j = chatRowVideoOALink.f58947L7;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l);
                    }
                    ChatRowVideoOALink.this.f58938C7.setLoadingViewImageInfo(c3979l);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowVideoOALink(Context context, AttributeSet attributeSet) {
        super(context);
        this.f58957V7 = "";
        this.f58958W7 = "";
        this.f58963b8 = 0;
        this.f58964c8 = 0;
        this.f58947L7 = new C3977j(context);
        if (f58934m8 == null || f58931j8) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58934m8 = c13704p1;
            c13704p1.m76613c();
            f58934m8.setColor(AbstractC11531v0.m62226Z2());
            f58934m8.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p12 = new C13704p1(1);
            f58935n8 = c13704p12;
            Typeface typeface = Typeface.DEFAULT;
            c13704p12.setTypeface(typeface);
            f58935n8.setColor(AbstractC11531v0.m62226Z2());
            f58935n8.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p13 = new C13704p1(1);
            f58936o8 = c13704p13;
            c13704p13.setTypeface(typeface);
            f58936o8.setColor(AbstractC11531v0.m62143G3());
            f58936o8.setTextSize(AbstractC23136l9.m118759w1(11));
            f58931j8 = false;
        }
        this.f58941F7 = new C13697o(this);
        C16660t2 c16660t2 = new C16660t2(context, new C11431a());
        this.f58940E7 = c16660t2;
        c16660t2.m88793f(new C16660t2.a() { // from class: com.zing.zalo.ui.chat.chatrow.e1
            public /* synthetic */ C11468e1() {
            }

            @Override // com.zing.zalo.uicontrol.C16660t2.a
            /* renamed from: a */
            public final void mo61907a() {
                ChatRowVideoOALink.this.m61765G4();
            }
        });
    }

    /* renamed from: D4 */
    public void m61762D4(String str, String str2) {
        if (this.f58967f8) {
            return;
        }
        this.f58967f8 = true;
        this.f58968g8 = this.f57263B.m95029V3();
        C31840a7.m152973c().m152976d(str, new String[]{str2}, new C31840a7.g() { // from class: com.zing.zalo.ui.chat.chatrow.g1

            /* renamed from: q */
            public final /* synthetic */ String f59134q;

            public /* synthetic */ C11476g1(String str22) {
                r2 = str22;
            }

            @Override // p716zh.C31840a7.g
            /* renamed from: ds */
            public final void mo43895ds(String str3, String[] strArr, boolean z11) {
                ChatRowVideoOALink.this.m61764F4(r2, str3, strArr, z11);
            }
        });
    }

    /* renamed from: E4 */
    public /* synthetic */ void m61763E4(String str, String str2) {
        C24278d m152979g;
        try {
            this.f58967f8 = false;
            if (!this.f58969h8 && this.f57263B.m95135f9(this.f58968g8) && (m152979g = C31840a7.m152973c().m152979g(str, str2)) != null && !m152979g.m126783a()) {
                m61770J4();
                if (this.f57263B != null) {
                    C23744a.m124114c().m124116d(54, this.f57263B.mo95039W2());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F4 */
    public /* synthetic */ void m61764F4(String str, String str2, String[] strArr, boolean z11) {
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.h1

            /* renamed from: q */
            public final /* synthetic */ String f59162q;

            /* renamed from: r */
            public final /* synthetic */ String f59163r;

            public /* synthetic */ RunnableC11480h1(String str22, String str3) {
                r2 = str22;
                r3 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRowVideoOALink.this.m61763E4(r2, r3);
            }
        });
    }

    /* renamed from: G4 */
    public /* synthetic */ void m61765G4() {
        if (this.f58956U7 != null) {
            AbstractC20049k.m104108a(this.f58938C7, 0);
            getDelegate().mo62044I4(this, this.f58956U7, this.f58965d8);
        } else if (!TextUtils.isEmpty(this.f57263B.m94929K2().f91014s)) {
            getDelegate().mo62051K4(this, this.f57263B.m94929K2().f91014s);
        }
    }

    /* renamed from: H4 */
    public /* synthetic */ void m61766H4(float f11) {
        C28769a c28769a = this.f57269C;
        if (c28769a != null && f11 == 0.0f) {
            c28769a.f133324t = 0;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58970i8 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        this.f58943H7 = this.f58941F7.m76473l();
        int m76472k = this.f58941F7.m76472k();
        this.f58944I7 = m76472k;
        this.f58940E7.m88800n(this.f58943H7, m76472k, this.f58941F7.m76470i());
        int i13 = this.f58944I7;
        int i14 = this.f58963b8;
        if (i14 > 0) {
            i13 += i14 + f58932k8;
        }
        if (mo61163l4()) {
            i13 += f58932k8 + getTextHeight();
        }
        int i15 = this.f58964c8;
        if (i15 > 0) {
            i13 += f58932k8 + i15;
        }
        c28227x3.f131648a = this.f58943H7 + (f58933l8 * 2);
        c28227x3.f131649b = i13;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        if (!Objects.equals(this.f57263B, c17945a0)) {
            this.f58967f8 = false;
        }
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94987Q7() && getDelegate().mo62102t4() == EnumC18030a.SINGLE_PAGE) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f58966e8 = z12;
        this.f57271C1 = c17945a0.m94954N0();
        if (c17945a0.m94929K2() instanceof C18013y0) {
            C18013y0 c18013y0 = (C18013y0) c17945a0.m94929K2();
            this.f58956U7 = C32106s7.m154972a(c18013y0);
            C32098s c32098s = c18013y0.f91251B;
            this.f58937B7 = c32098s;
            if (c32098s != null) {
                this.f58959X7 = c32098s.f147953c;
                this.f58960Y7 = c32098s.f147952b;
                this.f58957V7 = c32098s.f147951a;
                this.f58958W7 = c32098s.f147963m;
            }
            this.f58945J7 = c18013y0.f91013r;
        }
        this.f58940E7.m88798k(true, false);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f58941F7.m76462J(2, i11 - (f58933l8 * 2));
        int mo61198j4 = mo61198j4(i11);
        StaticLayout m119625l = AbstractC23214t.m119625l(this.f58959X7, f58934m8, mo61198j4, 3);
        this.f58961Z7 = m119625l;
        if (m119625l != null) {
            this.f58963b8 = m119625l.getHeight();
        }
        if (!TextUtils.isEmpty(this.f58960Y7)) {
            StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f58960Y7, f58936o8, mo61198j4, 1);
            this.f58962a8 = m119625l2;
            if (m119625l2 != null) {
                this.f58964c8 = m119625l2.getHeight();
            }
        }
        this.f58943H7 = this.f58941F7.m76473l();
        this.f58944I7 = this.f58941F7.m76472k();
        float m118742r = AbstractC23136l9.m118742r(10.0f);
        this.f58941F7.m76461I(new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r});
        this.f58940E7.m88800n(this.f58943H7, this.f58944I7, this.f58941F7.m76470i());
    }

    /* renamed from: I4 */
    void m61769I4() {
        if (this.f58938C7.getLoadingView() != null) {
            this.f58938C7.getLoadingView().setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f58938C7.getLoadingView().setImageResource(AbstractC16803z.bg_item_chat_o);
        }
        if (m60988L3() || C23999j.m125696L2(this.f58945J7, C23278z2.m120068F())) {
            ((C23528a) this.f57275D.m123612r(this.f58947L7)).m123579C(this.f58945J7, C23278z2.m120068F(), new C11433c());
        }
    }

    /* renamed from: J4 */
    void m61770J4() {
        C0807c.m2042b(new C11432b(this.f57263B));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: K3 */
    public boolean mo60983K3() {
        if (!super.mo60983K3() && !this.f58970i8) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        if (this.f58956U7 != null) {
            AbstractC20049k.m104108a(this.f58938C7, 0);
            getDelegate().mo62044I4(this, this.f58956U7, this.f58965d8);
        } else if (!TextUtils.isEmpty(this.f57263B.m94929K2().f91014s)) {
            getDelegate().mo62051K4(this, this.f57263B.m94929K2().f91014s);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        try {
            m61770J4();
            if (!this.f58946K7) {
                m61769I4();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        return super.mo61046c0(c17945a0, c28769a);
    }

    @Override // hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        return getDelegate().mo62077c();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f58948M7 = f58933l8 + i11;
        this.f58949N7 = i12;
        int i15 = i12 + this.f58944I7;
        int i16 = this.f58963b8;
        if (i16 > 0) {
            this.f58952Q7 = ChatRow.f57203M5 + i11;
            int i17 = f58932k8;
            this.f58953R7 = i15 + i17;
            i15 += i17 + i16;
        }
        if (mo61163l4()) {
            this.f58950O7 = ChatRow.f57203M5 + i11;
            int i18 = f58932k8;
            this.f58951P7 = i15 + i18;
            i15 += i18 + getTextHeight();
        }
        if (this.f58964c8 > 0) {
            this.f58954S7 = i11 + ChatRow.f57203M5;
            this.f58955T7 = i15 + f58932k8;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBubbleStyle() {
        return this.f58966e8 ? 1 : 0;
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        return getPosition();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f58933l8;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        return this.f58938C7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58950O7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58951P7;
    }

    public C17391z getVideo() {
        return this.f58965d8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (this.f58966e8) {
            if (c17945a0.m94929K2() != null) {
                return c17945a0.m94929K2().f91011p;
            }
            return "";
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            this.f58969h8 = true;
            super.onDetachedFromWindow();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        ViewOnClickListenerC17374o viewOnClickListenerC17374o;
        RecyclingImageView recyclingImageView;
        super.onFinishInflate();
        ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.video_view);
        this.f58938C7 = zVideoView;
        zVideoView.setClickable(false);
        this.f58938C7.setForceHideController(false);
        this.f58938C7.setRoundCorner(AbstractC23136l9.m118742r(10.0f));
        this.f58938C7.setUseVideoRatio(false);
        this.f58938C7.setVideoPlayerMode(1);
        this.f58938C7.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(1));
        this.f58938C7.setAudioFocusControl(C28075g8.m141538e());
        this.f58938C7.setOnDimAlphaChangedListener(new ZVideoView.InterfaceC17343o() { // from class: com.zing.zalo.ui.chat.chatrow.f1
            public /* synthetic */ C11472f1() {
            }

            @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17343o
            /* renamed from: a */
            public final void mo61908a(float f11) {
                ChatRowVideoOALink.this.m61766H4(f11);
            }
        });
        VideoController videoController = this.f58938C7.getVideoController();
        this.f58939D7 = videoController;
        if (videoController != null && (viewOnClickListenerC17374o = videoController.f88210s) != null && (recyclingImageView = viewOnClickListenerC17374o.f88582v) != null && (recyclingImageView instanceof RoundedImageView)) {
            ((RoundedImageView) recyclingImageView).m76289j(10.0f, 10.0f, 0.0f, 0.0f);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.ChatRowBase, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        ZVideoView zVideoView = this.f58938C7;
        if (zVideoView != null) {
            int i15 = this.f58948M7;
            zVideoView.layout(i15, this.f58949N7, zVideoView.getMeasuredWidth() + i15, this.f58949N7 + this.f58938C7.getMeasuredHeight());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f58938C7.measure(View.MeasureSpec.makeMeasureSpec(this.f58943H7, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f58944I7, 1073741824));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: p3 */
    public boolean mo61101p3(MotionEvent motionEvent, float f11, float f12, int i11) {
        if (!super.mo61101p3(motionEvent, f11, f12, i11)) {
            boolean m88791d = this.f58940E7.m88791d(motionEvent, i11, f11 - this.f58948M7, f12 - this.f58949N7);
            this.f58970i8 = m88791d;
            if (!m88791d) {
                return false;
            }
        }
        return true;
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        if (this.f58961Z7 != null) {
            canvas.save();
            canvas.translate(this.f58952Q7, this.f58953R7);
            this.f58961Z7.draw(canvas);
            canvas.restore();
        }
        if (this.f58962a8 != null) {
            canvas.save();
            canvas.translate(this.f58954S7, this.f58955T7);
            this.f58962a8.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(this.f58948M7, this.f58949N7);
        this.f58940E7.m88789a(canvas);
        canvas.restore();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58945J7 = "";
        this.f58942G7 = 2.0f;
        this.f58943H7 = 0;
        this.f58944I7 = 0;
        this.f58969h8 = false;
        this.f58946K7 = false;
        this.f58937B7 = null;
        this.f58956U7 = null;
        this.f58938C7.m92416j0();
        this.f58970i8 = false;
    }
}
