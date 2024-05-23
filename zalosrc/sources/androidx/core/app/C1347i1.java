package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.i1 */
/* loaded from: classes2.dex */
public final class C1347i1 {

    /* renamed from: a */
    private final String f5960a;

    /* renamed from: b */
    private final CharSequence f5961b;

    /* renamed from: c */
    private final CharSequence[] f5962c;

    /* renamed from: d */
    private final boolean f5963d;

    /* renamed from: e */
    private final int f5964e;

    /* renamed from: f */
    private final Bundle f5965f;

    /* renamed from: g */
    private final Set f5966g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.i1$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static void m6760a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m6761b(C1347i1 c1347i1) {
            Set m6753d;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c1347i1.m6758i()).setLabel(c1347i1.m6757h()).setChoices(c1347i1.m6754e()).setAllowFreeFormInput(c1347i1.m6752c()).addExtras(c1347i1.m6756g());
            if (Build.VERSION.SDK_INT >= 26 && (m6753d = c1347i1.m6753d()) != null) {
                Iterator it = m6753d.iterator();
                while (it.hasNext()) {
                    b.m6766d(addExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.m6768b(addExtras, c1347i1.m6755f());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        static Bundle m6762c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.i1$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static void m6763a(C1347i1 c1347i1, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C1347i1.m6749a(c1347i1), intent, map);
        }

        /* renamed from: b */
        static Set<String> m6764b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        /* renamed from: c */
        static Map<String, Uri> m6765c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        /* renamed from: d */
        static RemoteInput.Builder m6766d(RemoteInput.Builder builder, String str, boolean z11) {
            return builder.setAllowDataType(str, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.i1$c */
    /* loaded from: classes2.dex */
    public static class c {
        /* renamed from: a */
        static int m6767a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        /* renamed from: b */
        static RemoteInput.Builder m6768b(RemoteInput.Builder builder, int i11) {
            return builder.setEditChoicesBeforeSending(i11);
        }
    }

    /* renamed from: androidx.core.app.i1$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private final String f5967a;

        /* renamed from: d */
        private CharSequence f5970d;

        /* renamed from: e */
        private CharSequence[] f5971e;

        /* renamed from: b */
        private final Set f5968b = new HashSet();

        /* renamed from: c */
        private final Bundle f5969c = new Bundle();

        /* renamed from: f */
        private boolean f5972f = true;

        /* renamed from: g */
        private int f5973g = 0;

        public d(String str) {
            if (str != null) {
                this.f5967a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        /* renamed from: a */
        public C1347i1 m6769a() {
            return new C1347i1(this.f5967a, this.f5970d, this.f5971e, this.f5972f, this.f5973g, this.f5969c, this.f5968b);
        }

        /* renamed from: b */
        public d m6770b(CharSequence charSequence) {
            this.f5970d = charSequence;
            return this;
        }
    }

    C1347i1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z11, int i11, Bundle bundle, Set set) {
        this.f5960a = str;
        this.f5961b = charSequence;
        this.f5962c = charSequenceArr;
        this.f5963d = z11;
        this.f5964e = i11;
        this.f5965f = bundle;
        this.f5966g = set;
        if (m6755f() == 2 && !m6752c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    static RemoteInput m6749a(C1347i1 c1347i1) {
        return a.m6761b(c1347i1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RemoteInput[] m6750b(C1347i1[] c1347i1Arr) {
        if (c1347i1Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c1347i1Arr.length];
        for (int i11 = 0; i11 < c1347i1Arr.length; i11++) {
            remoteInputArr[i11] = m6749a(c1347i1Arr[i11]);
        }
        return remoteInputArr;
    }

    /* renamed from: j */
    public static Bundle m6751j(Intent intent) {
        return a.m6762c(intent);
    }

    /* renamed from: c */
    public boolean m6752c() {
        return this.f5963d;
    }

    /* renamed from: d */
    public Set m6753d() {
        return this.f5966g;
    }

    /* renamed from: e */
    public CharSequence[] m6754e() {
        return this.f5962c;
    }

    /* renamed from: f */
    public int m6755f() {
        return this.f5964e;
    }

    /* renamed from: g */
    public Bundle m6756g() {
        return this.f5965f;
    }

    /* renamed from: h */
    public CharSequence m6757h() {
        return this.f5961b;
    }

    /* renamed from: i */
    public String m6758i() {
        return this.f5960a;
    }

    /* renamed from: k */
    public boolean m6759k() {
        if (!m6752c() && ((m6754e() == null || m6754e().length == 0) && m6753d() != null && !m6753d().isEmpty())) {
            return true;
        }
        return false;
    }
}
