package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes2.dex */
public final class C2082b extends ViewPager2.AbstractC2075i {

    /* renamed from: a */
    private final List f8915a;

    public C2082b(int i11) {
        this.f8915a = new ArrayList(i11);
    }

    /* renamed from: e */
    private void m11285e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
    /* renamed from: a */
    public void mo11254a(int i11) {
        try {
            Iterator it = this.f8915a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2075i) it.next()).mo11254a(i11);
            }
        } catch (ConcurrentModificationException e11) {
            m11285e(e11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
    /* renamed from: b */
    public void mo11275b(int i11, float f11, int i12) {
        try {
            Iterator it = this.f8915a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2075i) it.next()).mo11275b(i11, f11, i12);
            }
        } catch (ConcurrentModificationException e11) {
            m11285e(e11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
    /* renamed from: c */
    public void mo11255c(int i11) {
        try {
            Iterator it = this.f8915a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2075i) it.next()).mo11255c(i11);
            }
        } catch (ConcurrentModificationException e11) {
            m11285e(e11);
        }
    }

    /* renamed from: d */
    public void m11286d(ViewPager2.AbstractC2075i abstractC2075i) {
        this.f8915a.add(abstractC2075i);
    }
}
