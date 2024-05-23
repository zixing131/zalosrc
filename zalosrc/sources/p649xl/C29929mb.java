package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.mb */
/* loaded from: classes3.dex */
public final class C29929mb implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138690p;

    /* renamed from: q */
    public final LinearLayout f138691q;

    /* renamed from: r */
    public final LinearLayout f138692r;

    /* renamed from: s */
    public final RecyclerView f138693s;

    /* renamed from: t */
    public final ZdsActionBar f138694t;

    private C29929mb(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f138690p = linearLayout;
        this.f138691q = linearLayout2;
        this.f138692r = linearLayout3;
        this.f138693s = recyclerView;
        this.f138694t = zdsActionBar;
    }

    /* renamed from: a */
    public static C29929mb m148253a(View view) {
        int i11 = AbstractC6918a0.layout_empty_msg;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i11 = AbstractC6918a0.rv_muted_callers;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C29929mb(linearLayout2, linearLayout, linearLayout2, recyclerView, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29929mb m148254c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_blocked_callers_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148253a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138690p;
    }
}
