package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import java.util.ArrayList;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class ImageSlider extends ZRecyclerView implements InterfaceC13634f2 {

    /* renamed from: b1 */
    final int f69321b1;

    /* renamed from: c1 */
    final int f69322c1;

    /* renamed from: d1 */
    final Drawable f69323d1;

    /* renamed from: e1 */
    final Drawable f69324e1;

    /* renamed from: f1 */
    LinearLayoutManager f69325f1;

    /* renamed from: g1 */
    C1929v f69326g1;

    /* renamed from: h1 */
    RecyclerView.AbstractC1898y f69327h1;

    /* renamed from: i1 */
    InterfaceC13721r0 f69328i1;

    /* renamed from: j1 */
    ArrayList f69329j1;

    /* renamed from: k1 */
    float f69330k1;

    /* renamed from: l1 */
    float f69331l1;

    /* renamed from: m1 */
    boolean f69332m1;

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f69323d1.setBounds(0, 0, this.f69321b1, getHeight());
        this.f69323d1.draw(canvas);
        this.f69324e1.setBounds(getWidth() - this.f69321b1, 0, getWidth(), getHeight());
        this.f69324e1.draw(canvas);
    }

    public ArrayList<MediaItem> getData() {
        return this.f69329j1;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13634f2
    public void next() {
        try {
            if (this.f69329j1.size() == 0) {
                return;
            }
            this.f69327h1.m10244p(m9817A0(this.f69326g1.mo10402h(this.f69325f1)) - 1);
            this.f69325f1.m10090H1(this.f69327h1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC13721r0 interfaceC13721r0;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (interfaceC13721r0 = this.f69328i1) != null) {
                        interfaceC13721r0.mo75833e();
                    }
                } else if (!this.f69332m1 && Math.abs(motionEvent.getX() - this.f69330k1) >= this.f69322c1) {
                    this.f69332m1 = true;
                }
            } else if (this.f69328i1 != null) {
                if (!this.f69332m1) {
                    float x11 = motionEvent.getX() - this.f69330k1;
                    float y11 = motionEvent.getY() - this.f69331l1;
                    if (Math.abs(x11) <= this.f69322c1 && Math.abs(y11) <= this.f69322c1) {
                        this.f69328i1.mo75832c();
                    }
                }
                this.f69328i1.mo75833e();
            }
        } else {
            this.f69330k1 = motionEvent.getX();
            this.f69331l1 = motionEvent.getY();
            this.f69332m1 = false;
            InterfaceC13721r0 interfaceC13721r02 = this.f69328i1;
            if (interfaceC13721r02 != null) {
                interfaceC13721r02.mo75831a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setData(ArrayList<MediaItem> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f69329j1 = arrayList;
        getAdapter().m10008p();
        this.f69325f1.m9721B2(1073741823, AbstractC23136l9.m118742r(20.0f));
    }

    public void setInteractionListener(InterfaceC13721r0 interfaceC13721r0) {
        this.f69328i1 = interfaceC13721r0;
    }
}
