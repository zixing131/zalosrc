package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.i1 */
/* loaded from: classes5.dex */
public final class C25017i1 implements InterfaceC22715a {

    /* renamed from: p */
    private final HeaderLayout f119958p;

    /* renamed from: q */
    public final SimpleShadowTextView f119959q;

    /* renamed from: r */
    public final ImageView f119960r;

    /* renamed from: s */
    public final ImageView f119961s;

    /* renamed from: t */
    public final FrameLayout f119962t;

    /* renamed from: u */
    public final HeaderLayout f119963u;

    /* renamed from: v */
    public final FrameLayout f119964v;

    /* renamed from: w */
    public final FrameLayout f119965w;

    /* renamed from: x */
    public final EllipsizedTextView f119966x;

    private C25017i1(HeaderLayout headerLayout, SimpleShadowTextView simpleShadowTextView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, HeaderLayout headerLayout2, FrameLayout frameLayout2, FrameLayout frameLayout3, EllipsizedTextView ellipsizedTextView) {
        this.f119958p = headerLayout;
        this.f119959q = simpleShadowTextView;
        this.f119960r = imageView;
        this.f119961s = imageView2;
        this.f119962t = frameLayout;
        this.f119963u = headerLayout2;
        this.f119964v = frameLayout2;
        this.f119965w = frameLayout3;
        this.f119966x = ellipsizedTextView;
    }

    /* renamed from: a */
    public static C25017i1 m129848a(View view) {
        int i11 = AbstractC27409d.btnAction;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.btnBack;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.btnMore;
                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView2 != null) {
                    i11 = AbstractC27409d.lytCenter;
                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout != null) {
                        HeaderLayout headerLayout = (HeaderLayout) view;
                        i11 = AbstractC27409d.lytLeft;
                        FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout2 != null) {
                            i11 = AbstractC27409d.lytRight;
                            FrameLayout frameLayout3 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout3 != null) {
                                i11 = AbstractC27409d.txtTitle;
                                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                if (ellipsizedTextView != null) {
                                    return new C25017i1(headerLayout, simpleShadowTextView, imageView, imageView2, frameLayout, headerLayout, frameLayout2, frameLayout3, ellipsizedTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public HeaderLayout getRoot() {
        return this.f119958p;
    }
}
