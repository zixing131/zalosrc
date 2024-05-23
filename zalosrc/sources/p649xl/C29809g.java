package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g */
/* loaded from: classes3.dex */
public final class C29809g implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137819p;

    /* renamed from: q */
    public final LinearLayout f137820q;

    /* renamed from: r */
    public final FrameLayout f137821r;

    /* renamed from: s */
    public final FrameLayout f137822s;

    /* renamed from: t */
    public final RobotoTextView f137823t;

    /* renamed from: u */
    public final ImageView f137824u;

    /* renamed from: v */
    public final RelativeLayout f137825v;

    /* renamed from: w */
    public final RecyclerView f137826w;

    /* renamed from: x */
    public final RobotoTextView f137827x;

    private C29809g(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView, ImageView imageView, RelativeLayout relativeLayout2, RecyclerView recyclerView, RobotoTextView robotoTextView2) {
        this.f137819p = relativeLayout;
        this.f137820q = linearLayout;
        this.f137821r = frameLayout;
        this.f137822s = frameLayout2;
        this.f137823t = robotoTextView;
        this.f137824u = imageView;
        this.f137825v = relativeLayout2;
        this.f137826w = recyclerView;
        this.f137827x = robotoTextView2;
    }

    /* renamed from: a */
    public static C29809g m147966a(View view) {
        int i11 = AbstractC6918a0.bottom_sheet_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.bottom_sheet_header;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.content_section;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout2 != null) {
                    i11 = AbstractC6918a0.desc;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.icn_slide_hint;
                        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i11 = AbstractC6918a0.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                            if (recyclerView != null) {
                                i11 = AbstractC6918a0.title;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    return new C29809g(relativeLayout, linearLayout, frameLayout, frameLayout2, robotoTextView, imageView, relativeLayout, recyclerView, robotoTextView2);
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
    public static C29809g m147967c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.album_list_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147966a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137819p;
    }
}
