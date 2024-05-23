package p649xl;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m5 */
/* loaded from: classes3.dex */
public final class C29923m5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138655p;

    /* renamed from: q */
    public final ImageView f138656q;

    /* renamed from: r */
    public final RobotoTextView f138657r;

    /* renamed from: s */
    public final ZAppCompatImageView f138658s;

    /* renamed from: t */
    public final LinearLayout f138659t;

    private C29923m5(LinearLayout linearLayout, ImageView imageView, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2) {
        this.f138655p = linearLayout;
        this.f138656q = imageView;
        this.f138657r = robotoTextView;
        this.f138658s = zAppCompatImageView;
        this.f138659t = linearLayout2;
    }

    /* renamed from: a */
    public static C29923m5 m148237a(View view) {
        int i11 = AbstractC6918a0.btn_close;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC6918a0.btn_explore;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.iv_backgroud;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new C29923m5(linearLayout, imageView, robotoTextView, zAppCompatImageView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138655p;
    }
}
