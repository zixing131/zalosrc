package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.k6 */
/* loaded from: classes3.dex */
public final class C29888k6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138464p;

    /* renamed from: q */
    public final RelativeLayout f138465q;

    /* renamed from: r */
    public final RelativeLayout f138466r;

    /* renamed from: s */
    public final AspectRatioImageView f138467s;

    /* renamed from: t */
    public final RobotoTextView f138468t;

    private C29888k6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, AspectRatioImageView aspectRatioImageView, RobotoTextView robotoTextView) {
        this.f138464p = relativeLayout;
        this.f138465q = relativeLayout2;
        this.f138466r = relativeLayout3;
        this.f138467s = aspectRatioImageView;
        this.f138468t = robotoTextView;
    }

    /* renamed from: a */
    public static C29888k6 m148159a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.layout_thumb;
        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout2 != null) {
            i11 = AbstractC6918a0.thumb_empty;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
            if (aspectRatioImageView != null) {
                i11 = AbstractC6918a0.title;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29888k6(relativeLayout, relativeLayout, relativeLayout2, aspectRatioImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29888k6 m148160c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_create_album, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148159a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138464p;
    }
}
