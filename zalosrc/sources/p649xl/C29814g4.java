package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g4 */
/* loaded from: classes3.dex */
public final class C29814g4 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137844p;

    /* renamed from: q */
    public final GroupAvatarView f137845q;

    /* renamed from: r */
    public final RobotoEditText f137846r;

    /* renamed from: s */
    public final LinearLayout f137847s;

    /* renamed from: t */
    public final RobotoTextView f137848t;

    /* renamed from: u */
    public final RobotoTextView f137849u;

    /* renamed from: v */
    public final ZdsActionBar f137850v;

    private C29814g4(LinearLayout linearLayout, GroupAvatarView groupAvatarView, RobotoEditText robotoEditText, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZdsActionBar zdsActionBar) {
        this.f137844p = linearLayout;
        this.f137845q = groupAvatarView;
        this.f137846r = robotoEditText;
        this.f137847s = linearLayout2;
        this.f137848t = robotoTextView;
        this.f137849u = robotoTextView2;
        this.f137850v = zdsActionBar;
    }

    /* renamed from: a */
    public static C29814g4 m147979a(View view) {
        int i11 = AbstractC6918a0.avatar;
        GroupAvatarView groupAvatarView = (GroupAvatarView) AbstractC22716b.m117526a(view, i11);
        if (groupAvatarView != null) {
            i11 = AbstractC6918a0.et_desc;
            RobotoEditText robotoEditText = (RobotoEditText) AbstractC22716b.m117526a(view, i11);
            if (robotoEditText != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = AbstractC6918a0.tv_desc;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tv_name;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.zds_action_bar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C29814g4(linearLayout, groupAvatarView, robotoEditText, linearLayout, robotoTextView, robotoTextView2, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137844p;
    }
}
