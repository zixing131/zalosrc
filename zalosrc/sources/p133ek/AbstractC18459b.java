package p133ek;

/* renamed from: ek.b */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC18459b {
    /* renamed from: a */
    public static /* synthetic */ int m97786a(double d11) {
        long doubleToLongBits = Double.doubleToLongBits(d11);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
