package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.CustomEditText;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e2 */
/* loaded from: classes3.dex */
public final class C29776e2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137636p;

    /* renamed from: q */
    public final ImageView f137637q;

    /* renamed from: r */
    public final CustomEditText f137638r;

    /* renamed from: s */
    public final LinearLayout f137639s;

    private C29776e2(FrameLayout frameLayout, ImageView imageView, CustomEditText customEditText, LinearLayout linearLayout) {
        this.f137636p = frameLayout;
        this.f137637q = imageView;
        this.f137638r = customEditText;
        this.f137639s = linearLayout;
    }

    /* renamed from: a */
    public static C29776e2 m147882a(View view) {
        int i11 = AbstractC6918a0.btn_search_back;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC6918a0.chat_search_input;
            CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
            if (customEditText != null) {
                i11 = AbstractC6918a0.search_container;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    return new C29776e2((FrameLayout) view, imageView, customEditText, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29776e2 m147883c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.collection_detail_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147882a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137636p;
    }
}
