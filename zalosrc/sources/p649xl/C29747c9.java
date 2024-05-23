package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c9 */
/* loaded from: classes3.dex */
public final class C29747c9 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137413p;

    /* renamed from: q */
    public final Button f137414q;

    /* renamed from: r */
    public final LinearLayout f137415r;

    /* renamed from: s */
    public final RobotoTextView f137416s;

    /* renamed from: t */
    public final ZAppCompatImageView f137417t;

    /* renamed from: u */
    public final FrameLayout f137418u;

    /* renamed from: v */
    public final LinearLayout f137419v;

    /* renamed from: w */
    public final LinearLayout f137420w;

    /* renamed from: x */
    public final RobotoTextView f137421x;

    /* renamed from: y */
    public final RobotoTextView f137422y;

    private C29747c9(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView, FrameLayout frameLayout, LinearLayout linearLayout3, LinearLayout linearLayout4, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.f137413p = linearLayout;
        this.f137414q = button;
        this.f137415r = linearLayout2;
        this.f137416s = robotoTextView;
        this.f137417t = zAppCompatImageView;
        this.f137418u = frameLayout;
        this.f137419v = linearLayout3;
        this.f137420w = linearLayout4;
        this.f137421x = robotoTextView2;
        this.f137422y = robotoTextView3;
    }

    /* renamed from: a */
    public static C29747c9 m147811a(View view) {
        int i11 = AbstractC6918a0.btn_upgrade;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.group_entry;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.group_entry_description;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.imgIntro;
                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView != null) {
                        i11 = AbstractC6918a0.layout_button;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) view;
                            i11 = AbstractC6918a0.layout_not_admin;
                            LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout3 != null) {
                                i11 = AbstractC6918a0.learn_more;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.tvTitleIntro;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView3 != null) {
                                        return new C29747c9(linearLayout2, button, linearLayout, robotoTextView, zAppCompatImageView, frameLayout, linearLayout2, linearLayout3, robotoTextView2, robotoTextView3);
                                    }
                                }
                            }
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
        return this.f137413p;
    }
}
