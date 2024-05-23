package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes2.dex */
class C1922o {

    /* renamed from: b */
    int f8191b;

    /* renamed from: c */
    int f8192c;

    /* renamed from: d */
    int f8193d;

    /* renamed from: e */
    int f8194e;

    /* renamed from: h */
    boolean f8197h;

    /* renamed from: i */
    boolean f8198i;

    /* renamed from: a */
    boolean f8190a = true;

    /* renamed from: f */
    int f8195f = 0;

    /* renamed from: g */
    int f8196g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m10614a(RecyclerView.C1899z c1899z) {
        int i11 = this.f8192c;
        if (i11 >= 0 && i11 < c1899z.m10253b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m10615b(RecyclerView.C1894u c1894u) {
        View m10218o = c1894u.m10218o(this.f8192c);
        this.f8192c += this.f8193d;
        return m10218o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f8191b + ", mCurrentPosition=" + this.f8192c + ", mItemDirection=" + this.f8193d + ", mLayoutDirection=" + this.f8194e + ", mStartLine=" + this.f8195f + ", mEndLine=" + this.f8196g + '}';
    }
}
