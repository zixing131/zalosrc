package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s6 */
/* loaded from: classes3.dex */
public final class C30031s6 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139294p;

    /* renamed from: q */
    public final RelativeLayout f139295q;

    /* renamed from: r */
    public final ImageView f139296r;

    /* renamed from: s */
    public final RelativeLayout f139297s;

    /* renamed from: t */
    public final RobotoTextView f139298t;

    private C30031s6(View view, RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RobotoTextView robotoTextView) {
        this.f139294p = view;
        this.f139295q = relativeLayout;
        this.f139296r = imageView;
        this.f139297s = relativeLayout2;
        this.f139298t = robotoTextView;
    }

    /* renamed from: a */
    public static C30031s6 m148483a(View view) {
        int i11 = AbstractC6918a0.container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.icon;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC6918a0.layout_cover;
                RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout2 != null) {
                    i11 = AbstractC6918a0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C30031s6(view, relativeLayout, imageView, relativeLayout2, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30031s6 m148484b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.layout_profile_create_album_item_square, viewGroup);
            return m148483a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139294p;
    }
}
