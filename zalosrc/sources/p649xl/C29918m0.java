package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m0 */
/* loaded from: classes3.dex */
public final class C29918m0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138631p;

    /* renamed from: q */
    public final LinearLayout f138632q;

    /* renamed from: r */
    public final ListItem f138633r;

    /* renamed from: s */
    public final ListItem f138634s;

    /* renamed from: t */
    public final ListItem f138635t;

    private C29918m0(LinearLayout linearLayout, LinearLayout linearLayout2, ListItem listItem, ListItem listItem2, ListItem listItem3) {
        this.f138631p = linearLayout;
        this.f138632q = linearLayout2;
        this.f138633r = listItem;
        this.f138634s = listItem2;
        this.f138635t = listItem3;
    }

    /* renamed from: a */
    public static C29918m0 m148223a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = AbstractC6918a0.item_audio_output;
        ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
        if (listItem != null) {
            i11 = AbstractC6918a0.item_filter;
            ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem2 != null) {
                i11 = AbstractC6918a0.item_split_screen;
                ListItem listItem3 = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem3 != null) {
                    return new C29918m0(linearLayout, linearLayout, listItem, listItem2, listItem3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29918m0 m148224c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_call_config_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148223a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138631p;
    }
}
