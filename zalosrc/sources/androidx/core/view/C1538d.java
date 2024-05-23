package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.AbstractC1487i;
import androidx.core.util.InterfaceC1488j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.core.view.d */
/* loaded from: classes2.dex */
public final class C1538d {

    /* renamed from: a */
    private final f f6482a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        C1538d mo7747a();

        /* renamed from: b */
        void mo7748b(Uri uri);

        /* renamed from: c */
        void mo7749c(ClipData clipData);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d */
    /* loaded from: classes2.dex */
    private static final class d implements c {

        /* renamed from: a */
        ClipData f6485a;

        /* renamed from: b */
        int f6486b;

        /* renamed from: c */
        int f6487c;

        /* renamed from: d */
        Uri f6488d;

        /* renamed from: e */
        Bundle f6489e;

        d(ClipData clipData, int i11) {
            this.f6485a = clipData;
            this.f6486b = i11;
        }

        @Override // androidx.core.view.C1538d.c
        /* renamed from: a */
        public C1538d mo7747a() {
            return new C1538d(new g(this));
        }

        @Override // androidx.core.view.C1538d.c
        /* renamed from: b */
        public void mo7748b(Uri uri) {
            this.f6488d = uri;
        }

        @Override // androidx.core.view.C1538d.c
        /* renamed from: c */
        public void mo7749c(ClipData clipData) {
            this.f6485a = clipData;
        }

        @Override // androidx.core.view.C1538d.c
        public void setExtras(Bundle bundle) {
            this.f6489e = bundle;
        }

