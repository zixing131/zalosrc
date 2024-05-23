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

/* renamed from: xl.qd */
/* loaded from: classes3.dex */
public final class C30003qd implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139144p;

    /* renamed from: q */
    public final RobotoTextView f139145q;

    /* renamed from: r */
    public final RobotoTextView f139146r;

    /* renamed from: s */
    public final ZAppCompatImageView f139147s;

    /* renamed from: t */
    public final LinearLayout f139148t;

    /* renamed from: u */
    public final LinearLayout f139149u;

    /* renamed from: v */
    public final RobotoTextView f139150v;

    /* renamed from: w */
    public final RobotoTextView f139151w;

    /* renamed from: x */
    public final RobotoTextView f139152x;

    /* renamed from: y */
    public final ZAppCompatImageView f139153y;

    private C30003qd(FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, ZAppCompatImageView zAppCompatImageView2) {
        this.f139144p = frameLayout;
        this.f139145q = robotoTextView;
        this.f139146r = robotoTextView2;
        this.f139147s = zAppCompatImageView;
        this.f139148t = linearLayout;
        this.f139149u = linearLayout2;
        this.f139150v = robotoTextView3;
        this.f139151w = robotoTextView4;
        this.f139152x = robotoTextView5;
        this.f139153y = zAppCompatImageView2;
    }

    /* renamed from: a */
    public static C30003qd m148417a(View view) {
        int i11 = AbstractC6918a0.btn_ignore;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_login;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.icon;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.layout_account_info;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.layout_intro_media_permission;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout2 != null) {
                            i11 = AbstractC6918a0.tv_account_name_backup;
                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView3 != null) {
                                i11 = AbstractC6918a0.tv_diff_acc;
                                RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView4 != null) {
                                    i11 = AbstractC6918a0.tv_title;
                                    RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView5 != null) {
                                        i11 = AbstractC6918a0.warning_icon;
                                        ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                        if (zAppCompatImageView2 != null) {
                                            return new C30003qd((FrameLayout) view, robotoTextView, robotoTextView2, zAppCompatImageView, linearLayout, linearLayout2, robotoTextView3, robotoTextView4, robotoTextView5, zAppCompatImageView2);
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
    public static C30003qd m148418c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sync_google_account_media_restore_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148417a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139144p;
    }
}
