package p649xl;

import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.b5 */
/* loaded from: classes3.dex */
public final class C29725b5 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137300p;

    /* renamed from: q */
    public final PhotoToggleButton f137301q;

    /* renamed from: r */
    public final RelativeLayout f137302r;

    /* renamed from: s */
    public final RobotoTextView f137303s;

    private C29725b5(RelativeLayout relativeLayout, PhotoToggleButton photoToggleButton, RelativeLayout relativeLayout2, RobotoTextView robotoTextView) {
        this.f137300p = relativeLayout;
        this.f137301q = photoToggleButton;
        this.f137302r = relativeLayout2;
        this.f137303s = robotoTextView;
    }

    /* renamed from: a */
    public static C29725b5 m147759a(View view) {
        int i11 = AbstractC6918a0.check_icon;
        PhotoToggleButton photoToggleButton = (PhotoToggleButton) AbstractC22716b.m117526a(view, i11);
        if (photoToggleButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i12 = AbstractC6918a0.dock_view_title;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i12);
            if (robotoTextView != null) {
                return new C29725b5(relativeLayout, photoToggleButton, relativeLayout, robotoTextView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137300p;
    }
}
