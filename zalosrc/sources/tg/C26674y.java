package tg;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23041d2;
import me0.C23055e5;
import mm0.AbstractC23352g;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p716zh.C31845ac;
import p716zh.C31890dc;
import tg.C26656g;
import tg.C26665p;
import vg.C28111k4;

/* renamed from: tg.y */
/* loaded from: classes3.dex */
public class C26674y implements C26665p.c, C26656g.a {

    /* renamed from: k */
    static C26674y f126201k;

    /* renamed from: g */
    private long f126208g;

    /* renamed from: h */
    private long f126209h;

    /* renamed from: i */
    private long f126210i;

    /* renamed from: j */
    private long f126211j;

    /* renamed from: a */
    C26656g f126202a = new C26656g(this);

    /* renamed from: b */
    C26665p f126203b = new C26665p(this);

    /* renamed from: c */
    Map f126204c = Collections.synchronizedMap(new a(100, 0.75f, true));

    /* renamed from: f */
    Map f126207f = new HashMap();

    /* renamed from: e */
    Map f126206e = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    Map f126205d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.y$a */
    /* loaded from: classes3.dex */
    public class a extends LinkedHashMap {
        a(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: tg.y$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo15759a(int i11, String str, String str2, C26657h c26657h);
    }

    C26674y() {
        this.f126208g = 0L;
        this.f126209h = 0L;
        this.f126210i = 0L;
        this.f126211j = 0L;
        this.f126208g = AbstractC23309i.m122605y6();
        this.f126209h = AbstractC23309i.m122568x6();
        this.f126210i = AbstractC23309i.m122642z6();
        this.f126211j = AbstractC23309i.m120743A6();
    }

    /* renamed from: A */
    public static /* synthetic */ int m136849A(File file, File file2) {
        if (file.lastModified() < file2.lastModified()) {
            return 1;
        }
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        return -1;
    }

    /* renamed from: B */
    public /* synthetic */ void m136850B() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f126211j;
        if (j11 == 0 || currentTimeMillis - j11 >= 604800000) {
            this.f126211j = currentTimeMillis;
            AbstractC23309i.m121651Yq(currentTimeMillis);
            C7960e.m41971c6().m42115F0(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
    }

    /* renamed from: C */
    private void m136851C(List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = (String) list.get(i11);
            b bVar = (b) this.f126206e.remove(str);
            this.f126207f.remove(str);
            if (bVar != null) {
                bVar.mo15759a(-1, str, null, null);
            }
            C23744a.m124114c().m124116d(40, list);
        }
    }

