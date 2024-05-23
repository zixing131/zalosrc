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

/* renamed from: q10.b */
/* loaded from: classes5.dex */
public final class C24987b implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119749p;

    /* renamed from: q */
    public final AvatarImageView f119750q;

    /* renamed from: r */
    public final AvatarImageView f119751r;

    /* renamed from: s */
    public final View f119752s;

    /* renamed from: t */
    public final View f119753t;

    /* renamed from: u */
    public final LinearLayout f119754u;

    /* renamed from: v */
    public final LinearLayout f119755v;

    /* renamed from: w */
    public final UsernameTextView f119756w;

    /* renamed from: x */
    public final UsernameTextView f119757x;

    private C24987b(LinearLayout linearLayout, AvatarImageView avatarImageView, AvatarImageView avatarImageView2, View view, View view2, LinearLayout linearLayout2, LinearLayout linearLayout3, UsernameTextView usernameTextView, UsernameTextView usernameTextView2) {
        this.f119749p = linearLayout;
        this.f119750q = avatarImageView;
        this.f119751r = avatarImageView2;
        this.f119752s = view;
        this.f119753t = view2;
        this.f119754u = linearLayout2;
        this.f119755v = linearLayout3;
        this.f119756w = usernameTextView;
        this.f119757x = usernameTextView2;
    }

    /* renamed from: a */
    public static C24987b m129757a(View view) {
        View m117526a;
        View m117526a2;
        int i11 = AbstractC27409d.aivAvatarChannel;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.aivAvatarUser;
            AvatarImageView avatarImageView2 = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.icoCheckChannel))) != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.icoCheckUser))) != null) {
                i11 = AbstractC27409d.rowChannel;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC27409d.rowUser;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC27409d.txtNameChannel;
                        UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                        if (usernameTextView != null) {
                            i11 = AbstractC27409d.txtNameUser;
                            UsernameTextView usernameTextView2 = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                            if (usernameTextView2 != null) {
                                return new C24987b((LinearLayout) view, avatarImageView, avatarImageView2, m117526a, m117526a2, linearLayout, linearLayout2, usernameTextView, usernameTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24987b m129758c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_comment_identities, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129757a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119749p;
    }
}
