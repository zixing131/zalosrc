package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ha */
/* loaded from: classes3.dex */
public final class C29838ha implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138024p;

    /* renamed from: q */
    public final ZAppCompatImageView f138025q;

    /* renamed from: r */
    public final ZAppCompatImageView f138026r;

    /* renamed from: s */
    public final LinearLayout f138027s;

    /* renamed from: t */
    public final LinearLayout f138028t;

    /* renamed from: u */
    public final RecyclerView f138029u;

    private C29838ha(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView) {
        this.f138024p = linearLayout;
        this.f138025q = zAppCompatImageView;
        this.f138026r = zAppCompatImageView2;
        this.f138027s = linearLayout2;
        this.f138028t = linearLayout3;
        this.f138029u = recyclerView;
    }

    /* renamed from: a */
    public static C29838ha m148038a(View view) {
        int i11 = AbstractC6918a0.btn_back;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.btn_createnew;
            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView2 != null) {
                i11 = AbstractC6918a0.layout_header;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i11 = AbstractC6918a0.rv_quick_message_list;
                    RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (recyclerView != null) {
                        return new C29838ha(linearLayout2, zAppCompatImageView, zAppCompatImageView2, linearLayout, linearLayout2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29838ha m148039c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.quick_message_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148038a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138024p;
    }
}
