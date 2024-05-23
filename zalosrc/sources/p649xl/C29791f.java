package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f */
/* loaded from: classes3.dex */
public final class C29791f implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137715p;

    /* renamed from: q */
    public final ZAppCompatImageView f137716q;

    /* renamed from: r */
    public final ZAppCompatImageView f137717r;

    /* renamed from: s */
    public final LinearLayout f137718s;

    /* renamed from: t */
    public final LinearLayout f137719t;

    private C29791f(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f137715p = linearLayout;
        this.f137716q = zAppCompatImageView;
        this.f137717r = zAppCompatImageView2;
        this.f137718s = linearLayout2;
        this.f137719t = linearLayout3;
    }

    /* renamed from: a */
    public static C29791f m147919a(View view) {
        int i11 = AbstractC6918a0.ic_delete;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.ic_restore;
            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView2 != null) {
                i11 = AbstractC6918a0.ll_delete_backup;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.ll_restore_action;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        return new C29791f((LinearLayout) view, zAppCompatImageView, zAppCompatImageView2, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29791f m147920c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.addition_option_for_latest_backup_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147919a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137715p;
    }
}
