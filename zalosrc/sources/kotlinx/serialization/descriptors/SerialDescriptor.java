package kotlinx.serialization.descriptors;

import java.util.List;
import qm0.AbstractC25368s;
import sn0.AbstractC26341h;

/* loaded from: classes7.dex */
public interface SerialDescriptor {

    /* renamed from: kotlinx.serialization.descriptors.SerialDescriptor$a */
    /* loaded from: classes7.dex */
    public static final class C21879a {
        /* renamed from: a */
        public static List m113957a(SerialDescriptor serialDescriptor) {
            List m131502j;
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }

        /* renamed from: b */
        public static boolean m113958b(SerialDescriptor serialDescriptor) {
            return false;
        }

        /* renamed from: c */
        public static boolean m113959c(SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    /* renamed from: b */
    boolean mo113946b();

    /* renamed from: c */
    int mo113947c(String str);

    /* renamed from: d */
    AbstractC26341h mo113948d();

    /* renamed from: e */
    int mo113949e();

    /* renamed from: f */
    String mo113950f(int i11);

    /* renamed from: g */
    List mo113951g(int i11);

    /* renamed from: h */
    SerialDescriptor mo113952h(int i11);

    /* renamed from: i */
    String mo113953i();

    /* renamed from: j */
    List mo113954j();

    /* renamed from: k */
    boolean mo113955k();

    /* renamed from: l */
    boolean mo113956l(int i11);
}
