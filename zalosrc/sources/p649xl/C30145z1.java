package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chattag.ChatTagFilterSkeletonView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.EmptyState;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.z1 */
/* loaded from: classes3.dex */
public final class C30145z1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f140074p;

    /* renamed from: q */
    public final Button f140075q;

    /* renamed from: r */
    public final EmptyState f140076r;

    /* renamed from: s */
    public final FrameLayout f140077s;

    /* renamed from: t */
    public final Divider f140078t;

    /* renamed from: u */
    public final ChatTagFilterSkeletonView f140079u;

    /* renamed from: v */
    public final RecyclerView f140080v;

    private C30145z1(RelativeLayout relativeLayout, Button button, EmptyState emptyState, FrameLayout frameLayout, Divider divider, ChatTagFilterSkeletonView chatTagFilterSkeletonView, RecyclerView recyclerView) {
        this.f140074p = relativeLayout;
        this.f140075q = button;
        this.f140076r = emptyState;
        this.f140077s = frameLayout;
        this.f140078t = divider;
        this.f140079u = chatTagFilterSkeletonView;
        this.f140080v = recyclerView;
    }

    /* renamed from: a */
    public static C30145z1 m148762a(View view) {
        int i11 = AbstractC6918a0.btn_open_setting;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.empty_state_view;
            EmptyState emptyState = (EmptyState) AbstractC22716b.m117526a(view, i11);
            if (emptyState != null) {
                i11 = AbstractC6918a0.header;
                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout != null) {
                    i11 = AbstractC6918a0.header_divider;
                    Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
                    if (divider != null) {
                        i11 = AbstractC6918a0.loading_view;
                        ChatTagFilterSkeletonView chatTagFilterSkeletonView = (ChatTagFilterSkeletonView) AbstractC22716b.m117526a(view, i11);
                        if (chatTagFilterSkeletonView != null) {
                            i11 = AbstractC6918a0.rv_list_tag;
                            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                            if (recyclerView != null) {
                                return new C30145z1((RelativeLayout) view, button, emptyState, frameLayout, divider, chatTagFilterSkeletonView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30145z1 m148763c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.chat_tag_filter_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148762a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f140074p;
    }
}
