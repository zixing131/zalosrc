package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u6 */
/* loaded from: classes3.dex */
public final class C30065u6 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139551p;

    /* renamed from: q */
    public final RobotoTextView f139552q;

    /* renamed from: r */
    public final RobotoTextView f139553r;

    /* renamed from: s */
    public final RobotoTextView f139554s;

    /* renamed from: t */
    public final ZAppCompatImageView f139555t;

    /* renamed from: u */
    public final ZAppCompatImageView f139556u;

    /* renamed from: v */
    public final LinearLayout f139557v;

    /* renamed from: w */
    public final LinearLayout f139558w;

    /* renamed from: x */
    public final RobotoTextView f139559x;

    /* renamed from: y */
    public final RobotoTextView f139560y;

    /* renamed from: z */
    public final RobotoTextView f139561z;

    private C30065u6(FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        this.f139551p = frameLayout;
        this.f139552q = robotoTextView;
        this.f139553r = robotoTextView2;
        this.f139554s = robotoTextView3;
        this.f139555t = zAppCompatImageView;
        this.f139556u = zAppCompatImageView2;
        this.f139557v = linearLayout;
        this.f139558w = linearLayout2;
        this.f139559x = robotoTextView4;
        this.f139560y = robotoTextView5;
        this.f139561z = robotoTextView6;
    }

    /* renamed from: a */
    public static C30065u6 m148568a(View view) {
        int i11 = AbstractC6918a0.btn_continue;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_grant_permission;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.btn_ignore;
                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView3 != null) {
                    i11 = AbstractC6918a0.icon;
                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView != null) {
                        i11 = AbstractC6918a0.iv_media;
                        ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView2 != null) {
                            i11 = AbstractC6918a0.layout_content;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                i11 = AbstractC6918a0.layout_intro_media;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = AbstractC6918a0.title;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView4 != null) {
                                        i11 = AbstractC6918a0.tv_media_description;
                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView5 != null) {
                                            i11 = AbstractC6918a0.tv_media_title;
                                            RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView6 != null) {
                                                return new C30065u6((FrameLayout) view, robotoTextView, robotoTextView2, robotoTextView3, zAppCompatImageView, zAppCompatImageView2, linearLayout, linearLayout2, robotoTextView4, robotoTextView5, robotoTextView6);
                                            }
                                        }
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

    /* renamed from: c */
    public static C30065u6 m148569c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_restore_intro_contact_permission, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148568a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139551p;
    }
}
