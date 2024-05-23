package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.rc */
/* loaded from: classes3.dex */
public final class C30020rc implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139235p;

    /* renamed from: q */
    public final RobotoTextView f139236q;

    /* renamed from: r */
    public final FrameLayout f139237r;

    /* renamed from: s */
    public final FrameLayout f139238s;

    /* renamed from: t */
    public final RobotoTextView f139239t;

    /* renamed from: u */
    public final RelativeLayout f139240u;

    /* renamed from: v */
    public final RobotoTextView f139241v;

    private C30020rc(RelativeLayout relativeLayout, RobotoTextView robotoTextView, FrameLayout frameLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView2, RelativeLayout relativeLayout2, RobotoTextView robotoTextView3) {
        this.f139235p = relativeLayout;
        this.f139236q = robotoTextView;
        this.f139237r = frameLayout;
        this.f139238s = frameLayout2;
        this.f139239t = robotoTextView2;
        this.f139240u = relativeLayout2;
        this.f139241v = robotoTextView3;
    }

    /* renamed from: a */
    public static C30020rc m148457a(View view) {
        int i11 = AbstractC6918a0.btn_download_promote_sticker;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.holoCircularProgressBar;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.layout_btn_download_promote_sticker;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout2 != null) {
                    i11 = AbstractC6918a0.promote_sticker_description;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i11 = AbstractC6918a0.promote_sticker_name;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            return new C30020rc(relativeLayout, robotoTextView, frameLayout, frameLayout2, robotoTextView2, relativeLayout, robotoTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30020rc m148458c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sticker_promotion_headeritem_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148457a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139235p;
    }
}
