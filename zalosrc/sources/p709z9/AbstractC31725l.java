package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6745f;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.C6744e;
import com.google.gson.C6746g;
import com.google.gson.C6747h;
import com.google.gson.C6748i;
import com.google.gson.InterfaceC6751l;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p637x9.InterfaceC29512c;
import p674y9.C30850g;

/* renamed from: z9.l */
/* loaded from: classes3.dex */
public abstract class AbstractC31725l {

    /* renamed from: A */
    public static final AbstractC6750k f145720A;

    /* renamed from: B */
    public static final AbstractC6750k f145721B;

    /* renamed from: C */
    public static final AbstractC6750k f145722C;

    /* renamed from: D */
    public static final InterfaceC6751l f145723D;

    /* renamed from: E */
    public static final AbstractC6750k f145724E;

    /* renamed from: F */
    public static final InterfaceC6751l f145725F;

    /* renamed from: G */
    public static final AbstractC6750k f145726G;

    /* renamed from: H */
    public static final InterfaceC6751l f145727H;

    /* renamed from: I */
    public static final AbstractC6750k f145728I;

    /* renamed from: J */
    public static final InterfaceC6751l f145729J;

    /* renamed from: K */
    public static final AbstractC6750k f145730K;

    /* renamed from: L */
    public static final InterfaceC6751l f145731L;

    /* renamed from: M */
    public static final AbstractC6750k f145732M;

    /* renamed from: N */
    public static final InterfaceC6751l f145733N;

    /* renamed from: O */
    public static final AbstractC6750k f145734O;

    /* renamed from: P */
    public static final InterfaceC6751l f145735P;

    /* renamed from: Q */
    public static final AbstractC6750k f145736Q;

    /* renamed from: R */
    public static final InterfaceC6751l f145737R;

    /* renamed from: S */
    public static final InterfaceC6751l f145738S;

    /* renamed from: T */
    public static final AbstractC6750k f145739T;

    /* renamed from: U */
    public static final InterfaceC6751l f145740U;

    /* renamed from: V */
    public static final AbstractC6750k f145741V;

    /* renamed from: W */
    public static final InterfaceC6751l f145742W;

    /* renamed from: X */
    public static final AbstractC6750k f145743X;

    /* renamed from: Y */
    public static final InterfaceC6751l f145744Y;

    /* renamed from: Z */
    public static final InterfaceC6751l f145745Z;

    /* renamed from: a */
    public static final AbstractC6750k f145746a;

    /* renamed from: b */
    public static final InterfaceC6751l f145747b;

    /* renamed from: c */
    public static final AbstractC6750k f145748c;

    /* renamed from: d */
    public static final InterfaceC6751l f145749d;

    /* renamed from: e */
    public static final AbstractC6750k f145750e;

    /* renamed from: f */
    public static final AbstractC6750k f145751f;

    /* renamed from: g */
    public static final InterfaceC6751l f145752g;

    /* renamed from: h */
    public static final AbstractC6750k f145753h;

    /* renamed from: i */
    public static final InterfaceC6751l f145754i;

    /* renamed from: j */
    public static final AbstractC6750k f145755j;

    /* renamed from: k */
    public static final InterfaceC6751l f145756k;

    /* renamed from: l */
    public static final AbstractC6750k f145757l;

    /* renamed from: m */
    public static final InterfaceC6751l f145758m;

    /* renamed from: n */
    public static final AbstractC6750k f145759n;

    /* renamed from: o */
    public static final InterfaceC6751l f145760o;

    /* renamed from: p */
    public static final AbstractC6750k f145761p;

    /* renamed from: q */
    public static final InterfaceC6751l f145762q;

    /* renamed from: r */
    public static final AbstractC6750k f145763r;

    /* renamed from: s */
    public static final InterfaceC6751l f145764s;

    /* renamed from: t */
    public static final AbstractC6750k f145765t;

    /* renamed from: u */
    public static final AbstractC6750k f145766u;

    /* renamed from: v */
    public static final AbstractC6750k f145767v;

    /* renamed from: w */
    public static final AbstractC6750k f145768w;

