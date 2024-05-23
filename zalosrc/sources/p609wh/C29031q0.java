package p609wh;

import be.C2774c;
import java.util.ArrayList;

/* renamed from: wh.q0 */
/* loaded from: classes3.dex */
public class C29031q0 {

    /* renamed from: a */
    public final String f134379a = getClass().getSimpleName();

    /* renamed from: b */
    private final ArrayList f134380b = new ArrayList();

    /* renamed from: a */
    public void m145030a(C2774c c2774c) {
        try {
            synchronized (this.f134380b) {
                this.f134380b.add(c2774c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public C2774c m145031b() {
        if (this.f134380b.size() > 0) {
            return (C2774c) this.f134380b.remove(0);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m145032c() {
        return this.f134380b.isEmpty();
    }
}
