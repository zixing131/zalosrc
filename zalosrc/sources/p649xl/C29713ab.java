package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalResultPageLayout;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ab */
/* loaded from: classes3.dex */
public final class C29713ab implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137245p;

    /* renamed from: q */
    public final SearchGlobalResultPageLayout f137246q;

    /* renamed from: r */
    public final FrameLayout f137247r;

    /* renamed from: s */
    public final ZdsActionBar f137248s;

    private C29713ab(RelativeLayout relativeLayout, SearchGlobalResultPageLayout searchGlobalResultPageLayout, FrameLayout frameLayout, ZdsActionBar zdsActionBar) {
        this.f137245p = relativeLayout;
        this.f137246q = searchGlobalResultPageLayout;
        this.f137247r = frameLayout;
        this.f137248s = zdsActionBar;
    }

    /* renamed from: a */
    public static C29713ab m147731a(View view) {
        int i11 = AbstractC6918a0.resultPageLayout;
        SearchGlobalResultPageLayout searchGlobalResultPageLayout = (SearchGlobalResultPageLayout) AbstractC22716b.m117526a(view, i11);
        if (searchGlobalResultPageLayout != null) {
            i11 = AbstractC6918a0.search_content;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C29713ab((RelativeLayout) view, searchGlobalResultPageLayout, frameLayout, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29713ab m147732c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.search_global_sub_screen, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147731a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137245p;
    }
}
