package q10;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.r */
/* loaded from: classes5.dex */
public final class C25047r implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120204p;

    /* renamed from: q */
    public final AvatarImageView f120205q;

    /* renamed from: r */
    public final UsernameTextView f120206r;

    private C25047r(LinearLayout linearLayout, AvatarImageView avatarImageView, UsernameTextView usernameTextView) {
        this.f120204p = linearLayout;
        this.f120205q = avatarImageView;
        this.f120206r = usernameTextView;
    }

    /* renamed from: a */
    public static C25047r m129924a(View view) {
        int i11 = AbstractC27409d.ivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.tvName;
            UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
            if (usernameTextView != null) {
                return new C25047r((LinearLayout) view, avatarImageView, usernameTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120204p;
    }
}
