package q10;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingBannerLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ExtraActionLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.r0 */
/* loaded from: classes5.dex */
public final class C25048r0 implements InterfaceC22715a {

    /* renamed from: A */
    public final SimpleShadowTextView f120207A;

    /* renamed from: B */
    public final SimpleShadowTextView f120208B;

    /* renamed from: p */
    private final AdvertisingVideoItem f120209p;

    /* renamed from: q */
    public final AvatarImageView f120210q;

    /* renamed from: r */
    public final SimpleShadowTextView f120211r;

    /* renamed from: s */
    public final BlinkTextView f120212s;

    /* renamed from: t */
    public final ImageView f120213t;

    /* renamed from: u */
    public final SimpleShadowTextView f120214u;

    /* renamed from: v */
    public final AdvertisingBannerLayout f120215v;

    /* renamed from: w */
    public final LinearLayout f120216w;

    /* renamed from: x */
    public final ExtraActionLayout f120217x;

    /* renamed from: y */
    public final RoundedImageView f120218y;

    /* renamed from: z */
    public final SimpleShadowTextView f120219z;

    private C25048r0(AdvertisingVideoItem advertisingVideoItem, AvatarImageView avatarImageView, SimpleShadowTextView simpleShadowTextView, BlinkTextView blinkTextView, ImageView imageView, SimpleShadowTextView simpleShadowTextView2, AdvertisingBannerLayout advertisingBannerLayout, LinearLayout linearLayout, ExtraActionLayout extraActionLayout, RoundedImageView roundedImageView, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4, SimpleShadowTextView simpleShadowTextView5) {
        this.f120209p = advertisingVideoItem;
        this.f120210q = avatarImageView;
        this.f120211r = simpleShadowTextView;
        this.f120212s = blinkTextView;
        this.f120213t = imageView;
        this.f120214u = simpleShadowTextView2;
        this.f120215v = advertisingBannerLayout;
        this.f120216w = linearLayout;
        this.f120217x = extraActionLayout;
        this.f120218y = roundedImageView;
        this.f120219z = simpleShadowTextView3;
        this.f120207A = simpleShadowTextView4;
        this.f120208B = simpleShadowTextView5;
    }

    /* renamed from: a */
    public static C25048r0 m129926a(View view) {
        int i11 = AbstractC27409d.aivAdvertisingEndAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.btnAdvertisingEndAction;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                i11 = AbstractC27409d.btnAdvertisingEndClose;
                BlinkTextView blinkTextView = (BlinkTextView) AbstractC22716b.m117526a(view, i11);
                if (blinkTextView != null) {
                    i11 = AbstractC27409d.btnCloseBanner;
                    ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView != null) {
                        i11 = AbstractC27409d.btnExtraAction;
                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView2 != null) {
                            i11 = AbstractC27409d.lytAdvertisingBanner;
                            AdvertisingBannerLayout advertisingBannerLayout = (AdvertisingBannerLayout) AbstractC22716b.m117526a(view, i11);
                            if (advertisingBannerLayout != null) {
                                i11 = AbstractC27409d.lytAdvertisingEnd;
                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout != null) {
                                    i11 = AbstractC27409d.lytExtraAction;
                                    ExtraActionLayout extraActionLayout = (ExtraActionLayout) AbstractC22716b.m117526a(view, i11);
                                    if (extraActionLayout != null) {
                                        i11 = AbstractC27409d.rivAdvertisingBanner;
                                        RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                                        if (roundedImageView != null) {
                                            i11 = AbstractC27409d.tagSponsored;
                                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                            if (simpleShadowTextView3 != null) {
                                                i11 = AbstractC27409d.txtAdvertisingEndMessage;
                                                SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                if (simpleShadowTextView4 != null) {
                                                    i11 = AbstractC27409d.txtAdvertisingEndName;
                                                    SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (simpleShadowTextView5 != null) {
                                                        return new C25048r0((AdvertisingVideoItem) view, avatarImageView, simpleShadowTextView, blinkTextView, imageView, simpleShadowTextView2, advertisingBannerLayout, linearLayout, extraActionLayout, roundedImageView, simpleShadowTextView3, simpleShadowTextView4, simpleShadowTextView5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public AdvertisingVideoItem getRoot() {
        return this.f120209p;
    }
}
