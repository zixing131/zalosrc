package p359n8;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p153f8.C18821f;
import p232i8.AbstractC20411p;
import p259j8.C21095i;
import p292k8.AbstractC21569b0;
import p292k8.C21571c0;
import p318l8.C22120h;
import p418p8.InterfaceC24673i;

/* renamed from: n8.e */
/* loaded from: classes.dex */
public class C23618e {

    /* renamed from: d */
    private static final Charset f114475d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f114476e = 15;

    /* renamed from: f */
    private static final C22120h f114477f = new C22120h();

    /* renamed from: g */
    private static final Comparator f114478g = new Comparator() { // from class: n8.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m123801u;
            m123801u = C23618e.m123801u((File) obj, (File) obj2);
            return m123801u;
        }
    };

    /* renamed from: h */
    private static final FilenameFilter f114479h = new FilenameFilter() { // from class: n8.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m123802v;
            m123802v = C23618e.m123802v(file, str);
            return m123802v;
        }
    };

    /* renamed from: a */
    private final AtomicInteger f114480a = new AtomicInteger(0);

    /* renamed from: b */
    private final C23620g f114481b;

    /* renamed from: c */
    private final InterfaceC24673i f114482c;

    public C23618e(C23620g c23620g, InterfaceC24673i interfaceC24673i) {
        this.f114481b = c23620g;
        this.f114482c = interfaceC24673i;
    }

    /* renamed from: A */
    private static String m123780A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f114475d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: B */
    private void m123781B(File file, AbstractC21569b0.d dVar, String str, AbstractC21569b0.a aVar) {
        try {
            C22120h c22120h = f114477f;
            m123785F(this.f114481b.m123827g(str), c22120h.m115367G(c22120h.m115366F(m123780A(file)).m111261o(dVar).m111259m(aVar)));
        } catch (IOException e11) {
            C18821f.m98795f().m98805l("Could not synthesize final native report file for " + file, e11);
        }
    }

    /* renamed from: C */
    private void m123782C(String str, long j11) {
        boolean z11;
        List<File> m123835p = this.f114481b.m123835p(str, f114479h);
        if (m123835p.isEmpty()) {
            C18821f.m98795f().m98802i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m123835p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z11 = false;
            for (File file : m123835p) {
                try {
                    arrayList.add(f114477f.m115368h(m123780A(file)));
                } catch (IOException e11) {
                    C18821f.m98795f().m98805l("Could not add event to report for " + file, e11);
                }
                if (z11 || m123799s(file.getName())) {
                    z11 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            C18821f.m98795f().m98804k("Could not parse event files for session " + str);
            return;
        }
        m123783D(this.f114481b.m123834o(str, "report"), arrayList, j11, z11, C21095i.m109612j(str, this.f114481b));
    }

    /* renamed from: D */
    private void m123783D(File file, List list, long j11, boolean z11, String str) {
        File m123832l;
        try {
            C22120h c22120h = f114477f;
            AbstractC21569b0 m111260n = c22120h.m115366F(m123780A(file)).m111262p(j11, z11, str).m111260n(C21571c0.m111495d(list));
            AbstractC21569b0.e mo111245k = m111260n.mo111245k();
            if (mo111245k == null) {
                return;
            }
            if (z11) {
                m123832l = this.f114481b.m123830j(mo111245k.mo111316h());
            } else {
                m123832l = this.f114481b.m123832l(mo111245k.mo111316h());
            }
            m123785F(m123832l, c22120h.m115367G(m111260n));
        } catch (IOException e11) {
            C18821f.m98795f().m98805l("Could not synthesize final report file for " + file, e11);
        }
    }

    /* renamed from: E */
    private int m123784E(String str, int i11) {
        List m123835p = this.f114481b.m123835p(str, new FilenameFilter() { // from class: n8.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean m123800t;
                m123800t = C23618e.m123800t(file, str2);
                return m123800t;
            }
        });
        Collections.sort(m123835p, new Comparator() { // from class: n8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m123803x;
                m123803x = C23618e.m123803x((File) obj, (File) obj2);
                return m123803x;
            }
        });
        return m123792f(m123835p, i11);
    }

    /* renamed from: F */
    private static void m123785F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f114475d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: G */
    private static void m123786G(File file, String str, long j11) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f114475d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m123794h(j11));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: e */
    private SortedSet m123791e(String str) {
        this.f114481b.m123822b();
        SortedSet m123807p = m123807p();
        if (str != null) {
            m123807p.remove(str);
        }
        if (m123807p.size() <= 8) {
            return m123807p;
        }
        while (m123807p.size() > 8) {
            String str2 = (String) m123807p.last();
            C18821f.m98795f().m98796b("Removing session over cap: " + str2);
            this.f114481b.m123823c(str2);
            m123807p.remove(str2);
        }
        return m123807p;
    }

    /* renamed from: f */
    private static int m123792f(List list, int i11) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i11) {
                return size;
            }
            C23620g.m123818s(file);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m123793g() {
        int i11 = this.f114482c.mo128225b().f118585a.f118597b;
        List m123797n = m123797n();
        int size = m123797n.size();
        if (size <= i11) {
            return;
        }
        Iterator it = m123797n.subList(i11, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: h */
    private static long m123794h(long j11) {
        return j11 * 1000;
    }

    /* renamed from: j */
    private void m123795j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: m */
    private static String m123796m(int i11, boolean z11) {
        String str;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i11));
        if (z11) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    /* renamed from: n */
    private List m123797n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f114481b.m123831k());
        arrayList.addAll(this.f114481b.m123828h());
        Comparator comparator = f114478g;
        Collections.sort(arrayList, comparator);
        List m123833m = this.f114481b.m123833m();
        Collections.sort(m123833m, comparator);
        arrayList.addAll(m123833m);
        return arrayList;
    }

    /* renamed from: o */
    private static String m123798o(String str) {
        return str.substring(0, f114476e);
    }

    /* renamed from: s */
    private static boolean m123799s(String str) {
        if (str.startsWith("event") && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m123800t(File file, String str) {
        if (str.startsWith("event") && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m123801u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ boolean m123802v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m123803x(File file, File file2) {
        return m123798o(file.getName()).compareTo(m123798o(file2.getName()));
    }

    /* renamed from: i */
    public void m123804i() {
        m123795j(this.f114481b.m123833m());
        m123795j(this.f114481b.m123831k());
        m123795j(this.f114481b.m123828h());
    }

    /* renamed from: k */
    public void m123805k(String str, long j11) {
        for (String str2 : m123791e(str)) {
            C18821f.m98795f().m98802i("Finalizing report for session " + str2);
            m123782C(str2, j11);
            this.f114481b.m123823c(str2);
        }
        m123793g();
    }

    /* renamed from: l */
    public void m123806l(String str, AbstractC21569b0.d dVar, AbstractC21569b0.a aVar) {
        File m123834o = this.f114481b.m123834o(str, "report");
        C18821f.m98795f().m98796b("Writing native session report for " + str + " to file: " + m123834o);
        m123781B(m123834o, dVar, str, aVar);
    }

    /* renamed from: p */
    public SortedSet m123807p() {
        return new TreeSet(this.f114481b.m123824d()).descendingSet();
    }

    /* renamed from: q */
    public long m123808q(String str) {
        return this.f114481b.m123834o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m123809r() {
        if (this.f114481b.m123833m().isEmpty() && this.f114481b.m123831k().isEmpty() && this.f114481b.m123828h().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public List m123810w() {
        List<File> m123797n = m123797n();
        ArrayList arrayList = new ArrayList();
        for (File file : m123797n) {
            try {
                arrayList.add(AbstractC20411p.m106384a(f114477f.m115366F(m123780A(file)), file.getName(), file));
            } catch (IOException e11) {
                C18821f.m98795f().m98805l("Could not load report file " + file + "; deleting", e11);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m123811y(AbstractC21569b0.e.d dVar, String str, boolean z11) {
        int i11 = this.f114482c.mo128225b().f118585a.f118596a;
        try {
            m123785F(this.f114481b.m123834o(str, m123796m(this.f114480a.getAndIncrement(), z11)), f114477f.m115369i(dVar));
        } catch (IOException e11) {
            C18821f.m98795f().m98805l("Could not persist event for session " + str, e11);
        }
        m123784E(str, i11);
    }

    /* renamed from: z */
    public void m123812z(AbstractC21569b0 abstractC21569b0) {
        AbstractC21569b0.e mo111245k = abstractC21569b0.mo111245k();
        if (mo111245k == null) {
            C18821f.m98795f().m98796b("Could not get session for report");
            return;
        }
        String mo111316h = mo111245k.mo111316h();
        try {
            m123785F(this.f114481b.m123834o(mo111316h, "report"), f114477f.m115367G(abstractC21569b0));
            m123786G(this.f114481b.m123834o(mo111316h, "start-time"), "", mo111245k.mo111319k());
        } catch (IOException e11) {
            C18821f.m98795f().m98797c("Could not persist report for session " + mo111316h, e11);
        }
    }
}
