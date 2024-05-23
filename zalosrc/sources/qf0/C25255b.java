package qf0;

import fn0.AbstractC19074t;
import java.io.File;
import lf0.AbstractC22474d;
import lf0.C22472b;
import lf0.InterfaceC22471a;
import p245iv.C20837a;

/* renamed from: qf0.b */
/* loaded from: classes5.dex */
public final class C25255b implements InterfaceC22471a {

    /* renamed from: a */
    private final C22472b f121122a;

    /* renamed from: b */
    private final long f121123b;

    /* renamed from: c */
    private final String f121124c;

    /* renamed from: d */
    private final String f121125d;

    public C25255b(C22472b c22472b, long j11, String str) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(str, "maCachePathFromH5");
        this.f121122a = c22472b;
        this.f121123b = j11;
        this.f121124c = str;
        this.f121125d = C25255b.class.getSimpleName();
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        if (!this.f121122a.m116184d()) {
            C22472b.m116177v(this.f121122a, -301, null, 2, null);
            this.f121122a.m116198y(this.f121125d + ": " + C20837a.f102420a.m108934a(-301));
            return;
        }
        File file = new File(AbstractC22474d.m116215c(this.f121124c, this.f121122a.m116194s()));
        if (!file.exists()) {
            this.f121122a.m116196u(-302, "File does not exist");
            this.f121122a.m116198y(this.f121125d + ": file " + file.getAbsolutePath() + " does not exist");
            return;
        }
        if (!this.f121122a.m116183c(file)) {
            this.f121122a.m116196u(-300, "Exceed limit size: File size: " + file.length() + ". Remain space: " + (5242880 - this.f121123b));
            this.f121122a.m116198y(this.f121125d + ": Exceed limit size: error code = -300: size of(" + file.getAbsolutePath() + ") = " + file.length());
            return;
        }
        new C25254a(this.f121122a, file).mo116169d();
    }
}
