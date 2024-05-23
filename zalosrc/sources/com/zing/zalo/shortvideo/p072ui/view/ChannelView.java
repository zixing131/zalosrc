package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b10.AbstractC2488g;
import b20.C2496b;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.shortvideo.data.model.Action;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import com.zing.zalo.shortvideo.data.model.Footer;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.SimilarChannel;
import com.zing.zalo.shortvideo.data.model.Stats;
import com.zing.zalo.shortvideo.data.remote.common.LimitationReachedException;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.data.remote.common.NotExistsException;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.ChannelBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.UploadActionBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.ChannelView;
import com.zing.zalo.shortvideo.p072ui.widget.C10762m;
import com.zing.zalo.shortvideo.p072ui.widget.ChannelInfoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.ChannelLivestreamInfoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.SuggestFollowLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e10.C18173j;
import e10.C18174k;
import e10.InterfaceC18175l;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import gg0.AbstractC19444a;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jg0.InterfaceC21251f;
import ln0.C22537f;
import m20.InterfaceC22745g;
import m20.ViewOnClickListenerC22757j;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p021an.AbstractC0955d;
import p10.AbstractC24602f;
import p10.EnumC24601e;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C24989b1;
import q10.C25015i;
import q20.C25097t;
import qm0.AbstractC25332a0;
import qm0.AbstractC25351j0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import s20.AbstractC26102d;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26980a;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import y10.C30262e;
import z10.C31158d;
import z10.C31164g;
import z10.C31175l0;

/* loaded from: classes5.dex */
public final class ChannelView extends AbstractC10623a implements InterfaceC22745g {
    public static final C10141b Companion = new C10141b(null);

    /* renamed from: B0 */
    private final InterfaceC10054b f52584B0;

    /* renamed from: C0 */
    private final String f52585C0;

    /* renamed from: D0 */
    private final Handler f52586D0;

    /* renamed from: E0 */
    private ChannelReceiver f52587E0;

    /* renamed from: F0 */
    private InterfaceC18175l f52588F0;

    /* renamed from: G0 */
    private LoadMoreVideoReceiver f52589G0;

    /* renamed from: H0 */
    private C31164g f52590H0;

    /* renamed from: I0 */
    private C31158d f52591I0;

    /* renamed from: J0 */
    private OverScrollableRecyclerView.GridLayoutManager f52592J0;

    /* renamed from: K0 */
    private C31175l0 f52593K0;

    /* renamed from: L0 */
    private boolean f52594L0;

    /* renamed from: M0 */
    private boolean f52595M0;

    /* renamed from: N0 */
    private float f52596N0;

    /* renamed from: O0 */
    private float f52597O0;

    /* renamed from: P0 */
    private boolean f52598P0;

    /* renamed from: Q0 */
    private boolean f52599Q0;

    /* renamed from: R0 */
    private boolean f52600R0;

    /* renamed from: S0 */
    private Boolean f52601S0;

    /* renamed from: T0 */
    private String f52602T0;

    /* renamed from: U0 */
    private final Runnable f52603U0;

    /* renamed from: V0 */
    private final C30262e f52604V0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10139a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10139a f52605y = new C10139a();

