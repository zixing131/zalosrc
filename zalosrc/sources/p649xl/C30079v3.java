package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Divider;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v3 */
/* loaded from: classes3.dex */
public final class C30079v3 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139627p;

    /* renamed from: q */
    public final Divider f139628q;

    /* renamed from: r */
    public final LinearLayout f139629r;

    /* renamed from: s */
    public final RobotoTextView f139630s;

    /* renamed from: t */
    public final RecyclerView f139631t;

    private C30079v3(RelativeLayout relativeLayout, Divider divider, LinearLayout linearLayout, RobotoTextView robotoTextView, RecyclerView recyclerView) {
        this.f139627p = relativeLayout;
        this.f139628q = divider;
        this.f139629r = linearLayout;
        this.f139630s = robotoTextView;
        this.f139631t = recyclerView;
    }

    /* renamed from: a */
    public static C30079v3 m148601a(View view) {
        int i11 = AbstractC6918a0.feed_reaction_divider;
        Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
        if (divider != null) {
            i11 = AbstractC6918a0.feed_reaction_header;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.feed_reactions_count;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.rv_feed_reaction_views;
                    RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (recyclerView != null) {
                        return new C30079v3((RelativeLayout) view, divider, linearLayout, robotoTextView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30079v3 m148602c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_reaction_bts_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148601a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139627p;
    }
}
