package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.c */
/* loaded from: classes5.dex */
public final class C24991c implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119803p;

    /* renamed from: q */
    public final AvatarImageView f119804q;

    /* renamed from: r */
    public final UsernameTextView f119805r;

    private C24991c(LinearLayout linearLayout, AvatarImageView avatarImageView, UsernameTextView usernameTextView) {
        this.f119803p = linearLayout;
        this.f119804q = avatarImageView;
        this.f119805r = usernameTextView;
    }

    /* renamed from: a */
    public static C24991c m129769a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.txtName;
            UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
            if (usernameTextView != null) {
                return new C24991c((LinearLayout) view, avatarImageView, usernameTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24991c m129770c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_comment_user, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129769a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119803p;
    }
}
