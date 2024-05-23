package com.zing.zalo.feed.components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import bo.C3033r3;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.components.video.FeedVideoSpeakerView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.widget.C13621e2;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gp.AbstractC19530c;
import gp.C19528a;
import gp.C19529b;
import gp.C19531d;
import hf0.AbstractC20049k;
import hf0.C20047i;
import hf0.C20048j;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.C23030c2;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p138ep.C18537g;
import p138ep.EnumC18536f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p458qr.C25482o;
import p509sp.C26356e;
import p615wn.C29106b;
import p616wo.C29116a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sn.C26333b;
import vg.C28075g8;
import vl0.AbstractC28292b;
import vn.C28304f;

/* loaded from: classes4.dex */
public final class FeedItemZaloVideoView extends FeedItemBase {
    public static final C8180a Companion = new C8180a(null);

    /* renamed from: A0 */
    private final InterfaceC24854k f44947A0;

    /* renamed from: B0 */
    private final InterfaceC24854k f44948B0;

    /* renamed from: C0 */
    private final InterfaceC24854k f44949C0;

    /* renamed from: D0 */
    private final InterfaceC24854k f44950D0;

    /* renamed from: E0 */
    private final InterfaceC24854k f44951E0;

    /* renamed from: F0 */
    private final InterfaceC24854k f44952F0;

    /* renamed from: G0 */
    private final InterfaceC24854k f44953G0;

    /* renamed from: H0 */
    private final InterfaceC24854k f44954H0;

    /* renamed from: I0 */
    private final InterfaceC24854k f44955I0;

    /* renamed from: J0 */
    private C3020p0 f44956J0;

    /* renamed from: K0 */
    private boolean f44957K0;

    /* renamed from: L0 */
    private int f44958L0;

    /* renamed from: M0 */
    private int f44959M0;

    /* renamed from: N0 */
    private boolean f44960N0;

    /* renamed from: O0 */
    private boolean f44961O0;

    /* renamed from: P0 */
    private boolean f44962P0;

    /* renamed from: Q0 */
    private String f44963Q0;

    /* renamed from: R0 */
    private C28304f f44964R0;

    /* renamed from: S0 */
    private boolean f44965S0;

    /* renamed from: T0 */
    private boolean f44966T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f44967U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f44968V0;

    /* renamed from: W0 */
    private InterfaceC8181b f44969W0;

    /* renamed from: X0 */
    private View.OnClickListener f44970X0;

    /* renamed from: Y0 */
    private Runnable f44971Y0;

    /* renamed from: r0 */
    private final InterfaceC24854k f44972r0;

    /* renamed from: s0 */
    private C17391z f44973s0;

    /* renamed from: t0 */
    private final InterfaceC24854k f44974t0;

    /* renamed from: u0 */
    private final InterfaceC24854k f44975u0;

    /* renamed from: v0 */
    private final InterfaceC24854k f44976v0;

    /* renamed from: w0 */
    private final InterfaceC24854k f44977w0;

    /* renamed from: x0 */
    private final InterfaceC24854k f44978x0;

    /* renamed from: y0 */
    private final InterfaceC24854k f44979y0;

    /* renamed from: z0 */
    private final InterfaceC24854k f44980z0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$a */
    /* loaded from: classes4.dex */
    public static final class C8180a {
        private C8180a() {
        }

