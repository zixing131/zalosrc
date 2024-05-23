package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LivestreamChannelInfoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.d */
/* loaded from: classes5.dex */
public final class C24995d implements InterfaceC22715a {

    /* renamed from: A */
    public final SimpleShadowTextView f119826A;

    /* renamed from: B */
    public final SimpleShadowTextView f119827B;

    /* renamed from: C */
    public final SimpleShadowTextView f119828C;

    /* renamed from: p */
    private final LivestreamChannelInfoLayout f119829p;

    /* renamed from: q */
    public final SimpleShadowTextView f119830q;

    /* renamed from: r */
    public final AvatarImageView f119831r;

    /* renamed from: s */
    public final LinearLayout f119832s;

    /* renamed from: t */
    public final LinearLayout f119833t;

    /* renamed from: u */
    public final LinearLayout f119834u;

    /* renamed from: v */
    public final LinearLayout f119835v;

    /* renamed from: w */
    public final SimpleShadowTextView f119836w;

    /* renamed from: x */
    public final SimpleShadowTextView f119837x;

    /* renamed from: y */
    public final SimpleShadowTextView f119838y;

    /* renamed from: z */
    public final UsernameTextView f119839z;

    private C24995d(LivestreamChannelInfoLayout livestreamChannelInfoLayout, SimpleShadowTextView simpleShadowTextView, AvatarImageView avatarImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, SimpleShadowTextView simpleShadowTextView4, UsernameTextView usernameTextView, SimpleShadowTextView simpleShadowTextView5, SimpleShadowTextView simpleShadowTextView6, SimpleShadowTextView simpleShadowTextView7) {
        this.f119829p = livestreamChannelInfoLayout;
        this.f119830q = simpleShadowTextView;
        this.f119831r = avatarImageView;
        this.f119832s = linearLayout;
        this.f119833t = linearLayout2;
        this.f119834u = linearLayout3;
        this.f119835v = linearLayout4;
        this.f119836w = simpleShadowTextView2;
        this.f119837x = simpleShadowTextView3;
        this.f119838y = simpleShadowTextView4;
        this.f119839z = usernameTextView;
        this.f119826A = simpleShadowTextView5;
        this.f119827B = simpleShadowTextView6;
        this.f119828C = simpleShadowTextView7;
    }

    /* renamed from: a */
    public static C24995d m129781a(View view) {
        int i11 = AbstractC27409d.btnFollowSuggest;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.ivAvatar;
            AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView != null) {
                i11 = AbstractC27409d.lytStats;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC27409d.lytStatsFollower;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC27409d.lytStatsLike;
                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout3 != null) {
                            i11 = AbstractC27409d.lytStatsVideo;
                            LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout4 != null) {
                                i11 = AbstractC27409d.numStatsFollower;
                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                if (simpleShadowTextView2 != null) {
                                    i11 = AbstractC27409d.numStatsLike;
                                    SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                    if (simpleShadowTextView3 != null) {
                                        i11 = AbstractC27409d.numStatsVideo;
                                        SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                        if (simpleShadowTextView4 != null) {
                                            i11 = AbstractC27409d.tvUserName;
                                            UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                                            if (usernameTextView != null) {
                                                i11 = AbstractC27409d.txtStatsFollower;
                                                SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                if (simpleShadowTextView5 != null) {
                                                    i11 = AbstractC27409d.txtStatsLike;
                                                    SimpleShadowTextView simpleShadowTextView6 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (simpleShadowTextView6 != null) {
                                                        i11 = AbstractC27409d.txtStatsVideo;
                                                        SimpleShadowTextView simpleShadowTextView7 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (simpleShadowTextView7 != null) {
                                                            return new C24995d((LivestreamChannelInfoLayout) view, simpleShadowTextView, avatarImageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, simpleShadowTextView2, simpleShadowTextView3, simpleShadowTextView4, usernameTextView, simpleShadowTextView5, simpleShadowTextView6, simpleShadowTextView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24995d m129782c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_profile_livestream_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129781a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LivestreamChannelInfoLayout getRoot() {
        return this.f119829p;
    }
}
