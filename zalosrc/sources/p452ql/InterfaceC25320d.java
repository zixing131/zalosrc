package p452ql;

import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import java.util.List;
import kotlin.coroutines.Continuation;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import qm0.AbstractC25368s;

/* renamed from: ql.d */
/* loaded from: classes3.dex */
public interface InterfaceC25320d {

    /* renamed from: ql.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ Object m131138a(InterfaceC25320d interfaceC25320d, List list, List list2, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    list = AbstractC25368s.m131502j();
                }
                if ((i11 & 2) != 0) {
                    list2 = AbstractC25368s.m131502j();
                }
                return interfaceC25320d.mo131121c(list, list2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: countAll");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m131139b(InterfaceC25320d interfaceC25320d, List list, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    list = AbstractC25368s.m131502j();
                }
                return interfaceC25320d.mo131134p(list, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAll");
        }

        /* renamed from: c */
        public static Object m131140c(InterfaceC25320d interfaceC25320d, List list, List list2, int i11, int i12, Continuation continuation) {
            List m131502j;
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }

        /* renamed from: d */
        public static /* synthetic */ Object m131141d(InterfaceC25320d interfaceC25320d, List list, List list2, int i11, int i12, Continuation continuation, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 1) != 0) {
                    list = AbstractC25368s.m131502j();
                }
                List list3 = list;
                if ((i13 & 2) != 0) {
                    list2 = AbstractC25368s.m131502j();
                }
                return interfaceC25320d.mo131131m(list3, list2, i11, i12, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }

        /* renamed from: e */
        public static /* synthetic */ Object m131142e(InterfaceC25320d interfaceC25320d, List list, List list2, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    list = AbstractC25368s.m131502j();
                }
                if ((i11 & 2) != 0) {
                    list2 = AbstractC25368s.m131502j();
                }
                return interfaceC25320d.mo131137s(list, list2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }

        /* renamed from: f */
        public static boolean m131143f(InterfaceC25320d interfaceC25320d) {
            return false;
        }
    }

    /* renamed from: a */
    Object mo131119a(AbstractC16864d abstractC16864d, Continuation continuation);

    /* renamed from: b */
    Object mo131120b(Continuation continuation);

    /* renamed from: c */
    Object mo131121c(List list, List list2, Continuation continuation);

    /* renamed from: d */
    Object mo131122d(Continuation continuation);

    /* renamed from: e */
    Object mo131123e(Continuation continuation);

    /* renamed from: f */
    void mo131124f(int i11);

    /* renamed from: g */
    Object mo131125g(Continuation continuation);

    /* renamed from: h */
    Object mo131126h(String str, EnumC25825f enumC25825f, Continuation continuation);

    /* renamed from: i */
    boolean mo131127i();

    /* renamed from: j */
    Object mo131128j(int i11, Continuation continuation);

    /* renamed from: k */
    Object mo131129k(List list, Continuation continuation);

    /* renamed from: l */
    Object mo131130l(Continuation continuation);

    /* renamed from: m */
    Object mo131131m(List list, List list2, int i11, int i12, Continuation continuation);

    /* renamed from: n */
    Object mo131132n(String str, Continuation continuation);

    /* renamed from: o */
    boolean mo131133o();

    /* renamed from: p */
    Object mo131134p(List list, Continuation continuation);

    /* renamed from: q */
    Object mo131135q(String str, EnumC25824e enumC25824e, Continuation continuation);

    /* renamed from: r */
    int mo131136r();

    /* renamed from: s */
    Object mo131137s(List list, List list2, Continuation continuation);
}
