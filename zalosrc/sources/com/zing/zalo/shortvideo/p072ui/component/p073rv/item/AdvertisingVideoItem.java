package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Action;
import com.zing.zalo.shortvideo.p072ui.model.Banner;
import com.zing.zalo.shortvideo.p072ui.model.Button;
import com.zing.zalo.shortvideo.p072ui.model.Ended;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.List;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import pm0.C24848g0;
import q10.C25048r0;
import q10.C25051s0;
import q20.C25085h;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import z10.C31179n0;

/* loaded from: classes5.dex */
public final class AdvertisingVideoItem extends VideoItem {
    public static final C9548b Companion = new C9548b(null);

    /* renamed from: O */
    private InterfaceC9547a f50524O;

    /* renamed from: P */
    private InterfaceC9549c f50525P;

    /* renamed from: Q */
    private final int f50526Q;

    /* renamed from: R */
    private final int f50527R;

    /* renamed from: S */
    private final float f50528S;

    /* renamed from: T */
    private final float f50529T;

    /* renamed from: U */
    private Video f50530U;

    /* renamed from: V */
    private String f50531V;

    /* renamed from: W */
    private C25048r0 f50532W;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9547a extends VideoItem.InterfaceC9673a {
        /* renamed from: a */
        void mo52029a();

        /* renamed from: c */
        void mo52030c(boolean z11);

        /* renamed from: j */
        void mo52031j();

        /* renamed from: k */
        void mo52032k();

        /* renamed from: n */
        void mo52033n(String str);

        /* renamed from: s */
        void mo52034s();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9548b {
        private C9548b() {
        }

        public /* synthetic */ C9548b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC9549c extends VideoItem.InterfaceC9675c {
        /* renamed from: a */
        void mo52035a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$d */
    /* loaded from: classes5.dex */
    static final class C9550d extends AbstractC19075u implements InterfaceC18505l {
        C9550d() {
            super(1);
        }

        /* renamed from: a */
        public final void m52036a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52031j();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52036a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$e */
    /* loaded from: classes5.dex */
    static final class C9551e extends AbstractC19075u implements InterfaceC18505l {
        C9551e() {
            super(1);
        }

        /* renamed from: a */
        public final void m52037a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52029a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52037a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$f */
    /* loaded from: classes5.dex */
    public static final class C9552f extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C25048r0 f50535l1;

        /* renamed from: m1 */
        final /* synthetic */ AdvertisingVideoItem f50536m1;

        /* renamed from: n1 */
        final /* synthetic */ Video f50537n1;

        C9552f(C25048r0 c25048r0, AdvertisingVideoItem advertisingVideoItem, Video video) {
            this.f50535l1 = c25048r0;
            this.f50536m1 = advertisingVideoItem;
            this.f50537n1 = video;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                bitmap = c3979l.m18839c();
            } else {
                bitmap = null;
            }
            if (bitmap != null && this.f50535l1.f120215v.isEnabled()) {
                this.f50536m1.m52022j0(this.f50537n1);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$g */
    /* loaded from: classes5.dex */
    static final class C9553g extends AbstractC19075u implements InterfaceC18505l {
        C9553g() {
            super(1);
        }

        /* renamed from: a */
        public final void m52038a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52034s();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52038a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$h */
    /* loaded from: classes5.dex */
    static final class C9554h extends AbstractC19075u implements InterfaceC18505l {
        C9554h() {
            super(1);
        }

        /* renamed from: a */
        public final void m52039a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52032k();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52039a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$i */
    /* loaded from: classes5.dex */
    static final class C9555i extends AbstractC19075u implements InterfaceC18505l {
        C9555i() {
            super(1);
        }

        /* renamed from: a */
        public final void m52040a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52032k();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52040a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$j */
    /* loaded from: classes5.dex */
    static final class C9556j extends AbstractC19075u implements InterfaceC18505l {
        C9556j() {
            super(1);
        }

        /* renamed from: a */
        public final void m52041a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52030c(false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52041a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$k */
    /* loaded from: classes5.dex */
    static final class C9557k extends AbstractC19075u implements InterfaceC18505l {
        C9557k() {
            super(1);
        }

        /* renamed from: a */
        public final void m52042a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52030c(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52042a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$l */
    /* loaded from: classes5.dex */
    public static final class C9558l extends AbstractC19075u implements InterfaceC18505l {
        C9558l() {
            super(1);
        }

        /* renamed from: a */
        public final void m52043a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52029a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52043a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$m */
    /* loaded from: classes5.dex */
    static final class C9559m extends AbstractC19075u implements InterfaceC18505l {
        C9559m() {
            super(1);
        }

        /* renamed from: a */
        public final void m52044a(View view) {
            AbstractC19074t.m100208f(view, "it");
            AdvertisingVideoItem.this.m52023l0();
            C19205a c19205a = C19205a.f95429a;
            String string = AdvertisingVideoItem.this.getResources().getString(AbstractC27413h.zch_action_key_video_ad_banner_close);
            AbstractC19074t.m100207e(string, "getString(...)");
            C19205a.m100676P(c19205a, string, AdvertisingVideoItem.this.f50530U, null, 4, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52044a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$n */
    /* loaded from: classes5.dex */
    static final class C9560n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9560n f50545q = new C9560n();

        C9560n() {
            super(1);
        }

        /* renamed from: a */
        public final void m52045a(View view) {
            AbstractC19074t.m100208f(view, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52045a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$o */
    /* loaded from: classes5.dex */
    static final class C9561o extends AbstractC19075u implements InterfaceC18505l {
        C9561o() {
            super(1);
        }

        /* renamed from: a */
        public final void m52046a(View view) {
            AbstractC19074t.m100208f(view, "it");
            AdvertisingVideoItem.this.setEndedLayoutVisible(false);
            InterfaceC9549c controller = AdvertisingVideoItem.this.getController();
            if (controller != null) {
                controller.mo52035a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52046a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem$p */
    /* loaded from: classes5.dex */
    public static final class C9562p extends AbstractC19075u implements InterfaceC18505l {
        C9562p() {
            super(1);
        }

        /* renamed from: a */
        public final void m52047a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9547a callback = AdvertisingVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52031j();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52047a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisingVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50526Q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_advertising_sponsored_margin);
        this.f50527R = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_advertising_sponsored_stroke_width);
        this.f50528S = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
        this.f50529T = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_6dp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final boolean m52016k0(AdvertisingVideoItem advertisingVideoItem, View view, MotionEvent motionEvent) {
        InterfaceC9547a callback;
        AbstractC19074t.m100208f(advertisingVideoItem, "this$0");
        if (!view.onTouchEvent(motionEvent) && motionEvent.getAction() == 1 && (callback = advertisingVideoItem.getCallback()) != null) {
            callback.mo52033n(advertisingVideoItem.f50531V);
        }
        return true;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: A */
    public void mo52017A(Video video) {
        String str;
        AbstractC19074t.m100208f(video, "video");
        super.mo52017A(video);
        VideoAdsInfo m52881b = video.m52881b();
        if (m52881b != null && m52881b.m52930f() == 2) {
            VideoAdsInfo m52881b2 = video.m52881b();
            if (m52881b2 != null) {
                str = m52881b2.m52935k();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                C25051s0 parentBinding = getParentBinding();
                PulseImageView pulseImageView = parentBinding.f120236B;
                AbstractC19074t.m100207e(pulseImageView, "btnShare");
                AbstractC26112n.m134367H(pulseImageView);
                SimpleShadowTextView simpleShadowTextView = parentBinding.f120249O;
                AbstractC19074t.m100207e(simpleShadowTextView, "txtShare");
                AbstractC26112n.m134367H(simpleShadowTextView);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: H */
    public void mo52018H(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134380U(linearLayout)) {
            return;
        }
        super.mo52018H(motionEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: P */
    public Rect mo52019P(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int height;
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        AdvertisingBannerLayout advertisingBannerLayout = c25048r0.f120215v;
        AbstractC19074t.m100207e(advertisingBannerLayout, "lytAdvertisingBanner");
        if (AbstractC26112n.m134378S(advertisingBannerLayout)) {
            AdvertisingBannerLayout advertisingBannerLayout2 = c25048r0.f120215v;
            AbstractC19074t.m100207e(advertisingBannerLayout2, "lytAdvertisingBanner");
            AbstractC26112n.m134381V(advertisingBannerLayout2, i14, i11);
            int measuredHeight = i14 - c25048r0.f120215v.getMeasuredHeight();
            SimpleShadowTextView simpleShadowTextView = c25048r0.f120219z;
            AbstractC19074t.m100207e(simpleShadowTextView, "tagSponsored");
            AbstractC26112n.m134381V(simpleShadowTextView, measuredHeight, i11);
            height = measuredHeight - c25048r0.f120219z.getMeasuredHeight();
        } else {
            ExtraActionLayout extraActionLayout = c25048r0.f120217x;
            AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
            if (AbstractC26112n.m134378S(extraActionLayout)) {
                ExtraActionLayout extraActionLayout2 = c25048r0.f120217x;
                AbstractC19074t.m100207e(extraActionLayout2, "lytExtraAction");
                AbstractC26112n.m134381V(extraActionLayout2, i14, i11);
                i15 = i14 - c25048r0.f120217x.getMeasuredHeight();
            } else {
                i15 = i14;
            }
            SimpleShadowTextView simpleShadowTextView2 = c25048r0.f120219z;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tagSponsored");
            AbstractC26112n.m134381V(simpleShadowTextView2, i15, i11);
            int measuredHeight2 = i15 - (c25048r0.f120219z.getMeasuredHeight() + this.f50526Q);
            height = measuredHeight2 - super.mo52019P(z11, i11, i12, i13, measuredHeight2).height();
        }
        return new Rect(i11, height, i13, i14);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: T */
    public Size mo52020T(int i11, int i12) {
        int i13;
        int height;
        int size = View.MeasureSpec.getSize(i11);
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        AdvertisingBannerLayout advertisingBannerLayout = c25048r0.f120215v;
        AbstractC19074t.m100207e(advertisingBannerLayout, "lytAdvertisingBanner");
        if (AbstractC26112n.m134378S(advertisingBannerLayout)) {
            AdvertisingBannerLayout advertisingBannerLayout2 = c25048r0.f120215v;
            AbstractC19074t.m100207e(advertisingBannerLayout2, "lytAdvertisingBanner");
            AbstractC26112n.m134387a0(advertisingBannerLayout2, size, Integer.MIN_VALUE, 0, 0);
            int measuredHeight = c25048r0.f120215v.getMeasuredHeight();
            SimpleShadowTextView simpleShadowTextView = c25048r0.f120219z;
            AbstractC19074t.m100207e(simpleShadowTextView, "tagSponsored");
            AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, 0, 0);
            height = measuredHeight + c25048r0.f120219z.getMeasuredHeight();
        } else {
            ExtraActionLayout extraActionLayout = c25048r0.f120217x;
            AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
            if (AbstractC26112n.m134378S(extraActionLayout)) {
                ExtraActionLayout extraActionLayout2 = c25048r0.f120217x;
                AbstractC19074t.m100207e(extraActionLayout2, "lytExtraAction");
                AbstractC26112n.m134387a0(extraActionLayout2, size, 1073741824, 0, 0);
                i13 = c25048r0.f120217x.getMeasuredHeight();
            } else {
                i13 = 0;
            }
            SimpleShadowTextView simpleShadowTextView2 = c25048r0.f120219z;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tagSponsored");
            AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
            height = super.mo52020T(i11, i12).getHeight() + i13 + c25048r0.f120219z.getMeasuredHeight() + this.f50526Q;
        }
        return new Size(size, height);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: Z */
    public void mo52021Z() {
        super.mo52021Z();
        m52023l0();
    }

    public final String getAdvertisingLink() {
        VideoAdsInfo m52881b;
        Ended m52932h;
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134380U(linearLayout)) {
            Video video = this.f50530U;
            if (video == null || (m52881b = video.m52881b()) == null || (m52932h = m52881b.m52932h()) == null) {
                return null;
            }
            return m52932h.m52792b();
        }
        return this.f50531V;
    }

    public final Video getAdvertisingVideo() {
        return this.f50530U;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public InterfaceC9547a getCallback() {
        return this.f50524O;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public InterfaceC9549c getController() {
        return this.f50525P;
    }

    /* renamed from: j0 */
    public final void m52022j0(Video video) {
        int m134426u;
        int m134426u2;
        AbstractC19074t.m100208f(video, "video");
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        VideoAdsInfo m52881b = video.m52881b();
        if (m52881b == null) {
            return;
        }
        int m52937m = m52881b.m52937m();
        if (m52937m != 1) {
            if (m52937m != 2) {
                if (m52937m == 3) {
                    if (c25048r0.f120218y.getDrawable() != null) {
                        C25051s0 parentBinding = getParentBinding();
                        parentBinding.f120253q.setTranslationX(-2.1474836E9f);
                        parentBinding.f120248N.setTranslationX(-2.1474836E9f);
                        parentBinding.f120260x.setTranslationX(-2.1474836E9f);
                        parentBinding.f120238D.setTranslationX(-2.1474836E9f);
                        parentBinding.f120244J.setTranslationX(-2.1474836E9f);
                        m52427X();
                        AdvertisingBannerLayout advertisingBannerLayout = c25048r0.f120215v;
                        AbstractC19074t.m100207e(advertisingBannerLayout, "lytAdvertisingBanner");
                        AbstractC26112n.m134416p(advertisingBannerLayout);
                        AdvertisingBannerLayout advertisingBannerLayout2 = c25048r0.f120215v;
                        AbstractC19074t.m100207e(advertisingBannerLayout2, "lytAdvertisingBanner");
                        AbstractC26112n.m134431w0(advertisingBannerLayout2);
                        c25048r0.f120215v.m52011c();
                        return;
                    }
                    AdvertisingBannerLayout advertisingBannerLayout3 = c25048r0.f120215v;
                    AbstractC19074t.m100207e(advertisingBannerLayout3, "lytAdvertisingBanner");
                    AbstractC26112n.m134416p(advertisingBannerLayout3);
                    return;
                }
                return;
            }
            ExtraActionLayout extraActionLayout = c25048r0.f120217x;
            AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
            AbstractC26112n.m134431w0(extraActionLayout);
            c25048r0.f120217x.m52112c();
            return;
        }
        SimpleShadowTextView simpleShadowTextView = c25048r0.f120214u;
        Button m52775b = m52881b.m52926b().m52775b();
        if (m52775b != null) {
            simpleShadowTextView.setTag(m52775b);
            simpleShadowTextView.setText(m52775b.m52786c());
            Integer m52787d = m52775b.m52787d();
            if (m52787d != null) {
                m134426u = m52787d.intValue();
            } else {
                AbstractC19074t.m100205c(simpleShadowTextView);
                m134426u = AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_text_primary);
            }
            simpleShadowTextView.setTextColor(m134426u);
            C25085h c25085h = C25085h.f120485a;
            Integer m52785b = m52775b.m52785b();
            if (m52785b != null) {
                m134426u2 = m52785b.intValue();
            } else {
                AbstractC19074t.m100205c(simpleShadowTextView);
                m134426u2 = AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_accent_green_background);
            }
            simpleShadowTextView.setBackground(C25085h.m130021i(c25085h, m134426u2, this.f50529T, 0, 0, 0, 28, null));
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134407k0(simpleShadowTextView, new C9558l());
            this.f50531V = m52775b.m52784a();
        }
    }

    /* renamed from: l0 */
    public final void m52023l0() {
        Button m52775b;
        int m134426u;
        int m134426u2;
        C25048r0 c25048r0 = this.f50532W;
        VideoAdsInfo videoAdsInfo = null;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        Video video = this.f50530U;
        if (video != null) {
            videoAdsInfo = video.m52881b();
        }
        if (videoAdsInfo == null) {
            C25051s0 parentBinding = getParentBinding();
            parentBinding.f120253q.setTranslationX(0.0f);
            parentBinding.f120248N.setTranslationX(0.0f);
            parentBinding.f120260x.setTranslationX(0.0f);
            parentBinding.f120238D.setTranslationX(0.0f);
            parentBinding.f120244J.setTranslationX(0.0f);
            ExtraActionLayout extraActionLayout = c25048r0.f120217x;
            AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
            AbstractC26112n.m134367H(extraActionLayout);
            AdvertisingBannerLayout advertisingBannerLayout = c25048r0.f120215v;
            AbstractC19074t.m100207e(advertisingBannerLayout, "lytAdvertisingBanner");
            AbstractC26112n.m134367H(advertisingBannerLayout);
            return;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134380U(linearLayout)) {
            setEndedLayoutVisible(false);
        }
        int m52937m = videoAdsInfo.m52937m();
        if (m52937m != 1) {
            if (m52937m != 2) {
                if (m52937m == 3) {
                    AdvertisingBannerLayout advertisingBannerLayout2 = c25048r0.f120215v;
                    AbstractC19074t.m100207e(advertisingBannerLayout2, "lytAdvertisingBanner");
                    if (AbstractC26112n.m134380U(advertisingBannerLayout2)) {
                        AdvertisingBannerLayout advertisingBannerLayout3 = c25048r0.f120215v;
                        AbstractC19074t.m100207e(advertisingBannerLayout3, "lytAdvertisingBanner");
                        AbstractC26112n.m134367H(advertisingBannerLayout3);
                        C25051s0 parentBinding2 = getParentBinding();
                        parentBinding2.f120253q.setTranslationX(0.0f);
                        parentBinding2.f120248N.setTranslationX(0.0f);
                        parentBinding2.f120260x.setTranslationX(0.0f);
                        parentBinding2.f120238D.setTranslationX(0.0f);
                        parentBinding2.f120244J.setTranslationX(0.0f);
                        return;
                    }
                    return;
                }
                return;
            }
            ExtraActionLayout extraActionLayout2 = c25048r0.f120217x;
            AbstractC19074t.m100207e(extraActionLayout2, "lytExtraAction");
            if (AbstractC26112n.m134380U(extraActionLayout2)) {
                ExtraActionLayout extraActionLayout3 = c25048r0.f120217x;
                AbstractC19074t.m100207e(extraActionLayout3, "lytExtraAction");
                AbstractC26112n.m134367H(extraActionLayout3);
                return;
            }
            return;
        }
        if (c25048r0.f120214u.getTag() == videoAdsInfo.m52926b().m52775b()) {
            SimpleShadowTextView simpleShadowTextView = c25048r0.f120214u;
            Action m52927c = videoAdsInfo.m52927c();
            if (m52927c != null && (m52775b = m52927c.m52775b()) != null) {
                simpleShadowTextView.setTag(m52775b);
                simpleShadowTextView.setText(m52775b.m52786c());
                Integer m52787d = m52775b.m52787d();
                if (m52787d != null) {
                    m134426u = m52787d.intValue();
                } else {
                    AbstractC19074t.m100205c(simpleShadowTextView);
                    m134426u = AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_text_secondary);
                }
                simpleShadowTextView.setTextColor(m134426u);
                C25085h c25085h = C25085h.f120485a;
                Integer m52785b = m52775b.m52785b();
                if (m52785b != null) {
                    m134426u2 = m52785b.intValue();
                } else {
                    AbstractC19074t.m100205c(simpleShadowTextView);
                    m134426u2 = AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_layer_background_disable);
                }
                simpleShadowTextView.setBackground(C25085h.m130021i(c25085h, m134426u2, this.f50529T, 0, 0, 0, 28, null));
                AbstractC19074t.m100205c(simpleShadowTextView);
                AbstractC26112n.m134407k0(simpleShadowTextView, new C9562p());
                this.f50531V = m52775b.m52784a();
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: m */
    public void mo52024m(Video video, String str, C31179n0.d dVar, boolean z11) {
        int m134426u;
        int m134426u2;
        Button m52775b;
        int m134426u3;
        int m134426u4;
        int m134426u5;
        int m134426u6;
        int m134426u7;
        int m134426u8;
        String str2;
        String str3;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        this.f50530U = null;
        super.mo52024m(video, str, dVar, z11);
        this.f50530U = video;
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        VideoAdsInfo m52881b = video.m52881b();
        if (m52881b == null) {
            return;
        }
        SimpleShadowTextView simpleShadowTextView = c25048r0.f120219z;
        simpleShadowTextView.setText(m52881b.m52936l().m52828b());
        Integer m52829c = m52881b.m52936l().m52829c();
        if (m52829c != null) {
            m134426u = m52829c.intValue();
        } else {
            AbstractC19074t.m100205c(simpleShadowTextView);
            m134426u = AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_text_primary_a60);
        }
        simpleShadowTextView.setTextColor(m134426u);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f50528S);
        int i11 = this.f50527R;
        Integer m52827a = m52881b.m52936l().m52827a();
        if (m52827a != null) {
            m134426u2 = m52827a.intValue();
        } else {
            AbstractC19074t.m100205c(simpleShadowTextView);
            m134426u2 = AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_divider_inverse);
        }
        gradientDrawable.setStroke(i11, m134426u2);
        simpleShadowTextView.setBackground(gradientDrawable);
        int m52937m = m52881b.m52937m();
        if (m52937m != 1) {
            if (m52937m != 2) {
                if (m52937m == 3) {
                    C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25048r0.f120218y);
                    c23528a.m123599d();
                    AdvertisingBannerLayout advertisingBannerLayout = c25048r0.f120215v;
                    AbstractC19074t.m100207e(advertisingBannerLayout, "lytAdvertisingBanner");
                    AbstractC26112n.m134398g(advertisingBannerLayout);
                    c25048r0.f120218y.setImageDrawable(null);
                    Banner m52774a = m52881b.m52926b().m52774a();
                    if (m52774a != null) {
                        str2 = m52774a.m52780b();
                    } else {
                        str2 = null;
                    }
                    RoundedImageView roundedImageView = c25048r0.f120218y;
                    AbstractC19074t.m100207e(roundedImageView, "rivAdvertisingBanner");
                    AbstractC26112n.m134407k0(roundedImageView, new C9553g());
                    Banner m52774a2 = m52881b.m52926b().m52774a();
                    if (m52774a2 != null) {
                        str3 = m52774a2.m52779a();
                    } else {
                        str3 = null;
                    }
                    this.f50531V = str3;
                }
            } else {
                SimpleShadowTextView simpleShadowTextView2 = c25048r0.f120214u;
                Button m52775b2 = m52881b.m52926b().m52775b();
                if (m52775b2 != null) {
                    simpleShadowTextView2.setTag(m52775b2);
                    simpleShadowTextView2.setText(m52775b2.m52786c());
                    Integer m52787d = m52775b2.m52787d();
                    if (m52787d != null) {
                        m134426u7 = m52787d.intValue();
                    } else {
                        AbstractC19074t.m100205c(simpleShadowTextView2);
                        m134426u7 = AbstractC26112n.m134426u(simpleShadowTextView2, AbstractC27406a.zch_text_primary);
                    }
                    simpleShadowTextView2.setTextColor(m134426u7);
                    C25085h c25085h = C25085h.f120485a;
                    Integer m52785b = m52775b2.m52785b();
                    if (m52785b != null) {
                        m134426u8 = m52785b.intValue();
                    } else {
                        AbstractC19074t.m100205c(simpleShadowTextView2);
                        m134426u8 = AbstractC26112n.m134426u(simpleShadowTextView2, AbstractC27406a.zch_accent_green_background);
                    }
                    simpleShadowTextView2.setBackground(C25085h.m130021i(c25085h, m134426u8, this.f50529T, 0, 0, 0, 28, null));
                    AbstractC19074t.m100205c(simpleShadowTextView2);
                    AbstractC26112n.m134407k0(simpleShadowTextView2, new C9551e());
                    this.f50531V = m52775b2.m52784a();
                }
            }
        } else {
            SimpleShadowTextView simpleShadowTextView3 = c25048r0.f120214u;
            Action m52927c = m52881b.m52927c();
            if (m52927c != null && (m52775b = m52927c.m52775b()) != null) {
                simpleShadowTextView3.setTag(m52775b);
                simpleShadowTextView3.setText(m52775b.m52786c());
                Integer m52787d2 = m52775b.m52787d();
                if (m52787d2 != null) {
                    m134426u3 = m52787d2.intValue();
                } else {
                    AbstractC19074t.m100205c(simpleShadowTextView3);
                    m134426u3 = AbstractC26112n.m134426u(simpleShadowTextView3, AbstractC27406a.zch_text_secondary);
                }
                simpleShadowTextView3.setTextColor(m134426u3);
                C25085h c25085h2 = C25085h.f120485a;
                Integer m52785b2 = m52775b.m52785b();
                if (m52785b2 != null) {
                    m134426u4 = m52785b2.intValue();
                } else {
                    AbstractC19074t.m100205c(simpleShadowTextView3);
                    m134426u4 = AbstractC26112n.m134426u(simpleShadowTextView3, AbstractC27406a.zch_layer_background_disable);
                }
                simpleShadowTextView3.setBackground(C25085h.m130021i(c25085h2, m134426u4, this.f50529T, 0, 0, 0, 28, null));
                AbstractC19074t.m100205c(simpleShadowTextView3);
                AbstractC26112n.m134407k0(simpleShadowTextView3, new C9550d());
                this.f50531V = m52775b.m52784a();
            }
            ExtraActionLayout extraActionLayout = c25048r0.f120217x;
            AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
            AbstractC26112n.m134431w0(extraActionLayout);
        }
        if (m52881b.m52932h() != null) {
            AvatarImageView avatarImageView = c25048r0.f120210q;
            AbstractC19074t.m100205c(avatarImageView);
            AvatarImageView.m55927l(avatarImageView, null, null, m52881b.m52932h().m52795e(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
            AbstractC26112n.m134407k0(avatarImageView, new C9554h());
            SimpleShadowTextView simpleShadowTextView4 = c25048r0.f120208B;
            simpleShadowTextView4.setText(m52881b.m52932h().m52797g());
            AbstractC19074t.m100205c(simpleShadowTextView4);
            AbstractC26112n.m134407k0(simpleShadowTextView4, new C9555i());
            SimpleShadowTextView simpleShadowTextView5 = c25048r0.f120207A;
            simpleShadowTextView5.setText(m52881b.m52932h().m52796f());
            AbstractC19074t.m100205c(simpleShadowTextView5);
            AbstractC26112n.m134407k0(simpleShadowTextView5, new C9556j());
            SimpleShadowTextView simpleShadowTextView6 = c25048r0.f120211r;
            simpleShadowTextView6.setText(m52881b.m52932h().m52793c());
            Integer m52794d = m52881b.m52932h().m52794d();
            if (m52794d != null) {
                m134426u5 = m52794d.intValue();
            } else {
                AbstractC19074t.m100205c(simpleShadowTextView6);
                m134426u5 = AbstractC26112n.m134426u(simpleShadowTextView6, AbstractC27406a.zch_text_primary);
            }
            simpleShadowTextView6.setTextColor(m134426u5);
            C25085h c25085h3 = C25085h.f120485a;
            Integer m52791a = m52881b.m52932h().m52791a();
            if (m52791a != null) {
                m134426u6 = m52791a.intValue();
            } else {
                AbstractC19074t.m100205c(simpleShadowTextView6);
                m134426u6 = AbstractC26112n.m134426u(simpleShadowTextView6, AbstractC27406a.zch_accent_green_background);
            }
            simpleShadowTextView6.setBackground(C25085h.m130021i(c25085h3, m134426u6, this.f50529T, 0, 0, 0, 28, null));
            AbstractC19074t.m100205c(simpleShadowTextView6);
            AbstractC26112n.m134407k0(simpleShadowTextView6, new C9557k());
            LinearLayout linearLayout = c25048r0.f120216w;
            AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
            AbstractC26112n.m134374O(linearLayout);
            return;
        }
        LinearLayout linearLayout2 = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout2, "lytAdvertisingEnd");
        AbstractC26112n.m134367H(linearLayout2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C25048r0 m129926a = C25048r0.m129926a(this);
        AbstractC19074t.m100207e(m129926a, "bind(...)");
        ImageView imageView = m129926a.f120213t;
        AbstractC19074t.m100207e(imageView, "btnCloseBanner");
        AbstractC26112n.m134407k0(imageView, new C9559m());
        LinearLayout linearLayout = m129926a.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        AbstractC26112n.m134407k0(linearLayout, C9560n.f50545q);
        BlinkTextView blinkTextView = m129926a.f120212s;
        AbstractC19074t.m100207e(blinkTextView, "btnAdvertisingEndClose");
        AbstractC26112n.m134407k0(blinkTextView, new C9561o());
        this.f50532W = m129926a;
        getParentBinding().f120246L.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m52016k0;
                m52016k0 = AdvertisingVideoItem.m52016k0(AdvertisingVideoItem.this, view, motionEvent);
                return m52016k0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25048r0.f120216w;
            AbstractC19074t.m100207e(linearLayout2, "lytAdvertisingEnd");
            AbstractC26112n.m134383X(linearLayout2, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25048r0.f120216w;
            AbstractC19074t.m100207e(linearLayout2, "lytAdvertisingEnd");
            AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, size2, 1073741824);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134380U(linearLayout)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: p */
    public void mo52025p(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25051s0 parentBinding = getParentBinding();
        VideoAdsInfo m52881b = video.m52881b();
        if (m52881b != null && m52881b.m52930f() == 2) {
            PulseImageView pulseImageView = parentBinding.f120255s;
            AbstractC19074t.m100207e(pulseImageView, "btnBookmark");
            AbstractC26112n.m134367H(pulseImageView);
            SimpleShadowTextView simpleShadowTextView = parentBinding.f120242H;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtBookmark");
            AbstractC26112n.m134367H(simpleShadowTextView);
            return;
        }
        super.mo52025p(video);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: q */
    public void mo52026q(Video video, List list, String str, C31179n0.d dVar) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(list, "payloads");
        AbstractC19074t.m100208f(str, "source");
        Object obj = list.get(0);
        if (AbstractC19074t.m100204b(obj, "TRIGGER_UPDATE_ACTION")) {
            m52022j0(video);
        } else if (AbstractC19074t.m100204b(obj, "TRIGGER_ENDED_VIDEO")) {
            setEndedLayoutVisible(true);
        } else {
            super.mo52026q(video, list, str, dVar);
        }
    }

    public void setCallback(InterfaceC9547a interfaceC9547a) {
        this.f50524O = interfaceC9547a;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public void setControlAlpha(float f11) {
        float f12;
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134380U(linearLayout)) {
            super.setControlAlpha(1.0f);
            f12 = 0.0f;
        } else {
            super.setControlAlpha(f11);
            f12 = 1.0f - f11;
        }
        SimpleShadowTextView simpleShadowTextView = c25048r0.f120219z;
        AbstractC19074t.m100207e(simpleShadowTextView, "tagSponsored");
        AdvertisingBannerLayout advertisingBannerLayout = c25048r0.f120215v;
        AbstractC19074t.m100207e(advertisingBannerLayout, "lytAdvertisingBanner");
        ExtraActionLayout extraActionLayout = c25048r0.f120217x;
        AbstractC19074t.m100207e(extraActionLayout, "lytExtraAction");
        View[] viewArr = {simpleShadowTextView, advertisingBannerLayout, extraActionLayout};
        for (int i11 = 0; i11 < 3; i11++) {
            viewArr[i11].setAlpha(f12);
        }
    }

    public void setController(InterfaceC9549c interfaceC9549c) {
        this.f50525P = interfaceC9549c;
    }

    public final void setEndedLayoutVisible(boolean z11) {
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        if (z11) {
            LinearLayout linearLayout = c25048r0.f120216w;
            AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
            AbstractC26112n.m134431w0(linearLayout);
            setControlAlpha(1.0f);
            return;
        }
        LinearLayout linearLayout2 = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout2, "lytAdvertisingEnd");
        AbstractC26112n.m134374O(linearLayout2);
        setControlAlpha(0.0f);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public void setInfoActive(boolean z11) {
        C25048r0 c25048r0 = this.f50532W;
        if (c25048r0 == null) {
            AbstractC19074t.m100223u("binding");
            c25048r0 = null;
        }
        LinearLayout linearLayout = c25048r0.f120216w;
        AbstractC19074t.m100207e(linearLayout, "lytAdvertisingEnd");
        if (AbstractC26112n.m134380U(linearLayout)) {
            return;
        }
        super.setInfoActive(z11);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    public void setPlayPauseState(boolean z11) {
        super.setPlayPauseState(z11);
        if (this.f50532W == null) {
            AbstractC19074t.m100223u("binding");
        }
        if (z11) {
            setEndedLayoutVisible(false);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: u */
    public void mo52027u(Video video, String str) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        PulseImageView pulseImageView = getParentBinding().f120259w;
        AbstractC19074t.m100207e(pulseImageView, "btnDislike");
        AbstractC26112n.m134367H(pulseImageView);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem
    /* renamed from: v */
    public void mo52028v(Video video, C31179n0.d dVar, boolean z11) {
        AbstractC19074t.m100208f(video, "video");
        C25051s0 parentBinding = getParentBinding();
        VideoAdsInfo m52881b = video.m52881b();
        if (m52881b != null && m52881b.m52930f() == 2) {
            SimpleShadowTextView simpleShadowTextView = parentBinding.f120260x;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
            AbstractC26112n.m134367H(simpleShadowTextView);
            return;
        }
        super.mo52028v(video, dVar, z11);
    }
}
