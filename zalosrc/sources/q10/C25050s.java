package q10;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.s */
/* loaded from: classes5.dex */
public final class C25050s implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120231p;

    /* renamed from: q */
    public final RobotoButton f120232q;

    /* renamed from: r */
    public final AvatarImageView f120233r;

    /* renamed from: s */
    public final UsernameTextView f120234s;

    private C25050s(LinearLayout linearLayout, RobotoButton robotoButton, AvatarImageView avatarImageView, UsernameTextView usernameTextView) {
        this.f120231p = linearLayout;
        this.f120232q = robotoButton;
        this.f120233r = avatarImageView;
        this.f120234s = usernameTextView;
    }

    /* renamed from: a */
    public static C25050s m129931a(View view) {
        int i11 = AbstractC27409d.btnFollow;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC27409d.ivAvatar;
            AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView != null) {
                i11 = AbstractC27409d.tvName;
                UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                if (usernameTextView != null) {
                    return new C25050s((LinearLayout) view, robotoButton, avatarImageView, usernameTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120231p;
    }
}
