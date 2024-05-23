package p502s3;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: s3.i */
/* loaded from: classes2.dex */
public class C26123i implements InterfaceC26121g {

    /* renamed from: d */
    private static final Bitmap.Config[] f124352d = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: e */
    private static final Bitmap.Config[] f124353e = {Bitmap.Config.RGB_565};

    /* renamed from: f */
    private static final Bitmap.Config[] f124354f = {Bitmap.Config.ARGB_4444};

    /* renamed from: g */
    private static final Bitmap.Config[] f124355g = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final c f124356a = new c();

    /* renamed from: b */
    private final C26118d f124357b = new C26118d();

    /* renamed from: c */
    private final Map f124358c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3.i$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124359a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f124359a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124359a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124359a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124359a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3.i$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC26122h {

        /* renamed from: a */
        private final c f124360a;

        /* renamed from: b */
        int f124361b;

        /* renamed from: c */
        private Bitmap.Config f124362c;

        public b(c cVar) {
            this.f124360a = cVar;
        }

        @Override // p502s3.InterfaceC26122h
        /* renamed from: a */
        public void mo134483a() {
            this.f124360a.m134447c(this);
        }

        /* renamed from: b */
        public void m134489b(int i11, Bitmap.Config config) {
            this.f124361b = i11;
            this.f124362c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f124361b != bVar.f124361b) {
                return false;
            }
            Bitmap.Config config = this.f124362c;
            Bitmap.Config config2 = bVar.f124362c;
            if (config == null) {
                if (config2 != null) {
                    return false;
                }
            } else if (!config.equals(config2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i11;
            int i12 = this.f124361b * 31;
            Bitmap.Config config = this.f124362c;
            if (config != null) {
                i11 = config.hashCode();
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }

        public String toString() {
            return C26123i.m134486h(this.f124361b, this.f124362c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3.i$c */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC26115a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p502s3.AbstractC26115a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo134445a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m134491e(int i11, Bitmap.Config config) {
            b bVar = (b) m134446b();
            bVar.m134489b(i11, config);
            return bVar;
        }
    }

    /* renamed from: f */
    private void m134484f(Integer num, Bitmap bitmap) {
        NavigableMap m134488j = m134488j(bitmap.getConfig());
        Integer num2 = (Integer) m134488j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m134488j.remove(num);
                return;
            } else {
                m134488j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo134480c(bitmap) + ", this: " + this);
    }

    /* renamed from: g */
    private b m134485g(int i11, Bitmap.Config config) {
        b m134491e = this.f124356a.m134491e(i11, config);
        for (Bitmap.Config config2 : m134487i(config)) {
            Integer num = (Integer) m134488j(config2).ceilingKey(Integer.valueOf(i11));
            if (num != null && num.intValue() <= i11 * 8) {
                if (num.intValue() == i11) {
                    if (config2 == null) {
                        if (config == null) {
                            return m134491e;
                        }
                    } else if (config2.equals(config)) {
                        return m134491e;
                    }
                }
                this.f124356a.m134447c(m134491e);
                return this.f124356a.m134491e(num.intValue(), config2);
            }
        }
        return m134491e;
    }

    /* renamed from: h */
    static String m134486h(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m134487i(Bitmap.Config config) {
        int i11 = a.f124359a[config.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return new Bitmap.Config[]{config};
                    }
                    return f124355g;
                }
                return f124354f;
            }
            return f124353e;
        }
        return f124352d;
    }

    /* renamed from: j */
    private NavigableMap m134488j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f124358c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f124358c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // p502s3.InterfaceC26121g
    /* renamed from: a */
    public void mo134478a(Bitmap bitmap) {
        b m134491e = this.f124356a.m134491e(AbstractC26124j.m134493b(bitmap), bitmap.getConfig());
        this.f124357b.m134464d(m134491e, bitmap);
        NavigableMap m134488j = m134488j(bitmap.getConfig());
        Integer num = (Integer) m134488j.get(Integer.valueOf(m134491e.f124361b));
        Integer valueOf = Integer.valueOf(m134491e.f124361b);
        int i11 = 1;
        if (num != null) {
            i11 = 1 + num.intValue();
        }
        m134488j.put(valueOf, Integer.valueOf(i11));
    }

    @Override // p502s3.InterfaceC26121g
    /* renamed from: b */
    public Bitmap mo134479b(int i11, int i12, Bitmap.Config config) {
        Bitmap.Config config2;
        b m134485g = m134485g(AbstractC26124j.m134492a(i11, i12, config), config);
        Bitmap bitmap = (Bitmap) this.f124357b.m134463a(m134485g);
        if (bitmap != null) {
            m134484f(Integer.valueOf(m134485g.f124361b), bitmap);
            if (bitmap.getConfig() != null) {
                config2 = bitmap.getConfig();
            } else {
                config2 = Bitmap.Config.ARGB_8888;
            }
            bitmap.reconfigure(i11, i12, config2);
        }
        return bitmap;
    }

    @Override // p502s3.InterfaceC26121g
    /* renamed from: c */
    public String mo134480c(Bitmap bitmap) {
        return m134486h(AbstractC26124j.m134493b(bitmap), bitmap.getConfig());
    }

    @Override // p502s3.InterfaceC26121g
    /* renamed from: d */
    public String mo134481d(int i11, int i12, Bitmap.Config config) {
        return m134486h(AbstractC26124j.m134492a(i11, i12, config), config);
    }

    @Override // p502s3.InterfaceC26121g
    /* renamed from: e */
    public int mo134482e(Bitmap bitmap) {
        return AbstractC26124j.m134493b(bitmap);
    }

    @Override // p502s3.InterfaceC26121g
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f124357b.m134465f();
        if (bitmap != null) {
            m134484f(Integer.valueOf(AbstractC26124j.m134493b(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f124357b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f124358c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f124358c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
