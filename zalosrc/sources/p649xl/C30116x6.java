package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x6 */
/* loaded from: classes3.dex */
public final class C30116x6 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139902p;

    /* renamed from: q */
    public final RobotoButton f139903q;

    /* renamed from: r */
    public final AvatarImageView f139904r;

    /* renamed from: s */
    public final RobotoTextView f139905s;

    private C30116x6(LinearLayout linearLayout, RobotoButton robotoButton, AvatarImageView avatarImageView, RobotoTextView robotoTextView) {
        this.f139902p = linearLayout;
        this.f139903q = robotoButton;
        this.f139904r = avatarImageView;
        this.f139905s = robotoTextView;
    }

    /* renamed from: a */
    public static C30116x6 m148687a(View view) {
        int i11 = AbstractC6918a0.btn_Remove;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC6918a0.buddy_dp;
            AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView != null) {
                i11 = AbstractC6918a0.name;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C30116x6((LinearLayout) view, robotoButton, avatarImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139902p;
    }
}
