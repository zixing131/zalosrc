package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.FlexBoxLayout;
import com.zing.zalo.shortvideo.p072ui.widget.ScrollStateNestedScrollView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.h */
/* loaded from: classes5.dex */
public final class C25011h implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119927p;

    /* renamed from: q */
    public final SimpleShadowTextView f119928q;

    /* renamed from: r */
    public final FlexBoxLayout f119929r;

    /* renamed from: s */
    public final FlexBoxLayout f119930s;

    /* renamed from: t */
    public final ScrollStateNestedScrollView f119931t;

    /* renamed from: u */
    public final SimpleShadowTextView f119932u;

    /* renamed from: v */
    public final SimpleShadowTextView f119933v;

    private C25011h(LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView, FlexBoxLayout flexBoxLayout, FlexBoxLayout flexBoxLayout2, ScrollStateNestedScrollView scrollStateNestedScrollView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3) {
        this.f119927p = linearLayout;
        this.f119928q = simpleShadowTextView;
        this.f119929r = flexBoxLayout;
        this.f119930s = flexBoxLayout2;
        this.f119931t = scrollStateNestedScrollView;
        this.f119932u = simpleShadowTextView2;
        this.f119933v = simpleShadowTextView3;
    }

    /* renamed from: a */
    public static C25011h m129828a(View view) {
        int i11 = AbstractC27409d.btnAction;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.flexBox;
            FlexBoxLayout flexBoxLayout = (FlexBoxLayout) AbstractC22716b.m117526a(view, i11);
            if (flexBoxLayout != null) {
                i11 = AbstractC27409d.flexBoxFeedBack;
                FlexBoxLayout flexBoxLayout2 = (FlexBoxLayout) AbstractC22716b.m117526a(view, i11);
                if (flexBoxLayout2 != null) {
                    i11 = AbstractC27409d.scrollView;
                    ScrollStateNestedScrollView scrollStateNestedScrollView = (ScrollStateNestedScrollView) AbstractC22716b.m117526a(view, i11);
                    if (scrollStateNestedScrollView != null) {
                        i11 = AbstractC27409d.tvTitleFeedBack;
                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView2 != null) {
                            i11 = AbstractC27409d.tvTitleHashtag;
                            SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                            if (simpleShadowTextView3 != null) {
                                return new C25011h((LinearLayout) view, simpleShadowTextView, flexBoxLayout, flexBoxLayout2, scrollStateNestedScrollView, simpleShadowTextView2, simpleShadowTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25011h m129829c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_bts_video_feed_back, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129828a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119927p;
    }
}
