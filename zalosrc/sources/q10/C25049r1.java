package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.et.EnterActionEditText;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.ListClickableRecyclerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.r1 */
/* loaded from: classes5.dex */
public final class C25049r1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120220p;

    /* renamed from: q */
    public final FrameLayout f120221q;

    /* renamed from: r */
    public final ImageView f120222r;

    /* renamed from: s */
    public final PulseImageView f120223s;

    /* renamed from: t */
    public final EnterActionEditText f120224t;

    /* renamed from: u */
    public final ImageView f120225u;

    /* renamed from: v */
    public final LinearLayout f120226v;

    /* renamed from: w */
    public final LinearLayout f120227w;

    /* renamed from: x */
    public final LoadingLayout f120228x;

    /* renamed from: y */
    public final FrameLayout f120229y;

    /* renamed from: z */
    public final ListClickableRecyclerView f120230z;

    private C25049r1(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, PulseImageView pulseImageView, EnterActionEditText enterActionEditText, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LoadingLayout loadingLayout, FrameLayout frameLayout3, ListClickableRecyclerView listClickableRecyclerView) {
        this.f120220p = frameLayout;
        this.f120221q = frameLayout2;
        this.f120222r = imageView;
        this.f120223s = pulseImageView;
        this.f120224t = enterActionEditText;
        this.f120225u = imageView2;
        this.f120226v = linearLayout;
        this.f120227w = linearLayout2;
        this.f120228x = loadingLayout;
        this.f120229y = frameLayout3;
        this.f120230z = listClickableRecyclerView;
    }

    /* renamed from: a */
    public static C25049r1 m129928a(View view) {
        int i11 = AbstractC27409d.boxSearch;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC27409d.btnBack;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.btnClear;
                PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                if (pulseImageView != null) {
                    i11 = AbstractC27409d.edtSearch;
                    EnterActionEditText enterActionEditText = (EnterActionEditText) AbstractC22716b.m117526a(view, i11);
                    if (enterActionEditText != null) {
                        i11 = AbstractC27409d.icoSearch;
                        ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView2 != null) {
                            i11 = AbstractC27409d.lytContainer;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                i11 = AbstractC27409d.lytHeader;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = AbstractC27409d.lytLoading;
                                    LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
                                    if (loadingLayout != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) view;
                                        i11 = AbstractC27409d.rvSearch;
                                        ListClickableRecyclerView listClickableRecyclerView = (ListClickableRecyclerView) AbstractC22716b.m117526a(view, i11);
                                        if (listClickableRecyclerView != null) {
                                            return new C25049r1(frameLayout2, frameLayout, imageView, pulseImageView, enterActionEditText, imageView2, linearLayout, linearLayout2, loadingLayout, frameLayout2, listClickableRecyclerView);
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
    public static C25049r1 m129929c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_search_video_channel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129928a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120220p;
    }
}
