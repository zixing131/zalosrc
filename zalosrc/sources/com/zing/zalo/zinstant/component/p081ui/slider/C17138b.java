package com.zing.zalo.zinstant.component.p081ui.slider;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nk0.InterfaceC23860v;

/* renamed from: com.zing.zalo.zinstant.component.ui.slider.b */
/* loaded from: classes7.dex */
public class C17138b extends AbstractC17137a {

    /* renamed from: x */
    private int f87630x;

    public C17138b(int i11, int i12, InterfaceC23860v interfaceC23860v) {
        super(i11, i12, interfaceC23860v);
        this.f87630x = 0;
    }

    /* renamed from: T */
    private void m91639T(AbstractC17137a.d dVar, int i11) {
        Iterator it = m91640U(dVar, i11).iterator();
        while (it.hasNext()) {
            ((ObjectAnimator) it.next()).start();
        }
    }

    /* renamed from: U */
    private List m91640U(AbstractC17137a.d dVar, int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = this.f87630x;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    AbstractC20110a.m104538g("This animation is not supposed to be processed here", new Object[0]);
                } else {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dVar.f87629I, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.25f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.25f, 1.0f));
                    ofPropertyValuesHolder.setDuration(500L);
                    ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                    arrayList.add(ofPropertyValuesHolder);
                }
            } else {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar.f87629I, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.setInterpolator(new LinearInterpolator());
                arrayList.add(ofFloat);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo9990A(AbstractC17137a.d dVar, int i11) {
        super.mo9990A(dVar, i11);
        m91639T(dVar, i11);
    }

    /* renamed from: V */
    public void m91641V(int i11) {
        this.f87630x = i11;
    }
}
