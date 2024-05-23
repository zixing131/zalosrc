package com.zing.zalo.feed.components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.FeedItemZInstantAds;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17172p;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.InterfaceC17246y0;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p458qr.C25482o;
import p649xl.C30045t3;
import p649xl.C30062u3;
import p667y2.C30268e;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import ui0.C27280g;
import vl0.AbstractC28291a;

/* loaded from: classes4.dex */
public final class FeedItemZInstantAds extends RelativeLayout implements InterfaceC8395t6 {

    /* renamed from: p */
    private String f44917p;

    /* renamed from: q */
    private int f44918q;

    /* renamed from: r */
    private boolean f44919r;

    /* renamed from: s */
    private final int f44920s;

    /* renamed from: t */
    private final ZaloZinstantCommonLayout f44921t;

    /* renamed from: u */
    private final C8169c f44922u;

    /* renamed from: v */
    private final C8167a f44923v;

    /* renamed from: w */
    private InterfaceC8343n5 f44924w;

    /* renamed from: x */
    private InterfaceC8168b f44925x;

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$a */
    /* loaded from: classes4.dex */
    public final class C8167a extends FrameLayout {

        /* renamed from: p */
        private C30045t3 f44926p;

        /* renamed from: q */
        final /* synthetic */ FeedItemZInstantAds f44927q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8167a(FeedItemZInstantAds feedItemZInstantAds, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f44927q = feedItemZInstantAds;
            C30045t3 m148515c = C30045t3.m148515c(LayoutInflater.from(getContext()));
            AbstractC19074t.m100207e(m148515c, "inflate(...)");
            this.f44926p = m148515c;
            RecyclingImageView recyclingImageView = m148515c.f139375r;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            recyclingImageView.setBackground(C27280g.m139660c(context2, AbstractC23322a.zds_ic_warning_circle_solid_24, AbstractC2807a.icon_03));
            this.f44926p.f139374q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_zinstant_ads_error_detected));
            this.f44926p.f139376s.getButton().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
            addView(this.f44926p.getRoot());
            setBackgroundColor(C23212s8.m119606n(AbstractC28291a.ui_background));
            this.f44926p.f139376s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.l5
                public /* synthetic */ ViewOnClickListenerC8327l5() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemZInstantAds.C8167a.m44283b(FeedItemZInstantAds.this, view);
                }
            });
        }

        /* renamed from: b */
        public static final void m44283b(FeedItemZInstantAds feedItemZInstantAds, View view) {
            AbstractC19074t.m100208f(feedItemZInstantAds, "this$0");
            InterfaceC8168b actionListener = feedItemZInstantAds.getActionListener();
            if (actionListener != null) {
                String str = feedItemZInstantAds.f44917p;
                if (str == null) {
                    str = "";
                }
                actionListener.mo44286c(str);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8168b {
        /* renamed from: a */
        void mo44284a(String str);

        /* renamed from: b */
        void mo44285b(String str);

        /* renamed from: c */
        void mo44286c(String str);

        /* renamed from: d */
        void mo44287d(String str);

        /* renamed from: e */
        void mo44288e(int i11, String str);

        /* renamed from: f */
        void mo44289f(C3000l0 c3000l0, C3020p0 c3020p0);
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$c */
    /* loaded from: classes4.dex */
    public final class C8169c extends FrameLayout {

        /* renamed from: p */
        private C30062u3 f44928p;

        /* renamed from: q */
        final /* synthetic */ FeedItemZInstantAds f44929q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8169c(FeedItemZInstantAds feedItemZInstantAds, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f44929q = feedItemZInstantAds;
            C30062u3 m148560c = C30062u3.m148560c(LayoutInflater.from(getContext()));
            AbstractC19074t.m100207e(m148560c, "inflate(...)");
            this.f44928p = m148560c;
            addView(m148560c.getRoot());
            setBackgroundColor(C23212s8.m119606n(AbstractC2807a.page_background_01));
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$d */
    /* loaded from: classes4.dex */
    public static final class C8170d extends C17170o {
        C8170d() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return AbstractC23136l9.m118725l0(FeedItemZInstantAds.this.getContext());
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return FeedItemZInstantAds.this.f44917p;
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$e */
    /* loaded from: classes4.dex */
    public static final class C8171e extends C17172p {
        C8171e() {
        }

        @Override // com.zing.zalo.zinstant.C17172p, uk0.InterfaceC27292f
        /* renamed from: b */
        public void mo44291b(int i11, String str, String str2, ZOMInsight zOMInsight) {
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str2, "zoneId");
            AbstractC19074t.m100208f(zOMInsight, "insight");
            super.mo44291b(i11, str, str2, zOMInsight);
            String str3 = zOMInsight.mValue;
        }

        @Override // com.zing.zalo.zinstant.C17172p, uk0.InterfaceC27292f
        /* renamed from: d */
        public void mo44292d(int i11, String str, String str2, ZOMInsight zOMInsight) {
            InterfaceC8168b actionListener;
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str2, "zoneId");
            super.mo44292d(i11, str, str2, zOMInsight);
            if (zOMInsight != null && AbstractC19074t.m100204b(zOMInsight.mLabel, "social_feed_ads_message") && (actionListener = FeedItemZInstantAds.this.getActionListener()) != null) {
                String str3 = FeedItemZInstantAds.this.f44917p;
                if (str3 == null) {
                    str3 = "";
                }
                actionListener.mo44285b(str3);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$f */
    /* loaded from: classes4.dex */
    public static final class C8172f implements InterfaceC17246y0 {
        C8172f() {
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17246y0
        /* renamed from: a */
        public void mo44293a(String str, String str2, InterfaceC24785k interfaceC24785k) {
            try {
                if (AbstractC19074t.m100204b(str, "action.open.zinstantview")) {
                    InterfaceC8168b actionListener = FeedItemZInstantAds.this.getActionListener();
                    if (actionListener != null) {
                        actionListener.mo44284a(str2);
                    }
                } else {
                    if (AbstractC19074t.m100204b(str, "action.social.open.feed_option") && str2 != null && str2.length() != 0) {
                        String optString = new JSONObject(str2).optString("feed_item");
                        if (optString != null && optString.length() != 0) {
                            C3020p0 m108752C0 = AbstractC20826v0.m108752C0(new JSONObject(optString), 16);
                            AbstractC19074t.m100207e(m108752C0, "parseFeedItem(...)");
                            C3000l0 c3000l0 = new C3000l0(m108752C0, 16);
                            InterfaceC8168b actionListener2 = FeedItemZInstantAds.this.getActionListener();
                            if (actionListener2 != null) {
                                actionListener2.mo44289f(c3000l0, m108752C0);
                            }
                        }
                    }
                    FeedItemZInstantAds.this.f44921t.m91436n1(str, str2, interfaceC24785k);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$g */
    /* loaded from: classes4.dex */
    public static final class C8173g extends AbstractC19075u implements InterfaceC18494a {
        C8173g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44294a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44294a() {
            FeedItemZInstantAds.this.f44921t.onPause();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$h */
    /* loaded from: classes4.dex */
    public static final class C8174h extends AbstractC19075u implements InterfaceC18494a {
        C8174h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44295a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44295a() {
            FeedItemZInstantAds.this.f44921t.onResume();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$i */
    /* loaded from: classes4.dex */
    static final class C8175i extends AbstractC19075u implements InterfaceC18494a {
        C8175i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44296a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44296a() {
            FeedItemZInstantAds.this.f44921t.onStart();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$j */
    /* loaded from: classes4.dex */
    static final class C8176j extends AbstractC19075u implements InterfaceC18494a {
        C8176j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44297a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44297a() {
            FeedItemZInstantAds.this.f44921t.onStop();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$k */
    /* loaded from: classes4.dex */
    public static final class C8177k extends AnimatorListenerAdapter {
        C8177k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            FeedItemZInstantAds.this.setMinimumHeight(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemZInstantAds(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f44918q = -1;
        this.f44920s = AbstractC23136l9.m118742r(300.0f);
        this.f44921t = new ZaloZinstantCommonLayout(getContext()) { // from class: com.zing.zalo.feed.components.FeedItemZInstantAds$zaloZinstantLayout$1

            /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$zaloZinstantLayout$1$a */
            /* loaded from: classes4.dex */
            static final class C8178a extends AbstractC19075u implements InterfaceC18494a {
                C8178a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m44298a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m44298a() {
                    FeedItemZInstantAds$zaloZinstantLayout$1.this.onStart();
                }
            }

            public FeedItemZInstantAds$zaloZinstantLayout$1(Context context2) {
                super(context2);
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: k1 */
            public void mo44259k1(Exception exc) {
                AbstractC19074t.m100208f(exc, C30268e.f140632a);
                super.mo44259k1(exc);
                FeedItemZInstantAds.this.f44919r = false;
                FeedItemZInstantAds.this.m44277m();
                FeedItemZInstantAds.InterfaceC8168b actionListener = FeedItemZInstantAds.this.getActionListener();
                if (actionListener != null) {
                    String str = FeedItemZInstantAds.this.f44917p;
                    if (str == null) {
                        str = "";
                    }
                    actionListener.mo44287d(str);
                }
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: l1 */
            public void mo35796l1() {
                int i11;
                super.mo35796l1();
                FeedItemZInstantAds.this.f44919r = true;
                FeedItemZInstantAds.this.m44275k(new C8178a());
                FeedItemZInstantAds.this.m44279p();
                FeedItemZInstantAds.InterfaceC8168b actionListener = FeedItemZInstantAds.this.getActionListener();
                if (actionListener != null) {
                    i11 = FeedItemZInstantAds.this.f44918q;
                    String str = FeedItemZInstantAds.this.f44917p;
                    if (str == null) {
                        str = "";
                    }
                    actionListener.mo44288e(i11, str);
                }
            }
        };
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f44922u = new C8169c(this, context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f44923v = new C8167a(this, context3);
        m44274i();
    }

    /* renamed from: i */
    private final void m44274i() {
        setBackgroundColor(C23212s8.m119606n(AbstractC2807a.ui_background));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        this.f44921t.setVisibility(8);
        addView(this.f44921t, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        addView(this.f44922u, layoutParams2);
        this.f44922u.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(15);
        this.f44923v.setVisibility(8);
        addView(this.f44923v, layoutParams3);
        this.f44921t.setContextProvider(new C8170d());
        this.f44921t.setInteractionTracker(new C8171e());
        this.f44921t.setActionDelegate(new C8172f());
        m44278n();
    }

    /* renamed from: k */
    public final void m44275k(InterfaceC18494a interfaceC18494a) {
        InterfaceC8343n5 interfaceC8343n5;
        if (isAttachedToWindow() && (interfaceC8343n5 = this.f44924w) != null && interfaceC8343n5.mo44786a()) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: l */
    private final void m44276l(InterfaceC18494a interfaceC18494a) {
        if (isAttachedToWindow()) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: m */
    public final void m44277m() {
        AbstractC8335m5.m44784c(this.f44922u);
        AbstractC8335m5.m44783b(this.f44923v, null, 1, null);
        AbstractC8335m5.m44784c(this.f44921t);
    }

    /* renamed from: n */
    private final void m44278n() {
        AbstractC8335m5.m44784c(this.f44923v);
        AbstractC8335m5.m44783b(this.f44922u, null, 1, null);
        AbstractC8335m5.m44784c(this.f44921t);
    }

    /* renamed from: p */
    public final void m44279p() {
        AbstractC8335m5.m44784c(this.f44923v);
        AbstractC8335m5.m44784c(this.f44922u);
        AbstractC8335m5.m44782a(this.f44921t, new C8177k());
    }

    public final InterfaceC8168b getActionListener() {
        return this.f44925x;
    }

    /* renamed from: h */
    public final void m44280h(C3000l0 c3000l0, int i11, C8314k0 c8314k0) {
        InterfaceC22508f interfaceC22508f;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(c8314k0, "configBindZInstantAds");
        if (!AbstractC19074t.m100204b(this.f44917p, c3000l0.m14322a0().f12057p) && c8314k0.m44732d()) {
            m44278n();
        }
        this.f44917p = c3000l0.m14322a0().f12057p;
        this.f44918q = i11;
        if (c8314k0.m44730b()) {
            m44278n();
            return;
        }
        C3025q0 c3025q0 = c3000l0.m14322a0().f12023C;
        if (c3025q0 == null) {
            return;
        }
        C17244x0 c17244x0 = c3025q0.f12109R;
        if (c17244x0 != null) {
            interfaceC22508f = c17244x0.m92064b();
        } else {
            interfaceC22508f = null;
        }
        if (interfaceC22508f == null) {
            m44277m();
            return;
        }
        int i12 = this.f44920s;
        if (!this.f44919r) {
            setMinimumHeight(i12);
        }
        if (this.f44923v.getVisibility() != 0) {
            C25482o c25482o = C25482o.f122075a;
            String str = this.f44917p;
            if (str == null) {
                str = "";
            }
            c25482o.m131994O(str, System.currentTimeMillis());
            this.f44921t.m91433f1(interfaceC22508f);
        }
    }

    /* renamed from: j */
    public final boolean m44281j() {
        return this.f44919r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onPause();
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onPause() {
        m44276l(new C8173g());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onResume() {
        m44275k(new C8174h());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStart() {
        m44275k(new C8175i());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStop() {
        m44276l(new C8176j());
    }

    public final void setActionListener(InterfaceC8168b interfaceC8168b) {
        this.f44925x = interfaceC8168b;
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8395t6
    public void setParentStateInfoProvider(InterfaceC8343n5 interfaceC8343n5) {
        this.f44924w = interfaceC8343n5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemZInstantAds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f44918q = -1;
        this.f44920s = AbstractC23136l9.m118742r(300.0f);
        this.f44921t = new ZaloZinstantCommonLayout(getContext()) { // from class: com.zing.zalo.feed.components.FeedItemZInstantAds$zaloZinstantLayout$1

            /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantAds$zaloZinstantLayout$1$a */
            /* loaded from: classes4.dex */
            static final class C8178a extends AbstractC19075u implements InterfaceC18494a {
                C8178a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m44298a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m44298a() {
                    FeedItemZInstantAds$zaloZinstantLayout$1.this.onStart();
                }
            }

            public FeedItemZInstantAds$zaloZinstantLayout$1(Context context2) {
                super(context2);
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: k1 */
            public void mo44259k1(Exception exc) {
                AbstractC19074t.m100208f(exc, C30268e.f140632a);
                super.mo44259k1(exc);
                FeedItemZInstantAds.this.f44919r = false;
                FeedItemZInstantAds.this.m44277m();
                FeedItemZInstantAds.InterfaceC8168b actionListener = FeedItemZInstantAds.this.getActionListener();
                if (actionListener != null) {
                    String str = FeedItemZInstantAds.this.f44917p;
                    if (str == null) {
                        str = "";
                    }
                    actionListener.mo44287d(str);
                }
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: l1 */
            public void mo35796l1() {
                int i11;
                super.mo35796l1();
                FeedItemZInstantAds.this.f44919r = true;
                FeedItemZInstantAds.this.m44275k(new C8178a());
                FeedItemZInstantAds.this.m44279p();
                FeedItemZInstantAds.InterfaceC8168b actionListener = FeedItemZInstantAds.this.getActionListener();
                if (actionListener != null) {
                    i11 = FeedItemZInstantAds.this.f44918q;
                    String str = FeedItemZInstantAds.this.f44917p;
                    if (str == null) {
                        str = "";
                    }
                    actionListener.mo44288e(i11, str);
                }
            }
        };
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f44922u = new C8169c(this, context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f44923v = new C8167a(this, context3);
        m44274i();
    }
}