    /* renamed from: x */
    public static final InterfaceC6751l f145769x;

    /* renamed from: y */
    public static final AbstractC6750k f145770y;

    /* renamed from: z */
    public static final InterfaceC6751l f145771z;

    /* renamed from: z9.l$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC6750k {
        a() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo34534b(C3380a c3380a) {
            ArrayList arrayList = new ArrayList();
            c3380a.m17003a();
            while (c3380a.m17010q()) {
                try {
                    arrayList.add(Integer.valueOf(c3380a.m16996A()));
                } catch (NumberFormatException e11) {
                    throw new JsonSyntaxException(e11);
                }
            }
            c3380a.m17007h();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicIntegerArray.set(i11, ((Integer) arrayList.get(i11)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, AtomicIntegerArray atomicIntegerArray) {
            c3382c.mo17035c();
            int length = atomicIntegerArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                c3382c.mo17030N(atomicIntegerArray.get(i11));
            }
            c3382c.mo17037h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.l$a0 */
    /* loaded from: classes3.dex */
    public class a0 implements InterfaceC6751l {

        /* renamed from: p */
        final /* synthetic */ Class f145772p;

        /* renamed from: q */
        final /* synthetic */ AbstractC6750k f145773q;

        /* renamed from: z9.l$a0$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC6750k {

            /* renamed from: a */
            final /* synthetic */ Class f145774a;

            a(Class cls) {
                this.f145774a = cls;
            }

            @Override // com.google.gson.AbstractC6750k
            /* renamed from: b */
            public Object mo34534b(C3380a c3380a) {
                Object mo34534b = a0.this.f145773q.mo34534b(c3380a);
                if (mo34534b != null && !this.f145774a.isInstance(mo34534b)) {
                    throw new JsonSyntaxException("Expected a " + this.f145774a.getName() + " but was " + mo34534b.getClass().getName());
                }
                return mo34534b;
            }

            @Override // com.google.gson.AbstractC6750k
            /* renamed from: d */
            public void mo34535d(C3382c c3382c, Object obj) {
                a0.this.f145773q.mo34535d(c3382c, obj);
            }
        }

