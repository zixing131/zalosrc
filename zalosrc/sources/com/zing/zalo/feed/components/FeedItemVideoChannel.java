package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.work.AbstractC2144f;
import bi0.AbstractC2807a;
import bo.C2986i1;
import bo.C3000l0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.FeedItemVideoChannel;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import org.json.JSONObject;
import p173fz.C19172a;
import p458qr.C25482o;
import p649xl.C29993q3;
import p649xl.C30011r3;
import p649xl.C30028s3;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sy.AbstractC26423o;
import tr.C26885i;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class FeedItemVideoChannel extends RelativeLayout implements InterfaceC8395t6 {
    public static final C8151a Companion = new C8151a(null);

    /* renamed from: A */
    private InterfaceC8343n5 f44882A;

    /* renamed from: p */
    private boolean f44883p;

    /* renamed from: q */
    private int f44884q;

    /* renamed from: r */
    private String f44885r;

    /* renamed from: s */
    private boolean f44886s;

    /* renamed from: t */
    private final int f44887t;

    /* renamed from: u */
    private final InterfaceC24854k f44888u;

    /* renamed from: v */
    private final ZaloZinstantCommonLayout f44889v;

    /* renamed from: w */
    private InterfaceC8155e f44890w;

    /* renamed from: x */
    private final C8153c f44891x;

    /* renamed from: y */
    private final C8154d f44892y;

    /* renamed from: z */
    private final C8152b f44893z;

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$a */
    /* loaded from: classes4.dex */
    public static final class C8151a {
        private C8151a() {
        }

        public /* synthetic */ C8151a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$b */
    /* loaded from: classes4.dex */
    public final class C8152b extends FrameLayout {

        /* renamed from: p */
        private C29993q3 f44894p;

        /* renamed from: q */
        final /* synthetic */ FeedItemVideoChannel f44895q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8152b(FeedItemVideoChannel feedItemVideoChannel, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f44895q = feedItemVideoChannel;
            C29993q3 m148391c = C29993q3.m148391c(LayoutInflater.from(getContext()));
            AbstractC19074t.m100207e(m148391c, "inflate(...)");
            this.f44894p = m148391c;
            RecyclingImageView recyclingImageView = m148391c.f139086r;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            recyclingImageView.setBackground(C27280g.m139660c(context2, AbstractC23322a.zds_ic_warning_circle_solid_24, AbstractC2807a.icon_03));
            this.f44894p.f139085q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_detected_general));
            this.f44894p.f139087s.getButton().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
            addView(this.f44894p.getRoot());
            setBackgroundColor(C23212s8.m119606n(AbstractC2807a.page_background_01));
            this.f44894p.f139087s.setIdTracking("social_timeline_video_channel_retry");
            this.f44894p.f139087s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.k5
                public /* synthetic */ ViewOnClickListenerC8319k5() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemVideoChannel.C8152b.m44242b(FeedItemVideoChannel.this, view);
                }
            });
        }

        /* renamed from: b */
        public static final void m44242b(FeedItemVideoChannel feedItemVideoChannel, View view) {
            AbstractC19074t.m100208f(feedItemVideoChannel, "this$0");
            InterfaceC8155e interfaceC8155e = feedItemVideoChannel.f44890w;
            if (interfaceC8155e != null) {
                interfaceC8155e.mo44247b();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$c */
    /* loaded from: classes4.dex */
    public final class C8153c extends FrameLayout {

        /* renamed from: p */
        private C30011r3 f44896p;

        /* renamed from: q */
        final /* synthetic */ FeedItemVideoChannel f44897q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8153c(FeedItemVideoChannel feedItemVideoChannel, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f44897q = feedItemVideoChannel;
            C30011r3 m148433c = C30011r3.m148433c(LayoutInflater.from(getContext()));
            AbstractC19074t.m100207e(m148433c, "inflate(...)");
            this.f44896p = m148433c;
            addView(m148433c.getRoot());
        }

        /* renamed from: a */
        public final void m44243a(TextLocalization textLocalization, TextLocalization textLocalization2) {
            AbstractC19074t.m100208f(textLocalization, "title");
            AbstractC19074t.m100208f(textLocalization2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
            this.f44896p.f139193t.setText(textLocalization.m44977b());
            this.f44896p.f139192s.setText(textLocalization2.m44977b());
            CharSequence text = this.f44896p.f139192s.getText();
            AbstractC19074t.m100207e(text, "getText(...)");
            if (text.length() == 0) {
                RobotoTextView robotoTextView = this.f44896p.f139192s;
                AbstractC19074t.m100207e(robotoTextView, "sectionSubtitle");
                AbstractC26423o.m136267a(robotoTextView);
                View view = this.f44896p.f139190q;
                AbstractC19074t.m100207e(view, "dotDivider");
                AbstractC26423o.m136267a(view);
                return;
            }
            RobotoTextView robotoTextView2 = this.f44896p.f139192s;
            AbstractC19074t.m100207e(robotoTextView2, "sectionSubtitle");
            AbstractC26423o.m136269c(robotoTextView2);
            View view2 = this.f44896p.f139190q;
            AbstractC19074t.m100207e(view2, "dotDivider");
            AbstractC26423o.m136269c(view2);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$d */
    /* loaded from: classes4.dex */
    public final class C8154d extends FrameLayout {

        /* renamed from: p */
        private C30028s3 f44898p;

        /* renamed from: q */
        final /* synthetic */ FeedItemVideoChannel f44899q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8154d(FeedItemVideoChannel feedItemVideoChannel, Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f44899q = feedItemVideoChannel;
            C30028s3 m148477c = C30028s3.m148477c(LayoutInflater.from(getContext()));
            AbstractC19074t.m100207e(m148477c, "inflate(...)");
            this.f44898p = m148477c;
            addView(m148477c.getRoot());
            setBackgroundColor(C23212s8.m119606n(AbstractC2807a.page_background_01));
        }

        /* renamed from: b */
        private final int m44244b(int i11) {
            return (i11 - ((AbstractC23136l9.m118742r(12.0f) + AbstractC23136l9.m118742r(20.0f)) + AbstractC23136l9.m118742r(20.0f))) - AbstractC23136l9.m118742r(24.0f);
        }

        /* renamed from: a */
        public final void m44245a(int i11) {
            this.f44898p.f139286q.m85146a(m44244b(i11));
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC8155e {
        /* renamed from: a */
        void mo44246a();

        /* renamed from: b */
        void mo44247b();

        /* renamed from: c */
        void mo44248c(String str, int i11, C23855s0 c23855s0);

        /* renamed from: d */
        void mo44249d(String str, String str2);

        /* renamed from: e */
        void mo44250e(String str);

        /* renamed from: f */
        void mo44251f();
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8156f {
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$g */
    /* loaded from: classes4.dex */
    public static final class C8157g extends AbstractC8156f {

        /* renamed from: a */
        private final boolean f44900a;

        public C8157g(boolean z11) {
            this.f44900a = z11;
        }

        /* renamed from: a */
        public final boolean m44252a() {
            return this.f44900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8157g) && this.f44900a == ((C8157g) obj).f44900a;
        }

        public int hashCode() {
            return AbstractC2144f.m11520a(this.f44900a);
        }

        public String toString() {
            return "ZInstantChannelParamsClearData(value=" + this.f44900a + ")";
        }

        public /* synthetic */ C8157g(boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? true : z11);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$h */
    /* loaded from: classes4.dex */
    public static final class C8158h extends AbstractC8156f {

        /* renamed from: a */
        private final int f44901a;

        public C8158h(int i11) {
            this.f44901a = i11;
        }

        /* renamed from: a */
        public final int m44253a() {
            return this.f44901a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8158h) && this.f44901a == ((C8158h) obj).f44901a;
        }

        public int hashCode() {
            return this.f44901a;
        }

        public String toString() {
            return "ZInstantChannelParamsPosition(position=" + this.f44901a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$i */
    /* loaded from: classes4.dex */
    public static final class C8159i extends AbstractC19075u implements InterfaceC18494a {
        C8159i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC23803b mo12V4() {
            return FeedItemVideoChannel.this.m44230p();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$j */
    /* loaded from: classes4.dex */
    public static final class C8160j extends AbstractC23803b {
        C8160j() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            AbstractC19074t.m100208f(zinstantLayout, "thisLayout");
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str2, "zoneId");
            AbstractC19074t.m100208f(str3, "action");
            AbstractC19074t.m100208f(str4, "data");
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            if (AbstractC19074t.m100204b(str3, "action.window.close")) {
                InterfaceC8155e interfaceC8155e = FeedItemVideoChannel.this.f44890w;
                if (interfaceC8155e != null) {
                    interfaceC8155e.mo44246a();
                    return;
                }
                return;
            }
            InterfaceC8155e interfaceC8155e2 = FeedItemVideoChannel.this.f44890w;
            if (interfaceC8155e2 != null) {
                interfaceC8155e2.mo44249d(str3, str4);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$k */
    /* loaded from: classes4.dex */
    public static final class C8161k extends C17170o {
        C8161k() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return AbstractC23136l9.m118725l0(FeedItemVideoChannel.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$l */
    /* loaded from: classes4.dex */
    public static final class C8162l extends AbstractC19075u implements InterfaceC18494a {
        C8162l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44255a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44255a() {
            FeedItemVideoChannel.this.f44889v.onPause();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$m */
    /* loaded from: classes4.dex */
    public static final class C8163m extends AbstractC19075u implements InterfaceC18494a {
        C8163m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44256a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44256a() {
            FeedItemVideoChannel.this.f44889v.onResume();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$n */
    /* loaded from: classes4.dex */
    static final class C8164n extends AbstractC19075u implements InterfaceC18494a {
        C8164n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44257a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44257a() {
            FeedItemVideoChannel.this.f44889v.onStart();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$o */
    /* loaded from: classes4.dex */
    static final class C8165o extends AbstractC19075u implements InterfaceC18494a {
        C8165o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m44258a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m44258a() {
            FeedItemVideoChannel.this.f44889v.onStop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemVideoChannel(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f44884q = -1;
        this.f44885r = "";
        this.f44887t = AbstractC23136l9.m118742r(200.0f);
        m129210a = AbstractC24856m.m129210a(new C8159i());
        this.f44888u = m129210a;
        this.f44889v = new ZaloZinstantCommonLayout(getContext()) { // from class: com.zing.zalo.feed.components.FeedItemVideoChannel$zaloZinstantLayout$1

            /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$zaloZinstantLayout$1$a */
            /* loaded from: classes4.dex */
            static final class C8166a extends AbstractC19075u implements InterfaceC18494a {
                C8166a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m44260a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m44260a() {
                    FeedItemVideoChannel$zaloZinstantLayout$1.this.onStart();
                }
            }

            public FeedItemVideoChannel$zaloZinstantLayout$1(Context context2) {
                super(context2);
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: k1 */
            public void mo44259k1(Exception exc) {
                String str;
                AbstractC19074t.m100208f(exc, C30268e.f140632a);
                super.mo44259k1(exc);
                FeedItemVideoChannel.this.f44886s = false;
                FeedItemVideoChannel.this.m44237x();
                FeedItemVideoChannel.InterfaceC8155e interfaceC8155e = FeedItemVideoChannel.this.f44890w;
                if (interfaceC8155e != null) {
                    str = FeedItemVideoChannel.this.f44885r;
                    interfaceC8155e.mo44250e(str);
                }
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: l1 */
            public void mo35796l1() {
                boolean z11;
                String str;
                super.mo35796l1();
                FeedItemVideoChannel.this.f44886s = true;
                FeedItemVideoChannel.this.setMinimumHeight(0);
                FeedItemVideoChannel.this.m44234u(new C8166a());
                FeedItemVideoChannel.this.m44239z();
                z11 = FeedItemVideoChannel.this.f44883p;
                if (z11) {
                    FeedItemVideoChannel.this.f44883p = false;
                    FeedItemVideoChannel.this.m44229n();
                    FeedItemVideoChannel.InterfaceC8155e interfaceC8155e = FeedItemVideoChannel.this.f44890w;
                    if (interfaceC8155e != null) {
                        interfaceC8155e.mo44251f();
                    }
                }
                FeedItemVideoChannel.this.m44236w();
                FeedItemVideoChannel.InterfaceC8155e interfaceC8155e2 = FeedItemVideoChannel.this.f44890w;
                if (interfaceC8155e2 != null) {
                    str = FeedItemVideoChannel.this.f44885r;
                    interfaceC8155e2.mo44248c(str, FeedItemVideoChannel.this.getHeight(), getZinstantRootTree());
                }
            }
        };
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f44891x = new C8153c(this, context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f44892y = new C8154d(this, context3);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        this.f44893z = new C8152b(this, context4);
        m44231q();
    }

    private final AbstractC23803b getClickHandler() {
        return (AbstractC23803b) this.f44888u.getValue();
    }

    /* renamed from: n */
    public final void m44229n() {
        m44233s(m44232r(new C8157g(false, 1, null), new C8158h(this.f44884q)));
    }

    /* renamed from: p */
    public final AbstractC23803b m44230p() {
        return new C8160j();
    }

    /* renamed from: q */
    private final void m44231q() {
        setBackgroundColor(C23212s8.m119606n(AbstractC2807a.ui_background));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.topMargin = AbstractC23136l9.m118742r(12.0f);
        this.f44891x.setId(View.generateViewId());
        addView(this.f44891x, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        addView(this.f44889v, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, this.f44891x.getId());
        addView(this.f44892y, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(3, this.f44891x.getId());
        layoutParams4.addRule(15);
        addView(this.f44893z, layoutParams4);
        this.f44889v.setContextProvider(new C8161k());
        m44238y();
        this.f44889v.setOnZinstantClickListener(getClickHandler());
    }

    /* renamed from: r */
    private final String m44232r(AbstractC8156f... abstractC8156fArr) {
        JSONObject jSONObject = new JSONObject();
        for (AbstractC8156f abstractC8156f : abstractC8156fArr) {
            if (abstractC8156f instanceof C8158h) {
                jSONObject.put("position", ((C8158h) abstractC8156f).m44253a());
            } else if (abstractC8156f instanceof C8157g) {
                jSONObject.put("clear", ((C8157g) abstractC8156f).m44252a());
            }
        }
        jSONObject.put("enable_option", C19172a.m100600k("social@zvideo_section@enable_option", 0));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("feed", jSONObject);
        String jSONObject3 = jSONObject2.toString();
        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    /* renamed from: s */
    private final void m44233s(String str) {
        this.f44889v.m91999q0("js.action.channel", str);
    }

    /* renamed from: u */
    public final void m44234u(InterfaceC18494a interfaceC18494a) {
        InterfaceC8343n5 interfaceC8343n5;
        if (isAttachedToWindow() && (interfaceC8343n5 = this.f44882A) != null && interfaceC8343n5.mo44786a()) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: v */
    private final void m44235v(InterfaceC18494a interfaceC18494a) {
        if (isAttachedToWindow()) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: w */
    public final void m44236w() {
        m44233s(m44232r(new C8158h(this.f44884q)));
    }

    /* renamed from: x */
    public final void m44237x() {
        AbstractC26423o.m136267a(this.f44892y);
        AbstractC26423o.m136269c(this.f44893z);
        AbstractC26423o.m136269c(this.f44891x);
    }

    /* renamed from: y */
    private final void m44238y() {
        AbstractC26423o.m136267a(this.f44893z);
        AbstractC26423o.m136269c(this.f44891x);
        AbstractC26423o.m136269c(this.f44892y);
    }

    /* renamed from: z */
    public final void m44239z() {
        AbstractC26423o.m136267a(this.f44891x);
        AbstractC26423o.m136267a(this.f44893z);
        AbstractC26423o.m136267a(this.f44892y);
        AbstractC26423o.m136269c(this.f44889v);
    }

    /* renamed from: m */
    public final void m44240m(C3000l0 c3000l0, C26885i c26885i) {
        InterfaceC22508f m92064b;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(c26885i, "channelConfig");
        C2986i1 c2986i1 = c3000l0.f11902t0;
        if (c2986i1 == null || (m92064b = c2986i1.m14157e().m92064b()) == null) {
            return;
        }
        int m14153a = c2986i1.m14153a();
        int i11 = this.f44887t;
        if (m14153a > i11) {
            i11 = c2986i1.m14153a();
        }
        if (!this.f44886s) {
            setMinimumHeight(i11);
        }
        this.f44891x.m44243a(c2986i1.m14156d(), c2986i1.m14155c());
        this.f44892y.m44245a(i11);
        if (c26885i.m138547b()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
                return;
            }
            return;
        }
        if (c26885i.m138548c()) {
            m44238y();
            return;
        }
        if (this.f44893z.getVisibility() != 0 || c26885i.m138550e()) {
            this.f44884q = c2986i1.m14154b() + 1;
            this.f44883p = c26885i.m138546a();
            String str = c3000l0.f11895q;
            AbstractC19074t.m100207e(str, "feedContentId");
            this.f44885r = str;
            C25482o.f122075a.m131995P(str, System.currentTimeMillis());
            this.f44889v.m91433f1(m92064b);
        }
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
        m44235v(new C8162l());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onResume() {
        m44234u(new C8163m());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStart() {
        m44234u(new C8164n());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8403u6
    public void onStop() {
        m44235v(new C8165o());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8395t6
    public void setParentStateInfoProvider(InterfaceC8343n5 interfaceC8343n5) {
        this.f44882A = interfaceC8343n5;
    }

    public final void setSectionVideoChannelListener(InterfaceC8155e interfaceC8155e) {
        AbstractC19074t.m100208f(interfaceC8155e, "listener");
        this.f44890w = interfaceC8155e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemVideoChannel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f44884q = -1;
        this.f44885r = "";
        this.f44887t = AbstractC23136l9.m118742r(200.0f);
        m129210a = AbstractC24856m.m129210a(new C8159i());
        this.f44888u = m129210a;
        this.f44889v = new ZaloZinstantCommonLayout(getContext()) { // from class: com.zing.zalo.feed.components.FeedItemVideoChannel$zaloZinstantLayout$1

            /* renamed from: com.zing.zalo.feed.components.FeedItemVideoChannel$zaloZinstantLayout$1$a */
            /* loaded from: classes4.dex */
            static final class C8166a extends AbstractC19075u implements InterfaceC18494a {
                C8166a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m44260a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m44260a() {
                    FeedItemVideoChannel$zaloZinstantLayout$1.this.onStart();
                }
            }

            public FeedItemVideoChannel$zaloZinstantLayout$1(Context context2) {
                super(context2);
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: k1 */
            public void mo44259k1(Exception exc) {
                String str;
                AbstractC19074t.m100208f(exc, C30268e.f140632a);
                super.mo44259k1(exc);
                FeedItemVideoChannel.this.f44886s = false;
                FeedItemVideoChannel.this.m44237x();
                FeedItemVideoChannel.InterfaceC8155e interfaceC8155e = FeedItemVideoChannel.this.f44890w;
                if (interfaceC8155e != null) {
                    str = FeedItemVideoChannel.this.f44885r;
                    interfaceC8155e.mo44250e(str);
                }
            }

            @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
            /* renamed from: l1 */
            public void mo35796l1() {
                boolean z11;
                String str;
                super.mo35796l1();
                FeedItemVideoChannel.this.f44886s = true;
                FeedItemVideoChannel.this.setMinimumHeight(0);
                FeedItemVideoChannel.this.m44234u(new C8166a());
                FeedItemVideoChannel.this.m44239z();
                z11 = FeedItemVideoChannel.this.f44883p;
                if (z11) {
                    FeedItemVideoChannel.this.f44883p = false;
                    FeedItemVideoChannel.this.m44229n();
                    FeedItemVideoChannel.InterfaceC8155e interfaceC8155e = FeedItemVideoChannel.this.f44890w;
                    if (interfaceC8155e != null) {
                        interfaceC8155e.mo44251f();
                    }
                }
                FeedItemVideoChannel.this.m44236w();
                FeedItemVideoChannel.InterfaceC8155e interfaceC8155e2 = FeedItemVideoChannel.this.f44890w;
                if (interfaceC8155e2 != null) {
                    str = FeedItemVideoChannel.this.f44885r;
                    interfaceC8155e2.mo44248c(str, FeedItemVideoChannel.this.getHeight(), getZinstantRootTree());
                }
            }
        };
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f44891x = new C8153c(this, context2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        this.f44892y = new C8154d(this, context3);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        this.f44893z = new C8152b(this, context4);
        m44231q();
    }
}
