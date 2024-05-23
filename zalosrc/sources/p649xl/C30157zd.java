package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.zd */
/* loaded from: classes3.dex */
public final class C30157zd implements InterfaceC22715a {

    /* renamed from: p */
    private final View f140148p;

    /* renamed from: q */
    public final RecyclerView f140149q;

    /* renamed from: r */
    public final ProgressBar f140150r;

    private C30157zd(View view, RecyclerView recyclerView, ProgressBar progressBar) {
        this.f140148p = view;
        this.f140149q = recyclerView;
        this.f140150r = progressBar;
    }

    /* renamed from: a */
    public static C30157zd m148790a(View view) {
        int i11 = AbstractC6918a0.emoticon_selector_grid;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.loading_progress;
            ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
            if (progressBar != null) {
                return new C30157zd(view, recyclerView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30157zd m148791b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.trending_sticker_list, viewGroup);
            return m148790a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f140148p;
    }
}
