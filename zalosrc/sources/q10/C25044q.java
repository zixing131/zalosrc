package q10;

import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelFollowSuggestionItem;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingBar;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.q */
/* loaded from: classes5.dex */
public final class C25044q implements InterfaceC22715a {

    /* renamed from: p */
    private final ChannelFollowSuggestionItem f120183p;

    /* renamed from: q */
    public final AvatarImageView f120184q;

    /* renamed from: r */
    public final LoadingBar f120185r;

    /* renamed from: s */
    public final SimpleShadowTextView f120186s;

    /* renamed from: t */
    public final RecyclingImageView f120187t;

    /* renamed from: u */
    public final FitUsernameTextView f120188u;

    /* renamed from: v */
    public final View f120189v;

    private C25044q(ChannelFollowSuggestionItem channelFollowSuggestionItem, AvatarImageView avatarImageView, LoadingBar loadingBar, SimpleShadowTextView simpleShadowTextView, RecyclingImageView recyclingImageView, FitUsernameTextView fitUsernameTextView, View view) {
        this.f120183p = channelFollowSuggestionItem;
        this.f120184q = avatarImageView;
        this.f120185r = loadingBar;
        this.f120186s = simpleShadowTextView;
        this.f120187t = recyclingImageView;
        this.f120188u = fitUsernameTextView;
        this.f120189v = view;
    }

    /* renamed from: a */
    public static C25044q m129917a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.barLoading;
            LoadingBar loadingBar = (LoadingBar) AbstractC22716b.m117526a(view, i11);
            if (loadingBar != null) {
                i11 = AbstractC27409d.btnFollow;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    i11 = AbstractC27409d.rivThumbnail;
                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView != null) {
                        i11 = AbstractC27409d.txtName;
                        FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                        if (fitUsernameTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieOverlay))) != null) {
                            return new C25044q((ChannelFollowSuggestionItem) view, avatarImageView, loadingBar, simpleShadowTextView, recyclingImageView, fitUsernameTextView, m117526a);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public ChannelFollowSuggestionItem getRoot() {
        return this.f120183p;
    }
}
