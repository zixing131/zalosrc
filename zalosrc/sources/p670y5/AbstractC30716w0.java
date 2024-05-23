package p670y5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: y5.w0 */
/* loaded from: classes2.dex */
abstract class AbstractC30716w0 extends AbstractC30735x0 {

    /* renamed from: a */
    Object[] f141950a = new Object[4];

    /* renamed from: b */
    int f141951b = 0;

    /* renamed from: c */
    boolean f141952c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC30716w0(int i11) {
    }

    /* renamed from: d */
    private final void m149682d(int i11) {
        Object[] objArr = this.f141950a;
        int length = objArr.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f141950a = Arrays.copyOf(objArr, i12);
            this.f141952c = false;
            return;
        }
        if (this.f141952c) {
            this.f141950a = (Object[]) objArr.clone();
            this.f141952c = false;
        }
    }

    /* renamed from: b */
    public final AbstractC30716w0 m149683b(Object obj) {
        obj.getClass();
        m149682d(this.f141951b + 1);
        Object[] objArr = this.f141950a;
        int i11 = this.f141951b;
        this.f141951b = i11 + 1;
        objArr[i11] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final AbstractC30735x0 m149684c(Iterable iterable) {
        if (iterable instanceof Collection) {
            m149682d(this.f141951b + iterable.size());
            if (iterable instanceof AbstractC30754y0) {
                this.f141951b = ((AbstractC30754y0) iterable).mo149494d(this.f141950a, this.f141951b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo149463a(it.next());
        }
        return this;
    }
}
