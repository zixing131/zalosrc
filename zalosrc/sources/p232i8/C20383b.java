package p232i8;

import java.io.File;
import p292k8.AbstractC21569b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i8.b */
/* loaded from: classes.dex */
public final class C20383b extends AbstractC20411p {

    /* renamed from: a */
    private final AbstractC21569b0 f100422a;

    /* renamed from: b */
    private final String f100423b;

    /* renamed from: c */
    private final File f100424c;

    public C20383b(AbstractC21569b0 abstractC21569b0, String str, File file) {
        if (abstractC21569b0 != null) {
            this.f100422a = abstractC21569b0;
            if (str != null) {
                this.f100423b = str;
                if (file != null) {
                    this.f100424c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // p232i8.AbstractC20411p
    /* renamed from: b */
    public AbstractC21569b0 mo106171b() {
        return this.f100422a;
    }

    @Override // p232i8.AbstractC20411p
    /* renamed from: c */
    public File mo106172c() {
        return this.f100424c;
    }

    @Override // p232i8.AbstractC20411p
    /* renamed from: d */
    public String mo106173d() {
        return this.f100423b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20411p)) {
            return false;
        }
        AbstractC20411p abstractC20411p = (AbstractC20411p) obj;
        if (this.f100422a.equals(abstractC20411p.mo106171b()) && this.f100423b.equals(abstractC20411p.mo106173d()) && this.f100424c.equals(abstractC20411p.mo106172c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f100422a.hashCode() ^ 1000003) * 1000003) ^ this.f100423b.hashCode()) * 1000003) ^ this.f100424c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f100422a + ", sessionId=" + this.f100423b + ", reportFile=" + this.f100424c + "}";
    }
}
