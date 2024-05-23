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

/* renamed from: xl.s8 */
/* loaded from: classes3.dex */
public final class C30033s8 implements InterfaceC22715a {

    /* renamed from: A */
    public final FrameLayout f139306A;

    /* renamed from: B */
    public final RecyclerView f139307B;

    /* renamed from: p */
    private final RelativeLayout f139308p;

    /* renamed from: q */
    public final LinearLayout f139309q;

    /* renamed from: r */
    public final FrameLayout f139310r;

    /* renamed from: s */
    public final ImageView f139311s;

    /* renamed from: t */
    public final LinearLayout f139312t;

    /* renamed from: u */
    public final FeedRecyclerView f139313u;

    /* renamed from: v */
    public final ImageView f139314v;

    /* renamed from: w */
    public final CustomEditText f139315w;

    /* renamed from: x */
    public final RelativeLayout f139316x;

    /* renamed from: y */
    public final ImageView f139317y;

    /* renamed from: z */
    public final RelativeLayout f139318z;

    private C30033s8(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout2, FeedRecyclerView feedRecyclerView, ImageView imageView2, CustomEditText customEditText, RelativeLayout relativeLayout2, ImageView imageView3, RelativeLayout relativeLayout3, FrameLayout frameLayout2, RecyclerView recyclerView) {
        this.f139308p = relativeLayout;
        this.f139309q = linearLayout;
        this.f139310r = frameLayout;
        this.f139311s = imageView;
        this.f139312t = linearLayout2;
        this.f139313u = feedRecyclerView;
        this.f139314v = imageView2;
        this.f139315w = customEditText;
        this.f139316x = relativeLayout2;
        this.f139317y = imageView3;
        this.f139318z = relativeLayout3;
        this.f139306A = frameLayout2;
        this.f139307B = recyclerView;
    }

    /* renamed from: a */
    public static C30033s8 m148488a(View view) {
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
                                                    return new C30033s8(relativeLayout2, linearLayout, frameLayout, imageView, linearLayout2, feedRecyclerView, imageView2, customEditText, relativeLayout, imageView3, relativeLayout2, frameLayout2, recyclerView);
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
    public static C30033s8 m148489c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.music_list_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148488a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139308p;
    }
}
