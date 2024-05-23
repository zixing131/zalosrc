package fo0;

import java.util.Hashtable;

/* renamed from: fo0.a */
/* loaded from: classes7.dex */
public class C19090a {

    /* renamed from: a */
    private final int f95027a;

    /* renamed from: b */
    private final Hashtable f95028b = new Hashtable();

    public C19090a(int i11) {
        this.f95027a = i11;
    }

    /* renamed from: a */
    public int m100285a(int i11) {
        Integer num = (Integer) this.f95028b.get(Integer.valueOf(i11));
        if (num == null) {
            return this.f95027a;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public void m100286b(int i11, int i12) {
        if (i12 == this.f95027a) {
            this.f95028b.remove(Integer.valueOf(i11));
        } else {
            this.f95028b.put(Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }
}
