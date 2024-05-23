package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m3 */
/* loaded from: classes3.dex */
public final class C29921m3 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138648p;

    /* renamed from: q */
    public final RelativeLayout f138649q;

    /* renamed from: r */
    public final ImageView f138650r;

    /* renamed from: s */
    public final LinearLayout f138651s;

    /* renamed from: t */
    public final RobotoTextView f138652t;

    private C29921m3(LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f138648p = linearLayout;
        this.f138649q = relativeLayout;
        this.f138650r = imageView;
        this.f138651s = linearLayout2;
        this.f138652t = robotoTextView;
    }

    /* renamed from: a */
    public static C29921m3 m148232a(View view) {
        int i11 = AbstractC6918a0.bg_connection;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.icon_connection;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = AbstractC6918a0.text_connection;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29921m3(linearLayout, relativeLayout, imageView, linearLayout, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29921m3 m148233c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.error_connection, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148232a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138648p;
    }
}
