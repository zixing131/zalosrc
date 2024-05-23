package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p716zh.C32098s;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowShortVideo extends ChatRowRecommendLinkBase {
    public static final C11409b Companion = new C11409b(null);

    /* renamed from: o8 */
    private static final int f58660o8 = AbstractC23136l9.m118742r(153.0f);

    /* renamed from: p8 */
    private static final int f58661p8 = AbstractC23136l9.m118742r(272.0f);

    /* renamed from: q8 */
    private static final int f58662q8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: r8 */
    private static final int f58663r8 = AbstractC23136l9.m118742r(28.0f);

    /* renamed from: s8 */
    private static final int f58664s8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: t8 */
    private static final int f58665t8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: u8 */
    private static final int f58666u8 = AbstractC23136l9.m118742r(18.0f);

    /* renamed from: v8 */
    private static final int f58667v8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: w8 */
    private static final int f58668w8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: x8 */
    private static final C29234i f58669x8;

    /* renamed from: y8 */
    private static final InterfaceC29232g f58670y8;

    /* renamed from: z8 */
    private static final Paint f58671z8;

    /* renamed from: b8 */
    private String f58672b8;

    /* renamed from: c8 */
    private boolean f58673c8;

    /* renamed from: d8 */
    private final C3977j f58674d8;

    /* renamed from: e8 */
    private int f58675e8;

    /* renamed from: f8 */
    private int f58676f8;

    /* renamed from: g8 */
    private int f58677g8;

    /* renamed from: h8 */
    private int f58678h8;

    /* renamed from: i8 */
    private int f58679i8;

    /* renamed from: j8 */
    private int f58680j8;

    /* renamed from: k8 */
    private StaticLayout f58681k8;

    /* renamed from: l8 */
    private int f58682l8;

    /* renamed from: m8 */
    private int f58683m8;

    /* renamed from: n8 */
    private int f58684n8;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideo$a */
    /* loaded from: classes5.dex */
    static final class C11408a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11408a f58685q = new C11408a();

        C11408a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setTextSize(AbstractC23136l9.m118759w1(11));
            c13704p1.setColor(AbstractC11531v0.Companion.m62514L1());
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideo$b */
    /* loaded from: classes5.dex */
    public static final class C11409b {
        private C11409b() {
        }

        public /* synthetic */ C11409b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C13704p1 m61659b() {
            return (C13704p1) ChatRowShortVideo.f58670y8.getValue();
        }

        /* renamed from: c */
        public final void m61660c() {
            ChatRowShortVideo.f58669x8.m145993b();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideo$c */
    /* loaded from: classes5.dex */
    public static final class C11410c extends C23999j {
        C11410c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                ChatRowShortVideo chatRowShortVideo = ChatRowShortVideo.this;
                if (chatRowShortVideo.f57263B != null && AbstractC19074t.m100204b(str, chatRowShortVideo.f58672b8) && c3979l != null && c3979l.m18839c() != null) {
                    boolean z11 = true;
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowShortVideo.this.f58673c8 = true;
                    ChatRowShortVideo.this.f58674d8.setImageInfo(c3979l, false);
                    C13697o c13697o = ChatRowShortVideo.this.f58489C7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() == 4) {
                        z11 = false;
                    }
                    c13697o.m76480u(m18839c, z11);
                    ChatRowShortVideo.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f58669x8 = m145994a;
        f58670y8 = AbstractC29233h.m145991b(m145994a, C11408a.f58685q);
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(153, 0, 0, 0));
        paint.setStyle(Paint.Style.FILL);
        f58671z8 = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowShortVideo(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f58672b8 = "";
        this.f58674d8 = new C3977j(context);
        this.f58489C7.m76463K(5, f58660o8, f58661p8);
        this.f58489C7.m76461I(ChatRow.f57185D5);
    }

    /* renamed from: L4 */
    private final void m61656L4() {
        try {
            if (this.f58672b8.length() == 0) {
                this.f58489C7.m76477r();
                invalidate();
                this.f58673c8 = true;
            } else {
                C24003n m120136k0 = C23278z2.m120136k0();
                this.f58489C7.m76477r();
                if (m60988L3() || C23999j.m125696L2(this.f58672b8, m120136k0)) {
                    ((C23528a) this.f57275D.m123612r(this.f58674d8)).m123579C(this.f58672b8, m120136k0, new C11410c());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRowShortVideo", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        int i13 = f58660o8;
        int i14 = f58662q8;
        c28227x3.f131648a = i13 + (i14 * 2);
        c28227x3.f131649b = f58661p8 + f58663r8 + (i14 * 2);
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        C18013y0 c18013y0;
        C32098s c32098s;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        if (mo60993N() && c17945a0.m94954N0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57271C1 = z12;
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null) {
            AbstractC19074t.m100205c(c32098s);
            this.f58499M7 = c32098s.f147956f;
            String m154936f = c32098s.m154936f();
            AbstractC19074t.m100207e(m154936f, "getShortVideoThumb(...)");
            this.f58672b8 = m154936f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        C18013y0 c18013y0;
        String str;
        C32098s c32098s;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        int i12 = ((i11 - f58667v8) - (f58664s8 * 2)) - f58665t8;
        C17969i0 m94929K2 = c17945a0.m94929K2();
        StaticLayout staticLayout = null;
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null) {
            str = c32098s.m154933c();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = getContext().getString(AbstractC8020f0.zalo_video);
            AbstractC19074t.m100207e(str, "getString(...)");
        }
        StaticLayout m119625l = AbstractC23214t.m119625l(str, Companion.m61659b(), i12, 1);
        if (m119625l != null) {
            this.f58684n8 = m119625l.getHeight();
            staticLayout = m119625l;
        }
        this.f58681k8 = staticLayout;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L0 */
    protected boolean mo60985L0() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58673c8) {
            m61656L4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = f58662q8;
        int i16 = i11 + i15;
        int i17 = i12 + i15;
        this.f58489C7.m76460H(i16, i17);
        this.f58675e8 = i16 + (f58660o8 / 2);
        int i18 = f58661p8;
        this.f58676f8 = i17 + (i18 / 2);
        Drawable m62581i1 = AbstractC11531v0.Companion.m62581i1();
        if (m62581i1 != null) {
            this.f58677g8 = this.f58675e8 - (m62581i1.getIntrinsicWidth() / 2);
            this.f58678h8 = this.f58676f8 - (m62581i1.getIntrinsicHeight() / 2);
        }
        int i19 = i12 + i15 + i18 + (f58663r8 / 2);
        int i21 = i11 + f58664s8;
        this.f58679i8 = i21;
        this.f58680j8 = i19 - (f58668w8 / 2);
        this.f58682l8 = i21 + f58667v8 + f58665t8;
        this.f58683m8 = i19 - (this.f58684n8 / 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return f58660o8 + (f58662q8 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: l4 */
    public boolean mo61163l4() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        this.f58489C7.m76467d(canvas);
        canvas.drawCircle(this.f58675e8, this.f58676f8, f58666u8, f58671z8);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        Drawable m62581i1 = x3Var.m62581i1();
        if (m62581i1 != null) {
            int i11 = this.f58677g8;
            m62581i1.setBounds(i11, this.f58678h8, m62581i1.getIntrinsicWidth() + i11, this.f58678h8 + m62581i1.getIntrinsicHeight());
            m62581i1.draw(canvas);
        }
        Drawable m62517M1 = x3Var.m62517M1();
        if (m62517M1 != null) {
            int i12 = this.f58679i8;
            int i13 = this.f58680j8;
            m62517M1.setBounds(i12, i13, f58667v8 + i12, f58668w8 + i13);
            m62517M1.draw(canvas);
        }
        StaticLayout staticLayout = this.f58681k8;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(this.f58682l8, this.f58683m8);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58672b8 = "";
        this.f58673c8 = false;
        this.f58675e8 = 0;
        this.f58676f8 = 0;
        this.f58677g8 = 0;
        this.f58678h8 = 0;
        this.f58679i8 = 0;
        this.f58680j8 = 0;
        this.f58681k8 = null;
        this.f58682l8 = 0;
        this.f58683m8 = 0;
        this.f58684n8 = 0;
    }
}
