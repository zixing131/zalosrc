package p231i7;

import java.io.File;

/* renamed from: i7.d */
/* loaded from: classes3.dex */
final class C20360d extends AbstractC20378v {

    /* renamed from: a */
    private final File f100374a;

    /* renamed from: b */
    private final String f100375b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20360d(File file, String str) {
        if (file != null) {
            this.f100374a = file;
            if (str != null) {
                this.f100375b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p231i7.AbstractC20378v
    /* renamed from: a */
    public final File mo106122a() {
        return this.f100374a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p231i7.AbstractC20378v
    /* renamed from: b */
    public final String mo106123b() {
        return this.f100375b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC20378v) {
            AbstractC20378v abstractC20378v = (AbstractC20378v) obj;
            if (this.f100374a.equals(abstractC20378v.mo106122a()) && this.f100375b.equals(abstractC20378v.mo106123b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f100374a.hashCode() ^ 1000003) * 1000003) ^ this.f100375b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f100374a.toString() + ", splitId=" + this.f100375b + "}";
    }
}
