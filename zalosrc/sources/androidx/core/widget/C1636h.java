package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes2.dex */
public class C1636h extends AbstractViewOnTouchListenerC1629a {

    /* renamed from: H */
    private final ListView f6670H;

    public C1636h(ListView listView) {
        super(listView);
        this.f6670H = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC1629a
    /* renamed from: a */
    public boolean mo8344a(int i11) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC1629a
    /* renamed from: b */
    public boolean mo8345b(int i11) {
        ListView listView = this.f6670H;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i12 = firstVisiblePosition + childCount;
        if (i11 > 0) {
            if (i12 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i11 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC1629a
    /* renamed from: j */
    public void mo8347j(int i11, int i12) {
        AbstractC1637i.m8398b(this.f6670H, i12);
    }
}
