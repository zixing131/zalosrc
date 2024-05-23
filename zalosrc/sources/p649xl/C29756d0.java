package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d0 */
/* loaded from: classes3.dex */
public final class C29756d0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137464p;

    /* renamed from: q */
    public final RecyclerView f137465q;

    /* renamed from: r */
    public final LinearLayout f137466r;

    /* renamed from: s */
    public final RobotoTextView f137467s;

    /* renamed from: t */
    public final MultiStateView f137468t;

    private C29756d0(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, RobotoTextView robotoTextView, MultiStateView multiStateView) {
        this.f137464p = linearLayout;
        this.f137465q = recyclerView;
        this.f137466r = linearLayout2;
        this.f137467s = robotoTextView;
        this.f137468t = multiStateView;
    }

    /* renamed from: a */
    public static C29756d0 m147832a(View view) {
        int i11 = AbstractC6918a0.contact_list;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.header_container;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.header_hint;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.multi_state_view;
                    MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                    if (multiStateView != null) {
                        return new C29756d0((LinearLayout) view, recyclerView, linearLayout, robotoTextView, multiStateView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137464p;
    }
}
