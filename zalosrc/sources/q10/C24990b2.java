package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LeftTitleHeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.b2 */
/* loaded from: classes5.dex */
public final class C24990b2 implements InterfaceC22715a {

    /* renamed from: A */
    public final UsernameTextView f119791A;

    /* renamed from: p */
    private final FrameLayout f119792p;

    /* renamed from: q */
    public final ImageView f119793q;

    /* renamed from: r */
    public final SimpleShadowTextView f119794r;

    /* renamed from: s */
    public final ImageView f119795s;

    /* renamed from: t */
    public final ImageView f119796t;

    /* renamed from: u */
    public final FrameLayout f119797u;

    /* renamed from: v */
    public final FrameLayout f119798v;

    /* renamed from: w */
    public final LeftTitleHeaderLayout f119799w;

    /* renamed from: x */
    public final FrameLayout f119800x;

    /* renamed from: y */
    public final FrameLayout f119801y;

    /* renamed from: z */
    public final LinearLayout f119802z;

    private C24990b2(FrameLayout frameLayout, ImageView imageView, SimpleShadowTextView simpleShadowTextView, ImageView imageView2, ImageView imageView3, FrameLayout frameLayout2, FrameLayout frameLayout3, LeftTitleHeaderLayout leftTitleHeaderLayout, FrameLayout frameLayout4, FrameLayout frameLayout5, LinearLayout linearLayout, UsernameTextView usernameTextView) {
        this.f119792p = frameLayout;
        this.f119793q = imageView;
        this.f119794r = simpleShadowTextView;
        this.f119795s = imageView2;
        this.f119796t = imageView3;
        this.f119797u = frameLayout2;
        this.f119798v = frameLayout3;
        this.f119799w = leftTitleHeaderLayout;
        this.f119800x = frameLayout4;
        this.f119801y = frameLayout5;
        this.f119802z = linearLayout;
        this.f119791A = usernameTextView;
    }

    /* renamed from: a */
    public static C24990b2 m129766a(View view) {
        int i11 = AbstractC27409d.btnBack;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.btnFollow;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                i11 = AbstractC27409d.btnMore;
                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView2 != null) {
                    i11 = AbstractC27409d.btnUpload;
                    ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView3 != null) {
                        i11 = AbstractC27409d.lytCenter;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            i11 = AbstractC27409d.lytContainer;
                            FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout2 != null) {
                                i11 = AbstractC27409d.lytHeader;
                                LeftTitleHeaderLayout leftTitleHeaderLayout = (LeftTitleHeaderLayout) AbstractC22716b.m117526a(view, i11);
                                if (leftTitleHeaderLayout != null) {
                                    i11 = AbstractC27409d.lytLeft;
                                    FrameLayout frameLayout3 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                    if (frameLayout3 != null) {
                                        FrameLayout frameLayout4 = (FrameLayout) view;
                                        i11 = AbstractC27409d.lytRight;
                                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                        if (linearLayout != null) {
                                            i11 = AbstractC27409d.txtTitle;
                                            UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                                            if (usernameTextView != null) {
                                                return new C24990b2(frameLayout4, imageView, simpleShadowTextView, imageView2, imageView3, frameLayout, frameLayout2, leftTitleHeaderLayout, frameLayout3, frameLayout4, linearLayout, usernameTextView);
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
    public static C24990b2 m129767c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_channel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129766a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119792p;
    }
}
