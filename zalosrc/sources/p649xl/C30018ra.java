package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ra */
/* loaded from: classes3.dex */
public final class C30018ra implements InterfaceC22715a {

    /* renamed from: p */
    private final KeyboardFrameLayout f139225p;

    /* renamed from: q */
    public final Button f139226q;

    /* renamed from: r */
    public final MultiStateView f139227r;

    /* renamed from: s */
    public final RecyclerView f139228s;

    /* renamed from: t */
    public final ZdsActionBar f139229t;

    private C30018ra(KeyboardFrameLayout keyboardFrameLayout, Button button, MultiStateView multiStateView, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f139225p = keyboardFrameLayout;
        this.f139226q = button;
        this.f139227r = multiStateView;
        this.f139228s = recyclerView;
        this.f139229t = zdsActionBar;
    }

    /* renamed from: a */
    public static C30018ra m148452a(View view) {
        int i11 = AbstractC6918a0.btn_report;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.multi_state;
            MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
            if (multiStateView != null) {
                i11 = AbstractC6918a0.rv_main;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C30018ra((KeyboardFrameLayout) view, button, multiStateView, recyclerView, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30018ra m148453c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.report_summary_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148452a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f139225p;
    }
}
