package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ob */
/* loaded from: classes3.dex */
public final class C29965ob implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138894p;

    /* renamed from: q */
    public final RecyclerView f138895q;

    /* renamed from: r */
    public final ZdsActionBar f138896r;

    private C29965ob(LinearLayout linearLayout, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f138894p = linearLayout;
        this.f138895q = recyclerView;
        this.f138896r = zdsActionBar;
    }

    /* renamed from: a */
    public static C29965ob m148331a(View view) {
        int i11 = AbstractC6918a0.rv_ringtones;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
            if (zdsActionBar != null) {
                return new C29965ob((LinearLayout) view, recyclerView, zdsActionBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138894p;
    }
}
