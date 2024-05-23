package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.AbstractC1415b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p716zh.C32098s;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public final class ChatRowShortVideoProfile extends ChatRowRecommendLinkBase {

    /* renamed from: F8 */
    private static final C29234i f58692F8;

    /* renamed from: G8 */
    private static final InterfaceC29232g f58693G8;

    /* renamed from: H8 */
    private static final InterfaceC29232g f58694H8;

    /* renamed from: b8 */
    private final ModulesView f58702b8;

    /* renamed from: c8 */
    private String f58703c8;

    /* renamed from: d8 */
    private boolean f58704d8;

    /* renamed from: e8 */
    private String f58705e8;

    /* renamed from: f8 */
    private boolean f58706f8;

    /* renamed from: g8 */
    private String f58707g8;

    /* renamed from: h8 */
    private String f58708h8;

    /* renamed from: i8 */
    private int f58709i8;

    /* renamed from: j8 */
    private float f58710j8;

    /* renamed from: k8 */
    private final C22126c0 f58711k8;

    /* renamed from: l8 */
    private final C22126c0 f58712l8;

    /* renamed from: m8 */
    private final C21693c f58713m8;

    /* renamed from: n8 */
    private final C21693c f58714n8;

    /* renamed from: o8 */
    private final C16716d f58715o8;

    /* renamed from: p8 */
    private final InterfaceC24854k f58716p8;

    /* renamed from: q8 */
    private final InterfaceC24854k f58717q8;

    /* renamed from: r8 */
    private int f58718r8;

    /* renamed from: s8 */
    private int f58719s8;
    public static final C11413c Companion = new C11413c(null);

    /* renamed from: t8 */
    private static final int f58695t8 = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: u8 */
    private static final int f58696u8 = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: v8 */
    private static final int f58697v8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: w8 */
    private static final int f58698w8 = AbstractC23136l9.m118742r(240.0f);

    /* renamed from: x8 */
    private static final int f58699x8 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: y8 */
    private static final int f58700y8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: z8 */
    private static final float f58701z8 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: A8 */
    private static final float f58687A8 = AbstractC23136l9.m118742r(7.0f);

    /* renamed from: B8 */
    private static final float f58688B8 = AbstractC23136l9.m118742r(13.0f);

    /* renamed from: C8 */
    private static final float f58689C8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: D8 */
    private static final float f58690D8 = AbstractC23136l9.m118742r(9.5f);

    /* renamed from: E8 */
    private static final int f58691E8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$a */
    /* loaded from: classes5.dex */
    static final class C11411a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11411a f58720q = new C11411a();

        C11411a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AbstractC23136l9.m118742r(0.5f));
            paint.setColor(C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatBorderNormal));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$b */
    /* loaded from: classes5.dex */
    static final class C11412b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11412b f58721q = new C11412b();

        C11412b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatNormal));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$c */
    /* loaded from: classes5.dex */
    public static final class C11413c {
        private C11413c() {
        }

        public /* synthetic */ C11413c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final Paint m61673c() {
            return (Paint) ChatRowShortVideoProfile.f58694H8.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final Paint m61674d() {
            return (Paint) ChatRowShortVideoProfile.f58693G8.getValue();
        }

        /* renamed from: e */
        public final void m61675e() {
            ChatRowShortVideoProfile.f58692F8.m145993b();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$d */
    /* loaded from: classes5.dex */
    static final class C11414d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f58722q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11414d(Context context) {
            super(0);
            this.f58722q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3977j mo12V4() {
            return new C3977j(this.f58722q);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$e */
    /* loaded from: classes5.dex */
    static final class C11415e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f58723q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11415e(Context context) {
            super(0);
            this.f58723q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3977j mo12V4() {
            return new C3977j(this.f58723q);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$f */
    /* loaded from: classes5.dex */
    public static final class C11416f extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ String f58725m1;

        /* renamed from: n1 */
        final /* synthetic */ InterfaceC18505l f58726n1;

        /* renamed from: o1 */
        final /* synthetic */ InterfaceC18494a f58727o1;

        C11416f(String str, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
            this.f58725m1 = str;
            this.f58726n1 = interfaceC18505l;
            this.f58727o1 = interfaceC18494a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (ChatRowShortVideoProfile.this.f57263B != null && AbstractC19074t.m100204b(str, this.f58725m1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        this.f58727o1.mo12V4();
                        return;
                    }
                    this.f58726n1.mo205i9(c3979l);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$g */
    /* loaded from: classes5.dex */
    public static final class C11417g extends AbstractC19075u implements InterfaceC18505l {
        C11417g() {
            super(1);
        }

        /* renamed from: a */
        public final void m61678a(C3979l c3979l) {
            AbstractC19074t.m100208f(c3979l, "it");
            ChatRowShortVideoProfile.this.f58713m8.mo111924u1(c3979l.m18839c());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m61678a((C3979l) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$h */
    /* loaded from: classes5.dex */
    public static final class C11418h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11418h f58729q = new C11418h();

        C11418h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m61679a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m61679a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$i */
    /* loaded from: classes5.dex */
    public static final class C11419i extends AbstractC19075u implements InterfaceC18505l {
        C11419i() {
            super(1);
        }

        /* renamed from: a */
        public final void m61680a(C3979l c3979l) {
            AbstractC19074t.m100208f(c3979l, "it");
            ChatRowShortVideoProfile.this.f58714n8.mo111924u1(c3979l.m18839c());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m61680a((C3979l) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowShortVideoProfile$j */
    /* loaded from: classes5.dex */
    public static final class C11420j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11420j f58731q = new C11420j();

        C11420j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m61681a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m61681a() {
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f58692F8 = m145994a;
        f58693G8 = AbstractC29233h.m145991b(m145994a, C11412b.f58721q);
        f58694H8 = AbstractC29233h.m145991b(m145994a, C11411a.f58720q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowShortVideoProfile(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        Bitmap m7220d;
        Bitmap m7220d2;
        AbstractC19074t.m100208f(context, "context");
        ModulesView modulesView = new ModulesView(context);
        this.f58702b8 = modulesView;
        this.f58703c8 = "";
        this.f58705e8 = "";
        this.f58707g8 = "";
        this.f58708h8 = "";
        this.f58709i8 = f58700y8;
        this.f58710j8 = f58687A8;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m111968P1(true);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        c22126c0.mo111965M1(1);
        float f11 = f58688B8;
        c22126c0.mo111964L1(f11);
        this.f58711k8 = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89023G(c22126c0).m89028L(-2, -2);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.m111968P1(true);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c02.mo111964L1(f11);
        this.f58712l8 = c22126c02;
        C21693c c21693c = new C21693c(context);
        C16718f m89106L = c21693c.m89106L();
        Boolean bool = Boolean.TRUE;
        C16718f m89018B = m89106L.m89018B(bool);
        int i11 = f58695t8;
        C16718f m89073z = m89018B.m89028L(i11, i11).m89073z(bool);
        int i12 = f58697v8;
        m89073z.m89031O(i12);
        c21693c.mo111927x1(f58689C8);
        c21693c.m111929z1(5);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        Drawable m62511K1 = x3Var.m62511K1();
        if (m62511K1 != null && (m7220d2 = AbstractC1415b.m7220d(m62511K1, 0, 0, null, 7, null)) != null) {
            c21693c.mo111924u1(m7220d2);
        }
        this.f58713m8 = c21693c;
        C21693c c21693c2 = new C21693c(context);
        c21693c2.m89106L().m89018B(bool).m89028L(-1, -2).m89026J(true).m89023G(c21693c).m89041Y(f58691E8);
        c21693c2.m111929z1(5);
        float f12 = f58690D8;
        c21693c2.m111928y1(0.0f, 0.0f, f12, f12);
        Drawable m62520N1 = x3Var.m62520N1();
        if (m62520N1 != null && (m7220d = AbstractC1415b.m7220d(m62520N1, 0, 0, null, 7, null)) != null) {
            c21693c2.mo111924u1(m7220d);
        }
        this.f58714n8 = c21693c2;
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89054h0(c21693c).m89017A(bool).m89070w(c21693c).m89035S(i12).m89028L(-2, -2);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c22126c02);
        this.f58715o8 = c16716d;
        m129210a = AbstractC24856m.m129210a(new C11414d(context));
        this.f58716p8 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11415e(context));
        this.f58717q8 = m129210a2;
        modulesView.mo69681L(c21693c);
        modulesView.mo69681L(c16716d);
        modulesView.mo69681L(c21693c2);
    }

    /* renamed from: L4 */
    private final void m61666L4(String str, C3977j c3977j, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
        ((C23528a) this.f57275D.m123612r(c3977j)).m123579C(str, C23278z2.m120136k0(), new C11416f(str, interfaceC18505l, interfaceC18494a));
    }

    /* renamed from: M4 */
    private final void m61667M4() {
        try {
            if (this.f58703c8.length() > 0) {
                m61666L4(this.f58703c8, getDumpThumbView(), new C11417g(), C11418h.f58729q);
            }
            this.f58704d8 = true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRowShortVideoProfile", e11);
        }
    }

    /* renamed from: N4 */
    private final void m61668N4() {
        try {
            if (this.f58705e8.length() > 0) {
                m61666L4(this.f58705e8, getDumpProfileAvatarView(), new C11419i(), C11420j.f58731q);
            }
            this.f58706f8 = true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRowShortVideoProfile", e11);
        }
    }

    private final C3977j getDumpProfileAvatarView() {
        return (C3977j) this.f58716p8.getValue();
    }

    private final C3977j getDumpThumbView() {
        return (C3977j) this.f58717q8.getValue();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        this.f58702b8.measure(i12, 0);
        c28227x3.f131648a = i12;
        c28227x3.f131649b = this.f58702b8.getMeasuredHeight();
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
            String str = c32098s.f147957g;
            AbstractC19074t.m100207e(str, "mArtist");
            this.f58707g8 = str;
            String str2 = c32098s.f147958h;
            AbstractC19074t.m100207e(str2, "artistDescription");
            this.f58708h8 = str2;
            String m154932b = c32098s.m154932b();
            AbstractC19074t.m100207e(m154932b, "getAvatar(...)");
            this.f58703c8 = m154932b;
            String m154936f = c32098s.m154936f();
            AbstractC19074t.m100207e(m154936f, "getShortVideoThumb(...)");
            this.f58705e8 = m154936f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f58711k8.m111959G1(this.f58707g8);
        this.f58712l8.m111959G1(this.f58708h8);
        if (this.f58705e8.length() == 0) {
            this.f58709i8 = f58699x8;
            this.f58710j8 = f58701z8;
            C16718f m89106L = this.f58713m8.m89106L();
            int i12 = f58696u8;
            m89106L.m89028L(i12, i12);
            this.f58714n8.mo44614b1(8);
        } else {
            this.f58709i8 = f58700y8;
            this.f58710j8 = f58687A8;
            C16718f m89106L2 = this.f58713m8.m89106L();
            int i13 = f58695t8;
            m89106L2.m89028L(i13, i13);
            int bubbleMaxWidth = getBubbleMaxWidth();
            this.f58714n8.m89106L().m89028L(bubbleMaxWidth, bubbleMaxWidth / 2);
            this.f58714n8.mo44614b1(0);
        }
        if (!this.f58704d8) {
            m61667M4();
        }
        if (!this.f58706f8) {
            m61668N4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L0 */
    protected boolean mo60985L0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        return (super.mo60998O0(z11, z12, z13, z14) >> 1) << 1;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        ModulesView modulesView = this.f58702b8;
        modulesView.layout(i11, i12, i13, modulesView.getMeasuredHeight() + i12);
        if (this.f58705e8.length() == 0) {
            int i15 = f58697v8;
            int i16 = f58696u8;
            this.f58718r8 = ((i11 + i15) + i16) - AbstractC23136l9.m118742r(5.0f);
            this.f58719s8 = ((i12 + i15) + i16) - AbstractC23136l9.m118742r(5.0f);
            return;
        }
        int i17 = f58697v8;
        int i18 = f58695t8;
        this.f58718r8 = ((i11 + i17) + i18) - AbstractC23136l9.m118742r(3.0f);
        this.f58719s8 = ((i12 + i17) + i18) - AbstractC23136l9.m118742r(3.0f);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMinWidth() {
        return f58698w8;
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
        canvas.save();
        canvas.translate(this.f58702b8.getX(), this.f58702b8.getY());
        this.f58702b8.draw(canvas);
        canvas.restore();
        float f11 = this.f58718r8;
        float f12 = this.f58719s8;
        float f13 = this.f58710j8;
        C11413c c11413c = Companion;
        canvas.drawCircle(f11, f12, f13, c11413c.m61674d());
        canvas.drawCircle(this.f58718r8, this.f58719s8, this.f58710j8, c11413c.m61673c());
        Drawable m62517M1 = AbstractC11531v0.Companion.m62517M1();
        if (m62517M1 != null) {
            int i11 = this.f58718r8;
            int i12 = this.f58709i8;
            int i13 = this.f58719s8;
            m62517M1.setBounds(i11 - (i12 / 2), i13 - (i12 / 2), i11 + (i12 / 2), i13 + (i12 / 2));
            m62517M1.draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58703c8 = "";
        this.f58704d8 = false;
        this.f58705e8 = "";
        this.f58706f8 = false;
        this.f58707g8 = "";
        this.f58708h8 = "";
        this.f58718r8 = 0;
        this.f58719s8 = 0;
    }
}
