package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.shortvideo.p072ui.widget.SimilarChannelLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.n0 */
/* loaded from: classes5.dex */
public final class C25036n0 implements InterfaceC22715a {

    /* renamed from: p */
    private final SimilarChannelLayout f120125p;

    /* renamed from: q */
    public final AvatarImageView f120126q;

    /* renamed from: r */
    public final SimpleShadowTextView f120127r;

    /* renamed from: s */
    public final SimilarChannelLayout f120128s;

    /* renamed from: t */
    public final SimpleShadowTextView f120129t;

    /* renamed from: u */
    public final FitUsernameTextView f120130u;

    private C25036n0(SimilarChannelLayout similarChannelLayout, AvatarImageView avatarImageView, SimpleShadowTextView simpleShadowTextView, SimilarChannelLayout similarChannelLayout2, SimpleShadowTextView simpleShadowTextView2, FitUsernameTextView fitUsernameTextView) {
        this.f120125p = similarChannelLayout;
        this.f120126q = avatarImageView;
        this.f120127r = simpleShadowTextView;
        this.f120128s = similarChannelLayout2;
        this.f120129t = simpleShadowTextView2;
        this.f120130u = fitUsernameTextView;
    }

    /* renamed from: a */
    public static C25036n0 m129896a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.btnFollow;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                SimilarChannelLayout similarChannelLayout = (SimilarChannelLayout) view;
                i11 = AbstractC27409d.tvFollowStats;
                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView2 != null) {
                    i11 = AbstractC27409d.txtName;
                    FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                    if (fitUsernameTextView != null) {
                        return new C25036n0(similarChannelLayout, avatarImageView, simpleShadowTextView, similarChannelLayout, simpleShadowTextView2, fitUsernameTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25036n0 m129897c(LayoutInflater layoutInflater) {
        return m129898d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25036n0 m129898d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_similar_channel_info, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129896a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SimilarChannelLayout getRoot() {
        return this.f120125p;
    }
}
