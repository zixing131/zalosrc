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
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.uicontrol.CustomEditText;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.va */
/* loaded from: classes3.dex */
public final class C30086va implements InterfaceC22715a {

    /* renamed from: A */
    public final FrameLayout f139685A;

    /* renamed from: B */
    public final RecyclerView f139686B;

    /* renamed from: C */
    public final FrameLayout f139687C;

    /* renamed from: p */
    private final RelativeLayout f139688p;

    /* renamed from: q */
    public final LinearLayout f139689q;

    /* renamed from: r */
    public final FrameLayout f139690r;

    /* renamed from: s */
    public final ImageView f139691s;

    /* renamed from: t */
    public final LinearLayout f139692t;

    /* renamed from: u */
    public final FeedRecyclerView f139693u;

    /* renamed from: v */
    public final ImageView f139694v;

    /* renamed from: w */
    public final CustomEditText f139695w;

    /* renamed from: x */
    public final RelativeLayout f139696x;

    /* renamed from: y */
    public final ImageView f139697y;

    /* renamed from: z */
    public final RelativeLayout f139698z;

    private C30086va(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout2, FeedRecyclerView feedRecyclerView, ImageView imageView2, CustomEditText customEditText, RelativeLayout relativeLayout2, ImageView imageView3, RelativeLayout relativeLayout3, FrameLayout frameLayout2, RecyclerView recyclerView, FrameLayout frameLayout3) {
        this.f139688p = relativeLayout;
        this.f139689q = linearLayout;
        this.f139690r = frameLayout;
        this.f139691s = imageView;
        this.f139692t = linearLayout2;
        this.f139693u = feedRecyclerView;
        this.f139694v = imageView2;
        this.f139695w = customEditText;
        this.f139696x = relativeLayout2;
        this.f139697y = imageView3;
        this.f139698z = relativeLayout3;
        this.f139685A = frameLayout2;
        this.f139686B = recyclerView;
        this.f139687C = frameLayout3;
    }

    /* renamed from: a */
    public static C30086va m148621a(View view) {
        int i11 = AbstractC6918a0.bottom_sheet_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.bottom_sheet_header;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.clear_input;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC6918a0.content_section;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null) {
                        i11 = AbstractC6918a0.horizontal_recyclerView;
                        FeedRecyclerView feedRecyclerView = (FeedRecyclerView) AbstractC22716b.m117526a(view, i11);
                        if (feedRecyclerView != null) {
                            i11 = AbstractC6918a0.icn_slide_hint;
                            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView2 != null) {
                                i11 = AbstractC6918a0.input;
                                CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
                                if (customEditText != null) {
                                    i11 = AbstractC6918a0.layout_input;
                                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                    if (relativeLayout != null) {
                                        i11 = AbstractC6918a0.logo;
                                        ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                        if (imageView3 != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                            i11 = AbstractC6918a0.overlay_input;
                                            FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                            if (frameLayout2 != null) {
                                                i11 = AbstractC6918a0.recyclerView;
                                                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                                                if (recyclerView != null) {
                                                    i11 = AbstractC6918a0.separate;
                                                    FrameLayout frameLayout3 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (frameLayout3 != null) {
                                                        return new C30086va(relativeLayout2, linearLayout, frameLayout, imageView, linearLayout2, feedRecyclerView, imageView2, customEditText, relativeLayout, imageView3, relativeLayout2, frameLayout2, recyclerView, frameLayout3);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C30086va m148622c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.ringtones_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148621a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139688p;
    }
}
