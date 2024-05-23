package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2065a {

    /* renamed from: a */
    private final DataSetObservable f8866a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f8867b;

    /* renamed from: a */
    public abstract void mo11217a(ViewGroup viewGroup, int i11, Object obj);

    /* renamed from: b */
    public void m11218b(View view) {
    }

    /* renamed from: c */
    public void m11219c(ViewGroup viewGroup) {
        m11218b(viewGroup);
    }

    /* renamed from: d */
    public abstract int mo11220d();

    /* renamed from: e */
    public int mo11221e(Object obj) {
        return -1;
    }

    /* renamed from: f */
    public CharSequence m11222f(int i11) {
        return null;
    }

    /* renamed from: g */
    public float m11223g(int i11) {
        return 1.0f;
    }

    /* renamed from: h */
    public abstract Object mo11224h(ViewGroup viewGroup, int i11);

    /* renamed from: i */
    public abstract boolean mo11225i(View view, Object obj);

    /* renamed from: j */
    public void m11226j() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f8867b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f8866a.notifyChanged();
    }

    /* renamed from: k */
    public void m11227k(DataSetObserver dataSetObserver) {
        this.f8866a.registerObserver(dataSetObserver);
    }

    /* renamed from: l */
    public void m11228l(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: m */
    public Parcelable m11229m() {
        return null;
    }

    /* renamed from: n */
    public void m11230n(View view, int i11, Object obj) {
    }

    /* renamed from: o */
    public void m11231o(ViewGroup viewGroup, int i11, Object obj) {
        m11230n(viewGroup, i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m11232p(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f8867b = dataSetObserver;
        }
    }

    /* renamed from: q */
    public void m11233q(View view) {
    }

    /* renamed from: r */
    public void m11234r(ViewGroup viewGroup) {
        m11233q(viewGroup);
    }

    /* renamed from: s */
    public void m11235s(DataSetObserver dataSetObserver) {
        this.f8866a.unregisterObserver(dataSetObserver);
    }
}
