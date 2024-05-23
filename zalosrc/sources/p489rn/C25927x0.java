package p489rn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.C3000l0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.FeedItemSuggestFriendPage;
import java.util.ArrayList;
import java.util.List;
import p716zh.C31874cb;

/* renamed from: rn.x0 */
/* loaded from: classes4.dex */
public class C25927x0 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f123633r;

    /* renamed from: s */
    private final LayoutInflater f123634s;

    /* renamed from: t */
    private a f123635t;

    /* renamed from: u */
    private C3000l0 f123636u;

    /* renamed from: w */
    private ArrayList f123638w;

    /* renamed from: v */
    private boolean f123637v = false;

    /* renamed from: x */
    private boolean f123639x = false;

    /* renamed from: rn.x0$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: x2 */
        void mo36956x2(C31874cb c31874cb, int i11, int i12);
    }

    /* renamed from: rn.x0$b */
    /* loaded from: classes4.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        FeedItemSuggestFriendPage f123640I;

        public b(View view, Context context) {
            super(view);
            m133592i0(view, context);
        }

        /* renamed from: i0 */
        private void m133592i0(View view, Context context) {
            FeedItemSuggestFriendPage feedItemSuggestFriendPage = (FeedItemSuggestFriendPage) view.findViewById(AbstractC6918a0.feedItemSuggestFriendPage);
            this.f123640I = feedItemSuggestFriendPage;
            feedItemSuggestFriendPage.m44122d(context, 0);
        }
    }

    public C25927x0(Context context) {
        this.f123633r = context;
        this.f123634s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: L */
    public C31874cb m133584L(int i11) {
        ArrayList arrayList = this.f123638w;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C31874cb) this.f123638w.get(i11);
        }
        return null;
    }

    /* renamed from: M */
    public List m133585M() {
        return this.f123638w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(b bVar, int i11) {
        try {
            bVar.f123640I.m44123h(i11, m133584L(i11), this.f123637v, this.f123635t, this.f123639x);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        return new b(this.f123634s.inflate(AbstractC7409c0.feed_item_suggest_friend_page, viewGroup, false), this.f123633r);
    }

    /* renamed from: P */
    public void m133588P(ArrayList arrayList, C3000l0 c3000l0) {
        this.f123638w = new ArrayList(arrayList);
        this.f123636u = c3000l0;
    }

    /* renamed from: Q */
    public void m133589Q(a aVar) {
        this.f123635t = aVar;
    }

    /* renamed from: R */
    public void m133590R(boolean z11) {
        this.f123639x = z11;
    }

    /* renamed from: S */
    public void m133591S(boolean z11) {
        this.f123637v = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f123638w;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
