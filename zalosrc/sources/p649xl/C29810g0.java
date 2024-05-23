package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g0 */
/* loaded from: classes3.dex */
public final class C29810g0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137828p;

    /* renamed from: q */
    public final ListView f137829q;

    /* renamed from: r */
    public final MultiStateView f137830r;

    /* renamed from: s */
    public final ZdsActionBar f137831s;

    private C29810g0(LinearLayout linearLayout, ListView listView, MultiStateView multiStateView, ZdsActionBar zdsActionBar) {
        this.f137828p = linearLayout;
        this.f137829q = listView;
        this.f137830r = multiStateView;
        this.f137831s = zdsActionBar;
    }

    /* renamed from: a */
    public static C29810g0 m147969a(View view) {
        int i11 = AbstractC6918a0.listView;
        ListView listView = (ListView) AbstractC22716b.m117526a(view, i11);
        if (listView != null) {
            i11 = AbstractC6918a0.multi_state;
            MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
            if (multiStateView != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C29810g0((LinearLayout) view, listView, multiStateView, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29810g0 m147970c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.block_call_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147969a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137828p;
    }
}
