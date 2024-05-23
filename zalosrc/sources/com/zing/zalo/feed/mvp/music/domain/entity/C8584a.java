package com.zing.zalo.feed.mvp.music.domain.entity;

import com.zing.zalo.feed.mvp.music.domain.entity.Sentence;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import on0.AbstractC24342w;
import qm0.AbstractC25368s;

/* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.a */
/* loaded from: classes4.dex */
public final class C8584a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final BufferedReader f46334a;

    /* renamed from: b */
    private final List f46335b;

    /* renamed from: c */
    private final Pattern f46336c;

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final C8584a m45738a(C8584a c8584a) {
            c8584a.m45737g();
            c8584a.m45735b();
            return c8584a;
        }

        /* renamed from: b */
        public final C8584a m45739b(BufferedReader bufferedReader) {
            AbstractC19074t.m100208f(bufferedReader, "reader");
            return m45738a(new C8584a(bufferedReader));
        }

        /* renamed from: c */
        public final long m45740c(List list) {
            long m104530f;
            AbstractC19074t.m100208f(list, "ts");
            try {
                m104530f = AbstractC20104d.m104530f(((Integer.parseInt((String) list.get(0)) * 60) + Double.parseDouble((String) list.get(1))) * 1000);
                return m104530f;
            } catch (NumberFormatException unused) {
                throw new b((String) list.get(1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public C8584a(BufferedReader bufferedReader) {
        AbstractC19074t.m100208f(bufferedReader, "reader");
        this.f46334a = bufferedReader;
        this.f46335b = new ArrayList();
        Pattern compile = Pattern.compile("[0-9]+");
        AbstractC19074t.m100207e(compile, "compile(...)");
        this.f46336c = compile;
    }

    /* renamed from: a */
    private final int m45730a(String str) {
        int m127173b0;
        if (str.length() >= 3) {
            String substring = str.substring(0, 1);
            AbstractC19074t.m100207e(substring, "substring(...)");
            if (AbstractC19074t.m100204b("[", substring)) {
                m127173b0 = AbstractC24342w.m127173b0(str, "]", 0, false, 6, null);
                if (m127173b0 >= 2) {
                    return m127173b0;
                }
                throw new b(str);
            }
        }
        throw new b(str);
    }

    /* renamed from: c */
    private final List m45731c(String str) {
        List m127132B0;
        List m131505m;
        int m45730a = m45730a(str);
        String substring = str.substring(1, m45730a);
        AbstractC19074t.m100207e(substring, "substring(...)");
        m127132B0 = AbstractC24342w.m127132B0(substring, new String[]{":"}, false, 2, 2, null);
        if (m127132B0.size() >= 2) {
            if (m45732e((String) m127132B0.get(0))) {
                String valueOf = String.valueOf(Companion.m45740c(m127132B0));
                String substring2 = str.substring(m45730a + 1);
                AbstractC19074t.m100207e(substring2, "substring(...)");
                m131505m = AbstractC25368s.m131505m(valueOf, substring2);
                return m131505m;
            }
            return m127132B0;
        }
        throw new b(str);
    }

    /* renamed from: e */
    private final boolean m45732e(String str) {
        return this.f46336c.matcher(str).matches();
    }

    /* renamed from: f */
    private final void m45733f() {
        Collections.sort(this.f46335b, new Sentence.C8583b());
        int size = this.f46335b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Sentence) this.f46335b.get(i11)).m45725e(i11);
            if (i11 < size - 1) {
                ((Sentence) this.f46335b.get(i11)).m45726f(((Sentence) this.f46335b.get(i11 + 1)).m45722b() - 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[LOOP:1: B:13:0x0033->B:15:0x0039, LOOP_END] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m45734h(String str) {
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList(2);
        while (true) {
            try {
                List m45731c = m45731c(str);
                String str3 = (String) m45731c.get(0);
                str2 = (String) m45731c.get(1);
                try {
                    if (!m45732e(str3)) {
                        break;
                    }
                    arrayList.add(new Sentence(Long.parseLong(str3)));
                    str = str2;
                } catch (b unused) {
                    str = str2;
                    str2 = str;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    this.f46335b.addAll(arrayList);
                }
            } catch (b unused2) {
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            ((Sentence) it.next()).m45724d(str2);
        }
        this.f46335b.addAll(arrayList);
    }

    /* renamed from: b */
    public final void m45735b() {
        this.f46334a.close();
    }

    /* renamed from: d */
    public final List m45736d() {
        return this.f46335b;
    }

    /* renamed from: g */
    public final void m45737g() {
        int i11;
        boolean z11;
        String str = "";
        while (true) {
            String readLine = this.f46334a.readLine();
            if (readLine != null) {
                str = readLine;
            } else {
                readLine = null;
            }
            if (readLine != null) {
                int length = str.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                m45734h(str.subSequence(i12, length + 1).toString());
            } else {
                m45733f();
                return;
            }
        }
    }
}
