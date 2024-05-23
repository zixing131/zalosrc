package p596w3;

import android.util.SparseArray;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p566v3.InterfaceC27493a;

/* renamed from: w3.f */
/* loaded from: classes2.dex */
public abstract class AbstractC28708f {

    /* renamed from: a */
    private final SparseArray f133197a;

    /* renamed from: b */
    private final List f133198b;

    /* renamed from: c */
    private final int f133199c;

    /* renamed from: d */
    private final int f133200d;

    public AbstractC28708f(List list, float[][][] fArr) {
        int size = list.size();
        this.f133197a = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC27493a interfaceC27493a = (InterfaceC27493a) list.get(i11);
            this.f133197a.put(interfaceC27493a.mo140593a(), interfaceC27493a);
        }
        this.f133199c = this.f133197a.keyAt(0);
        this.f133200d = this.f133197a.keyAt(r7.size() - 1);
        this.f133198b = AbstractC28703a.m143754a(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static float m143778c(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* renamed from: a */
    public void m143779a(float f11, Object obj) {
        InterfaceC27493a interfaceC27493a;
        InterfaceC27493a interfaceC27493a2 = null;
        if (!this.f133198b.isEmpty() && f11 > this.f133199c) {
            int i11 = this.f133200d;
            if (f11 >= i11) {
                mo143756b((InterfaceC27493a) this.f133197a.get(i11), null, 0.0f, obj);
                return;
            }
            int size = this.f133198b.size();
            int i12 = 0;
            while (i12 < size) {
                if (this.f133197a.keyAt(i12) != f11 && (this.f133197a.keyAt(i12) >= f11 || this.f133197a.keyAt(i12 + 1) <= f11)) {
                    i12++;
                } else {
                    interfaceC27493a2 = (InterfaceC27493a) this.f133197a.valueAt(i12);
                    interfaceC27493a = (InterfaceC27493a) this.f133197a.valueAt(i12 + 1);
                    break;
                }
            }
            interfaceC27493a = null;
            if (interfaceC27493a2 != null) {
                mo143756b(interfaceC27493a2, interfaceC27493a, ((Interpolator) this.f133198b.get(i12)).getInterpolation((f11 - interfaceC27493a2.mo140593a()) / (interfaceC27493a.mo140593a() - interfaceC27493a2.mo140593a())), obj);
                return;
            }
            return;
        }
        mo143756b((InterfaceC27493a) this.f133197a.get(this.f133199c), null, 0.0f, obj);
    }

    /* renamed from: b */
    protected abstract void mo143756b(InterfaceC27493a interfaceC27493a, InterfaceC27493a interfaceC27493a2, float f11, Object obj);

    public AbstractC28708f(AbstractC28708f abstractC28708f) {
        SparseArray sparseArray = abstractC28708f.f133197a;
        if (sparseArray != null) {
            this.f133197a = sparseArray.clone();
        } else {
            this.f133197a = null;
        }
        if (abstractC28708f.f133198b != null) {
            this.f133198b = new ArrayList();
            int size = abstractC28708f.f133198b.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f133198b.add((Interpolator) abstractC28708f.f133198b.get(i11));
            }
        } else {
            this.f133198b = null;
        }
        this.f133199c = abstractC28708f.f133199c;
        this.f133200d = abstractC28708f.f133200d;
    }
}
