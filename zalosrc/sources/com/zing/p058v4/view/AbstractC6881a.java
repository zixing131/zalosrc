package com.zing.p058v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.zing.v4.view.a */
/* loaded from: classes.dex */
public abstract class AbstractC6881a {

    /* renamed from: p */
    private final DataSetObservable f37739p = new DataSetObservable();

    /* renamed from: q */
    private DataSetObserver f37740q;

    /* renamed from: d */
    public abstract void mo35332d(ViewGroup viewGroup, int i11, Object obj);

    /* renamed from: e */
    public void m35333e(View view) {
    }

    /* renamed from: f */
    public void mo35334f(ViewGroup viewGroup) {
        m35333e(viewGroup);
    }

    /* renamed from: g */
    public abstract int mo35335g();

    /* renamed from: h */
    public int mo35336h(Object obj) {
        return -1;
    }

    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        return null;
    }

    /* renamed from: j */
    public float mo35338j(int i11) {
        return 1.0f;
    }

    /* renamed from: k */
    public abstract Object mo35339k(ViewGroup viewGroup, int i11);

    /* renamed from: l */
    public abstract boolean mo35340l(View view, Object obj);

    /* renamed from: m */
    public void mo35341m() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f37740q;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f37739p.notifyChanged();
    }

    /* renamed from: n */
    public void m35342n(DataSetObserver dataSetObserver) {
        this.f37739p.registerObserver(dataSetObserver);
    }

    /* renamed from: o */
    public void mo35343o(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: p */
    public Parcelable mo35344p() {
        return null;
    }

    /* renamed from: q */
    public void m35345q(View view, int i11, Object obj) {
    }

    /* renamed from: r */
    public void mo35346r(ViewGroup viewGroup, int i11, Object obj) {
        m35345q(viewGroup, i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35347s(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f37740q = dataSetObserver;
        }
    }

    /* renamed from: t */
    public void m35348t(View view) {
    }

    /* renamed from: u */
    public void mo35349u(ViewGroup viewGroup) {
        m35348t(viewGroup);
    }

    /* renamed from: v */
    public void m35350v(DataSetObserver dataSetObserver) {
        this.f37739p.unregisterObserver(dataSetObserver);
    }
}