        C10139a() {
            super(3, C24989b1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchLayoutChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54079h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24989b1 m54079h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24989b1.m129764c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$a0 */
    /* loaded from: classes5.dex */
    static final class C10140a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24989b1 f52606q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10140a0(C24989b1 c24989b1) {
            super(0);
            this.f52606q = c24989b1;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(this.f52606q.f119765E.getMeasuredHeight());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$b */
    /* loaded from: classes5.dex */
    public static final class C10141b {
        private C10141b() {
        }

        public /* synthetic */ C10141b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ Bundle m54081d(C10141b c10141b, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return c10141b.m54084c(str, str2);
        }

        /* renamed from: a */
        public final Bundle m54082a() {
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("xSource", "myChannel"));
        }

        /* renamed from: b */
        public final Bundle m54083b(Channel channel, String str) {
            AbstractC19074t.m100208f(channel, "channel");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("CHANNEL", channel), AbstractC24866w.m129235a("JUST_WATCHED_ID", str));
        }

        /* renamed from: c */
        public final Bundle m54084c(String str, String str2) {
            AbstractC19074t.m100208f(str, "channelId");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("CHANNEL_ID", str), AbstractC24866w.m129235a("JUST_WATCHED_ID", str2));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$b0 */
    /* loaded from: classes5.dex */
    static final class C10142b0 extends AbstractC19075u implements InterfaceC18509p {
        C10142b0() {
            super(2);
        }

        /* renamed from: a */
        public final void m54085a(String str, String str2) {
            String str3;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "videoId");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                str3 = mo53067q.m50769l();
            } else {
                str3 = null;
            }
            if (AbstractC19074t.m100204b(str3, str)) {
                ChannelView.this.f52584B0.mo53066jH();
                C31164g c31164g = ChannelView.this.f52590H0;
                if (c31164g != null) {
                    ChannelView channelView = ChannelView.this;
                    c31164g.m151601c0(str2);
                    channelView.m54045oM();
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54085a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC10143c {
        /* renamed from: E3 */
        boolean mo51855E3(InterfaceC18494a interfaceC18494a);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$c0 */
    /* loaded from: classes5.dex */
    static final class C10144c0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$c0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ChannelView f52609q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChannelView channelView) {
                super(1);
                this.f52609q = channelView;
            }

            /* renamed from: a */
            public final void m54087a(int i11) {
                this.f52609q.m54025eM(i11);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m54087a(((Number) obj).intValue());
                return C24848g0.f119245a;
            }
        }

        C10144c0() {
            super(2);
        }

        /* renamed from: a */
        public final void m54086a(String str, PersonalizeChannel personalizeChannel) {
            String str2;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                str2 = mo53067q.m50769l();
            } else {
                str2 = null;
            }
            if (!AbstractC19074t.m100204b(str2, str)) {
                C31175l0 c31175l0 = ChannelView.this.f52593K0;
                if (c31175l0 != null) {
                    c31175l0.m151781Y(str, personalizeChannel.m51104c(), new a(ChannelView.this));
                    return;
                }
                return;
            }
            Channel mo53067q2 = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q2 != null) {
                ChannelView channelView = ChannelView.this;
                mo53067q2.m50770l0(personalizeChannel.m51104c());
                channelView.f52584B0.mo53066jH();
                mo53067q2.m50744T(personalizeChannel);
                channelView.m54039lM(mo53067q2);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54086a((String) obj, (PersonalizeChannel) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$d */
    /* loaded from: classes5.dex */
    public static final class C10145d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10145d f52610q = new C10145d();

        C10145d() {
            super(1);
        }

        /* renamed from: a */
        public final void m54088a(View view) {
            AbstractC19074t.m100208f(view, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54088a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$d0 */
    /* loaded from: classes5.dex */
    static final class C10146d0 extends AbstractC19075u implements InterfaceC18509p {
        C10146d0() {
            super(2);
        }

        /* renamed from: a */
        public final void m54089a(String str, String str2) {
            String str3;
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            if (!AbstractC19074t.m100204b(ChannelView.this.f52585C0, str2)) {
                return;
            }
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                str3 = mo53067q.m50769l();
            } else {
                str3 = null;
            }
            if (AbstractC19074t.m100204b(str, str3) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                ChannelView.this.mo54074bF(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54089a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$e */
    /* loaded from: classes5.dex */
    public static final class C10147e extends AbstractC19075u implements InterfaceC18505l {
        C10147e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54090a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ChannelView.this.m54069SL(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54090a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$e0 */
    /* loaded from: classes5.dex */
    static final class C10148e0 extends AbstractC19075u implements InterfaceC18511r {
        C10148e0() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54091a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54091a(String str, int i11, String str2, String str3) {
            String str4;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            if (!AbstractC19074t.m100204b(ChannelView.this.f52585C0, str2)) {
                return;
            }
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            Integer num = null;
            if (mo53067q != null) {
                str4 = mo53067q.m50769l();
            } else {
                str4 = null;
            }
            C31164g c31164g = ChannelView.this.f52590H0;
            if (c31164g != null && AbstractC19074t.m100204b(str, str4)) {
                Integer valueOf = Integer.valueOf(c31164g.m151597X(str3));
                if (valueOf.intValue() >= 0) {
                    num = valueOf;
                }
                if (num != null) {
                    ChannelView channelView = ChannelView.this;
                    int intValue = num.intValue();
                    OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = channelView.f52592J0;
                    if (gridLayoutManager != null) {
                        gridLayoutManager.mo9756v1(intValue);
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$f */
    /* loaded from: classes5.dex */
    static final class C10149f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24989b1 f52614q;

        /* renamed from: r */
        final /* synthetic */ ChannelView f52615r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10149f(C24989b1 c24989b1, ChannelView channelView) {
            super(0);
            this.f52614q = c24989b1;
            this.f52615r = channelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54092a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54092a() {
            this.f52614q.f119767G.m55786j();
            this.f52615r.f52584B0.mo53060Nr();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$f0 */
    /* loaded from: classes5.dex */
    static final class C10150f0 extends AbstractC19075u implements InterfaceC18505l {
        C10150f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m54093a(View view) {
            LivestreamData livestreamData;
            List m50771m;
            Object m131206f0;
            AbstractC19074t.m100208f(view, "it");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null && (m50771m = mo53067q.m50771m()) != null) {
                m131206f0 = AbstractC25332a0.m131206f0(m50771m);
                livestreamData = (LivestreamData) m131206f0;
            } else {
                livestreamData = null;
            }
            if (ChannelView.this.f52584B0.mo53071yd() && AbstractC2488g.m12571a(livestreamData)) {
                ChannelView.this.m55551QK(LivestreamPageView.Companion.m54488a("3", livestreamData));
            } else if (C27417l.f129055a.m140378b().m51243p()) {
                ChannelView.this.m54071UL();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54093a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$g */
    /* loaded from: classes5.dex */
    static final class C10151g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24989b1 f52617q;

        /* renamed from: r */
        final /* synthetic */ ChannelView f52618r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10151g(C24989b1 c24989b1, ChannelView channelView) {
            super(0);
            this.f52617q = c24989b1;
            this.f52618r = channelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54094a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54094a() {
            this.f52617q.f119767G.m55786j();
            this.f52618r.f52584B0.mo53060Nr();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$g0 */
    /* loaded from: classes5.dex */
    public static final class C10152g0 extends AbstractC19075u implements InterfaceC18505l {
        C10152g0() {
            super(1);
        }

        /* renamed from: a */
        public final void m54095a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10054b.a.m53671a(ChannelView.this.f52584B0, true, false, false, 6, null);
            ChannelView.m53998JL(ChannelView.this, true, false, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54095a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$h */
    /* loaded from: classes5.dex */
    public static final class C10153h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Channel f52621r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10153h(Channel channel) {
            super(0);
            this.f52621r = channel;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54096a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54096a() {
            ChannelView.this.mo54064Ft(this.f52621r);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$h0 */
    /* loaded from: classes5.dex */
    public static final class C10154h0 extends AbstractC19075u implements InterfaceC18505l {
        C10154h0() {
            super(1);
        }

        /* renamed from: a */
        public final void m54097a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ChannelView.this.f52584B0.mo53069qs(false);
            String m92652XI = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_unblock_channel);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54097a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$i */
    /* loaded from: classes5.dex */
    public static final class C10155i implements InterfaceC18175l {
        C10155i() {
        }

        /* renamed from: h */
        public static final void m54101h(ChannelView channelView, long j11, Video video) {
            AbstractC19074t.m100208f(channelView, "this$0");
            C31164g c31164g = channelView.f52590H0;
            if (c31164g != null) {
                c31164g.m151598Y(j11, video);
            }
            if (video != null) {
                if (video.m52863R() == 5) {
                    channelView.f52586D0.postDelayed(new Runnable() { // from class: m20.v

                        /* renamed from: q */
                        public final /* synthetic */ Video f111410q;

                        public /* synthetic */ RunnableC22805v(Video video2) {
                            r2 = video2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChannelView.C10155i.m54102i(ChannelView.this, r2);
                        }
                    }, 10000L);
                }
                channelView.f52584B0.mo53066jH();
            }
        }

        /* renamed from: i */
        public static final void m54102i(ChannelView channelView, Video video) {
            AbstractC19074t.m100208f(channelView, "this$0");
            channelView.f52584B0.mo53070re(video.m52911t());
        }

        /* renamed from: j */
        public static final void m54103j(ChannelView channelView, long j11, int i11) {
            AbstractC19074t.m100208f(channelView, "this$0");
            C31164g c31164g = channelView.f52590H0;
            if (c31164g != null) {
                c31164g.m151600b0(j11, i11);
            }
        }

        @Override // e10.InterfaceC18175l
        /* renamed from: a */
        public void mo54104a(C18174k c18174k) {
            AbstractC19074t.m100208f(c18174k, "task");
            C31164g c31164g = ChannelView.this.f52590H0;
            if (c31164g != null) {
                c31164g.m151599a0(new C31164g.e(c18174k));
            }
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = ChannelView.this.f52592J0;
            if (gridLayoutManager != null) {
                gridLayoutManager.m9721B2(0, 0);
            }
            C24989b1 c24989b1 = (C24989b1) ChannelView.this.m55556SK();
            if (c24989b1 != null) {
                c24989b1.f119767G.m55780b();
            }
        }

        @Override // e10.InterfaceC18175l
        /* renamed from: b */
        public void mo54105b(long j11, Video video) {
            AbstractC19444a.m101697e(new Runnable() { // from class: m20.t

                /* renamed from: q */
                public final /* synthetic */ long f111396q;

                /* renamed from: r */
                public final /* synthetic */ Video f111397r;

                public /* synthetic */ RunnableC22797t(long j112, Video video2) {
                    r2 = j112;
                    r4 = video2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChannelView.C10155i.m54101h(ChannelView.this, r2, r4);
                }
            });
        }

        @Override // e10.InterfaceC18175l
        /* renamed from: c */
        public void mo54106c(long j11, int i11) {
            AbstractC19444a.m101697e(new Runnable() { // from class: m20.u

                /* renamed from: q */
                public final /* synthetic */ long f111403q;

                /* renamed from: r */
                public final /* synthetic */ int f111404r;

                public /* synthetic */ RunnableC22801u(long j112, int i112) {
                    r2 = j112;
                    r4 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChannelView.C10155i.m54103j(ChannelView.this, r2, r4);
                }
            });
        }

        @Override // e10.InterfaceC18175l
        /* renamed from: d */
        public void mo54107d(List list) {
            List m131225y0;
            int m131511r;
            AbstractC19074t.m100208f(list, "list");
            C31164g c31164g = ChannelView.this.f52590H0;
            if (c31164g != null) {
                m131225y0 = AbstractC25332a0.m131225y0(list);
                List list2 = m131225y0;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C31164g.e((C18174k) it.next()));
                }
                c31164g.m151611m0(new ArrayList(arrayList));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$i0 */
    /* loaded from: classes5.dex */
    public static final class C10156i0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$i0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelView f52625q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChannelView channelView) {
                super(0);
                this.f52625q = channelView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54109a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54109a() {
                InterfaceC10054b.a.m53671a(this.f52625q.f52584B0, false, false, false, 6, null);
                ChannelView.m53998JL(this.f52625q, false, false, 2, null);
            }
        }

        C10156i0() {
            super(1);
        }

        /* renamed from: a */
        public final void m54108a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new a(ChannelView.this));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, ChannelView.this.m53996HL(), null, 2, null);
            ChannelView.this.m53997IL(false, false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54108a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$j */
    /* loaded from: classes5.dex */
    public static final class C10157j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10157j f52626q = new C10157j();

        C10157j() {
            super(1);
        }

        /* renamed from: a */
        public final void m54110a(ViewGroup.LayoutParams layoutParams) {
            AbstractC19074t.m100208f(layoutParams, "lp");
            layoutParams.height = 0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54110a((ViewGroup.LayoutParams) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$j0 */
    /* loaded from: classes5.dex */
    public static final class C10158j0 extends AbstractC19075u implements InterfaceC18505l {
        C10158j0() {
            super(1);
        }

        /* renamed from: a */
        public final void m54111a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ChannelView.this.m54072VL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54111a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$k */
    /* loaded from: classes5.dex */
    public static final class C10159k extends AbstractC19075u implements InterfaceC18505l {
        C10159k() {
            super(1);
        }

        /* renamed from: a */
        public final void m54112a(SimilarChannel similarChannel) {
            Map m131401f;
            AbstractC19074t.m100208f(similarChannel, "it");
            if (similarChannel.m51202c() != null) {
                ZchMasterView m55543KK = ChannelView.this.m55543KK();
                if (m55543KK != null) {
                    Bundle m54081d = C10141b.m54081d(ChannelView.Companion, similarChannel.m51202c(), null, 2, null);
                    AbstractC26102d.m134326a(m54081d, "SHOW_WITH_FLAGS", 134217728);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m55543KK.m53825XK(ChannelPageView.class, m54081d);
                }
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_similar_channel_detail);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", similarChannel.m51202c()));
                c19205a.m100713L(m92652XI, m131401f);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54112a((SimilarChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$k0 */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10160k0 extends C19071q implements InterfaceC18494a {
        C10160k0(Object obj) {
            super(0, obj, ChannelView.class, "onUploadPressed", "onUploadPressed()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54113h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m54113h() {
            ((ChannelView) this.f94922q).m54072VL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$l */
    /* loaded from: classes5.dex */
    public static final class C10161l extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$l$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelView f52630q;

            /* renamed from: r */
            final /* synthetic */ String f52631r;

            /* renamed from: s */
            final /* synthetic */ String f52632s;

            /* renamed from: t */
            final /* synthetic */ ConfirmPopupView f52633t;

            /* renamed from: u */
            final /* synthetic */ String f52634u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChannelView channelView, String str, String str2, ConfirmPopupView confirmPopupView, String str3) {
                super(0);
                this.f52630q = channelView;
                this.f52631r = str;
                this.f52632s = str2;
                this.f52633t = confirmPopupView;
                this.f52634u = str3;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54115a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54115a() {
                Map m131401f;
                this.f52630q.f52584B0.mo53062Qk(this.f52631r, this.f52632s, false);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f52633t.m92652XI(AbstractC27413h.zch_action_key_similar_channel_unfollow_confirm);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", this.f52634u));
                c19205a.m100713L(m92652XI, m131401f);
            }
        }

        C10161l() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m54114a((String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54114a(String str, String str2, boolean z11) {
            Map m131401f;
            Map m131401f2;
            if (str == null) {
                return;
            }
            if (!z11) {
                ChannelView.this.f52584B0.mo53062Qk(str, str2, true);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_similar_channel_follow);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
                c19205a.m100713L(m92652XI, m131401f2);
                return;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new a(ChannelView.this, str, str2, m51992b, str));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, ChannelView.this.m53996HL(), null, 2, null);
            C19205a c19205a2 = C19205a.f95429a;
            String m92652XI2 = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_similar_channel_unfollow);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a2.m100713L(m92652XI2, m131401f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$l0 */
    /* loaded from: classes5.dex */
    static final class C10162l0 extends AbstractC19075u implements InterfaceC18509p {
        C10162l0() {
            super(2);
        }

        /* renamed from: a */
        public final void m54116a(SimilarChannel similarChannel, int i11) {
            AbstractC19074t.m100208f(similarChannel, "similarChannel");
            ChannelView.this.f52584B0.mo53065fa(similarChannel, i11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54116a((SimilarChannel) obj, ((Number) obj2).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$m */
    /* loaded from: classes5.dex */
    public static final class C10163m implements ChannelActionBottomSheet.InterfaceC9494a {

        /* renamed from: b */
        final /* synthetic */ ChannelActionBottomSheet f52637b;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$m$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelView f52638q;

            /* renamed from: r */
            final /* synthetic */ ConfirmPopupView f52639r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChannelView channelView, ConfirmPopupView confirmPopupView) {
                super(0);
                this.f52638q = channelView;
                this.f52639r = confirmPopupView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54117a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54117a() {
                String str;
                Map m131401f;
                this.f52638q.f52584B0.mo53069qs(true);
                String m92652XI = this.f52639r.m92652XI(AbstractC27413h.zch_action_key_block_channel);
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                Channel mo53067q = this.f52638q.f52584B0.mo53067q();
                if (mo53067q == null || (str = mo53067q.m50769l()) == null) {
                    str = "";
                }
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
                c19205a.m100713L(m92652XI, m131401f);
            }
        }

        C10163m(ChannelActionBottomSheet channelActionBottomSheet) {
            this.f52637b = channelActionBottomSheet;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: a */
        public List mo51845a() {
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                return mo53067q.m50756e();
            }
            return null;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: c */
        public void mo51846c() {
            String str;
            Map m131401f;
            ChannelView.this.m54071UL();
            String m92652XI = this.f52637b.m92652XI(AbstractC27413h.zch_action_key_channel_bts_share);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q == null || (str = mo53067q.m50769l()) == null) {
                str = "";
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: d */
        public void mo51847d(String str) {
            String str2;
            Map m131401f;
            InterfaceC25792a interfaceC25792a;
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                ChannelActionBottomSheet channelActionBottomSheet = this.f52637b;
                ChannelView channelView = ChannelView.this;
                if (str == null) {
                    str = mo53067q.m50784u();
                }
                String str3 = str;
                if (str3 != null && (interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(channelActionBottomSheet.getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class))) != null) {
                    InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, channelActionBottomSheet.m92676n2(), str3, channelView, null, null, null, null, 480, null);
                }
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = this.f52637b.m92652XI(AbstractC27413h.zch_action_key_channel_bts_report);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            Channel mo53067q2 = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q2 == null || (str2 = mo53067q2.m50769l()) == null) {
                str2 = "";
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str2));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: e */
        public void mo51848e() {
            String str;
            Map m131401f;
            ChannelView.this.f52584B0.mo53069qs(false);
            String m92652XI = this.f52637b.m92652XI(AbstractC27413h.zch_action_key_unblock_channel);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q == null || (str = mo53067q.m50769l()) == null) {
                str = "";
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: f */
        public void mo51849f() {
            String str;
            Map m131401f;
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_block_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_block_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_block_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_block_channel_negative), null, true, false, 80, null);
            m51992b.m51991lL(new a(ChannelView.this, m51992b));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, ChannelView.this.m53996HL(), null, 2, null);
            String m92652XI = this.f52637b.m92652XI(AbstractC27413h.zch_action_key_channel_icon_block);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q == null || (str = mo53067q.m50769l()) == null) {
                str = "";
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: g */
        public void mo51850g() {
            this.f52637b.m55551QK(new EditProfileView());
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ChannelActionBottomSheet.InterfaceC9494a
        /* renamed from: h */
        public void mo51851h(String str) {
            InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(this.f52637b.getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
            if (interfaceC25792a != null) {
                InterfaceC27218a m92676n2 = this.f52637b.m92676n2();
                if (str == null) {
                    Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
                    if (mo53067q != null) {
                        str = mo53067q.m50790y();
                    } else {
                        str = null;
                    }
                }
                InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2, str, ChannelView.this, null, null, null, null, 480, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$n */
    /* loaded from: classes5.dex */
    public static final class C10164n implements ShareBottomSheet.InterfaceC9516a {
        C10164n() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: a */
        public void mo51915a(boolean z11) {
            ChannelView.this.m54002NL("zalo_message");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: b */
        public void mo51916b() {
            ChannelView.this.m54002NL("other");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: c */
        public void mo51917c(boolean z11) {
            ChannelView.this.m54002NL("zalo_feed");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: d */
        public void mo51918d() {
            ChannelView.this.m54002NL("copy_link");
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$o */
    /* loaded from: classes5.dex */
    static final class C10165o extends AbstractC19075u implements InterfaceC18505l {
        C10165o() {
            super(1);
        }

        /* renamed from: a */
        public final void m54118a(View view) {
            String m50728H;
            AbstractC19074t.m100208f(view, "it");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null && (m50728H = mo53067q.m50728H()) != null) {
                ChannelView channelView = ChannelView.this;
                InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(channelView.getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
                if (interfaceC25792a != null) {
                    InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, channelView.m92676n2(), m50728H, channelView, null, null, null, null, 480, null);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54118a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$p */
    /* loaded from: classes5.dex */
    static final class C10166p extends AbstractC19075u implements InterfaceC18505l {
        C10166p() {
            super(1);
        }

        /* renamed from: a */
        public final void m54119a(View view) {
            String str;
            Map m131401f;
            AbstractC19074t.m100208f(view, "it");
            ChannelView.this.m54071UL();
            String m92652XI = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_channel_icon_share);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q == null || (str = mo53067q.m50769l()) == null) {
                str = "";
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54119a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$q */
    /* loaded from: classes5.dex */
    static final class C10167q extends AbstractC19075u implements InterfaceC18505l {
        C10167q() {
            super(1);
        }

        /* renamed from: a */
        public final void m54120a(View view) {
            List m50771m;
            Object m131206f0;
            AbstractC19074t.m100208f(view, "it");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null && (m50771m = mo53067q.m50771m()) != null) {
                m131206f0 = AbstractC25332a0.m131206f0(m50771m);
                LivestreamData livestreamData = (LivestreamData) m131206f0;
                if (livestreamData != null) {
                    ChannelView.this.m55551QK(LivestreamPageView.Companion.m54488a("4", livestreamData));
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54120a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$r */
    /* loaded from: classes5.dex */
    public static final class C10168r implements C31158d.a {

        /* renamed from: b */
        final /* synthetic */ C24989b1 f52649b;

        /* renamed from: c */
        final /* synthetic */ OverScrollableRecyclerView f52650c;

        C10168r(C24989b1 c24989b1, OverScrollableRecyclerView overScrollableRecyclerView) {
            this.f52649b = c24989b1;
            this.f52650c = overScrollableRecyclerView;
        }

        @Override // z10.C31158d.a
        /* renamed from: c */
        public void mo54121c(CtaItem ctaItem) {
            InterfaceC25792a interfaceC25792a;
            AbstractC19074t.m100208f(ctaItem, "item");
            FloatingManager.Companion.m53859a(ChannelView.this.f52584B0.mo53067q());
            OverScrollableRefreshBar overScrollableRefreshBar = this.f52649b.f119783s;
            AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
            if (!AbstractC26112n.m134380U(overScrollableRefreshBar) && (interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(this.f52650c.getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class))) != null) {
                InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, ChannelView.this.m92676n2(), ctaItem.m50908b(), ChannelView.this, null, null, null, null, 480, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$s */
    /* loaded from: classes5.dex */
    public static final class C10169s extends RecyclerView.AbstractC1887n {
        C10169s() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            if (recyclerView.m9817A0(view) == 0) {
                rect.left = AbstractC26112n.m134433y(view, AbstractC27407b.zch_page_padding);
            } else {
                rect.left = AbstractC26112n.m134433y(view, AbstractC27407b.zch_layout_channel_padding_cta_item);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$t */
    /* loaded from: classes5.dex */
    static final class C10170t extends AbstractC19075u implements InterfaceC18505l {
        C10170t() {
            super(1);
        }

        /* renamed from: a */
        public final void m54122a(boolean z11) {
            String m92652XI;
            List arrayList;
            Map m131407l;
            if (!z11) {
                ChannelView.this.f52604V0.m149319g();
                m92652XI = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_profile_channel_similar_expand);
            } else {
                m92652XI = ChannelView.this.m92652XI(AbstractC27413h.zch_action_key_profile_channel_similar_collapse);
            }
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            C24860q[] c24860qArr = new C24860q[2];
            c24860qArr[0] = AbstractC24866w.m129235a("channel_uid", ChannelView.this.f52584B0.mo53063dp());
            C31175l0 c31175l0 = ChannelView.this.f52593K0;
            if (c31175l0 == null || (arrayList = c31175l0.m151774O()) == null) {
                arrayList = new ArrayList();
            }
            c24860qArr[1] = AbstractC24866w.m129235a("suggested_channel_uid", arrayList);
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
            c19205a.m100713L(m92652XI, m131407l);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54122a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$u */
    /* loaded from: classes5.dex */
    public static final class C10171u implements C31164g.b {

        /* renamed from: b */
        final /* synthetic */ C31164g f52653b;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$u$a */
        /* loaded from: classes5.dex */
        public static final class a implements UploadActionBottomSheet.InterfaceC9524a {

            /* renamed from: a */
            final /* synthetic */ C18174k f52654a;

            /* renamed from: b */
            final /* synthetic */ UploadActionBottomSheet f52655b;

            /* renamed from: c */
            final /* synthetic */ C31164g f52656c;

            /* renamed from: d */
            final /* synthetic */ ChannelView f52657d;

            a(C18174k c18174k, UploadActionBottomSheet uploadActionBottomSheet, C31164g c31164g, ChannelView channelView) {
                this.f52654a = c18174k;
                this.f52655b = uploadActionBottomSheet;
                this.f52656c = c31164g;
                this.f52657d = channelView;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.UploadActionBottomSheet.InterfaceC9524a
            /* renamed from: a */
            public void mo51939a() {
                Bundle m7341b = AbstractC1438d.m7341b(AbstractC24866w.m129235a("EXTRA_VIDEO_INFO", this.f52654a.m96906f()), AbstractC24866w.m129235a("xTaskId", Long.valueOf(this.f52654a.m96902b())), AbstractC24866w.m129235a("SHOW_WITH_FLAGS", 16777216));
                ZchMasterView m55543KK = this.f52655b.m55543KK();
                if (m55543KK != null) {
                    m55543KK.m53825XK(UploadView.class, m7341b);
                }
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f52655b.m92652XI(AbstractC27413h.zch_action_key_post_video_retry);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.UploadActionBottomSheet.InterfaceC9524a
            /* renamed from: b */
            public void mo51940b() {
                C18173j.Companion.m96886b().m96880G(this.f52654a);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f52655b.m92652XI(AbstractC27413h.zch_action_key_post_video_delete);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                C31164g.m151592Z(this.f52656c, this.f52654a.m96902b(), null, 2, null);
                this.f52657d.m54045oM();
            }
        }

        C10171u(C31164g c31164g) {
            this.f52653b = c31164g;
        }

        @Override // z10.C31164g.b
        /* renamed from: a */
        public void mo54123a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
            ChannelView.this.f52584B0.mo53068q1(loadMoreInfo);
        }

        @Override // z10.C31164g.b
        /* renamed from: b */
        public void mo54124b(C18174k c18174k) {
            AbstractC19074t.m100208f(c18174k, "task");
            boolean z11 = true;
            UploadActionBottomSheet m51941a = UploadActionBottomSheet.Companion.m51941a(true, true);
            ChannelView channelView = ChannelView.this;
            m51941a.m51938mL(new a(c18174k, m51941a, this.f52653b, channelView));
            ChannelPageView m53995GL = channelView.m53995GL();
            if (m53995GL == null || !m53995GL.m53972WK()) {
                z11 = false;
            }
            m51941a.m51757bL(z11);
            BaseBottomSheetView.m51747hL(m51941a, ChannelView.this.m53996HL(), null, 2, null);
        }

        @Override // z10.C31164g.b
        /* renamed from: c */
        public void mo54125c(Section section, int i11) {
            AbstractC19074t.m100208f(section, "section");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                ChannelView channelView = ChannelView.this;
                channelView.m55551QK(VideoPageView.Companion.m55415k(mo53067q.m50769l(), section, i11, channelView.f52585C0));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$v */
    /* loaded from: classes5.dex */
    static final class C10172v extends AbstractC19075u implements InterfaceC18505l {
        C10172v() {
            super(1);
        }

        /* renamed from: a */
        public final void m54126a(String str) {
            String str2;
            AbstractC19074t.m100208f(str, "id");
            Channel mo53067q = ChannelView.this.f52584B0.mo53067q();
            if (mo53067q != null) {
                str2 = mo53067q.m50769l();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str2, str)) {
                ChannelView.this.f52584B0.mo53060Nr();
                ChannelView.this.f52594L0 = true;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54126a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$w */
    /* loaded from: classes5.dex */
    public static final class C10173w implements OverScrollableRecyclerView.InterfaceC10831b {

        /* renamed from: b */
        final /* synthetic */ C24989b1 f52660b;

        C10173w(C24989b1 c24989b1) {
            this.f52660b = c24989b1;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10831b
        /* renamed from: a */
        public void mo54127a(float f11, int i11) {
            if ((ChannelView.this.m92650VI() instanceof ChannelPageView) && this.f52660b.f119783s.m56228c(f11, i11)) {
                ChannelView.this.f52584B0.mo53060Nr();
                ChannelView.this.f52594L0 = true;
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$x */
    /* loaded from: classes5.dex */
    public static final class C10174x implements OverScrollableRecyclerView.InterfaceC10832c {
        C10174x() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31164g c31164g = ChannelView.this.f52590H0;
            if (c31164g != null) {
                c31164g.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$y */
    /* loaded from: classes5.dex */
    public static final class C10175y extends RecyclerView.AbstractC1892s {

        /* renamed from: b */
        final /* synthetic */ OverScrollableRecyclerView f52663b;

        C10175y(OverScrollableRecyclerView overScrollableRecyclerView) {
            this.f52663b = overScrollableRecyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            ChannelView.this.m54060xL(this.f52663b.computeVerticalScrollOffset() - this.f52663b.getOffsetY());
            ChannelView.this.m54053sM();
            if (i12 != 0) {
                ChannelView.this.m54051rM();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelView$z */
    /* loaded from: classes5.dex */
    public static final class C10176z implements OverScrollableRecyclerView.InterfaceC10830a {

        /* renamed from: b */
        final /* synthetic */ OverScrollableRecyclerView f52665b;

        C10176z(OverScrollableRecyclerView overScrollableRecyclerView) {
            this.f52665b = overScrollableRecyclerView;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            ChannelView.this.m54060xL(this.f52665b.computeVerticalScrollOffset() - this.f52665b.getOffsetY());
        }
    }

    public ChannelView() {
        super(C10139a.f52605y);
        this.f52584B0 = AbstractC28684a.Companion.m143682p();
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f52585C0 = uuid;
        this.f52586D0 = new Handler(Looper.getMainLooper());
        this.f52602T0 = "";
        this.f52603U0 = new Runnable() { // from class: m20.p
            public /* synthetic */ RunnableC22781p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChannelView.m53990BL(ChannelView.this);
            }
        };
        this.f52604V0 = new C30262e(new C10162l0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0047, code lost:            r2 = on0.AbstractC24340u.m127109o(r2);     */
    /* renamed from: AL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final LinearLayout m53989AL(Stats stats) {
        long j11;
        Long m127109o;
        C25015i m129842c = C25015i.m129842c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m129842c, "inflate(...)");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        m129842c.getRoot().setLayoutParams(layoutParams);
        m129842c.f119954r.setText(stats.m51214a());
        m129842c.f119954r.setTag(stats.m51215b());
        m129842c.f119954r.setOnClickListener(new ViewOnClickListenerC22757j(this));
        SimpleShadowTextView simpleShadowTextView = m129842c.f119953q;
        String m51216c = stats.m51216c();
        if (m51216c != null && m127109o != null) {
            j11 = m127109o.longValue();
        } else {
            j11 = 0;
        }
        simpleShadowTextView.setText(AbstractC26105g.m134334a(j11));
        m129842c.f119953q.setTag(stats.m51215b());
        m129842c.f119953q.setSelected(true);
        m129842c.f119953q.setOnClickListener(new ViewOnClickListenerC22757j(this));
        LinearLayout root = m129842c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: BL */
    public static final void m53990BL(ChannelView channelView) {
        AbstractC19074t.m100208f(channelView, "this$0");
        if (!channelView.mo60294yp()) {
            channelView.m54017aM(false);
        }
    }

    /* renamed from: CL */
    public static final void m53991CL(ChannelView channelView) {
        OverScrollableRecyclerView overScrollableRecyclerView;
        AbstractC19074t.m100208f(channelView, "this$0");
        C24989b1 c24989b1 = (C24989b1) channelView.m55556SK();
        if (c24989b1 != null && (overScrollableRecyclerView = c24989b1.f119764D) != null) {
            overScrollableRecyclerView.m9837K1(0);
        }
    }

    /* renamed from: DL */
    public static final void m53992DL(C24989b1 c24989b1) {
        AbstractC19074t.m100208f(c24989b1, "$binding");
        RecyclerView.AbstractC1888o layoutManager = c24989b1.f119770J.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo9756v1(0);
        }
    }

    /* renamed from: EL */
    public static final void m53993EL(ChannelView channelView, View view) {
        AbstractC19074t.m100208f(channelView, "this$0");
        channelView.m54023dM();
        m54000LL(channelView, false, 1, null);
    }

    /* renamed from: FL */
    private final void m53994FL() {
        C24989b1 c24989b1;
        C31175l0 c31175l0 = this.f52593K0;
        if (c31175l0 != null && (c24989b1 = (C24989b1) m55556SK()) != null && c31175l0.mo10003k() > 0) {
            if (c24989b1.f119771K.getTag() == null || AbstractC19074t.m100204b(c24989b1.f119771K.getTag(), "collapse")) {
                c24989b1.f119765E.m55627j();
            }
        }
    }

    /* renamed from: GL */
    public final ChannelPageView m53995GL() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ChannelPageView) {
            return (ChannelPageView) m92650VI;
        }
        return null;
    }

    /* renamed from: HL */
    public final C17487o0 m53996HL() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ChannelPageView) {
            return ((ChannelPageView) m92650VI).m53970UK();
        }
        if (m92650VI instanceof ChannelBottomSheet) {
            C17487o0 m92693xK = ((ChannelBottomSheet) m92650VI).m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            return m92693xK;
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* renamed from: IL */
    public final void m53997IL(boolean z11, boolean z12) {
        int i11;
        Map m131407l;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q == null) {
            return;
        }
        if (z11) {
            i11 = AbstractC27413h.zch_action_key_profile_follow_channel;
        } else if (z12) {
            i11 = AbstractC27413h.zch_action_key_profile_unfollow_confirm;
        } else {
            i11 = AbstractC27413h.zch_action_key_profile_unfollow_channel;
        }
        String m92652XI = m92652XI(i11);
        C19205a c19205a = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI);
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(mo53067q.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(mo53067q.m50777p())), AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()));
        c19205a.m100713L(m92652XI, m131407l);
    }

    /* renamed from: JL */
    static /* synthetic */ void m53998JL(ChannelView channelView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        channelView.m53997IL(z11, z12);
    }

    /* renamed from: KL */
    private final void m53999KL(boolean z11) {
        C31164g c31164g;
        String m151595V;
        Map m131407l;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q != null && (c31164g = this.f52590H0) != null && (m151595V = c31164g.m151595V()) != null) {
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_profile_just_watched_press);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(mo53067q.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(mo53067q.m50777p())), AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()), AbstractC24866w.m129235a("video_id", m151595V), AbstractC24866w.m129235a("is_call_api", Integer.valueOf(z11 ? 1 : 0)));
            c19205a.m100713L(m92652XI, m131407l);
        }
    }

    /* renamed from: LL */
    static /* synthetic */ void m54000LL(ChannelView channelView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        channelView.m53999KL(z11);
    }

    /* renamed from: ML */
    private final void m54001ML(boolean z11) {
        C31164g c31164g;
        String m151595V;
        Map m131407l;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q != null && (c31164g = this.f52590H0) != null && (m151595V = c31164g.m151595V()) != null) {
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_profile_just_watched_result);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()), AbstractC24866w.m129235a("video_id", m151595V), AbstractC24866w.m129235a("status", Integer.valueOf(z11 ? 1 : 0)));
            c19205a.m100713L(m92652XI, m131407l);
        }
    }

    /* renamed from: NL */
    public final void m54002NL(String str) {
        Map m131407l;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q == null) {
            return;
        }
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_share_channel);
        C19205a c19205a = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI);
        C24860q[] c24860qArr = new C24860q[5];
        c24860qArr[0] = AbstractC24866w.m129235a("follow_count", Long.valueOf(mo53067q.m50777p()));
        c24860qArr[1] = AbstractC24866w.m129235a("total_video_count", Long.valueOf(mo53067q.m50782t()));
        String m50787w = mo53067q.m50787w();
        if (m50787w == null) {
            m50787w = "";
        }
        c24860qArr[2] = AbstractC24866w.m129235a("share_url", m50787w);
        c24860qArr[3] = AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l());
        c24860qArr[4] = AbstractC24866w.m129235a("share_to", str);
        m131407l = AbstractC25363p0.m131407l(c24860qArr);
        c19205a.m100713L(m92652XI, m131407l);
    }

    /* renamed from: OL */
    private final void m54003OL() {
        C31164g c31164g;
        String m151595V;
        Map m131407l;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q != null && (c31164g = this.f52590H0) != null && (m151595V = c31164g.m151595V()) != null) {
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_profile_just_watched_show);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()), AbstractC24866w.m129235a("video_id", m151595V));
            c19205a.m100713L(m92652XI, m131407l);
        }
    }

    /* renamed from: RL */
    public final void m54004RL(View view) {
        Integer num;
        String str;
        Object tag = view.getTag();
        String str2 = null;
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 8) {
            Channel mo53067q = this.f52584B0.mo53067q();
            if (mo53067q != null) {
                str = mo53067q.m50769l();
            } else {
                str = null;
            }
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                m55551QK(new FollowerListView());
            }
        }
    }

    /* renamed from: WL */
    public static final void m54009WL(C24989b1 c24989b1, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(c24989b1, "$this_run");
        ChannelInfoLayout channelInfoLayout = c24989b1.f119765E;
        AbstractC19074t.m100207e(channelInfoLayout, "lytInfo");
        if (AbstractC26112n.m134380U(channelInfoLayout)) {
            LoadingLayout loadingLayout = c24989b1.f119767G;
            AbstractC19074t.m100207e(loadingLayout, "lytLoading");
            int measuredHeight = c24989b1.f119765E.getMeasuredHeight();
            ChannelInfoLayout channelInfoLayout2 = c24989b1.f119765E;
            AbstractC19074t.m100207e(channelInfoLayout2, "lytInfo");
            AbstractC26112n.m134419q0(loadingLayout, measuredHeight - AbstractC26112n.m134433y(channelInfoLayout2, AbstractC27407b.zch_layout_channel_info_padding_bottom));
        }
        c24989b1.f119764D.m9853S0();
    }

    /* renamed from: XL */
    public static final void m54011XL(EllipsizedTextView ellipsizedTextView, View view) {
        AbstractC19074t.m100208f(ellipsizedTextView, "$this_run");
        if (ellipsizedTextView.getOriginalText() != null || ellipsizedTextView.getMaxLines() > 4) {
            if (ellipsizedTextView.getMaxLines() > 4) {
                ellipsizedTextView.setMaxLines(4);
            } else {
                ellipsizedTextView.setMaxLines(Integer.MAX_VALUE);
                ellipsizedTextView.setText(ellipsizedTextView.getOriginalText());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:            r0 = on0.AbstractC24340u.m127109o(r0);     */
    /* renamed from: YL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m54013YL(Stats stats, View view) {
        TextView textView;
        TextView textView2;
        long j11;
        Long m127109o;
        if (view != null) {
            textView = (TextView) view.findViewById(AbstractC27409d.tvTitleStats);
        } else {
            textView = null;
        }
        if (textView == null || (textView2 = (TextView) view.findViewById(AbstractC27409d.tvNumStats)) == null) {
            return;
        }
        textView.setText(stats.m51214a());
        textView.setTag(stats.m51215b());
        textView.setOnClickListener(new ViewOnClickListenerC22757j(this));
        String m51216c = stats.m51216c();
        if (m51216c != null && m127109o != null) {
            j11 = m127109o.longValue();
        } else {
            j11 = 0;
        }
        textView2.setText(AbstractC26105g.m134334a(j11));
        textView2.setSelected(true);
        textView2.setTag(stats.m51215b());
        textView2.setOnClickListener(new ViewOnClickListenerC22757j(this));
    }

    /* renamed from: ZL */
    private final void m54015ZL(C24989b1 c24989b1) {
        TextView textView;
        int childCount = c24989b1.f119768H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = c24989b1.f119768H.getChildAt(i11);
            if (childAt != null && (textView = (TextView) childAt.findViewById(AbstractC27409d.tvNumStats)) != null) {
                textView.setText("-");
            }
        }
    }

    /* renamed from: aM */
    private final void m54017aM(boolean z11) {
        SuggestFollowLayout suggestFollowLayout;
        SuggestFollowLayout suggestFollowLayout2;
        ViewPropertyAnimator animate;
        SuggestFollowLayout suggestFollowLayout3;
        long j11;
        SuggestFollowLayout suggestFollowLayout4;
        SuggestFollowLayout suggestFollowLayout5;
        Footer m50767k;
        Long m50938b;
        SuggestFollowLayout suggestFollowLayout6;
        ViewPropertyAnimator animate2;
        SuggestFollowLayout suggestFollowLayout7;
        if (z11) {
            C24989b1 c24989b1 = (C24989b1) m55556SK();
            if (c24989b1 != null && (suggestFollowLayout3 = c24989b1.f119790z) != null && AbstractC26112n.m134376Q(suggestFollowLayout3)) {
                C24989b1 c24989b12 = (C24989b1) m55556SK();
                if (c24989b12 != null && (suggestFollowLayout7 = c24989b12.f119790z) != null) {
                    AbstractC26112n.m134431w0(suggestFollowLayout7);
                }
                C24989b1 c24989b13 = (C24989b1) m55556SK();
                if (c24989b13 != null && (suggestFollowLayout6 = c24989b13.f119790z) != null && (animate2 = suggestFollowLayout6.animate()) != null) {
                    animate2.translationY(AbstractC26105g.m134347n(108) * (-1));
                    animate2.setInterpolator(new AccelerateInterpolator());
                    animate2.withEndAction(new Runnable() { // from class: m20.q
                        public /* synthetic */ RunnableC22785q() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChannelView.m54019bM(ChannelView.this);
                        }
                    });
                    animate2.setDuration(100L);
                    animate2.start();
                }
                Channel mo53067q = this.f52584B0.mo53067q();
                if (mo53067q != null && (m50767k = mo53067q.m50767k()) != null && (m50938b = m50767k.m50938b()) != null) {
                    j11 = m50938b.longValue();
                } else {
                    j11 = 5000;
                }
                C24989b1 c24989b14 = (C24989b1) m55556SK();
                if (c24989b14 != null && (suggestFollowLayout5 = c24989b14.f119790z) != null) {
                    suggestFollowLayout5.removeCallbacks(this.f52603U0);
                }
                C24989b1 c24989b15 = (C24989b1) m55556SK();
                if (c24989b15 != null && (suggestFollowLayout4 = c24989b15.f119790z) != null) {
                    suggestFollowLayout4.postDelayed(this.f52603U0, j11);
                    return;
                }
                return;
            }
            return;
        }
        C24989b1 c24989b16 = (C24989b1) m55556SK();
        if (c24989b16 != null && (suggestFollowLayout = c24989b16.f119790z) != null && AbstractC26112n.m134380U(suggestFollowLayout) && !this.f52600R0) {
            this.f52600R0 = true;
            C24989b1 c24989b17 = (C24989b1) m55556SK();
            if (c24989b17 != null && (suggestFollowLayout2 = c24989b17.f119790z) != null && (animate = suggestFollowLayout2.animate()) != null) {
                animate.translationY(0.0f);
                animate.setInterpolator(new AccelerateInterpolator());
                animate.withEndAction(new Runnable() { // from class: m20.r
                    public /* synthetic */ RunnableC22789r() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChannelView.m54021cM(ChannelView.this);
                    }
                });
                animate.setDuration(100L);
                animate.start();
            }
        }
    }

    /* renamed from: bM */
    public static final void m54019bM(ChannelView channelView) {
        C24989b1 c24989b1;
        SuggestFollowLayout suggestFollowLayout;
        AbstractC19074t.m100208f(channelView, "this$0");
        if (!channelView.mo60294yp() && (c24989b1 = (C24989b1) channelView.m55556SK()) != null && (suggestFollowLayout = c24989b1.f119790z) != null) {
            suggestFollowLayout.clearAnimation();
        }
    }

    /* renamed from: cM */
    public static final void m54021cM(ChannelView channelView) {
        SuggestFollowLayout suggestFollowLayout;
        SuggestFollowLayout suggestFollowLayout2;
        SuggestFollowLayout suggestFollowLayout3;
        AbstractC19074t.m100208f(channelView, "this$0");
        if (!channelView.mo60294yp()) {
            C24989b1 c24989b1 = (C24989b1) channelView.m55556SK();
            if (c24989b1 != null && (suggestFollowLayout3 = c24989b1.f119790z) != null) {
                AbstractC26112n.m134367H(suggestFollowLayout3);
            }
            C24989b1 c24989b12 = (C24989b1) channelView.m55556SK();
            if (c24989b12 != null && (suggestFollowLayout2 = c24989b12.f119790z) != null) {
                suggestFollowLayout2.clearAnimation();
            }
            C24989b1 c24989b13 = (C24989b1) channelView.m55556SK();
            if (c24989b13 != null && (suggestFollowLayout = c24989b13.f119790z) != null) {
                suggestFollowLayout.removeCallbacks(channelView.f52603U0);
            }
        }
    }

    /* renamed from: dM */
    private final void m54023dM() {
        C31164g c31164g;
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
        Integer num;
        int m104529e;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 == null || (c31164g = this.f52590H0) == null || (gridLayoutManager = this.f52592J0) == null) {
            return;
        }
        Object tag = c24989b1.f119787w.getTag();
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            int m9745c2 = gridLayoutManager.m9745c2();
            OverScrollableRecyclerView overScrollableRecyclerView = c24989b1.f119764D;
            m104529e = AbstractC20104d.m104529e(((overScrollableRecyclerView.getHeight() / (overScrollableRecyclerView.getWidth() / 2.0f)) - 1) / 2);
            int min = Math.min(c31164g.mo10003k() - 1, intValue + (m104529e * 3));
            if (min - m9745c2 < 50) {
                overScrollableRecyclerView.mo9854S1(min);
            } else {
                overScrollableRecyclerView.m9837K1(min);
            }
            LinearLayout linearLayout = c24989b1.f119787w;
            AbstractC19074t.m100207e(linearLayout, "btnJustWatched");
            AbstractC26112n.m134398g(linearLayout);
            LinearLayout linearLayout2 = c24989b1.f119787w;
            AbstractC19074t.m100207e(linearLayout2, "btnJustWatched");
            AbstractC26112n.m134367H(linearLayout2);
        }
    }

    /* renamed from: eM */
    public final void m54025eM(int i11) {
        int i12;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            int i13 = i11 + 1;
            RecyclerView.AbstractC1880g adapter = c24989b1.f119771K.getAdapter();
            if (adapter != null) {
                i12 = adapter.mo10003k();
            } else {
                i12 = -1;
            }
            if (i13 < i12) {
                c24989b1.f119771K.post(new Runnable() { // from class: m20.s

                    /* renamed from: q */
                    public final /* synthetic */ int f111391q;

                    public /* synthetic */ RunnableC22793s(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChannelView.m54027fM(C24989b1.this, r2);
                    }
                });
            }
        }
    }

    /* renamed from: fM */
    public static final void m54027fM(C24989b1 c24989b1, int i11) {
        AbstractC19074t.m100208f(c24989b1, "$this_run");
        c24989b1.f119771K.m9866X1();
        c24989b1.f119771K.mo9854S1(i11 + 1);
    }

    /* renamed from: gM */
    private final boolean m54029gM(Channel channel) {
        Footer m50767k;
        if (channel == null || channel.m50741Q() || channel.m50739N() || channel.m50767k() == null || (m50767k = channel.m50767k()) == null || !m50767k.isValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: hM */
    private final void m54031hM() {
        SimpleShadowTextView simpleShadowTextView;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null && (simpleShadowTextView = c24989b1.f119784t) != null) {
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_primary);
            simpleShadowTextView.setText(AbstractC27413h.zch_page_channel_follow);
            AbstractC26112n.m134407k0(simpleShadowTextView, new C10152g0());
            Channel mo53067q = this.f52584B0.mo53067q();
            boolean z11 = false;
            if (mo53067q != null && mo53067q.m50739N()) {
                z11 = true;
            }
            this.f52595M0 = !z11;
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }
    }

    /* renamed from: iM */
    private final void m54033iM() {
        SimpleShadowTextView simpleShadowTextView;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null && (simpleShadowTextView = c24989b1.f119784t) != null) {
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_tertiary);
            simpleShadowTextView.setText(AbstractC27413h.zch_page_channel_unblock);
            AbstractC26112n.m134407k0(simpleShadowTextView, new C10154h0());
            Channel mo53067q = this.f52584B0.mo53067q();
            boolean z11 = false;
            if (mo53067q != null && mo53067q.m50739N()) {
                z11 = true;
            }
            this.f52595M0 = !z11;
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }
    }

    /* renamed from: jM */
    private final void m54035jM() {
        SimpleShadowTextView simpleShadowTextView;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null && (simpleShadowTextView = c24989b1.f119784t) != null) {
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_tertiary);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("   ");
            Context context = simpleShadowTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_channel_following));
            simpleShadowTextView.setText(spannableStringBuilder);
            AbstractC26112n.m134407k0(simpleShadowTextView, new C10156i0());
            this.f52595M0 = false;
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }
    }

    /* renamed from: kM */
    private final void m54037kM() {
        SimpleShadowTextView simpleShadowTextView;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null && (simpleShadowTextView = c24989b1.f119784t) != null) {
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_secondary);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("   ");
            Context context = simpleShadowTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            spannableString.setSpan(new C26980a(context, AbstractC23322a.zds_ic_video_added_line_24, AbstractC27406a.zch_icon_secondary), 0, 1, 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_channel_upload));
            simpleShadowTextView.setText(spannableStringBuilder);
            AbstractC26112n.m134407k0(simpleShadowTextView, new C10158j0());
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }
    }

    /* renamed from: lM */
    public final void m54039lM(Channel channel) {
        String str;
        SimpleShadowTextView simpleShadowTextView;
        String m50769l = channel.m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(m50769l, str)) {
            if (channel.m50737M()) {
                ChannelPageView m53995GL = m53995GL();
                if (m53995GL != null) {
                    m53995GL.m53975ZK(true);
                }
                m54037kM();
                return;
            }
            ChannelPageView m53995GL2 = m53995GL();
            if (m53995GL2 != null) {
                m53995GL2.m53975ZK(false);
            }
            C24989b1 c24989b1 = (C24989b1) m55556SK();
            if (c24989b1 != null && (simpleShadowTextView = c24989b1.f119784t) != null) {
                AbstractC26112n.m134367H(simpleShadowTextView);
                return;
            }
            return;
        }
        if (channel.m50739N()) {
            m54033iM();
            this.f52601S0 = Boolean.TRUE;
            return;
        }
        if (channel.m50741Q()) {
            m54035jM();
            m54061yL(channel, false);
            ChannelPageView m53995GL3 = m53995GL();
            if (m53995GL3 != null) {
                m53995GL3.m53973XK(false);
                return;
            }
            return;
        }
        m54031hM();
        m54061yL(channel, false);
        ChannelPageView m53995GL4 = m53995GL();
        if (m53995GL4 != null) {
            m53995GL4.m53973XK(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: mM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m54041mM(Channel channel, boolean z11) {
        LivestreamData livestreamData;
        EnumC24601e enumC24601e;
        String str;
        boolean z12;
        boolean m127128x;
        Channel m51010b;
        Integer num;
        Object m131206f0;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            ChannelInfoLayout channelInfoLayout = c24989b1.f119765E;
            AbstractC19074t.m100207e(channelInfoLayout, "lytInfo");
            AbstractC26112n.m134431w0(channelInfoLayout);
            List m50771m = channel.m50771m();
            Long l11 = null;
            if (m50771m != null) {
                m131206f0 = AbstractC25332a0.m131206f0(m50771m);
                livestreamData = (LivestreamData) m131206f0;
            } else {
                livestreamData = null;
            }
            if (this.f52584B0.mo53071yd()) {
                if (livestreamData != null) {
                    num = Integer.valueOf(livestreamData.m51029q());
                } else {
                    num = null;
                }
                enumC24601e = AbstractC24602f.m128091a(num);
            } else {
                enumC24601e = EnumC24601e.f118372q;
            }
            ChannelLivestreamInfoLayout channelLivestreamInfoLayout = c24989b1.f119766F;
            if (livestreamData != null) {
                str = livestreamData.m51032w();
            } else {
                str = null;
            }
            if (livestreamData != null && (m51010b = livestreamData.m51010b()) != null) {
                l11 = Long.valueOf(m51010b.m50718B());
            }
            channelLivestreamInfoLayout.m55645c(enumC24601e, str, l11);
            c24989b1.f119781q.setAvatar(channel);
            AvatarImageView avatarImageView = c24989b1.f119781q;
            if (this.f52584B0.mo53071yd() && AbstractC2488g.m12571a(livestreamData)) {
                z12 = true;
            } else {
                z12 = false;
            }
            avatarImageView.setChannelLiveStatus(z12);
            c24989b1.f119778R.setText(channel.m50775o());
            if (channel.m50743S()) {
                c24989b1.f119779S.m56267j(channel.m50730I(), channel.m50722D(), AbstractC27406a.zch_text_tertiary);
                c24989b1.f119779S.setVerifiedIcon(channel.m50725F());
                UsernameTextView usernameTextView = c24989b1.f119779S;
                AbstractC19074t.m100207e(usernameTextView, "txtVerify");
                AbstractC26112n.m134431w0(usernameTextView);
            } else {
                UsernameTextView usernameTextView2 = c24989b1.f119779S;
                AbstractC19074t.m100207e(usernameTextView2, "txtVerify");
                AbstractC26112n.m134367H(usernameTextView2);
            }
            String m50755d = channel.m50755d();
            if (m50755d != null) {
                m127128x = AbstractC24341v.m127128x(m50755d);
                if (!m127128x) {
                    c24989b1.f119776P.setMaxLines(4);
                    c24989b1.f119776P.setText(channel.m50755d());
                    EllipsizedTextView ellipsizedTextView = c24989b1.f119776P;
                    AbstractC19074t.m100207e(ellipsizedTextView, "txtBio");
                    AbstractC26112n.m134431w0(ellipsizedTextView);
                    if (!z11) {
                        ChannelPageView m53995GL = m53995GL();
                        if (m53995GL != null) {
                            m53995GL.m53977bL(channel.m50775o(), channel.m50725F());
                            m53995GL.m53974YK(true);
                        }
                        m54047pM(channel.m50791z());
                        m54039lM(channel);
                        return;
                    }
                    return;
                }
            }
            EllipsizedTextView ellipsizedTextView2 = c24989b1.f119776P;
            AbstractC19074t.m100207e(ellipsizedTextView2, "txtBio");
            AbstractC26112n.m134367H(ellipsizedTextView2);
            if (!z11) {
            }
        }
    }

    /* renamed from: nM */
    static /* synthetic */ void m54043nM(ChannelView channelView, Channel channel, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        channelView.m54041mM(channel, z11);
    }

    /* renamed from: oM */
    public final void m54045oM() {
        String str;
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        C31164g c31164g = this.f52590H0;
        if (c31164g != null && c31164g.mo10003k() == 0) {
            Channel mo53067q = this.f52584B0.mo53067q();
            String str2 = null;
            if (mo53067q != null) {
                str = mo53067q.m50769l();
            } else {
                str = null;
            }
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                C24989b1 c24989b1 = (C24989b1) m55556SK();
                if (c24989b1 != null && (loadingLayout2 = c24989b1.f119767G) != null) {
                    LoadingLayout.m55778e(loadingLayout2, null, Integer.valueOf(AbstractC27413h.zch_page_channel_empty_title), Integer.valueOf(AbstractC27413h.zch_page_channel_empty_message), Integer.valueOf(AbstractC27413h.zch_page_channel_empty_action), new C10160k0(this), null, 33, null);
                    return;
                }
                return;
            }
            C24989b1 c24989b12 = (C24989b1) m55556SK();
            if (c24989b12 != null && (loadingLayout = c24989b12.f119767G) != null) {
                LoadingLayout.m55778e(loadingLayout, null, null, Integer.valueOf(AbstractC27413h.zch_page_channel_empty_title), null, null, null, 59, null);
            }
        }
    }

    /* renamed from: pM */
    private final void m54047pM(List list) {
        C24989b1 c24989b1;
        if (list != null && !mo60294yp() && (c24989b1 = (C24989b1) m55556SK()) != null) {
            if (list.size() > 0 && list.size() == c24989b1.f119768H.getChildCount()) {
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    m54013YL((Stats) obj, c24989b1.f119768H.getChildAt(i11));
                    i11 = i12;
                }
                return;
            }
            c24989b1.f119768H.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c24989b1.f119768H.addView(m53989AL((Stats) it.next()));
            }
        }
    }

    /* renamed from: qM */
    private final void m54049qM(boolean z11) {
        String str;
        Map m131401f;
        if (!AbstractC19074t.m100204b(this.f52601S0, Boolean.TRUE) && z11 && this.f52599Q0 && !this.f52598P0) {
            this.f52598P0 = true;
            m54017aM(true);
            C19205a c19205a = C19205a.f95429a;
            Channel mo53067q = this.f52584B0.mo53067q();
            if (mo53067q == null || (str = mo53067q.m50769l()) == null) {
                str = "";
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a.m100713L("show_profile_float_follow", m131401f);
        }
    }

    /* renamed from: rM */
    public final void m54051rM() {
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
        RecyclerView.AbstractC1876c0 abstractC1876c0;
        OverScrollableRecyclerView overScrollableRecyclerView;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q != null && (gridLayoutManager = this.f52592J0) != null) {
            int m9740Y1 = gridLayoutManager.m9740Y1();
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f52592J0;
            if (gridLayoutManager2 != null) {
                Iterator it = new C22537f(m9740Y1, gridLayoutManager2.m9745c2()).iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    C24989b1 c24989b1 = (C24989b1) m55556SK();
                    if (c24989b1 != null && (overScrollableRecyclerView = c24989b1.f119764D) != null) {
                        abstractC1876c0 = overScrollableRecyclerView.m9900t0(mo116552a);
                    } else {
                        abstractC1876c0 = null;
                    }
                    if (abstractC1876c0 instanceof C31164g.f) {
                        ((C31164g.f) abstractC1876c0).m151619l0(mo53067q.m50769l());
                    }
                }
            }
        }
    }

    /* renamed from: sM */
    public final void m54053sM() {
        Integer num;
        C31164g c31164g;
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            LinearLayout linearLayout = c24989b1.f119787w;
            AbstractC19074t.m100207e(linearLayout, "btnJustWatched");
            if (AbstractC26112n.m134376Q(linearLayout)) {
                if (!c24989b1.f119787w.isEnabled() || (c31164g = this.f52590H0) == null || c31164g.mo10003k() <= 0 || (gridLayoutManager = this.f52592J0) == null) {
                    return;
                }
                int m9745c2 = gridLayoutManager.m9745c2();
                String m151595V = c31164g.m151595V();
                AbstractC19074t.m100205c(m151595V);
                int m151597X = c31164g.m151597X(m151595V);
                if (m151597X >= 0) {
                    if (m9745c2 < m151597X) {
                        c24989b1.f119787w.setTag(Integer.valueOf(m151597X));
                        c24989b1.f119787w.setOnClickListener(new View.OnClickListener() { // from class: m20.n
                            public /* synthetic */ ViewOnClickListenerC22773n() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ChannelView.m54055tM(ChannelView.this, view);
                            }
                        });
                    } else {
                        LinearLayout linearLayout2 = c24989b1.f119787w;
                        AbstractC19074t.m100207e(linearLayout2, "btnJustWatched");
                        AbstractC26112n.m134398g(linearLayout2);
                        return;
                    }
                } else if (c31164g.m151596W().m51171p() == null) {
                    LinearLayout linearLayout3 = c24989b1.f119787w;
                    AbstractC19074t.m100207e(linearLayout3, "btnJustWatched");
                    AbstractC26112n.m134398g(linearLayout3);
                    return;
                } else if (c31164g.mo10003k() == m9745c2 + 1) {
                    return;
                } else {
                    c24989b1.f119787w.setOnClickListener(new View.OnClickListener() { // from class: m20.o

                        /* renamed from: q */
                        public final /* synthetic */ ChannelView f111366q;

                        /* renamed from: r */
                        public final /* synthetic */ C31164g f111367r;

                        public /* synthetic */ ViewOnClickListenerC22777o(ChannelView this, C31164g c31164g2) {
                            r2 = this;
                            r3 = c31164g2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ChannelView.m54057uM(C24989b1.this, r2, r3, view);
                        }
                    });
                }
                ImageView imageView = c24989b1.f119761A;
                Context context = c24989b1.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                imageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_double_down_line_24, AbstractC27406a.zch_text_primary_light));
                LinearLayout linearLayout4 = c24989b1.f119787w;
                AbstractC19074t.m100207e(linearLayout4, "btnJustWatched");
                AbstractC26112n.m134431w0(linearLayout4);
                m54003OL();
                return;
            }
            Object tag = c24989b1.f119787w.getTag();
            if (tag instanceof Integer) {
                num = (Integer) tag;
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                OverScrollableRecyclerView.GridLayoutManager gridLayoutManager2 = this.f52592J0;
                if (gridLayoutManager2 != null && gridLayoutManager2.m9745c2() >= intValue) {
                    LinearLayout linearLayout5 = c24989b1.f119787w;
                    AbstractC19074t.m100207e(linearLayout5, "btnJustWatched");
                    AbstractC26112n.m134398g(linearLayout5);
                    LinearLayout linearLayout6 = c24989b1.f119787w;
                    AbstractC19074t.m100207e(linearLayout6, "btnJustWatched");
                    AbstractC26112n.m134367H(linearLayout6);
                }
            }
        }
    }

    /* renamed from: tM */
    public static final void m54055tM(ChannelView channelView, View view) {
        AbstractC19074t.m100208f(channelView, "this$0");
        channelView.m54023dM();
        m54000LL(channelView, false, 1, null);
    }

    /* renamed from: uM */
    public static final void m54057uM(C24989b1 c24989b1, ChannelView channelView, C31164g c31164g, View view) {
        AbstractC19074t.m100208f(c24989b1, "$this_run");
        AbstractC19074t.m100208f(channelView, "this$0");
        AbstractC19074t.m100208f(c31164g, "$adapter");
        ProgressBar progressBar = c24989b1.f119782r;
        AbstractC19074t.m100207e(progressBar, "barJustWatched");
        if (AbstractC26112n.m134379T(progressBar)) {
            ProgressBar progressBar2 = c24989b1.f119782r;
            AbstractC19074t.m100207e(progressBar2, "barJustWatched");
            AbstractC26112n.m134431w0(progressBar2);
            ImageView imageView = c24989b1.f119761A;
            AbstractC19074t.m100207e(imageView, "icoJustWatched");
            AbstractC26112n.m134367H(imageView);
            InterfaceC10054b interfaceC10054b = channelView.f52584B0;
            String m151595V = c31164g.m151595V();
            AbstractC19074t.m100205c(m151595V);
            interfaceC10054b.mo53061Q9(m151595V);
            channelView.m53999KL(true);
        }
    }

    /* renamed from: xL */
    public final void m54060xL(float f11) {
        boolean z11;
        boolean z12;
        Channel mo53067q;
        Map m131407l;
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            try {
                SuggestFollowLayout suggestFollowLayout = c24989b1.f119790z;
                AbstractC19074t.m100207e(suggestFollowLayout, "flSuggestBanner");
                boolean m134380U = AbstractC26112n.m134380U(suggestFollowLayout);
                ChannelInfoLayout channelInfoLayout = c24989b1.f119765E;
                channelInfoLayout.setTranslationY(-f11);
                if (f11 - this.f52596N0 < 0.0f && c24989b1.f119764D.getOffsetY() >= 0.0f && this.f52597O0 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f52596N0 = f11;
                this.f52597O0 = c24989b1.f119764D.getOffsetY();
                if ((-channelInfoLayout.getTranslationY()) > channelInfoLayout.getMeasuredHeight()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ChannelPageView m53995GL = m53995GL();
                if (m53995GL != null) {
                    m53995GL.m53978dL(z12, this.f52595M0);
                }
                m54049qM(z12);
                if (z11 && m134380U) {
                    m54017aM(false);
                }
                if (z12 && this.f52595M0 && (mo53067q = this.f52584B0.mo53067q()) != null && !AbstractC19074t.m100204b(this.f52602T0, mo53067q.m50769l())) {
                    this.f52602T0 = mo53067q.m50769l();
                    C19205a c19205a = C19205a.f95429a;
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(mo53067q.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(mo53067q.m50777p())), AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()));
                    c19205a.m100713L("show_profile_follow_channel_header", m131407l);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: yL */
    private final void m54061yL(Channel channel, boolean z11) {
        SuggestFollowLayout suggestFollowLayout;
        EllipsizedTextView ellipsizedTextView;
        SimpleShadowTextView simpleShadowTextView;
        SimpleShadowTextView simpleShadowTextView2;
        SuggestFollowLayout suggestFollowLayout2;
        Action m50937a;
        String str;
        AvatarImageView avatarImageView;
        this.f52599Q0 = m54029gM(channel);
        String str2 = null;
        if (z11) {
            this.f52598P0 = false;
            this.f52601S0 = null;
        }
        if (this.f52601S0 == null && (channel.m50739N() || channel.m50741Q())) {
            this.f52601S0 = Boolean.TRUE;
        }
        this.f52596N0 = 0.0f;
        this.f52597O0 = 0.0f;
        this.f52600R0 = false;
        if (this.f52599Q0) {
            C24989b1 c24989b1 = (C24989b1) m55556SK();
            if (c24989b1 != null && (avatarImageView = c24989b1.f119769I) != null) {
                avatarImageView.setAvatar(channel);
            }
            C24989b1 c24989b12 = (C24989b1) m55556SK();
            if (c24989b12 != null) {
                ellipsizedTextView = c24989b12.f119775O;
            } else {
                ellipsizedTextView = null;
            }
            if (ellipsizedTextView != null) {
                Footer m50767k = channel.m50767k();
                if (m50767k != null) {
                    str = m50767k.m50939c();
                } else {
                    str = null;
                }
                ellipsizedTextView.setText(str);
            }
            C24989b1 c24989b13 = (C24989b1) m55556SK();
            if (c24989b13 != null) {
                simpleShadowTextView = c24989b13.f119786v;
            } else {
                simpleShadowTextView = null;
            }
            if (simpleShadowTextView != null) {
                Footer m50767k2 = channel.m50767k();
                if (m50767k2 != null && (m50937a = m50767k2.m50937a()) != null) {
                    str2 = m50937a.m50676a();
                }
                simpleShadowTextView.setText(str2);
            }
            C24989b1 c24989b14 = (C24989b1) m55556SK();
            if (c24989b14 != null && (suggestFollowLayout2 = c24989b14.f119790z) != null) {
                AbstractC26112n.m134407k0(suggestFollowLayout2, C10145d.f52610q);
            }
            C24989b1 c24989b15 = (C24989b1) m55556SK();
            if (c24989b15 != null && (simpleShadowTextView2 = c24989b15.f119786v) != null) {
                AbstractC26112n.m134407k0(simpleShadowTextView2, new C10147e());
                return;
            }
            return;
        }
        C24989b1 c24989b16 = (C24989b1) m55556SK();
        if (c24989b16 != null && (suggestFollowLayout = c24989b16.f119790z) != null) {
            AbstractC26112n.m134367H(suggestFollowLayout);
        }
    }

    /* renamed from: zL */
    static /* synthetic */ void m54062zL(ChannelView channelView, Channel channel, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        channelView.m54061yL(channel, z11);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f52584B0);
        this.f52584B0.mo52965Lb(this);
        this.f52584B0.mo52970uo(m92642L3());
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: Fg */
    public void mo54063Fg(Section section, Throwable th2) {
        Object obj;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        ProgressBar progressBar;
        ImageView imageView;
        AbstractC19074t.m100208f(section, "section");
        if (th2 != null) {
            if (th2 instanceof NetworkException) {
                C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_no_connection);
                C24989b1 c24989b1 = (C24989b1) m55556SK();
                if (c24989b1 != null && (imageView = c24989b1.f119761A) != null) {
                    AbstractC26112n.m134431w0(imageView);
                }
                C24989b1 c24989b12 = (C24989b1) m55556SK();
                if (c24989b12 != null && (progressBar = c24989b12.f119782r) != null) {
                    AbstractC26112n.m134367H(progressBar);
                }
            } else {
                C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_unknown_simple);
                C24989b1 c24989b13 = (C24989b1) m55556SK();
                if (c24989b13 != null && (linearLayout5 = c24989b13.f119787w) != null) {
                    AbstractC26112n.m134398g(linearLayout5);
                }
                C24989b1 c24989b14 = (C24989b1) m55556SK();
                if (c24989b14 != null && (linearLayout4 = c24989b14.f119787w) != null) {
                    AbstractC26112n.m134367H(linearLayout4);
                }
            }
            m54001ML(false);
            return;
        }
        mo54074bF(section);
        C24989b1 c24989b15 = (C24989b1) m55556SK();
        if (c24989b15 != null && (linearLayout3 = c24989b15.f119787w) != null) {
            obj = linearLayout3.getTag();
        } else {
            obj = null;
        }
        if (obj != null) {
            m54023dM();
        } else {
            C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_unknown_simple);
            C24989b1 c24989b16 = (C24989b1) m55556SK();
            if (c24989b16 != null && (linearLayout2 = c24989b16.f119787w) != null) {
                AbstractC26112n.m134398g(linearLayout2);
            }
            C24989b1 c24989b17 = (C24989b1) m55556SK();
            if (c24989b17 != null && (linearLayout = c24989b17.f119787w) != null) {
                AbstractC26112n.m134367H(linearLayout);
            }
        }
        m54001ML(true);
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: Ft */
    public void mo54064Ft(Channel channel) {
        InterfaceC10143c interfaceC10143c;
        LoadingLayout loadingLayout;
        String str;
        C24989b1 c24989b1;
        List m131502j;
        List list;
        OverScrollableRecyclerView overScrollableRecyclerView;
        OverScrollableRefreshBar overScrollableRefreshBar;
        OverScrollableRefreshBar overScrollableRefreshBar2;
        AbstractC19074t.m100208f(channel, "channel");
        int i11 = 0;
        String str2 = null;
        if (this.f52594L0) {
            this.f52594L0 = false;
            C24989b1 c24989b12 = (C24989b1) m55556SK();
            if (c24989b12 != null && (overScrollableRefreshBar = c24989b12.f119783s) != null && overScrollableRefreshBar.m56227b()) {
                C24989b1 c24989b13 = (C24989b1) m55556SK();
                if (c24989b13 != null && (overScrollableRefreshBar2 = c24989b13.f119783s) != null) {
                    overScrollableRefreshBar2.m56226a();
                }
            } else {
                m54060xL(0.0f);
                C24989b1 c24989b14 = (C24989b1) m55556SK();
                if (c24989b14 != null && (overScrollableRecyclerView = c24989b14.f119764D) != null) {
                    overScrollableRecyclerView.postDelayed(new Runnable() { // from class: m20.h
                        public /* synthetic */ RunnableC22749h() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChannelView.m53991CL(ChannelView.this);
                        }
                    }, 100L);
                }
            }
        } else {
            InterfaceC1801w m92650VI = m92650VI();
            if (m92650VI instanceof InterfaceC10143c) {
                interfaceC10143c = (InterfaceC10143c) m92650VI;
            } else {
                interfaceC10143c = null;
            }
            if (interfaceC10143c != null && !interfaceC10143c.mo51855E3(new C10153h(channel))) {
                return;
            }
            m54062zL(this, channel, false, 2, null);
            C24989b1 c24989b15 = (C24989b1) m55556SK();
            if (c24989b15 != null && (loadingLayout = c24989b15.f119767G) != null) {
                loadingLayout.m55781c();
            }
        }
        m54043nM(this, channel, false, 2, null);
        C31175l0 c31175l0 = this.f52593K0;
        if (c31175l0 != null) {
            List m50788x = channel.m50788x();
            if (m50788x != null) {
                list = AbstractC25332a0.m131187O0(m50788x);
            } else {
                list = null;
            }
            c31175l0.m151778V(list);
        }
        String m50769l = channel.m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str = m140377a.m50769l();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(m50769l, str) && this.f52588F0 == null) {
            this.f52588F0 = new C10155i();
            C18173j m96886b = C18173j.Companion.m96886b();
            InterfaceC18175l interfaceC18175l = this.f52588F0;
            AbstractC19074t.m100205c(interfaceC18175l);
            m96886b.m96878E(interfaceC18175l);
        }
        C31164g c31164g = this.f52590H0;
        if (c31164g != null) {
            Section m50732J = channel.m50732J();
            if (m50732J == null) {
                m50732J = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
            }
            for (Object obj : m50732J.m51168m()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                ((Video) obj).m52853L0(Integer.valueOf(i11));
                i11 = i12;
            }
            c31164g.m151610l0(m50732J);
            C31164g.m151591T(c31164g, null, 1, null);
            c31164g.m10008p();
            m54045oM();
        }
        C31158d c31158d = this.f52591I0;
        if (c31158d != null) {
            List m50763i = channel.m50763i();
            if (m50763i == null) {
                m131502j = AbstractC25368s.m131502j();
            } else {
                m131502j = new ArrayList();
                for (Object obj2 : m50763i) {
                    if (((CtaItem) obj2).isValid()) {
                        m131502j.add(obj2);
                    }
                }
            }
            C24989b1 c24989b16 = (C24989b1) m55556SK();
            if (c24989b16 != null) {
                if (true ^ m131502j.isEmpty()) {
                    OverScrollableRecyclerView overScrollableRecyclerView2 = c24989b16.f119770J;
                    AbstractC19074t.m100207e(overScrollableRecyclerView2, "rvChannelCta");
                    AbstractC26112n.m134431w0(overScrollableRecyclerView2);
                    c31158d.m151528Q(m131502j);
                    c31158d.m10008p();
                    c24989b16.f119770J.post(new Runnable() { // from class: m20.k
                        public /* synthetic */ RunnableC22761k() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChannelView.m53992DL(C24989b1.this);
                        }
                    });
                } else {
                    OverScrollableRecyclerView overScrollableRecyclerView3 = c24989b16.f119770J;
                    AbstractC19074t.m100207e(overScrollableRecyclerView3, "rvChannelCta");
                    AbstractC26112n.m134367H(overScrollableRecyclerView3);
                }
            }
        }
        C31175l0 c31175l02 = this.f52593K0;
        if (c31175l02 != null && (c24989b1 = (C24989b1) m55556SK()) != null) {
            List m50788x2 = channel.m50788x();
            if (m50788x2 == null) {
                m50788x2 = new ArrayList();
            }
            String m50769l2 = channel.m50769l();
            Channel m140377a2 = C27417l.f129055a.m140377a();
            if (m140377a2 != null) {
                str2 = m140377a2.m50769l();
            }
            boolean m100204b = AbstractC19074t.m100204b(m50769l2, str2);
            if (m50788x2.size() > 0 && !m100204b) {
                FrameLayout frameLayout = c24989b1.f119789y;
                AbstractC19074t.m100207e(frameLayout, "flExpand");
                AbstractC26112n.m134431w0(frameLayout);
                c31175l02.m151778V(m50788x2);
                c31175l02.m10008p();
            } else {
                FrameLayout frameLayout2 = c24989b1.f119789y;
                AbstractC19074t.m100207e(frameLayout2, "flExpand");
                AbstractC26112n.m134367H(frameLayout2);
                SimpleShadowTextView simpleShadowTextView = c24989b1.f119772L;
                AbstractC19074t.m100207e(simpleShadowTextView, "tvSimilarVideo");
                AbstractC26112n.m134367H(simpleShadowTextView);
                if (c24989b1.f119771K.getLayoutParams().height != 0) {
                    OverScrollableRecyclerView overScrollableRecyclerView4 = c24989b1.f119771K;
                    AbstractC19074t.m100207e(overScrollableRecyclerView4, "rvSimilarVideo");
                    AbstractC26112n.m134394e(overScrollableRecyclerView4, C10157j.f52626q);
                }
            }
            c31175l02.m151780X(new C10159k());
            c31175l02.m151779W(new C10161l());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        InterfaceC18175l interfaceC18175l = this.f52588F0;
        if (interfaceC18175l != null) {
            C18173j.Companion.m96886b().m96881p(interfaceC18175l);
        }
        this.f52586D0.removeCallbacksAndMessages(null);
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f52589G0;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
        ChannelReceiver channelReceiver = this.f52587E0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            c24989b1.f119790z.removeCallbacks(this.f52603U0);
            c24989b1.f119771K.m9821B1(this.f52604V0);
            c24989b1.f119766F.m55644b();
        }
        this.f52584B0.release();
        super.mo37484JJ();
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: Jc */
    public void mo54065Jc(boolean z11, Object obj, boolean z12) {
        Throwable th2;
        int i11;
        Map m131401f;
        AbstractC19074t.m100208f(obj, "result");
        if (obj instanceof PersonalizeChannel) {
            Channel mo53067q = this.f52584B0.mo53067q();
            if (mo53067q != null) {
                C25097t c25097t = C25097t.f120556a;
                Context context = getContext();
                if (z11) {
                    i11 = AbstractC27413h.zch_page_channel_block_success;
                } else {
                    i11 = AbstractC27413h.zch_page_channel_unblock_success;
                }
                c25097t.m130154o(context, m92653YI(i11, mo53067q.m50775o()));
                if (z12) {
                    C19205a c19205a = C19205a.f95429a;
                    m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 0));
                    c19205a.m100713L("profile_float_follow_result", m131401f);
                    return;
                }
                return;
            }
            return;
        }
        C25097t c25097t2 = C25097t.f120556a;
        Context context2 = getContext();
        if (obj instanceof Throwable) {
            th2 = (Throwable) obj;
        } else {
            th2 = null;
        }
        if (th2 == null) {
            return;
        }
        c25097t2.m130155r(context2, th2);
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: O4 */
    public void mo54066O4(Object obj, String str, boolean z11) {
        String m92652XI;
        Map m131401f;
        String m92652XI2;
        Map m131401f2;
        int i11;
        AbstractC19074t.m100208f(obj, "result");
        if (obj instanceof PersonalizeChannel) {
            if (str != null && str.length() != 0) {
                C25097t c25097t = C25097t.f120556a;
                Context context = getContext();
                if (z11) {
                    i11 = AbstractC27413h.zch_page_channel_follow_success;
                } else {
                    i11 = AbstractC27413h.zch_page_channel_unfollow_success;
                }
                c25097t.m130154o(context, m92653YI(i11, str));
            }
            if (this.f52593K0 != null) {
                if (z11) {
                    m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_similar_channel_follow_result);
                } else {
                    m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_similar_channel_unfollow_result);
                }
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI2);
                m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", "1"));
                c19205a.m100713L(m92652XI2, m131401f2);
                return;
            }
            return;
        }
        if (obj instanceof Throwable) {
            if (obj instanceof LimitationReachedException) {
                C25097t.f120556a.m130154o(getContext(), ((LimitationReachedException) obj).getMessage());
            } else {
                C25097t.f120556a.m130155r(getContext(), (Throwable) obj);
            }
            if (z11) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_similar_channel_follow_result);
            } else {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_similar_channel_unfollow_result);
            }
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", "0"));
            c19205a2.m100713L(m92652XI, m131401f);
        }
    }

    /* renamed from: PL */
    public final void m54067PL() {
        C24989b1 c24989b1;
        if (this.f52584B0.mo53067q() == null && (c24989b1 = (C24989b1) m55556SK()) != null) {
            c24989b1.f119767G.m55786j();
            c24989b1.f119765E.m55626i();
            C31175l0 c31175l0 = this.f52593K0;
            if (c31175l0 != null) {
                c31175l0.m151778V(null);
            }
            this.f52584B0.mo53060Nr();
        }
    }

    /* renamed from: QL */
    public final boolean m54068QL(Channel channel, String str) {
        OverScrollableRecyclerView overScrollableRecyclerView;
        AbstractC19074t.m100208f(channel, "channel");
        AbstractC19074t.m100208f(str, "justWatchedId");
        if (AbstractC19074t.m100204b(this.f52584B0.mo53063dp(), channel.m50769l())) {
            return false;
        }
        m54062zL(this, channel, false, 2, null);
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            m54015ZL(c24989b1);
            UsernameTextView usernameTextView = c24989b1.f119779S;
            AbstractC19074t.m100207e(usernameTextView, "txtVerify");
            AbstractC26112n.m134367H(usernameTextView);
            EllipsizedTextView ellipsizedTextView = c24989b1.f119776P;
            AbstractC19074t.m100207e(ellipsizedTextView, "txtBio");
            AbstractC26112n.m134367H(ellipsizedTextView);
            SimpleShadowTextView simpleShadowTextView = c24989b1.f119784t;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnAction");
            AbstractC26112n.m134367H(simpleShadowTextView);
            m54041mM(channel, false);
            if (c24989b1.f119783s.m56227b()) {
                c24989b1.f119783s.m56226a();
            }
            c24989b1.f119767G.m55781c();
            c24989b1.f119767G.m55780b();
            c24989b1.f119787w.setTag(null);
            LinearLayout linearLayout = c24989b1.f119787w;
            AbstractC19074t.m100207e(linearLayout, "btnJustWatched");
            AbstractC26112n.m134416p(linearLayout);
            LinearLayout linearLayout2 = c24989b1.f119787w;
            AbstractC19074t.m100207e(linearLayout2, "btnJustWatched");
            AbstractC26112n.m134367H(linearLayout2);
            ImageView imageView = c24989b1.f119761A;
            AbstractC19074t.m100207e(imageView, "icoJustWatched");
            AbstractC26112n.m134431w0(imageView);
            ProgressBar progressBar = c24989b1.f119782r;
            AbstractC19074t.m100207e(progressBar, "barJustWatched");
            AbstractC26112n.m134367H(progressBar);
        }
        C31164g c31164g = this.f52590H0;
        if (c31164g != null) {
            c31164g.m151609k0(str);
            c31164g.m151611m0(new ArrayList());
            c31164g.m151610l0(new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null));
            C31164g.m151591T(c31164g, null, 1, null);
            c31164g.m10008p();
            C24989b1 c24989b12 = (C24989b1) m55556SK();
            if (c24989b12 != null && (overScrollableRecyclerView = c24989b12.f119764D) != null) {
                AbstractC19074t.m100205c(overScrollableRecyclerView);
                c31164g.m151607i0(overScrollableRecyclerView);
            }
        }
        this.f52584B0.mo52970uo(Companion.m54083b(channel, str));
        InterfaceC18175l interfaceC18175l = this.f52588F0;
        if (interfaceC18175l != null) {
            C18173j.Companion.m96886b().m96881p(interfaceC18175l);
        }
        this.f52588F0 = null;
        return true;
    }

    /* renamed from: SL */
    public final void m54069SL(boolean z11) {
        Map m131407l;
        Map m131407l2;
        this.f52584B0.mo53064fD(true, z11, true);
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q == null) {
            return;
        }
        if (!z11) {
            C19205a c19205a = C19205a.f95429a;
            m131407l2 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(mo53067q.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(mo53067q.m50777p())), AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()));
            c19205a.m100713L("profile_follow_channel_header", m131407l2);
        } else {
            C19205a c19205a2 = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(mo53067q.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(mo53067q.m50777p())), AbstractC24866w.m129235a("channel_uid", mo53067q.m50769l()));
            c19205a2.m100713L("profile_float_follow", m131407l);
        }
    }

    /* renamed from: TL */
    public final void m54070TL() {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str2;
        boolean z17;
        boolean z18;
        boolean z19;
        String str3;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        C27417l c27417l = C27417l.f129055a;
        boolean m51243p = c27417l.m140378b().m51243p();
        Channel mo53067q = this.f52584B0.mo53067q();
        boolean z28 = true;
        if (mo53067q != null) {
            String m50769l = mo53067q.m50769l();
            Channel m140377a = c27417l.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(m50769l, str2)) {
                if (mo53067q.m50787w() != null && m51243p) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (mo53067q.m50790y() != null) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z21 = !mo53067q.m50773n();
                str3 = "1";
                z22 = false;
                z19 = false;
                z23 = z27;
                z24 = z26;
                z25 = false;
            } else {
                if (mo53067q.m50787w() != null && m51243p) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z29 = !mo53067q.m50739N();
                boolean m50739N = mo53067q.m50739N();
                String m50784u = mo53067q.m50784u();
                if (m50784u != null && m50784u.length() != 0) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                z19 = m50739N;
                str3 = "2";
                z21 = false;
                z22 = !z18;
                z23 = false;
                z24 = z17;
                z25 = z29;
            }
            z12 = z25;
            z11 = z24;
            z15 = z23;
            z14 = z22;
            z16 = z21;
            z13 = z19;
            str = str3;
        } else {
            z11 = m51243p;
            str = null;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
        }
        ChannelActionBottomSheet m51852a = ChannelActionBottomSheet.Companion.m51852a(z11, z12, z13, z14, z15, z16, str);
        m51852a.m51832kL(new C10163m(m51852a));
        ChannelPageView m53995GL = m53995GL();
        if (m53995GL == null || !m53995GL.m53972WK()) {
            z28 = false;
        }
        m51852a.m51757bL(z28);
        BaseBottomSheetView.m51747hL(m51852a, m53996HL(), null, 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        OverScrollableRecyclerView overScrollableRecyclerView;
        C31164g c31164g;
        super.mo37584UJ();
        ChannelPageView m53995GL = m53995GL();
        if ((m53995GL == null || !m53995GL.m53972WK()) && this.f52584B0.mo53067q() == null) {
            C24989b1 c24989b1 = (C24989b1) m55556SK();
            if (c24989b1 != null) {
                c24989b1.f119767G.m55786j();
                this.f52584B0.mo53060Nr();
            }
            C24989b1 c24989b12 = (C24989b1) m55556SK();
            if (c24989b12 != null && (overScrollableRecyclerView = c24989b12.f119764D) != null && (c31164g = this.f52590H0) != null) {
                c31164g.m151607i0(overScrollableRecyclerView);
            }
        }
    }

    /* renamed from: UL */
    public final void m54071UL() {
        String m50787w;
        Channel mo53067q = this.f52584B0.mo53067q();
        if (mo53067q == null || (m50787w = mo53067q.m50787w()) == null) {
            return;
        }
        ShareBottomSheet m51919a = ShareBottomSheet.Companion.m51919a(m50787w);
        m51919a.m51914sL(new C10164n());
        ChannelPageView m53995GL = m53995GL();
        boolean z11 = false;
        if (m53995GL != null && m53995GL.m53972WK()) {
            z11 = true;
        }
        m51919a.m51757bL(z11);
        BaseBottomSheetView.m51747hL(m51919a, m53996HL(), null, 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            if (c24989b1.f119783s.m56227b()) {
                c24989b1.f119783s.m56226a();
            }
            LinearLayout linearLayout = c24989b1.f119787w;
            AbstractC19074t.m100207e(linearLayout, "btnJustWatched");
            if (AbstractC26112n.m134380U(linearLayout)) {
                ImageView imageView = c24989b1.f119761A;
                AbstractC19074t.m100207e(imageView, "icoJustWatched");
                AbstractC26112n.m134431w0(imageView);
                ProgressBar progressBar = c24989b1.f119782r;
                AbstractC19074t.m100207e(progressBar, "barJustWatched");
                AbstractC26112n.m134367H(progressBar);
            }
            c24989b1.f119767G.m55781c();
        }
        this.f52594L0 = false;
    }

    /* renamed from: VL */
    public final void m54072VL() {
        C18173j.Companion.m96885a();
        InterfaceC21251f interfaceC21251f = (InterfaceC21251f) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC21251f.class));
        if (interfaceC21251f != null) {
            InterfaceC27218a m92692wK = m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            CameraInputParams m140379c = C27417l.f129055a.m140379c();
            m140379c.f41138w0 = new SensitiveData("channel_post_video", "channel", null, 4, null);
            C24848g0 c24848g0 = C24848g0.f119245a;
            InterfaceC21251f.a.m110057a(interfaceC21251f, m92692wK, m140379c, null, 0, 0, 28, null);
        }
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_post_video_from_profile);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        String str2;
        Channel channel;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C24989b1 c24989b1 = (C24989b1) m55556SK();
        if (c24989b1 != null) {
            ChannelReceiver channelReceiver = new ChannelReceiver(new C10172v(), new C10142b0(), null, null, new C10144c0(), 12, null);
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            channelReceiver.mo53685d(m92689tK);
            this.f52587E0 = channelReceiver;
            LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10146d0(), new C10148e0());
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
            loadMoreVideoReceiver.mo53685d(m92689tK2);
            this.f52589G0 = loadMoreVideoReceiver;
            c24989b1.f119765E.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: m20.l
                public /* synthetic */ ViewOnLayoutChangeListenerC22765l() {
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    ChannelView.m54009WL(C24989b1.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            });
            AvatarImageView avatarImageView = c24989b1.f119781q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AbstractC26112n.m134407k0(avatarImageView, new C10150f0());
            UsernameTextView usernameTextView = c24989b1.f119779S;
            AbstractC19074t.m100207e(usernameTextView, "txtVerify");
            AbstractC26112n.m134407k0(usernameTextView, new C10165o());
            ImageView imageView = c24989b1.f119788x;
            AbstractC19074t.m100207e(imageView, "btnShare");
            AbstractC26112n.m134407k0(imageView, new C10166p());
            ChannelLivestreamInfoLayout channelLivestreamInfoLayout = c24989b1.f119766F;
            AbstractC19074t.m100207e(channelLivestreamInfoLayout, "lytLive");
            AbstractC26112n.m134407k0(channelLivestreamInfoLayout, new C10167q());
            EllipsizedTextView ellipsizedTextView = c24989b1.f119776P;
            ellipsizedTextView.setEllipsizedMaxLine(3);
            AbstractC19074t.m100205c(ellipsizedTextView);
            boolean z11 = false;
            SpannableString spannableString = new SpannableString(AbstractC26112n.m134366G(ellipsizedTextView, AbstractC27413h.zch_text_ellipsis_see_more, new Object[0]));
            spannableString.setSpan(new TypefaceSpan() { // from class: com.zing.zalo.shortvideo.ui.view.ChannelView$onViewCreated$1$13$1$1
                public ChannelView$onViewCreated$1$13$1$1() {
                    super((String) null);
                }

                @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    AbstractC19074t.m100208f(textPaint, "paint");
                    EllipsizedTextView ellipsizedTextView2 = EllipsizedTextView.this;
                    AbstractC19074t.m100207e(ellipsizedTextView2, "$this_run");
                    textPaint.setColor(AbstractC26112n.m134426u(ellipsizedTextView2, AbstractC27406a.zch_text_tertiary));
                }
            }, 1, spannableString.length(), 17);
            ellipsizedTextView.setEllipsisText(spannableString);
            ellipsizedTextView.setOnClickListener(new View.OnClickListener() { // from class: m20.m
                public /* synthetic */ ViewOnClickListenerC22769m() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChannelView.m54011XL(EllipsizedTextView.this, view2);
                }
            });
            OverScrollableRecyclerView overScrollableRecyclerView = c24989b1.f119770J;
            C31158d c31158d = new C31158d();
            c31158d.m151527P(new C10168r(c24989b1, overScrollableRecyclerView));
            this.f52591I0 = c31158d;
            overScrollableRecyclerView.setLayoutManager(new LinearLayoutManager(m92689tK(), 0, false));
            overScrollableRecyclerView.m9816A(new C10169s());
            overScrollableRecyclerView.setAdapter(this.f52591I0);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null && (channel = (Channel) m92642L3.getParcelable("CHANNEL")) != null) {
                AbstractC19074t.m100205c(channel);
                m54041mM(channel, false);
            }
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                str = m92642L32.getString("JUST_WATCHED_ID");
            } else {
                str = null;
            }
            LinearLayout linearLayout = c24989b1.f119787w;
            if (str != null) {
                z11 = true;
            }
            linearLayout.setEnabled(z11);
            C31175l0 c31175l0 = new C31175l0();
            this.f52593K0 = c31175l0;
            c24989b1.f119771K.setAdapter(c31175l0);
            OverScrollableRecyclerView overScrollableRecyclerView2 = c24989b1.f119771K;
            Context context = overScrollableRecyclerView2.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            overScrollableRecyclerView2.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context, 0, false, false, 12, null));
            c24989b1.f119771K.setHasFixedSize(true);
            c24989b1.f119771K.m9816A(new C10762m(AbstractC26105g.m134347n(8)));
            c24989b1.f119771K.m9826E(this.f52604V0);
            c24989b1.f119765E.m55626i();
            c24989b1.f119765E.setOnAnimSimilarChannelComplete(new C10170t());
            Bundle m92642L33 = m92642L3();
            if (m92642L33 != null) {
                str2 = m92642L33.getString("JUST_WATCHED_ID");
            } else {
                str2 = null;
            }
            C31164g c31164g = new C31164g(str2, null, null, 6, null);
            c31164g.m151608j0(new C10171u(c31164g));
            this.f52590H0 = c31164g;
            this.f52592J0 = new OverScrollableRecyclerView.GridLayoutManager(this, c24989b1.f119764D.getContext()) { // from class: com.zing.zalo.shortvideo.ui.view.ChannelView$onViewCreated$1$19

                /* renamed from: S */
                private final int f52643S;

                /* renamed from: U */
                final /* synthetic */ ChannelView f52645U;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ChannelView$onViewCreated$1$19(ChannelView this, Context context2) {
                    super(context2, 3, 0, false, false, 28, null);
                    this.f52645U = this;
                    AbstractC19074t.m100205c(context2);
                    this.f52643S = Resources.getSystem().getDisplayMetrics().heightPixels;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* renamed from: K1 */
                public void mo9731K1(RecyclerView.C1899z c1899z, int[] iArr) {
                    AbstractC19074t.m100208f(c1899z, "state");
                    AbstractC19074t.m100208f(iArr, "extraLayoutSpace");
                    int i11 = this.f52643S;
                    iArr[0] = i11 / 2;
                    iArr[1] = i11 / 2;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
                /* renamed from: W0 */
                public void mo9666W0(RecyclerView.C1899z c1899z) {
                    super.mo9666W0(c1899z);
                    this.f52645U.m54060xL(r3.computeVerticalScrollOffset() - C24989b1.this.f119764D.getOffsetY());
                    this.f52645U.m54053sM();
                    this.f52645U.m54051rM();
                }
            };
            OverScrollableRecyclerView overScrollableRecyclerView3 = c24989b1.f119764D;
            overScrollableRecyclerView3.setAdapter(this.f52590H0);
            overScrollableRecyclerView3.setLayoutManager(this.f52592J0);
            AbstractC19074t.m100205c(overScrollableRecyclerView3);
            OverScrollableRecyclerView.m56143g2(overScrollableRecyclerView3, new C10173w(c24989b1), 0.0f, 2, null);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView3, new C10174x(), 0.0f, 2, null);
            overScrollableRecyclerView3.m9826E(new C10175y(overScrollableRecyclerView3));
            overScrollableRecyclerView3.m56145b2(new C10176z(overScrollableRecyclerView3));
            Context context2 = overScrollableRecyclerView3.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            overScrollableRecyclerView3.m9816A(new C2496b(context2, new C10140a0(c24989b1)));
            overScrollableRecyclerView3.setHasFixedSize(true);
        }
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: b */
    public void mo54073b(boolean z11) {
        C24989b1 c24989b1;
        if (this.f52584B0.mo53067q() == null && (c24989b1 = (C24989b1) m55556SK()) != null && z11) {
            c24989b1.f119767G.m55786j();
            this.f52584B0.mo53060Nr();
        }
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: bF */
    public void mo54074bF(Section section) {
        LinearLayout linearLayout;
        Object obj;
        ArrayList arrayList;
        String str;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        AbstractC19074t.m100208f(section, "section");
        C31164g c31164g = this.f52590H0;
        if (c31164g != null) {
            int mo10003k = c31164g.mo10003k();
            c31164g.m151593S(section);
            int mo10003k2 = c31164g.mo10003k() - mo10003k;
            List m51168m = c31164g.m151596W().m51168m();
            int i11 = mo10003k + mo10003k2;
            int i12 = mo10003k;
            while (true) {
                Integer num = null;
                if (i12 >= i11) {
                    break;
                }
                Video video = (Video) m51168m.get(i12);
                Integer m52919y = ((Video) m51168m.get(i12 - 1)).m52919y();
                if (m52919y != null) {
                    num = Integer.valueOf(m52919y.intValue() + 1);
                }
                video.m52853L0(num);
                i12++;
            }
            c31164g.m151445N();
            c31164g.m10015w(mo10003k, mo10003k2);
            C24989b1 c24989b1 = (C24989b1) m55556SK();
            if (c24989b1 != null && (linearLayout = c24989b1.f119787w) != null) {
                AbstractC19074t.m100205c(linearLayout);
                if (AbstractC26112n.m134380U(linearLayout)) {
                    C24989b1 c24989b12 = (C24989b1) m55556SK();
                    if (c24989b12 != null && (linearLayout4 = c24989b12.f119787w) != null) {
                        obj = linearLayout4.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        while (mo10003k < i11) {
                            arrayList = c31164g.f143724A;
                            Object obj2 = arrayList.get(mo10003k);
                            if (!(obj2 instanceof Video)) {
                                obj2 = null;
                            }
                            Video video2 = (Video) obj2;
                            if (video2 != null) {
                                str = video2.m52911t();
                            } else {
                                str = null;
                            }
                            if (AbstractC19074t.m100204b(str, c31164g.m151595V())) {
                                C24989b1 c24989b13 = (C24989b1) m55556SK();
                                if (c24989b13 != null) {
                                    linearLayout2 = c24989b13.f119787w;
                                } else {
                                    linearLayout2 = null;
                                }
                                if (linearLayout2 != null) {
                                    linearLayout2.setTag(Integer.valueOf(mo10003k));
                                }
                                C24989b1 c24989b14 = (C24989b1) m55556SK();
                                if (c24989b14 != null && (linearLayout3 = c24989b14.f119787w) != null) {
                                    linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: m20.i
                                        public /* synthetic */ ViewOnClickListenerC22753i() {
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            ChannelView.m53993EL(ChannelView.this, view);
                                        }
                                    });
                                }
                            }
                            mo10003k++;
                        }
                    }
                }
            }
        }
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: d */
    public void mo54075d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        if (this.f52584B0.mo53067q() == null) {
            C24989b1 c24989b1 = (C24989b1) m55556SK();
            if (c24989b1 != null) {
                if (th2 instanceof NotExistsException) {
                    ChannelInfoLayout channelInfoLayout = c24989b1.f119765E;
                    AbstractC19074t.m100207e(channelInfoLayout, "lytInfo");
                    AbstractC26112n.m134367H(channelInfoLayout);
                    LoadingLayout loadingLayout = c24989b1.f119767G;
                    AbstractC19074t.m100207e(loadingLayout, "lytLoading");
                    AbstractC26112n.m134419q0(loadingLayout, 0);
                    LoadingLayout loadingLayout2 = c24989b1.f119767G;
                    AbstractC19074t.m100207e(loadingLayout2, "lytLoading");
                    LoadingLayout.m55778e(loadingLayout2, Integer.valueOf(AbstractC23322a.zch_ic_empty_state_line_48), null, Integer.valueOf(AbstractC27413h.zch_page_channel_not_exist), null, null, null, 58, null);
                } else if (th2 instanceof NetworkException) {
                    c24989b1.f119767G.m55784g(new C10149f(c24989b1, this));
                } else {
                    c24989b1.f119767G.m55783f(new C10151g(c24989b1, this));
                }
            }
            ChannelPageView m53995GL = m53995GL();
            if (m53995GL != null) {
                m53995GL.m53974YK(false);
            }
            C31164g c31164g = this.f52590H0;
            if (c31164g != null) {
                c31164g.m151445N();
            }
        }
        this.f52594L0 = false;
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: nl */
    public void mo54076nl(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C31164g c31164g = this.f52590H0;
        if (c31164g != null) {
            c31164g.m151602d0(video);
        }
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: om */
    public void mo54077om(List list) {
        m54047pM(list);
    }

    @Override // m20.InterfaceC22745g
    /* renamed from: oy */
    public void mo54078oy(boolean z11, Object obj, boolean z12, boolean z13) {
        Throwable th2;
        String m92652XI;
        Map m131401f;
        int i11;
        Map m131401f2;
        AbstractC19074t.m100208f(obj, "result");
        boolean z14 = obj instanceof PersonalizeChannel;
        if (z14) {
            Channel mo53067q = this.f52584B0.mo53067q();
            if (mo53067q != null) {
                C25097t c25097t = C25097t.f120556a;
                Context context = getContext();
                if (z11) {
                    i11 = AbstractC27413h.zch_page_channel_follow_success;
                } else {
                    i11 = AbstractC27413h.zch_page_channel_unfollow_success;
                }
                c25097t.m130154o(context, m92653YI(i11, mo53067q.m50775o()));
                if (z11) {
                    m54061yL(mo53067q, false);
                    this.f52599Q0 = false;
                    ChannelPageView m53995GL = m53995GL();
                    if (m53995GL != null) {
                        m53995GL.m53971VK();
                    }
                    m54017aM(false);
                    if (!z13) {
                        m53994FL();
                    }
                }
                if (z12 && z11) {
                    C19205a c19205a = C19205a.f95429a;
                    m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", 1));
                    c19205a.m100713L("profile_float_follow_result", m131401f2);
                    return;
                }
            }
        } else {
            if (obj instanceof Throwable) {
                th2 = (Throwable) obj;
            } else {
                th2 = null;
            }
            if (th2 != null) {
                if (th2 instanceof LimitationReachedException) {
                    C25097t.f120556a.m130154o(getContext(), ((LimitationReachedException) th2).getMessage());
                } else {
                    C25097t.f120556a.m130155r(getContext(), th2);
                }
            }
        }
        C19205a c19205a2 = C19205a.f95429a;
        if (z11) {
            m92652XI = m92652XI(AbstractC27413h.zch_action_key_profile_follow_channel_result);
        } else {
            m92652XI = m92652XI(AbstractC27413h.zch_action_key_profile_unfollow_channel_result);
        }
        AbstractC19074t.m100205c(m92652XI);
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", Integer.valueOf(z14 ? 1 : 0)));
        c19205a2.m100713L(m92652XI, m131401f);
    }
}
