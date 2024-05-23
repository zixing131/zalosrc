package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ProgressBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.y8 */
/* loaded from: classes3.dex */
public final class C30135y8 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f140024p;

    /* renamed from: q */
    public final ProgressBar f140025q;

    /* renamed from: r */
    public final ZAppCompatImageView f140026r;

    /* renamed from: s */
    public final RobotoTextView f140027s;

    private C30135y8(LinearLayout linearLayout, ProgressBar progressBar, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView) {
        this.f140024p = linearLayout;
        this.f140025q = progressBar;
        this.f140026r = zAppCompatImageView;
        this.f140027s = robotoTextView;
    }

    /* renamed from: a */
    public static C30135y8 m148736a(View view) {
        int i11 = AbstractC6918a0.holoCircularProgressBar;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC6918a0.ivStatus;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.progress_dialog_msg;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C30135y8((LinearLayout) view, progressBar, zAppCompatImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30135y8 m148737c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.new_progress_dialog, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148736a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f140024p;
    }
}
