package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.MainPageLayout;
import com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerLayout;
import com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerView;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.shortvideo.p072ui.widget.NonSwipeableViewPager;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17507u0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18189c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f20.C18708f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C21456b;
import l20.C22006a;
import l20.InterfaceC22007b;
import on0.AbstractC24341v;
import p338m2.InterfaceC22715a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25040o1;
import q20.C25097t;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import s20.AbstractC26102d;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27412g;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import x00.InterfaceC29280a;

/* loaded from: classes5.dex */
public final class VideoChannelPagerView extends AbstractC10623a implements MainPageLayout.InterfaceC10301a, InterfaceC18189c, C21456b.c, ZchBaseView.InterfaceC10622a {
    public static final C10509b Companion = new C10509b(null);

    /* renamed from: B0 */
    private C18708f f53454B0;

    /* renamed from: C0 */
    private InterfaceC18494a f53455C0;

    /* renamed from: D0 */
    private boolean f53456D0;

    /* renamed from: E0 */
    private Video f53457E0;

    /* renamed from: F0 */
    private Channel f53458F0;

    /* renamed from: G0 */
    private int f53459G0;

    /* renamed from: H0 */
    private final C10510c f53460H0;

    /* renamed from: I0 */
    private boolean f53461I0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10508a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10508a f53462y = new C10508a();

