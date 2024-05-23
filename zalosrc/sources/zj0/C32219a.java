package zj0;

import bn0.AbstractC2941j;
import bn0.C2936e;
import en0.InterfaceC18505l;
import fk0.InterfaceC18988a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import sm0.AbstractC26327c;

/* renamed from: zj0.a */
/* loaded from: classes.dex */
public final class C32219a implements InterfaceC18988a {

    /* renamed from: zj0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f148620q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(File file) {
            AbstractC19074t.m100208f(file, "it");
            return Boolean.valueOf(file.isFile());
        }
    }

    /* renamed from: zj0.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ List f148621q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(1);
            this.f148621q = list;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(File file) {
            boolean z11;
            String str;
            AbstractC19074t.m100208f(file, "it");
            if (file.isFile()) {
                List list = this.f148621q;
                File parentFile = file.getParentFile();
                if (parentFile == null || (str = parentFile.getName()) == null) {
                    str = "";
                }
                if (!list.contains(str)) {
                    z11 = true;
                    return Boolean.valueOf(z11);
                }
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: zj0.a$c */
    /* loaded from: classes7.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            return m135478b;
        }
    }

    @Override // fk0.InterfaceC18988a
    /* renamed from: a */
    public long mo99692a(String str) {
        C2936e<File> m13922i;
        AbstractC19074t.m100208f(str, "dirPath");
        File m155351g = m155351g(str);
        long j11 = 0;
        if (m155351g != null) {
            m13922i = AbstractC2941j.m13922i(m155351g);
            for (File file : m13922i) {
                if (file.isFile()) {
                    j11 += file.length();
                }
            }
            return j11;
        }
        return 0L;
    }

    @Override // fk0.InterfaceC18988a
    /* renamed from: b */
    public long mo99693b(List list, long j11) {
        AbstractC19074t.m100208f(list, "dirPaths");
        long j12 = 0;
        if (list.isEmpty()) {
            return 0L;
        }
        if (j11 == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j12 += m155349e((String) it.next());
            }
            return j12;
        }
        return mo99694c(m155353i(list), j11);
    }

    @Override // fk0.InterfaceC18988a
    /* renamed from: c */
    public long mo99694c(List list, long j11) {
        AbstractC19074t.m100208f(list, "files");
        long j12 = 0;
        if (list.isEmpty()) {
            return 0L;
        }
        if (j11 == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                j12 += file.length();
                m155350f(file);
            }
            return j12;
        }
        long j13 = 0;
        for (File file2 : m155354j(list)) {
            if (file2.length() + j13 > j11) {
                j12 += file2.length();
                m155350f(file2);
            } else {
                j13 += file2.length();
            }
        }
        return j12;
    }

    @Override // fk0.InterfaceC18988a
    /* renamed from: d */
    public List mo99695d(String str, List list) {
        C2936e m13922i;
        InterfaceC23898g m125023l;
        List m125032u;
        List m131502j;
        AbstractC19074t.m100208f(str, "dirPath");
        AbstractC19074t.m100208f(list, "excludeDirs");
        File m155351g = m155351g(str);
        if (m155351g == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        m13922i = AbstractC2941j.m13922i(m155351g);
        m125023l = AbstractC23906o.m125023l(m13922i, new b(list));
        m125032u = AbstractC23906o.m125032u(m125023l);
        return m125032u;
    }

    /* renamed from: e */
    public long m155349e(String str) {
        C2936e<File> m13920g;
        AbstractC19074t.m100208f(str, "dirPath");
        File m155351g = m155351g(str);
        long j11 = 0;
        if (m155351g != null) {
            m13920g = AbstractC2941j.m13920g(m155351g, null, 1, null);
            for (File file : m13920g) {
                if (m155350f(file)) {
                    j11 += file.length();
                }
            }
            m155350f(m155351g);
            return j11;
        }
        return 0L;
    }

    /* renamed from: f */
    public final boolean m155350f(File file) {
        AbstractC19074t.m100208f(file, "file");
        try {
            return file.delete();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public final File m155351g(String str) {
        AbstractC19074t.m100208f(str, "dirPath");
        if (str.length() > 0) {
            File file = new File(str);
            try {
                if (file.isDirectory()) {
                    return file;
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: h */
    public List m155352h(String str) {
        C2936e m13922i;
        InterfaceC23898g m125023l;
        List m125032u;
        List m131502j;
        AbstractC19074t.m100208f(str, "dirPath");
        File m155351g = m155351g(str);
        if (m155351g == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        m13922i = AbstractC2941j.m13922i(m155351g);
        m125023l = AbstractC23906o.m125023l(m13922i, a.f148620q);
        m125032u = AbstractC23906o.m125032u(m125023l);
        return m125032u;
    }

    /* renamed from: i */
    public List m155353i(List list) {
        List m131502j;
        AbstractC19074t.m100208f(list, "dirPaths");
        if (list.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(m155352h((String) it.next()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final List m155354j(List list) {
        List m131177E0;
        AbstractC19074t.m100208f(list, "files");
        m131177E0 = AbstractC25332a0.m131177E0(list, new c());
        return m131177E0;
    }
}
