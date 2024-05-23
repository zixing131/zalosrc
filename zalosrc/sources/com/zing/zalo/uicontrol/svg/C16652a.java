package com.zing.zalo.uicontrol.svg;

import com.google.android.gms.ads.RequestConfiguration;
import com.zing.zalo.uicontrol.svg.C16654c;
import com.zing.zalo.uicontrol.svg.C16656e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xml.sax.SAXException;

/* renamed from: com.zing.zalo.uicontrol.svg.a */
/* loaded from: classes4.dex */
public class C16652a {

    /* renamed from: a */
    private f f83951a;

    /* renamed from: b */
    private boolean f83952b = false;

    /* renamed from: com.zing.zalo.uicontrol.svg.a$a */
    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f83953a;

        static {
            int[] iArr = new int[c.values().length];
            f83953a = iArr;
            try {
                iArr[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83953a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83953a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public String f83954a;

        /* renamed from: b */
        public c f83955b;

        /* renamed from: c */
        public String f83956c;

        public b(String str, c cVar, String str2) {
            this.f83954a = str;
            this.f83955b = cVar;
            this.f83956c = str2;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$c */
    /* loaded from: classes4.dex */
    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$d */
    /* loaded from: classes4.dex */
    public static class d extends C16656e.h {
        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: B */
        private int m88456B() {
            int i11;
            if (m88756g()) {
                return this.f84429b;
            }
            int i12 = this.f84429b;
            int charAt = this.f84428a.charAt(i12);
            if (charAt == 45) {
                charAt = m88750a();
            }
            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                int m88750a = m88750a();
                while (true) {
                    if ((m88750a < 65 || m88750a > 90) && ((m88750a < 97 || m88750a > 122) && !((m88750a >= 48 && m88750a <= 57) || m88750a == 45 || m88750a == 95))) {
                        break;
                    }
                    m88750a = m88750a();
                }
                i11 = this.f84429b;
            } else {
                i11 = i12;
            }
            this.f84429b = i12;
            return i11;
        }

        /* renamed from: x */
        private String m88457x() {
            if (m88756g()) {
                return null;
            }
            String m88765p = m88765p();
            if (m88765p != null) {
                return m88765p;
            }
            return m88459y();
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:            if (r4 == null) goto L192;     */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:            r11.m88467a(r4);     */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:            return true;     */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:            r10.f84429b = r0;     */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x015c, code lost:            return false;     */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0154 A[EDGE_INSN: B:94:0x0154->B:78:0x0154 BREAK  A[LOOP:0: B:14:0x004d->B:47:0x004d], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x003c  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m88458A(i iVar) {
            e eVar;
            j jVar;
            c cVar;
            String str;
            if (m88756g()) {
                return false;
            }
            int i11 = this.f84429b;
            if (!iVar.m88472f()) {
                if (m88754e('>')) {
                    eVar = e.CHILD;
                    m88772w();
                } else if (m88754e('+')) {
                    eVar = e.FOLLOWS;
                    m88772w();
                }
                if (!m88754e('*')) {
                    jVar = new j(eVar, null);
                } else {
                    String m88459y = m88459y();
                    if (m88459y != null) {
                        j jVar2 = new j(eVar, m88459y);
                        iVar.m88469c();
                        jVar = jVar2;
                    } else {
                        jVar = null;
                    }
                }
                while (true) {
                    if (!m88756g()) {
                        if (m88754e('.')) {
                            if (jVar == null) {
                                jVar = new j(eVar, null);
                            }
                            String m88459y2 = m88459y();
                            if (m88459y2 != null) {
                                jVar.m88474a("class", c.EQUALS, m88459y2);
                                iVar.m88468b();
                            } else {
                                throw new SAXException("Invalid \".class\" selector in <style> element");
                            }
                        } else {
                            if (m88754e('#')) {
                                if (jVar == null) {
                                    jVar = new j(eVar, null);
                                }
                                String m88459y3 = m88459y();
                                if (m88459y3 != null) {
                                    jVar.m88474a("id", c.EQUALS, m88459y3);
                                    iVar.m88470d();
                                } else {
                                    throw new SAXException("Invalid \"#id\" selector in <style> element");
                                }
                            }
                            if (jVar == null) {
                                break;
                            }
                            if (m88754e('[')) {
                                m88772w();
                                String m88459y4 = m88459y();
                                if (m88459y4 != null) {
                                    m88772w();
                                    if (m88754e('=')) {
                                        cVar = c.EQUALS;
                                    } else if (m88755f("~=")) {
                                        cVar = c.INCLUDES;
                                    } else if (m88755f("|=")) {
                                        cVar = c.DASHMATCH;
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null) {
                                        m88772w();
                                        str = m88457x();
                                        if (str != null) {
                                            m88772w();
                                        } else {
                                            throw new SAXException("Invalid attribute selector in <style> element");
                                        }
                                    } else {
                                        str = null;
                                    }
                                    if (m88754e(']')) {
                                        if (cVar == null) {
                                            cVar = c.EXISTS;
                                        }
                                        jVar.m88474a(m88459y4, cVar, str);
                                        iVar.m88468b();
                                    } else {
                                        throw new SAXException("Invalid attribute selector in <style> element");
                                    }
                                } else {
                                    throw new SAXException("Invalid attribute selector in <style> element");
                                }
                            } else if (m88754e(':')) {
                                int i12 = this.f84429b;
                                if (m88459y() != null) {
                                    if (m88754e('(')) {
                                        m88772w();
                                        if (m88459y() != null) {
                                            m88772w();
                                            if (!m88754e(')')) {
                                                this.f84429b = i12 - 1;
                                            }
                                        }
                                    }
                                    jVar.m88475b(this.f84428a.substring(i12, this.f84429b));
                                    iVar.m88468b();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            eVar = null;
            if (!m88754e('*')) {
            }
            while (true) {
                if (!m88756g()) {
                }
            }
        }

        /* renamed from: y */
        public String m88459y() {
            int m88456B = m88456B();
            int i11 = this.f84429b;
            if (m88456B == i11) {
                return null;
            }
            String substring = this.f84428a.substring(i11, m88456B);
            this.f84429b = m88456B;
            return substring;
        }

        /* renamed from: z */
        public String m88460z() {
            if (m88756g()) {
                return null;
            }
            int i11 = this.f84429b;
            int charAt = this.f84428a.charAt(i11);
            int i12 = i11;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !m88758i(charAt)) {
                if (!m88759j(charAt)) {
                    i12 = this.f84429b + 1;
                }
                charAt = m88750a();
            }
            if (this.f84429b > i11) {
                return this.f84428a.substring(i11, i12);
            }
            this.f84429b = i11;
            return null;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$e */
    /* loaded from: classes4.dex */
    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$f */
    /* loaded from: classes4.dex */
    public enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        tty,
        tv
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$g */
    /* loaded from: classes4.dex */
    public static class g {

        /* renamed from: a */
        public i f83977a;

        /* renamed from: b */
        public C16654c.e0 f83978b;

        public g(i iVar, C16654c.e0 e0Var) {
            this.f83977a = iVar;
            this.f83978b = e0Var;
        }

        public String toString() {
            return this.f83977a + " {}";
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$h */
    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a */
        private List f83979a = null;

        /* renamed from: a */
        public void m88463a(g gVar) {
            if (this.f83979a == null) {
                this.f83979a = new ArrayList();
            }
            for (int i11 = 0; i11 < this.f83979a.size(); i11++) {
                if (((g) this.f83979a.get(i11)).f83977a.f83981b > gVar.f83977a.f83981b) {
                    this.f83979a.add(i11, gVar);
                    return;
                }
            }
            this.f83979a.add(gVar);
        }

        /* renamed from: b */
        public void m88464b(h hVar) {
            if (hVar.f83979a == null) {
                return;
            }
            if (this.f83979a == null) {
                this.f83979a = new ArrayList(hVar.f83979a.size());
            }
            this.f83979a.addAll(hVar.f83979a);
        }

        /* renamed from: c */
        public List m88465c() {
            return this.f83979a;
        }

        /* renamed from: d */
        public boolean m88466d() {
            List list = this.f83979a;
            if (list != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        public String toString() {
            if (this.f83979a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f83979a.iterator();
            while (it.hasNext()) {
                sb2.append(((g) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$i */
    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a */
        public List f83980a = null;

        /* renamed from: b */
        public int f83981b = 0;

        /* renamed from: a */
        public void m88467a(j jVar) {
            if (this.f83980a == null) {
                this.f83980a = new ArrayList();
            }
            this.f83980a.add(jVar);
        }

        /* renamed from: b */
        public void m88468b() {
            this.f83981b += 100;
        }

        /* renamed from: c */
        public void m88469c() {
            this.f83981b++;
        }

        /* renamed from: d */
        public void m88470d() {
            this.f83981b += 10000;
        }

        /* renamed from: e */
        public j m88471e(int i11) {
            return (j) this.f83980a.get(i11);
        }

        /* renamed from: f */
        public boolean m88472f() {
            List list = this.f83980a;
            if (list != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public int m88473g() {
            List list = this.f83980a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f83980a.iterator();
            while (it.hasNext()) {
                sb2.append((j) it.next());
                sb2.append(' ');
            }
            sb2.append('(');
            sb2.append(this.f83981b);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.a$j */
    /* loaded from: classes4.dex */
    public static class j {

        /* renamed from: a */
        public e f83982a;

        /* renamed from: b */
        public String f83983b;

        /* renamed from: c */
        public List f83984c = null;

        /* renamed from: d */
        public List f83985d = null;

        public j(e eVar, String str) {
            this.f83982a = null;
            this.f83983b = null;
            this.f83982a = eVar == null ? e.DESCENDANT : eVar;
            this.f83983b = str;
        }

        /* renamed from: a */
        public void m88474a(String str, c cVar, String str2) {
            if (this.f83984c == null) {
                this.f83984c = new ArrayList();
            }
            this.f83984c.add(new b(str, cVar, str2));
        }

        /* renamed from: b */
        public void m88475b(String str) {
            if (this.f83985d == null) {
                this.f83985d = new ArrayList();
            }
            this.f83985d.add(str);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f83982a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f83983b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<b> list = this.f83984c;
            if (list != null) {
                for (b bVar : list) {
                    sb2.append('[');
                    sb2.append(bVar.f83954a);
                    int i11 = a.f83953a[bVar.f83955b.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                sb2.append("|=");
                                sb2.append(bVar.f83956c);
                            }
                        } else {
                            sb2.append("~=");
                            sb2.append(bVar.f83956c);
                        }
                    } else {
                        sb2.append('=');
                        sb2.append(bVar.f83956c);
                    }
                    sb2.append(']');
                }
            }
            List<String> list2 = this.f83985d;
            if (list2 != null) {
                for (String str2 : list2) {
                    sb2.append(':');
                    sb2.append(str2);
                }
            }
            return sb2.toString();
        }
    }

    public C16652a(f fVar) {
        this.f83951a = fVar;
    }

    /* renamed from: a */
    private static int m88438a(List list, int i11, C16654c.l0 l0Var) {
        if (i11 < 0) {
            return -1;
        }
        Object obj = list.get(i11);
        C16654c.j0 j0Var = l0Var.f84172b;
        if (obj != j0Var) {
            return -1;
        }
        Iterator it = j0Var.mo88498b().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (((C16654c.n0) it.next()) == l0Var) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m88439b(String str, f fVar) {
        d dVar = new d(str);
        dVar.m88772w();
        List m88444h = m88444h(dVar);
        if (dVar.m88756g()) {
            return m88440c(m88444h, fVar);
        }
        throw new SAXException("Invalid @media type list");
    }

    /* renamed from: c */
    private static boolean m88440c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m88441e(h hVar, d dVar) {
        String m88459y = dVar.m88459y();
        dVar.m88772w();
        if (m88459y != null) {
            if (!this.f83952b && m88459y.equals("media")) {
                List m88444h = m88444h(dVar);
                if (dVar.m88754e('{')) {
                    dVar.m88772w();
                    if (m88440c(m88444h, this.f83951a)) {
                        this.f83952b = true;
                        hVar.m88464b(m88446j(dVar));
                        this.f83952b = false;
                    } else {
                        m88446j(dVar);
                    }
                    if (!dVar.m88754e('}')) {
                        throw new SAXException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new SAXException("Invalid @media rule: missing rule set");
                }
            } else {
                m88453q("Ignoring @%s rule", m88459y);
                m88452p(dVar);
            }
            dVar.m88772w();
            return;
        }
        throw new SAXException("Invalid '@' rule in <style> element");
    }

    /* renamed from: f */
    public static List m88442f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.m88756g()) {
            String m88459y = dVar.m88459y();
            if (m88459y != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m88459y);
                dVar.m88772w();
            } else {
                throw new SAXException("Invalid value for \"class\" attribute: " + str);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private C16654c.e0 m88443g(d dVar) {
        C16654c.e0 e0Var = new C16654c.e0();
        do {
            String m88459y = dVar.m88459y();
            dVar.m88772w();
            if (!dVar.m88754e(':')) {
                break;
            }
            dVar.m88772w();
            String m88460z = dVar.m88460z();
            if (m88460z == null) {
                break;
            }
            dVar.m88772w();
            if (dVar.m88754e('!')) {
                dVar.m88772w();
                if (dVar.m88755f("important")) {
                    dVar.m88772w();
                } else {
                    throw new SAXException("Malformed rule set in <style> element: found unexpected '!'");
                }
            }
            dVar.m88754e(';');
            C16656e.m88651B0(e0Var, m88459y, m88460z);
            dVar.m88772w();
            if (dVar.m88754e('}')) {
                return e0Var;
            }
        } while (!dVar.m88756g());
        throw new SAXException("Malformed rule set in <style> element");
    }

    /* renamed from: h */
    private static List m88444h(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.m88756g()) {
            try {
                arrayList.add(f.valueOf(dVar.m88767r(',')));
                if (!dVar.m88771v()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private boolean m88445i(h hVar, d dVar) {
        List m88447k = m88447k(dVar);
        if (m88447k != null && !m88447k.isEmpty()) {
            if (dVar.m88754e('{')) {
                dVar.m88772w();
                C16654c.e0 m88443g = m88443g(dVar);
                dVar.m88772w();
                Iterator it = m88447k.iterator();
                while (it.hasNext()) {
                    hVar.m88463a(new g((i) it.next(), m88443g));
                }
                return true;
            }
            throw new SAXException("Malformed rule block in <style> element: missing '{'");
        }
        return false;
    }

    /* renamed from: j */
    private h m88446j(d dVar) {
        h hVar = new h();
        while (!dVar.m88756g()) {
            if (!dVar.m88755f("<!--") && !dVar.m88755f("-->")) {
                if (dVar.m88754e('@')) {
                    m88441e(hVar, dVar);
                } else if (!m88445i(hVar, dVar)) {
                    break;
                }
            }
        }
        return hVar;
    }

    /* renamed from: k */
    private List m88447k(d dVar) {
        if (dVar.m88756g()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i();
        while (!dVar.m88756g() && dVar.m88458A(iVar)) {
            if (dVar.m88771v()) {
                arrayList.add(iVar);
                iVar = new i();
            }
        }
        if (!iVar.m88472f()) {
            arrayList.add(iVar);
        }
        return arrayList;
    }

    /* renamed from: l */
    private static boolean m88448l(i iVar, int i11, List list, int i12, C16654c.l0 l0Var) {
        j m88471e = iVar.m88471e(i11);
        if (!m88451o(m88471e, list, i12, l0Var)) {
            return false;
        }
        e eVar = m88471e.f83982a;
        if (eVar == e.DESCENDANT) {
            if (i11 == 0) {
                return true;
            }
            while (i12 >= 0) {
                if (m88450n(iVar, i11 - 1, list, i12)) {
                    return true;
                }
                i12--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m88450n(iVar, i11 - 1, list, i12);
        }
        int m88438a = m88438a(list, i12, l0Var);
        if (m88438a <= 0) {
            return false;
        }
        return m88448l(iVar, i11 - 1, list, i12, (C16654c.l0) l0Var.f84172b.mo88498b().get(m88438a - 1));
    }

    /* renamed from: m */
    public static boolean m88449m(i iVar, C16654c.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.f84172b; obj != null; obj = ((C16654c.n0) obj).f84172b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        if (iVar.m88473g() == 1) {
            return m88451o(iVar.m88471e(0), arrayList, size, l0Var);
        }
        return m88448l(iVar, iVar.m88473g() - 1, arrayList, size, l0Var);
    }

    /* renamed from: n */
    private static boolean m88450n(i iVar, int i11, List list, int i12) {
        j m88471e = iVar.m88471e(i11);
        C16654c.l0 l0Var = (C16654c.l0) list.get(i12);
        if (!m88451o(m88471e, list, i12, l0Var)) {
            return false;
        }
        e eVar = m88471e.f83982a;
        if (eVar == e.DESCENDANT) {
            if (i11 == 0) {
                return true;
            }
            while (i12 > 0) {
                i12--;
                if (m88450n(iVar, i11 - 1, list, i12)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m88450n(iVar, i11 - 1, list, i12 - 1);
        }
        int m88438a = m88438a(list, i12, l0Var);
        if (m88438a <= 0) {
            return false;
        }
        return m88448l(iVar, i11 - 1, list, i12, (C16654c.l0) l0Var.f84172b.mo88498b().get(m88438a - 1));
    }

    /* renamed from: o */
    private static boolean m88451o(j jVar, List list, int i11, C16654c.l0 l0Var) {
        List list2;
        String str = jVar.f83983b;
        if (str != null) {
            if (str.equalsIgnoreCase(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                if (!(l0Var instanceof C16654c.m)) {
                    return false;
                }
            } else if (!jVar.f83983b.equals(l0Var.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        List<b> list3 = jVar.f83984c;
        if (list3 != null) {
            for (b bVar : list3) {
                if (Objects.equals(bVar.f83954a, "id")) {
                    if (!bVar.f83956c.equals(l0Var.f84161c)) {
                        return false;
                    }
                } else if (!Objects.equals(bVar.f83954a, "class") || (list2 = l0Var.f84165g) == null || !list2.contains(bVar.f83956c)) {
                    return false;
                }
            }
        }
        List list4 = jVar.f83985d;
        if (list4 != null) {
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                if (!((String) it.next()).equals("first-child") || m88438a(list, i11, l0Var) != 0) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: p */
    private void m88452p(d dVar) {
        int i11 = 0;
        while (!dVar.m88756g()) {
            int intValue = dVar.m88760k().intValue();
            if (intValue == 59 && i11 == 0) {
                return;
            }
            if (intValue == 123) {
                i11++;
            } else if (intValue == 125 && i11 > 0 && i11 - 1 == 0) {
                return;
            }
        }
    }

    /* renamed from: q */
    private static void m88453q(String str, Object... objArr) {
    }

    /* renamed from: d */
    public h m88454d(String str) {
        d dVar = new d(str);
        dVar.m88772w();
        return m88446j(dVar);
    }
}