        d(C1538d c1538d) {
            this.f6485a = c1538d.m7736c();
            this.f6486b = c1538d.m7740g();
            this.f6487c = c1538d.m7738e();
            this.f6488d = c1538d.m7739f();
            this.f6489e = c1538d.m7737d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d$e */
    /* loaded from: classes2.dex */
    public static final class e implements f {

        /* renamed from: a */
        private final ContentInfo f6490a;

        e(ContentInfo contentInfo) {
            this.f6490a = AbstractC1534c.m7710a(AbstractC1487i.m7492g(contentInfo));
        }

        @Override // androidx.core.view.C1538d.f
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f6490a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: h */
        public int mo7750h() {
            int source;
            source = this.f6490a.getSource();
            return source;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: i */
        public Uri mo7751i() {
            Uri linkUri;
            linkUri = this.f6490a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: j */
        public ContentInfo mo7752j() {
            return this.f6490a;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: k */
        public ClipData mo7753k() {
            ClipData clip;
            clip = this.f6490a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: l */
        public int mo7754l() {
            int flags;
            flags = this.f6490a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f6490a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d$f */
    /* loaded from: classes2.dex */
    public interface f {
        Bundle getExtras();

        /* renamed from: h */
        int mo7750h();

        /* renamed from: i */
        Uri mo7751i();

        /* renamed from: j */
        ContentInfo mo7752j();

        /* renamed from: k */
        ClipData mo7753k();

        /* renamed from: l */
        int mo7754l();
    }

    /* renamed from: androidx.core.view.d$g */
    /* loaded from: classes2.dex */
    private static final class g implements f {

        /* renamed from: a */
        private final ClipData f6491a;

        /* renamed from: b */
        private final int f6492b;

        /* renamed from: c */
        private final int f6493c;

        /* renamed from: d */
        private final Uri f6494d;

        /* renamed from: e */
        private final Bundle f6495e;

        g(d dVar) {
            this.f6491a = (ClipData) AbstractC1487i.m7492g(dVar.f6485a);
            this.f6492b = AbstractC1487i.m7488c(dVar.f6486b, 0, 5, "source");
            this.f6493c = AbstractC1487i.m7491f(dVar.f6487c, 1);
            this.f6494d = dVar.f6488d;
            this.f6495e = dVar.f6489e;
        }

        @Override // androidx.core.view.C1538d.f
        public Bundle getExtras() {
            return this.f6495e;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: h */
        public int mo7750h() {
            return this.f6492b;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: i */
        public Uri mo7751i() {
            return this.f6494d;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: j */
        public ContentInfo mo7752j() {
            return null;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: k */
        public ClipData mo7753k() {
            return this.f6491a;
        }

        @Override // androidx.core.view.C1538d.f
        /* renamed from: l */
        public int mo7754l() {
            return this.f6493c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f6491a.getDescription());
            sb2.append(", source=");
            sb2.append(C1538d.m7734j(this.f6492b));
            sb2.append(", flags=");
            sb2.append(C1538d.m7732b(this.f6493c));
            String str2 = "";
            if (this.f6494d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f6494d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f6495e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C1538d(f fVar) {
        this.f6482a = fVar;
    }

    /* renamed from: a */
    static ClipData m7731a(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) list.get(0));
        for (int i11 = 1; i11 < list.size(); i11++) {
            clipData.addItem((ClipData.Item) list.get(i11));
        }
        return clipData;
    }

    /* renamed from: b */
    static String m7732b(int i11) {
        if ((i11 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i11);
    }

    /* renamed from: h */
    static Pair m7733h(ClipData clipData, InterfaceC1488j interfaceC1488j) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
            ClipData.Item itemAt = clipData.getItemAt(i11);
            if (interfaceC1488j.mo7496a(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(m7731a(clipData.getDescription(), arrayList), m7731a(clipData.getDescription(), arrayList2));
    }

    /* renamed from: j */
    static String m7734j(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return String.valueOf(i11);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    /* renamed from: l */
    public static C1538d m7735l(ContentInfo contentInfo) {
        return new C1538d(new e(contentInfo));
    }

    /* renamed from: c */
    public ClipData m7736c() {
        return this.f6482a.mo7753k();
    }

    /* renamed from: d */
    public Bundle m7737d() {
        return this.f6482a.getExtras();
    }

    /* renamed from: e */
    public int m7738e() {
        return this.f6482a.mo7754l();
    }

    /* renamed from: f */
    public Uri m7739f() {
        return this.f6482a.mo7751i();
    }

    /* renamed from: g */
    public int m7740g() {
        return this.f6482a.mo7750h();
    }

    /* renamed from: i */
    public Pair m7741i(InterfaceC1488j interfaceC1488j) {
        C1538d c1538d;
        ClipData mo7753k = this.f6482a.mo7753k();
        C1538d c1538d2 = null;
        if (mo7753k.getItemCount() == 1) {
            boolean mo7496a = interfaceC1488j.mo7496a(mo7753k.getItemAt(0));
            if (mo7496a) {
                c1538d = this;
            } else {
                c1538d = null;
            }
            if (!mo7496a) {
                c1538d2 = this;
            }
            return Pair.create(c1538d, c1538d2);
        }
        Pair m7733h = m7733h(mo7753k, interfaceC1488j);
        if (m7733h.first == null) {
            return Pair.create(null, this);
        }
        if (m7733h.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new a(this).m7744b((ClipData) m7733h.first).m7743a(), new a(this).m7744b((ClipData) m7733h.second).m7743a());
    }

    /* renamed from: k */
    public ContentInfo m7742k() {
        ContentInfo mo7752j = this.f6482a.mo7752j();
        Objects.requireNonNull(mo7752j);
        return AbstractC1534c.m7710a(mo7752j);
    }

    public String toString() {
        return this.f6482a.toString();
    }

    /* renamed from: androidx.core.view.d$b */
    /* loaded from: classes2.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final ContentInfo.Builder f6484a;

        b(ClipData clipData, int i11) {
            this.f6484a = AbstractC1542e.m7757a(clipData, i11);
        }

        @Override // androidx.core.view.C1538d.c
        /* renamed from: a */
        public C1538d mo7747a() {
            ContentInfo build;
            build = this.f6484a.build();
            return new C1538d(new e(build));
        }

        @Override // androidx.core.view.C1538d.c
        /* renamed from: b */
        public void mo7748b(Uri uri) {
            this.f6484a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1538d.c
        /* renamed from: c */
        public void mo7749c(ClipData clipData) {
            this.f6484a.setClip(clipData);
        }

        @Override // androidx.core.view.C1538d.c
        public void setExtras(Bundle bundle) {
            this.f6484a.setExtras(bundle);
        }

        b(C1538d c1538d) {
            AbstractC1550g.m7768a();
            this.f6484a = AbstractC1546f.m7760a(c1538d.m7742k());
        }
    }

    /* renamed from: androidx.core.view.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final c f6483a;

        public a(C1538d c1538d) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f6483a = new b(c1538d);
            } else {
                this.f6483a = new d(c1538d);
            }
        }

        /* renamed from: a */
        public C1538d m7743a() {
            return this.f6483a.mo7747a();
        }

        /* renamed from: b */
        public a m7744b(ClipData clipData) {
            this.f6483a.mo7749c(clipData);
            return this;
        }

        /* renamed from: c */
        public a m7745c(Bundle bundle) {
            this.f6483a.setExtras(bundle);
            return this;
        }

        /* renamed from: d */
        public a m7746d(Uri uri) {
            this.f6483a.mo7748b(uri);
            return this;
        }

        public a(ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f6483a = new b(clipData, i11);
            } else {
                this.f6483a = new d(clipData, i11);
            }
        }
    }
}
