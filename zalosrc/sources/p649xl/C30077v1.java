package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.ChatInfoHighLightSettingView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v1 */
/* loaded from: classes3.dex */
public final class C30077v1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139615p;

    /* renamed from: q */
    public final ChatInfoHighLightSettingView f139616q;

    /* renamed from: r */
    public final LinearLayout f139617r;

    /* renamed from: s */
    public final RecyclerView f139618s;

    /* renamed from: t */
    public final ZdsActionBar f139619t;

    private C30077v1(FrameLayout frameLayout, ChatInfoHighLightSettingView chatInfoHighLightSettingView, LinearLayout linearLayout, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f139615p = frameLayout;
        this.f139616q = chatInfoHighLightSettingView;
        this.f139617r = linearLayout;
        this.f139618s = recyclerView;
        this.f139619t = zdsActionBar;
    }

    /* renamed from: a */
    public static C30077v1 m148596a(View view) {
        int i11 = AbstractC6918a0.hightLightView;
        ChatInfoHighLightSettingView chatInfoHighLightSettingView = (ChatInfoHighLightSettingView) AbstractC22716b.m117526a(view, i11);
        if (chatInfoHighLightSettingView != null) {
            i11 = AbstractC6918a0.main_content_container;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.recycler_view;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C30077v1((FrameLayout) view, chatInfoHighLightSettingView, linearLayout, recyclerView, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139615p;
    }
}
