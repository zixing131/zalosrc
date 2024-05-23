package ce0;

import ag0.AbstractC0837p0;
import android.net.Uri;
import bg0.C2797c;
import com.zing.zalo.SensitiveData;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ce0.d */
/* loaded from: classes4.dex */
public class C3449d {
    public static final c Companion = new c(null);

    /* renamed from: c */
    private static final SensitiveData f14500c = new SensitiveData("gallery_save_photo_detail", "photo_download", null, 4, null);

    /* renamed from: d */
    private static final InterfaceC24854k f14501d;

    /* renamed from: a */
    private volatile boolean f14502a;

    /* renamed from: b */
    private a f14503b;

    /* renamed from: ce0.d$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo17354a(e eVar);
    }

    /* renamed from: ce0.d$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f14504q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    /* renamed from: ce0.d$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C2797c m17357c() {
            return (C2797c) C3449d.f14501d.getValue();
        }

        /* renamed from: b */
        public final SensitiveData m17358b() {
            return C3449d.f14500c;
        }
    }

    /* renamed from: ce0.d$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private final String f14505a;

        /* renamed from: b */
        private final String f14506b;

        /* renamed from: c */
        private final SensitiveData f14507c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            this(str, null, null, 6, null);
            AbstractC19074t.m100208f(str, "sourcePath");
        }

        /* renamed from: a */
        public final String m17359a() {
            return this.f14506b;
        }

        /* renamed from: b */
        public final SensitiveData m17360b() {
            return this.f14507c;
        }

        /* renamed from: c */
        public final String m17361c() {
            return this.f14505a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f14505a, dVar.f14505a) && AbstractC19074t.m100204b(this.f14506b, dVar.f14506b) && AbstractC19074t.m100204b(this.f14507c, dVar.f14507c);
        }

        public int hashCode() {
            int hashCode = this.f14505a.hashCode() * 31;
            String str = this.f14506b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f14507c.hashCode();
        }

        public String toString() {
            return "Params(sourcePath=" + this.f14505a + ", pathOut=" + this.f14506b + ", sensitiveData=" + this.f14507c + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            this(str, str2, null, 4, null);
            AbstractC19074t.m100208f(str, "sourcePath");
        }

        public d(String str, String str2, SensitiveData sensitiveData) {
            AbstractC19074t.m100208f(str, "sourcePath");
            AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
            this.f14505a = str;
            this.f14506b = str2;
            this.f14507c = sensitiveData;
        }

        public /* synthetic */ d(String str, String str2, SensitiveData sensitiveData, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? C3449d.Companion.m17358b() : sensitiveData);
        }
    }

    /* renamed from: ce0.d$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final Uri f14508a;

        /* renamed from: b */
        private final String f14509b;

        /* renamed from: c */
        private final int f14510c;

        /* renamed from: ce0.d$e$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m17364a(int i11) {
                return new e(null, null, i11);
            }
        }

        public e(Uri uri, String str, int i11) {
            this.f14508a = uri;
            this.f14509b = str;
            this.f14510c = i11;
        }

        /* renamed from: a */
        public final int m17362a() {
            return this.f14510c;
        }

        /* renamed from: b */
        public final String m17363b() {
            return this.f14509b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC19074t.m100204b(this.f14508a, eVar.f14508a) && AbstractC19074t.m100204b(this.f14509b, eVar.f14509b) && this.f14510c == eVar.f14510c;
        }

        public int hashCode() {
            Uri uri = this.f14508a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f14509b;
            return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f14510c;
        }

        public String toString() {
            return "Result(uri=" + this.f14508a + ", filePath=" + this.f14509b + ", errCode=" + this.f14510c + ")";
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f14504q);
        f14501d = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[Catch: Exception -> 0x0027, OutOfMemoryError -> 0x0029, TryCatch #2 {Exception -> 0x0027, OutOfMemoryError -> 0x0029, blocks: (B:7:0x0016, B:9:0x001c, B:15:0x002b, B:17:0x0039, B:20:0x0040, B:21:0x0049, B:23:0x0052, B:26:0x0059, B:27:0x007b, B:28:0x0064, B:30:0x006a, B:31:0x0074, B:32:0x0045), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: Exception -> 0x0027, OutOfMemoryError -> 0x0029, TryCatch #2 {Exception -> 0x0027, OutOfMemoryError -> 0x0029, blocks: (B:7:0x0016, B:9:0x001c, B:15:0x002b, B:17:0x0039, B:20:0x0040, B:21:0x0049, B:23:0x0052, B:26:0x0059, B:27:0x007b, B:28:0x0064, B:30:0x006a, B:31:0x0074, B:32:0x0045), top: B:6:0x0016 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17349h(final C3449d c3449d, d dVar) {
        String m17351j;
        String mo17344f;
        e m17364a;
        AbstractC19074t.m100208f(c3449d, "this$0");
        AbstractC19074t.m100208f(dVar, "$params");
        if (c3449d.f14502a) {
            return;
        }
        final C19059j0 c19059j0 = new C19059j0();
        try {
            if (!AbstractC23034c6.m118118E()) {
                c19059j0.f94941p = e.Companion.m17364a(-2);
            } else {
                String m17361c = dVar.m17361c();
                String m17359a = dVar.m17359a();
                SensitiveData m17360b = dVar.m17360b();
                if (m17359a != null && m17359a.length() != 0) {
                    m17351j = AbstractC23041d2.m118212k(m17359a);
                    AbstractC19074t.m100205c(m17351j);
                    mo17344f = c3449d.mo17344f(m17361c, m17351j, m17360b);
                    if (mo17344f != null && mo17344f.length() != 0) {
                        m17364a = new e(Uri.parse(mo17344f), mo17344f, 0);
                        c19059j0.f94941p = m17364a;
                    }
                    if (AbstractC23238v2.m119726k()) {
                        m17364a = e.Companion.m17364a(78002);
                    } else {
                        m17364a = e.Companion.m17364a(-1);
                    }
                    c19059j0.f94941p = m17364a;
                }
                m17351j = c3449d.m17351j();
                AbstractC19074t.m100205c(m17351j);
                mo17344f = c3449d.mo17344f(m17361c, m17351j, m17360b);
                if (mo17344f != null) {
                    m17364a = new e(Uri.parse(mo17344f), mo17344f, 0);
                    c19059j0.f94941p = m17364a;
                }
                if (AbstractC23238v2.m119726k()) {
                }
                c19059j0.f94941p = m17364a;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("SaveImageToGallery").mo104552e(e11);
        } catch (OutOfMemoryError e12) {
            AbstractC20110a.f98889a.m104564x("SaveImageToGallery").mo104552e(e12);
            c19059j0.f94941p = e.Companion.m17364a(78001);
        }
        final a aVar = c3449d.f14503b;
        if (aVar != null) {
            AbstractC19444a.m101697e(new Runnable() { // from class: ce0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3449d.m17350i(C3449d.this, aVar, c19059j0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m17350i(C3449d c3449d, a aVar, C19059j0 c19059j0) {
        AbstractC19074t.m100208f(c3449d, "this$0");
        AbstractC19074t.m100208f(aVar, "$it");
        AbstractC19074t.m100208f(c19059j0, "$result");
        try {
            if (c3449d.f14502a) {
                return;
            }
            e eVar = (e) c19059j0.f94941p;
            if (eVar == null) {
                eVar = e.Companion.m17364a(-1);
            }
            aVar.mo17354a(eVar);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("SaveImageToGallery").mo104552e(e11);
        }
    }

    /* renamed from: j */
    private final String m17351j() {
        return "IMG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".jpg";
    }

    /* renamed from: e */
    public final void m17352e() {
        this.f14502a = true;
        this.f14503b = null;
    }

    /* renamed from: f */
    protected String mo17344f(String str, String str2, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(str, "sourcePath");
        AbstractC19074t.m100208f(str2, "outFileName");
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        return AbstractC23280z4.m120304P(str, str2, true, false, false, sensitiveData);
    }

    /* renamed from: g */
    public final void m17353g(final d dVar, a aVar) {
        AbstractC19074t.m100208f(dVar, "params");
        this.f14503b = aVar;
        c cVar = Companion;
        cVar.m17357c().m13483f();
        cVar.m17357c().mo13474a(new Runnable() { // from class: ce0.b
            @Override // java.lang.Runnable
            public final void run() {
                C3449d.m17349h(C3449d.this, dVar);
            }
        });
    }
}
