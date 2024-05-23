package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import p674y9.C30851h;

/* renamed from: z9.g */
/* loaded from: classes3.dex */
public final class C31720g extends AbstractC6750k {

    /* renamed from: b */
    public static final InterfaceC6751l f145693b = new a();

    /* renamed from: a */
    private final C6743d f145694a;

    /* renamed from: z9.g$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC6751l {
        a() {
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new C31720g(c6743d);
            }
            return null;
        }
    }

    /* renamed from: z9.g$b */
    /* loaded from: classes3.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f145695a;

        static {
            int[] iArr = new int[EnumC3381b.values().length];
            f145695a = iArr;
            try {
                iArr[EnumC3381b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f145695a[EnumC3381b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f145695a[EnumC3381b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f145695a[EnumC3381b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f145695a[EnumC3381b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f145695a[EnumC3381b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C31720g(C6743d c6743d) {
        this.f145694a = c6743d;
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: b */
    public Object mo34534b(C3380a c3380a) {
        switch (b.f145695a[c3380a.m17001N().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c3380a.m17003a();
                while (c3380a.m17010q()) {
                    arrayList.add(mo34534b(c3380a));
                }
                c3380a.m17007h();
                return arrayList;
            case 2:
                C30851h c30851h = new C30851h();
                c3380a.m17004b();
                while (c3380a.m17010q()) {
                    c30851h.put(c3380a.m16998F(), mo34534b(c3380a));
                }
                c3380a.m17008i();
                return c30851h;
            case 3:
                return c3380a.m17000L();
            case 4:
                return Double.valueOf(c3380a.m17014y());
            case 5:
                return Boolean.valueOf(c3380a.m17013v());
            case 6:
                c3380a.m16999J();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: d */
    public void mo34535d(C3382c c3382c, Object obj) {
        if (obj == null) {
            c3382c.mo17043v();
            return;
        }
        AbstractC6750k m34527k = this.f145694a.m34527k(obj.getClass());
        if (m34527k instanceof C31720g) {
            c3382c.mo17036d();
            c3382c.mo17038i();
        } else {
            m34527k.mo34535d(c3382c, obj);
        }
    }
}
