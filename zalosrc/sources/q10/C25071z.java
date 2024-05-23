package q10;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.z */
/* loaded from: classes5.dex */
public final class C25071z implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120436p;

    /* renamed from: q */
    public final SimpleShadowTextView f120437q;

    private C25071z(LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView) {
        this.f120436p = linearLayout;
        this.f120437q = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C25071z m129981a(View view) {
        int i11 = AbstractC27409d.groupBy;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            return new C25071z((LinearLayout) view, simpleShadowTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120436p;
    }
}