        C10508a() {
            super(3, C25040o1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchLayoutPagerVideoChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m55111h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25040o1 m55111h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25040o1.m129909c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$b */
    /* loaded from: classes5.dex */
    public static final class C10509b {
        private C10509b() {
        }

        public /* synthetic */ C10509b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: h */
        public static /* synthetic */ VideoChannelPagerView m55112h(C10509b c10509b, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return c10509b.m55119g(str, str2, str3);
        }

        /* renamed from: a */
        public final VideoChannelPagerView m55113a(Section section, int i11, String str) {
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str, "uuid");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55406b(section, i11, str));
            return videoChannelPagerView;
        }

        /* renamed from: b */
        public final VideoChannelPagerView m55114b(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "collectionId");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55407c(str, section, i11, str2));
            return videoChannelPagerView;
        }

        /* renamed from: c */
        public final VideoChannelPagerView m55115c(Video video) {
            AbstractC19074t.m100208f(video, "video");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55405a(video));
            return videoChannelPagerView;
        }

        /* renamed from: d */
        public final VideoChannelPagerView m55116d(Video video, boolean z11) {
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            Bundle m55408d = VideoPageView.Companion.m55408d(video);
            AbstractC26102d.m134326a(m55408d, "SHOW_TOOLTIP", Boolean.valueOf(z11));
            videoChannelPagerView.mo60305zK(m55408d);
            return videoChannelPagerView;
        }

        /* renamed from: e */
        public final VideoChannelPagerView m55117e(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "hashtag");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55409e(str, section, i11, str2));
            return videoChannelPagerView;
        }

        /* renamed from: f */
        public final VideoChannelPagerView m55118f(Section section, int i11, String str) {
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str, "uuid");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55410f(section, i11, str));
            return videoChannelPagerView;
        }

        /* renamed from: g */
        public final VideoChannelPagerView m55119g(String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, "videoId");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55411g(str, str2, str3));
            return videoChannelPagerView;
        }

        /* renamed from: i */
        public final VideoChannelPagerView m55120i(Section section, int i11, String str, String str2, String str3) {
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str, "kw");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "source");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55412h(section, i11, str, str2, str3));
            return videoChannelPagerView;
        }

        /* renamed from: j */
        public final VideoChannelPagerView m55121j(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "similarId");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            Bundle m55413i = VideoPageView.Companion.m55413i(str, section, i11, str2);
            m55413i.putInt("SHOW_WITH_FLAGS", 134217728);
            videoChannelPagerView.mo60305zK(m55413i);
            return videoChannelPagerView;
        }

        /* renamed from: k */
        public final VideoChannelPagerView m55122k(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "locationValue");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            VideoChannelPagerView videoChannelPagerView = new VideoChannelPagerView();
            videoChannelPagerView.mo60305zK(VideoPageView.Companion.m55414j(str, section, i11, str2));
            return videoChannelPagerView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$c */
    /* loaded from: classes5.dex */
    public static final class C10510c implements InterfaceC22007b {
        C10510c() {
        }

        @Override // l20.InterfaceC22007b
        /* renamed from: a */
        public void mo54538a(boolean z11) {
            ImageView imageView;
            C25040o1 c25040o1 = (C25040o1) VideoChannelPagerView.this.m55556SK();
            if (c25040o1 != null && (imageView = c25040o1.f120160r) != null) {
                if (z11) {
                    AbstractC26112n.m134431w0(imageView);
                } else {
                    AbstractC26112n.m134374O(imageView);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$d */
    /* loaded from: classes5.dex */
    public static final class C10511d implements C17291a.f {

        /* renamed from: b */
        final /* synthetic */ C25040o1 f53465b;

        C10511d(C25040o1 c25040o1) {
            this.f53465b = c25040o1;
        }

        @Override // com.zing.zalo.zlottie.widget.C17291a.f
        /* renamed from: a */
        public void mo55123a() {
            LinearLayout linearLayout = this.f53465b.f120163u;
            AbstractC19074t.m100207e(linearLayout, "lytGuide");
            AbstractC26112n.m134367H(linearLayout);
        }

        @Override // com.zing.zalo.zlottie.widget.C17291a.f
        /* renamed from: b */
        public void mo55124b() {
            VideoChannelPagerView.this.f53461I0 = true;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$e */
    /* loaded from: classes5.dex */
    public static final class C10512e implements VideoChannelPagerLayout.InterfaceC10507a {
        C10512e() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerLayout.InterfaceC10507a
        /* renamed from: b */
        public void mo55081b() {
            VideoChannelPagerView.this.m55105nL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$f */
    /* loaded from: classes5.dex */
    public static final class C10513f extends ViewPager.C6879n {

        /* renamed from: p */
        private int f53467p;

        /* renamed from: q */
        private boolean f53468q;

        /* renamed from: r */
        final /* synthetic */ NonSwipeableViewPager f53469r;

        /* renamed from: s */
        final /* synthetic */ C25040o1 f53470s;

        /* renamed from: t */
        final /* synthetic */ VideoChannelPagerView f53471t;

        C10513f(NonSwipeableViewPager nonSwipeableViewPager, C25040o1 c25040o1, VideoChannelPagerView videoChannelPagerView) {
            this.f53469r = nonSwipeableViewPager;
            this.f53470s = c25040o1;
            this.f53471t = videoChannelPagerView;
            this.f53467p = nonSwipeableViewPager.getCurrentItem();
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            if (i11 == 0 && this.f53470s.f120164v.getTranslationX() < this.f53469r.getWidth() * 0.9f) {
                InterfaceC18494a interfaceC18494a = this.f53471t.f53455C0;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
                this.f53471t.f53455C0 = null;
            }
            this.f53471t.m55095gL(i11);
            this.f53471t.m55105nL();
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            float f12;
            MainPageLayout.InterfaceC10301a interfaceC10301a;
            int width = (this.f53469r.getWidth() * i11) + i12;
            C25040o1 c25040o1 = this.f53470s;
            NonSwipeableViewPager nonSwipeableViewPager = this.f53469r;
            VideoChannelPagerView videoChannelPagerView = this.f53471t;
            FrameLayout frameLayout = c25040o1.f120166x;
            AbstractC19074t.m100207e(frameLayout, "lytSwipeIAB");
            if (AbstractC26112n.m134380U(frameLayout)) {
                c25040o1.f120166x.setTranslationX(-width);
                int scrollState = nonSwipeableViewPager.getScrollState();
                if (scrollState != 1) {
                    if (scrollState == 2 && !this.f53468q && AbstractC19074t.m100204b(c25040o1.f120161s.getTag(), Boolean.TRUE)) {
                        this.f53468q = true;
                        nonSwipeableViewPager.setCurrentItem(C18708f.c.f93999p.ordinal());
                        videoChannelPagerView.m55098uL();
                        return;
                    }
                    return;
                }
                c25040o1.f120165w.m55080a(width);
                this.f53468q = false;
                return;
            }
            LinearLayout linearLayout = c25040o1.f120164v;
            if (width < nonSwipeableViewPager.getWidth()) {
                f12 = -width;
            } else {
                f12 = -2.1474836E9f;
            }
            linearLayout.setTranslationX(f12);
            InterfaceC1801w m92650VI = videoChannelPagerView.m92650VI();
            if (m92650VI instanceof MainPageLayout.InterfaceC10301a) {
                interfaceC10301a = (MainPageLayout.InterfaceC10301a) m92650VI;
            } else {
                interfaceC10301a = null;
            }
            if (interfaceC10301a != null) {
                interfaceC10301a.mo54521Yz(width);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            String str;
            ArrayList m131500h;
            Map m131407l;
            VideoAdsInfo m52881b;
            VideoAdsInfo m52881b2;
            String m52929e;
            VideoAdsInfo m52881b3;
            String m52928d;
            C18708f.c cVar = C18708f.c.f94000q;
            if (i11 != cVar.ordinal() || this.f53471t.f53456D0) {
                this.f53471t.f53456D0 = false;
            } else {
                C24860q[] c24860qArr = new C24860q[1];
                Channel channel = this.f53471t.f53458F0;
                if (channel == null || (str = channel.m50769l()) == null) {
                    str = "";
                }
                c24860qArr[0] = AbstractC24866w.m129235a("seen_channel_uid", str);
                m131500h = AbstractC25368s.m131500h(c24860qArr);
                VideoChannelPagerView videoChannelPagerView = this.f53471t;
                if (videoChannelPagerView.f53461I0) {
                    videoChannelPagerView.f53461I0 = false;
                    m131500h.add(AbstractC24866w.m129235a("action_by", "guide_swipe_left"));
                }
                Video video = videoChannelPagerView.f53457E0;
                if (video != null && (m52881b3 = video.m52881b()) != null && (m52928d = m52881b3.m52928d()) != null) {
                    m131500h.add(AbstractC24866w.m129235a("ad_id", m52928d));
                }
                Video video2 = videoChannelPagerView.f53457E0;
                if (video2 != null && (m52881b2 = video2.m52881b()) != null && (m52929e = m52881b2.m52929e()) != null) {
                    m131500h.add(AbstractC24866w.m129235a("ad_src", m52929e));
                }
                C24860q[] c24860qArr2 = (C24860q[]) m131500h.toArray(new C24860q[0]);
                m131407l = AbstractC25363p0.m131407l((C24860q[]) Arrays.copyOf(c24860qArr2, c24860qArr2.length));
                Video video3 = this.f53471t.f53457E0;
                if (video3 == null || video3.m52834A0()) {
                    Video video4 = this.f53471t.f53457E0;
                    if (video4 != null && (m52881b = video4.m52881b()) != null && m52881b.m52930f() == 1) {
                        C19205a c19205a = C19205a.f95429a;
                        String m92652XI = this.f53471t.m92652XI(AbstractC27413h.zch_action_key_swipe_channel_detail);
                        AbstractC19074t.m100207e(m92652XI, "getString(...)");
                        C19205a.m100676P(c19205a, m92652XI, this.f53471t.f53457E0, null, 4, null);
                    }
                } else {
                    C19205a c19205a2 = C19205a.f95429a;
                    String m92652XI2 = this.f53471t.m92652XI(AbstractC27413h.zch_action_key_swipe_channel_detail);
                    AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                    c19205a2.m100713L(m92652XI2, m131407l);
                }
            }
            if (i11 == cVar.ordinal()) {
                AbstractC28684a.Companion.m143681o().mo146300B(0);
            }
            FrameLayout frameLayout = this.f53470s.f120166x;
            AbstractC19074t.m100207e(frameLayout, "lytSwipeIAB");
            if (!AbstractC26112n.m134380U(frameLayout)) {
                C18708f c18708f = this.f53471t.f53454B0;
                if (c18708f != null) {
                    c18708f.m98666D(this.f53467p);
                }
                C18708f c18708f2 = this.f53471t.f53454B0;
                if (c18708f2 != null) {
                    c18708f2.m98665C(i11);
                }
                this.f53467p = i11;
                return;
            }
            if (this.f53469r.getCurrentItem() == cVar.ordinal()) {
                this.f53469r.setCurrentItem(C18708f.c.f93999p.ordinal());
                this.f53468q = true;
                this.f53471t.m55098uL();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$g */
    /* loaded from: classes5.dex */
    static final class C10514g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25040o1 f53473r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10514g(C25040o1 c25040o1) {
            super(1);
            this.f53473r = c25040o1;
        }

        /* renamed from: a */
        public final void m55125a(View view) {
            Object mo35339k;
            VideoPageView videoPageView;
            AbstractC19074t.m100208f(view, "it");
            C18708f c18708f = VideoChannelPagerView.this.f53454B0;
            if (c18708f != null && (mo35339k = c18708f.mo35339k(this.f53473r.f120157A, C18708f.c.f93999p.ordinal())) != null) {
                VideoChannelPagerView videoChannelPagerView = VideoChannelPagerView.this;
                if (mo35339k instanceof VideoPageView) {
                    videoPageView = (VideoPageView) mo35339k;
                } else {
                    videoPageView = null;
                }
                if (videoPageView != null) {
                    videoPageView.m55395nM();
                }
                videoChannelPagerView.m55549OK(true);
            }
            VideoChannelPagerView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55125a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView$h */
    /* loaded from: classes5.dex */
    static final class C10515h extends AbstractC19075u implements InterfaceC18505l {
        C10515h() {
            super(1);
        }

        /* renamed from: a */
        public final void m55126a(View view) {
            Map m131401f;
            C17487o0 mo35579p;
            C17507u0 m92998F;
            AbstractC19074t.m100208f(view, "it");
            VideoChannelPagerView.this.m55549OK(true);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoChannelPagerView.this.m92652XI(AbstractC27413h.zch_action_key_floating_btn);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("from_item", 1));
            c19205a.m100713L(m92652XI, m131401f);
            FloatingManager.Companion.m53872n();
            StateManager.Companion.m53805i();
            InterfaceC27218a m92676n2 = VideoChannelPagerView.this.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null && (m92998F = mo35579p.m92998F(ZChannelFloatingAnimView.class, true)) != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("xAnim4View", 1);
                C17507u0 m93139f = m92998F.m93139f(bundle);
                if (m93139f != null) {
                    m93139f.m93136a();
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55126a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public VideoChannelPagerView() {
        super(C10508a.f53462y);
        this.f53459G0 = C18708f.c.f93999p.ordinal();
        this.f53460H0 = new C10510c();
    }

    /* renamed from: gL */
    public final void m55095gL(int i11) {
        C18708f c18708f;
        Object mo35339k;
        VideoPageView videoPageView;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null && (mo35339k = c18708f.mo35339k(c25040o1.f120157A, C18708f.c.f93999p.ordinal())) != null) {
            if (mo35339k instanceof VideoPageView) {
                videoPageView = (VideoPageView) mo35339k;
            } else {
                videoPageView = null;
            }
            if (videoPageView != null) {
                videoPageView.m55396oM(i11);
            }
        }
    }

    /* renamed from: sL */
    public static final void m55096sL(VideoChannelPagerView videoChannelPagerView, View view) {
        AbstractC19074t.m100208f(videoChannelPagerView, "this$0");
        AbstractC19074t.m100208f(view, "$view");
        try {
            videoChannelPagerView.mo53932Bg();
        } catch (Exception unused) {
            view.postDelayed(new Runnable() { // from class: m20.b2
                public /* synthetic */ RunnableC22725b2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoChannelPagerView.m55097tL(VideoChannelPagerView.this);
                }
            }, ViewConfiguration.getDoubleTapTimeout());
        }
    }

    /* renamed from: tL */
    public static final void m55097tL(VideoChannelPagerView videoChannelPagerView) {
        AbstractC19074t.m100208f(videoChannelPagerView, "this$0");
        try {
            videoChannelPagerView.mo53932Bg();
        } catch (Exception unused) {
        }
    }

    /* renamed from: uL */
    public final void m55098uL() {
        C18708f c18708f;
        Object mo35339k;
        VideoPageView videoPageView;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null && (mo35339k = c18708f.mo35339k(c25040o1.f120157A, C18708f.c.f93999p.ordinal())) != null) {
            if (mo35339k instanceof VideoPageView) {
                videoPageView = (VideoPageView) mo35339k;
            } else {
                videoPageView = null;
            }
            if (videoPageView != null) {
                videoPageView.m55399rM();
            }
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        C18708f c18708f;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            c18708f.m98665C(c25040o1.f120157A.getCurrentItem());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        FloatingManager.Companion.m53873o(this.f53460H0);
        super.mo37484JJ();
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(VideoChannelPagerView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        C18708f c18708f;
        if (super.mo39030NJ(i11, keyEvent)) {
            return true;
        }
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            NonSwipeableViewPager nonSwipeableViewPager = c25040o1.f120157A;
            Object mo35339k = c18708f.mo35339k(nonSwipeableViewPager, nonSwipeableViewPager.getCurrentItem());
            if (mo35339k != null) {
                AbstractC19074t.m100206d(mo35339k, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.BasePageView<*>");
                if (((AbstractC10623a) mo35339k).mo39030NJ(i11, keyEvent)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        NonSwipeableViewPager nonSwipeableViewPager;
        Object mo35339k;
        VideoPageView videoPageView;
        super.mo39032PJ();
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (nonSwipeableViewPager = c25040o1.f120157A) != null) {
            int currentItem = nonSwipeableViewPager.getCurrentItem();
            C18708f.c cVar = C18708f.c.f93999p;
            if (currentItem != cVar.ordinal()) {
                nonSwipeableViewPager.setCurrentItem(cVar.ordinal());
            }
            C18708f c18708f = this.f53454B0;
            if (c18708f != null && (mo35339k = c18708f.mo35339k(nonSwipeableViewPager, cVar.ordinal())) != null) {
                if (mo35339k instanceof VideoPageView) {
                    videoPageView = (VideoPageView) mo35339k;
                } else {
                    videoPageView = null;
                }
                if (videoPageView != null) {
                    videoPageView.mo60305zK(m92642L3());
                    videoPageView.mo39032PJ();
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        Video video;
        super.mo37584UJ();
        if (((C25040o1) m55556SK()) != null && (video = this.f53457E0) != null && video.m52834A0()) {
            m55109rL(true);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.MainPageLayout.InterfaceC10301a
    /* renamed from: Yz */
    public void mo54521Yz(int i11) {
        MainPageLayout.InterfaceC10301a.a.m54523a(this, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:            r5 = on0.AbstractC24342w.m127132B0(r13, new java.lang.String[]{"_"}, false, 0, 6, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:            r7 = on0.AbstractC24342w.m127132B0(r13, new java.lang.String[]{"_"}, false, 0, 6, null);     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37125ZJ(View view, Bundle bundle) {
        boolean z11;
        int i11;
        boolean z12;
        List m127132B0;
        String str;
        List m127132B02;
        String str2;
        CoreConfig m51425b;
        CoreConfig m51425b2;
        Integer m51443f;
        Video video;
        String str3;
        Channel m52887f;
        String m50769l;
        boolean m127128x;
        Object obj;
        String str4;
        Object obj2;
        Integer num;
        int ordinal;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        FloatingManager.Companion.m53869k(this.f53460H0);
        ZaloView m92650VI = m92650VI();
        String str5 = null;
        if (m92650VI instanceof MainPageView) {
            MainPageView mainPageView = (MainPageView) m92650VI;
            if (mainPageView.m54532XK() != null) {
                C21456b.b m54532XK = mainPageView.m54532XK();
                if (m54532XK != null) {
                    obj = m54532XK.m111022a(6);
                } else {
                    obj = null;
                }
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    str4 = m92642L3.getString("SOURCE");
                } else {
                    str4 = null;
                }
                if (AbstractC19074t.m100204b(obj, str4)) {
                    C21456b.b m54532XK2 = mainPageView.m54532XK();
                    if (m54532XK2 != null) {
                        obj2 = m54532XK2.m111022a(4);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        ordinal = num.intValue();
                    } else {
                        ordinal = C18708f.c.f93999p.ordinal();
                    }
                    this.f53459G0 = ordinal;
                }
            }
        }
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        int i12 = 1;
        if (c25040o1 != null) {
            c25040o1.f120165w.setCallback(new C10512e());
            NonSwipeableViewPager nonSwipeableViewPager = c25040o1.f120157A;
            AbstractC19074t.m100207e(nonSwipeableViewPager, "viePager");
            C17487o0 m92649TI = m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            C18708f c18708f = new C18708f(nonSwipeableViewPager, m92649TI);
            c18708f.m98669G(m92642L3());
            if (this.f53459G0 == C18708f.c.f94000q.ordinal()) {
                Bundle m92642L32 = m92642L3();
                if (m92642L32 != null) {
                    video = (Video) m92642L32.getParcelable("RESERVED_VIDEO");
                } else {
                    video = null;
                }
                Bundle m92642L33 = m92642L3();
                if (m92642L33 != null) {
                    str3 = m92642L33.getString("SOURCE");
                } else {
                    str3 = null;
                }
                if (AbstractC19074t.m100204b(str3, "SOURCE_NOTI") && video != null && (m52887f = video.m52887f()) != null && (m50769l = m52887f.m50769l()) != null) {
                    m127128x = AbstractC24341v.m127128x(m50769l);
                    if (!m127128x) {
                        c18708f.m98668F(video.m52887f());
                    }
                }
            }
            this.f53454B0 = c18708f;
            nonSwipeableViewPager.setAdapter(c18708f);
            nonSwipeableViewPager.setCurrentItem(this.f53459G0);
            C18708f c18708f2 = this.f53454B0;
            AbstractC19074t.m100205c(c18708f2);
            nonSwipeableViewPager.setOffscreenPageLimit(c18708f2.mo35335g());
            nonSwipeableViewPager.addOnPageChangeListener(new C10513f(nonSwipeableViewPager, c25040o1, this));
            if (m92650VI() instanceof MainPageView) {
                LinearLayout linearLayout = c25040o1.f120164v;
                AbstractC19074t.m100207e(linearLayout, "lytHeader");
                AbstractC26112n.m134367H(linearLayout);
            } else {
                ImageView imageView = c25040o1.f120159q;
                AbstractC19074t.m100207e(imageView, "btnBack");
                AbstractC26112n.m134407k0(imageView, new C10514g(c25040o1));
                ImageView imageView2 = c25040o1.f120160r;
                AbstractC19074t.m100205c(imageView2);
                AbstractC26112n.m134407k0(imageView2, new C10515h());
                view.post(new Runnable() { // from class: m20.a2

                    /* renamed from: q */
                    public final /* synthetic */ View f111308q;

                    public /* synthetic */ RunnableC22720a2(View view2) {
                        r2 = view2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoChannelPagerView.m55096sL(VideoChannelPagerView.this, r2);
                    }
                });
            }
        }
        Bundle m92642L34 = m92642L3();
        int i13 = 0;
        if (m92642L34 != null) {
            z11 = m92642L34.getBoolean("SHOW_TOOLTIP");
        } else {
            z11 = false;
        }
        C27417l c27417l = C27417l.f129055a;
        InterfaceC29280a m140380d = c27417l.m140380d();
        String mo146319U = m140380d.mo146319U();
        ChannelConfig m140381e = c27417l.m140381e();
        if (m140381e != null && (m51425b2 = m140381e.m51425b()) != null && (m51443f = m51425b2.m51443f()) != null) {
            i11 = m51443f.intValue();
        } else {
            i11 = 0;
        }
        ChannelConfig m140381e2 = c27417l.m140381e();
        if (m140381e2 != null && (m51425b = m140381e2.m51425b()) != null) {
            str5 = m51425b.m51442e();
        }
        String str6 = str5;
        if (z11 && i11 > 0 && str6 != null && str6.length() != 0) {
            if (mo146319U != null && m127132B02 != null && (str2 = (String) m127132B02.get(0)) != null) {
                z12 = AbstractC26105g.m134350q(Long.parseLong(str2));
            } else {
                z12 = false;
            }
            if (mo146319U != null && m127132B0 != null && (str = (String) m127132B0.get(1)) != null) {
                i13 = Integer.parseInt(str);
            }
            if (!m55545MK()) {
                if (!z12 || i13 < i11) {
                    C25097t.m130152v(C25097t.f120556a, getContext(), str6, 0, AbstractC26105g.m134347n(56), 4, null);
                    if (z12) {
                        i12 = 1 + i13;
                    }
                    m140380d.mo146309K(c27417l.m140382f().m130131a() + "_" + i12);
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: aK */
    public void mo54160aK(Bundle bundle) {
        NonSwipeableViewPager nonSwipeableViewPager;
        NonSwipeableViewPager nonSwipeableViewPager2;
        super.mo54160aK(bundle);
        if (bundle != null) {
            C25040o1 c25040o1 = (C25040o1) m55556SK();
            if (c25040o1 == null || (nonSwipeableViewPager2 = c25040o1.f120157A) == null || nonSwipeableViewPager2.getCurrentItem() != C18708f.c.f93999p.ordinal()) {
                C25040o1 c25040o12 = (C25040o1) m55556SK();
                if (c25040o12 != null) {
                    nonSwipeableViewPager = c25040o12.f120157A;
                } else {
                    nonSwipeableViewPager = null;
                }
                if (nonSwipeableViewPager != null) {
                    nonSwipeableViewPager.setCurrentItem(C18708f.c.f93999p.ordinal());
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.MainPageLayout.InterfaceC10301a
    /* renamed from: al */
    public void mo54522al(int i11) {
        NonSwipeableViewPager nonSwipeableViewPager;
        NonSwipeableViewPager nonSwipeableViewPager2;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        MainPageLayout.InterfaceC10301a interfaceC10301a = null;
        if (c25040o1 != null && (nonSwipeableViewPager = c25040o1.f120157A) != null && nonSwipeableViewPager.getCurrentItem() == C18708f.c.f94000q.ordinal()) {
            C25040o1 c25040o12 = (C25040o1) m55556SK();
            if (c25040o12 != null) {
                nonSwipeableViewPager2 = c25040o12.f120157A;
            } else {
                nonSwipeableViewPager2 = null;
            }
            if (nonSwipeableViewPager2 != null) {
                nonSwipeableViewPager2.setCurrentItem(C18708f.c.f93999p.ordinal());
            }
        }
        InterfaceC1801w m92650VI = m92650VI();
        if (m92650VI instanceof MainPageLayout.InterfaceC10301a) {
            interfaceC10301a = (MainPageLayout.InterfaceC10301a) m92650VI;
        }
        if (interfaceC10301a != null) {
            interfaceC10301a.mo54522al(i11);
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        C18708f c18708f;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            c18708f.mo98626a(c25040o1.f120157A.getCurrentItem());
        }
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        C18708f c18708f;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            c18708f.m98666D(c25040o1.f120157A.getCurrentItem());
        }
    }

    /* renamed from: hL */
    public final C17487o0 m55099hL() {
        if (m92650VI() instanceof MainPageView) {
            C17487o0 m92693xK = super.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            return m92693xK;
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* renamed from: iL */
    public final boolean m55100iL(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "pendingAction");
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            if (c25040o1.f120157A.getScrollState() == 0 && c25040o1.f120164v.getTranslationX() < (-r1.getWidth()) * 0.9f) {
                return true;
            }
        }
        this.f53455C0 = interfaceC18494a;
        return false;
    }

    /* renamed from: jL */
    public final boolean m55101jL() {
        LinearLayout linearLayout;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 == null || (linearLayout = c25040o1.f120163u) == null || !AbstractC26112n.m134380U(linearLayout)) {
            return false;
        }
        return true;
    }

    /* renamed from: kL */
    public final void m55102kL() {
        NonSwipeableViewPager nonSwipeableViewPager;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            nonSwipeableViewPager = c25040o1.f120157A;
        } else {
            nonSwipeableViewPager = null;
        }
        if (nonSwipeableViewPager != null) {
            nonSwipeableViewPager.setCurrentItem(C18708f.c.f93999p.ordinal());
        }
    }

    /* renamed from: lL */
    public final void m55103lL() {
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            FrameLayout frameLayout = c25040o1.f120166x;
            AbstractC19074t.m100207e(frameLayout, "lytSwipeIAB");
            if (AbstractC26112n.m134380U(frameLayout)) {
                return;
            }
            this.f53456D0 = true;
            c25040o1.f120157A.setCurrentItem(C18708f.c.f94000q.ordinal());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView.InterfaceC10622a
    /* renamed from: lz */
    public boolean mo53979lz() {
        if (m55556SK() == null) {
            return false;
        }
        InterfaceC22715a m55556SK = m55556SK();
        AbstractC19074t.m100205c(m55556SK);
        C25040o1 c25040o1 = (C25040o1) m55556SK;
        ImageView imageView = c25040o1.f120160r;
        AbstractC19074t.m100207e(imageView, "btnFloat");
        if ((!AbstractC26112n.m134380U(imageView) || c25040o1.f120164v.getTranslationX() < 0.0f) && !(FloatingManager.Companion.m53860b() instanceof C22006a)) {
            return false;
        }
        return true;
    }

    /* renamed from: mL */
    public final void m55104mL(Channel channel, String str) {
        Object obj;
        ChannelPageView channelPageView;
        AbstractC19074t.m100208f(channel, "channel");
        AbstractC19074t.m100208f(str, "justWatchedId");
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            C18708f c18708f = this.f53454B0;
            if (c18708f != null) {
                obj = c18708f.mo35339k(c25040o1.f120157A, C18708f.c.f94000q.ordinal());
            } else {
                obj = null;
            }
            if (obj instanceof ChannelPageView) {
                channelPageView = (ChannelPageView) obj;
            } else {
                channelPageView = null;
            }
            if (channelPageView != null && channelPageView.m53976aL(channel, str)) {
                this.f53455C0 = null;
            }
        }
        this.f53458F0 = channel;
    }

    /* renamed from: nL */
    public final void m55105nL() {
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            LinearLayout linearLayout = c25040o1.f120163u;
            AbstractC19074t.m100207e(linearLayout, "lytGuide");
            if (AbstractC26112n.m134380U(linearLayout)) {
                LinearLayout linearLayout2 = c25040o1.f120163u;
                AbstractC19074t.m100207e(linearLayout2, "lytGuide");
                AbstractC26112n.m134367H(linearLayout2);
                c25040o1.f120162t.m92150E();
            }
        }
    }

    @Override // e20.InterfaceC18189c
    /* renamed from: ni */
    public void mo54480ni() {
        C18708f c18708f;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            c18708f.m98667E(c25040o1.f120157A.getCurrentItem());
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        Object obj;
        AbstractC19074t.m100208f(bVar, "extras");
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            C18708f c18708f = this.f53454B0;
            VideoPageView videoPageView = null;
            if (c18708f != null) {
                obj = c18708f.mo35339k(c25040o1.f120157A, C18708f.c.f93999p.ordinal());
            } else {
                obj = null;
            }
            if (obj instanceof VideoPageView) {
                videoPageView = (VideoPageView) obj;
            }
            if (videoPageView != null) {
                videoPageView.m55398qM(m92642L3(), bVar);
            }
            bVar.m111023b(13, Integer.valueOf(c25040o1.f120157A.getCurrentItem()));
        }
    }

    /* renamed from: oL */
    public final void m55106oL() {
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            AbstractC28684a.h hVar = AbstractC28684a.Companion;
            int mo146331f = hVar.m143681o().mo146331f();
            if (mo146331f > 0) {
                hVar.m143681o().mo146300B(mo146331f - 1);
                c25040o1.f120162t.m92148C(AbstractC27412g.zch_swipe_left, false);
                c25040o1.f120162t.setAutoRepeatMode(C17291a.g.LIMIT);
                c25040o1.f120162t.setMaxRepeatCount(3);
                c25040o1.f120162t.setAnimationListener(new C10511d(c25040o1));
                c25040o1.f120162t.m92155v();
                LinearLayout linearLayout = c25040o1.f120163u;
                AbstractC19074t.m100207e(linearLayout, "lytGuide");
                AbstractC26112n.m134431w0(linearLayout);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_show_guide_swipe_left);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        C18708f c18708f;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            NonSwipeableViewPager nonSwipeableViewPager = c25040o1.f120157A;
            Object mo35339k = c18708f.mo35339k(nonSwipeableViewPager, nonSwipeableViewPager.getCurrentItem());
            if (mo35339k != null) {
                AbstractC19074t.m100206d(mo35339k, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.BasePageView<*>");
                if (((AbstractC10623a) mo35339k).onKeyUp(i11, keyEvent)) {
                    return true;
                }
                LinearLayout linearLayout = c25040o1.f120164v;
                AbstractC19074t.m100207e(linearLayout, "lytHeader");
                if (AbstractC26112n.m134380U(linearLayout) && i11 == 4) {
                    c25040o1.f120159q.callOnClick();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: pL */
    public final void m55107pL(boolean z11) {
        NonSwipeableViewPager nonSwipeableViewPager;
        LinearLayout linearLayout;
        float f11;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        MainPageView mainPageView = null;
        if (c25040o1 != null) {
            nonSwipeableViewPager = c25040o1.f120157A;
        } else {
            nonSwipeableViewPager = null;
        }
        if (nonSwipeableViewPager != null) {
            nonSwipeableViewPager.setSwipeEnable(!z11);
        }
        C25040o1 c25040o12 = (C25040o1) m55556SK();
        if (c25040o12 != null) {
            linearLayout = c25040o12.f120164v;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            if (z11) {
                f11 = -2.1474836E9f;
            } else {
                f11 = 0.0f;
            }
            linearLayout.setTranslationY(f11);
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof MainPageView) {
            mainPageView = (MainPageView) m92650VI;
        }
        if (mainPageView != null) {
            mainPageView.m54533YK(z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    @Override // k20.C21456b.c
    /* renamed from: pt */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo53936pt(C21456b.b bVar) {
        String str;
        Video video;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Section section;
        Object m111022a;
        Integer num;
        Object m111022a2;
        int ordinal;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            int i11 = 0;
            Object m111022a3 = bVar.m111022a(0);
            Integer num2 = null;
            if (m111022a3 instanceof String) {
                str = (String) m111022a3;
            } else {
                str = null;
            }
            AbstractC26102d.m134326a(m92642L3, "SOURCE", str);
            Object m111022a4 = bVar.m111022a(1);
            if (m111022a4 instanceof Video) {
                video = (Video) m111022a4;
            } else {
                video = null;
            }
            AbstractC26102d.m134326a(m92642L3, "RESERVED_VIDEO", video);
            Object m111022a5 = bVar.m111022a(4);
            if (m111022a5 instanceof String) {
                str2 = (String) m111022a5;
            } else {
                str2 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "CHANNEL_ID", str2);
            Object m111022a6 = bVar.m111022a(5);
            if (m111022a6 instanceof String) {
                str3 = (String) m111022a6;
            } else {
                str3 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "SOURCE_UUID", str3);
            Object m111022a7 = bVar.m111022a(6);
            if (m111022a7 instanceof String) {
                str4 = (String) m111022a7;
            } else {
                str4 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "HASHTAG", str4);
            Object m111022a8 = bVar.m111022a(7);
            if (m111022a8 instanceof String) {
                str5 = (String) m111022a8;
            } else {
                str5 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "COLLECTION", str5);
            Object m111022a9 = bVar.m111022a(8);
            if (m111022a9 instanceof String) {
                str6 = (String) m111022a9;
            } else {
                str6 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "SEARCH_KW", str6);
            Object m111022a10 = bVar.m111022a(9);
            if (m111022a10 instanceof String) {
                str7 = (String) m111022a10;
            } else {
                str7 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "VIDEO_LOCATION_VALUE", str7);
            Object m111022a11 = bVar.m111022a(10);
            if (m111022a11 instanceof String) {
                str8 = (String) m111022a11;
            } else {
                str8 = null;
            }
            AbstractC26102d.m134326a(m92642L3, "SIMILAR_ID", str8);
            VideoPageView.C10573b c10573b = VideoPageView.Companion;
            Object m111022a12 = bVar.m111022a(11);
            if (m111022a12 instanceof Section) {
                section = (Section) m111022a12;
            } else {
                section = null;
            }
            if (section != null) {
                List m51168m = section.m51168m();
                if (!(m51168m instanceof Collection) || !m51168m.isEmpty()) {
                    Iterator it = m51168m.iterator();
                    while (it.hasNext()) {
                        if (!(((Parcelable) it.next()) instanceof Video)) {
                        }
                    }
                }
                AbstractC19074t.m100206d(section, "null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.Section<T of com.zing.zalo.shortvideo.data.model.SectionKt.checkItemsCast>");
                c10573b.m55419o(section);
                VideoPageView.C10573b c10573b2 = VideoPageView.Companion;
                m111022a = bVar.m111022a(12);
                if (!(m111022a instanceof Integer)) {
                    num = (Integer) m111022a;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                }
                c10573b2.m55418n(i11);
                m111022a2 = bVar.m111022a(13);
                if (m111022a2 instanceof Integer) {
                    num2 = (Integer) m111022a2;
                }
                if (num2 == null) {
                    ordinal = num2.intValue();
                } else {
                    ordinal = C18708f.c.f93999p.ordinal();
                }
                this.f53459G0 = ordinal;
            }
            section = null;
            c10573b.m55419o(section);
            VideoPageView.C10573b c10573b22 = VideoPageView.Companion;
            m111022a = bVar.m111022a(12);
            if (!(m111022a instanceof Integer)) {
            }
            if (num != null) {
            }
            c10573b22.m55418n(i11);
            m111022a2 = bVar.m111022a(13);
            if (m111022a2 instanceof Integer) {
            }
            if (num2 == null) {
            }
            this.f53459G0 = ordinal;
        }
    }

    /* renamed from: qL */
    public final void m55108qL(Object obj) {
        Video video;
        VideoAdsInfo m52881b;
        if (obj instanceof Video) {
            video = (Video) obj;
        } else {
            video = null;
        }
        this.f53457E0 = video;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            Video video2 = this.f53457E0;
            if (video2 != null && (m52881b = video2.m52881b()) != null && m52881b.m52930f() == 2) {
                FrameLayout frameLayout = c25040o1.f120166x;
                AbstractC19074t.m100207e(frameLayout, "lytSwipeIAB");
                AbstractC26112n.m134431w0(frameLayout);
            } else {
                FrameLayout frameLayout2 = c25040o1.f120166x;
                AbstractC19074t.m100207e(frameLayout2, "lytSwipeIAB");
                AbstractC26112n.m134367H(frameLayout2);
            }
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        C18708f c18708f;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null && (c18708f = this.f53454B0) != null) {
            c18708f.mo98627c(c25040o1.f120157A.getCurrentItem());
        }
    }

    /* renamed from: rL */
    public final void m55109rL(boolean z11) {
        NonSwipeableViewPager nonSwipeableViewPager;
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            nonSwipeableViewPager = c25040o1.f120157A;
        } else {
            nonSwipeableViewPager = null;
        }
        if (nonSwipeableViewPager != null) {
            nonSwipeableViewPager.setSwipeEnable(z11);
        }
    }

    /* renamed from: vL */
    public final void m55110vL(C21456b.b bVar) {
        Object obj;
        AbstractC19074t.m100208f(bVar, "extras");
        C25040o1 c25040o1 = (C25040o1) m55556SK();
        if (c25040o1 != null) {
            C18708f c18708f = this.f53454B0;
            VideoPageView videoPageView = null;
            if (c18708f != null) {
                obj = c18708f.mo35339k(c25040o1.f120157A, C18708f.c.f93999p.ordinal());
            } else {
                obj = null;
            }
            if (obj instanceof VideoPageView) {
                videoPageView = (VideoPageView) obj;
            }
            if (videoPageView != null) {
                videoPageView.m55402vM(bVar);
            }
            bVar.m111023b(4, Integer.valueOf(c25040o1.f120157A.getCurrentItem()));
        }
    }
}
