package com.zing.zalo.shortvideo.p072ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Arrays;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class ChannelInfoLayout extends FrameLayout {
    public static final C10632a Companion = new C10632a(null);

    /* renamed from: A */
    private final int f53912A;

    /* renamed from: B */
    private final int f53913B;

    /* renamed from: C */
    private final int f53914C;

    /* renamed from: D */
    private final int f53915D;

    /* renamed from: E */
    private final int f53916E;

    /* renamed from: F */
    private final InterfaceC24854k f53917F;

    /* renamed from: G */
    private final InterfaceC24854k f53918G;

    /* renamed from: H */
    private final InterfaceC24854k f53919H;

    /* renamed from: I */
    private final InterfaceC24854k f53920I;

    /* renamed from: J */
    private final InterfaceC24854k f53921J;

    /* renamed from: K */
    private final InterfaceC24854k f53922K;

    /* renamed from: L */
    private final InterfaceC24854k f53923L;

    /* renamed from: M */
    private final InterfaceC24854k f53924M;

    /* renamed from: N */
    private final InterfaceC24854k f53925N;

    /* renamed from: O */
    private final InterfaceC24854k f53926O;

    /* renamed from: P */
    private final InterfaceC24854k f53927P;

    /* renamed from: Q */
    private final InterfaceC24854k f53928Q;

    /* renamed from: R */
    private InterfaceC18505l f53929R;

    /* renamed from: S */
    private final InterfaceC24854k f53930S;

    /* renamed from: p */
    private final int f53931p;

    /* renamed from: q */
    private final int f53932q;

    /* renamed from: r */
    private final int f53933r;

    /* renamed from: s */
    private final int f53934s;

    /* renamed from: t */
    private final int f53935t;

    /* renamed from: u */
    private final int f53936u;

    /* renamed from: v */
    private final int f53937v;

    /* renamed from: w */
    private final int f53938w;

    /* renamed from: x */
    private final int f53939x;

    /* renamed from: y */
    private final int f53940y;

    /* renamed from: z */
    private final int f53941z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$a */
    /* loaded from: classes5.dex */
    public static final class C10632a {
        private C10632a() {
        }

        public /* synthetic */ C10632a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$b */
    /* loaded from: classes5.dex */
    static final class C10633b extends AbstractC19075u implements InterfaceC18494a {
        C10633b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.aivAvatar);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$c */
    /* loaded from: classes5.dex */
    static final class C10634c extends AbstractC19075u implements InterfaceC18494a {
        C10634c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.btnAction);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$d */
    /* loaded from: classes5.dex */
    static final class C10635d extends AbstractC19075u implements InterfaceC18494a {
        C10635d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView mo12V4() {
            return (ImageView) ChannelInfoLayout.this.findViewById(AbstractC27409d.btnExpand);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$e */
    /* loaded from: classes5.dex */
    static final class C10636e extends AbstractC19075u implements InterfaceC18494a {
        C10636e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.btnShare);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$f */
    /* loaded from: classes5.dex */
    public static final class C10637f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ float f53947r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10637f(float f11) {
            super(1);
            this.f53947r = f11;
        }

        /* renamed from: a */
        public final void m55632a(ViewGroup.LayoutParams layoutParams) {
            AbstractC19074t.m100208f(layoutParams, "lp");
            layoutParams.height = (int) (ChannelInfoLayout.this.f53915D * this.f53947r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55632a((ViewGroup.LayoutParams) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$g */
    /* loaded from: classes5.dex */
    public static final class C10638g implements Animator.AnimatorListener {

        /* renamed from: q */
        final /* synthetic */ boolean f53949q;

        public C10638g(boolean z11, ChannelInfoLayout channelInfoLayout) {
            this.f53949q = z11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            ChannelInfoLayout channelInfoLayout = ChannelInfoLayout.this;
            channelInfoLayout.m55625l(channelInfoLayout.getRvSimilarVideo());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            ChannelInfoLayout channelInfoLayout = ChannelInfoLayout.this;
            channelInfoLayout.m55625l(channelInfoLayout.getRvSimilarVideo());
            InterfaceC18505l interfaceC18505l = ChannelInfoLayout.this.f53929R;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Boolean.valueOf(this.f53949q));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$h */
    /* loaded from: classes5.dex */
    public static final class C10639h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10639h f53950q = new C10639h();

        C10639h() {
            super(1);
        }

        /* renamed from: a */
        public final void m55633a(ViewGroup.LayoutParams layoutParams) {
            AbstractC19074t.m100208f(layoutParams, "it");
            layoutParams.height = 0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55633a((ViewGroup.LayoutParams) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$i */
    /* loaded from: classes5.dex */
    static final class C10640i extends AbstractC19075u implements InterfaceC18494a {
        C10640i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo12V4() {
            return (FrameLayout) ChannelInfoLayout.this.findViewById(AbstractC27409d.flExpand);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$j */
    /* loaded from: classes5.dex */
    static final class C10641j extends AbstractC19075u implements InterfaceC18494a {
        C10641j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.lytLive);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$k */
    /* loaded from: classes5.dex */
    static final class C10642k extends AbstractC19075u implements InterfaceC18494a {
        C10642k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.lytStats);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$l */
    /* loaded from: classes5.dex */
    static final class C10643l extends AbstractC19075u implements InterfaceC18494a {
        C10643l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.rvChannelCta);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$m */
    /* loaded from: classes5.dex */
    static final class C10644m extends AbstractC19075u implements InterfaceC18494a {
        C10644m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView mo12V4() {
            return (RecyclerView) ChannelInfoLayout.this.findViewById(AbstractC27409d.rvSimilarVideo);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$n */
    /* loaded from: classes5.dex */
    static final class C10645n extends AbstractC19075u implements InterfaceC18494a {
        C10645n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) ChannelInfoLayout.this.findViewById(AbstractC27409d.tvSimilarVideo);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$o */
    /* loaded from: classes5.dex */
    static final class C10646o extends AbstractC19075u implements InterfaceC18494a {
        C10646o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.txtBio);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$p */
    /* loaded from: classes5.dex */
    static final class C10647p extends AbstractC19075u implements InterfaceC18494a {
        C10647p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.txtName);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelInfoLayout$q */
    /* loaded from: classes5.dex */
    static final class C10648q extends AbstractC19075u implements InterfaceC18494a {
        C10648q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelInfoLayout.this.findViewById(AbstractC27409d.txtVerify);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        InterfaceC24854k m129210a10;
        InterfaceC24854k m129210a11;
        InterfaceC24854k m129210a12;
        InterfaceC24854k m129210a13;
        AbstractC19074t.m100208f(context, "context");
        this.f53931p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_padding);
        this.f53932q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_padding_top);
        this.f53933r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_padding_bottom);
        this.f53934s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_avatar_size);
        this.f53935t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_avatar_to_stats);
        this.f53936u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_avatar_to_name);
        this.f53937v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_name_to_verify);
        this.f53938w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_verify_to_bio);
        this.f53939x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_bio_to_cta);
        this.f53940y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_bio_to_action);
        this.f53941z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_action_height);
        this.f53912A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_action_to_share);
        this.f53913B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_cta_height);
        this.f53914C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_12);
        this.f53915D = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_similar_channel_height);
        this.f53916E = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_12);
        m129210a = AbstractC24856m.m129210a(new C10633b());
        this.f53917F = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10642k());
        this.f53918G = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10647p());
        this.f53919H = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C10648q());
        this.f53920I = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C10646o());
        this.f53921J = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C10634c());
        this.f53922K = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C10636e());
        this.f53923L = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C10643l());
        this.f53924M = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C10640i());
        this.f53925N = m129210a9;
        m129210a10 = AbstractC24856m.m129210a(new C10645n());
        this.f53926O = m129210a10;
        m129210a11 = AbstractC24856m.m129210a(new C10644m());
        this.f53927P = m129210a11;
        m129210a12 = AbstractC24856m.m129210a(new C10635d());
        this.f53928Q = m129210a12;
        m129210a13 = AbstractC24856m.m129210a(new C10641j());
        this.f53930S = m129210a13;
    }

    /* renamed from: g */
    private final void m55622g(boolean z11) {
        float[] fArr;
        if (z11) {
            AbstractC26112n.m134367H(getTvSimilarVideo());
            fArr = new float[]{1.0f, 0.0f};
        } else {
            AbstractC26112n.m134431w0(getTvSimilarVideo());
            fArr = new float[]{0.0f, 1.0f};
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChannelInfoLayout.m55623h(ChannelInfoLayout.this, valueAnimator);
            }
        });
        AbstractC19074t.m100205c(ofFloat);
        ofFloat.addListener(new C10638g(z11, this));
        ofFloat.start();
    }

    private final View getAivAvatar() {
        Object value = this.f53917F.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getBtnAction() {
        Object value = this.f53922K.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final ImageView getBtnExpand() {
        Object value = this.f53928Q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ImageView) value;
    }

    private final View getBtnShare() {
        Object value = this.f53923L.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final FrameLayout getFlExpand() {
        Object value = this.f53925N.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final View getLytLive() {
        Object value = this.f53930S.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getLytStats() {
        Object value = this.f53918G.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getRvChannelCta() {
        Object value = this.f53924M.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRvSimilarVideo() {
        Object value = this.f53927P.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final SimpleShadowTextView getTvSimilarVideo() {
        Object value = this.f53926O.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    private final View getTxtBio() {
        Object value = this.f53921J.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getTxtName() {
        Object value = this.f53919H.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getTxtVerify() {
        Object value = this.f53920I.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m55623h(ChannelInfoLayout channelInfoLayout, ValueAnimator valueAnimator) {
        Float f11;
        AbstractC19074t.m100208f(channelInfoLayout, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f11 = (Float) animatedValue;
        } else {
            f11 = null;
        }
        if (f11 != null) {
            float floatValue = f11.floatValue();
            AbstractC26112n.m134394e(channelInfoLayout.getRvSimilarVideo(), new C10637f(floatValue));
            channelInfoLayout.getBtnExpand().setRotation(180 * floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m55624k(ChannelInfoLayout channelInfoLayout, View view) {
        AbstractC19074t.m100208f(channelInfoLayout, "this$0");
        if (AbstractC26112n.m134378S(channelInfoLayout.getTvSimilarVideo())) {
            AbstractC26112n.m134367H(channelInfoLayout.getTvSimilarVideo());
            channelInfoLayout.m55622g(true);
        } else {
            AbstractC26112n.m134431w0(channelInfoLayout.getTvSimilarVideo());
            channelInfoLayout.m55622g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:            if (fn0.AbstractC19074t.m100204b(r3.getTag(), "collapse") != false) goto L6;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m55625l(View view) {
        String str;
        if (view.getTag() != null) {
            str = "collapse";
        }
        str = "expand";
        view.setTag(str);
    }

    /* renamed from: i */
    public final void m55626i() {
        getBtnExpand().setRotation(0.0f);
        getBtnExpand().setTag("collapse");
        getRvSimilarVideo().setTag("collapse");
        AbstractC26112n.m134367H(getFlExpand());
        AbstractC26112n.m134367H(getTvSimilarVideo());
        AbstractC26112n.m134394e(getRvSimilarVideo(), C10639h.f53950q);
    }

    /* renamed from: j */
    public final void m55627j() {
        m55622g(false);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        getFlExpand().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelInfoLayout.m55624k(ChannelInfoLayout.this, view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f53931p;
        int i16 = this.f53932q;
        AbstractC26112n.m134383X(getAivAvatar(), i16, i15);
        AbstractC26112n.m134383X(getLytStats(), i16, i15 + this.f53934s + this.f53935t);
        int i17 = this.f53931p;
        AbstractC26112n.m134383X(getTxtName(), i16 + this.f53934s + this.f53936u, i17);
        int bottom = getTxtName().getBottom();
        if (AbstractC26112n.m134378S(getTxtVerify())) {
            AbstractC26112n.m134383X(getTxtVerify(), bottom + this.f53937v, i17);
            bottom = getTxtVerify().getBottom() - this.f53938w;
        }
        if (AbstractC26112n.m134378S(getTxtBio())) {
            AbstractC26112n.m134383X(getTxtBio(), bottom + this.f53938w, i17);
            bottom = getTxtBio().getBottom();
        }
        if (AbstractC26112n.m134378S(getRvChannelCta())) {
            AbstractC26112n.m134383X(getRvChannelCta(), bottom + this.f53939x, 0);
            bottom = getRvChannelCta().getBottom();
        }
        if (AbstractC26112n.m134378S(getLytLive())) {
            AbstractC26112n.m134383X(getLytLive(), bottom + this.f53916E, i17);
            bottom = getLytLive().getBottom();
        }
        if (AbstractC26112n.m134378S(getBtnAction())) {
            bottom += this.f53940y;
            AbstractC26112n.m134383X(getBtnAction(), bottom, i17);
            if (AbstractC26112n.m134378S(getBtnShare())) {
                AbstractC26112n.m134383X(getBtnShare(), bottom, i17 + getBtnAction().getMeasuredWidth() + this.f53912A);
            }
        }
        if (AbstractC26112n.m134378S(getFlExpand())) {
            AbstractC26112n.m134383X(getFlExpand(), bottom, (getMeasuredWidth() - this.f53931p) - getFlExpand().getMeasuredWidth());
            bottom += getFlExpand().getMeasuredHeight();
        }
        if (AbstractC26112n.m134378S(getTvSimilarVideo())) {
            AbstractC26112n.m134383X(getTvSimilarVideo(), this.f53914C + bottom, this.f53931p);
            bottom += getTvSimilarVideo().getMeasuredHeight() + this.f53914C;
        }
        if (AbstractC26112n.m134378S(getRvSimilarVideo())) {
            if (getRvSimilarVideo().getLayoutParams().height > 0) {
                AbstractC26112n.m134383X(getRvSimilarVideo(), bottom + this.f53914C, this.f53931p);
                getRvSimilarVideo().getMeasuredHeight();
            } else if (getRvSimilarVideo().getLayoutParams().height == 0) {
                AbstractC26112n.m134383X(getRvSimilarVideo(), bottom, this.f53931p);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f53932q + this.f53933r;
        View aivAvatar = getAivAvatar();
        int i14 = this.f53934s;
        AbstractC26112n.m134387a0(aivAvatar, i14, 1073741824, i14, 1073741824);
        int i15 = i13 + this.f53934s;
        View lytStats = getLytStats();
        int i16 = this.f53931p;
        int i17 = this.f53934s;
        AbstractC26112n.m134387a0(lytStats, (((size - i16) - i17) - this.f53935t) - i16, 1073741824, i17, 1073741824);
        int i18 = size - (this.f53931p * 2);
        AbstractC26112n.m134387a0(getTxtName(), i18, 1073741824, 0, 0);
        int measuredHeight = i15 + this.f53936u + getTxtName().getMeasuredHeight();
        if (AbstractC26112n.m134378S(getTxtVerify())) {
            AbstractC26112n.m134387a0(getTxtVerify(), i18, Integer.MIN_VALUE, 0, 0);
            measuredHeight += (this.f53937v + getTxtVerify().getMeasuredHeight()) - this.f53938w;
        }
        if (AbstractC26112n.m134378S(getTxtBio())) {
            AbstractC26112n.m134387a0(getTxtBio(), i18, 1073741824, 0, 0);
            measuredHeight += this.f53938w + getTxtBio().getMeasuredHeight();
        }
        if (AbstractC26112n.m134378S(getLytLive())) {
            AbstractC26112n.m134387a0(getLytLive(), i18, 1073741824, 0, 0);
            measuredHeight += this.f53916E + getLytLive().getMeasuredHeight();
        }
        if (C27417l.f129055a.m140378b().m51243p()) {
            i18 -= this.f53912A + this.f53941z;
            AbstractC26112n.m134431w0(getBtnShare());
        } else {
            AbstractC26112n.m134367H(getBtnShare());
        }
        if (AbstractC26112n.m134378S(getRvChannelCta())) {
            AbstractC26112n.m134387a0(getRvChannelCta(), size - this.f53931p, 1073741824, this.f53913B, 1073741824);
            measuredHeight += this.f53939x + this.f53913B;
        }
        if (AbstractC26112n.m134378S(getBtnAction())) {
            if (AbstractC26112n.m134378S(getFlExpand())) {
                FrameLayout flExpand = getFlExpand();
                int i19 = this.f53941z;
                AbstractC26112n.m134387a0(flExpand, i19, 1073741824, i19, 1073741824);
                i18 -= this.f53912A + this.f53941z;
            }
            AbstractC26112n.m134387a0(getBtnAction(), i18, 1073741824, this.f53941z, 1073741824);
            measuredHeight += this.f53940y + this.f53941z;
            if (AbstractC26112n.m134378S(getBtnShare())) {
                View btnShare = getBtnShare();
                int i21 = this.f53941z;
                AbstractC26112n.m134387a0(btnShare, i21, 1073741824, i21, 1073741824);
            }
        } else {
            AbstractC26112n.m134367H(getBtnShare());
        }
        int i22 = size - (this.f53931p * 2);
        if (AbstractC26112n.m134378S(getTvSimilarVideo())) {
            AbstractC26112n.m134387a0(getTvSimilarVideo(), i22, 1073741824, 0, 0);
            measuredHeight += getTvSimilarVideo().getMeasuredHeight() + this.f53914C;
        }
        if (AbstractC26112n.m134378S(getRvSimilarVideo())) {
            AbstractC26112n.m134387a0(getRvSimilarVideo(), i22, 1073741824, getRvSimilarVideo().getLayoutParams().height, 1073741824);
            if (getRvSimilarVideo().getLayoutParams().height > 0) {
                measuredHeight += getRvSimilarVideo().getMeasuredHeight() + this.f53914C;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setOnAnimSimilarChannelComplete(InterfaceC18505l interfaceC18505l) {
        this.f53929R = interfaceC18505l;
    }
}
