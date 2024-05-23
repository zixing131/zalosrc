package pf0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import lf0.AbstractC22474d;
import lf0.C22472b;
import lf0.InterfaceC22471a;

/* renamed from: pf0.a */
/* loaded from: classes5.dex */
public final class C24745a implements InterfaceC22471a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C22472b f118820a;

    /* renamed from: b */
    private final String f118821b;

    /* renamed from: c */
    private final String f118822c;

    /* renamed from: pf0.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24745a(C22472b c22472b, String str) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(str, "maSchemeFilesPath");
        this.f118820a = c22472b;
        this.f118821b = str;
        this.f118822c = C24745a.class.getSimpleName();
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        if (!this.f118820a.m116187g(this.f118821b)) {
            this.f118820a.m116196u(-302, "Invalid MA files path or this path does not belong to this MA");
            this.f118820a.m116198y(this.f118822c + ": error code = -302: path from H5 = " + this.f118821b);
            return;
        }
        File file = new File(AbstractC22474d.m116216d(this.f118821b, this.f118820a.m116195t()));
        if (!file.exists()) {
            this.f118820a.m116196u(-302, "File does not exist");
            C22472b c22472b = this.f118820a;
            String str = this.f118822c;
            String str2 = this.f118821b;
            c22472b.m116198y(str + ": file path does not exist " + str2 + " -> " + AbstractC22474d.m116216d(str2, c22472b.m116195t()));
            return;
        }
        if (!file.delete()) {
            this.f118820a.m116196u(-1, "Delete file failed");
            this.f118820a.m116198y(this.f118822c + ": Delete file " + file.getAbsolutePath() + " failed");
            return;
        }
        C22472b.m116178x(this.f118820a, null, null, 3, null);
    }
}
