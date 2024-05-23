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

/* renamed from: xl.z6 */
/* loaded from: classes3.dex */
public final class C30150z6 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f140101p;

    /* renamed from: q */
    public final RelativeLayout f140102q;

    /* renamed from: r */
    public final RelativeLayout f140103r;

    /* renamed from: s */
    public final ImageView f140104s;

    /* renamed from: t */
    public final RobotoTextView f140105t;

    private C30150z6(View view, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, RobotoTextView robotoTextView) {
        this.f140101p = view;
        this.f140102q = relativeLayout;
        this.f140103r = relativeLayout2;
        this.f140104s = imageView;
        this.f140105t = robotoTextView;
    }

    /* renamed from: a */
    public static C30150z6 m148774a(View view) {
        int i11 = AbstractC6918a0.container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.layout_cover;
            RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout2 != null) {
                i11 = AbstractC6918a0.thumb_empty;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC6918a0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C30150z6(view, relativeLayout, relativeLayout2, imageView, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30150z6 m148775b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.layout_see_more_album_item, viewGroup);
            return m148774a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f140101p;
    }
}
