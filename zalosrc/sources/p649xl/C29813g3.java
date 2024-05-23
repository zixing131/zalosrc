package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g3 */
/* loaded from: classes3.dex */
public final class C29813g3 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f137841p;

    /* renamed from: q */
    public final ImageButton f137842q;

    /* renamed from: r */
    public final RecyclerView f137843r;

    private C29813g3(View view, ImageButton imageButton, RecyclerView recyclerView) {
        this.f137841p = view;
        this.f137842q = imageButton;
        this.f137843r = recyclerView;
    }

    /* renamed from: a */
    public static C29813g3 m147977a(View view) {
        int i11 = AbstractC6918a0.delete_emoji_button;
        ImageButton imageButton = (ImageButton) AbstractC22716b.m117526a(view, i11);
        if (imageButton != null) {
            i11 = AbstractC6918a0.emoticon_selector_grid;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                return new C29813g3(view, imageButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29813g3 m147978b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.emoji_list_new, viewGroup);
            return m147977a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f137841p;
    }
}