        public /* synthetic */ C8180a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8181b {
        /* renamed from: a */
        void mo44364a(C3033r3 c3033r3);
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$c */
    /* loaded from: classes4.dex */
    static final class C8182c extends AbstractC19075u implements InterfaceC18494a {
        C8182c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13621e2 mo12V4() {
            return new C13621e2(FeedItemZaloVideoView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$d */
    /* loaded from: classes4.dex */
    public static final class C8183d extends C23999j {
        C8183d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                FeedItemZaloVideoView.this.getVideoView().setEnableBlurThumb(false);
                FeedItemZaloVideoView.this.getVideoView().setLoadingViewImageInfo(c3979l);
                FeedItemZaloVideoView.this.getVideoView().setLoadingViewScaleType(FeedItemZaloVideoView.this.getVideoThumbnailView().getScaleType());
                FeedItemZaloVideoView.this.getVideoThumbnailView().setImageBitmap(c3979l.m18839c());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$e */
    /* loaded from: classes4.dex */
    static final class C8184e extends AbstractC19075u implements InterfaceC18494a {
        C8184e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeedVideoSpeakerView mo12V4() {
            return (FeedVideoSpeakerView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.btn_speaker);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$f */
    /* loaded from: classes4.dex */
    static final class C8185f extends AbstractC19075u implements InterfaceC18494a {
        C8185f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclingImageView mo12V4() {
            return (RecyclingImageView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.chanel_avatar_view);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$g */
    /* loaded from: classes4.dex */
    static final class C8186g extends AbstractC19075u implements InterfaceC18494a {
        C8186g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclingImageView mo12V4() {
            return (RecyclingImageView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.zalo_video_logo_view);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$h */
    /* loaded from: classes4.dex */
    static final class C8187h extends AbstractC19075u implements InterfaceC18494a {
        C8187h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.channel_name_view);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$i */
    /* loaded from: classes4.dex */
    static final class C8188i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8188i f44987q = new C8188i();

        C8188i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19529b mo12V4() {
            return new C19529b(null, null, null, 7, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$j */
    /* loaded from: classes4.dex */
    static final class C8189j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8189j f44988q = new C8189j();

        C8189j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19528a mo12V4() {
            return new C19528a(0, 0, 0L, 0, 0, 0, 63, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$k */
    /* loaded from: classes4.dex */
    static final class C8190k extends AbstractC19075u implements InterfaceC18494a {
        C8190k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.player_debug_view);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$l */
    /* loaded from: classes4.dex */
    static final class C8191l extends AbstractC19075u implements InterfaceC18494a {
        C8191l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo12V4() {
            return (FrameLayout) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.zalo_video_error_view);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$m */
    /* loaded from: classes4.dex */
    static final class C8192m extends AbstractC19075u implements InterfaceC18494a {
        C8192m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RelativeLayout mo12V4() {
            return (RelativeLayout) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.zalo_video_header);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$n */
    /* loaded from: classes4.dex */
    static final class C8193n extends AbstractC19075u implements InterfaceC18494a {
        C8193n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProgressBar mo12V4() {
            return (ProgressBar) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.pbVideoProcessing);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$o */
    /* loaded from: classes4.dex */
    static final class C8194o extends AbstractC19075u implements InterfaceC18494a {
        C8194o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo12V4() {
            return (FrameLayout) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.zalo_video_placeholder);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$p */
    /* loaded from: classes4.dex */
    static final class C8195p extends AbstractC19075u implements InterfaceC18494a {
        C8195p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclingImageView mo12V4() {
            return (RecyclingImageView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.button_play_video);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$q */
    /* loaded from: classes4.dex */
    static final class C8196q extends AbstractC19075u implements InterfaceC18494a {
        C8196q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclingImageView mo12V4() {
            return (RecyclingImageView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.button_retry_load_feed);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$r */
    /* loaded from: classes4.dex */
    static final class C8197r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8197r f44996q = new C8197r();

        C8197r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19531d mo12V4() {
            return new C19531d();
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$s */
    /* loaded from: classes4.dex */
    static final class C8198s extends AbstractC19075u implements InterfaceC18494a {
        C8198s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button mo12V4() {
            return (Button) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.view_detail_zalo_video_button);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$t */
    /* loaded from: classes4.dex */
    static final class C8199t extends AbstractC19075u implements InterfaceC18494a {
        C8199t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo12V4() {
            return (FrameLayout) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.zalo_video_thumb_group);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$u */
    /* loaded from: classes4.dex */
    public static final class C8200u implements FeedVideoSpeakerView.InterfaceC8412a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC2259a f45000b;

        C8200u(InterfaceC2259a interfaceC2259a) {
            this.f45000b = interfaceC2259a;
        }

        @Override // com.zing.zalo.feed.components.video.FeedVideoSpeakerView.InterfaceC8412a
        /* renamed from: a */
        public void mo44382a() {
            InterfaceC2259a interfaceC2259a;
            if (FeedItemZaloVideoView.this.f44957K0 && (interfaceC2259a = this.f45000b) != null) {
                interfaceC2259a.mo11950cx();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$v */
    /* loaded from: classes4.dex */
    static final class C8201v extends AbstractC19075u implements InterfaceC18494a {
        C8201v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclingImageView mo12V4() {
            return (RecyclingImageView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.thumb_zalo_video);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemZaloVideoView$w */
    /* loaded from: classes4.dex */
    static final class C8202w extends AbstractC19075u implements InterfaceC18494a {
        C8202w() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZVideoView mo12V4() {
            return (ZVideoView) FeedItemZaloVideoView.this.findViewById(AbstractC6918a0.zalo_video_view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemZaloVideoView(Context context) {
        super(context);
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
        InterfaceC24854k m129210a14;
        InterfaceC24854k m129210a15;
        InterfaceC24854k m129210a16;
        InterfaceC24854k m129210a17;
        InterfaceC24854k m129210a18;
        InterfaceC24854k m129210a19;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C8202w());
        this.f44972r0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8188i.f44987q);
        this.f44974t0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8201v());
        this.f44975u0 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C8199t());
        this.f44976v0 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C8191l());
        this.f44977w0 = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C8194o());
        this.f44978x0 = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C8193n());
        this.f44979y0 = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C8198s());
        this.f44980z0 = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C8192m());
        this.f44947A0 = m129210a9;
        m129210a10 = AbstractC24856m.m129210a(new C8185f());
        this.f44948B0 = m129210a10;
        m129210a11 = AbstractC24856m.m129210a(new C8186g());
        this.f44949C0 = m129210a11;
        m129210a12 = AbstractC24856m.m129210a(new C8187h());
        this.f44950D0 = m129210a12;
        m129210a13 = AbstractC24856m.m129210a(new C8184e());
        this.f44951E0 = m129210a13;
        m129210a14 = AbstractC24856m.m129210a(new C8182c());
        this.f44952F0 = m129210a14;
        m129210a15 = AbstractC24856m.m129210a(new C8196q());
        this.f44953G0 = m129210a15;
        m129210a16 = AbstractC24856m.m129210a(new C8195p());
        this.f44954H0 = m129210a16;
        m129210a17 = AbstractC24856m.m129210a(new C8190k());
        this.f44955I0 = m129210a17;
        this.f44957K0 = true;
        this.f44960N0 = true;
        this.f44963Q0 = "Zalo Video";
        m129210a18 = AbstractC24856m.m129210a(C8189j.f44988q);
        this.f44967U0 = m129210a18;
        m129210a19 = AbstractC24856m.m129210a(C8197r.f44996q);
        this.f44968V0 = m129210a19;
        View.inflate(getContext(), AbstractC7409c0.feed_item_zalo_video_link, this);
        this.f44971Y0 = new Runnable() { // from class: com.zing.zalo.feed.components.z5
            @Override // java.lang.Runnable
            public final void run() {
                FeedItemZaloVideoView.m44324T0(FeedItemZaloVideoView.this);
            }
        };
    }

    /* renamed from: A0 */
    private final boolean m44304A0(C3020p0 c3020p0) {
        String str;
        C18537g c18537g = C18537g.f93231a;
        if (c3020p0 != null) {
            str = c3020p0.f12057p;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        EnumC18536f m97932a = c18537g.m97932a(str);
        getStateHandler().m102095e(m97932a);
        if (m97932a == EnumC18536f.f93225q) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    private final boolean m44305B0(C3020p0 c3020p0) {
        String str;
        C18537g c18537g = C18537g.f93231a;
        if (c3020p0 != null) {
            str = c3020p0.f12057p;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        EnumC18536f m97932a = c18537g.m97932a(str);
        getStateHandler().m102095e(m97932a);
        if (m97932a == EnumC18536f.f93224p) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    private final boolean m44306D0(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    private final void m44307E0(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a) {
        String str = c3020p0.f12023C.f12134y.f12141d;
        try {
            if (!TextUtils.isEmpty(str) && interfaceC2259a != null) {
                FeedActionZUtils.m47527O(str, c3020p0, FeedActionZUtils.m47565w(this.f44296f0), interfaceC2259a);
            }
        } catch (ActivityNotFoundException unused) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11933RC(str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G0 */
    private final void m44308G0() {
        boolean z11;
        boolean z12;
        int i11;
        C3025q0 c3025q0;
        C3023p3 c3023p3;
        boolean z13 = false;
        if (this.f44296f0 == 4) {
            getVideoView().setStateSpeaker(false);
            return;
        }
        boolean isPlaying = getVideoView().isPlaying();
        if (C29116a.f134962a.mo117210a() && C26356e.f125201a.mo117210a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(10);
        if (playConfig != null) {
            playConfig.setEnablePlayInRange(true);
        }
        if (playConfig != null) {
            C3020p0 c3020p0 = this.f44956J0;
            if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (c3023p3 = c3025q0.f12100I) != null) {
                i11 = c3023p3.m14546c();
            } else {
                i11 = -1;
            }
            playConfig.setEnablePlayInRangeDuration(i11);
        }
        if (playConfig != null) {
            if (!getVideoView().m92404K() && (!z11 || !this.f44957K0 || !isPlaying)) {
                z12 = true;
            } else {
                z12 = false;
            }
            playConfig.setSilent(z12);
        }
        getVideoView().setPlayConfig(playConfig);
        ZVideoView videoView = getVideoView();
        if (z11 && this.f44957K0 && isPlaying) {
            z13 = true;
        }
        videoView.setStateSpeaker(z13);
    }

    /* renamed from: H0 */
    private final void m44309H0() {
        getDebugContent().m102078a();
    }

    /* renamed from: I0 */
    private final void m44310I0(float f11) {
        m44309H0();
        if (f11 == 2.3f) {
            m44357F0();
        }
        if (this.f44958L0 <= 0) {
            this.f44958L0 = AbstractC23136l9.m118766z(getContext());
        }
        getVideoView().setVideoPlayerMode(1);
        getVideoView().setUseVideoRatio(false);
        int i11 = this.f44958L0;
        int i12 = (int) (i11 / f11);
        int width = getVideoView().getWidth();
        int height = getVideoView().getHeight();
        if (width != i11 || height != i12) {
            ViewGroup.LayoutParams layoutParams = getVideoView().getLayoutParams();
            AbstractC19074t.m100207e(layoutParams, "getLayoutParams(...)");
            layoutParams.width = i11;
            layoutParams.height = i12;
            getVideoView().setLayoutParams(layoutParams);
        }
    }

    /* renamed from: J0 */
    private final void m44311J0() {
        int i11;
        C3025q0 c3025q0;
        C3023p3 c3023p3;
        C3025q0 c3025q02;
        C3023p3 c3023p32;
        C3020p0 c3020p0 = this.f44956J0;
        if ((c3020p0 != null && this.f44296f0 == 0) || this.f44296f0 == 4) {
            int i12 = 0;
            if (c3020p0 != null && (c3025q02 = c3020p0.f12023C) != null && (c3023p32 = c3025q02.f12100I) != null) {
                i11 = c3023p32.m14549f();
            } else {
                i11 = 0;
            }
            C3020p0 c3020p02 = this.f44956J0;
            if (c3020p02 != null && (c3025q0 = c3020p02.f12023C) != null && (c3023p3 = c3025q0.f12100I) != null) {
                i12 = c3023p3.m14553j();
            }
            getDebugContent().m102084h(i12);
            getDebugContent().m102083g(i11);
            if (i11 > i12) {
                getVideoView().setVideoPlayerMode(1);
                getVideoThumbnailView().setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                getVideoView().setVideoPlayerMode(2);
                getVideoThumbnailView().setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
    }

    /* renamed from: M0 */
    private final void m44312M0(final C3020p0 c3020p0, final InterfaceC2259a interfaceC2259a) {
        this.f44970X0 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.a6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemZaloVideoView.m44313N0(C3020p0.this, this, interfaceC2259a, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m44313N0(C3020p0 c3020p0, FeedItemZaloVideoView feedItemZaloVideoView, InterfaceC2259a interfaceC2259a, View view) {
        C3023p3 c3023p3;
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        C3025q0 c3025q0 = c3020p0.f12023C;
        if (c3025q0 != null && (c3023p3 = c3025q0.f12100I) != null && c3023p3.m14558o()) {
            InterfaceC8181b interfaceC8181b = feedItemZaloVideoView.f44969W0;
            if (interfaceC8181b != null) {
                interfaceC8181b.mo44364a(feedItemZaloVideoView.m44347q0());
                return;
            }
            return;
        }
        feedItemZaloVideoView.m44307E0(c3020p0, interfaceC2259a);
    }

    /* renamed from: P0 */
    private final void m44316P0() {
        try {
            this.f44966T0 = false;
            Handler handler = this.f44303m0;
            if (handler != null) {
                handler.removeCallbacks(this.f44971Y0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Q0 */
    private final void m44318Q0() {
        C19528a debugContent = getDebugContent();
        C23030c2.a aVar = C23030c2.Companion;
        debugContent.m102081e(aVar.m118102a().m118101d());
        getDebugContent().m102080d(aVar.m118102a().m118100c());
        getDebugView().setText(getDebugContent().toString());
    }

    /* renamed from: R0 */
    private final void m44320R0(InterfaceC2259a interfaceC2259a) {
        if (this.f44296f0 == 0) {
            if (this.f44957K0 && C29116a.f134962a.mo117210a() && C26356e.f125201a.mo117210a()) {
                getButtonSpeaker().m44953h(FeedVideoSpeakerView.EnumC8413b.f45824q);
            } else if (this.f44957K0) {
                getButtonSpeaker().m44953h(FeedVideoSpeakerView.EnumC8413b.f45823p);
            } else {
                getButtonSpeaker().m44953h(FeedVideoSpeakerView.EnumC8413b.f45825r);
            }
            getButtonSpeaker().setSpeakViewCallback(new C8200u(interfaceC2259a));
        }
        m44308G0();
    }

    /* renamed from: S0 */
    private final void m44322S0() {
        this.f44303m0.postDelayed(this.f44971Y0, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static final void m44324T0(final FeedItemZaloVideoView feedItemZaloVideoView) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        if (feedItemZaloVideoView.f44956J0 != null) {
            int videoFPS = feedItemZaloVideoView.getVideoView().getVideoFPS();
            if (videoFPS >= 0) {
                C26333b c26333b = C26333b.f125013a;
                C3020p0 c3020p0 = feedItemZaloVideoView.f44956J0;
                AbstractC19074t.m100205c(c3020p0);
                String str = c3020p0.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                c26333b.m135523s(str, 1, videoFPS);
            }
            if (feedItemZaloVideoView.f44966T0) {
                feedItemZaloVideoView.m44322S0();
            }
        }
        if (C19531d.Companion.m102096a()) {
            feedItemZaloVideoView.getDebugContent().m102079c(feedItemZaloVideoView.getVideoView().getCurrentPosition());
            feedItemZaloVideoView.getDebugView().post(new Runnable() { // from class: com.zing.zalo.feed.components.r5
                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemZaloVideoView.m44326U0(FeedItemZaloVideoView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static final void m44326U0(FeedItemZaloVideoView feedItemZaloVideoView) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        feedItemZaloVideoView.getDebugView().setText(feedItemZaloVideoView.getDebugContent().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:6:0x0008, B:9:0x000f, B:11:0x0017, B:16:0x0028, B:17:0x0071, B:19:0x0080, B:23:0x008a, B:25:0x008e, B:27:0x0095, B:29:0x0099, B:31:0x009d, B:33:0x00a4, B:35:0x00a8, B:37:0x00ac, B:39:0x00b3, B:41:0x00b7, B:43:0x00bb, B:47:0x00c3, B:49:0x00c7, B:52:0x00d0, B:54:0x00d4, B:56:0x00da, B:59:0x00e9, B:62:0x00f1, B:64:0x0177, B:66:0x018b, B:68:0x018f, B:69:0x0195, B:71:0x019c, B:73:0x01a0, B:75:0x01a8, B:77:0x01b0, B:78:0x01d5, B:80:0x01db, B:81:0x01e2, B:83:0x01e6, B:85:0x01eb, B:86:0x01ed, B:88:0x01f3, B:89:0x0209, B:91:0x020f, B:92:0x0224, B:94:0x022a, B:96:0x01a6, B:98:0x00f9, B:99:0x00ff, B:101:0x0105, B:102:0x010b, B:105:0x011b, B:107:0x0121, B:109:0x0125, B:112:0x013e, B:114:0x012c, B:117:0x0133, B:122:0x0145, B:124:0x014f, B:126:0x0159, B:128:0x0163, B:129:0x0169, B:131:0x0172, B:145:0x023a, B:152:0x0052, B:157:0x0064), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:6:0x0008, B:9:0x000f, B:11:0x0017, B:16:0x0028, B:17:0x0071, B:19:0x0080, B:23:0x008a, B:25:0x008e, B:27:0x0095, B:29:0x0099, B:31:0x009d, B:33:0x00a4, B:35:0x00a8, B:37:0x00ac, B:39:0x00b3, B:41:0x00b7, B:43:0x00bb, B:47:0x00c3, B:49:0x00c7, B:52:0x00d0, B:54:0x00d4, B:56:0x00da, B:59:0x00e9, B:62:0x00f1, B:64:0x0177, B:66:0x018b, B:68:0x018f, B:69:0x0195, B:71:0x019c, B:73:0x01a0, B:75:0x01a8, B:77:0x01b0, B:78:0x01d5, B:80:0x01db, B:81:0x01e2, B:83:0x01e6, B:85:0x01eb, B:86:0x01ed, B:88:0x01f3, B:89:0x0209, B:91:0x020f, B:92:0x0224, B:94:0x022a, B:96:0x01a6, B:98:0x00f9, B:99:0x00ff, B:101:0x0105, B:102:0x010b, B:105:0x011b, B:107:0x0121, B:109:0x0125, B:112:0x013e, B:114:0x012c, B:117:0x0133, B:122:0x0145, B:124:0x014f, B:126:0x0159, B:128:0x0163, B:129:0x0169, B:131:0x0172, B:145:0x023a, B:152:0x0052, B:157:0x0064), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:6:0x0008, B:9:0x000f, B:11:0x0017, B:16:0x0028, B:17:0x0071, B:19:0x0080, B:23:0x008a, B:25:0x008e, B:27:0x0095, B:29:0x0099, B:31:0x009d, B:33:0x00a4, B:35:0x00a8, B:37:0x00ac, B:39:0x00b3, B:41:0x00b7, B:43:0x00bb, B:47:0x00c3, B:49:0x00c7, B:52:0x00d0, B:54:0x00d4, B:56:0x00da, B:59:0x00e9, B:62:0x00f1, B:64:0x0177, B:66:0x018b, B:68:0x018f, B:69:0x0195, B:71:0x019c, B:73:0x01a0, B:75:0x01a8, B:77:0x01b0, B:78:0x01d5, B:80:0x01db, B:81:0x01e2, B:83:0x01e6, B:85:0x01eb, B:86:0x01ed, B:88:0x01f3, B:89:0x0209, B:91:0x020f, B:92:0x0224, B:94:0x022a, B:96:0x01a6, B:98:0x00f9, B:99:0x00ff, B:101:0x0105, B:102:0x010b, B:105:0x011b, B:107:0x0121, B:109:0x0125, B:112:0x013e, B:114:0x012c, B:117:0x0133, B:122:0x0145, B:124:0x014f, B:126:0x0159, B:128:0x0163, B:129:0x0169, B:131:0x0172, B:145:0x023a, B:152:0x0052, B:157:0x0064), top: B:5:0x0008 }] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3020p0 m44336e0(C3000l0 c3000l0, int i11, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2259a interfaceC2259a) {
        C3020p0 c3020p0;
        int i12;
        String str;
        String str2;
        String str3;
        int i13;
        C3025q0 c3025q0;
        String str4;
        C3023p3 c3023p3;
        C3023p3 c3023p32;
        C3023p3 c3023p33;
        String m14552i;
        C3023p3 c3023p34;
        C3023p3 c3023p35;
        C3023p3 c3023p36;
        if (c3000l0 == null) {
            return null;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return null;
            }
            int i14 = this.f44296f0;
            if (i14 == 0) {
                i12 = 4;
                c3020p0 = m14324b0;
                AbstractC20814p0.m108598C0(m14324b0, this.f44269B, this.f44271D, null, this.f44274G, i14 != 4, i14 == 0, context, interfaceC10867f, null, false, this.f44299i0, i14);
                m44320R0(interfaceC2259a);
            } else {
                c3020p0 = m14324b0;
                i12 = 4;
                if (i14 == 4) {
                    AbstractC20814p0.m108598C0(c3020p0, this.f44269B, this.f44271D, this.f44272E, this.f44274G, i14 != 4, i14 == 0, context, interfaceC10867f, null, true, this.f44299i0, i14);
                }
            }
            C3020p0 c3020p02 = c3020p0;
            AbstractC20814p0.m108669s0(context, c3020p02, this.f44283P, interfaceC2259a, this.f44296f0);
            C3025q0 c3025q02 = c3020p02.f12023C;
            if ((c3025q02 != null ? c3025q02.f12100I : null) != null) {
                String str5 = "";
                if (c3025q02 == null || (c3023p36 = c3025q02.f12100I) == null || (str = c3023p36.m14547d()) == null) {
                    str = "";
                }
                C3025q0 c3025q03 = c3020p02.f12023C;
                if (c3025q03 == null || (c3023p35 = c3025q03.f12100I) == null || (str2 = c3023p35.m14548e()) == null) {
                    str2 = "";
                }
                C3025q0 c3025q04 = c3020p02.f12023C;
                if (c3025q04 == null || (c3023p34 = c3025q04.f12100I) == null || (str3 = c3023p34.m14555l()) == null) {
                    str3 = "";
                }
                C3025q0 c3025q05 = c3020p02.f12023C;
                if (c3025q05 != null && (c3023p33 = c3025q05.f12100I) != null && (m14552i = c3023p33.m14552i()) != null) {
                    str5 = m14552i;
                }
                C3000l0 c3000l02 = this.f44298h0;
                boolean z11 = c3000l02 != null && c3000l02.m14285C0();
                C3000l0 c3000l03 = this.f44298h0;
                boolean z12 = (c3000l03 == null || c3000l03.m14322a0() == null || this.f44298h0.m14322a0().m14498b0()) ? false : true;
                if (m44305B0(c3020p02)) {
                    if (z11) {
                        m44348r0(AbstractC19530c.e.f96987a);
                    } else {
                        m44348r0(AbstractC19530c.c.f96985a);
                    }
                } else if (m44304A0(c3020p02)) {
                    m44348r0(AbstractC19530c.b.f96984a);
                } else {
                    if (m44355z0(c3020p02)) {
                        try {
                            m44339h0();
                            return null;
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC23350e.m122778h(e);
                            return null;
                        }
                    }
                    if (m44354y0(c3020p02)) {
                        m44337f0(c3020p02, interfaceC2259a);
                        return null;
                    }
                    if (str2.length() != 0 && str.length() != 0 && str5.length() != 0 && (!z11 || !z12)) {
                        if (!getVideoView().isPlaying()) {
                            if (getVideoView().getCurrentState() != i12 && !m44306D0(getLoadingView())) {
                                m44348r0(AbstractC19530c.c.f96985a);
                            } else {
                                i13 = 1;
                                i13 = 1;
                                if (!C20047i.Companion.m104098b(1)) {
                                    m44348r0(AbstractC19530c.f.f96988a);
                                }
                                C24003n m120126f0 = C23278z2.m120126f0();
                                m120126f0.f116261b = AbstractC23136l9.m118663M(AbstractC28292b.ng85);
                                C19528a debugContent = getDebugContent();
                                C3025q0 c3025q06 = c3020p02.f12023C;
                                debugContent.m102082f((c3025q06 != null || (c3023p32 = c3025q06.f12100I) == null) ? -1 : c3023p32.m14546c());
                                c3025q0 = c3020p02.f12023C;
                                if (c3025q0 != null || (c3023p3 = c3025q0.f12100I) == null || (str4 = c3023p3.m14556m()) == null) {
                                    str4 = this.f44963Q0;
                                }
                                if (!AbstractC19074t.m100204b(str4, this.f44963Q0)) {
                                    Button suggestButton = getSuggestButton();
                                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_zalo_video_button);
                                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                    Object[] objArr = new Object[i13];
                                    objArr[0] = this.f44963Q0;
                                    String format = String.format(m118743r0, Arrays.copyOf(objArr, i13));
                                    AbstractC19074t.m100207e(format, "format(...)");
                                    suggestButton.setText(format);
                                }
                                if (str2.length() > 0) {
                                    getChannelNameView().setText(str2);
                                }
                                if (this.f44295e0 != null) {
                                    if (this.f44296f0 == 2) {
                                        m120126f0.f116284y = i13;
                                    }
                                    if (str5.length() > 0) {
                                        ((C23528a) this.f44295e0.m123612r(getVideoThumbnailView())).m123578B(str5, m120126f0, C3979l.b.UNKNOWN, new C8183d());
                                    }
                                    if (str.length() > 0) {
                                        ((C23528a) this.f44295e0.m123612r(getChannelAvatarView())).m123618x(str, C23278z2.f112845a.m120174r());
                                    }
                                    if (str3.length() > 0) {
                                        ((C23528a) this.f44295e0.m123612r(getChannelLogoView())).m123616v(str3);
                                    }
                                }
                                return c3020p02;
                            }
                        }
                    }
                    m44348r0(AbstractC19530c.e.f96987a);
                    return null;
                }
                i13 = 1;
                C24003n m120126f02 = C23278z2.m120126f0();
                m120126f02.f116261b = AbstractC23136l9.m118663M(AbstractC28292b.ng85);
                C19528a debugContent2 = getDebugContent();
                C3025q0 c3025q062 = c3020p02.f12023C;
                debugContent2.m102082f((c3025q062 != null || (c3023p32 = c3025q062.f12100I) == null) ? -1 : c3023p32.m14546c());
                c3025q0 = c3020p02.f12023C;
                if (c3025q0 != null) {
                }
                str4 = this.f44963Q0;
                if (!AbstractC19074t.m100204b(str4, this.f44963Q0)) {
                }
                if (str2.length() > 0) {
                }
                if (this.f44295e0 != null) {
                }
                return c3020p02;
            }
            m44339h0();
            return null;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: f0 */
    private final void m44337f0(C3020p0 c3020p0, final InterfaceC2259a interfaceC2259a) {
        this.f44956J0 = c3020p0;
        getRetryView().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.p5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemZaloVideoView.m44338g0(InterfaceC2259a.this, this, view);
            }
        });
        if (this.f44973s0 != null) {
            try {
                getVideoView().m92412f0(true);
            } catch (Exception e11) {
                AbstractC23350e.m122777g(e11.getMessage(), new Object[0]);
            }
        }
        m44348r0(AbstractC19530c.i.f96991a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m44338g0(InterfaceC2259a interfaceC2259a, FeedItemZaloVideoView feedItemZaloVideoView, View view) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        if (C23055e5.m118272g(false)) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11947bw(feedItemZaloVideoView.f44298h0);
            }
        } else {
            String string = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.NETWORK_ERROR_MSG);
            AbstractC19074t.m100207e(string, "getString(...)");
            ToastUtils.showMess(false, string, true, true, 0, AbstractC7409c0.toast_layout);
        }
    }

    private final C13621e2 getAnimRhythm() {
        return (C13621e2) this.f44952F0.getValue();
    }

    private final FeedVideoSpeakerView getButtonSpeaker() {
        Object value = this.f44951E0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FeedVideoSpeakerView) value;
    }

    private final RecyclingImageView getChannelAvatarView() {
        Object value = this.f44948B0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclingImageView) value;
    }

    private final RecyclingImageView getChannelLogoView() {
        Object value = this.f44949C0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclingImageView) value;
    }

    private final RobotoTextView getChannelNameView() {
        Object value = this.f44950D0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    private final C19529b getCurrentZShortItemInfo() {
        return (C19529b) this.f44974t0.getValue();
    }

    private final C19528a getDebugContent() {
        return (C19528a) this.f44967U0.getValue();
    }

    private final RobotoTextView getDebugView() {
        Object value = this.f44955I0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    private final FrameLayout getErrorView() {
        Object value = this.f44977w0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final RelativeLayout getFeedDetailHeaderContainerView() {
        Object value = this.f44947A0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RelativeLayout) value;
    }

    private final ProgressBar getLoadingView() {
        Object value = this.f44979y0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ProgressBar) value;
    }

    private final FrameLayout getPlaceholderView() {
        Object value = this.f44978x0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final RecyclingImageView getPlayButton() {
        Object value = this.f44954H0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclingImageView) value;
    }

    private final RecyclingImageView getRetryView() {
        Object value = this.f44953G0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclingImageView) value;
    }

    private final C19531d getStateHandler() {
        return (C19531d) this.f44968V0.getValue();
    }

    private final Button getSuggestButton() {
        Object value = this.f44980z0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Button) value;
    }

    private final FrameLayout getSuggestView() {
        Object value = this.f44976v0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (FrameLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclingImageView getVideoThumbnailView() {
        Object value = this.f44975u0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RecyclingImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ZVideoView getVideoView() {
        Object value = this.f44972r0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ZVideoView) value;
    }

    /* renamed from: h0 */
    private final void m44339h0() {
        m44357F0();
        getDebugContent().m102078a();
        getDebugView().setText(getDebugContent().toString());
        m44348r0(AbstractC19530c.a.f96983a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final boolean m44340j0(final FeedItemZaloVideoView feedItemZaloVideoView, final InterfaceC2259a interfaceC2259a, IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        if (iMediaPlayer != null) {
            if (i11 == 3) {
                feedItemZaloVideoView.getVideoView().getVideoController().m92305g();
                C3020p0 c3020p0 = feedItemZaloVideoView.f44956J0;
                if (c3020p0 != null) {
                    C25482o c25482o = C25482o.f122075a;
                    String str = c3020p0.f12057p;
                    AbstractC19074t.m100207e(str, "fid");
                    c25482o.m131992M(str);
                }
                feedItemZaloVideoView.m44348r0(AbstractC19530c.g.f96989a);
                feedItemZaloVideoView.f44962P0 = false;
            } else {
                boolean z11 = true;
                if (i11 == 10022) {
                    if (i12 == 0) {
                        z11 = false;
                    }
                    feedItemZaloVideoView.f44957K0 = z11;
                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.q5
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedItemZaloVideoView.m44341k0(FeedItemZaloVideoView.this, interfaceC2259a);
                        }
                    });
                } else if (i11 == 702 && feedItemZaloVideoView.getVideoView().isPlaying()) {
                    feedItemZaloVideoView.f44962P0 = false;
                    feedItemZaloVideoView.m44348r0(AbstractC19530c.g.f96989a);
                } else if (i11 == 701) {
                    feedItemZaloVideoView.m44348r0(AbstractC19530c.d.f96986a);
                } else if (i11 == 704) {
                    feedItemZaloVideoView.f44962P0 = true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m44341k0(FeedItemZaloVideoView feedItemZaloVideoView, InterfaceC2259a interfaceC2259a) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        feedItemZaloVideoView.m44320R0(interfaceC2259a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m44342l0(C17391z c17391z, FeedItemZaloVideoView feedItemZaloVideoView) {
        AbstractC19074t.m100208f(c17391z, "$it");
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        try {
            c17391z.f88629l = 1;
            feedItemZaloVideoView.getVideoView().setZVideo(feedItemZaloVideoView.f44973s0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final boolean m44343m0(FeedItemZaloVideoView feedItemZaloVideoView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        if (motionEvent.getAction() == 1) {
            InterfaceC8181b interfaceC8181b = feedItemZaloVideoView.f44969W0;
            if (interfaceC8181b == null) {
                return true;
            }
            interfaceC8181b.mo44364a(feedItemZaloVideoView.m44347q0());
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final boolean m44344n0(InterfaceC2259a interfaceC2259a, FeedItemZaloVideoView feedItemZaloVideoView, IMediaPlayer iMediaPlayer, int i11, int i12) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        if (i11 == -10000) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11944Zf(feedItemZaloVideoView.f44298h0);
            }
            feedItemZaloVideoView.m44348r0(AbstractC19530c.a.f96983a);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m44345o0(FeedItemZaloVideoView feedItemZaloVideoView, int i11) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 == 6) {
                            feedItemZaloVideoView.m44348r0(AbstractC19530c.c.f96985a);
                            return;
                        }
                        return;
                    } else {
                        feedItemZaloVideoView.f44961O0 = true;
                        feedItemZaloVideoView.f44965S0 = true;
                        feedItemZaloVideoView.m44316P0();
                        feedItemZaloVideoView.m44348r0(AbstractC19530c.j.f96992a);
                        return;
                    }
                }
                feedItemZaloVideoView.m44316P0();
                feedItemZaloVideoView.m44348r0(AbstractC19530c.f.f96988a);
                return;
            }
            C7853b.a aVar = C7853b.Companion;
            aVar.m40150a().m40108T0();
            aVar.m40150a().m40136j1();
            feedItemZaloVideoView.m44308G0();
            feedItemZaloVideoView.m44316P0();
            feedItemZaloVideoView.f44966T0 = true;
            feedItemZaloVideoView.m44322S0();
            feedItemZaloVideoView.m44348r0(AbstractC19530c.g.f96989a);
            return;
        }
        feedItemZaloVideoView.m44348r0(AbstractC19530c.h.f96990a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m44346p0(FeedItemZaloVideoView feedItemZaloVideoView, IMediaPlayer iMediaPlayer) {
        String str;
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        try {
            feedItemZaloVideoView.getVideoView().getVideoController().m92303b0();
            feedItemZaloVideoView.getVideoView().getVideoController().m92305g();
            C17391z c17391z = feedItemZaloVideoView.f44973s0;
            if (c17391z != null) {
                str = c17391z.f88618a;
            } else {
                str = null;
            }
            AbstractC20049k.m104118l(str, 1);
            feedItemZaloVideoView.getVideoView().setKeepScreenOn(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: q0 */
    private final C3033r3 m44347q0() {
        String str;
        String str2;
        int currentPosition;
        C3025q0 c3025q0;
        C3023p3 c3023p3;
        C3025q0 c3025q02;
        C3023p3 c3023p32;
        C3020p0 c3020p0;
        C3025q0 c3025q03;
        C3023p3 c3023p33;
        String m14554k;
        C3020p0 c3020p02 = this.f44956J0;
        String str3 = "";
        if (c3020p02 != null && (c3025q02 = c3020p02.f12023C) != null && (c3023p32 = c3025q02.f12100I) != null && c3023p32.m14558o() && (c3020p0 = this.f44956J0) != null && (c3025q03 = c3020p0.f12023C) != null && (c3023p33 = c3025q03.f12100I) != null && (m14554k = c3023p33.m14554k()) != null) {
            str3 = m14554k;
        }
        if (C20048j.f98580a.m104105d()) {
            str = "manual";
        } else {
            str = "auto";
        }
        boolean z11 = this.f44961O0;
        if (z11) {
            str2 = "watch_more";
        } else {
            str2 = "player";
        }
        if (z11) {
            C3020p0 c3020p03 = this.f44956J0;
            if (c3020p03 != null && (c3025q0 = c3020p03.f12023C) != null && (c3023p3 = c3025q0.f12100I) != null) {
                currentPosition = c3023p3.m14546c();
            } else {
                currentPosition = 0;
            }
        } else {
            currentPosition = getVideoView().getCurrentPosition() / 1000;
        }
        return new C3033r3(str3, str, str2, currentPosition);
    }

    /* renamed from: r0 */
    private final void m44348r0(AbstractC19530c abstractC19530c) {
        C19531d.b m102093c;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.f44296f0 == 4) {
            m102093c = getStateHandler().m102094d(abstractC19530c);
        } else {
            m102093c = getStateHandler().m102093c(abstractC19530c);
        }
        int i19 = 8;
        if (m102093c.m102101e() ^ m44306D0(getDebugView())) {
            RobotoTextView debugView = getDebugView();
            if (m102093c.m102101e()) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            AbstractC23136l9.m118744r1(debugView, i18);
            if (m102093c.m102101e()) {
                m44318Q0();
            }
        }
        if (m102093c.m102108l() ^ m44306D0(getSuggestView())) {
            FrameLayout suggestView = getSuggestView();
            if (m102093c.m102108l()) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            AbstractC23136l9.m118744r1(suggestView, i17);
        }
        if (m102093c.m102102f() ^ m44306D0(getErrorView())) {
            FrameLayout errorView = getErrorView();
            if (m102093c.m102102f()) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            AbstractC23136l9.m118744r1(errorView, i16);
        }
        if (m102093c.m102109m() ^ m44306D0(getVideoThumbnailView())) {
            RecyclingImageView videoThumbnailView = getVideoThumbnailView();
            if (m102093c.m102109m()) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            AbstractC23136l9.m118744r1(videoThumbnailView, i15);
        }
        if (this.f44964R0 == null) {
            this.f44964R0 = new C28304f(getLoadingView());
        }
        boolean m102104h = m102093c.m102104h();
        C28304f c28304f = this.f44964R0;
        boolean z12 = true;
        if (c28304f != null && c28304f.m142581b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m102104h ^ z11) {
            if (m102093c.m102104h()) {
                C28304f c28304f2 = this.f44964R0;
                if (c28304f2 != null) {
                    c28304f2.m142583e(500L);
                }
            } else {
                C28304f c28304f3 = this.f44964R0;
                if (c28304f3 != null) {
                    c28304f3.m142582d();
                }
            }
        }
        if (m102093c.m102103g() ^ m44306D0(getFeedDetailHeaderContainerView())) {
            RelativeLayout feedDetailHeaderContainerView = getFeedDetailHeaderContainerView();
            if (m102093c.m102103g()) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            AbstractC23136l9.m118744r1(feedDetailHeaderContainerView, i14);
        }
        if (m102093c.m102100d() ^ getButtonSpeaker().m44956n()) {
            if (m102093c.m102100d()) {
                getButtonSpeaker().m44958s();
            } else {
                getButtonSpeaker().m44954i();
            }
        }
        if (m102093c.m102106j() ^ m44306D0(getPlayButton())) {
            RecyclingImageView playButton = getPlayButton();
            if (m102093c.m102106j()) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            AbstractC23136l9.m118744r1(playButton, i13);
        }
        boolean m102099c = m102093c.m102099c();
        if (getAnimRhythm().m89136d0() != 0) {
            z12 = false;
        }
        if (m102099c ^ z12) {
            C13621e2 animRhythm = getAnimRhythm();
            if (m102093c.m102099c()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            animRhythm.mo44614b1(i12);
            if (m102093c.m102099c()) {
                getAnimRhythm().m76197l1(0);
            }
        }
        if (m102093c.m102107k() ^ m44306D0(getRetryView())) {
            RecyclingImageView retryView = getRetryView();
            if (m102093c.m102107k()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(retryView, i11);
        }
        if (m102093c.m102105i() ^ m44306D0(getPlaceholderView())) {
            FrameLayout placeholderView = getPlaceholderView();
            if (m102093c.m102105i()) {
                i19 = 0;
            }
            AbstractC23136l9.m118744r1(placeholderView, i19);
        }
        if (m102093c.m102110n() != getVideoView().getLayoutParams().width / getVideoView().getLayoutParams().height) {
            m44310I0(m102093c.m102110n());
        }
    }

    /* renamed from: s0 */
    private final boolean m44349s0(C3020p0 c3020p0) {
        String str;
        C18537g c18537g = C18537g.f93231a;
        if (c3020p0 != null) {
            str = c3020p0.f12057p;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (getStateHandler().m102092b() == c18537g.m97932a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    private final C17391z m44350u0() {
        return AbstractC20826v0.m108789V(this.f44956J0);
    }

    /* renamed from: v0 */
    private final void m44351v0(Context context, int i11) {
        if (i11 == 0) {
            getPlaceholderView().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.o5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedItemZaloVideoView.m44352w0(view);
                }
            });
            getButtonSpeaker().m44955k();
        } else {
            getAnimRhythm().m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f)).m89032P(0, 0, AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(8.0f));
            getAnimRhythm().m76193h1(0);
            getAnimRhythm().m76192g1(AbstractC23136l9.m118742r(2.0f));
            getAnimRhythm().m76195j1(false);
            getAnimRhythm().m76196k1(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(24.0f));
            getAnimRhythm().m76197l1(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            ModulesView modulesView = new ModulesView(context);
            modulesView.setLayoutParams(layoutParams);
            modulesView.mo69681L(getAnimRhythm());
            addView(modulesView);
        }
        getChannelNameView().setTextStyleBold(true);
        AbstractC23136l9.m118729m1(getVideoView(), AbstractC23136l9.m118742r(10.0f));
        AbstractC23136l9.m118729m1(getSuggestView(), AbstractC23136l9.m118742r(10.0f));
        AbstractC23136l9.m118729m1(getPlaceholderView(), AbstractC23136l9.m118742r(10.0f));
        AbstractC23136l9.m118729m1(getVideoThumbnailView(), AbstractC23136l9.m118742r(10.0f));
        AbstractC23136l9.m118729m1(getChannelAvatarView(), AbstractC23136l9.m118742r(6.0f));
        getVideoView().getVideoController().f88210s.f88566d0 = AbstractC16803z.icn_csc_play_big_selector;
        getVideoView().getVideoController().f88210s.f88567e0 = AbstractC16803z.icn_csc_play_big_selector;
        getVideoView().getVideoController().f88210s.f88572j0 = AbstractC16803z.ic_video_retry_button;
        getVideoView().getVideoController().f88210s.m92507H();
        getVideoView().getVideoController().f88210s.m92515h(false);
        getVideoView().getVideoController().m92304c0();
        getVideoView().getVideoController().setForceHideController(true);
        RecyclingImageView loadingView = getVideoView().getLoadingView();
        if (loadingView != null) {
            loadingView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        RecyclingImageView loadingView2 = getVideoView().getLoadingView();
        if (loadingView2 != null) {
            loadingView2.setImageDrawable(AbstractC23170p.m119357o());
        }
        getErrorView().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemZaloVideoView.m44353x0(FeedItemZaloVideoView.this, view);
            }
        });
        Button suggestButton = getSuggestButton();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_zalo_video_button);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        CharSequence format = String.format(m118743r0, Arrays.copyOf(new Object[]{this.f44963Q0}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        suggestButton.setText(format);
        getDebugContent().m102078a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m44352w0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m44353x0(FeedItemZaloVideoView feedItemZaloVideoView, View view) {
        AbstractC19074t.m100208f(feedItemZaloVideoView, "this$0");
        InterfaceC8181b interfaceC8181b = feedItemZaloVideoView.f44969W0;
        if (interfaceC8181b != null) {
            interfaceC8181b.mo44364a(feedItemZaloVideoView.m44347q0());
        }
    }

    /* renamed from: y0 */
    private final boolean m44354y0(C3020p0 c3020p0) {
        String str;
        C18537g c18537g = C18537g.f93231a;
        if (c3020p0 != null) {
            str = c3020p0.f12057p;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        EnumC18536f m97932a = c18537g.m97932a(str);
        getStateHandler().m102095e(m97932a);
        if (m97932a == EnumC18536f.f93227s) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    private final boolean m44355z0(C3020p0 c3020p0) {
        String str;
        C18537g c18537g = C18537g.f93231a;
        if (c3020p0 != null) {
            str = c3020p0.f12057p;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        EnumC18536f m97932a = c18537g.m97932a(str);
        getStateHandler().m102095e(m97932a);
        if (m97932a == EnumC18536f.f93228t) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public final boolean m44356C0() {
        if ((m44306D0(getSuggestView()) && !getVideoView().isPlaying()) || !this.f44965S0) {
            return true;
        }
        return false;
    }

    /* renamed from: F0 */
    public final void m44357F0() {
        getCurrentZShortItemInfo().m102089e(null);
        getCurrentZShortItemInfo().m102090f(null);
        getCurrentZShortItemInfo().m102088d("");
        this.f44956J0 = null;
        getVideoView().m92429s0();
        getVideoView().m92412f0(false);
        getVideoView().setOnPlayerStateChangedListener(null);
        getVideoView().setOnInfoListener(null);
        m44316P0();
    }

    /* renamed from: K0 */
    public final void m44358K0(int i11, int i12) {
        this.f44958L0 = i11;
        this.f44959M0 = i12;
    }

    /* renamed from: L0 */
    public final void m44359L0() {
    }

    /* renamed from: O0 */
    public final void m44360O0(C3000l0 c3000l0, int i11, boolean z11, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2259a interfaceC2259a) {
        AbstractC19074t.m100208f(context, "context");
        try {
            C3020p0 m44336e0 = m44336e0(c3000l0, i11, context, interfaceC10867f, interfaceC2259a);
            if (c3000l0 != null && m44336e0 != null) {
                C3020p0 c3020p0 = this.f44956J0;
                if (c3020p0 != null) {
                    AbstractC19074t.m100205c(c3020p0);
                    if (!AbstractC19074t.m100204b(c3020p0.f12057p, m44336e0.f12057p)) {
                        this.f44965S0 = false;
                        getButtonSpeaker().m44957p();
                    }
                }
                this.f44956J0 = m44336e0;
                AbstractC19074t.m100205c(m44336e0);
                m44312M0(m44336e0, interfaceC2259a);
                if (z11 && this.f44296f0 == 0) {
                    return;
                }
                m44362i0(interfaceC2259a);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f */
    public final boolean m44361f() {
        boolean z11;
        boolean z12;
        C3020p0 c3020p0;
        C17391z c17391z;
        C3000l0 c3000l0 = this.f44298h0;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l02 = this.f44298h0;
        if (c3000l02 != null && c3000l02.m14322a0() != null && !this.f44298h0.m14322a0().m14498b0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((z11 && z12) || (c3020p0 = this.f44956J0) == null) {
            return false;
        }
        AbstractC19074t.m100205c(c3020p0);
        if (c3020p0.f12023C.f12095D || (c17391z = this.f44973s0) == null) {
            return false;
        }
        AbstractC19074t.m100205c(c17391z);
        if (!c17391z.m92539d(ZMediaPlayerSettings.getVideoConfig(1))) {
            return false;
        }
        return true;
    }

    public final int getDataPosition() {
        Object tag = getTag(AbstractC6918a0.id_video_data_index);
        if (tag != null && (tag instanceof Integer)) {
            return ((Number) tag).intValue();
        }
        return -1;
    }

    public final ZVideoView getNewVideoView() {
        return getVideoView();
    }

    public final C17391z getVideo() {
        return this.f44973s0;
    }

    public final View getVideoDisplayView() {
        int i11 = this.f44296f0;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                }
            }
            return getVideoThumbnailView();
        }
        return getVideoView();
    }

    /* renamed from: i0 */
    public final void m44362i0(final InterfaceC2259a interfaceC2259a) {
        C3023p3 c3023p3;
        int i11;
        C3025q0 c3025q0;
        C3023p3 c3023p32;
        C3025q0 c3025q02;
        C3023p3 c3023p33;
        C3023p3 c3023p34;
        String str;
        C3025q0 c3025q03;
        C17391z m44350u0 = m44350u0();
        this.f44973s0 = m44350u0;
        String str2 = null;
        if (this.f44296f0 == 0 && m44350u0 != null && m44350u0 != null && m44350u0.equals(getCurrentZShortItemInfo().m102086b())) {
            C3023p3 m102087c = getCurrentZShortItemInfo().m102087c();
            C3020p0 c3020p0 = this.f44956J0;
            if (c3020p0 != null && (c3025q03 = c3020p0.f12023C) != null) {
                c3023p34 = c3025q03.f12100I;
            } else {
                c3023p34 = null;
            }
            if (AbstractC19074t.m100204b(m102087c, c3023p34)) {
                String m102085a = getCurrentZShortItemInfo().m102085a();
                C3020p0 c3020p02 = this.f44956J0;
                if (c3020p02 != null) {
                    str = c3020p02.f12057p;
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(m102085a, str) && m44349s0(this.f44956J0)) {
                    return;
                }
            }
        }
        getCurrentZShortItemInfo().m102089e(this.f44973s0);
        C19529b currentZShortItemInfo = getCurrentZShortItemInfo();
        C3020p0 c3020p03 = this.f44956J0;
        if (c3020p03 != null && (c3025q02 = c3020p03.f12023C) != null && (c3023p33 = c3025q02.f12100I) != null) {
            c3023p3 = c3023p33.m14545a((r30 & 1) != 0 ? c3023p33.f12076a : null, (r30 & 2) != 0 ? c3023p33.f12077b : null, (r30 & 4) != 0 ? c3023p33.f12078c : null, (r30 & 8) != 0 ? c3023p33.f12079d : null, (r30 & 16) != 0 ? c3023p33.f12080e : null, (r30 & 32) != 0 ? c3023p33.f12081f : null, (r30 & 64) != 0 ? c3023p33.f12082g : null, (r30 & 128) != 0 ? c3023p33.f12083h : null, (r30 & 256) != 0 ? c3023p33.f12084i : 0, (r30 & 512) != 0 ? c3023p33.f12085j : 0L, (r30 & 1024) != 0 ? c3023p33.f12086k : 0, (r30 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c3023p33.f12087l : 0, (r30 & 4096) != 0 ? c3023p33.f12088m : 0);
        } else {
            c3023p3 = null;
        }
        currentZShortItemInfo.m102090f(c3023p3);
        C19529b currentZShortItemInfo2 = getCurrentZShortItemInfo();
        C3020p0 c3020p04 = this.f44956J0;
        if (c3020p04 != null) {
            str2 = c3020p04.f12057p;
        }
        if (str2 == null) {
            str2 = "";
        }
        currentZShortItemInfo2.m102088d(str2);
        final C17391z c17391z = this.f44973s0;
        if (c17391z != null) {
            m44311J0();
            this.f44303m0.post(new Runnable() { // from class: com.zing.zalo.feed.components.t5
                @Override // java.lang.Runnable
                public final void run() {
                    FeedItemZaloVideoView.m44342l0(C17391z.this, this);
                }
            });
            ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(10);
            if (playConfig != null) {
                playConfig.setEnablePlayInRange(true);
            }
            if (playConfig != null) {
                C3020p0 c3020p05 = this.f44956J0;
                if (c3020p05 != null && (c3025q0 = c3020p05.f12023C) != null && (c3023p32 = c3025q0.f12100I) != null) {
                    i11 = c3023p32.m14546c();
                } else {
                    i11 = -1;
                }
                playConfig.setEnablePlayInRangeDuration(i11);
            }
            if (playConfig != null) {
                playConfig.setSilent(!getVideoView().m92404K());
            }
            getVideoView().setPlayConfig(playConfig);
            getVideoView().setMute(true);
            getVideoView().setVolume(0.0f);
            m44308G0();
            getVideoView().setSkipShowControlWhenStart(true);
            getVideoView().getVideoController().setViewMode(1);
            getVideoView().getVideoController().setOnFullScreenClickListener(this.f44970X0);
            getVideoView().getVideoController().setPlayListener(this.f44970X0);
            getVideoView().setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.feed.components.u5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m44343m0;
                    m44343m0 = FeedItemZaloVideoView.m44343m0(FeedItemZaloVideoView.this, view, motionEvent);
                    return m44343m0;
                }
            });
            getVideoView().setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.zing.zalo.feed.components.v5
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i12, int i13) {
                    boolean m44344n0;
                    m44344n0 = FeedItemZaloVideoView.m44344n0(InterfaceC2259a.this, this, iMediaPlayer, i12, i13);
                    return m44344n0;
                }
            });
            getVideoView().setOnPlayerStateChangedListener(new ZVideoView.InterfaceC17345q() { // from class: com.zing.zalo.feed.components.w5
                @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
                /* renamed from: D */
                public final void mo44076D(int i12) {
                    FeedItemZaloVideoView.m44345o0(FeedItemZaloVideoView.this, i12);
                }
            });
            getVideoView().setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: com.zing.zalo.feed.components.x5
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
                public final void onVideoCompletion(IMediaPlayer iMediaPlayer) {
                    FeedItemZaloVideoView.m44346p0(FeedItemZaloVideoView.this, iMediaPlayer);
                }
            });
            getVideoView().setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.zing.zalo.feed.components.y5
                @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i12, int i13, Object obj) {
                    boolean m44340j0;
                    m44340j0 = FeedItemZaloVideoView.m44340j0(FeedItemZaloVideoView.this, interfaceC2259a, iMediaPlayer, i12, i13, obj);
                    return m44340j0;
                }
            });
            getVideoView().setAudioFocusControl(C28075g8.m141538e());
            if (!getVideoView().isPlaying()) {
                getVideoView().getVideoController().m92306h(true);
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        AbstractC19074t.m100208f(c29106b, "dataObject");
        setFeedContent(c29106b.f134937a);
        mo43681A(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134942f);
        this.f44960N0 = false;
        C3000l0 c3000l0 = c29106b.f134937a;
        boolean z11 = c29106b.f134940d;
        Context context = c29106b.f134939c;
        AbstractC19074t.m100207e(context, "mContext");
        m44360O0(c3000l0, 0, z11, context, c29106b.f134942f, c29106b.f134941e);
        m43687l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.components.FeedItemBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f44960N0) {
            m44357F0();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        this.f44296f0 = i11;
        m44351v0(context, i11);
        super.mo43688p(context, i11);
    }

    public final void setOpenZShortVideoListener(InterfaceC8181b interfaceC8181b) {
        AbstractC19074t.m100208f(interfaceC8181b, "listener");
        this.f44969W0 = interfaceC8181b;
    }

    /* renamed from: t0 */
    public final void m44363t0() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedItemZaloVideoView(Context context, AttributeSet attributeSet) {
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
        InterfaceC24854k m129210a14;
        InterfaceC24854k m129210a15;
        InterfaceC24854k m129210a16;
        InterfaceC24854k m129210a17;
        InterfaceC24854k m129210a18;
        InterfaceC24854k m129210a19;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m129210a = AbstractC24856m.m129210a(new C8202w());
        this.f44972r0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8188i.f44987q);
        this.f44974t0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8201v());
        this.f44975u0 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C8199t());
        this.f44976v0 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C8191l());
        this.f44977w0 = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C8194o());
        this.f44978x0 = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C8193n());
        this.f44979y0 = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C8198s());
        this.f44980z0 = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C8192m());
        this.f44947A0 = m129210a9;
        m129210a10 = AbstractC24856m.m129210a(new C8185f());
        this.f44948B0 = m129210a10;
        m129210a11 = AbstractC24856m.m129210a(new C8186g());
        this.f44949C0 = m129210a11;
        m129210a12 = AbstractC24856m.m129210a(new C8187h());
        this.f44950D0 = m129210a12;
        m129210a13 = AbstractC24856m.m129210a(new C8184e());
        this.f44951E0 = m129210a13;
        m129210a14 = AbstractC24856m.m129210a(new C8182c());
        this.f44952F0 = m129210a14;
        m129210a15 = AbstractC24856m.m129210a(new C8196q());
        this.f44953G0 = m129210a15;
        m129210a16 = AbstractC24856m.m129210a(new C8195p());
        this.f44954H0 = m129210a16;
        m129210a17 = AbstractC24856m.m129210a(new C8190k());
        this.f44955I0 = m129210a17;
        this.f44957K0 = true;
        this.f44960N0 = true;
        this.f44963Q0 = "Zalo Video";
        m129210a18 = AbstractC24856m.m129210a(C8189j.f44988q);
        this.f44967U0 = m129210a18;
        m129210a19 = AbstractC24856m.m129210a(C8197r.f44996q);
        this.f44968V0 = m129210a19;
        View.inflate(getContext(), AbstractC7409c0.feed_item_zalo_video_link, this);
        this.f44971Y0 = new Runnable() { // from class: com.zing.zalo.feed.components.z5
            @Override // java.lang.Runnable
            public final void run() {
                FeedItemZaloVideoView.m44324T0(FeedItemZaloVideoView.this);
            }
        };
    }
}
