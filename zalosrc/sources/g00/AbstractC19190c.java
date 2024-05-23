package g00;

import java.util.Arrays;

/* renamed from: g00.c */
/* loaded from: classes4.dex */
public abstract class AbstractC19190c extends AbstractC19188a implements Cloneable {
    private static final long serialVersionUID = 1;

    public AbstractC19190c(int i11) {
        this.f95311p = new double[i11];
    }

    /* renamed from: a */
    public AbstractC19190c m100639a() {
        try {
            AbstractC19190c abstractC19190c = (AbstractC19190c) super.clone();
            abstractC19190c.f95311p = ((double[]) this.f95311p).clone();
            return abstractC19190c;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return Arrays.equals((double[]) this.f95311p, (double[]) ((AbstractC19190c) obj).f95311p);
    }

    public int hashCode() {
        return Arrays.hashCode((double[]) this.f95311p);
    }

    public String toString() {
        return getClass().getName() + Arrays.toString((double[]) this.f95311p);
    }
}
