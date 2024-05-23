package q10;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.j1 */
/* loaded from: classes5.dex */
public final class C25021j1 implements InterfaceC22715a {

    /* renamed from: p */
    private final HeaderLayout f119988p;

    /* renamed from: q */
    public final ImageView f119989q;

    /* renamed from: r */
    public final ImageView f119990r;

    /* renamed from: s */
    public final FrameLayout f119991s;

    /* renamed from: t */
    public final HeaderLayout f119992t;

    /* renamed from: u */
    public final FrameLayout f119993u;

    /* renamed from: v */
    public final FrameLayout f119994v;

    /* renamed from: w */
    public final EllipsizedTextView f119995w;

    private C25021j1(HeaderLayout headerLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, HeaderLayout headerLayout2, FrameLayout frameLayout2, FrameLayout frameLayout3, EllipsizedTextView ellipsizedTextView) {
        this.f119988p = headerLayout;
        this.f119989q = imageView;
        this.f119990r = imageView2;
        this.f119991s = frameLayout;
        this.f119992t = headerLayout2;
        this.f119993u = frameLayout2;
        this.f119994v = frameLayout3;
        this.f119995w = ellipsizedTextView;
    }

    /* renamed from: a */
    public static C25021j1 m129858a(View view) {
        int i11 = AbstractC27409d.btnBack;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC27409d.btnShare;
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
                                return new C25021j1(headerLayout, imageView, imageView2, frameLayout, headerLayout, frameLayout2, frameLayout3, ellipsizedTextView);
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
        return this.f119988p;
    }
}