    /* renamed from: D */
    public void m136852D() {
        File[] listFiles;
        try {
            String m18804r = AbstractC3972e.m18804r();
            File file = new File(m18804r);
            try {
                Map map = this.f126205d;
                if (map != null && map.size() > 0) {
                    Iterator it = this.f126205d.entrySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) ((Map.Entry) it.next()).getKey();
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = m18804r + str;
                            File file2 = new File(str2);
                            if (file2.exists() && file2.isDirectory()) {
                                String str3 = str2 + "/" + str + ".tmp";
                                if (AbstractC23041d2.m118194A(str3)) {
                                    AbstractC23041d2.m118208g(str3);
                                } else {
                                    new File(str3).createNewFile();
                                }
                            }
                        }
                    }
                    this.f126205d.clear();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f126209h;
            long j12 = 0;
            if (j11 == 0 || currentTimeMillis - j11 >= 604800000) {
                this.f126209h = currentTimeMillis;
                AbstractC23309i.m121540Vq(currentTimeMillis);
                long m104857T = AbstractC20130d.m104857T(file);
                if (m104857T > 52428800 && (listFiles = file.listFiles(new C26670u())) != null && listFiles.length > 0) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator() { // from class: tg.v
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m136868y;
                            m136868y = C26674y.m136868y((File) obj, (File) obj2);
                            return m136868y;
                        }
                    });
                    for (int size = asList.size() - 1; size >= 0 && m104857T - j12 > 52428800; size--) {
                        try {
                            File file3 = (File) asList.get(size);
                            if (!this.f126203b.m136799b(file3.getName())) {
                                j12 += AbstractC20130d.m104857T(file3);
                                AbstractC20130d.m104887p(file3);
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: F */
    public void m136853F() {
        File[] listFiles;
        try {
            String m18744A = AbstractC3972e.m18744A();
            File file = new File(m18744A);
            try {
                Map map = this.f126204c;
                if (map != null && map.size() > 0) {
                    Iterator it = this.f126204c.entrySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) ((Map.Entry) it.next()).getKey();
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = m18744A + str;
                            File file2 = new File(str2);
                            if (file2.exists() && file2.isDirectory()) {
                                String str3 = str2 + "/" + str + ".tmp";
                                if (AbstractC23041d2.m118194A(str3)) {
                                    AbstractC23041d2.m118208g(str3);
                                } else {
                                    new File(str3).createNewFile();
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f126210i;
            long j12 = 0;
            if (j11 == 0 || currentTimeMillis - j11 >= 604800000) {
                this.f126210i = currentTimeMillis;
                AbstractC23309i.m121614Xq(currentTimeMillis);
                long m104857T = AbstractC20130d.m104857T(file);
                if (m104857T > 20971520 && (listFiles = file.listFiles(new C26670u())) != null && listFiles.length > 0) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator() { // from class: tg.w
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m136869z;
                            m136869z = C26674y.m136869z((File) obj, (File) obj2);
                            return m136869z;
                        }
                    });
                    for (int size = asList.size() - 1; size >= 0 && m104857T - j12 > 20971520; size--) {
                        try {
                            File file3 = (File) asList.get(size);
                            String name = file3.getName();
                            if (!this.f126204c.containsKey(name) && !this.f126202a.m136799b(name) && !this.f126203b.m136799b(name)) {
                                j12 += AbstractC20130d.m104857T(file3);
                                AbstractC20130d.m104887p(file3);
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: H */
    public void m136854H() {
        File[] listFiles;
        try {
            String m18813z = AbstractC3972e.m18813z();
            File file = new File(m18813z);
            try {
                Map map = this.f126204c;
                if (map != null && map.size() > 0) {
                    Iterator it = this.f126204c.entrySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) ((Map.Entry) it.next()).getKey();
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = m18813z + str;
                            File file2 = new File(str2);
                            if (file2.exists() && file2.isDirectory()) {
                                String str3 = str2 + "/" + str + ".tmp";
                                if (AbstractC23041d2.m118194A(str3)) {
                                    AbstractC23041d2.m118208g(str3);
                                } else {
                                    new File(str3).createNewFile();
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f126208g;
            long j12 = 0;
            if (j11 == 0 || currentTimeMillis - j11 >= 604800000) {
                this.f126208g = currentTimeMillis;
                AbstractC23309i.m121577Wq(currentTimeMillis);
                long m104857T = AbstractC20130d.m104857T(file);
                if (m104857T > 52428800 && (listFiles = file.listFiles(new C26670u())) != null && listFiles.length > 0) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator() { // from class: tg.x
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m136849A;
                            m136849A = C26674y.m136849A((File) obj, (File) obj2);
                            return m136849A;
                        }
                    });
                    for (int size = asList.size() - 1; size >= 0 && m104857T - j12 > 52428800; size--) {
                        try {
                            File file3 = (File) asList.get(size);
                            String name = file3.getName();
                            if (!this.f126204c.containsKey(name) && !this.f126202a.m136799b(name) && !this.f126203b.m136799b(name)) {
                                j12 += AbstractC20130d.m104857T(file3);
                                AbstractC20130d.m104887p(file3);
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: m */
    public static File m136862m(String str) {
        return new File(AbstractC3972e.m18804r() + str);
    }

    /* renamed from: q */
    public static File m136863q(String str) {
        return new File(AbstractC3972e.m18744A() + str);
    }

    /* renamed from: s */
    public static File m136864s(String str) {
        return new File(AbstractC3972e.m18813z() + str);
    }

    /* renamed from: t */
    public static synchronized C26674y m136865t() {
        C26674y c26674y;
        synchronized (C26674y.class) {
            synchronized (C26674y.class) {
                try {
                    if (f126201k == null) {
                        f126201k = new C26674y();
                    }
                    c26674y = f126201k;
                } finally {
                }
            }
            return c26674y;
        }
        return c26674y;
    }

    /* renamed from: v */
    public static String m136866v(File file, String str) {
        try {
            File file2 = new File(file.getPath() + "/" + AbstractC23352g.m122788d(str));
            if (!file2.exists() || file2.length() <= 0) {
                return "";
            }
            return file2.getPath();
        } catch (Exception e11) {
            AbstractC20110a.m104543l("EffectManager").mo104552e(e11);
            return "";
        }
    }

    /* renamed from: w */
    public static String m136867w(C26657h c26657h) {
        if (c26657h != null) {
            return c26657h.f126156a;
        }
        return "";
    }

    /* renamed from: y */
    public static /* synthetic */ int m136868y(File file, File file2) {
        if (file.lastModified() < file2.lastModified()) {
            return 1;
        }
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        return -1;
    }

    /* renamed from: z */
    public static /* synthetic */ int m136869z(File file, File file2) {
        if (file.lastModified() < file2.lastModified()) {
            return 1;
        }
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        return -1;
    }

    /* renamed from: E */
    public void m136870E() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tg.q
            public /* synthetic */ RunnableC26666q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26674y.this.m136852D();
            }
        });
    }

    /* renamed from: G */
    public void m136871G() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tg.s
            public /* synthetic */ RunnableC26668s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26674y.this.m136853F();
            }
        });
    }

    /* renamed from: I */
    public void m136872I() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tg.t
            public /* synthetic */ RunnableC26669t() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26674y.this.m136854H();
            }
        });
    }

    /* renamed from: J */
    public void m136873J() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tg.r
            public /* synthetic */ RunnableC26667r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26674y.this.m136850B();
            }
        });
    }

    @Override // tg.C26656g.a
    /* renamed from: a */
    public void mo136818a(List list, int i11, List list2, byte b11) {
        int i12;
        File m136864s;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onDownloadMetaDataComplete: effectId=");
            sb2.append(list);
            sb2.append("; errorCode=");
            sb2.append(i11);
            if (i11 == 0) {
                if (list2 != null && list2.size() == list.size()) {
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        C26657h c26657h = (C26657h) list2.get(i13);
                        String str = (String) list.get(i13);
                        if (c26657h.m136819a()) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        if (c26657h.m136819a()) {
                            m136864s = m136863q(str);
                        } else {
                            m136864s = m136864s(str);
                        }
                        File file = m136864s;
                        this.f126204c.put(str, c26657h);
                        this.f126203b.m136846e(str, c26657h.f126157b, c26657h.f126156a, c26657h, file, i12, b11);
                    }
                    return;
                }
                m136851C(list);
                return;
            }
            m136851C(list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // tg.C26665p.c
    /* renamed from: b */
    public void mo136848b(String str, int i11, String str2, int i12) {
        String str3;
        File file;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onDownloadZipComplete: effectId=");
            sb2.append(str);
            sb2.append("; errorCode=");
            sb2.append(i11);
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = "; assetDir=" + str2;
            }
            sb2.append(str3);
            b bVar = (b) this.f126206e.remove(str);
            this.f126207f.remove(str);
            C28111k4.m141588d().m141597l(str2);
            if (i11 == 0) {
                if (bVar != null) {
                    bVar.mo15759a(i11, str, str2, (C26657h) this.f126204c.get(str));
                }
            } else {
                try {
                    if (i12 == 1) {
                        file = m136862m(str);
                    } else if (i12 == 0) {
                        file = m136864s(str);
                    } else if (i12 == 2) {
                        file = m136863q(str);
                    } else {
                        file = null;
                    }
                    if (file != null && file.exists()) {
                        AbstractC20130d.m104856S0(file);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (bVar != null) {
                    bVar.mo15759a(-1, str, null, null);
                }
            }
            C23744a.m124114c().m124116d(40, str);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m136874j(String str, C26657h c26657h) {
        this.f126204c.put(str, c26657h);
    }

    /* renamed from: k */
    public void m136875k(String str) {
        this.f126204c.remove(str);
        File file = new File(AbstractC3972e.m18813z() + str);
        if (file.exists()) {
            AbstractC23041d2.m118211j(file);
        }
        C7960e.m41971c6().m42277Tb(str);
    }

    /* renamed from: l */
    public synchronized void m136876l(C26657h c26657h, String str, b bVar) {
        String str2;
        String m136867w;
        String m136866v;
        try {
            str2 = c26657h.f126160e;
            this.f126205d.put(str2, str2);
            m136867w = m136867w(c26657h);
            m136866v = m136866v(m136862m(str2), m136867w);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(m136866v) && new File(m136866v).exists()) {
            bVar.mo15759a(0, str2, m136866v, c26657h);
            return;
        }
        this.f126206e.put(str2, bVar);
        if (!TextUtils.isEmpty(str)) {
            Set set = (Set) this.f126207f.get(str2);
            if (set == null) {
                set = new HashSet();
                this.f126207f.put(str2, set);
            }
            set.add(str);
        }
        C23744a.m124114c().m124116d(40, str2);
        this.f126203b.m136846e(str2, c26657h.f126157b, m136867w, c26657h, m136862m(str2), 1, (byte) 0);
    }

    /* renamed from: n */
    public synchronized void m136877n(String str, String str2, b bVar, byte b11) {
        m136878o(str, str2, bVar, true, b11);
    }

    /* renamed from: o */
    public synchronized void m136878o(String str, String str2, b bVar, boolean z11, byte b11) {
        C26657h m136881u;
        boolean z12;
        String m136867w;
        String m136866v;
        boolean z13;
        try {
            try {
                m136881u = m136881u(str);
                if (m136881u != null && m136881u.m136820b()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m136867w = m136867w(m136881u);
                m136866v = m136866v(m136864s(str), m136867w);
                if (!TextUtils.isEmpty(m136866v) && new File(m136866v).exists()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (z12 && z13) {
                if (m136881u.f126157b == 14 && m136881u.f126162g == null) {
                    m136881u.m136821c(new File(m136866v + "/metadata"), m136866v);
                }
                if (bVar != null) {
                    bVar.mo15759a(0, str, m136866v, m136881u);
                }
                return;
            }
            if (!C23055e5.m118272g(z11)) {
                if (bVar != null) {
                    bVar.mo15759a(-1, str, null, null);
                }
                return;
            }
            this.f126206e.put(str, bVar);
            if (!TextUtils.isEmpty(str2)) {
                Set set = (Set) this.f126207f.get(str);
                if (set == null) {
                    set = new HashSet();
                    this.f126207f.put(str, set);
                }
                set.add(str2);
            }
            if (!z12) {
                this.f126202a.m136817f(new ArrayList(Collections.singletonList(str)), b11);
            } else {
                this.f126203b.m136846e(str, m136881u.f126157b, m136867w, m136881u, m136864s(str), 0, b11);
            }
            C23744a.m124114c().m124116d(40, str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0005, B:10:0x001e, B:12:0x0022, B:13:0x0030, B:15:0x0040, B:17:0x0046, B:19:0x004c, B:22:0x006b, B:24:0x0071, B:29:0x0082, B:31:0x0086, B:33:0x00a8, B:36:0x00ad, B:38:0x00b8, B:40:0x00c2, B:41:0x00cc, B:43:0x00d1, B:45:0x00d5, B:46:0x00ed, B:49:0x00fc, B:51:0x0100, B:52:0x0118), top: B:7:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0005, B:10:0x001e, B:12:0x0022, B:13:0x0030, B:15:0x0040, B:17:0x0046, B:19:0x004c, B:22:0x006b, B:24:0x0071, B:29:0x0082, B:31:0x0086, B:33:0x00a8, B:36:0x00ad, B:38:0x00b8, B:40:0x00c2, B:41:0x00cc, B:43:0x00d1, B:45:0x00d5, B:46:0x00ed, B:49:0x00fc, B:51:0x0100, B:52:0x0118), top: B:7:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0005, B:10:0x001e, B:12:0x0022, B:13:0x0030, B:15:0x0040, B:17:0x0046, B:19:0x004c, B:22:0x006b, B:24:0x0071, B:29:0x0082, B:31:0x0086, B:33:0x00a8, B:36:0x00ad, B:38:0x00b8, B:40:0x00c2, B:41:0x00cc, B:43:0x00d1, B:45:0x00d5, B:46:0x00ed, B:49:0x00fc, B:51:0x0100, B:52:0x0118), top: B:7:0x0005, outer: #1 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void m136879p(C31890dc c31890dc, String str, b bVar, byte b11) {
        String str2;
        C26657h c26657h;
        String m136867w;
        String m136866v;
        boolean z11;
        boolean z12;
        C26657h c26657h2;
        try {
            if (c31890dc == null) {
                return;
            }
            try {
                str2 = c31890dc.f146495a + "";
                C26657h m136881u = m136881u(str2);
                if (m136881u == null && (c26657h2 = c31890dc.f146507m) != null) {
                    this.f126204c.put(str2, c26657h2);
                    c26657h = c26657h2;
                } else {
                    c26657h = m136881u;
                }
                m136867w = m136867w(c26657h);
                m136866v = m136866v(m136863q(str2), m136867w);
                z11 = true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (c26657h != null && c26657h.m136820b() && !TextUtils.isEmpty(m136866v)) {
                if (new File(m136866v + "/metadata").exists()) {
                    z12 = true;
                    if (!TextUtils.isEmpty(m136866v) || !new File(m136866v).exists()) {
                        z11 = false;
                    }
                    if (!z12 && z11) {
                        if (C31845ac.f146173x) {
                            C31845ac.m152996J().m153061q0("--HAS--CACHED--TYPO--" + str2 + " assetPath " + m136866v);
                        }
                        if (bVar != null) {
                            bVar.mo15759a(0, str2, m136866v, c26657h);
                        }
                        return;
                    }
                    this.f126206e.put(str2, bVar);
                    if (!TextUtils.isEmpty(str)) {
                        Set set = (Set) this.f126207f.get(str2);
                        if (set == null) {
                            set = new HashSet();
                            this.f126207f.put(str2, set);
                        }
                        set.add(str);
                    }
                    if (z12) {
                        if (C31845ac.f146173x) {
                            C31845ac.m152996J().m153061q0("--DOWNLOAD--META--TYPO--" + str2);
                        }
                        this.f126202a.m136817f(new ArrayList(Collections.singletonList(str2)), b11);
                    } else {
                        if (C31845ac.f146173x) {
                            C31845ac.m152996J().m153061q0("--DOWNLOAD--ZIP--TYPO--" + str2);
                        }
                        this.f126203b.m136846e(str2, c26657h.f126157b, m136867w, c26657h, m136863q(str2), 2, b11);
                    }
                }
            }
            z12 = false;
            if (!TextUtils.isEmpty(m136866v)) {
            }
            z11 = false;
            if (!z12) {
            }
            this.f126206e.put(str2, bVar);
            if (!TextUtils.isEmpty(str)) {
            }
            if (z12) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0 A[Catch: all -> 0x0053, Exception -> 0x0056, TryCatch #1 {Exception -> 0x0056, blocks: (B:4:0x0007, B:9:0x000f, B:10:0x0020, B:12:0x0027, B:14:0x0048, B:16:0x004c, B:17:0x0059, B:19:0x0067, B:21:0x006d, B:23:0x0073, B:26:0x0092, B:28:0x0098, B:33:0x00a9, B:35:0x00ad, B:37:0x00cf, B:40:0x0108, B:41:0x00d5, B:43:0x00e0, B:45:0x00ea, B:46:0x00f4, B:48:0x00fe, B:50:0x0102, B:56:0x010c, B:58:0x0117, B:60:0x0151, B:62:0x0157, B:68:0x011d, B:71:0x0128, B:73:0x014d, B:74:0x013b), top: B:3:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe A[Catch: all -> 0x0053, Exception -> 0x0056, TryCatch #1 {Exception -> 0x0056, blocks: (B:4:0x0007, B:9:0x000f, B:10:0x0020, B:12:0x0027, B:14:0x0048, B:16:0x004c, B:17:0x0059, B:19:0x0067, B:21:0x006d, B:23:0x0073, B:26:0x0092, B:28:0x0098, B:33:0x00a9, B:35:0x00ad, B:37:0x00cf, B:40:0x0108, B:41:0x00d5, B:43:0x00e0, B:45:0x00ea, B:46:0x00f4, B:48:0x00fe, B:50:0x0102, B:56:0x010c, B:58:0x0117, B:60:0x0151, B:62:0x0157, B:68:0x011d, B:71:0x0128, B:73:0x014d, B:74:0x013b), top: B:3:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102 A[Catch: all -> 0x0053, Exception -> 0x0056, TryCatch #1 {Exception -> 0x0056, blocks: (B:4:0x0007, B:9:0x000f, B:10:0x0020, B:12:0x0027, B:14:0x0048, B:16:0x004c, B:17:0x0059, B:19:0x0067, B:21:0x006d, B:23:0x0073, B:26:0x0092, B:28:0x0098, B:33:0x00a9, B:35:0x00ad, B:37:0x00cf, B:40:0x0108, B:41:0x00d5, B:43:0x00e0, B:45:0x00ea, B:46:0x00f4, B:48:0x00fe, B:50:0x0102, B:56:0x010c, B:58:0x0117, B:60:0x0151, B:62:0x0157, B:68:0x011d, B:71:0x0128, B:73:0x014d, B:74:0x013b), top: B:3:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void m136880r(List list, String str, b bVar, byte b11) {
        boolean z11;
        C26657h c26657h;
        try {
            try {
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            while (true) {
                boolean z12 = true;
                if (i11 >= list.size()) {
                    break;
                }
                C31890dc c31890dc = (C31890dc) list.get(i11);
                String str2 = c31890dc.f146495a + "";
                C26657h m136881u = m136881u(str2);
                if (m136881u == null && (c26657h = c31890dc.f146507m) != null) {
                    this.f126204c.put(str2, c26657h);
                    m136881u = c26657h;
                }
                String m136866v = m136866v(m136863q(str2), m136867w(m136881u));
                if (m136881u != null && m136881u.m136820b() && !TextUtils.isEmpty(m136866v)) {
                    if (new File(m136866v + "/metadata").exists()) {
                        z11 = true;
                        if (!TextUtils.isEmpty(m136866v) || !new File(m136866v).exists()) {
                            z12 = false;
                        }
                        if (!z11 && z12) {
                            if (C31845ac.f146173x) {
                                C31845ac.m152996J().m153061q0("--HAS--CACHED--TYPO--" + str2 + " assetPath " + m136866v);
                            }
                            if (bVar != null) {
                                bVar.mo15759a(0, str2, m136866v, m136881u);
                            }
                        } else {
                            this.f126206e.put(str2, bVar);
                            if (!TextUtils.isEmpty(str)) {
                                Set set = (Set) this.f126207f.get(str2);
                                if (set == null) {
                                    set = new HashSet();
                                    this.f126207f.put(str2, set);
                                }
                                set.add(str);
                            }
                            if (z11) {
                                arrayList.add(str2);
                            } else {
                                arrayList2.add(str2);
                                arrayList3.add(m136881u);
                            }
                        }
                        i11++;
                    }
                }
                z11 = false;
                if (!TextUtils.isEmpty(m136866v)) {
                }
                z12 = false;
                if (!z11) {
                }
                this.f126206e.put(str2, bVar);
                if (!TextUtils.isEmpty(str)) {
                }
                if (z11) {
                }
                i11++;
            }
            int size = (arrayList.size() - 1) / 20;
            int i12 = size + 1;
            if (i12 == 1) {
                this.f126202a.m136817f(arrayList, b11);
            } else {
                int size2 = arrayList.size() % 20;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (i13 == size) {
                        int i14 = i13 * 20;
                        this.f126202a.m136817f(new ArrayList(arrayList.subList(i14, i14 + size2)), b11);
                    } else {
                        int i15 = i13 * 20;
                        this.f126202a.m136817f(new ArrayList(arrayList.subList(i15, i15 + 20)), b11);
                    }
                }
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                String str3 = (String) arrayList2.get(i16);
                C26657h c26657h2 = (C26657h) arrayList3.get(i16);
                this.f126203b.m136846e(str3, c26657h2.f126157b, c26657h2.f126156a, c26657h2, m136863q(str3), 0, b11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: u */
    public synchronized C26657h m136881u(String str) {
        C26657h c26657h;
        C26657h c26657h2 = null;
        try {
            c26657h = (C26657h) this.f126204c.get(str);
            if (c26657h == null) {
                try {
                    this.f126204c.putAll(C7960e.m41971c6().m42431j6(new ArrayList(Collections.singletonList(str))));
                    c26657h = (C26657h) this.f126204c.get(str);
                } catch (Exception e11) {
                    e = e11;
                    c26657h2 = c26657h;
                    AbstractC20110a.m104543l("EffectsManager").mo104552e(e);
                    c26657h = c26657h2;
                    return c26657h;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return c26657h;
    }

    /* renamed from: x */
    public boolean m136882x(String str, String str2) {
        if (this.f126207f.containsKey(str) && ((Set) this.f126207f.get(str)).contains(str2)) {
            return true;
        }
        return false;
    }
}
