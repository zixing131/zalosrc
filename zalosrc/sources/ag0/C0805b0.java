package ag0;

import java.util.ArrayList;
import p716zh.InterfaceC31872c9;

/* renamed from: ag0.b0 */
/* loaded from: classes6.dex */
public class C0805b0 {

    /* renamed from: a */
    public final String f2783a = getClass().getSimpleName();

    /* renamed from: b */
    private final ArrayList f2784b = new ArrayList();

    /* renamed from: a */
    public void m2037a(InterfaceC31872c9 interfaceC31872c9) {
        try {
            synchronized (this.f2784b) {
                this.f2784b.add(interfaceC31872c9);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public InterfaceC31872c9 m2038b() {
        if (this.f2784b.size() > 0) {
            return (InterfaceC31872c9) this.f2784b.remove(0);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m2039c() {
        return this.f2784b.isEmpty();
    }
}
