package ci;

import android.text.TextUtils;
import au.EnumC2382z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.C23250w4;
import p300kk.C21752b;
import vg.C28203u6;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ci.j */
/* loaded from: classes3.dex */
public class C3508j extends C3499e0 {
    public static final a Companion = new a(null);

    /* renamed from: m */
    private CharSequence f14685m;

    /* renamed from: n */
    private int f14686n;

    /* renamed from: o */
    private int f14687o;

    /* renamed from: p */
    private int f14688p;

    /* renamed from: q */
    private int f14689q;

    /* renamed from: r */
    private final List f14690r;

    /* renamed from: s */
    private C3494c f14691s;

    /* renamed from: t */
    private CharSequence f14692t;

    /* renamed from: u */
    private CharSequence f14693u;

    /* renamed from: v */
    private CharSequence f14694v;

    /* renamed from: w */
    private long f14695w;

    /* renamed from: x */
    private b f14696x;

    /* renamed from: y */
    private String f14697y;

    /* renamed from: z */
    private String f14698z;

    /* renamed from: ci.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m17715a(List list, long j11) {
            AbstractC19074t.m100208f(list, "albumItems");
            boolean z11 = false;
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3508j c3508j = (C3508j) it.next();
                    if (c3508j != null && c3508j.m17711w0() != 0 && c3508j.m17711w0() == j11) {
                        it.remove();
                        z11 = true;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return z11;
        }
    }

    /* renamed from: ci.j$b */
    /* loaded from: classes3.dex */
    public static final class b extends Enum {

        /* renamed from: p */
        public static final b f14699p = new b("MS_ALBUM_COLLECTION_SUBTYPE_UNKNOWN", 0);

        /* renamed from: q */
        public static final b f14700q = new b("MS_ALBUM_COLLECTION_SUBTYPE_VIDEO", 1);

        /* renamed from: r */
        public static final b f14701r = new b("MS_ALBUM_COLLECTION_SUBTYPE_SENDER", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f14702s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f14703t;

        static {
            b[] m17716b = m17716b();
            f14702s = m17716b;
            f14703t = AbstractC30166b.m148796a(m17716b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m17716b() {
            return new b[]{f14699p, f14700q, f14701r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f14702s.clone();
        }
    }

    /* renamed from: ci.j$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14704a;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14704a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3508j(CreateMediaStoreParam createMediaStoreParam) {
        super(createMediaStoreParam);
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        this.f14690r = new ArrayList();
        this.f14695w = -1L;
        m17621f0();
        this.f14696x = b.f14699p;
        this.f14697y = "";
        this.f14698z = "";
    }

    /* renamed from: W0 */
    private final void m17687W0(int i11, EnumC2382z enumC2382z) {
        int i12 = c.f14704a[enumC2382z.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    this.f14689q = i11;
                    return;
                }
                return;
            }
            this.f14688p = i11;
            return;
        }
        this.f14687o = i11;
    }

    /* renamed from: A0 */
    public final int m17688A0() {
        return this.f14689q;
    }

    /* renamed from: B0 */
    public final int m17689B0() {
        return this.f14688p;
    }

    /* renamed from: C0 */
    public final int m17690C0() {
        return this.f14687o;
    }

    /* renamed from: D0 */
    public final CharSequence m17691D0() {
        return this.f14685m;
    }

    /* renamed from: E0 */
    public final int m17692E0() {
        return this.f14686n;
    }

    /* renamed from: F0 */
    public final String m17693F0() {
        return this.f14697y;
    }

    /* renamed from: G0 */
    public final CharSequence m17694G0() {
        if (!TextUtils.isEmpty(this.f14692t)) {
            return this.f14692t;
        }
        return this.f14685m;
    }

    /* renamed from: H0 */
    public final CharSequence m17695H0() {
        if (!TextUtils.isEmpty(this.f14694v)) {
            return this.f14694v;
        }
        return m17694G0();
    }

    /* renamed from: I0 */
    public final int m17696I0(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        int i11 = c.f14704a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return this.f14687o;
                }
                return this.f14689q;
            }
            return this.f14688p;
        }
        return this.f14687o;
    }

    /* renamed from: J0 */
    public final boolean m17697J0() {
        return this.f14686n == 0;
    }

    /* renamed from: K0 */
    public final void m17698K0(C21752b c21752b) {
        AbstractC19074t.m100208f(c21752b, "localCollectionCommonInfo");
        this.f14687o = c21752b.m112203d();
        this.f14688p = c21752b.m112202c();
        this.f14689q = c21752b.m112201b();
        this.f14686n = c21752b.m112203d() + c21752b.m112202c() + c21752b.m112201b();
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, c21752b.m112204e(), false, 2, null);
        if (m141800i == null) {
            this.f14692t = c21752b.m112200a();
        } else {
            m17710v0(m141800i);
        }
    }

    /* renamed from: L0 */
    public final boolean m17699L0(List list, EnumC2382z enumC2382z, boolean z11) {
        AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId messageId = (MessageId) it.next();
            if (C23250w4.f112644a.m119840k0(messageId, this, enumC2382z)) {
                arrayList.add(messageId);
            }
        }
        if (z11) {
            m17687W0(m17696I0(enumC2382z) - arrayList.size(), enumC2382z);
            this.f14686n = Math.max(0, this.f14686n - arrayList.size());
        }
        return !arrayList.isEmpty();
    }

    /* renamed from: M0 */
    public final void m17700M0(long j11) {
        this.f14695w = j11;
    }

    /* renamed from: N0 */
    public final void m17701N0(b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f14696x = bVar;
    }

    /* renamed from: O0 */
    public final void m17702O0(C3494c c3494c) {
        this.f14691s = c3494c;
    }

    /* renamed from: P0 */
    public final void m17703P0(CharSequence charSequence) {
        this.f14693u = charSequence;
    }

    /* renamed from: Q0 */
    public final void m17704Q0(CharSequence charSequence) {
        this.f14692t = charSequence;
    }

    /* renamed from: R0 */
    public final void m17705R0(CharSequence charSequence) {
        this.f14694v = charSequence;
    }

    /* renamed from: S0 */
    public final void m17706S0(CharSequence charSequence) {
        this.f14685m = charSequence;
    }

    /* renamed from: T0 */
    public final void m17707T0(int i11) {
        this.f14686n = i11;
    }

    /* renamed from: U0 */
    public final void m17708U0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f14698z = str;
    }

    /* renamed from: V0 */
    public final void m17709V0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f14697y = str;
    }

    /* renamed from: v0 */
    public final void m17710v0(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        this.f14692t = contactProfile.m40383Q(true, false);
        C3492b c3492b = new C3492b();
        c3492b.m17530i(contactProfile.f42446v);
        this.f14690r.add(c3492b);
    }

    /* renamed from: w0 */
    public final long m17711w0() {
        return this.f14695w;
    }

    /* renamed from: x0 */
    public List mo17712x0() {
        return this.f14690r;
    }

    /* renamed from: y0 */
    public final b m17713y0() {
        return this.f14696x;
    }

    /* renamed from: z0 */
    public final List m17714z0() {
        return this.f14690r;
    }
}
