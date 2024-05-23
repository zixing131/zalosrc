package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.eg */
/* loaded from: classes3.dex */
public final class C29790eg implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137709p;

    /* renamed from: q */
    public final Button f137710q;

    /* renamed from: r */
    public final ZAppCompatImageView f137711r;

    /* renamed from: s */
    public final RobotoTextView f137712s;

    /* renamed from: t */
    public final RobotoTextView f137713t;

    /* renamed from: u */
    public final ZdsActionBar f137714u;

    private C29790eg(LinearLayout linearLayout, Button button, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ZdsActionBar zdsActionBar) {
        this.f137709p = linearLayout;
        this.f137710q = button;
        this.f137711r = zAppCompatImageView;
        this.f137712s = robotoTextView;
        this.f137713t = robotoTextView2;
        this.f137714u = zdsActionBar;
    }

    /* renamed from: a */
    public static C29790eg m147915a(View view) {
        int i11 = AbstractC6918a0.btnSetup;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.ivBanner;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.tvDescription;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.zdsActionBar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C29790eg((LinearLayout) view, button, zAppCompatImageView, robotoTextView, robotoTextView2, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29790eg m147916c(LayoutInflater layoutInflater) {
        return m147917d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29790eg m147917d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_purchase_welcome_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147915a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137709p;
    }
}
