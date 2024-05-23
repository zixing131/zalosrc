package com.zing.zalo.adapters;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.adapters.v6 */
/* loaded from: classes3.dex */
public class C7240v6 extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private int f39766a = 0;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        super.mo10066g(rect, view, recyclerView, c1899z);
        int i11 = this.f39766a;
        if (i11 == 3) {
            int m10253b = c1899z.m10253b();
            int m9817A0 = recyclerView.m9817A0(view);
            if (m10253b == 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            }
            if (m9817A0 == 0) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, 0);
                return;
            } else if (m10253b > 0 && m9817A0 == m10253b - 1) {
                rect.set(AbstractC23136l9.m118742r(1.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            } else {
                rect.set(AbstractC23136l9.m118742r(1.0f), 0, 0, 0);
                return;
            }
        }
        if (i11 == 4) {
            int m10253b2 = c1899z.m10253b();
            int m9817A02 = recyclerView.m9817A0(view);
            if (m10253b2 == 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            }
            if (m9817A02 == 0) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, 0);
                return;
            } else if (m10253b2 > 0 && m9817A02 == m10253b2 - 1) {
                rect.set(AbstractC23136l9.m118742r(14.0f), 0, AbstractC23136l9.m118742r(14.0f), 0);
                return;
            } else {
                rect.set(AbstractC23136l9.m118742r(2.0f), 0, 0, 0);
                return;
            }
        }
        if (i11 == 5) {
            int m10253b3 = c1899z.m10253b();
            int m9817A03 = recyclerView.m9817A0(view);
            if (m10253b3 == 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            }
            if (m9817A03 == 0) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, 0);
                return;
            } else if (m10253b3 > 0 && m9817A03 == m10253b3 - 1) {
                rect.set(AbstractC23136l9.m118742r(2.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            } else {
                rect.set(AbstractC23136l9.m118742r(2.0f), 0, 0, 0);
                return;
            }
        }
        if (i11 == 1) {
            int m10253b4 = c1899z.m10253b();
            int m9817A04 = recyclerView.m9817A0(view);
            if (m10253b4 == 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            }
            if (m9817A04 == 0) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, 0);
                return;
            } else if (m10253b4 > 0 && m9817A04 == m10253b4 - 1) {
                rect.set(AbstractC23136l9.m118742r(14.0f), 0, AbstractC23136l9.m118742r(14.0f), 0);
                return;
            } else {
                rect.set(AbstractC23136l9.m118742r(8.0f), 0, 0, 0);
                return;
            }
        }
        if (i11 == 2) {
            int m10253b5 = c1899z.m10253b();
            int m9817A05 = recyclerView.m9817A0(view);
            if (m10253b5 == 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            }
            if (m9817A05 == 0) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, 0);
                return;
            } else if (m10253b5 > 0 && m9817A05 == m10253b5 - 1) {
                rect.set(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            } else {
                rect.set(AbstractC23136l9.m118742r(8.0f), 0, 0, 0);
                return;
            }
        }
        if (i11 == 6) {
            int m10253b6 = c1899z.m10253b();
            int m9817A06 = recyclerView.m9817A0(view);
            if (m10253b6 == 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, AbstractC23136l9.m118742r(4.0f));
                return;
            }
            if (m9817A06 == 0) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, 0, 0);
                return;
            } else if (m10253b6 > 0 && m9817A06 == m10253b6 - 1) {
                rect.set(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
                return;
            } else {
                rect.set(AbstractC23136l9.m118742r(8.0f), 0, 0, 0);
                return;
            }
        }
        if (i11 == 7) {
            int m10253b7 = c1899z.m10253b();
            int m9817A07 = recyclerView.m9817A0(view);
            if (m9817A07 == 0) {
                rect.set(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
                return;
            } else if (m10253b7 > 0 && m9817A07 == m10253b7 - 1) {
                rect.set(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(14.0f), 0);
                return;
            } else {
                rect.set(0, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
                return;
            }
        }
        if (recyclerView.m9817A0(view) == 0) {
            rect.set(AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(10.0f), 0);
        } else {
            rect.set(0, 0, AbstractC23136l9.m118742r(10.0f), 0);
        }
    }

    /* renamed from: l */
    public void m36957l(int i11) {
        this.f39766a = i11;
    }
}
