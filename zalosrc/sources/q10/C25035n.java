package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.shortvideo.p072ui.widget.DescCommentItemLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.DescriptionCommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.n */
/* loaded from: classes5.dex */
public final class C25035n implements InterfaceC22715a {

    /* renamed from: p */
    private final DescCommentItemLayout f120118p;

    /* renamed from: q */
    public final AvatarImageView f120119q;

    /* renamed from: r */
    public final DescriptionCommentLayout f120120r;

    /* renamed from: s */
    public final OverScrollableRecyclerView f120121s;

    /* renamed from: t */
    public final SimpleShadowTextView f120122t;

    /* renamed from: u */
    public final EllipsizedTextView f120123u;

    /* renamed from: v */
    public final FitUsernameTextView f120124v;

    private C25035n(DescCommentItemLayout descCommentItemLayout, AvatarImageView avatarImageView, DescriptionCommentLayout descriptionCommentLayout, OverScrollableRecyclerView overScrollableRecyclerView, SimpleShadowTextView simpleShadowTextView, EllipsizedTextView ellipsizedTextView, FitUsernameTextView fitUsernameTextView) {
        this.f120118p = descCommentItemLayout;
        this.f120119q = avatarImageView;
        this.f120120r = descriptionCommentLayout;
        this.f120121s = overScrollableRecyclerView;
        this.f120122t = simpleShadowTextView;
        this.f120123u = ellipsizedTextView;
        this.f120124v = fitUsernameTextView;
    }

    /* renamed from: a */
    public static C25035n m129893a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.lytDescription;
            DescriptionCommentLayout descriptionCommentLayout = (DescriptionCommentLayout) AbstractC22716b.m117526a(view, i11);
            if (descriptionCommentLayout != null) {
                i11 = AbstractC27409d.rvCta;
                OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (overScrollableRecyclerView != null) {
                    i11 = AbstractC27409d.tagAuthor;
                    SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView != null) {
                        i11 = AbstractC27409d.txtDescription;
                        EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                        if (ellipsizedTextView != null) {
                            i11 = AbstractC27409d.txtName;
                            FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                            if (fitUsernameTextView != null) {
                                return new C25035n((DescCommentItemLayout) view, avatarImageView, descriptionCommentLayout, overScrollableRecyclerView, simpleShadowTextView, ellipsizedTextView, fitUsernameTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25035n m129894c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_desc_comment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129893a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DescCommentItemLayout getRoot() {
        return this.f120118p;
    }
}
