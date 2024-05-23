package s00;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mm0.AbstractC23350e;
import s00.AbstractC26080o;

/* renamed from: s00.m */
/* loaded from: classes4.dex */
public class C26078m {

    /* renamed from: a */
    private final Map f124260a;

    /* renamed from: b */
    volatile boolean f124261b;

    /* renamed from: c */
    volatile boolean f124262c;

    /* renamed from: d */
    volatile boolean f124263d;

    /* renamed from: e */
    AtomicInteger f124264e;

    /* renamed from: s00.m$a */
    /* loaded from: classes4.dex */
    private static final class a {

        /* renamed from: a */
        static final C26078m f124265a = new C26078m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s00.m$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public final int f124266a;

        /* renamed from: b */
        public volatile C26071f f124267b;

        /* renamed from: c */
        private volatile C26071f f124268c;

        /* renamed from: d */
        public volatile C26071f f124269d;

        /* renamed from: e */
        ArrayList f124270e;

        public b(int i11) {
            this.f124266a = i11;
        }

        /* renamed from: g */
        static b m134239g(Map map, int i11) {
            map.getClass();
            b bVar = new b(i11);
            map.put(Integer.valueOf(i11), bVar);
            return bVar;
        }

        /* renamed from: c */
        public void m134240c(List list) {
            if (list != null && list.size() != 0) {
                if (this.f124270e == null) {
                    this.f124270e = new ArrayList();
                }
                try {
                    this.f124270e.clear();
                    this.f124270e.addAll(list);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SettingReminderTree", e11);
                }
            }
        }

        /* renamed from: d */
        public C26071f m134241d() {
            return this.f124268c;
        }

