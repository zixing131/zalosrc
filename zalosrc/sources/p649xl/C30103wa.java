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
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.wa */
/* loaded from: classes3.dex */
public final class C30103wa implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139806p;

    /* renamed from: q */
    public final LinearLayout f139807q;

    /* renamed from: r */
    public final FrameLayout f139808r;

    /* renamed from: s */
    public final ImageView f139809s;

    /* renamed from: t */
    public final RelativeLayout f139810t;

    /* renamed from: u */
    public final RecyclerView f139811u;

    private C30103wa(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, RelativeLayout relativeLayout2, RecyclerView recyclerView) {
        this.f139806p = relativeLayout;
        this.f139807q = linearLayout;
        this.f139808r = frameLayout;
        this.f139809s = imageView;
        this.f139810t = relativeLayout2;
        this.f139811u = recyclerView;
    }

    /* renamed from: a */
    public static C30103wa m148658a(View view) {
        int i11 = AbstractC6918a0.bottom_sheet_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.bottom_sheet_header;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.icn_slide_hint;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i11 = AbstractC6918a0.ringtones;
                    RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (recyclerView != null) {
                        return new C30103wa(relativeLayout, linearLayout, frameLayout, imageView, relativeLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30103wa m148659c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.ringtones_system_source_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148658a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139806p;
    }
}
