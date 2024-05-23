package aa0;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import p667y2.C30268e;

/* renamed from: aa0.a */
/* loaded from: classes6.dex */
final class C0670a extends RecyclerView.AbstractC1892s implements RecyclerView.InterfaceC1891r {

    /* renamed from: a */
    private int f2228a;

    /* renamed from: b */
    private int f2229b = -1;

    /* renamed from: c */
    private int f2230c;

    /* renamed from: d */
    private int f2231d;

    /* renamed from: e */
    private int f2232e;

    /* renamed from: f */
    private int f2233f;

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(recyclerView, "rv");
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: b */
    public void mo952b(RecyclerView recyclerView, int i11) {
        RecyclerView.AbstractC1888o layoutManager;
        boolean mo9757x;
        boolean mo9758y;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        int i12 = this.f2228a;
        this.f2228a = i11;
        if (i12 == 0 && i11 == 1 && (layoutManager = recyclerView.getLayoutManager()) != null && (mo9757x = layoutManager.mo9757x()) != (mo9758y = layoutManager.mo9758y())) {
            if ((mo9757x && Math.abs(this.f2233f) > Math.abs(this.f2232e)) || (mo9758y && Math.abs(this.f2232e) > Math.abs(this.f2233f))) {
                recyclerView.m9866X1();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(recyclerView, "rv");
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f2229b = motionEvent.getPointerId(actionIndex);
                    this.f2230c = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2231d = (int) (motionEvent.getY(actionIndex) + 0.5f);
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2229b);
                if (findPointerIndex >= 0 && this.f2228a != 1) {
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    this.f2232e = x11 - this.f2230c;
                    this.f2233f = y11 - this.f2231d;
                }
            }
        } else {
            this.f2229b = motionEvent.getPointerId(0);
            this.f2230c = (int) (motionEvent.getX() + 0.5f);
            this.f2231d = (int) (motionEvent.getY() + 0.5f);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: e */
    public void mo954e(boolean z11) {
    }
}
