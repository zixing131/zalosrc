package p149f4;

/* renamed from: f4.b */
/* loaded from: classes.dex */
public abstract class AbstractC18717b {
    /* renamed from: a */
    public static Object m98707a(int i11, Object obj, InterfaceC18716a interfaceC18716a, InterfaceC18718c interfaceC18718c) {
        Object apply;
        if (i11 < 1) {
            return interfaceC18716a.apply(obj);
        }
        do {
            apply = interfaceC18716a.apply(obj);
            obj = interfaceC18718c.mo18891a(obj, apply);
            if (obj == null) {
                break;
            }
            i11--;
        } while (i11 >= 1);
        return apply;
    }
}
