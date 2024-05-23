package p548ui;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import java.io.File;

/* renamed from: ui.c */
/* loaded from: classes3.dex */
public final class C27273c {

    /* renamed from: a */
    private final String f128306a;

    /* renamed from: b */
    private final File f128307b;

    /* renamed from: c */
    private final int f128308c;

    /* renamed from: d */
    private final int f128309d;

    /* renamed from: e */
    private final int f128310e;

    public C27273c(String str, File file, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(file, "fileOutput");
        this.f128306a = str;
        this.f128307b = file;
        this.f128308c = i11;
        this.f128309d = i12;
        this.f128310e = i13;
    }

    /* renamed from: a */
    public final int m139628a() {
        return this.f128309d;
    }

    /* renamed from: b */
    public final int m139629b() {
        return this.f128308c;
    }

    /* renamed from: c */
    public final File m139630c() {
        return this.f128307b;
    }

    /* renamed from: d */
    public final int m139631d() {
        return this.f128310e;
    }

    /* renamed from: e */
    public final String m139632e() {
        return this.f128306a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27273c)) {
            return false;
        }
        C27273c c27273c = (C27273c) obj;
        return AbstractC19074t.m100204b(this.f128306a, c27273c.f128306a) && AbstractC19074t.m100204b(this.f128307b, c27273c.f128307b) && this.f128308c == c27273c.f128308c && this.f128309d == c27273c.f128309d && this.f128310e == c27273c.f128310e;
    }

    public int hashCode() {
        return (((((((this.f128306a.hashCode() * 31) + this.f128307b.hashCode()) * 31) + this.f128308c) * 31) + this.f128309d) * 31) + this.f128310e;
    }

    public String toString() {
        return "DownloadBackupDBParams(url=" + this.f128306a + ", fileOutput=" + this.f128307b + ", entryPoint=" + this.f128308c + ", encryptType=" + this.f128309d + ", imeiStatus=" + this.f128310e + ")";
    }
}