        /* renamed from: e */
        public int m134242e() {
            ArrayList arrayList = this.f124270e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        /* renamed from: f */
        public boolean m134243f() {
            ArrayList arrayList = this.f124270e;
            if (arrayList != null && !arrayList.isEmpty()) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "settingId=" + this.f124266a + ", childNodes Size=" + m134242e() + ", settReminderItemOrigin: " + this.f124268c + ", settReminderItemShallow: " + this.f124267b + ", settReminderItemShallowBanner: " + this.f124269d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C26078m m134226e() {
        return a.f124265a;
    }

    /* renamed from: j */
    private void m134227j() {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderTree", e11);
        }
        if (this.f124261b) {
            return;
        }
        this.f124262c = true;
        b m134239g = b.m134239g(this.f124260a, AbstractC26080o.a.f124275b);
        b m134239g2 = b.m134239g(this.f124260a, 36);
        b m134239g3 = b.m134239g(this.f124260a, 37);
        b m134239g4 = b.m134239g(this.f124260a, 38);
        b m134239g5 = b.m134239g(this.f124260a, 39);
        b m134239g6 = b.m134239g(this.f124260a, 40);
        b m134239g7 = b.m134239g(this.f124260a, 41);
        b m134239g8 = b.m134239g(this.f124260a, 42);
        b m134239g9 = b.m134239g(this.f124260a, 109);
        b m134239g10 = b.m134239g(this.f124260a, 43);
        b m134239g11 = b.m134239g(this.f124260a, 44);
        b m134239g12 = b.m134239g(this.f124260a, 46);
        b m134239g13 = b.m134239g(this.f124260a, 104);
        b m134239g14 = b.m134239g(this.f124260a, 125);
        m134239g.m134240c(Collections.singletonList(m134239g2));
        m134239g2.m134240c(Arrays.asList(m134239g3, m134239g4, m134239g5, m134239g6, m134239g7, m134239g8, m134239g9, m134239g10, m134239g11, m134239g12, m134239g13, m134239g14, b.m134239g(this.f124260a, 56), b.m134239g(this.f124260a, 30), b.m134239g(this.f124260a, 31), b.m134239g(this.f124260a, 33), b.m134239g(this.f124260a, 34), b.m134239g(this.f124260a, 35), b.m134239g(this.f124260a, 32), b.m134239g(this.f124260a, 47), b.m134239g(this.f124260a, 48), b.m134239g(this.f124260a, 101)));
        b m134239g15 = b.m134239g(this.f124260a, 133);
        b m134239g16 = b.m134239g(this.f124260a, 49);
        b m134239g17 = b.m134239g(this.f124260a, 134);
        b m134239g18 = b.m134239g(this.f124260a, 135);
        b m134239g19 = b.m134239g(this.f124260a, 9);
        m134239g3.m134240c(Arrays.asList(m134239g19, b.m134239g(this.f124260a, 108), b.m134239g(this.f124260a, 5), b.m134239g(this.f124260a, 23), b.m134239g(this.f124260a, 25), m134239g15, b.m134239g(this.f124260a, 24), m134239g16, m134239g17, b.m134239g(this.f124260a, 90), m134239g18));
        m134239g15.m134240c(Arrays.asList(b.m134239g(this.f124260a, 8), b.m134239g(this.f124260a, 7), b.m134239g(this.f124260a, 6)));
        m134239g16.m134240c(Arrays.asList(b.m134239g(this.f124260a, 0), b.m134239g(this.f124260a, 1), b.m134239g(this.f124260a, 2), b.m134239g(this.f124260a, 3), b.m134239g(this.f124260a, 4), b.m134239g(this.f124260a, 27)));
        m134239g17.m134240c(Arrays.asList(b.m134239g(this.f124260a, 120), b.m134239g(this.f124260a, 143), b.m134239g(this.f124260a, 136)));
        b m134239g20 = b.m134239g(this.f124260a, 68);
        b m134239g21 = b.m134239g(this.f124260a, 141);
        m134239g18.m134240c(Arrays.asList(m134239g20, m134239g21, b.m134239g(this.f124260a, 117), b.m134239g(this.f124260a, 119), b.m134239g(this.f124260a, 118)));
        m134239g19.m134240c(Collections.singletonList(b.m134239g(this.f124260a, 147)));
        m134239g4.m134240c(Arrays.asList(b.m134239g(this.f124260a, 51), b.m134239g(this.f124260a, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444), b.m134239g(this.f124260a, 148), b.m134239g(this.f124260a, 52), b.m134239g(this.f124260a, 53), b.m134239g(this.f124260a, 54), b.m134239g(this.f124260a, 55), b.m134239g(this.f124260a, 121), b.m134239g(this.f124260a, 126)));
        m134239g5.m134240c(Arrays.asList(b.m134239g(this.f124260a, 58), b.m134239g(this.f124260a, 60), b.m134239g(this.f124260a, 91), b.m134239g(this.f124260a, 112), b.m134239g(this.f124260a, 128)));
        b m134239g22 = b.m134239g(this.f124260a, 10);
        b m134239g23 = b.m134239g(this.f124260a, 11);
        b m134239g24 = b.m134239g(this.f124260a, 12);
        b m134239g25 = b.m134239g(this.f124260a, 13);
        b m134239g26 = b.m134239g(this.f124260a, 14);
        b m134239g27 = b.m134239g(this.f124260a, 63);
        b m134239g28 = b.m134239g(this.f124260a, 64);
        m134239g6.m134240c(Arrays.asList(m134239g22, m134239g23, m134239g24, m134239g25, m134239g26, m134239g27, m134239g28, b.m134239g(this.f124260a, 131), b.m134239g(this.f124260a, 132), b.m134239g(this.f124260a, 62)));
        m134239g28.m134240c(Arrays.asList(b.m134239g(this.f124260a, 65), b.m134239g(this.f124260a, 66)));
        b m134239g29 = b.m134239g(this.f124260a, 69);
        m134239g7.m134240c(Arrays.asList(b.m134239g(this.f124260a, 15), b.m134239g(this.f124260a, 16), b.m134239g(this.f124260a, 22), b.m134239g(this.f124260a, 67), m134239g20, b.m134239g(this.f124260a, 127), m134239g29, b.m134239g(this.f124260a, 114), b.m134239g(this.f124260a, 138), b.m134239g(this.f124260a, 139), b.m134239g(this.f124260a, 140), b.m134239g(this.f124260a, 93), b.m134239g(this.f124260a, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422)));
        m134239g29.m134240c(Arrays.asList(b.m134239g(this.f124260a, 70), b.m134239g(this.f124260a, 71)));
        m134239g11.m134240c(Arrays.asList(b.m134239g(this.f124260a, 102), b.m134239g(this.f124260a, 77)));
        m134239g8.m134240c(Arrays.asList(b.m134239g(this.f124260a, 20), b.m134239g(this.f124260a, 149), b.m134239g(this.f124260a, 94), b.m134239g(this.f124260a, 95), b.m134239g(this.f124260a, 124), b.m134239g(this.f124260a, 129), m134239g21));
        m134239g10.m134240c(Arrays.asList(b.m134239g(this.f124260a, 73), b.m134239g(this.f124260a, 74), b.m134239g(this.f124260a, 75), b.m134239g(this.f124260a, 76), b.m134239g(this.f124260a, 103), b.m134239g(this.f124260a, 117), b.m134239g(this.f124260a, 141)));
        m134239g12.m134240c(Arrays.asList(b.m134239g(this.f124260a, 81), b.m134239g(this.f124260a, 83), b.m134239g(this.f124260a, 84), b.m134239g(this.f124260a, 85), b.m134239g(this.f124260a, 86), b.m134239g(this.f124260a, 87), b.m134239g(this.f124260a, 98), b.m134239g(this.f124260a, 99), b.m134239g(this.f124260a, 100)));
        m134239g13.m134240c(Arrays.asList(b.m134239g(this.f124260a, 78), b.m134239g(this.f124260a, 105), b.m134239g(this.f124260a, 79), b.m134239g(this.f124260a, 80), b.m134239g(this.f124260a, 97)));
        b.m134239g(this.f124260a, 26);
        this.f124261b = true;
        this.f124262c = false;
    }

    /* renamed from: a */
    public boolean m134228a() {
        return this.f124261b && !this.f124263d;
    }

    /* renamed from: b */
    public boolean m134229b() {
        if (this.f124261b && this.f124263d && this.f124264e.get() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m134230c() {
        Collection<b> values = this.f124260a.values();
        if (values != null && (r0 = values.iterator()) != null) {
            for (b bVar : values) {
                if (bVar != null) {
                    bVar.f124268c = null;
                    bVar.f124267b = null;
                    bVar.f124269d = null;
                }
            }
        }
        this.f124264e.set(0);
    }

    /* renamed from: d */
    public void m134231d() {
        if (this.f124264e.decrementAndGet() < 0) {
            this.f124264e.set(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public b m134232f(int i11) {
        if (i11 < 0) {
            return null;
        }
        return (b) this.f124260a.get(Integer.valueOf(i11));
    }

    /* renamed from: g */
    public b m134233g() {
        return m134232f(AbstractC26080o.a.f124275b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Map m134234h() {
        return this.f124260a;
    }

    /* renamed from: i */
    public void m134235i() {
        if (this.f124264e.incrementAndGet() >= 10) {
            this.f124264e.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m134236k(int i11, C26071f c26071f, boolean z11) {
        if (i11 >= 0 && c26071f != null) {
            try {
                if (this.f124260a.containsKey(Integer.valueOf(i11)) && this.f124260a.get(Integer.valueOf(i11)) != null) {
                    b bVar = (b) this.f124260a.get(Integer.valueOf(i11));
                    if (bVar.f124268c != null && z11 && bVar.f124268c.equals(c26071f)) {
                        return false;
                    }
                    bVar.f124268c = c26071f;
                    if (bVar.m134243f()) {
                        bVar.f124267b = bVar.f124268c;
                        return true;
                    }
                    return true;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderTree", e11);
            }
        }
        return false;
    }

    public String toString() {
        return "initialized=" + this.f124261b + ", initializing=" + this.f124262c + ", isLoadedDynamicData=" + this.f124263d + ", counterDirty=" + this.f124264e.get() + ", size mTree=" + this.f124260a.size();
    }

    private C26078m() {
        this.f124261b = false;
        this.f124262c = false;
        this.f124263d = false;
        this.f124264e = new AtomicInteger(0);
        this.f124260a = Collections.synchronizedMap(new HashMap(50));
        System.currentTimeMillis();
        m134227j();
    }
}