        a0(Class cls, AbstractC6750k abstractC6750k) {
            this.f145772p = cls;
            this.f145773q = abstractC6750k;
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            Class<?> rawType = typeToken.getRawType();
            if (!this.f145772p.isAssignableFrom(rawType)) {
                return null;
            }
            return new a(rawType);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f145772p.getName() + ",adapter=" + this.f145773q + "]";
        }
    }

    /* renamed from: z9.l$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC6750k {
        b() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                return Long.valueOf(c3380a.m16997E());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.l$b0 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f145776a;

        static {
            int[] iArr = new int[EnumC3381b.values().length];
            f145776a = iArr;
            try {
                iArr[EnumC3381b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f145776a[EnumC3381b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f145776a[EnumC3381b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f145776a[EnumC3381b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f145776a[EnumC3381b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f145776a[EnumC3381b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f145776a[EnumC3381b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f145776a[EnumC3381b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f145776a[EnumC3381b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f145776a[EnumC3381b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: z9.l$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC6750k {
        c() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return Float.valueOf((float) c3380a.m17014y());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* renamed from: z9.l$c0 */
    /* loaded from: classes3.dex */
    class c0 extends AbstractC6750k {
        c0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo34534b(C3380a c3380a) {
            EnumC3381b m17001N = c3380a.m17001N();
            if (m17001N == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            if (m17001N == EnumC3381b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(c3380a.m17000L()));
            }
            return Boolean.valueOf(c3380a.m17013v());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Boolean bool) {
            c3382c.mo17031O(bool);
        }
    }

    /* renamed from: z9.l$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC6750k {
        d() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return Double.valueOf(c3380a.m17014y());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* renamed from: z9.l$d0 */
    /* loaded from: classes3.dex */
    class d0 extends AbstractC6750k {
        d0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return Boolean.valueOf(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Boolean bool) {
            String bool2;
            if (bool == null) {
                bool2 = "null";
            } else {
                bool2 = bool.toString();
            }
            c3382c.mo17033Q(bool2);
        }
    }

    /* renamed from: z9.l$e */
    /* loaded from: classes3.dex */
    class e extends AbstractC6750k {
        e() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            EnumC3381b m17001N = c3380a.m17001N();
            int i11 = b0.f145776a[m17001N.ordinal()];
            if (i11 != 1 && i11 != 3) {
                if (i11 == 4) {
                    c3380a.m16999J();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + m17001N);
            }
            return new C30850g(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* renamed from: z9.l$e0 */
    /* loaded from: classes3.dex */
    class e0 extends AbstractC6750k {
        e0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                return Byte.valueOf((byte) c3380a.m16996A());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* renamed from: z9.l$f */
    /* loaded from: classes3.dex */
    class f extends AbstractC6750k {
        f() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            String m17000L = c3380a.m17000L();
            if (m17000L.length() == 1) {
                return Character.valueOf(m17000L.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + m17000L);
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Character ch2) {
            String valueOf;
            if (ch2 == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch2);
            }
            c3382c.mo17033Q(valueOf);
        }
    }

    /* renamed from: z9.l$f0 */
    /* loaded from: classes3.dex */
    class f0 extends AbstractC6750k {
        f0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                return Short.valueOf((short) c3380a.m16996A());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* renamed from: z9.l$g */
    /* loaded from: classes3.dex */
    class g extends AbstractC6750k {
        g() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String mo34534b(C3380a c3380a) {
            EnumC3381b m17001N = c3380a.m17001N();
            if (m17001N == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            if (m17001N == EnumC3381b.BOOLEAN) {
                return Boolean.toString(c3380a.m17013v());
            }
            return c3380a.m17000L();
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, String str) {
            c3382c.mo17033Q(str);
        }
    }

    /* renamed from: z9.l$g0 */
    /* loaded from: classes3.dex */
    class g0 extends AbstractC6750k {
        g0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                return Integer.valueOf(c3380a.m16996A());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Number number) {
            c3382c.mo17032P(number);
        }
    }

    /* renamed from: z9.l$h */
    /* loaded from: classes3.dex */
    class h extends AbstractC6750k {
        h() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                return new BigDecimal(c3380a.m17000L());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, BigDecimal bigDecimal) {
            c3382c.mo17032P(bigDecimal);
        }
    }

    /* renamed from: z9.l$h0 */
    /* loaded from: classes3.dex */
    class h0 extends AbstractC6750k {
        h0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo34534b(C3380a c3380a) {
            try {
                return new AtomicInteger(c3380a.m16996A());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, AtomicInteger atomicInteger) {
            c3382c.mo17030N(atomicInteger.get());
        }
    }

    /* renamed from: z9.l$i */
    /* loaded from: classes3.dex */
    class i extends AbstractC6750k {
        i() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                return new BigInteger(c3380a.m17000L());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, BigInteger bigInteger) {
            c3382c.mo17032P(bigInteger);
        }
    }

    /* renamed from: z9.l$i0 */
    /* loaded from: classes3.dex */
    class i0 extends AbstractC6750k {
        i0() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo34534b(C3380a c3380a) {
            return new AtomicBoolean(c3380a.m17013v());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, AtomicBoolean atomicBoolean) {
            c3382c.mo17034R(atomicBoolean.get());
        }
    }

    /* renamed from: z9.l$j */
    /* loaded from: classes3.dex */
    class j extends AbstractC6750k {
        j() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return new StringBuilder(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, StringBuilder sb2) {
            String sb3;
            if (sb2 == null) {
                sb3 = null;
            } else {
                sb3 = sb2.toString();
            }
            c3382c.mo17033Q(sb3);
        }
    }

    /* renamed from: z9.l$j0 */
    /* loaded from: classes3.dex */
    private static final class j0 extends AbstractC6750k {

        /* renamed from: a */
        private final Map f145777a = new HashMap();

        /* renamed from: b */
        private final Map f145778b = new HashMap();

        public j0(Class cls) {
            try {
                for (Enum r42 : (Enum[]) cls.getEnumConstants()) {
                    String name = r42.name();
                    InterfaceC29512c interfaceC29512c = (InterfaceC29512c) cls.getField(name).getAnnotation(InterfaceC29512c.class);
                    if (interfaceC29512c != null) {
                        name = interfaceC29512c.value();
                        for (String str : interfaceC29512c.alternate()) {
                            this.f145777a.put(str, r42);
                        }
                    }
                    this.f145777a.put(name, r42);
                    this.f145778b.put(r42, name);
                }
            } catch (NoSuchFieldException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return (Enum) this.f145777a.get(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Enum r32) {
            String str;
            if (r32 == null) {
                str = null;
            } else {
                str = (String) this.f145778b.get(r32);
            }
            c3382c.mo17033Q(str);
        }
    }

    /* renamed from: z9.l$k */
    /* loaded from: classes3.dex */
    class k extends AbstractC6750k {
        k() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class mo34534b(C3380a c3380a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: z9.l$l */
    /* loaded from: classes3.dex */
    class l extends AbstractC6750k {
        l() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return new StringBuffer(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, StringBuffer stringBuffer) {
            String stringBuffer2;
            if (stringBuffer == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer.toString();
            }
            c3382c.mo17033Q(stringBuffer2);
        }
    }

    /* renamed from: z9.l$m */
    /* loaded from: classes3.dex */
    class m extends AbstractC6750k {
        m() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            String m17000L = c3380a.m17000L();
            if ("null".equals(m17000L)) {
                return null;
            }
            return new URL(m17000L);
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, URL url) {
            String externalForm;
            if (url == null) {
                externalForm = null;
            } else {
                externalForm = url.toExternalForm();
            }
            c3382c.mo17033Q(externalForm);
        }
    }

    /* renamed from: z9.l$n */
    /* loaded from: classes3.dex */
    class n extends AbstractC6750k {
        n() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            try {
                String m17000L = c3380a.m17000L();
                if ("null".equals(m17000L)) {
                    return null;
                }
                return new URI(m17000L);
            } catch (URISyntaxException e11) {
                throw new JsonIOException(e11);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, URI uri) {
            String aSCIIString;
            if (uri == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri.toASCIIString();
            }
            c3382c.mo17033Q(aSCIIString);
        }
    }

    /* renamed from: z9.l$o */
    /* loaded from: classes3.dex */
    class o extends AbstractC6750k {
        o() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return InetAddress.getByName(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, InetAddress inetAddress) {
            String hostAddress;
            if (inetAddress == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress.getHostAddress();
            }
            c3382c.mo17033Q(hostAddress);
        }
    }

    /* renamed from: z9.l$p */
    /* loaded from: classes3.dex */
    class p extends AbstractC6750k {
        p() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return UUID.fromString(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, UUID uuid) {
            String uuid2;
            if (uuid == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid.toString();
            }
            c3382c.mo17033Q(uuid2);
        }
    }

    /* renamed from: z9.l$q */
    /* loaded from: classes3.dex */
    class q extends AbstractC6750k {
        q() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency mo34534b(C3380a c3380a) {
            return Currency.getInstance(c3380a.m17000L());
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Currency currency) {
            c3382c.mo17033Q(currency.getCurrencyCode());
        }
    }

    /* renamed from: z9.l$r */
    /* loaded from: classes3.dex */
    class r implements InterfaceC6751l {

        /* renamed from: z9.l$r$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC6750k {

            /* renamed from: a */
            final /* synthetic */ AbstractC6750k f145779a;

            a(AbstractC6750k abstractC6750k) {
                this.f145779a = abstractC6750k;
            }

            @Override // com.google.gson.AbstractC6750k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Timestamp mo34534b(C3380a c3380a) {
                Date date = (Date) this.f145779a.mo34534b(c3380a);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // com.google.gson.AbstractC6750k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo34535d(C3382c c3382c, Timestamp timestamp) {
                this.f145779a.mo34535d(c3382c, timestamp);
            }
        }

        r() {
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new a(c6743d.m34527k(Date.class));
        }
    }

    /* renamed from: z9.l$s */
    /* loaded from: classes3.dex */
    class s extends AbstractC6750k {
        s() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            c3380a.m17004b();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (c3380a.m17001N() != EnumC3381b.END_OBJECT) {
                String m16998F = c3380a.m16998F();
                int m16996A = c3380a.m16996A();
                if ("year".equals(m16998F)) {
                    i11 = m16996A;
                } else if ("month".equals(m16998F)) {
                    i12 = m16996A;
                } else if ("dayOfMonth".equals(m16998F)) {
                    i13 = m16996A;
                } else if ("hourOfDay".equals(m16998F)) {
                    i14 = m16996A;
                } else if ("minute".equals(m16998F)) {
                    i15 = m16996A;
                } else if ("second".equals(m16998F)) {
                    i16 = m16996A;
                }
            }
            c3380a.m17008i();
            return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Calendar calendar) {
            if (calendar == null) {
                c3382c.mo17043v();
                return;
            }
            c3382c.mo17036d();
            c3382c.mo17042s("year");
            c3382c.mo17030N(calendar.get(1));
            c3382c.mo17042s("month");
            c3382c.mo17030N(calendar.get(2));
            c3382c.mo17042s("dayOfMonth");
            c3382c.mo17030N(calendar.get(5));
            c3382c.mo17042s("hourOfDay");
            c3382c.mo17030N(calendar.get(11));
            c3382c.mo17042s("minute");
            c3382c.mo17030N(calendar.get(12));
            c3382c.mo17042s("second");
            c3382c.mo17030N(calendar.get(13));
            c3382c.mo17038i();
        }
    }

    /* renamed from: z9.l$t */
    /* loaded from: classes3.dex */
    class t extends AbstractC6750k {
        t() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale mo34534b(C3380a c3380a) {
            String str;
            String str2;
            String str3 = null;
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c3380a.m17000L(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Locale locale) {
            String locale2;
            if (locale == null) {
                locale2 = null;
            } else {
                locale2 = locale.toString();
            }
            c3382c.mo17033Q(locale2);
        }
    }

    /* renamed from: z9.l$u */
    /* loaded from: classes3.dex */
    class u extends AbstractC6750k {
        u() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC6745f mo34534b(C3380a c3380a) {
            switch (b0.f145776a[c3380a.m17001N().ordinal()]) {
                case 1:
                    return new C6748i(new C30850g(c3380a.m17000L()));
                case 2:
                    return new C6748i(Boolean.valueOf(c3380a.m17013v()));
                case 3:
                    return new C6748i(c3380a.m17000L());
                case 4:
                    c3380a.m16999J();
                    return C6746g.f37130p;
                case 5:
                    C6744e c6744e = new C6744e();
                    c3380a.m17003a();
                    while (c3380a.m17010q()) {
                        c6744e.m34547n(mo34534b(c3380a));
                    }
                    c3380a.m17007h();
                    return c6744e;
                case 6:
                    C6747h c6747h = new C6747h();
                    c3380a.m17004b();
                    while (c3380a.m17010q()) {
                        c6747h.m34555n(c3380a.m16998F(), mo34534b(c3380a));
                    }
                    c3380a.m17008i();
                    return c6747h;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, AbstractC6745f abstractC6745f) {
            if (abstractC6745f != null && !abstractC6745f.m34552k()) {
                if (abstractC6745f.m34554m()) {
                    C6748i m34550g = abstractC6745f.m34550g();
                    if (m34550g.m34562u()) {
                        c3382c.mo17032P(m34550g.m34559p());
                        return;
                    } else if (m34550g.m34561s()) {
                        c3382c.mo17034R(m34550g.m34558n());
                        return;
                    } else {
                        c3382c.mo17033Q(m34550g.m34560r());
                        return;
                    }
                }
                if (abstractC6745f.m34551j()) {
                    c3382c.mo17035c();
                    Iterator it = abstractC6745f.m34548d().iterator();
                    while (it.hasNext()) {
                        mo34535d(c3382c, (AbstractC6745f) it.next());
                    }
                    c3382c.mo17037h();
                    return;
                }
                if (abstractC6745f.m34553l()) {
                    c3382c.mo17036d();
                    for (Map.Entry entry : abstractC6745f.m34549e().m34556p()) {
                        c3382c.mo17042s((String) entry.getKey());
                        mo34535d(c3382c, (AbstractC6745f) entry.getValue());
                    }
                    c3382c.mo17038i();
                    return;
                }
                throw new IllegalArgumentException("Couldn't write " + abstractC6745f.getClass());
            }
            c3382c.mo17043v();
        }
    }

    /* renamed from: z9.l$v */
    /* loaded from: classes3.dex */
    class v extends AbstractC6750k {
        v() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet mo34534b(C3380a c3380a) {
            BitSet bitSet = new BitSet();
            c3380a.m17003a();
            EnumC3381b m17001N = c3380a.m17001N();
            int i11 = 0;
            while (m17001N != EnumC3381b.END_ARRAY) {
                int i12 = b0.f145776a[m17001N.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            String m17000L = c3380a.m17000L();
                            try {
                                if (Integer.parseInt(m17000L) == 0) {
                                    i11++;
                                    m17001N = c3380a.m17001N();
                                }
                                bitSet.set(i11);
                                i11++;
                                m17001N = c3380a.m17001N();
                            } catch (NumberFormatException unused) {
                                throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + m17000L);
                            }
                        } else {
                            throw new JsonSyntaxException("Invalid bitset value type: " + m17001N);
                        }
                    } else {
                        if (!c3380a.m17013v()) {
                            i11++;
                            m17001N = c3380a.m17001N();
                        }
                        bitSet.set(i11);
                        i11++;
                        m17001N = c3380a.m17001N();
                    }
                } else {
                    if (c3380a.m16996A() == 0) {
                        i11++;
                        m17001N = c3380a.m17001N();
                    }
                    bitSet.set(i11);
                    i11++;
                    m17001N = c3380a.m17001N();
                }
            }
            c3380a.m17007h();
            return bitSet;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, BitSet bitSet) {
            c3382c.mo17035c();
            int length = bitSet.length();
            for (int i11 = 0; i11 < length; i11++) {
                c3382c.mo17030N(bitSet.get(i11) ? 1L : 0L);
            }
            c3382c.mo17037h();
        }
    }

    /* renamed from: z9.l$w */
    /* loaded from: classes3.dex */
    class w implements InterfaceC6751l {
        w() {
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new j0(rawType);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.l$x */
    /* loaded from: classes3.dex */
    public class x implements InterfaceC6751l {

        /* renamed from: p */
        final /* synthetic */ Class f145781p;

        /* renamed from: q */
        final /* synthetic */ AbstractC6750k f145782q;

        x(Class cls, AbstractC6750k abstractC6750k) {
            this.f145781p = cls;
            this.f145782q = abstractC6750k;
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            if (typeToken.getRawType() == this.f145781p) {
                return this.f145782q;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f145781p.getName() + ",adapter=" + this.f145782q + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.l$y */
    /* loaded from: classes3.dex */
    public class y implements InterfaceC6751l {

        /* renamed from: p */
        final /* synthetic */ Class f145783p;

        /* renamed from: q */
        final /* synthetic */ Class f145784q;

        /* renamed from: r */
        final /* synthetic */ AbstractC6750k f145785r;

        y(Class cls, Class cls2, AbstractC6750k abstractC6750k) {
            this.f145783p = cls;
            this.f145784q = cls2;
            this.f145785r = abstractC6750k;
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType != this.f145783p && rawType != this.f145784q) {
                return null;
            }
            return this.f145785r;
        }

        public String toString() {
            return "Factory[type=" + this.f145784q.getName() + "+" + this.f145783p.getName() + ",adapter=" + this.f145785r + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.l$z */
    /* loaded from: classes3.dex */
    public class z implements InterfaceC6751l {

        /* renamed from: p */
        final /* synthetic */ Class f145786p;

        /* renamed from: q */
        final /* synthetic */ Class f145787q;

        /* renamed from: r */
        final /* synthetic */ AbstractC6750k f145788r;

        z(Class cls, Class cls2, AbstractC6750k abstractC6750k) {
            this.f145786p = cls;
            this.f145787q = cls2;
            this.f145788r = abstractC6750k;
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType != this.f145786p && rawType != this.f145787q) {
                return null;
            }
            return this.f145788r;
        }

        public String toString() {
            return "Factory[type=" + this.f145786p.getName() + "+" + this.f145787q.getName() + ",adapter=" + this.f145788r + "]";
        }
    }

    static {
        AbstractC6750k m34564a = new k().m34564a();
        f145746a = m34564a;
        f145747b = m152622a(Class.class, m34564a);
        AbstractC6750k m34564a2 = new v().m34564a();
        f145748c = m34564a2;
        f145749d = m152622a(BitSet.class, m34564a2);
        c0 c0Var = new c0();
        f145750e = c0Var;
        f145751f = new d0();
        f145752g = m152623b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f145753h = e0Var;
        f145754i = m152623b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f145755j = f0Var;
        f145756k = m152623b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f145757l = g0Var;
        f145758m = m152623b(Integer.TYPE, Integer.class, g0Var);
        AbstractC6750k m34564a3 = new h0().m34564a();
        f145759n = m34564a3;
        f145760o = m152622a(AtomicInteger.class, m34564a3);
        AbstractC6750k m34564a4 = new i0().m34564a();
        f145761p = m34564a4;
        f145762q = m152622a(AtomicBoolean.class, m34564a4);
        AbstractC6750k m34564a5 = new a().m34564a();
        f145763r = m34564a5;
        f145764s = m152622a(AtomicIntegerArray.class, m34564a5);
        f145765t = new b();
        f145766u = new c();
        f145767v = new d();
        e eVar = new e();
        f145768w = eVar;
        f145769x = m152622a(Number.class, eVar);
        f fVar = new f();
        f145770y = fVar;
        f145771z = m152623b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        f145720A = gVar;
        f145721B = new h();
        f145722C = new i();
        f145723D = m152622a(String.class, gVar);
        j jVar = new j();
        f145724E = jVar;
        f145725F = m152622a(StringBuilder.class, jVar);
        l lVar = new l();
        f145726G = lVar;
        f145727H = m152622a(StringBuffer.class, lVar);
        m mVar = new m();
        f145728I = mVar;
        f145729J = m152622a(URL.class, mVar);
        n nVar = new n();
        f145730K = nVar;
        f145731L = m152622a(URI.class, nVar);
        o oVar = new o();
        f145732M = oVar;
        f145733N = m152625d(InetAddress.class, oVar);
        p pVar = new p();
        f145734O = pVar;
        f145735P = m152622a(UUID.class, pVar);
        AbstractC6750k m34564a6 = new q().m34564a();
        f145736Q = m34564a6;
        f145737R = m152622a(Currency.class, m34564a6);
        f145738S = new r();
        s sVar = new s();
        f145739T = sVar;
        f145740U = m152624c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        f145741V = tVar;
        f145742W = m152622a(Locale.class, tVar);
        u uVar = new u();
        f145743X = uVar;
        f145744Y = m152625d(AbstractC6745f.class, uVar);
        f145745Z = new w();
    }

    /* renamed from: a */
    public static InterfaceC6751l m152622a(Class cls, AbstractC6750k abstractC6750k) {
        return new x(cls, abstractC6750k);
    }

    /* renamed from: b */
    public static InterfaceC6751l m152623b(Class cls, Class cls2, AbstractC6750k abstractC6750k) {
        return new y(cls, cls2, abstractC6750k);
    }

    /* renamed from: c */
    public static InterfaceC6751l m152624c(Class cls, Class cls2, AbstractC6750k abstractC6750k) {
        return new z(cls, cls2, abstractC6750k);
    }

    /* renamed from: d */
    public static InterfaceC6751l m152625d(Class cls, AbstractC6750k abstractC6750k) {
        return new a0(cls, abstractC6750k);
    }
}
