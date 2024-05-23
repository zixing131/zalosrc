package p479rc;

import fn0.AbstractC19074t;
import on0.C24321d;
import sg0.AbstractC26246b;
import sg0.C26245a;

/* renamed from: rc.b */
/* loaded from: classes3.dex */
public final class C25725b {

    /* renamed from: a */
    private final int f122776a;

    /* renamed from: b */
    private final byte[] f122777b;

    /* renamed from: c */
    private final String f122778c;

    /* renamed from: d */
    private final String f122779d;

    public C25725b(int i11, byte[] bArr, String str) {
        String str2;
        AbstractC19074t.m100208f(bArr, "encryptKey");
        AbstractC19074t.m100208f(str, "encryptKeyHash");
        this.f122776a = i11;
        this.f122777b = bArr;
        this.f122778c = str;
        if (i11 != 1 && i11 != 0) {
            str2 = AbstractC26246b.m134963b(bArr);
        } else {
            str2 = new String(bArr, C24321d.f117408b);
        }
        this.f122779d = str2;
    }

    /* renamed from: a */
    public final String m132704a() {
        return this.f122779d;
    }

    /* renamed from: b */
    public final byte[] m132705b() {
        return this.f122777b;
    }

    /* renamed from: c */
    public final String m132706c() {
        return this.f122778c;
    }

    /* renamed from: d */
    public final int m132707d() {
        return this.f122776a;
    }

    /* renamed from: e */
    public final boolean m132708e() {
        boolean z11;
        if (this.f122777b.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(!z11) || this.f122778c.length() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "BackupKey(type=" + this.f122776a + ", encryptKeyHash='" + this.f122778c + "', backupKeyString='" + C26245a.f124654a.m134956q(this.f122779d) + "')";
    }
}
